package kodlama.dataAccess;

import kodlama.entities.Kurs;

public class HibernateKursDao implements KursDao {

	@Override
	public void add(Kurs kurs) {
		System.out.println("Hibernate ile veritabanýna eklendi.\n");
		
	}
	
	

}
