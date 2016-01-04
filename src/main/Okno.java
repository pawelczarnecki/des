package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Okno extends JPanel {//implements ActionListener {

    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;

    public Okno() {

    jPanel1 = new JPanel();
    jTextField1 = new JTextField();
    jTextField2 = new JTextField();
    jTextField3 = new JTextField();
    jLabel1 = new JLabel();
    jLabel2 = new JLabel();
    jLabel3 = new JLabel();
    jButton1 = new JButton();
    jButton2 = new JButton();



    jTextField1.setText("0123456789ABCDEF");

    jTextField2.setText("133457799BBCDFF1");

    jTextField3.setText("85E813540F0AB405");

    jLabel1.setText("Wiadomosc");

    jLabel2.setText("Klucz");

    jLabel3.setText("Wynik");

    jButton1.setText("Encrypt");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    jButton2.setText("Dectrypt");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(jPanel1Layout.createSequentialGroup()
    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addComponent(jLabel2)
    .addComponent(jLabel3)))
            .addGroup(jPanel1Layout.createSequentialGroup()
    .addComponent(jButton1)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(jButton2)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
    jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addComponent(jLabel1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addComponent(jLabel2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
    .addComponent(jButton1)
    .addComponent(jButton2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addComponent(jLabel3))
            .addContainerGap())
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
        try {
            byte[] theKey = null;
            byte[] theMsg = null;
            byte[] theExp = null;
            //theKey = hexToBytes("133457799BBCDFF1");
            //theMsg = hexToBytes("0123456789ABCDEF");
            //theExp = hexToBytes("85E813540F0AB405");
            theKey = hexToBytes(jTextField2.getText());
            theMsg = hexToBytes(jTextField1.getText());
            theExp = hexToBytes(jTextField3.getText());
            byte[][] subKeys = ChipherDES.getSubkeys(theKey);
            byte[] theCph = ChipherDES.cipher(theMsg,subKeys,"encrypt");
            System.out.println("Key     : " + bytesToHex(theKey) + " " + theKey);
            System.out.println("Message : "+bytesToHex(theMsg)+ " " + theMsg);
            System.out.println("Cipher  : "+bytesToHex(theCph)+ " " + theCph);
            System.out.println("Expected: " + bytesToHex(theExp) + " " + theExp);
            jTextField3.setText(bytesToHex(theCph));
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

    }
    private void jButton2ActionPerformed(ActionEvent evt) {
        try {
            byte[] theKey = null;
            byte[] theMsg = null;
            byte[] theExp = null;
            //theKey = hexToBytes("133457799BBCDFF1");
            //theMsg = hexToBytes("0123456789ABCDEF");
            //theExp = hexToBytes("85E813540F0AB405");
            theKey = hexToBytes(jTextField2.getText());
            theMsg = hexToBytes(jTextField1.getText());
            theExp = hexToBytes(jTextField3.getText());
            byte[][] subKeys = ChipherDES.getSubkeys(theKey);
            byte[] theCph = ChipherDES.cipher(theMsg,subKeys,"decrypt");
            System.out.println("Key     : " + bytesToHex(theKey) + " " + theKey);
            System.out.println("Message : "+bytesToHex(theMsg)+ " " + theMsg);
            System.out.println("Cipher  : "+bytesToHex(theCph)+ " " + theCph);
            System.out.println("Expected: " + bytesToHex(theExp) + " " + theExp);
            jTextField3.setText(bytesToHex(theCph));
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
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
    public static byte[] hexToBytes(String str) {
        if (str==null) {
            return null;
        } else if (str.length() < 2) {
            return null;
        } else {
            int len = str.length() / 2;
            byte[] buffer = new byte[len];
            for (int i=0; i<len; i++) {
                buffer[i] = (byte) Integer.parseInt(
                        str.substring(i*2,i*2+2),16);
            }
            return buffer;
        }

    }
    public static String bytesToHex(byte[] data) {
        if (data==null) {
            return null;
        } else {
            int len = data.length;
            String str = "";
            for (int i=0; i<len; i++) {
                if ((data[i]&0xFF)<16) str = str + "0"
                        + java.lang.Integer.toHexString(data[i]&0xFF);
                else str = str
                        + java.lang.Integer.toHexString(data[i]&0xFF);
            }
            return str.toUpperCase();
        }
    }
}
