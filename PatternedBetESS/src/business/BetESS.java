package business;

import persistence.Data;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author vitorpeixoto
 */
public class BetESS implements Serializable{
    Data data;
    
    public BetESS() {
        this.data = new Data();
    }
    public BetESS(HashMap<Integer,Apostador> a, HashMap<Integer,Evento> ev, HashMap<Integer,Equipa> eq) {
        this.data = new Data(a,ev,eq);
    }
    public BetESS(Data d) {
        this.data = d;
    }
    
    public Map<Integer, Evento> getEventos(){
        return data.getEventos();
    }
    
    public Map<Integer, Equipa> getEquipas(){
        return data.getEquipas();
    }
    
    public Map<Integer, Apostador> getApostadores(){
        return data.getApostadores();
    }
    
    public Apostador login(String email, String password){
        Apostador erro = new Apostador();
        List<Apostador> apostadores = new ArrayList<>(this.getApostadores().values());
        if(email.equals("admin") && password.equals("admin")) return null;
        else{
            for (Apostador a : apostadores) {
                if (a.getEmail().compareTo(email)==0){
                    if (a.verifyPassword(password)) return a;
                }   
            }
        }
        return erro;
    }
    
    public int registar(String nome, String email, String password, int coins, boolean aut){
        if(aut){
            boolean flag = true;
            for(Apostador a : this.getApostadores().values()){
                if(a.getEmail().equals(email) && flag){
                    flag = false;
                    System.out.println("Já existe!!!\n");
                    return 1;
                }
            }
            if(flag){
                int last_id = this.getApostadores().size()+1;
                Apostador novo = new Apostador(last_id, email, password, nome, coins);
                data.newApostador(novo);
                this.save();
            }
        }
        else{
            return 2;
        }
        return 0;
    }
    
    public void criarEvento(String equipaC, String equipaF, Double oddV, Double oddE, Double oddD){
        Equipa casa = new Equipa();
        Equipa fora = new Equipa();
        for(Equipa a : this.data.getEquipas().values()){
            if(a.getNome().equals(equipaC)) casa = a;
            else if(a.getNome().equals(equipaF)) fora = a;
        }
        if(equipaC.equals(equipaF)){
            ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("resources/icons/forbidden.png"));
            JOptionPane.showMessageDialog(null, "As equipas selecionadas são a mesma. Por favor escolha outra.", "Aviso", JOptionPane.INFORMATION_MESSAGE, icon);
        }
        else{
            int id = this.data.getEventos().size()+1;
            Evento evento = new Evento(id, oddV , oddE, oddD, true, 0, casa, fora, new HashMap<>()); 
            data.addEvento(evento);
            this.save();
            ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("resources/icons/check.png"));
            JOptionPane.showMessageDialog(null, "Evento criado e disponível.", "Sucesso", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }
    
    public void fecharEvento(String evento, String resultado){
        String[] equipas = evento.split(" X ");
        ArrayList<Evento> evAtiv = new ArrayList<>();
        for(Evento e : this.getEventos().values()){
            if(e.getEstado())
                evAtiv.add(e);
        }
        for(Evento e : evAtiv){
            if(e.getEquipaC().getNome().equals(equipas[0]) && e.getEquipaF().getNome().equals(equipas[1])){
                
                String[] venc = resultado.split("-");
                int res;
                if(Integer.parseInt(venc[0])>Integer.parseInt(venc[1])){ //equipa casa venceu
                    System.out.println("equipa casa venceu\n");
                    res = 1;
                }
                else if(Integer.parseInt(venc[1])>Integer.parseInt(venc[0])){ //equipa fora venceu
                    System.out.println("equipa fora venceu\n");
                    res = 3;
                }
                else{ //empate
                    System.out.println("empate\n");
                    res = 2;
                }
                
                    
                        this.data.endEvento(e,res);
            }
        }
        this.save();
    }
    
    public void adicionarEquipa(Equipa e){
        data.addEquipa(e);
    }
    
    public void removerEquipa(Equipa e){
        data.removeEquipa(e);
    }

    public void efetuarAposta(Evento evento, Apostador a, int res, int val, double odd){
        
            boolean apostou = a.getApostas().containsKey(evento.getID());
            if(apostou) {
                ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("resources/icons/forbidden.png"));
                JOptionPane.showMessageDialog(null, "Já registou uma aposta neste evento.", "Aviso", JOptionPane.INFORMATION_MESSAGE, icon);
            }
            else if(a.getESSCoins()-val >= 0){
                Aposta ap = new Aposta(evento.getID(), res, val, odd);
                data.addAposta(ap, a.getID());
                ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("resources/icons/check.png"));
                JOptionPane.showMessageDialog(null, "Aposta registada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE, icon);
                this.save();
                
            }
            else{
                ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("resources/icons/forbidden.png"));
                JOptionPane.showMessageDialog(null, "Não tem saldo suficiente para realizar a aposta.", "Aviso", JOptionPane.INFORMATION_MESSAGE, icon);
            }
    }
    
    public void cancelarAposta(Aposta a, int apostadorID){
        data.removeAposta(a,apostadorID);
    }
    
    public Apostador getApostador(int id){
        return data.getApostadores().get(id);
    }
    
    public void levantarCoins(Apostador a, double quantia){
        if (a.getESSCoins()-quantia < 5){
            ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("resources/icons/forbidden.png"));
            JOptionPane.showMessageDialog(null, "O seu saldo atual não lhe permite levantar essa quantia. Tem de manter um saldo mínimo de 5 ESScoins!", "Aviso", JOptionPane.INFORMATION_MESSAGE, icon);
        }
        else{
            this.getApostadores().get(a.getID()).levantarESSCoins(quantia);
            this.save();
            ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("resources/icons/check.png"));
            JOptionPane.showMessageDialog(null, "Quantia depositada na sua conta bancária!", "Sucesso", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }
    
    public void save() {
        this.data.save();
    }    
    
    public static BetESS load() throws IOException, ClassNotFoundException {
        Data d = Data.load();
        BetESS b = new BetESS(d);
        return b;
    }
}
