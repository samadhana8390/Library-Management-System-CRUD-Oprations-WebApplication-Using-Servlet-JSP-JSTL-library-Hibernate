package dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import model.Librarian;
import util.AdminSesstion;

public class LibrariandaoImp implements Librariandao{

	@Override
	public Librarian savedata(Librarian lib) 
	{
		
		SessionFactory factory=AdminSesstion.getsessionfactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(lib);
		tx.commit();
		session.close();
		
		return lib;
	}

	@Override
	public List<Librarian> readdata() {
		
	SessionFactory factory=AdminSesstion.getsessionfactory();
	Session session=factory.openSession();
	String sql="from Librarian e";
	Query query=session.createQuery(sql);
	List<Librarian> list=query.list();	
	
	return list;
	}

	@Override
	public Librarian deletedata(int id) 
	{
		SessionFactory factory=AdminSesstion.getsessionfactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Librarian librarian=(Librarian)session.load(Librarian.class, id);
		session.delete(librarian);
		tx.commit();
		session.close();
		return librarian;
	}

	@Override
	public Librarian update(Librarian lib) 
	{
		SessionFactory factory=AdminSesstion.getsessionfactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(lib);
		tx.commit();
	

		return lib;
	}

	@Override
	public Librarian update2(int sr) 
	{
		SessionFactory factory=AdminSesstion.getsessionfactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Librarian librarian=(Librarian)session.load(Librarian.class, sr);
		
		
		return librarian;
	}
	

}
