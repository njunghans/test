/**
 * 
 */
package Hotspot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Gueter;
import model.Schlagwort;

/**
 * @author e0_wiezorek
 * 
 */
public class DBGod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("29.08.2012 - n zu m relationsbeispiel atilla und dominic");
		EntityManager em = emf.createEntityManager();

		// for(int i = 1; i<=5; i++)
		// {
		// EntityManager em =emf.createEntityManager();
		// Gueter gut = new Gueter();
		// gut.setBeschreibung("Hierbei handelt es sich um das Gut mit der Nummer "+i);
		// em.getTransaction().begin();
		// em.persist(gut);
		// em.getTransaction().commit();
		// em.close();
		// }

		// for(int i = 1;i<=20;i++)
		// {
		// EntityManager em =emf.createEntityManager();
		// Schlagwort sw = new Schlagwort();
		// sw.setName("Zufälliges Schlagwort "+i);
		// em.getTransaction().begin();
		// em.persist(sw);
		// em.getTransaction().commit();
		// em.close();
		// }
		
		Schlagwort sw = em.find(Schlagwort.class, 1);
		Gueter gu = new Gueter();
		gu.setBeschreibung("Hier ist es ein großer geek 3");
		//gu=em.find(Gueter.class, 1);
		//sw.setName("105");
		
		em.getTransaction().begin();
		
		sw = em.merge(sw);
		gu =em.merge(gu);
		sw.getGueters().add(gu);
		
		em.getTransaction().commit();
		
		

		/*
		em.getTransaction().begin();
		sw.getGueters().add(gu);
		gu.getSchlagwortes().add(sw);
		em.getTransaction().commit();
		*/
		
		
		//
		// Schlagwort s = em.find(Schlagwort.class, 1);
		// System.out.println("Name:" + s.getName());
		// System.out.println("Beschreibung:"
		// + s.getGueters().get(0).getBeschreibung());
	}
}
