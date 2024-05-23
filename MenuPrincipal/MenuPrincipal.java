package cabinetmédical;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author MSHOME
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuePrincipale
     */
    public MenuPrincipal() {
        initComponents();
        DateHeure();
    }

   public void DateHeure() {
    Thread tr = new Thread() {
        public void run() {
            for (;;) {
                try {
                    // Partie pour la date 
                    Calendar cal = new GregorianCalendar();
                    int annee = cal.get(Calendar.YEAR);
                    int mois = cal.get(Calendar.MONTH)+1;
                    int jour = cal.get(Calendar.DAY_OF_MONTH);
                    
                    // Partie pour l'heure
                    int heure = cal.get(Calendar.HOUR_OF_DAY)-1;
                    int minute = cal.get(Calendar.MINUTE);
                    int seconde = cal.get(Calendar.SECOND);

                    txtdate.setText("DATE: "+jour + "/" + mois + "/" + annee);
                    txtheure.setText("TIME: " +heure + ":" + minute + ":" + seconde);

                    // Pause d'une seconde entre chaque mise à jour
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    };
    tr.start(); // Démarrer le thread
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtdate = new javax.swing.JLabel();
        txtheure = new javax.swing.JLabel();
        PTN = new javax.swing.JButton();
        RDV = new javax.swing.JButton();
        PTN1 = new javax.swing.JButton();
        PTN2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        quitter = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cabinet Médical");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, 310, 30));

        txtdate.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtdate.setText("Date");
        txtdate.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 138, 33));

        txtheure.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtheure.setText("Heure");
        txtheure.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(txtheure, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 104, 33));

        PTN.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        PTN.setForeground(new java.awt.Color(0, 153, 153));
        PTN.setText("FICHE PATIENT");
        PTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PTNActionPerformed(evt);
            }
        });
        jPanel1.add(PTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 230, 40));

        RDV.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        RDV.setForeground(new java.awt.Color(0, 153, 153));
        RDV.setText(" RENDEZ VOUS");
        RDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDVActionPerformed(evt);
            }
        });
        jPanel1.add(RDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 230, 40));

        PTN1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        PTN1.setForeground(new java.awt.Color(0, 153, 153));
        PTN1.setText("DOSSIER MEDICAL");
        PTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PTN1ActionPerformed(evt);
            }
        });
        jPanel1.add(PTN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 230, 40));

        PTN2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        PTN2.setForeground(new java.awt.Color(0, 153, 153));
        PTN2.setText("CONSULTATION");
        PTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PTN2ActionPerformed(evt);
            }
        });
        jPanel1.add(PTN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 230, 40));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MedCare");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 120, 30));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel4.setText("\" Bienvenue à la plateforme Docteur \"");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 280, 40));

        quitter.setBackground(new java.awt.Color(0, 204, 153));
        quitter.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        quitter.setForeground(new java.awt.Color(255, 255, 255));
        quitter.setText("Quitter");
        quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterActionPerformed(evt);
            }
        });
        jPanel1.add(quitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 470, 100, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabinetmédical/logout.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, 70, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabinetmédical/menu.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(898, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PTN2ActionPerformed
          MenuPrincipal.super.dispose ();
          consultation Ct= new consultation();
          Ct.setVisible(true);
    }//GEN-LAST:event_PTN2ActionPerformed

    private void PTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PTN1ActionPerformed
          MenuPrincipal.super.dispose ();
          DossierMedical D= new DossierMedical();
          D.setVisible(true);
    }//GEN-LAST:event_PTN1ActionPerformed

    private void PTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PTNActionPerformed
      MenuPrincipal.super.dispose ();
      Patient P = new Patient();
     P.setVisible(true);
    }//GEN-LAST:event_PTNActionPerformed

    private void RDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDVActionPerformed
          MenuPrincipal.super.dispose ();
          RendezVous R = new RendezVous();
          R.setVisible(true);
    }//GEN-LAST:event_RDVActionPerformed

    private void quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterActionPerformed
    MenuPrincipal.super.dispose ();
          Login L = new Login();
          L.setVisible(true);
    }//GEN-LAST:event_quitterActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PTN;
    private javax.swing.JButton PTN1;
    private javax.swing.JButton PTN2;
    private javax.swing.JButton RDV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton quitter;
    private javax.swing.JLabel txtdate;
    private javax.swing.JLabel txtheure;
    // End of variables declaration//GEN-END:variables
}
