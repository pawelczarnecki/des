package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Random;

public class DesOkno extends JPanel {

    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JTextField jTextField7;
    private JTextField jTextField8;
    private JTextField jTextField9;
    private JTextField jTextField10;
    private JTextField jTextField11;
    private JTextField jTextField12;
    private JTextField jTextField13;
    private JTextField jTextField14;
    private JTextField jTextField15;
    private JTextField jTextField16;
    private JTextField jTextField17;
    private JTextField jTextField18;
    private JTextField jTextField19;
    private JTextField jTextField20;
    private JTextField jTextField21;
    private JTextField jTextField22;
    private JTextField jTextField23;
    private JTextField jTextField24;
    private JTextField jTextField25;
    private JTextField jTextField26;
    private JButton jButton1;
    private JPanel jPanel1;



    public DesOkno() {

        jPanel1 = new JPanel();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();
        jTextField5 = new JTextField();
        jTextField6 = new JTextField();
        jTextField7 = new JTextField();
        jTextField8 = new JTextField();
        jTextField9 = new JTextField();
        jTextField10 = new JTextField();
        jTextField11 = new JTextField();
        jTextField12 = new JTextField();
        jTextField13 = new JTextField();
        jTextField14 = new JTextField();
        jTextField15 = new JTextField();
        jTextField16 = new JTextField();
        jTextField17 = new JTextField();
        jTextField18 = new JTextField();
        jTextField19 = new JTextField();
        jTextField20 = new JTextField();
        jTextField21 = new JTextField();
        jTextField22 = new JTextField();
        jTextField23 = new JTextField();
        jTextField24 = new JTextField();
        jTextField25 = new JTextField();
        jTextField26 = new JTextField();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        jLabel14 = new JLabel();
        jButton1 = new JButton();


        jLabel1.setText("Klucz");

        jLabel2.setText("Liczba rund DES");

        jLabel3.setText("Liczba par");

        jLabel4.setText("Wygenerowane klucze");

        jLabel5.setText("S-Box 1");

        jLabel6.setText("S-Box 2");

        jLabel7.setText("S-Box 3");

        jLabel8.setText("S-Box 4");

        jLabel9.setText("S-Box 5");

        jLabel10.setText("S-Box 6");

        jLabel11.setText("S-Box 7");

        jLabel12.setText("S-Box 8");
/*
        jTextField4.setText("jTextField4");

        jTextField5.setText("jTextField5");

        jTextField6.setText("jTextField6");

        jTextField7.setText("jTextField7");

        jTextField8.setText("jTextField8");

        jTextField9.setText("jTextField9");

        jTextField10.setText("jTextField10");

        jTextField11.setText("jTextField11");

        jTextField12.setText("jTextField12");

        jTextField13.setText("jTextField13");

        jTextField14.setText("jTextField14");

        jTextField15.setText("jTextField15");

        jTextField16.setText("jTextField16");

        jTextField17.setText("jTextField17");

        jTextField18.setText("jTextField18");

        jTextField19.setText("jTextField19");
*/
        jLabel13.setText("Odgadniete klucze");
        jLabel14.setText("Charakterystyka");

        jButton1.setText("Odgadnij");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                                        .addComponent(jTextField2))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3)))
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel11)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jTextField10))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel10)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jTextField9))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel9)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jTextField8))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel8)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jTextField7))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel7)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jTextField6))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel6)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jTextField5))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel5)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel12)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel1)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel13)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(jTextField19, javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jTextField18, javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jTextField17, javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jTextField16, javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jTextField15, javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jTextField14, javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(118, 118, 118))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2)))
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14)
                                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        //pack();


    }
    private void jButton1ActionPerformed(ActionEvent evt) {

            int numRounds = GetRounds();
            BitSet key=GetKey();
            int numPairs = GetPair();
            DesImpl des = new DesImpl();
            BitSet K4 = des.KeySchedule(key, numRounds);


            System.out.println(numRounds+"-rundowsa kryptoanaliza DES");
            System.out.println("Dla " + numPairs + " par.");
            System.out.println("****************");
            System.out.println("Wykorzystywany klucz:");
            Util.printBitSet(key, 64);
            System.out.println("****************");
            System.out.println("Klucze rund " + numRounds + " :");
        BitSet K4_S;
            for (int i = 0; i < 8; i++){
                K4_S = K4.get(6*i, 6*(i+1));
                System.out.print("\tS-Box " + (i+1) + ":\t");
                System.out.print(Integer.toHexString(Util.toInteger(K4_S, 6)) + " ");
                System.out.println();
            }
        jTextField4.setText(Integer.toHexString(Util.toInteger(K4.get(0, 6*(1)), 6)));
        jTextField5.setText(Integer.toHexString(Util.toInteger(K4.get(6*1, 6*(2)), 6)));
        jTextField6.setText(Integer.toHexString(Util.toInteger(K4.get(6*2, 6*(3)), 6)));
        jTextField7.setText(Integer.toHexString(Util.toInteger(K4.get(6*3, 6*(4)), 6)));
        jTextField8.setText(Integer.toHexString(Util.toInteger(K4.get(6*4, 6*(5)), 6)));
        jTextField9.setText(Integer.toHexString(Util.toInteger(K4.get(6*5, 6*(6)), 6)));
        jTextField10.setText(Integer.toHexString(Util.toInteger(K4.get(6*6, 6*(7)), 6)));
        jTextField11.setText(Integer.toHexString(Util.toInteger(K4.get(6 * 7, 6 * (8)), 6)));

            System.out.println("****************");

            System.out.println("");
            System.out.println("Generowanie " + numPairs + " par...");
            List<BitSet[]> pairs = generateRandomPairs(numPairs, key, numRounds);
            System.out.println("Dobre pary: " + pairs.size());

            int[][] counts = new int[8][64];
            for (int k = 0; k < 8; k++){
                for (int i = 0; i < counts.length; i++) {
                    counts[k][i] = 0;
                }
            }

            for (BitSet[] pair : pairs) {

                BitSet C1L = pair[0].get(0, 32);
                BitSet C1R = pair[0].get(32, 64);
                BitSet C2L = pair[1].get(0, 32);
                BitSet C2R = pair[1].get(32, 64);

                BitSet W1 = des.E(C1R);
                BitSet W2 = des.E(C2R);

                BitSet delta_D = Util.copyBitSet(C1L, 32);
                delta_D.xor(C2L);
                BitSet delta_Y = des.PermuteCInv(delta_D);


                for (int sbox = 0; sbox < 8; sbox++){
                    for (int i = 0; i < 64; i++) {
                        BitSet partialSubkeyGuess = Util.toBitSet(i, 6);

                        BitSet X1 = W1.get(6*sbox,6*(sbox+1));
                        X1.xor(partialSubkeyGuess);
                        BitSet X2 = W2.get(6*sbox,6*(sbox+1));
                        X2.xor(partialSubkeyGuess);

                        BitSet pred_Y1 = des.SBoxSingle(sbox, X1);
                        BitSet pred_Y2 = des.SBoxSingle(sbox, X2);

                        BitSet pred_deltaY = Util.copyBitSet(pred_Y1, 4);
                        pred_deltaY.xor(pred_Y2);

                        BitSet orig_deltaY = delta_Y.get(4*sbox,8*(sbox+1));

                        boolean lhs = Util.equalsBitSet(pred_deltaY, orig_deltaY, 4);

                        if (lhs == true) {
                            counts[sbox][i]++;
                        }
                    }
                }
            }

            double[][] prob = new double[8][64];
            for (int k = 0; k < 8; k++){
                for (int i = 0; i < 64; i++) {
                    prob[k][i] = counts[k][i] / ((double) numPairs);
                }
            }


            System.out.println();
            System.out.println();
            System.out.println("Najlepsi kandydaci");


        int[] tab = new int[8];
            for (int k = 0; k < 8; k++){
                int maxi = 0;
                double maxprob = 0;

                System.out.println();
                System.out.println("Czesciowe bity podkluczy: prawdopodobienstwo");
                for (int i = 0; i < 64; i++) {

                    System.out.print(Integer.toHexString(i));
                    System.out.println(":\t" + prob[k][i]);

                    if (prob[k][i] >= maxprob) {
                        maxprob = prob[k][i];
                        maxi = i;

                    }
                }

                System.out.println();
                System.out.println();
                tab[k]=maxi;
                System.out.println("S-Box " + (k + 1) + " : " + Integer.toHexString(maxi) + " z prawdopodobienœtwem " + maxprob);
                System.out.println();
                System.out.println();

            }
        jTextField12.setText(Integer.toHexString(tab[0]));
        jTextField13.setText(Integer.toHexString(tab[1]));
        jTextField14.setText(Integer.toHexString(tab[2]));
        jTextField15.setText(Integer.toHexString(tab[3]));
        jTextField16.setText(Integer.toHexString(tab[4]));
        jTextField17.setText(Integer.toHexString(tab[5]));
        jTextField18.setText(Integer.toHexString(tab[6]));
        jTextField19.setText(Integer.toHexString(tab[7]));


        }

    public void actionPerformed(ActionEvent arg0) {

        /*String cmd = arg0.getActionCommand();
        if (cmd == "Start") {
            CardLayout cl = (CardLayout) (cards.getLayout());
            cl.show(cards, Okno.Application);
            System.out.println(cmd);

        }
        */
    }
    public BitSet GetKey()
    {

        String poczatek="0x";
        String klucz1=poczatek+ jTextField1.getText();
        String klucz2=poczatek+ jTextField20.getText();
        String klucz3=poczatek+ jTextField21.getText();
        String klucz4=poczatek+ jTextField22.getText();

        int set1= Integer.decode(klucz1);
        int set2= Integer.decode(klucz2);
        int set3= Integer.decode(klucz3);
        int set4= Integer.decode(klucz4);

        BitSet key1 = Util.toBitSet(set1, 16);
        BitSet key2 = Util.toBitSet(set2, 16);
        BitSet key3 = Util.toBitSet(set3, 16);
        BitSet key4 = Util.toBitSet(set4, 16);
        BitSet key12 = Util.concatenate(key1, 16, key2, 16);
        BitSet key34 = Util.concatenate(key3, 16, key4, 16);
        BitSet key = Util.concatenate(key12, 32, key34, 32);
        return key;
    }
    public int GetRounds()
    {
        return Integer.parseInt(jTextField2.getText());
    }
    public int GetPair()
    {
        return Integer.parseInt(jTextField3.getText());
    }
    public  List<BitSet[]> generateRandomPairs(int pairs, BitSet key, // byl static
                                                     int numRounds) {
        Random r = new Random();
        DesImpl des = new DesImpl();
        List<BitSet[]> sets = new ArrayList<BitSet[]>();
        for (int i = 0; i < pairs; i++) {
            BitSet p1 = Util.toBitSet(r.nextInt(65536), 16);
            BitSet p2 = Util.toBitSet(r.nextInt(65536), 16);
            BitSet p3 = Util.toBitSet(r.nextInt(65536), 16);
            BitSet p4 = Util.toBitSet(r.nextInt(65536), 16);
            BitSet p12 = Util.concatenate(p1, 16, p2, 16);
            BitSet p34 = Util.concatenate(p3, 16, p4, 16);

            BitSet p_one = Util.concatenate(p12, 32, p34, 32);
            BitSet c_one = des.DesEncBlock(p_one, key, numRounds);

            // delta_p = 04 04 07 80 00 20 20 00

            String poczatek="0x";
            String klucz1=poczatek+ jTextField23.getText();
            String klucz2=poczatek+ jTextField24.getText();
            String klucz3=poczatek+ jTextField25.getText();
            String klucz4=poczatek+ jTextField26.getText();

            int set1= Integer.decode(klucz1);
            int set2= Integer.decode(klucz2);
            int set3= Integer.decode(klucz3);
            int set4= Integer.decode(klucz4);

            BitSet delta_pL1 = Util.toBitSet(set1, 16);
            BitSet delta_pL2 = Util.toBitSet(set2, 16);
            BitSet delta_pR1 = Util.toBitSet(set3, 16);
            BitSet delta_pR2 = Util.toBitSet(set4, 16);
            BitSet delta_pL = Util.concatenate(delta_pL1, 16, delta_pL2, 16);
            BitSet delta_pR = Util.concatenate(delta_pR1, 16, delta_pR2, 16);

            BitSet delta_p = Util.concatenate(delta_pL, 32, delta_pR, 32);

            BitSet p_two = Util.copyBitSet(p_one, 64);
            p_two.xor(delta_p);
            BitSet c_two = des.DesEncBlock(p_two, key, numRounds);

            BitSet delta_CR = c_one.get(32, 64);
            delta_CR.xor(c_two.get(32, 64));

            sets.add(new BitSet[] { c_one, c_two });

        }
        return sets;
    }

}