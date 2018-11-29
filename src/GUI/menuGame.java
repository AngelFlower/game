/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Niveles.level1;
import Niveles.pDetermination;
import static GUI.main.paneMain;
import Herramientas.Constantes;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/**
 *
 * @author Angel Flores
 */
public class menuGame extends javax.swing.JPanel {

    /**
     * Creates new form menuGame
     */
    private URL url = getClass().getResource("/img/fondoInicio.jpg");
    Image image = new ImageIcon(url).getImage();
    public void paint(Graphics g){
        g.drawImage(image, 0, 0, getWidth(), getHeight(), pAll_Settings);
        setOpaque(false);
        super.paint(g);
    }
    public menuGame() {
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

        pAll_Settings = new javax.swing.JPanel();
        pTop = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        pCenter = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnNewGame = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnContinue = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        pDown = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pCancel = new javax.swing.JPanel();
        pOK = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        pRight = new javax.swing.JPanel();
        pLeft = new javax.swing.JPanel();

        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        setLayout(new java.awt.GridLayout(1, 0));

        pAll_Settings.setOpaque(false);
        pAll_Settings.setLayout(new java.awt.BorderLayout());

        pTop.setOpaque(false);
        pTop.setLayout(new java.awt.GridLayout(1, 3));

        jPanel6.setOpaque(false);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btnBack)
                .addGap(0, 312, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btnBack)
                .addGap(0, 75, Short.MAX_VALUE))
        );

        pTop.add(jPanel6);

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.GridBagLayout());

        Title.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(246, 246, 246));
        Title.setText("Game modes");
        jPanel7.add(Title, new java.awt.GridBagConstraints());

        pTop.add(jPanel7);

        jPanel8.setOpaque(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pTop.add(jPanel8);

        pAll_Settings.add(pTop, java.awt.BorderLayout.PAGE_START);

        pCenter.setOpaque(false);
        pCenter.setLayout(new java.awt.GridLayout(3, 1));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        btnNewGame.setText("New game");
        btnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGameActionPerformed(evt);
            }
        });
        jPanel2.add(btnNewGame, new java.awt.GridBagConstraints());

        pCenter.add(jPanel2);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridBagLayout());

        btnContinue.setText("Continue");
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });
        jPanel3.add(btnContinue, new java.awt.GridBagConstraints());

        pCenter.add(jPanel3);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridBagLayout());
        pCenter.add(jPanel5);

        pAll_Settings.add(pCenter, java.awt.BorderLayout.CENTER);

        pDown.setOpaque(false);
        pDown.setLayout(new java.awt.GridLayout(1, 4));

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pDown.add(jPanel1);

        pCancel.setOpaque(false);
        pCancel.setLayout(new java.awt.GridBagLayout());
        pDown.add(pCancel);

        pOK.setOpaque(false);
        pOK.setLayout(new java.awt.GridBagLayout());
        pDown.add(pOK);

        jPanel4.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pDown.add(jPanel4);

        pAll_Settings.add(pDown, java.awt.BorderLayout.PAGE_END);

        pRight.setOpaque(false);

        javax.swing.GroupLayout pRightLayout = new javax.swing.GroupLayout(pRight);
        pRight.setLayout(pRightLayout);
        pRightLayout.setHorizontalGroup(
            pRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pRightLayout.setVerticalGroup(
            pRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
        );

        pAll_Settings.add(pRight, java.awt.BorderLayout.LINE_END);

        pLeft.setOpaque(false);

        javax.swing.GroupLayout pLeftLayout = new javax.swing.GroupLayout(pLeft);
        pLeft.setLayout(pLeftLayout);
        pLeftLayout.setHorizontalGroup(
            pLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pLeftLayout.setVerticalGroup(
            pLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
        );

        pAll_Settings.add(pLeft, java.awt.BorderLayout.LINE_START);

        add(pAll_Settings);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackAction(){
        pStart start = new pStart();
        start.setLocation(0, 0);
        paneMain.removeAll();
        paneMain.add(start,GridLayout.class);
        paneMain.revalidate();
        paneMain.repaint();
    }
    private void btnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGameActionPerformed
        level1 start = new level1();
        start.setLocation(0, 0);
        //Constantes.RUTA_ICONO_RATON  = "/img/IconoCursorLevel.png";
        //main frame = (main) SwingUtilities.getWindowAncestor(this);
        //frame.mousePersonalizado();
        paneMain.removeAll();
        paneMain.add(start,GridLayout.class);
        paneMain.revalidate();
        paneMain.repaint();
        //start.requestFocusInWindow();
    }//GEN-LAST:event_btnNewGameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        btnBackAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        pContinueLevel ContLevel = new pContinueLevel();
        ContLevel.setLocation(0, 0);
        paneMain.removeAll();
        paneMain.add(ContLevel,GridLayout.class);
        paneMain.revalidate();
        paneMain.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_btnContinueActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ESCAPE:
                btnBackAction();
                break;
            default:
        }
    }//GEN-LAST:event_formKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnContinue;
    private javax.swing.JButton btnNewGame;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel pAll_Settings;
    private javax.swing.JPanel pCancel;
    private javax.swing.JPanel pCenter;
    private javax.swing.JPanel pDown;
    private javax.swing.JPanel pLeft;
    private javax.swing.JPanel pOK;
    private javax.swing.JPanel pRight;
    private javax.swing.JPanel pTop;
    // End of variables declaration//GEN-END:variables
}
