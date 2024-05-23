
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cabinetmédical;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Connection;

/**
 *
 * @author MSHOME
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form NewJFr
     */
    Connection con;
PreparedStatement pst;
ResultSet rs;
    public Login() {
        initComponents();
    }
public void Connect () throws ClassNotFoundException{
        try {
            Class.forName("org.sqlite.JDBC");
        con = DriverManager.getConnection("jdbc:sqlite:cabinet.db");

        } catch (Exception e){
          e.printStackTrace();
        }
            
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cnt = new javax.swing.JButton();
        frm = new javax.swing.JButton();
        mdpuser = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        nomuser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabinetmédical/imglogin.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 160, 150));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cabinet Médical");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 530, 70));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Nom d'Utilisateur :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 260, 28));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mot de passe:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 230, 28));

        cnt.setBackground(new java.awt.Color(0, 153, 153));
        cnt.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        cnt.setForeground(new java.awt.Color(255, 255, 255));
        cnt.setText("SE CONNECTER");
        cnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cntActionPerformed(evt);
            }
        });
        jPanel1.add(cnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 163, 40));

        frm.setBackground(new java.awt.Color(255, 51, 51));
        frm.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        frm.setForeground(new java.awt.Color(255, 255, 255));
        frm.setText("FERMER");
        frm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmActionPerformed(evt);
            }
        });
        jPanel1.add(frm, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 163, 40));

        mdpuser.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        mdpuser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(mdpuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 389, 42));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabinetmédical/imglogin.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 160, 150));
        jPanel1.add(nomuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 390, 40));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabinetmédical/login1.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 820, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(810, 598));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    

    private void frmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmActionPerformed
       System.exit(0);
       
    }//GEN-LAST:event_frmActionPerformed

    
    
    private void cntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cntActionPerformed
       try {
  // Connexion à la base de données
  Connect();

  // Préparation de la requête SQL pour récupérer les informations de l'utilisateur
  pst = con.prepareStatement("SELECT * FROM utilisateur WHERE nom_utilisateur=? AND mdp=?");
  pst.setString(1, nomuser.getText());
  pst.setString(2, mdpuser.getText());
  rs = pst.executeQuery();

  if (rs.next()) {
    String statut = rs.getString("statut"); // Récupération de la valeur de l'attribut 'statut'

    if (statut.equalsIgnoreCase("secretaire")) {
      // Ouverture de la fenêtre Patient si le statut est secrétaire
      Patient patient = new Patient();
      patient.setVisible(true);
      setVisible(false);
      
    } else if (statut.equalsIgnoreCase("docteur")) {
        
      // Ouverture de la fenêtre MenuPrincipal si le statut est docteur
      MenuPrincipal menuPrincipal = new MenuPrincipal();
      menuPrincipal.setVisible(true);
      setVisible(false);
    } else {
      // Message d'erreur si le statut est invalide
      JOptionPane.showMessageDialog(null, "Statut utilisateur non reconnu.");
    }
  } else {
    // Message d'erreur si les identifiants de connexion sont invalides
    JOptionPane.showMessageDialog(null, "Erreur de connexion.");
   
  }
} catch (Exception e) {
  e.printStackTrace();
}
    }//GEN-LAST:event_cntActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cnt;
    private javax.swing.JButton frm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField mdpuser;
    private javax.swing.JTextField nomuser;
    // End of variables declaration//GEN-END:variables
}
