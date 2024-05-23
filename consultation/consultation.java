/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cabinetmédical;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author MSHOME
 */
public class consultation extends javax.swing.JFrame {
 Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public consultation() {
        initComponents();
    }
        public void Connect (){
        try {
            Class.forName("org.sqlite.JDBC");
        con = (Connection) DriverManager.getConnection("jdbc:sqlite:cabinet.db");

        } catch (Exception e){
          e.printStackTrace();
        }
            
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        frais = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        motif = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        OUI = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        obsmed = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        obschir = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        non1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        PRENOM = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        NOM = new javax.swing.JTextField();
        enregistrer = new javax.swing.JButton();
        actualiser = new javax.swing.JButton();
        certificat = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setText("Frais de la consultation :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 260, 40));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 310, 40));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setText("Date de la consultation :");
        jLabel2.setAutoscrolls(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 260, 40));

        frais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fraisActionPerformed(evt);
            }
        });
        jPanel1.add(frais, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 300, 40));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel3.setText("Voulez_vouez ajouter un ordonnance ?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 420, -1));

        motif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motifActionPerformed(evt);
            }
        });
        jPanel1.add(motif, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 910, 57));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel4.setText("Motif de la consultation :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 400, 36));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel5.setText("Observation Chirurgical :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 310, 36));

        OUI.setBackground(new java.awt.Color(0, 153, 51));
        OUI.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        OUI.setForeground(new java.awt.Color(255, 255, 255));
        OUI.setText("OUI");
        OUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OUIActionPerformed(evt);
            }
        });
        jPanel1.add(OUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 70, -1));

        obsmed.setColumns(20);
        obsmed.setRows(5);
        jScrollPane2.setViewportView(obsmed);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 420, 100));

        obschir.setColumns(20);
        obschir.setRows(5);
        jScrollPane3.setViewportView(obschir);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 420, 100));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel8.setText("Observation Médical :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 310, 36));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 204, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Consultation Médical ");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 204, 255)));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 370, 50));

        non1.setBackground(new java.awt.Color(204, 0, 51));
        non1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        non1.setForeground(new java.awt.Color(255, 255, 255));
        non1.setText("NON");
        non1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                non1ActionPerformed(evt);
            }
        });
        jPanel1.add(non1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabinetmédical/consultation.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 940, 510));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Nom Patient:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 168, 40));

        PRENOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRENOMActionPerformed(evt);
            }
        });
        jPanel2.add(PRENOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 200, 40));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel11.setText("Prénom Patient :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 168, 30));

        NOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMActionPerformed(evt);
            }
        });
        jPanel2.add(NOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 200, 37));

        enregistrer.setBackground(new java.awt.Color(153, 204, 255));
        enregistrer.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        enregistrer.setForeground(new java.awt.Color(255, 255, 255));
        enregistrer.setText("ENREGISTRER");
        enregistrer.setToolTipText("");
        enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistrerActionPerformed(evt);
            }
        });
        jPanel2.add(enregistrer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 190, 40));

        actualiser.setBackground(new java.awt.Color(153, 204, 255));
        actualiser.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        actualiser.setForeground(new java.awt.Color(255, 255, 255));
        actualiser.setText("ACTUALISER");
        actualiser.setToolTipText("");
        actualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualiserActionPerformed(evt);
            }
        });
        jPanel2.add(actualiser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 140, 40));

        certificat.setBackground(new java.awt.Color(0, 153, 51));
        certificat.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        certificat.setForeground(new java.awt.Color(255, 255, 255));
        certificat.setText("Certificat Médical");
        certificat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                certificatActionPerformed(evt);
            }
        });
        jPanel2.add(certificat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 220, 40));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel7.setText("Vouler vous un Certificat  ?");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 250, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void motifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_motifActionPerformed

    
    
    
    
    private void enregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistrerActionPerformed
    try{
    Connect();

    // Préparer la première requête pour récupérer l'id du patient
    pst = con.prepareStatement("select idpatient from patient where nom = ? and prenom = ?");
    pst.setString(1, NOM.getText().toUpperCase());
    pst.setString(2, PRENOM.getText().toUpperCase());

    // Exécuter la requête et récupérer l'id du patient
    rs = pst.executeQuery();
    int idPatient=0;
    if (rs.next()) {
        idPatient = rs.getInt("idpatient");
    } else {
        throw new Exception("Patient non trouvé");
    }

    // Fermer le ResultSet et le PreparedStatement
    rs.close();
    pst.close();

    // Préparer la deuxième requête pour insérer les informations de médicament
    pst = con.prepareStatement("insert into consultation(idpatient,frais_cons,motif_cons,obs_medical,obs_chirurgical ) values(?, ?, ?, ?,?)");
    int fraisVal = Integer.parseInt(frais.getText());
    
    pst.setInt(1, idPatient);
    pst.setInt(2,fraisVal);
    pst.setString(3,motif.getText().toUpperCase());
    pst.setString(4,obsmed.getText().toUpperCase());
    pst.setString(5,obschir.getText().toUpperCase());
    // Exécuter la requête d'insertion
    pst.executeUpdate();

    // Fermer le PreparedStatement et la connexion
    pst.close();
    con.close();
    }catch (Exception e){
    e.printStackTrace();
       }
    }//GEN-LAST:event_enregistrerActionPerformed

    private void OUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OUIActionPerformed
          consultation.super.dispose ();
          Ordonnance O = new Ordonnance();
          O.setVisible(true);
    }//GEN-LAST:event_OUIActionPerformed

    private void fraisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fraisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fraisActionPerformed

    private void non1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_non1ActionPerformed
          consultation.super.dispose ();
          MenuPrincipal M = new MenuPrincipal ();
          M.setVisible(true);
    }//GEN-LAST:event_non1ActionPerformed

    private void PRENOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRENOMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PRENOMActionPerformed

    private void NOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOMActionPerformed

    private void actualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualiserActionPerformed
        date.setText("");
        NOM.setText("");
        PRENOM.setText("");
        motif.setText("");
        frais.setText("");
        obsmed.setText("");
        obschir.setText("");
    }//GEN-LAST:event_actualiserActionPerformed

    private void certificatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_certificatActionPerformed
         consultation.super.dispose ();
          CertificatMedical D= new CertificatMedical();
          D.setVisible(true);
    }//GEN-LAST:event_certificatActionPerformed

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
            java.util.logging.Logger.getLogger(consultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consultation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NOM;
    private javax.swing.JButton OUI;
    private javax.swing.JTextField PRENOM;
    private javax.swing.JButton actualiser;
    private javax.swing.JButton certificat;
    private javax.swing.JTextField date;
    private javax.swing.JButton enregistrer;
    private javax.swing.JTextField frais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField motif;
    private javax.swing.JButton non1;
    private javax.swing.JTextArea obschir;
    private javax.swing.JTextArea obsmed;
    // End of variables declaration//GEN-END:variables
}
