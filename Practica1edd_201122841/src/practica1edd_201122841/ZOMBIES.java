package practica1edd_201122841;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Any
 */
public class ZOMBIES extends javax.swing.JFrame {

    /**
     * Creates new form ZOMBIES
     */
//static  ListaNodo usuario = new ListaNodo();

    public ZOMBIES() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NombreZombie = new javax.swing.JTextField();
        CantidadZombie = new javax.swing.JTextField();
        AceptarZombies = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Zombies");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Agregar mas campos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cantidad");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));
        getContentPane().add(NombreZombie, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 170, -1));

        CantidadZombie.setToolTipText("");
        getContentPane().add(CantidadZombie, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 80, -1));

        AceptarZombies.setForeground(new java.awt.Color(0, 102, 102));
        AceptarZombies.setText("Crear Usuario");
        AceptarZombies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarZombiesActionPerformed(evt);
            }
        });
        getContentPane().add(AceptarZombies, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 150, -1));

        jButton2.setText("FINALIZAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/zombies.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        OTROS_CAMPOS campozombie = new OTROS_CAMPOS();
        campozombie.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AceptarZombiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarZombiesActionPerformed
        // TODO add your handling code here:
    
        if (TABLERO.usuarios.Contador() == 0) {
           TABLERO.usuarios.addInicio(new NodoUsuarios(NombreZombie.getText(), Integer.parseInt(CantidadZombie.getText())));
            System.out.println("Mostrando usuario Zombie");
            TABLERO.usuarios.Mostrar();
        } else if (TABLERO.usuarios.Contador() == 1) {
            TABLERO.usuarios.addInicio(new NodoUsuarios(NombreZombie.getText(), Integer.parseInt(CantidadZombie.getText())));
            System.out.println("Mostrando usuario Zombie");
            TABLERO.usuarios.Mostrar();
        } else {

            System.out.println("Error verifique que no tengas mas usuarios,sino llame al administrador del juego");
        }
         AceptarZombies.setEnabled(false);
        jButton1.setEnabled(true);
//        PRINCIPAL.Zombie=true;
//        
//        ((HiloCatalogo) new HiloCatalogo()).start();
//        this.dispose();

    }//GEN-LAST:event_AceptarZombiesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        AceptarZombies.setEnabled(true);
        jButton1.setEnabled(false);
        
        PRINCIPAL.Zombie=true;
        
        ((HiloCatalogo) new HiloCatalogo()).start();
        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ZOMBIES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ZOMBIES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ZOMBIES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ZOMBIES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZOMBIES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarZombies;
    private javax.swing.JTextField CantidadZombie;
    private javax.swing.JTextField NombreZombie;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
 public void limpiarUsuarios() {
         Nodo aux = TABLERO.usuarios.primero;
        while (aux != null) {
            TABLERO.usuarios.getPrimero();
            aux = aux.siguiente;
        }
    }
}
