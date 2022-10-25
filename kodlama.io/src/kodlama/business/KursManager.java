package kodlama.business;

import java.lang.System.Logger;

import kodlama.dataAccess.KursDao;
import kodlama.entities.Kurs;

public class KursManager {
	
	private Logger logger;
	private KursDao kursDao;
	
	public KursManager(KursDao kursDao,Logger logger) {
		this.kursDao = kursDao;
		this.logger = logger;
	}
	
	public void add(Kurs kurs) {
		Logger logger;
		//kursu eklemek için gerekli koþullar
		kursDao.add(kurs);
		
		logger.log
		
		
	}
	
	
	

}
