/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Herramientas.Config;
import Herramientas.PropStore;
import Herramientas.Sound;
import java.awt.Dimension;
//import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Angel Flores
 */
public class main extends javax.swing.JFrame {
    public static Sound musica = new Sound("/Sonidos/musica.wav");
    /**
     * Creates new form Main
     */
    public main() { 
        Image icon = new ImageIcon(getClass().getResource("/img/icon.png")).getImage();
        setIconImage(icon);
        Configuraciones();
        initComponents();
       
        Win();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneMain = new javax.swing.JPanel();
        pStart1 = new UI.pStart();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Soul Dead");
        setMinimumSize(new java.awt.Dimension(819, 619));
        setPreferredSize(preferredSize());
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        paneMain.setMinimumSize(new java.awt.Dimension(0, 0));
        paneMain.setLayout(new java.awt.GridLayout(1, 0));

        pStart1.setMinimumSize(null);
        pStart1.setPreferredSize(null);
        paneMain.add(pStart1);

        getContentPane().add(paneMain);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void Configuraciones(){
        this.setTitle("");
        //Toolkit tk = Toolkit.getDefaultToolkit();
        //Dimension d= tk.getScreenSize();
        //this.setSize(d);
        Config cfg = new Config();
        boolean fullscreen = Boolean.parseBoolean(cfg.getProperty("fullscreen"));
        boolean sonido = Boolean.parseBoolean(cfg.getProperty("sound"));
        System.out.println(fullscreen);
        if(fullscreen){
            //this.setExtendedState(MAXIMIZED_BOTH);
            //this.setUndecorated(rootPaneCheckingEnabled);
            try {
            System.out.println("Full"+fullscreen);
            
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice[] devices = ge.getScreenDevices();
            this.setUndecorated(rootPaneCheckingEnabled);
            devices[0].setFullScreenWindow(this);
            this.revalidate();
            Dimension size = this.getSize();
                System.out.println(""+size);
                
            this.setPreferredSize(size);
            
            //setEnabled(false);
            //setResizable(false);
            //setVisible(true);
            System.out.println("Llega");
            } catch (HeadlessException e) {
                //;
               // this.setExtendedState(MAXIMIZED_BOTH);
                //this.setUndecorated(rootPaneCheckingEnabled);
            }
        }
        else{
            this.setSize(new Dimension(819,619));
        }
        if(sonido) musica.repetir();
    }
    
    public void Win(){
        Config cfg = new Config();
        boolean fullscreen = Boolean.parseBoolean(cfg.getProperty("fullscreen"));
        if(!fullscreen){
            this.setLocationRelativeTo(null);
        }
    }
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 PropStore props = new PropStore();
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private UI.pStart pStart1;
    public static javax.swing.JPanel paneMain;
    // End of variables declaration//GEN-END:variables
}
