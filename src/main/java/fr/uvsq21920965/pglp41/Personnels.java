package fr.uvsq21920965.pglp41;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 *  Classe Personnels.
 * @author sarra Belmahdi.
 *
 */
public final class Personnels implements Ipersonnels{
/**
 * nom du personnels.
 */
private  String nom;
/**
 *prenom de personnels.
 */
private  String prenom;
/**
 * fonctions de personnels.
 */
private  String fonctions;
/**
 *date de naissance de personnels.
 */
private  LocalDate dateDeNaiss;
/**
 * numero de telephone
 */
private  List<Integer> numeroDeTel;
/**
 * 
 * @author sarra belmahdi.
 *
 */

public static class Builder {
    /**
     * nom de personnel.
     */
	private  String nom;
	/**
	 * prenom de personnel.
	 */
	private  String prenom;
	/**
	 * fonction de personnel.
	 */
	private  String fonctions;
	/**
	 * date de naissance de personnel.
	 */
	private  LocalDate dateDeNaiss=null;
	/**
	 * numero de telephone de personnel.
	 */
	private  List<Integer> numeroDeTel=new ArrayList<Integer>();
	
	/**
	 * initialiser les attributs.
	 * @param nom nom du personnel.
	 * @param prenom prenom dupersonnel.
	 * @param fonctions fonction de personnel.
	 */
	public Builder(String nom, String prenom, String fonctions) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.fonctions = fonctions;
	}

    /**
     * intialiser date de naissance.
     * @param dateDeNaissAtt.
     * @return date de naissance initialise.
     */
	public Builder dateNaissance(LocalDate dateDeNaissAtt) {
		this.dateDeNaiss= dateDeNaissAtt;
		return (this);
	}

	/**
	 * initialiser laliste de numero de telephone.
	 * @param numeroDeTelAtt
	 * @return la  liste du numero initialisee.
	 */
	public Builder numeroDeTel(List<Integer> numeroDeTelAtt) {
		this.numeroDeTel=numeroDeTelAtt;
		return (this);
	}
	/**
	 * methode pour creer l'objet personnel.
	 * @returnnew objet personnel.
	 */
	public Personnels build() {
		return new Personnels(this);
	}
}
    /**
     * constructeur.
     * @param build pour initialser les valeurs du constructeur.
     */
	private Personnels(Builder build) {
		nom = build.nom;
		prenom = build.prenom;
		fonctions = build.fonctions;
		dateDeNaiss = build.dateDeNaiss;
		numeroDeTel = build.numeroDeTel;
	
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}

	public String getFonctions() {
		return fonctions;
	}

	public LocalDate getDateDeNaiss() {
		return dateDeNaiss;
	}

	public List<Integer> getNumeroDeTel() {
		return numeroDeTel;
	}
	
	/**
	 * methode print les cordonnees du personnel.
	 */
	public String print() {
	 String numtel="";
	 for(int num:this.numeroDeTel) {
		 numtel+=num;
	 }
	 return "nom : "+this.nom+" "+"prenom : "+this.prenom+" "+"fonctions:"+this.fonctions
			 +" "+"dateDeNaiss :"+this.dateDeNaiss+" "+"numero de telephone"+numtel;
		
	}


}
