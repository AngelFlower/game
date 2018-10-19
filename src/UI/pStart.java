/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import static UI.main.paneMain;
import java.awt.GridLayout;
import javax.swing.SwingUtilities;

/**
 *
 * @author Angel Flores
 */
public class  pStart extends javax.swing.JPanel {

    /**
     * Creates new form pStart
     */
    public pStart() {
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

        pAll_Start = new javax.swing.JPanel();
        CENTER = new javax.swing.JPanel();
        pTitle = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        pSubtitle = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pButtons = new javax.swing.JPanel();
        pGird = new javax.swing.JPanel();
        pStart = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        pSettings = new javax.swing.JPanel();
        btnSettings = new javax.swing.JButton();
        pInfo = new javax.swing.JPanel();
        btnInfo = new javax.swing.JButton();
        pExit = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        TOP = new javax.swing.JPanel();
        DOWN = new javax.swing.JPanel();
        RIGHT = new javax.swing.JPanel();
        LEFT = new javax.swing.JPanel();

        setLayout(new java.awt.GridLayout(1, 0));

        pAll_Start.setLayout(new java.awt.BorderLayout());

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

        pGird.setLayout(new java.awt.GridLayout(4, 3));

        pStart.setLayout(new java.awt.GridBagLayout());

        btnStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnPlay.png"))); // NOI18N
        btnStart.setContentAreaFilled(false);
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        pStart.add(btnStart, new java.awt.GridBagConstraints());

        pGird.add(pStart);

        pSettings.setLayout(new java.awt.GridBagLayout());

        btnSettings.setText("Settings");
        btnSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 192, 11, 192);
        pSettings.add(btnSettings, gridBagConstraints);

        pGird.add(pSettings);

        pInfo.setLayout(new java.awt.GridBagLayout());

        btnInfo.setText("Info");
        pInfo.add(btnInfo, new java.awt.GridBagConstraints());

        pGird.add(pInfo);

        pExit.setLayout(new java.awt.GridBagLayout());

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        pExit.add(btnExit, new java.awt.GridBagConstraints());

        pGird.add(pExit);

        pButtons.add(pGird);

        CENTER.add(pButtons);

        pAll_Start.add(CENTER, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout TOPLayout = new javax.swing.GroupLayout(TOP);
        TOP.setLayout(TOPLayout);
        TOPLayout.setHorizontalGroup(
            TOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 761, Short.MAX_VALUE)
        );
        TOPLayout.setVerticalGroup(
            TOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        pAll_Start.add(TOP, java.awt.BorderLayout.NORTH);

        javax.swing.GroupLayout DOWNLayout = new javax.swing.GroupLayout(DOWN);
        DOWN.setLayout(DOWNLayout);
        DOWNLayout.setHorizontalGroup(
            DOWNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 761, Short.MAX_VALUE)
        );
        DOWNLayout.setVerticalGroup(
            DOWNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        pAll_Start.add(DOWN, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout RIGHTLayout = new javax.swing.GroupLayout(RIGHT);
        RIGHT.setLayout(RIGHTLayout);
        RIGHTLayout.setHorizontalGroup(
            RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );
        RIGHTLayout.setVerticalGroup(
            RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 722, Short.MAX_VALUE)
        );

        pAll_Start.add(RIGHT, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout LEFTLayout = new javax.swing.GroupLayout(LEFT);
        LEFT.setLayout(LEFTLayout);
        LEFTLayout.setHorizontalGroup(
            LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );
        LEFTLayout.setVerticalGroup(
            LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 722, Short.MAX_VALUE)
        );

        pAll_Start.add(LEFT, java.awt.BorderLayout.LINE_START);

        add(pAll_Start);
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        pLevel level = new pLevel();
        level.setLocation(0, 0);
        paneMain.removeAll();
        paneMain.add(level,GridLayout.class);
        paneMain.revalidate();
        paneMain.repaint();
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingsActionPerformed
        pSettings settings = new pSettings();
        settings.setLocation(0, 0);
        paneMain.removeAll();
        paneMain.add(settings,GridLayout.class);
        paneMain.revalidate();
        paneMain.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_btnSettingsActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CENTER;
    private javax.swing.JPanel DOWN;
    private javax.swing.JPanel LEFT;
    private javax.swing.JPanel RIGHT;
    private javax.swing.JPanel TOP;
    private javax.swing.JLabel Title;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnSettings;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pAll_Start;
    private javax.swing.JPanel pButtons;
    private javax.swing.JPanel pExit;
    private javax.swing.JPanel pGird;
    private javax.swing.JPanel pInfo;
    private javax.swing.JPanel pSettings;
    private javax.swing.JPanel pStart;
    private javax.swing.JPanel pSubtitle;
    private javax.swing.JPanel pTitle;
    // End of variables declaration//GEN-END:variables
}
