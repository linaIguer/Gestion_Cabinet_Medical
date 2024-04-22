package cabinet_medical;

public class Fiche_patient {

		    private String nom;
		    private String prenom;
		    private String dateNaissance;
		    private String adresse;
		    private String telephone;
		    private String email;
		    private String numeroSecuriteSociale;
		  

		    public Fiche_patient(String nom, String prenom, String dateNaissance, String adresse, String telephone, String email, String numeroSecuriteSociale, String mutuelle) {
		        this.nom = nom;
		        this.prenom = prenom;
		        this.dateNaissance = dateNaissance;
		        this.adresse = adresse;
		        this.telephone = telephone;
		        this.email = email;
		        this.numeroSecuriteSociale = numeroSecuriteSociale;
		        
		    }

		    // Getters and Setters
		    public String getNom() {
		        return nom;
		    }

		    public void setNom(String nom) {
		        this.nom = nom;
		    }

		    public String getPrenom() {
		        return prenom;
		    }

		    public void setPrenom(String prenom) {
		        this.prenom = prenom;
		    }

		    public String getDateNaissance() {
		        return dateNaissance;
		    }

		    public void setDateNaissance(String dateNaissance) {
		        this.dateNaissance = dateNaissance;
		    }

		    public String getAdresse() {
		        return adresse;
		    }

		    public void setAdresse(String adresse) {
		        this.adresse = adresse;
		    }

		    public String getTelephone() {
		        return telephone;
		    }

		    public void setTelephone(String telephone) {
		        this.telephone = telephone;
		    }

		    public String getEmail() {
		        return email;
		    }

		    public void setEmail(String email) {
		        this.email = email;
		    }

		    public String getNumeroSecuriteSociale() {
		        return numeroSecuriteSociale;
		    }

		    public void setNumeroSecuriteSociale(String numeroSecuriteSociale) {
		        this.numeroSecuriteSociale = numeroSecuriteSociale;
		    }

		  

		    public void Afficher_ficheP() {
		        System.out.println("Nom : " + nom);
		        System.out.println("Prénom : " + prenom);
		        System.out.println("Date de naissance : " + dateNaissance);
		        System.out.println("Adresse : " + adresse);
		        System.out.println("Téléphone : " + telephone);
		        System.out.println("Email : " + email);
		        System.out.println("Numéro de sécurité sociale : " + numeroSecuriteSociale);
		    
		    }
		}

