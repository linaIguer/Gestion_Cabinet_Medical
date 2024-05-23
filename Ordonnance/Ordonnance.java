/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cabinetmédical;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.Period;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
/**
 *
 * @author MSHOME
 */
public class Ordonnance extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public Ordonnance() {
        initComponents();
        
        txtprenom.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(FocusEvent e) {
                if (!txtnom.getText().isEmpty() && !txtprenom.getText().isEmpty()) {
                    calculateAge();
                }
            }

            @Override
            public void focusGained(FocusEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });  
      
    }
    public void Connect (){
        try {
            Class.forName("org.sqlite.JDBC");
        con = (Connection) DriverManager.getConnection("jdbc:sqlite:cabinet.db");

        } catch (Exception e){
          e.printStackTrace();
        }
            
       }
   
      public void calculateAge() {
        try {
            Connect();

            // Prepare a single PreparedStatement for efficiency (reuse)
            pst = con.prepareStatement("SELECT idpatient, datenaiss FROM patient WHERE nom = ? AND prenom = ?");

            // Set parameters and execute for patient retrieval
            pst.setString(1, txtnom.getText().toUpperCase());
            pst.setString(2, txtprenom.getText().toUpperCase());
            rs = pst.executeQuery();

            if (rs.next()) {
                int idPatient = rs.getInt("idpatient");
                LocalDate dateOfBirth = rs.getDate("datenaiss").toLocalDate();

                // Calculate age using LocalDate API
                LocalDate today = LocalDate.now();
                Period agePeriod = Period.between(dateOfBirth, today);
                int ageInYears = agePeriod.getYears();

                // Display calculated age
                txtage.setText(String.valueOf(ageInYears));
            } else {
                // Handle case where patient is not found
                txtage.setText("Patient non trouvé.");
            }

            // Close resources efficiently 
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            txtage.setText("Une erreur est survenue."); // Inform user about a general error
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        txtprenom = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        retour = new javax.swing.JButton();
        act = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtmedicament = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdosage = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtperiode = new javax.swing.JTextArea();
        enregistrer = new javax.swing.JButton();
        IMPRIM = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 255, 153));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel1.setText("DATE :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 110, 20));

        txtnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomActionPerformed(evt);
            }
        });
        jPanel1.add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 110, -1));
        jPanel1.add(txtprenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 110, -1));

        txtage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtageActionPerformed(evt);
            }
        });
        jPanel1.add(txtage, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 110, -1));
        jPanel1.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 110, -1));

        jLabel2.setBackground(new java.awt.Color(102, 255, 153));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel2.setText("NOM PATIENT : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 100, 20));

        jLabel3.setBackground(new java.awt.Color(102, 255, 153));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel3.setText("PRENOM PATIENT : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 110, 20));

        jLabel6.setBackground(new java.awt.Color(102, 255, 153));
        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel6.setText("AGE :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 110, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 6, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 102));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabinetmédical/Logo1min.png"))); // NOI18N
        jLabel4.setText("MEDCARE");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 170, 58));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 180, 60));

        retour.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        retour.setForeground(new java.awt.Color(0, 153, 153));
        retour.setText("RETOUR");
        retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourActionPerformed(evt);
            }
        });
        jPanel1.add(retour, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 130, 30));

        act.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        act.setForeground(new java.awt.Color(0, 153, 153));
        act.setText("ACTUALISER");
        act.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actActionPerformed(evt);
            }
        });
        jPanel1.add(act, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, 130, 30));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel7.setText("Période :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 110, 30));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel8.setText("Médicament :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 110, -1));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel9.setText("Dosage :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 110, -1));

        txtmedicament.setColumns(20);
        txtmedicament.setRows(5);
        jScrollPane1.setViewportView(txtmedicament);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 330, 80));

        txtdosage.setColumns(20);
        txtdosage.setRows(5);
        jScrollPane2.setViewportView(txtdosage);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 330, 70));

        txtperiode.setColumns(20);
        txtperiode.setRows(5);
        jScrollPane3.setViewportView(txtperiode);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 330, 70));

        enregistrer.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        enregistrer.setForeground(new java.awt.Color(0, 153, 153));
        enregistrer.setText("ENREGISTRER");
        enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistrerActionPerformed(evt);
            }
        });
        jPanel1.add(enregistrer, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, -1, 30));

        IMPRIM.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        IMPRIM.setForeground(new java.awt.Color(0, 153, 153));
        IMPRIM.setText("IMPRIMER");
        IMPRIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMPRIMActionPerformed(evt);
            }
        });
        jPanel1.add(IMPRIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, 120, 30));

        menu.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        menu.setForeground(new java.awt.Color(0, 153, 153));
        menu.setText("MENU PRINCIPAL");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 170, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabinetmédical/Ordonnance.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 960, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    
    
    private void actActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actActionPerformed
       txtperiode.setText("");
       txtmedicament.setText("");
       txtdosage.setText("");
    }//GEN-LAST:event_actActionPerformed

    
    
    private void txtnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomActionPerformed

    
 //BOUTTON ENREGISTRER
    
    private void enregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistrerActionPerformed
try{
Connect();

    // Préparer la première requête pour récupérer l'id du patient
    pst = con.prepareStatement("select idpatient from patient where nom = ? and prenom = ?");
    pst.setString(1, txtnom.getText().toUpperCase());
    pst.setString(2, txtprenom.getText().toUpperCase());

    // Exécuter la requête et récupérer l'id du patient
     rs = pst.executeQuery();
    int idPatient = 0;
    if (rs.next()) {
        idPatient = rs.getInt("idpatient");
    } else {
        throw new Exception("Patient non trouvé");
    }

    // Fermer le ResultSet et le PreparedStatement
    rs.close();
    pst.close();

    // Préparer la deuxième requête pour insérer les informations de médicament
    pst = con.prepareStatement("insert into ordonnance(idpatient, medicaments, dosages, periode) values(?, ?, ?, ?)");
    pst.setInt(1, idPatient);
    pst.setString(2, txtmedicament.getText().toUpperCase());
    pst.setString(3, txtdosage.getText().toUpperCase());
    pst.setString(4, txtperiode.getText().toUpperCase());

    // Exécuter la requête d'insertion
    pst.executeUpdate();

    // Fermer le PreparedStatement et la connexion
    pst.close();
    con.close();} catch (Exception ex){
    ex.printStackTrace();
}
    }//GEN-LAST:event_enregistrerActionPerformed

    
    
    private void IMPRIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMPRIMActionPerformed
       
PrinterJob job = PrinterJob.getPrinterJob();
            job.setJobName("Print Data");
            
            job.setPrintable(new Printable(){
            public int print(Graphics pg,PageFormat pf, int pageNum){
                    pf.setOrientation(PageFormat.LANDSCAPE);
                 if(pageNum > 0){
                    return Printable.NO_SUCH_PAGE;
                }
                
                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.47,0.47);
                
                jPanel1.print(g2);
         
               
                return Printable.PAGE_EXISTS;
                         
                
            }
    });
            boolean ok = job.printDialog();
        if(ok){
        try {
    // Imprimer le document
    job.print();
} catch (Exception ex){
    ex.printStackTrace();
}
        }
    }//GEN-LAST:event_IMPRIMActionPerformed

    private void txtageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtageActionPerformed

    }//GEN-LAST:event_txtageActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
          Ordonnance.super.dispose ();
          MenuPrincipal M = new MenuPrincipal ();
          M.setVisible(true);
    }//GEN-LAST:event_menuActionPerformed

    //BOUTTON RETOUR à LA CONSULTATION
    
    private void retourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourActionPerformed
          Ordonnance.super.dispose ();
          consultation c = new consultation ();
         c.setVisible(true);
    }//GEN-LAST:event_retourActionPerformed

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
            java.util.logging.Logger.getLogger(Ordonnance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ordonnance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ordonnance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ordonnance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ordonnance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IMPRIM;
    private javax.swing.JButton act;
    private javax.swing.JButton enregistrer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton menu;
    private javax.swing.JButton retour;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextArea txtdosage;
    private javax.swing.JTextArea txtmedicament;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextArea txtperiode;
    private javax.swing.JTextField txtprenom;
    // End of variables declaration//GEN-END:variables

}
