/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cabinetmédical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author iguer
 */
public class Patient extends javax.swing.JFrame {
    
    Connection con;
    PreparedStatement pst;
    ResultSet res;

    /** Creates new form Patient */
    public Patient() {
        initComponents();
         table();
    }
    
        public void Connect (){ 
        try {
           Class.forName("org.sqlite.JDBC");
        con = DriverManager.getConnection("jdbc:sqlite:cabinet.db");
        }
        catch (Exception e){
          e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        buttonsupprimer = new javax.swing.JButton();
        rdv = new javax.swing.JButton();
        buttonmodifier = new javax.swing.JButton();
        buttonactualiser = new javax.swing.JButton();
        ButtonAjouter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textnom = new javax.swing.JTextField();
        textprenom = new javax.swing.JTextField();
        textadresse = new javax.swing.JTextField();
        texttelephone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textsexe = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel12 = new javax.swing.JLabel();
        textassure = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        textdatenaiss = new javax.swing.JTextField();
        textemail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        buttonsupprimer.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        buttonsupprimer.setForeground(new java.awt.Color(0, 153, 255));
        buttonsupprimer.setText("SUPPRIMER");
        buttonsupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonsupprimerActionPerformed(evt);
            }
        });

        rdv.setBackground(new java.awt.Color(0, 204, 153));
        rdv.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        rdv.setForeground(new java.awt.Color(255, 255, 255));
        rdv.setText("RENDEZ VOUS");
        rdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdvActionPerformed(evt);
            }
        });

        buttonmodifier.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        buttonmodifier.setForeground(new java.awt.Color(0, 153, 255));
        buttonmodifier.setText("MODIFIER");
        buttonmodifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonmodifierActionPerformed(evt);
            }
        });

        buttonactualiser.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        buttonactualiser.setForeground(new java.awt.Color(0, 153, 255));
        buttonactualiser.setText("ACTUALISER");
        buttonactualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonactualiserActionPerformed(evt);
            }
        });

        ButtonAjouter.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        ButtonAjouter.setForeground(new java.awt.Color(0, 153, 255));
        ButtonAjouter.setText("AJOUTER");
        ButtonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAjouterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ButtonAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonmodifier, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonsupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonactualiser, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(rdv, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(ButtonAjouter)
                .addGap(18, 18, 18)
                .addComponent(buttonmodifier)
                .addGap(28, 28, 28)
                .addComponent(buttonsupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(buttonactualiser)
                .addGap(33, 33, 33)
                .addComponent(rdv)
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 260, 350));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FICHE PATIENT");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 153)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 270, 40));

        textnom.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnomActionPerformed(evt);
            }
        });
        jPanel1.add(textnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 150, 30));

        textprenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textprenomActionPerformed(evt);
            }
        });
        jPanel1.add(textprenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 150, 30));

        textadresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textadresseActionPerformed(evt);
            }
        });
        jPanel1.add(textadresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 160, 30));

        texttelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texttelephoneActionPerformed(evt);
            }
        });
        jPanel1.add(texttelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 160, 30));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Nom");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 160, 30));

        textsexe.setEditable(true);
        textsexe.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        textsexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MASCULIN", "FEMININ" }));
        textsexe.setToolTipText("");
        textsexe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textsexeActionPerformed(evt);
            }
        });
        jPanel1.add(textsexe, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 160, 30));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Num de Telephone");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 150, 30));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Prénom");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 150, 30));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Date de Naissance");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 130, 30));

        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Adresse");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 160, 30));
        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, -40, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Sexe");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 160, 30));

        textassure.setEditable(true);
        textassure.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        textassure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OUI", "NON", " " }));
        textassure.setToolTipText("");
        textassure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textassureActionPerformed(evt);
            }
        });
        jPanel1.add(textassure, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 150, 30));

        jLabel16.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Assuré");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 150, 30));

        jLabel17.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Email");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, 150, 30));

        textdatenaiss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textdatenaissActionPerformed(evt);
            }
        });
        jPanel1.add(textdatenaiss, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 150, 30));

        textemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textemailActionPerformed(evt);
            }
        });
        jPanel1.add(textemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, 160, 29));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabinetmédical/fiche3.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 550, 660));

        jTable1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jTable1.setRowHeight(26);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 920, 250));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tableau des Patients");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 153)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 390, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabinetmédical/healthcare.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 410, 300, 290));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabinetmédical/b01.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 1530, 720));

        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 360, 190));

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void textnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textnomActionPerformed

    private void textprenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textprenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textprenomActionPerformed

    private void textadresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textadresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textadresseActionPerformed

    private void texttelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texttelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texttelephoneActionPerformed
    
    
//BOUTTON MENU PRINCIPALE
    private void rdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdvActionPerformed
      Patient.super.dispose ();
      RendezVous r = new RendezVous();
      r.setVisible(true);
    }//GEN-LAST:event_rdvActionPerformed

 //AJOUTER   
    
    private void ButtonAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAjouterActionPerformed
      try{ 
         Connect();
         pst = con.prepareStatement("insert into patient(nom,prenom,datenaiss,assure,telephone,sexe,adresse,mail)" +"values(?,?,?,?,?,?,?,?)");
         
         pst.setString(1,textnom.getText().toUpperCase());
         pst.setString(2,textprenom.getText().toUpperCase());
         pst.setString(3,textdatenaiss.getText().toUpperCase());
         pst.setString(4,textassure.getSelectedItem().toString().toUpperCase());
         pst.setString(5,texttelephone.getText().toUpperCase());
         pst.setString(6,textsexe.getSelectedItem().toString().toUpperCase());
         pst.setString(7,textadresse.getText().toUpperCase());
         pst.setString(8,textemail.getText());
         pst.executeUpdate();
         
         //JOptionPane.showMessageDialog(null," Patient ajouté avec succès");
         table();
         con.close();
      } catch (Exception e) {
          e.printStackTrace();
        //JOptionPane.showMessageDialog(null, "Erreur : Impossible d'ajouter le patient\n" + e.getMessage());
         }
    }//GEN-LAST:event_ButtonAjouterActionPerformed
   
      /**
 * 
 * Handles the action performed when the gender selection changes.
 * 
 * @param evt The action event triggered by the gender selection.
 */

    private void textsexeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textsexeActionPerformed
      
    }//GEN-LAST:event_textsexeActionPerformed

 //ACTUALISER  
    
    private void buttonactualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonactualiserActionPerformed
    
        textnom.setText("");
        textprenom.setText("");
        textdatenaiss.setText("");
        texttelephone.setText("");
        textadresse.setText("");
        textemail.setText("");
        
    }//GEN-LAST:event_buttonactualiserActionPerformed

    
 //MODIFIER
    private void buttonmodifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonmodifierActionPerformed
     
         try{ 
         Connect();
         pst = con.prepareStatement("UPDATE patient set nom=?, prenom=?, datenaiss=?,assure=?, telephone=?,sexe=?,adresse=?, mail=?"
                 + "where idpatient=?");
         int idpatient =jTable1.getSelectedRow();
         String selectionner = (String)jTable1.getValueAt(idpatient,0) ;
         pst.setString(1,textnom.getText().toUpperCase());
         pst.setString(2,textprenom.getText().toUpperCase());
         pst.setString(3,textdatenaiss.getText().toUpperCase());
         pst.setString(4,textassure.getSelectedItem().toString().toUpperCase());
         pst.setString(5,texttelephone.getText().toUpperCase());
         pst.setString(6,textsexe.getSelectedItem().toString().toUpperCase());
         pst.setString(7,textadresse.getText().toUpperCase());
         pst.setString(8,textemail.getText());
         pst.setString(9,selectionner);
         pst.executeUpdate();
         
         //JOptionPane.showMessageDialog(null," Patient modifiés avec succès");
         table();
         con.close();
      } catch (Exception e) {
          e.printStackTrace();
        //JOptionPane.showMessageDialog(null, "Erreur : Impossible de modifier le patient\n" + e.getMessage());
         }
        
    }//GEN-LAST:event_buttonmodifierActionPerformed

  //SELECTIONNER UNE LIGNE DU TABLEAU AVEC LA SOURIS  
    
    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
      int select =jTable1.getSelectedRow();
      //model est la variable de la table
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
     //String select = (String)jTable1.getValueAt(idpatient,0);
      textnom.setText(model.getValueAt(select,1).toString() );
      textprenom.setText(model.getValueAt(select,2).toString() );
      textdatenaiss.setText(model.getValueAt(select,3).toString() );
      textassure.setSelectedItem(model.getValueAt(select,4).toString() );
      texttelephone.setText(model.getValueAt(select,5).toString() );
      textsexe.setSelectedItem(model.getValueAt(select,6).toString() );
      textadresse.setText(model.getValueAt(select,7).toString() );
      textemail.setText(model.getValueAt(select,8).toString() );
      
    }//GEN-LAST:event_jTable1MouseReleased

    private void textassureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textassureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textassureActionPerformed

    private void textdatenaissActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textdatenaissActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textdatenaissActionPerformed

    private void textemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textemailActionPerformed

    private void buttonsupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonsupprimerActionPerformed
        try{
            Connect();
            pst = con.prepareStatement("Delete  from patient where idpatient=?");
            int idpatient =jTable1.getSelectedRow();
            String selectionner = (String)jTable1.getValueAt(idpatient,0) ;
            pst.setString(1,selectionner);
            pst.executeUpdate();
            table();
            con.close();
            //JOptionPane.showMessageDialog(null," Patient supprimé avec succès");
            
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erreur : Impossible de supprimer le patient\n" + e.getMessage());
        }
    }//GEN-LAST:event_buttonsupprimerActionPerformed

    
    //méthode table
      public void table(){
        
        String [] patient ={"ID patient","Nom","Prenom","Date Naissance","Assure","Telephone","Sexe","Adresse","Email"};
              DefaultTableModel model = new DefaultTableModel (patient,0);
              
              
        try { Connect();
         PreparedStatement pst = con.prepareStatement("Select * from patient");
          res = pst.executeQuery();
         while(res.next()){
            Object[] row ={
           res.getString("idpatient"),
           res.getString("nom"),
           res.getString("prenom"),
           res.getString("datenaiss"),
           res.getString("assure"),
           res.getString("telephone"),
           res.getString("sexe"),
           res.getString("adresse"),
           res.getString("mail")
            };
            model.addRow(row); }
         jTable1.setModel(model);
        } catch(Exception e){
            e.printStackTrace();
        }
      }    
      /**
     * @param args the command line arguments
     */
  
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
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAjouter;
    private javax.swing.JButton buttonactualiser;
    private javax.swing.JButton buttonmodifier;
    private javax.swing.JButton buttonsupprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton rdv;
    private javax.swing.JTextField textadresse;
    private javax.swing.JComboBox<String> textassure;
    private javax.swing.JTextField textdatenaiss;
    private javax.swing.JTextField textemail;
    private javax.swing.JTextField textnom;
    private javax.swing.JTextField textprenom;
    private javax.swing.JComboBox<String> textsexe;
    private javax.swing.JTextField texttelephone;
    // End of variables declaration//GEN-END:variables

}
