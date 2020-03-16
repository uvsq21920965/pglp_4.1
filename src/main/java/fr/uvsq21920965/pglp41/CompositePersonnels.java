package fr.uvsq21920965.pglp41;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Sarra Belmahdi.
 *
 */
public class CompositePersonnels implements Ipersonnels{
    /**
     * id du groupe de personnels.
     */
	private int id;
	/**
	 * liste des Ipersonnels.
	 */
	private List<Ipersonnels> personnes;
	/**
	 * constructeur.
	 * 
	 * @param idAtt id du groupede personnels.
	 */
	public CompositePersonnels(int idAtt)
	{
		id=idAtt;
		personnes=new ArrayList<Ipersonnels>();
	}
	
	/**
	 * ajouter un personnel.
	 * @param personneAtt  un personnels
	 */
	public void add(Ipersonnels personneAtt) {
		personnes.add(personneAtt);
	}
	/**
	 * supprimer un personnel.
	 * @param personneAtt un personnel.
	 */
	public void remove(Ipersonnels personneAtt){
		if(personnes.contains(personneAtt))
	    personnes.remove(personneAtt);
		else 
			System.out.println("element non trouve");
	}
	public int getId() {
		return id;
	}

	public List<Ipersonnels> getPersonnes() {
		return personnes;
	}
	/**
	 * affiche les cordonnees de tous les personnels du groupe.
	 */
	public String print() {
	 String affiche="";
	 for(Ipersonnels per : personnes) {
		 affiche += " "+per.print();
	}
	 return "id Groupe :"+id+" "+affiche;
	}

	

}
