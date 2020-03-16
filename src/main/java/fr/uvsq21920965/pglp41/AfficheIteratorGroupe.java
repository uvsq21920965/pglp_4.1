package fr.uvsq21920965.pglp41;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe Personnels.
 * 
 * @author sarra Belmahdi.
 *
 */
public class AfficheIteratorGroupe {

	private List<Ipersonnels> personnes;
	public AfficheIteratorGroupe(Ipersonnels root){
		personnes = new ArrayList<Ipersonnels>();
	    personnes.add(root);
	}

	 public Iterator getIterator() {
		 return new IpersonnelsIteratorGroupe(); 
	 }

	private class IpersonnelsIteratorGroupe implements Iterator{
		IpersonnelsIteratorGroupe(){
		 int verifie=0;
		 while(verifie<personnes.size()) {
		 if(personnes.get(verifie) instanceof CompositePersonnels) {
		    personnes.add((Ipersonnels) ((CompositePersonnels)personnes.get(verifie)).getPersonnes());
		 }
		 verifie ++;
		 }
		}

		int index=0;
		public Boolean hasNext() {
			if(index<personnes.size()) {
				return true;	
			}
			return false;
		}

		public Ipersonnels next() {
			if(this.hasNext()) {
				return personnes.get(index++);
			}
			return null;
		}
	}

}
