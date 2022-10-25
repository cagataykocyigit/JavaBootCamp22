package kodlama.dataAccess;

import kodlama.entities.Kurs;

public class JdbcKursDao implements KursDao {

	public void add(Kurs kurs) {
		System.out.println("Jdbc ile veritabanýna kaydedildi.\n");
		
	}

}
