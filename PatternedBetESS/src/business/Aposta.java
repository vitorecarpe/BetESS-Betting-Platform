/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.io.Serializable;

/**
 *
 * @author vitorpeixoto
 */
public class Aposta implements Serializable{
    private int resultado; //resultado em que o apostador apostou (V/E/D)
    private int valor;
    private Evento evento;
    
    public Aposta(){
        this.resultado=0;
        this.valor=0;
        this.evento = new Evento();
    }
    
    public Aposta(int resultado, int valor, Evento evento){
        this.resultado = resultado;
        this.valor= valor;
        this.evento = evento;
    }
    
    public Aposta(Aposta a){
        this.resultado = a.getResultado();
        this.valor = a.getValor();
        this.evento = a.getEvento();
    }

    public int getResultado(){
        return this.resultado;
    }
    public int getValor(){
        return this.valor;
    }
    public Evento getEvento(){
        return this.evento;
    }
    
    public void setResultado(int resultado){
        this.resultado=resultado;
    }
    public void setValor(int valor){
        this.valor=valor;
    }
    public void setEvento(Evento evento){
        this.evento=evento;
    }
}
