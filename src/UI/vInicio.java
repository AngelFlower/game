/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

/**
 *
 * @author Angel Flores
 */
public class vInicio extends javax.swing.JFrame {    /**
     *
     */
    public static int a,h;
    /**
     * Creates new form VInicio
     */
    public vInicio() {
        Display();
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

        Contenedor_Inicio = new javax.swing.JPanel();
        CENTER = new javax.swing.JPanel();
        pTitle = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        pSubtitle = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pButtons = new javax.swing.JPanel();
        pGird = new javax.swing.JPanel();
        top = new javax.swing.JPanel();
        pStart = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        pInfo = new javax.swing.JPanel();
        btnInfo = new javax.swing.JButton();
        pExit = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        TOP = new javax.swing.JPanel();
        DOWN = new javax.swing.JPanel();
        RIGHT = new javax.swing.JPanel();
        LEFT = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout());

        Contenedor_Inicio.setLayout(new java.awt.BorderLayout());

        CENTER.setLayout(new java.awt.GridLayout(3, 0));

        pTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pTitle.setLayout(new java.awt.GridBagLayout());

        Title.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        Title.setText("Title");
        pTitle.add(Title, new java.awt.GridBagConstraints());

        CENTER.add(pTitle);

        pSubtitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pSubtitle.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel2.setText("SubTitle");
        pSubtitle.add(jLabel2, new java.awt.GridBagConstraints());

        CENTER.add(pSubtitle);

        pButtons.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pButtons.setLayout(new java.awt.GridLayout(1, 3));

        pGird.setLayout(new java.awt.GridLayout(5, 3));

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        pGird.add(top);

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        pStart.add(btnStart);

        pGird.add(pStart);

        pInfo.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        btnInfo.setText("Info");
        pInfo.add(btnInfo);

        pGird.add(pInfo);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        pExit.add(btnExit);

        pGird.add(pExit);

        pButtons.add(pGird);

        CENTER.add(pButtons);

        Contenedor_Inicio.add(CENTER, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout TOPLayout = new javax.swing.GroupLayout(TOP);
        TOP.setLayout(TOPLayout);
        TOPLayout.setHorizontalGroup(
            TOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );
        TOPLayout.setVerticalGroup(
            TOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Contenedor_Inicio.add(TOP, java.awt.BorderLayout.NORTH);

        javax.swing.GroupLayout DOWNLayout = new javax.swing.GroupLayout(DOWN);
        DOWN.setLayout(DOWNLayout);
        DOWNLayout.setHorizontalGroup(
            DOWNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DOWNLayout.setVerticalGroup(
            DOWNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Contenedor_Inicio.add(DOWN, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout RIGHTLayout = new javax.swing.GroupLayout(RIGHT);
        RIGHT.setLayout(RIGHTLayout);
        RIGHTLayout.setHorizontalGroup(
            RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );
        RIGHTLayout.setVerticalGroup(
            RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );

        Contenedor_Inicio.add(RIGHT, java.awt.BorderLayout.EAST);

        javax.swing.GroupLayout LEFTLayout = new javax.swing.GroupLayout(LEFT);
        LEFT.setLayout(LEFTLayout);
        LEFTLayout.setHorizontalGroup(
            LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );
        LEFTLayout.setVerticalGroup(
            LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );

        Contenedor_Inicio.add(LEFT, java.awt.BorderLayout.LINE_START);

        getContentPane().add(Contenedor_Inicio);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    }//GEN-LAST:event_formKeyPressed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        vNivel abrir = new vNivel();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vInicio().setVisible(true);
            }
        });
    }
    public void Display(){
        //Toolkit tk = Toolkit.getDefaultToolkit();
        //Dimension d= tk.getScreenSize();
        this.setUndecorated(rootPaneCheckingEnabled);
        //this.setSize(d);
        this.setExtendedState(MAXIMIZED_BOTH);
        //a= (int)d.getWidth();
        //h= (int)d.getHeight();
        System.out.println(" "+a+" "+h);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CENTER;
    private javax.swing.JPanel Contenedor_Inicio;
    private javax.swing.JPanel DOWN;
    private javax.swing.JPanel LEFT;
    private javax.swing.JPanel RIGHT;
    private javax.swing.JPanel TOP;
    private javax.swing.JLabel Title;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pButtons;
    private javax.swing.JPanel pExit;
    private javax.swing.JPanel pGird;
    private javax.swing.JPanel pInfo;
    private javax.swing.JPanel pStart;
    private javax.swing.JPanel pSubtitle;
    private javax.swing.JPanel pTitle;
    private javax.swing.JPanel top;
    // End of variables declaration//GEN-END:variables

}

