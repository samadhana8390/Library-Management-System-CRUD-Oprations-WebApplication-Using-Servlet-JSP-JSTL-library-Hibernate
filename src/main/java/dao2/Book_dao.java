package dao2;

import java.util.List;

import model.Book;
import model.Issue;
import model.Librarian;

public interface Book_dao {
	
	Book savedata(Book book);
	List<Librarian> readdata();
	Book deletedata(int id);
	Book updatedata(int id);
	Book updatedata(Book book);
	
	List<Librarian> readBookissue();
	Book loaddata(int id);
	Issue addissue(Issue issue, int bookid);
	List<Issue>issuereaddata();
	Issue updateIssue(int id);
	Issue UpdateIssue(Issue issue);
	
	
}
