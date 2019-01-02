package presentation;

import business.Aposta;
import business.Apostador;
import business.BetESS;
import business.Evento;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Home extends javax.swing.JFrame {

    private BetESS betess;
    private Apostador apostador;
    private ArrayList<Evento> jogos = new ArrayList<>(); 
        
    public Home(BetESS b, Apostador a) {
        initComponents();
        this.betess = b;
        this.jogos  = betess.getEventosAtivos();
        this.apostador = a;
        setStyle();
        notificacoes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jogo16 = new javax.swing.JPanel();
        jogo1F7 = new javax.swing.JLabel();
        jogo1C7 = new javax.swing.JLabel();
        j1V7 = new javax.swing.JButton();
        j1E7 = new javax.swing.JButton();
        j1D7 = new javax.swing.JButton();
        jogo18 = new javax.swing.JPanel();
        jogo1F9 = new javax.swing.JLabel();
        jogo1C9 = new javax.swing.JLabel();
        j1V9 = new javax.swing.JButton();
        j1E9 = new javax.swing.JButton();
        j1D9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        perfilButton = new javax.swing.JButton();
        movimentosButton = new javax.swing.JButton();
        apostasButton = new javax.swing.JButton();
        jogo1 = new javax.swing.JPanel();
        jogo1F = new javax.swing.JLabel();
        jogo1C = new javax.swing.JLabel();
        j1V = new javax.swing.JToggleButton();
        j1E = new javax.swing.JToggleButton();
        j1D = new javax.swing.JToggleButton();
        j1Spin = new javax.swing.JSpinner();
        j1Bet = new javax.swing.JButton();
        jogo2 = new javax.swing.JPanel();
        jogo2F = new javax.swing.JLabel();
        jogo2C = new javax.swing.JLabel();
        j2V = new javax.swing.JToggleButton();
        j2E = new javax.swing.JToggleButton();
        j2D = new javax.swing.JToggleButton();
        j2Spin = new javax.swing.JSpinner();
        j2Bet = new javax.swing.JButton();
        jogo3 = new javax.swing.JPanel();
        jogo3F = new javax.swing.JLabel();
        jogo3C = new javax.swing.JLabel();
        j3V = new javax.swing.JToggleButton();
        j3E = new javax.swing.JToggleButton();
        j3D = new javax.swing.JToggleButton();
        j3Spin = new javax.swing.JSpinner();
        j3Bet = new javax.swing.JButton();
        jogo4 = new javax.swing.JPanel();
        jogo4F = new javax.swing.JLabel();
        jogo4C = new javax.swing.JLabel();
        j4V = new javax.swing.JToggleButton();
        j4E = new javax.swing.JToggleButton();
        j4D = new javax.swing.JToggleButton();
        j4Spin = new javax.swing.JSpinner();
        j4Bet = new javax.swing.JButton();
        jogo6 = new javax.swing.JPanel();
        jogo6F = new javax.swing.JLabel();
        jogo6C = new javax.swing.JLabel();
        j6V = new javax.swing.JToggleButton();
        j6E = new javax.swing.JToggleButton();
        j6D = new javax.swing.JToggleButton();
        j6Spin = new javax.swing.JSpinner();
        j6Bet = new javax.swing.JButton();
        jogo5 = new javax.swing.JPanel();
        jogo5F = new javax.swing.JLabel();
        jogo5C = new javax.swing.JLabel();
        j5V = new javax.swing.JToggleButton();
        j5E = new javax.swing.JToggleButton();
        j5D = new javax.swing.JToggleButton();
        j5Spin = new javax.swing.JSpinner();
        j5Bet = new javax.swing.JButton();
        jogo7 = new javax.swing.JPanel();
        jogo7F = new javax.swing.JLabel();
        jogo7C = new javax.swing.JLabel();
        j7V = new javax.swing.JToggleButton();
        j7E = new javax.swing.JToggleButton();
        j7D = new javax.swing.JToggleButton();
        j7Spin = new javax.swing.JSpinner();
        j7Bet = new javax.swing.JButton();
        jogo8 = new javax.swing.JPanel();
        jogo8F = new javax.swing.JLabel();
        jogo8C = new javax.swing.JLabel();
        j8V = new javax.swing.JToggleButton();
        j8E = new javax.swing.JToggleButton();
        j8D = new javax.swing.JToggleButton();
        j8Spin = new javax.swing.JSpinner();
        j8Bet = new javax.swing.JButton();
        jogo9 = new javax.swing.JPanel();
        jogo9F = new javax.swing.JLabel();
        jogo9C = new javax.swing.JLabel();
        j9V = new javax.swing.JToggleButton();
        j9E = new javax.swing.JToggleButton();
        j9D = new javax.swing.JToggleButton();
        j9Spin = new javax.swing.JSpinner();
        j9Bet = new javax.swing.JButton();

        jogo16.setBackground(new java.awt.Color(5, 5, 5));

        jogo1F7.setText("jLabel1");

        jogo1C7.setText("jLabel1");

        j1V7.setBackground(new java.awt.Color(255, 51, 0));
        j1V7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        j1V7.setText("jButton1");
        j1V7.setBorder(null);
        j1V7.setBorderPainted(false);
        j1V7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j1V7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        j1V7.setIconTextGap(0);
        j1V7.setMargin(new java.awt.Insets(0, 0, 0, 0));

        j1E7.setBackground(new java.awt.Color(255, 51, 0));
        j1E7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        j1E7.setText("jButton1");
        j1E7.setBorder(null);
        j1E7.setBorderPainted(false);
        j1E7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        j1D7.setBackground(new java.awt.Color(255, 51, 0));
        j1D7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        j1D7.setText("jButton1");
        j1D7.setBorder(null);
        j1D7.setBorderPainted(false);
        j1D7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jogo16Layout = new javax.swing.GroupLayout(jogo16);
        jogo16.setLayout(jogo16Layout);
        jogo16Layout.setHorizontalGroup(
            jogo16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jogo16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jogo1C7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j1V7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j1E7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j1D7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jogo1F7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jogo16Layout.setVerticalGroup(
            jogo16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jogo16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jogo16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jogo16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jogo1F7, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                        .addGroup(jogo16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jogo1C7, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jogo16Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jogo16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j1V7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j1E7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j1D7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jogo18.setBackground(new java.awt.Color(5, 5, 5));

        jogo1F9.setText("jLabel1");

        jogo1C9.setText("jLabel1");

        j1V9.setBackground(new java.awt.Color(255, 51, 0));
        j1V9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        j1V9.setText("jButton1");
        j1V9.setBorder(null);
        j1V9.setBorderPainted(false);
        j1V9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j1V9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        j1V9.setIconTextGap(0);
        j1V9.setMargin(new java.awt.Insets(0, 0, 0, 0));

        j1E9.setBackground(new java.awt.Color(255, 51, 0));
        j1E9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        j1E9.setText("jButton1");
        j1E9.setBorder(null);
        j1E9.setBorderPainted(false);
        j1E9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        j1D9.setBackground(new java.awt.Color(255, 51, 0));
        j1D9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        j1D9.setText("jButton1");
        j1D9.setBorder(null);
        j1D9.setBorderPainted(false);
        j1D9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jogo18Layout = new javax.swing.GroupLayout(jogo18);
        jogo18.setLayout(jogo18Layout);
        jogo18Layout.setHorizontalGroup(
            jogo18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jogo18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jogo1C9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j1V9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j1E9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j1D9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jogo1F9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jogo18Layout.setVerticalGroup(
            jogo18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jogo18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jogo18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jogo18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jogo1F9, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                        .addGroup(jogo18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jogo1C9, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jogo18Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jogo18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j1V9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j1E9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j1D9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        logo.setText("jLabel1");

        perfilButton.setBackground(new java.awt.Color(0, 0, 0));
        perfilButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        perfilButton.setForeground(new java.awt.Color(255, 102, 102));
        perfilButton.setText("Perfil");
        perfilButton.setBorderPainted(false);
        perfilButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        perfilButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        perfilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilButtonActionPerformed(evt);
            }
        });

        movimentosButton.setBackground(new java.awt.Color(0, 0, 0));
        movimentosButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        movimentosButton.setForeground(new java.awt.Color(204, 204, 204));
        movimentosButton.setText("Depositar/Levantar");
        movimentosButton.setBorderPainted(false);
        movimentosButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        movimentosButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        movimentosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movimentosButtonActionPerformed(evt);
            }
        });

        apostasButton.setBackground(new java.awt.Color(0, 0, 0));
        apostasButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        apostasButton.setForeground(new java.awt.Color(204, 204, 204));
        apostasButton.setText("Minhas apostas");
        apostasButton.setBorderPainted(false);
        apostasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        apostasButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        apostasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apostasButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apostasButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(movimentosButton)
                .addGap(69, 69, 69)
                .addComponent(perfilButton, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(perfilButton, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
            .addComponent(movimentosButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(apostasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jogo1.setBackground(new java.awt.Color(5, 5, 5));

        jogo1F.setText("jLabel1");

        jogo1C.setText("jLabel1");

        j1V.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j1V.setText("jToggleButton1");
        j1V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1VActionPerformed(evt);
            }
        });

        j1E.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j1E.setText("jToggleButton1");
        j1E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1EActionPerformed(evt);
            }
        });

        j1D.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j1D.setText("jToggleButton1");
        j1D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1DActionPerformed(evt);
            }
        });

        j1Spin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        j1Spin.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        j1Bet.setText("APOSTAR");
        j1Bet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1BetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jogo1Layout = new javax.swing.GroupLayout(jogo1);
        jogo1.setLayout(jogo1Layout);
        jogo1Layout.setHorizontalGroup(
            jogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jogo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jogo1C, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(j1V, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j1Spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jogo1Layout.createSequentialGroup()
                        .addComponent(j1E, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j1D, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(j1Bet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jogo1F, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jogo1Layout.setVerticalGroup(
            jogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jogo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jogo1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j1Spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j1Bet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j1V)
                            .addComponent(j1E)
                            .addComponent(j1D)))
                    .addComponent(jogo1F, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jogo1C, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jogo2.setBackground(new java.awt.Color(5, 5, 5));

        jogo2F.setText("jLabel1");

        jogo2C.setText("jLabel1");

        j2V.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j2V.setText("jToggleButton1");
        j2V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2VActionPerformed(evt);
            }
        });

        j2E.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j2E.setText("jToggleButton1");
        j2E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2EActionPerformed(evt);
            }
        });

        j2D.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j2D.setText("jToggleButton1");
        j2D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2DActionPerformed(evt);
            }
        });

        j2Spin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        j2Spin.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        j2Bet.setText("APOSTAR");
        j2Bet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2BetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jogo2Layout = new javax.swing.GroupLayout(jogo2);
        jogo2.setLayout(jogo2Layout);
        jogo2Layout.setHorizontalGroup(
            jogo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jogo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jogo2C, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jogo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(j2V, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j2Spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jogo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jogo2Layout.createSequentialGroup()
                        .addComponent(j2E, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j2D, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(j2Bet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jogo2F, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jogo2Layout.setVerticalGroup(
            jogo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jogo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jogo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jogo2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jogo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j2Spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j2Bet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jogo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j2V)
                            .addComponent(j2E)
                            .addComponent(j2D)))
                    .addComponent(jogo2F, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jogo2C, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jogo3.setBackground(new java.awt.Color(5, 5, 5));

        jogo3F.setText("jLabel1");

        jogo3C.setText("jLabel1");

        j3V.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j3V.setText("jToggleButton1");
        j3V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j3VActionPerformed(evt);
            }
        });

        j3E.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j3E.setText("jToggleButton1");
        j3E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j3EActionPerformed(evt);
            }
        });

        j3D.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j3D.setText("jToggleButton1");
        j3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j3DActionPerformed(evt);
            }
        });

        j3Spin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        j3Spin.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        j3Bet.setText("APOSTAR");
        j3Bet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j3BetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jogo3Layout = new javax.swing.GroupLayout(jogo3);
        jogo3.setLayout(jogo3Layout);
        jogo3Layout.setHorizontalGroup(
            jogo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jogo3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jogo3C, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jogo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(j3V, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j3Spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jogo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jogo3Layout.createSequentialGroup()
                        .addComponent(j3E, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j3D, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(j3Bet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jogo3F, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jogo3Layout.setVerticalGroup(
            jogo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jogo3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jogo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jogo3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jogo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j3Spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j3Bet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jogo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j3V)
                            .addComponent(j3E)
                            .addComponent(j3D)))
                    .addComponent(jogo3F, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jogo3C, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jogo4.setBackground(new java.awt.Color(5, 5, 5));

        jogo4F.setText("jLabel1");

        jogo4C.setText("jLabel1");

        j4V.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j4V.setText("jToggleButton1");
        j4V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j4VActionPerformed(evt);
            }
        });

        j4E.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j4E.setText("jToggleButton1");
        j4E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j4EActionPerformed(evt);
            }
        });

        j4D.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j4D.setText("jToggleButton1");
        j4D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j4DActionPerformed(evt);
            }
        });

        j4Spin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        j4Spin.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        j4Bet.setText("APOSTAR");
        j4Bet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j4BetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jogo4Layout = new javax.swing.GroupLayout(jogo4);
        jogo4.setLayout(jogo4Layout);
        jogo4Layout.setHorizontalGroup(
            jogo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jogo4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jogo4C, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jogo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(j4V, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j4Spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jogo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jogo4Layout.createSequentialGroup()
                        .addComponent(j4E, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j4D, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(j4Bet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jogo4F, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jogo4Layout.setVerticalGroup(
            jogo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jogo4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jogo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jogo4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jogo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j4Spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j4Bet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jogo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j4V)
                            .addComponent(j4E)
                            .addComponent(j4D)))
                    .addComponent(jogo4F, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jogo4C, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jogo6.setBackground(new java.awt.Color(5, 5, 5));

        jogo6F.setText("jLabel1");

        jogo6C.setText("jLabel1");

        j6V.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j6V.setText("jToggleButton1");
        j6V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j6VActionPerformed(evt);
            }
        });

        j6E.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j6E.setText("jToggleButton1");
        j6E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j6EActionPerformed(evt);
            }
        });

        j6D.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j6D.setText("jToggleButton1");
        j6D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j6DActionPerformed(evt);
            }
        });

        j6Spin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        j6Spin.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        j6Bet.setText("APOSTAR");
        j6Bet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j6BetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jogo6Layout = new javax.swing.GroupLayout(jogo6);
        jogo6.setLayout(jogo6Layout);
        jogo6Layout.setHorizontalGroup(
            jogo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jogo6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jogo6C, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jogo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(j6V, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j6Spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jogo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jogo6Layout.createSequentialGroup()
                        .addComponent(j6E, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j6D, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(j6Bet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jogo6F, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jogo6Layout.setVerticalGroup(
            jogo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jogo6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jogo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jogo6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jogo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j6Spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j6Bet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jogo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j6V)
                            .addComponent(j6E)
                            .addComponent(j6D)))
                    .addComponent(jogo6F, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jogo6C, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jogo5.setBackground(new java.awt.Color(5, 5, 5));

        jogo5F.setText("jLabel1");

        jogo5C.setText("jLabel1");

        j5V.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j5V.setText("jToggleButton1");
        j5V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j5VActionPerformed(evt);
            }
        });

        j5E.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j5E.setText("jToggleButton1");
        j5E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j5EActionPerformed(evt);
            }
        });

        j5D.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j5D.setText("jToggleButton1");
        j5D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j5DActionPerformed(evt);
            }
        });

        j5Spin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        j5Spin.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        j5Bet.setText("APOSTAR");
        j5Bet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j5BetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jogo5Layout = new javax.swing.GroupLayout(jogo5);
        jogo5.setLayout(jogo5Layout);
        jogo5Layout.setHorizontalGroup(
            jogo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jogo5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jogo5C, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jogo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(j5V, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j5Spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jogo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jogo5Layout.createSequentialGroup()
                        .addComponent(j5E, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j5D, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(j5Bet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jogo5F, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jogo5Layout.setVerticalGroup(
            jogo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jogo5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jogo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jogo5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jogo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j5Spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j5Bet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jogo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j5V)
                            .addComponent(j5E)
                            .addComponent(j5D)))
                    .addComponent(jogo5F, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jogo5C, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jogo7.setBackground(new java.awt.Color(5, 5, 5));

        jogo7F.setText("jLabel1");

        jogo7C.setText("jLabel1");

        j7V.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j7V.setText("jToggleButton1");
        j7V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j7VActionPerformed(evt);
            }
        });

        j7E.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j7E.setText("jToggleButton1");
        j7E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j7EActionPerformed(evt);
            }
        });

        j7D.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j7D.setText("jToggleButton1");
        j7D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j7DActionPerformed(evt);
            }
        });

        j7Spin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        j7Spin.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        j7Bet.setText("APOSTAR");
        j7Bet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j7BetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jogo7Layout = new javax.swing.GroupLayout(jogo7);
        jogo7.setLayout(jogo7Layout);
        jogo7Layout.setHorizontalGroup(
            jogo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jogo7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jogo7C, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jogo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(j7V, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j7Spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jogo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jogo7Layout.createSequentialGroup()
                        .addComponent(j7E, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j7D, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(j7Bet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jogo7F, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jogo7Layout.setVerticalGroup(
            jogo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jogo7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jogo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jogo7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jogo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j7Spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j7Bet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jogo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j7V)
                            .addComponent(j7E)
                            .addComponent(j7D)))
                    .addComponent(jogo7F, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jogo7C, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jogo8.setBackground(new java.awt.Color(5, 5, 5));

        jogo8F.setText("jLabel1");

        jogo8C.setText("jLabel1");

        j8V.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j8V.setText("jToggleButton1");
        j8V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j8VActionPerformed(evt);
            }
        });

        j8E.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j8E.setText("jToggleButton1");
        j8E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j8EActionPerformed(evt);
            }
        });

        j8D.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j8D.setText("jToggleButton1");
        j8D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j8DActionPerformed(evt);
            }
        });

        j8Spin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        j8Spin.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        j8Bet.setText("APOSTAR");
        j8Bet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j8BetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jogo8Layout = new javax.swing.GroupLayout(jogo8);
        jogo8.setLayout(jogo8Layout);
        jogo8Layout.setHorizontalGroup(
            jogo8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jogo8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jogo8C, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jogo8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(j8V, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j8Spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jogo8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jogo8Layout.createSequentialGroup()
                        .addComponent(j8E, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j8D, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(j8Bet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jogo8F, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jogo8Layout.setVerticalGroup(
            jogo8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jogo8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jogo8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jogo8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jogo8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j8Spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j8Bet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jogo8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j8V)
                            .addComponent(j8E)
                            .addComponent(j8D)))
                    .addComponent(jogo8F, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jogo8C, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jogo9.setBackground(new java.awt.Color(5, 5, 5));

        jogo9F.setText("jLabel1");

        jogo9C.setText("jLabel1");

        j9V.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j9V.setText("jToggleButton1");
        j9V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j9VActionPerformed(evt);
            }
        });

        j9E.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j9E.setText("jToggleButton1");
        j9E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j9EActionPerformed(evt);
            }
        });

        j9D.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        j9D.setText("jToggleButton1");
        j9D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j9DActionPerformed(evt);
            }
        });

        j9Spin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        j9Spin.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        j9Bet.setText("APOSTAR");
        j9Bet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j9BetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jogo9Layout = new javax.swing.GroupLayout(jogo9);
        jogo9.setLayout(jogo9Layout);
        jogo9Layout.setHorizontalGroup(
            jogo9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jogo9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jogo9C, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jogo9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(j9V, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j9Spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jogo9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jogo9Layout.createSequentialGroup()
                        .addComponent(j9E, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j9D, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(j9Bet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jogo9F, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jogo9Layout.setVerticalGroup(
            jogo9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jogo9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jogo9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jogo9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jogo9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j9Spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j9Bet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jogo9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j9V)
                            .addComponent(j9E)
                            .addComponent(j9D)))
                    .addComponent(jogo9F, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jogo9C, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jogo9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jogo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jogo8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jogo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jogo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jogo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jogo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jogo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jogo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jogo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jogo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jogo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jogo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jogo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jogo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jogo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jogo8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jogo9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void notificacoes(){
        apostador.notificate();
        try {
            this.betess.getData().save(betess.getData());
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void j1VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1VActionPerformed
        if (j1V.isSelected()){
            j1E.setSelected(false);
            j1D.setSelected(false);
        }
    }//GEN-LAST:event_j1VActionPerformed

    private void j1EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1EActionPerformed
        if (j1E.isSelected()){
            j1V.setSelected(false);
            j1D.setSelected(false);
        }
    }//GEN-LAST:event_j1EActionPerformed

    private void j1DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1DActionPerformed
        if (j1D.isSelected()){
            j1E.setSelected(false);
            j1V.setSelected(false);
        }
    }//GEN-LAST:event_j1DActionPerformed

    private void j2VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2VActionPerformed
        if (j2V.isSelected()){
            j2E.setSelected(false);
            j2D.setSelected(false);
        }
    }//GEN-LAST:event_j2VActionPerformed

    private void j2EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2EActionPerformed
        if (j2E.isSelected()){
            j2V.setSelected(false);
            j2D.setSelected(false);
        }
    }//GEN-LAST:event_j2EActionPerformed

    private void j2DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2DActionPerformed
        if (j2D.isSelected()){
            j2V.setSelected(false);
            j2E.setSelected(false);
        }
    }//GEN-LAST:event_j2DActionPerformed

    private void j3VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j3VActionPerformed
        if (j3V.isSelected()){
            j3E.setSelected(false);
            j3D.setSelected(false);
        }
    }//GEN-LAST:event_j3VActionPerformed

    private void j3EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j3EActionPerformed
        if (j3E.isSelected()){
            j3V.setSelected(false);
            j3D.setSelected(false);
        }
    }//GEN-LAST:event_j3EActionPerformed

    private void j3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j3DActionPerformed
        if (j3D.isSelected()){
            j3E.setSelected(false);
            j3V.setSelected(false);
        }
    }//GEN-LAST:event_j3DActionPerformed

    private void j4VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j4VActionPerformed
        if (j4V.isSelected()){
            j4E.setSelected(false);
            j4D.setSelected(false);
        }
    }//GEN-LAST:event_j4VActionPerformed

    private void j4EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j4EActionPerformed
        if (j4E.isSelected()){
            j4V.setSelected(false);
            j4D.setSelected(false);
        }
    }//GEN-LAST:event_j4EActionPerformed

    private void j4DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j4DActionPerformed
        if (j4D.isSelected()){
            j4E.setSelected(false);
            j4V.setSelected(false);
        }
    }//GEN-LAST:event_j4DActionPerformed

    private void j6VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j6VActionPerformed
        if (j6V.isSelected()){
            j6E.setSelected(false);
            j6D.setSelected(false);
        }
    }//GEN-LAST:event_j6VActionPerformed

    private void j6EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j6EActionPerformed
        if (j6E.isSelected()){
            j6V.setSelected(false);
            j6D.setSelected(false);
        }
    }//GEN-LAST:event_j6EActionPerformed

    private void j6DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j6DActionPerformed
        if (j6D.isSelected()){
            j6V.setSelected(false);
            j6E.setSelected(false);
        }
    }//GEN-LAST:event_j6DActionPerformed

    private void j5VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j5VActionPerformed
        if (j5V.isSelected()){
            j5E.setSelected(false);
            j5D.setSelected(false);
        }
    }//GEN-LAST:event_j5VActionPerformed

    private void j5EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j5EActionPerformed
        if (j5E.isSelected()){
            j5V.setSelected(false);
            j5D.setSelected(false);
        }
    }//GEN-LAST:event_j5EActionPerformed

    private void j5DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j5DActionPerformed
        if (j5D.isSelected()){
            j5V.setSelected(false);
            j5E.setSelected(false);
        }
    }//GEN-LAST:event_j5DActionPerformed

    private void j7VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j7VActionPerformed
        if (j7V.isSelected()){
            j7E.setSelected(false);
            j7D.setSelected(false);
        }
    }//GEN-LAST:event_j7VActionPerformed

    private void j7EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j7EActionPerformed
        if (j7E.isSelected()){
            j7V.setSelected(false);
            j7D.setSelected(false);
        }
    }//GEN-LAST:event_j7EActionPerformed

    private void j7DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j7DActionPerformed
        if (j7D.isSelected()){
            j7V.setSelected(false);
            j7E.setSelected(false);
        }
    }//GEN-LAST:event_j7DActionPerformed

    private void j8VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j8VActionPerformed
        if (j8V.isSelected()){
            j8E.setSelected(false);
            j8D.setSelected(false);
        }
    }//GEN-LAST:event_j8VActionPerformed

    private void j8EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j8EActionPerformed
        if (j8E.isSelected()){
            j8V.setSelected(false);
            j8D.setSelected(false);
        }
    }//GEN-LAST:event_j8EActionPerformed

    private void j8DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j8DActionPerformed
        if (j8D.isSelected()){
            j8V.setSelected(false);
            j8E.setSelected(false);
        }
    }//GEN-LAST:event_j8DActionPerformed

    private void j9VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j9VActionPerformed
        if (j9V.isSelected()){
            j9E.setSelected(false);
            j9D.setSelected(false);
        }
    }//GEN-LAST:event_j9VActionPerformed

    private void j9EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j9EActionPerformed
        if (j9E.isSelected()){
            j9V.setSelected(false);
            j9D.setSelected(false);
        }
    }//GEN-LAST:event_j9EActionPerformed

    private void j9DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j9DActionPerformed
        if (j9D.isSelected()){
            j9V.setSelected(false);
            j9E.setSelected(false);
        }
    }//GEN-LAST:event_j9DActionPerformed

    private void j1BetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1BetActionPerformed
        int res = 0;
        double odd = 0.0d;
        Evento e = jogos.get(0);
        int val = (Integer) j1Spin.getValue();
        if(j1V.isSelected()) { res=1; odd=e.getOddV(); }
        else if (j1E.isSelected()) { res=2; odd=e.getOddE(); }
        else if (j1D.isSelected()) { res=3; odd=e.getOddD(); }
        else {
            this.betess.notification(2, "Selecione um resultado!", "Aviso");
        }
        boolean ret=false;
        if(res!=0) ret = this.betess.efetuarAposta(e, apostador, res, val, odd);
        if(ret) this.saveNrefresh();
    }//GEN-LAST:event_j1BetActionPerformed

    private void j3BetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j3BetActionPerformed
        int res = 0;
        double odd = 0.0d;
        Evento e = jogos.get(2);
        int val = (Integer) j3Spin.getValue();
        if(j3V.isSelected()) { res=1; odd=e.getOddV(); }
        else if (j3E.isSelected()) { res=2; odd=e.getOddE(); }
        else if (j3D.isSelected()) { res=3; odd=e.getOddD(); }
        else {
            this.betess.notification(2, "Selecione um resultado!", "Aviso");
        }
        boolean ret=false;
        if(res!=0) ret=this.betess.efetuarAposta(e, apostador, res, val, odd);
        if(ret) this.saveNrefresh();
    }//GEN-LAST:event_j3BetActionPerformed

    private void j2BetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2BetActionPerformed
        int res = 0;
        double odd = 0.0d;
        Evento e = jogos.get(1);
        int val = (Integer) j2Spin.getValue();
        if(j2V.isSelected()) { res=1; odd=e.getOddV(); }
        else if (j2E.isSelected()) { res=2; odd=e.getOddE(); }
        else if (j2D.isSelected()) { res=3; odd=e.getOddD(); }
        else {
            this.betess.notification(2, "Selecione um resultado!", "Aviso");
        }
        boolean ret=false;
        if(res!=0) ret=this.betess.efetuarAposta(e, apostador, res, val, odd);
        if(ret) this.saveNrefresh();
    }//GEN-LAST:event_j2BetActionPerformed

    private void j4BetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j4BetActionPerformed
        int res = 0;
        double odd = 0.0d;
        Evento e = jogos.get(3);
        int val = (Integer) j4Spin.getValue();
        if(j4V.isSelected()) { res=1; odd=e.getOddV(); }
        else if (j4E.isSelected()) { res=2; odd=e.getOddE(); }
        else if (j4D.isSelected()) { res=3; odd=e.getOddD(); }
        else {
            this.betess.notification(2, "Selecione um resultado!", "Aviso");
        }
        boolean ret=false;
        if(res!=0) ret=this.betess.efetuarAposta(e, apostador, res, val, odd);
        if(ret) this.saveNrefresh();
    }//GEN-LAST:event_j4BetActionPerformed

    private void j5BetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j5BetActionPerformed
        int res = 0;
        double odd = 0.0d;
        Evento e = jogos.get(4);
        int val = (Integer) j5Spin.getValue();
        if(j5V.isSelected()) { res=1; odd=e.getOddV(); }
        else if (j5E.isSelected()) { res=2; odd=e.getOddE(); }
        else if (j5D.isSelected()) { res=3; odd=e.getOddD(); }
        else {
            this.betess.notification(2, "Selecione um resultado!", "Aviso");
        }
        boolean ret=false;
        if(res!=0) ret=this.betess.efetuarAposta(e, apostador, res, val, odd);
        if(ret) this.saveNrefresh();
    }//GEN-LAST:event_j5BetActionPerformed

    private void j6BetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j6BetActionPerformed
        int res = 0;
        double odd = 0.0d;
        Evento e = jogos.get(5);
        int val = (Integer) j6Spin.getValue();
        if(j6V.isSelected()) { res=1; odd=e.getOddV(); }
        else if (j6E.isSelected()) { res=2; odd=e.getOddE(); }
        else if (j6D.isSelected()) { res=3; odd=e.getOddD(); }
        else {
            this.betess.notification(2, "Selecione um resultado!", "Aviso");
        }
        boolean ret=false;
        if(res!=0) ret=this.betess.efetuarAposta(e, apostador, res, val, odd);
        if(ret) this.saveNrefresh();
    }//GEN-LAST:event_j6BetActionPerformed

    private void j7BetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j7BetActionPerformed
        int res = 0;
        double odd = 0.0d;
        Evento e = jogos.get(6);
        int val = (Integer) j7Spin.getValue();
        if(j7V.isSelected()) { res=1; odd=e.getOddV(); }
        else if (j7E.isSelected()) { res=2; odd=e.getOddE(); }
        else if (j7D.isSelected()) { res=3; odd=e.getOddD(); }
        else {
            this.betess.notification(2, "Selecione um resultado!", "Aviso");
        }
        boolean ret=false;
        if(res!=0) ret=this.betess.efetuarAposta(e, apostador, res, val, odd);
        if(ret) this.saveNrefresh();
    }//GEN-LAST:event_j7BetActionPerformed

    private void j8BetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j8BetActionPerformed
        int res = 0;
        double odd = 0.0d;
        Evento e = jogos.get(7);
        int val = (Integer) j8Spin.getValue();
        if(j8V.isSelected()) { res=1; odd=e.getOddV(); }
        else if (j8E.isSelected()) { res=2; odd=e.getOddE(); }
        else if (j8D.isSelected()) { res=3; odd=e.getOddD(); }
        else {
            this.betess.notification(2, "Selecione um resultado!", "Aviso");
        }
        boolean ret=false;
        if(res!=0) ret=this.betess.efetuarAposta(e, apostador, res, val, odd);
        if(ret) this.saveNrefresh();
    }//GEN-LAST:event_j8BetActionPerformed

    private void j9BetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j9BetActionPerformed
        int res = 0;
        double odd = 0.0d;
        Evento e = jogos.get(8);
        int val = (Integer) j9Spin.getValue();
        if(j9V.isSelected()) { res=1; odd=e.getOddV(); }
        else if (j9E.isSelected()) { res=2; odd=e.getOddE(); }
        else if (j9D.isSelected()) { res=3; odd=e.getOddD(); }
        else {
            this.betess.notification(2, "Selecione um resultado!", "Aviso");
        }
        boolean ret=false;
        if(res!=0) ret=this.betess.efetuarAposta(e, apostador, res, val, odd);
        if(ret) this.saveNrefresh();
    }//GEN-LAST:event_j9BetActionPerformed

    private void movimentosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movimentosButtonActionPerformed
        DepositarLevantar dl = new DepositarLevantar(this.betess, apostador);
        dl.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_movimentosButtonActionPerformed

    private void apostasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apostasButtonActionPerformed
        MinhasApostas ma = new MinhasApostas(this.betess, apostador);
        ma.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_apostasButtonActionPerformed

    private void perfilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilButtonActionPerformed
        Login login = new Login(this.betess);
        login.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_perfilButtonActionPerformed
    
    private void saveNrefresh(){
        Home home = new Home(this.betess, apostador);
        home.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }
    private void fillJogo0(){
            jogo1.setVisible(false);
            jogo2.setVisible(false);
            jogo3.setVisible(false);
            jogo4.setVisible(false);
            jogo5.setVisible(false);
            jogo6.setVisible(false);
            jogo7.setVisible(false);
            jogo8.setVisible(false);
            jogo9.setVisible(false);
    }
    private void fillJogo1(){
        ImageIcon j1C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(0).getEquipaC().getSimbolo()));
        ImageIcon j1F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(0).getEquipaF().getSimbolo()));
        jogo1C.setIcon(j1C);
        jogo1F.setIcon(j1F);
        j1V.setText(Double.toString(jogos.get(0).getOddV()));
        j1E.setText(Double.toString(jogos.get(0).getOddE()));
        j1D.setText(Double.toString(jogos.get(0).getOddD()));
        jogo2.setVisible(false);
        jogo3.setVisible(false);
        jogo4.setVisible(false);
        jogo5.setVisible(false);
        jogo6.setVisible(false);
        jogo7.setVisible(false);
        jogo8.setVisible(false);
        jogo9.setVisible(false);
    }
    private void fillJogo2(){
            ImageIcon j1C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(0).getEquipaC().getSimbolo()));
            ImageIcon j1F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(0).getEquipaF().getSimbolo()));
            ImageIcon j2C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(1).getEquipaC().getSimbolo()));
            ImageIcon j2F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(1).getEquipaF().getSimbolo()));
            jogo1C.setIcon(j1C);
            jogo1F.setIcon(j1F);
            jogo2C.setIcon(j2C);
            jogo2F.setIcon(j2F);
            j1V.setText(Double.toString(jogos.get(0).getOddV()));
            j1E.setText(Double.toString(jogos.get(0).getOddE()));
            j1D.setText(Double.toString(jogos.get(0).getOddD()));
            j2V.setText(Double.toString(jogos.get(1).getOddV()));
            j2E.setText(Double.toString(jogos.get(1).getOddE()));
            j2D.setText(Double.toString(jogos.get(1).getOddD()));
            jogo3.setVisible(false);
            jogo4.setVisible(false);
            jogo5.setVisible(false);
            jogo6.setVisible(false);
            jogo7.setVisible(false);
            jogo8.setVisible(false);
            jogo9.setVisible(false);
    }
    private void fillJogo3(){
        ImageIcon j1C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(0).getEquipaC().getSimbolo()));
            ImageIcon j1F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(0).getEquipaF().getSimbolo()));
            ImageIcon j2C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(1).getEquipaC().getSimbolo()));
            ImageIcon j2F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(1).getEquipaF().getSimbolo()));
            ImageIcon j3C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(2).getEquipaC().getSimbolo()));
            ImageIcon j3F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(2).getEquipaF().getSimbolo()));
            jogo1C.setIcon(j1C);
            jogo1F.setIcon(j1F);
            jogo2C.setIcon(j2C);
            jogo2F.setIcon(j2F);
            jogo3C.setIcon(j3C);
            jogo3F.setIcon(j3F);
            j1V.setText(Double.toString(jogos.get(0).getOddV()));
            j1E.setText(Double.toString(jogos.get(0).getOddE()));
            j1D.setText(Double.toString(jogos.get(0).getOddD()));
            j2V.setText(Double.toString(jogos.get(1).getOddV()));
            j2E.setText(Double.toString(jogos.get(1).getOddE()));
            j2D.setText(Double.toString(jogos.get(1).getOddD()));
            j3V.setText(Double.toString(jogos.get(2).getOddV()));
            j3E.setText(Double.toString(jogos.get(2).getOddE()));
            j3D.setText(Double.toString(jogos.get(2).getOddD()));
            jogo4.setVisible(false);
            jogo5.setVisible(false);
            jogo6.setVisible(false);
            jogo7.setVisible(false);
            jogo8.setVisible(false);
            jogo9.setVisible(false);
    }
    private void fillJogo4(){
        ImageIcon j1C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(0).getEquipaC().getSimbolo()));
            ImageIcon j1F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(0).getEquipaF().getSimbolo()));
            ImageIcon j2C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(1).getEquipaC().getSimbolo()));
            ImageIcon j2F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(1).getEquipaF().getSimbolo()));
            ImageIcon j3C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(2).getEquipaC().getSimbolo()));
            ImageIcon j3F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(2).getEquipaF().getSimbolo()));
            ImageIcon j4C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(3).getEquipaC().getSimbolo()));
            ImageIcon j4F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(3).getEquipaF().getSimbolo()));
            jogo1C.setIcon(j1C);
            jogo1F.setIcon(j1F);
            jogo2C.setIcon(j2C);
            jogo2F.setIcon(j2F);
            jogo3C.setIcon(j3C);
            jogo3F.setIcon(j3F);
            jogo4C.setIcon(j4C);
            jogo4F.setIcon(j4F);
            j1V.setText(Double.toString(jogos.get(0).getOddV()));
            j1E.setText(Double.toString(jogos.get(0).getOddE()));
            j1D.setText(Double.toString(jogos.get(0).getOddD()));
            j2V.setText(Double.toString(jogos.get(1).getOddV()));
            j2E.setText(Double.toString(jogos.get(1).getOddE()));
            j2D.setText(Double.toString(jogos.get(1).getOddD()));
            j3V.setText(Double.toString(jogos.get(2).getOddV()));
            j3E.setText(Double.toString(jogos.get(2).getOddE()));
            j3D.setText(Double.toString(jogos.get(2).getOddD()));
            j4V.setText(Double.toString(jogos.get(3).getOddV()));
            j4E.setText(Double.toString(jogos.get(3).getOddE()));
            j4D.setText(Double.toString(jogos.get(3).getOddD()));
            jogo5.setVisible(false);
            jogo6.setVisible(false);
            jogo7.setVisible(false);
            jogo8.setVisible(false);
            jogo9.setVisible(false);
    }
    private void fillJogo5(){
        ImageIcon j1C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(0).getEquipaC().getSimbolo()));
            ImageIcon j1F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(0).getEquipaF().getSimbolo()));
            ImageIcon j2C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(1).getEquipaC().getSimbolo()));
            ImageIcon j2F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(1).getEquipaF().getSimbolo()));
            ImageIcon j3C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(2).getEquipaC().getSimbolo()));
            ImageIcon j3F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(2).getEquipaF().getSimbolo()));
            ImageIcon j4C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(3).getEquipaC().getSimbolo()));
            ImageIcon j4F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(3).getEquipaF().getSimbolo()));
            ImageIcon j5C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(4).getEquipaC().getSimbolo()));
            ImageIcon j5F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(4).getEquipaF().getSimbolo()));
            jogo1C.setIcon(j1C);
            jogo1F.setIcon(j1F);
            jogo2C.setIcon(j2C);
            jogo2F.setIcon(j2F);
            jogo3C.setIcon(j3C);
            jogo3F.setIcon(j3F);
            jogo4C.setIcon(j4C);
            jogo4F.setIcon(j4F);
            jogo5C.setIcon(j5C);
            jogo5F.setIcon(j5F);
            j1V.setText(Double.toString(jogos.get(0).getOddV()));
            j1E.setText(Double.toString(jogos.get(0).getOddE()));
            j1D.setText(Double.toString(jogos.get(0).getOddD()));
            j2V.setText(Double.toString(jogos.get(1).getOddV()));
            j2E.setText(Double.toString(jogos.get(1).getOddE()));
            j2D.setText(Double.toString(jogos.get(1).getOddD()));
            j3V.setText(Double.toString(jogos.get(2).getOddV()));
            j3E.setText(Double.toString(jogos.get(2).getOddE()));
            j3D.setText(Double.toString(jogos.get(2).getOddD()));
            j4V.setText(Double.toString(jogos.get(3).getOddV()));
            j4E.setText(Double.toString(jogos.get(3).getOddE()));
            j4D.setText(Double.toString(jogos.get(3).getOddD()));
            j5V.setText(Double.toString(jogos.get(4).getOddV()));
            j5E.setText(Double.toString(jogos.get(4).getOddE()));
            j5D.setText(Double.toString(jogos.get(4).getOddD()));
            jogo6.setVisible(false);
            jogo7.setVisible(false);
            jogo8.setVisible(false);
            jogo9.setVisible(false);
    }
    private void fillJogo6(){
                    ImageIcon j1C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(0).getEquipaC().getSimbolo()));
            ImageIcon j1F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(0).getEquipaF().getSimbolo()));
            ImageIcon j2C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(1).getEquipaC().getSimbolo()));
            ImageIcon j2F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(1).getEquipaF().getSimbolo()));
            ImageIcon j3C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(2).getEquipaC().getSimbolo()));
            ImageIcon j3F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(2).getEquipaF().getSimbolo()));
            ImageIcon j4C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(3).getEquipaC().getSimbolo()));
            ImageIcon j4F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(3).getEquipaF().getSimbolo()));
            ImageIcon j5C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(4).getEquipaC().getSimbolo()));
            ImageIcon j5F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(4).getEquipaF().getSimbolo()));
            ImageIcon j6C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(5).getEquipaC().getSimbolo()));
            ImageIcon j6F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(5).getEquipaF().getSimbolo()));
            jogo1C.setIcon(j1C);
            jogo1F.setIcon(j1F);
            jogo2C.setIcon(j2C);
            jogo2F.setIcon(j2F);
            jogo3C.setIcon(j3C);
            jogo3F.setIcon(j3F);
            jogo4C.setIcon(j4C);
            jogo4F.setIcon(j4F);
            jogo5C.setIcon(j5C);
            jogo5F.setIcon(j5F);
            jogo6C.setIcon(j6C);
            jogo6F.setIcon(j6F);
            j1V.setText(Double.toString(jogos.get(0).getOddV()));
            j1E.setText(Double.toString(jogos.get(0).getOddE()));
            j1D.setText(Double.toString(jogos.get(0).getOddD()));
            j2V.setText(Double.toString(jogos.get(1).getOddV()));
            j2E.setText(Double.toString(jogos.get(1).getOddE()));
            j2D.setText(Double.toString(jogos.get(1).getOddD()));
            j3V.setText(Double.toString(jogos.get(2).getOddV()));
            j3E.setText(Double.toString(jogos.get(2).getOddE()));
            j3D.setText(Double.toString(jogos.get(2).getOddD()));
            j4V.setText(Double.toString(jogos.get(3).getOddV()));
            j4E.setText(Double.toString(jogos.get(3).getOddE()));
            j4D.setText(Double.toString(jogos.get(3).getOddD()));
            j5V.setText(Double.toString(jogos.get(4).getOddV()));
            j5E.setText(Double.toString(jogos.get(4).getOddE()));
            j5D.setText(Double.toString(jogos.get(4).getOddD()));
            j6V.setText(Double.toString(jogos.get(5).getOddV()));
            j6E.setText(Double.toString(jogos.get(5).getOddE()));
            j6D.setText(Double.toString(jogos.get(5).getOddD()));
            jogo7.setVisible(false);
            jogo8.setVisible(false);
            jogo9.setVisible(false);
    }
    private void fillJogo7(){
            ImageIcon j1C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(0).getEquipaC().getSimbolo()));
            ImageIcon j1F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(0).getEquipaF().getSimbolo()));
            ImageIcon j2C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(1).getEquipaC().getSimbolo()));
            ImageIcon j2F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(1).getEquipaF().getSimbolo()));
            ImageIcon j3C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(2).getEquipaC().getSimbolo()));
            ImageIcon j3F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(2).getEquipaF().getSimbolo()));
            ImageIcon j4C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(3).getEquipaC().getSimbolo()));
            ImageIcon j4F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(3).getEquipaF().getSimbolo()));
            ImageIcon j5C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(4).getEquipaC().getSimbolo()));
            ImageIcon j5F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(4).getEquipaF().getSimbolo()));
            ImageIcon j6C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(5).getEquipaC().getSimbolo()));
            ImageIcon j6F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(5).getEquipaF().getSimbolo()));
            ImageIcon j7C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(6).getEquipaC().getSimbolo()));
            ImageIcon j7F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(6).getEquipaF().getSimbolo()));
            jogo1C.setIcon(j1C);
            jogo1F.setIcon(j1F);
            jogo2C.setIcon(j2C);
            jogo2F.setIcon(j2F);
            jogo3C.setIcon(j3C);
            jogo3F.setIcon(j3F);
            jogo4C.setIcon(j4C);
            jogo4F.setIcon(j4F);
            jogo5C.setIcon(j5C);
            jogo5F.setIcon(j5F);
            jogo6C.setIcon(j6C);
            jogo6F.setIcon(j6F);
            jogo7C.setIcon(j7C);
            jogo7F.setIcon(j7F);
            j1V.setText(Double.toString(jogos.get(0).getOddV()));
            j1E.setText(Double.toString(jogos.get(0).getOddE()));
            j1D.setText(Double.toString(jogos.get(0).getOddD()));
            j2V.setText(Double.toString(jogos.get(1).getOddV()));
            j2E.setText(Double.toString(jogos.get(1).getOddE()));
            j2D.setText(Double.toString(jogos.get(1).getOddD()));
            j3V.setText(Double.toString(jogos.get(2).getOddV()));
            j3E.setText(Double.toString(jogos.get(2).getOddE()));
            j3D.setText(Double.toString(jogos.get(2).getOddD()));
            j4V.setText(Double.toString(jogos.get(3).getOddV()));
            j4E.setText(Double.toString(jogos.get(3).getOddE()));
            j4D.setText(Double.toString(jogos.get(3).getOddD()));
            j5V.setText(Double.toString(jogos.get(4).getOddV()));
            j5E.setText(Double.toString(jogos.get(4).getOddE()));
            j5D.setText(Double.toString(jogos.get(4).getOddD()));
            j6V.setText(Double.toString(jogos.get(5).getOddV()));
            j6E.setText(Double.toString(jogos.get(5).getOddE()));
            j6D.setText(Double.toString(jogos.get(5).getOddD()));
            j7V.setText(Double.toString(jogos.get(6).getOddV()));
            j7E.setText(Double.toString(jogos.get(6).getOddE()));
            j7D.setText(Double.toString(jogos.get(6).getOddD()));
            jogo8.setVisible(false);
            jogo9.setVisible(false);
    }
    private void fillJogo8(){
        ImageIcon j1C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(0).getEquipaC().getSimbolo()));
            ImageIcon j1F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(0).getEquipaF().getSimbolo()));
            ImageIcon j2C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(1).getEquipaC().getSimbolo()));
            ImageIcon j2F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(1).getEquipaF().getSimbolo()));
            ImageIcon j3C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(2).getEquipaC().getSimbolo()));
            ImageIcon j3F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(2).getEquipaF().getSimbolo()));
            ImageIcon j4C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(3).getEquipaC().getSimbolo()));
            ImageIcon j4F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(3).getEquipaF().getSimbolo()));
            ImageIcon j5C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(4).getEquipaC().getSimbolo()));
            ImageIcon j5F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(4).getEquipaF().getSimbolo()));
            ImageIcon j6C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(5).getEquipaC().getSimbolo()));
            ImageIcon j6F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(5).getEquipaF().getSimbolo()));
            ImageIcon j7C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(6).getEquipaC().getSimbolo()));
            ImageIcon j7F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(6).getEquipaF().getSimbolo()));
            ImageIcon j8C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(7).getEquipaC().getSimbolo()));
            ImageIcon j8F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(7).getEquipaF().getSimbolo()));
            jogo1C.setIcon(j1C);
            jogo1F.setIcon(j1F);
            jogo2C.setIcon(j2C);
            jogo2F.setIcon(j2F);
            jogo3C.setIcon(j3C);
            jogo3F.setIcon(j3F);
            jogo4C.setIcon(j4C);
            jogo4F.setIcon(j4F);
            jogo5C.setIcon(j5C);
            jogo5F.setIcon(j5F);
            jogo6C.setIcon(j6C);
            jogo6F.setIcon(j6F);
            jogo7C.setIcon(j7C);
            jogo7F.setIcon(j7F);
            jogo8C.setIcon(j8C);
            jogo8F.setIcon(j8F);
            j1V.setText(Double.toString(jogos.get(0).getOddV()));
            j1E.setText(Double.toString(jogos.get(0).getOddE()));
            j1D.setText(Double.toString(jogos.get(0).getOddD()));
            j2V.setText(Double.toString(jogos.get(1).getOddV()));
            j2E.setText(Double.toString(jogos.get(1).getOddE()));
            j2D.setText(Double.toString(jogos.get(1).getOddD()));
            j3V.setText(Double.toString(jogos.get(2).getOddV()));
            j3E.setText(Double.toString(jogos.get(2).getOddE()));
            j3D.setText(Double.toString(jogos.get(2).getOddD()));
            j4V.setText(Double.toString(jogos.get(3).getOddV()));
            j4E.setText(Double.toString(jogos.get(3).getOddE()));
            j4D.setText(Double.toString(jogos.get(3).getOddD()));
            j5V.setText(Double.toString(jogos.get(4).getOddV()));
            j5E.setText(Double.toString(jogos.get(4).getOddE()));
            j5D.setText(Double.toString(jogos.get(4).getOddD()));
            j6V.setText(Double.toString(jogos.get(5).getOddV()));
            j6E.setText(Double.toString(jogos.get(5).getOddE()));
            j6D.setText(Double.toString(jogos.get(5).getOddD()));
            j7V.setText(Double.toString(jogos.get(6).getOddV()));
            j7E.setText(Double.toString(jogos.get(6).getOddE()));
            j7D.setText(Double.toString(jogos.get(6).getOddD()));
            j8V.setText(Double.toString(jogos.get(7).getOddV()));
            j8E.setText(Double.toString(jogos.get(7).getOddE()));
            j8D.setText(Double.toString(jogos.get(7).getOddD()));
            jogo9.setVisible(false);
    }
    private void fillJogo9(){
        ImageIcon j1C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(0).getEquipaC().getSimbolo()));
            ImageIcon j1F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(0).getEquipaF().getSimbolo()));
            ImageIcon j2C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(1).getEquipaC().getSimbolo()));
            ImageIcon j2F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(1).getEquipaF().getSimbolo()));
            ImageIcon j3C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(2).getEquipaC().getSimbolo()));
            ImageIcon j3F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(2).getEquipaF().getSimbolo()));
            ImageIcon j4C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(3).getEquipaC().getSimbolo()));
            ImageIcon j4F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(3).getEquipaF().getSimbolo()));
            ImageIcon j5C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(4).getEquipaC().getSimbolo()));
            ImageIcon j5F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(4).getEquipaF().getSimbolo()));
            ImageIcon j6C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(5).getEquipaC().getSimbolo()));
            ImageIcon j6F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(5).getEquipaF().getSimbolo()));
            ImageIcon j7C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(6).getEquipaC().getSimbolo()));
            ImageIcon j7F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(6).getEquipaF().getSimbolo()));
            ImageIcon j8C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(7).getEquipaC().getSimbolo()));
            ImageIcon j8F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(7).getEquipaF().getSimbolo()));
            ImageIcon j9C = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(8).getEquipaC().getSimbolo()));
            ImageIcon j9F = new ImageIcon(getClass().getClassLoader().getResource(jogos.get(8).getEquipaF().getSimbolo()));
            jogo1C.setIcon(j1C);
            jogo1F.setIcon(j1F);
            jogo2C.setIcon(j2C);
            jogo2F.setIcon(j2F);
            jogo3C.setIcon(j3C);
            jogo3F.setIcon(j3F);
            jogo4C.setIcon(j4C);
            jogo4F.setIcon(j4F);
            jogo5C.setIcon(j5C);
            jogo5F.setIcon(j5F);
            jogo6C.setIcon(j6C);
            jogo6F.setIcon(j6F);
            jogo7C.setIcon(j7C);
            jogo7F.setIcon(j7F);
            jogo8C.setIcon(j8C);
            jogo8F.setIcon(j8F);
            jogo9C.setIcon(j9C);
            jogo9F.setIcon(j9F);
            j1V.setText(Double.toString(jogos.get(0).getOddV()));
            j1E.setText(Double.toString(jogos.get(0).getOddE()));
            j1D.setText(Double.toString(jogos.get(0).getOddD()));
            j2V.setText(Double.toString(jogos.get(1).getOddV()));
            j2E.setText(Double.toString(jogos.get(1).getOddE()));
            j2D.setText(Double.toString(jogos.get(1).getOddD()));
            j3V.setText(Double.toString(jogos.get(2).getOddV()));
            j3E.setText(Double.toString(jogos.get(2).getOddE()));
            j3D.setText(Double.toString(jogos.get(2).getOddD()));
            j4V.setText(Double.toString(jogos.get(3).getOddV()));
            j4E.setText(Double.toString(jogos.get(3).getOddE()));
            j4D.setText(Double.toString(jogos.get(3).getOddD()));
            j5V.setText(Double.toString(jogos.get(4).getOddV()));
            j5E.setText(Double.toString(jogos.get(4).getOddE()));
            j5D.setText(Double.toString(jogos.get(4).getOddD()));
            j6V.setText(Double.toString(jogos.get(5).getOddV()));
            j6E.setText(Double.toString(jogos.get(5).getOddE()));
            j6D.setText(Double.toString(jogos.get(5).getOddD()));
            j7V.setText(Double.toString(jogos.get(6).getOddV()));
            j7E.setText(Double.toString(jogos.get(6).getOddE()));
            j7D.setText(Double.toString(jogos.get(6).getOddD()));
            j8V.setText(Double.toString(jogos.get(7).getOddV()));
            j8E.setText(Double.toString(jogos.get(7).getOddE()));
            j8D.setText(Double.toString(jogos.get(7).getOddD()));
            j9V.setText(Double.toString(jogos.get(8).getOddV()));
            j9E.setText(Double.toString(jogos.get(8).getOddE()));
            j9D.setText(Double.toString(jogos.get(8).getOddD()));
    }
    public void setStyle(){
        this.setTitle("Eventos ativos");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("resources/logo2.png"));
        Image image = icon.getImage();
        Image newimg = image.getScaledInstance(155, 35, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(newimg);
        logo.setIcon(icon);

        perfilButton.setBackground(new Color(0,0,0));
        perfilButton.setContentAreaFilled(false);
        perfilButton.setOpaque(true);
        perfilButton.setText(this.apostador.getNome());
        
        if(jogos.size()==0)      fillJogo0();
        else if(jogos.size()==1) fillJogo1();
        else if(jogos.size()==2) fillJogo2();
        else if(jogos.size()==3) fillJogo3();
        else if(jogos.size()==4) fillJogo4();
        else if(jogos.size()==5) fillJogo5();
        else if(jogos.size()==6) fillJogo6();
        else if(jogos.size()==7) fillJogo7();
        else if(jogos.size()==8) fillJogo8();
        else if(jogos.size()==9) fillJogo9();
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apostasButton;
    private javax.swing.JButton j1Bet;
    private javax.swing.JToggleButton j1D;
    private javax.swing.JButton j1D7;
    private javax.swing.JButton j1D9;
    private javax.swing.JToggleButton j1E;
    private javax.swing.JButton j1E7;
    private javax.swing.JButton j1E9;
    private javax.swing.JSpinner j1Spin;
    private javax.swing.JToggleButton j1V;
    private javax.swing.JButton j1V7;
    private javax.swing.JButton j1V9;
    private javax.swing.JButton j2Bet;
    private javax.swing.JToggleButton j2D;
    private javax.swing.JToggleButton j2E;
    private javax.swing.JSpinner j2Spin;
    private javax.swing.JToggleButton j2V;
    private javax.swing.JButton j3Bet;
    private javax.swing.JToggleButton j3D;
    private javax.swing.JToggleButton j3E;
    private javax.swing.JSpinner j3Spin;
    private javax.swing.JToggleButton j3V;
    private javax.swing.JButton j4Bet;
    private javax.swing.JToggleButton j4D;
    private javax.swing.JToggleButton j4E;
    private javax.swing.JSpinner j4Spin;
    private javax.swing.JToggleButton j4V;
    private javax.swing.JButton j5Bet;
    private javax.swing.JToggleButton j5D;
    private javax.swing.JToggleButton j5E;
    private javax.swing.JSpinner j5Spin;
    private javax.swing.JToggleButton j5V;
    private javax.swing.JButton j6Bet;
    private javax.swing.JToggleButton j6D;
    private javax.swing.JToggleButton j6E;
    private javax.swing.JSpinner j6Spin;
    private javax.swing.JToggleButton j6V;
    private javax.swing.JButton j7Bet;
    private javax.swing.JToggleButton j7D;
    private javax.swing.JToggleButton j7E;
    private javax.swing.JSpinner j7Spin;
    private javax.swing.JToggleButton j7V;
    private javax.swing.JButton j8Bet;
    private javax.swing.JToggleButton j8D;
    private javax.swing.JToggleButton j8E;
    private javax.swing.JSpinner j8Spin;
    private javax.swing.JToggleButton j8V;
    private javax.swing.JButton j9Bet;
    private javax.swing.JToggleButton j9D;
    private javax.swing.JToggleButton j9E;
    private javax.swing.JSpinner j9Spin;
    private javax.swing.JToggleButton j9V;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jogo1;
    private javax.swing.JPanel jogo16;
    private javax.swing.JPanel jogo18;
    private javax.swing.JLabel jogo1C;
    private javax.swing.JLabel jogo1C7;
    private javax.swing.JLabel jogo1C9;
    private javax.swing.JLabel jogo1F;
    private javax.swing.JLabel jogo1F7;
    private javax.swing.JLabel jogo1F9;
    private javax.swing.JPanel jogo2;
    private javax.swing.JLabel jogo2C;
    private javax.swing.JLabel jogo2F;
    private javax.swing.JPanel jogo3;
    private javax.swing.JLabel jogo3C;
    private javax.swing.JLabel jogo3F;
    private javax.swing.JPanel jogo4;
    private javax.swing.JLabel jogo4C;
    private javax.swing.JLabel jogo4F;
    private javax.swing.JPanel jogo5;
    private javax.swing.JLabel jogo5C;
    private javax.swing.JLabel jogo5F;
    private javax.swing.JPanel jogo6;
    private javax.swing.JLabel jogo6C;
    private javax.swing.JLabel jogo6F;
    private javax.swing.JPanel jogo7;
    private javax.swing.JLabel jogo7C;
    private javax.swing.JLabel jogo7F;
    private javax.swing.JPanel jogo8;
    private javax.swing.JLabel jogo8C;
    private javax.swing.JLabel jogo8F;
    private javax.swing.JPanel jogo9;
    private javax.swing.JLabel jogo9C;
    private javax.swing.JLabel jogo9F;
    private javax.swing.JLabel logo;
    private javax.swing.JButton movimentosButton;
    private javax.swing.JButton perfilButton;
    // End of variables declaration//GEN-END:variables
}