/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Niveles;

import static GUI.main.paneMain;
import GUI.menuGame;
import GUI.pLevel;
import java.awt.GridLayout;

/**
 *
 * @author angel
 */
public class level3 extends javax.swing.JPanel {

    /**
     * Creates new form level3
     */
    public level3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        playBack = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setLayout(new java.awt.GridLayout(3, 0));

        playBack.setText("Back");
        playBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(playBack)
                .addGap(0, 450, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(playBack)
                .addGap(0, 83, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("En desarrollo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 60;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 117, 0, 117);
        jPanel3.add(jLabel1, gridBagConstraints);

        jPanel1.add(jPanel3);

        jPanel4.setLayout(new java.awt.GridBagLayout());
        jPanel1.add(jPanel4);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void playBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playBackActionPerformed
        menuGame level = new menuGame();
        level.setLocation(0, 0);
        paneMain.removeAll();
        paneMain.add(level,GridLayout.class);
        paneMain.revalidate();
        paneMain.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_playBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton playBack;
    // End of variables declaration//GEN-END:variables
}
