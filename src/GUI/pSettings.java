/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Herramientas.Config;
import Herramientas.PropStore;
import static GUI.main.musica;
import static GUI.main.paneMain;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Angel Flores
 */
public class pSettings extends javax.swing.JPanel {
    boolean window,sonid;
    Config cfg = new Config();
    /**
     * Creates new form pSettings
     */
    private URL url = getClass().getResource("/img/fondoInicio.jpg");
    Image image = new ImageIcon(url).getImage();
    public void paint(Graphics g){
        g.drawImage(image, 0, 0, getWidth(), getHeight(), pAll_Settings);
        setOpaque(false);
        super.paint(g);
    }
    public pSettings() {
        
        Configs();
        initComponents();
        Etiquetas();
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
        Title = new javax.swing.JLabel();
        pCenter = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        wPrevious = new javax.swing.JButton();
        etiWindow = new javax.swing.JLabel();
        wNext = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        sPrevious = new javax.swing.JButton();
        etiSound = new javax.swing.JLabel();
        sNext = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        pDown = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pCancel = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        pOK = new javax.swing.JPanel();
        bntOK = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        pRight = new javax.swing.JPanel();
        pLeft = new javax.swing.JPanel();

        setLayout(new java.awt.GridLayout(1, 0));

        pAll_Settings.setOpaque(false);
        pAll_Settings.setLayout(new java.awt.BorderLayout());

        pTop.setOpaque(false);

        Title.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(240, 240, 240));
        Title.setText("Settings");

        javax.swing.GroupLayout pTopLayout = new javax.swing.GroupLayout(pTop);
        pTop.setLayout(pTopLayout);
        pTopLayout.setHorizontalGroup(
            pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
            .addGroup(pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pTopLayout.createSequentialGroup()
                    .addGap(0, 88, Short.MAX_VALUE)
                    .addComponent(Title)
                    .addGap(0, 89, Short.MAX_VALUE)))
        );
        pTopLayout.setVerticalGroup(
            pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pTopLayout.createSequentialGroup()
                    .addGap(0, 6, Short.MAX_VALUE)
                    .addComponent(Title)
                    .addGap(0, 7, Short.MAX_VALUE)))
        );

        pAll_Settings.add(pTop, java.awt.BorderLayout.PAGE_START);

        pCenter.setOpaque(false);
        pCenter.setLayout(new java.awt.GridLayout(3, 1));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setText("Fullscreen       ");
        jPanel2.add(jLabel1, new java.awt.GridBagConstraints());

        wPrevious.setText("<");
        wPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wPreviousActionPerformed(evt);
            }
        });
        jPanel2.add(wPrevious, new java.awt.GridBagConstraints());

        etiWindow.setForeground(new java.awt.Color(250, 250, 250));
        etiWindow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(etiWindow, new java.awt.GridBagConstraints());

        wNext.setText(">");
        wNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wNextActionPerformed(evt);
            }
        });
        jPanel2.add(wNext, new java.awt.GridBagConstraints());

        pCenter.add(jPanel2);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setForeground(new java.awt.Color(250, 250, 250));
        jLabel2.setText("Sound              ");
        jPanel3.add(jLabel2, new java.awt.GridBagConstraints());

        sPrevious.setText("<");
        sPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sPreviousActionPerformed(evt);
            }
        });
        jPanel3.add(sPrevious, new java.awt.GridBagConstraints());

        etiSound.setForeground(new java.awt.Color(250, 250, 250));
        etiSound.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(etiSound, new java.awt.GridBagConstraints());

        sNext.setText(">");
        sNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sNextActionPerformed(evt);
            }
        });
        jPanel3.add(sNext, new java.awt.GridBagConstraints());

        pCenter.add(jPanel3);

        jPanel5.setOpaque(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        pCenter.add(jPanel5);

        pAll_Settings.add(pCenter, java.awt.BorderLayout.CENTER);

        pDown.setOpaque(false);
        pDown.setLayout(new java.awt.GridLayout(1, 4));

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pDown.add(jPanel1);

        pCancel.setOpaque(false);
        pCancel.setLayout(new java.awt.GridBagLayout());

        btnCancel.setText("Back");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        pCancel.add(btnCancel, new java.awt.GridBagConstraints());

        pDown.add(pCancel);

        pOK.setOpaque(false);
        pOK.setLayout(new java.awt.GridBagLayout());

        bntOK.setText("Accept");
        bntOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntOKActionPerformed(evt);
            }
        });
        pOK.add(bntOK, new java.awt.GridBagConstraints());

        pDown.add(pOK);

        jPanel4.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
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
            .addGap(0, 150, Short.MAX_VALUE)
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
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pAll_Settings.add(pLeft, java.awt.BorderLayout.LINE_START);

        add(pAll_Settings);
    }// </editor-fold>//GEN-END:initComponents

    private void wPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wPreviousActionPerformed
        if(etiWindow.getText()=="No") etiWindow.setText("Yes");
        else etiWindow.setText("No");        // TODO add your handling code here:
    }//GEN-LAST:event_wPreviousActionPerformed

    private void wNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wNextActionPerformed
        if(etiWindow.getText()=="No") etiWindow.setText("Yes");
        else etiWindow.setText("No");
    }//GEN-LAST:event_wNextActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        pStart start = new pStart();
        start.setLocation(0, 0);
        paneMain.removeAll();
        paneMain.add(start,GridLayout.class);
        paneMain.revalidate();
        paneMain.repaint();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void bntOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntOKActionPerformed
        getAndSetConfigs();
        //Cierra el frame
        main frame = (main) SwingUtilities.getWindowAncestor(this);
        frame.dispose();
        //Abre el frame
        main v = new main();
        v.setVisible(true);
        pSettings settings = new pSettings();
        settings.setLocation(0, 0);
        paneMain.removeAll();
        paneMain.add(settings,GridLayout.class);
        paneMain.revalidate();
        paneMain.repaint();
    }//GEN-LAST:event_bntOKActionPerformed

    private void sPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sPreviousActionPerformed
        if(etiSound.getText()=="No") etiSound.setText("Yes");
        else etiSound.setText("No");
    }//GEN-LAST:event_sPreviousActionPerformed

    private void sNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sNextActionPerformed
        if(etiSound.getText()=="No") etiSound.setText("Yes");
        else etiSound.setText("No");
    }//GEN-LAST:event_sNextActionPerformed
    public void Configs(){
        
        boolean fullscreen = Boolean.parseBoolean(cfg.getProperty("fullscreen"));
        boolean sonido = Boolean.parseBoolean(cfg.getProperty("sound"));
        System.out.println(fullscreen);
        System.out.println(sonido);
        
        if(fullscreen) window=true;
        else window=false;
        
        if(sonido) sonid = true;
        else sonid = false;
    }
    public void Etiquetas(){
        if(window) etiWindow.setText("Yes");
        else etiWindow.setText("No");
        
        if(sonid) etiSound.setText("Yes");
        else etiSound.setText("No");
    }
    public void getAndSetConfigs(){
        String Sonido, Ventana;
        Ventana = etiWindow.getText();
        Sonido = etiSound.getText();
        //sonid = false;
        if(Sonido=="No"){ 
        musica.stop();
        Sonido = "false";
        }
        else{
            musica.repetir();
            Sonido = "true";
        }
        if(Ventana=="No"){
            Ventana = "false";
        }
        else{
            Ventana = "true";
        }
        PropStore.windo = Ventana;
        PropStore.sound = Sonido;
        PropStore.firstStore();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JButton bntOK;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel etiSound;
    private javax.swing.JLabel etiWindow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel pAll_Settings;
    private javax.swing.JPanel pCancel;
    private javax.swing.JPanel pCenter;
    private javax.swing.JPanel pDown;
    private javax.swing.JPanel pLeft;
    private javax.swing.JPanel pOK;
    private javax.swing.JPanel pRight;
    private javax.swing.JPanel pTop;
    private javax.swing.JButton sNext;
    private javax.swing.JButton sPrevious;
    private javax.swing.JButton wNext;
    private javax.swing.JButton wPrevious;
    // End of variables declaration//GEN-END:variables
}
