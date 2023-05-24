package util;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AdminSesstion {
	
		private static SessionFactory factory;
		public static SessionFactory getsessionfactory()
		{
			
			if(factory==null)
			{
				return new Configuration().configure("hibaranate.conf.xml").buildSessionFactory();
			}
			return factory;
			
		}
		
}



