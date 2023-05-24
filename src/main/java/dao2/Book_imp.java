package dao2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import model.Book;
import model.Issue;
import model.Librarian;
import util.AdminSesstion;
import util.DButil;

public class Book_imp implements Book_dao {
	
	DButil util;
	
	public Book_imp()
	{
		util=new DButil();
	}
	

	@Override
	public Book savedata(Book book) {

		SessionFactory factory = AdminSesstion.getsessionfactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(book);
		tx.commit();
		session.close();

		return book;
	}

	@Override
	public List<Librarian> readdata() {
		SessionFactory factory = AdminSesstion.getsessionfactory();
		Session session = factory.openSession();
		String sql = "from Book e";
		Query query = session.createQuery(sql);
		List<Librarian> list = query.list();
		return list;
	}

	@Override
	public Book deletedata(int id) {
		SessionFactory factory = AdminSesstion.getsessionfactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Book book = (Book) session.load(Book.class, id);
		session.delete(book);
		tx.commit();
		session.close();
		return book;
	}

	@Override
	public Book updatedata(int id) {
		
		SessionFactory factory=AdminSesstion.getsessionfactory();
		Session session=factory.openSession();
		Book book = (Book) session.load(Book.class, id);		
		return book;
	
	}

	@Override
	public Book updatedata(Book book) {
		SessionFactory factory = AdminSesstion.getsessionfactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.update(book);
		tx.commit();
		session.close();

		return book;
	}

	@Override
	public Book loaddata(int id) {
		
		SessionFactory factory=AdminSesstion.getsessionfactory();
		Session session=factory.openSession();
		Book book = (Book) session.load(Book.class, id);		

		
		return book;
	}

	@Override
	public Issue addissue(Issue issue,int bookid )
	{
		SessionFactory factory = AdminSesstion.getsessionfactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(issue);
		tx.commit();
		session.close();
		
		Connection con=DButil.getDBConnection();

		String q1="update Book set issueid=issueid+1 where book_id=?";
		String q2="update Book set book_quantity=book_quantity-1 where book_id=?";
		 
		try 
		{
			PreparedStatement ps=con.prepareStatement(q1);
			PreparedStatement ps2=con.prepareStatement(q2);
			ps.setInt(1, bookid);
			ps2.setInt(1, bookid);
			ps.executeUpdate();
			ps2.executeUpdate();			
		}
		catch (SQLException e)
		{
		
			e.printStackTrace();
		}
		
		return issue;
	}

	@Override
	public List<Issue> issuereaddata()
	{
		
		SessionFactory factory = AdminSesstion.getsessionfactory();
		Session session = factory.openSession();
		String sql = "from Issue e";
		Query query = session.createQuery(sql);
		List<Issue> list = query.list();

		return list;
	}

	@Override
	public Issue updateIssue(int id)
	{
		
		SessionFactory factory=AdminSesstion.getsessionfactory();
		Session session=factory.openSession();
		Issue issue=(Issue)session.load(Issue.class,id);
		return issue;
	}

	@Override
	public Issue UpdateIssue(Issue issue)
	{
		SessionFactory factory = AdminSesstion.getsessionfactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.update(issue);
		tx.commit();
		session.close();
		return issue;
		
	}

	@Override
	public List<Librarian> readBookissue() 
	{
		SessionFactory factory = AdminSesstion.getsessionfactory();
		Session session = factory.openSession();
		String sql = "from Book e";
		Query query = session.createQuery(sql);
		List<Librarian> list = query.list();

		
		return list;
	}


	
	
}
