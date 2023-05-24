package dao;

import java.util.List;

import model.Librarian;

public interface Librariandao {
	
	Librarian savedata(Librarian lib);
	List<Librarian> readdata();
	Librarian deletedata(int id);
	Librarian update(Librarian lib);
	Librarian update2(int sr);

}
