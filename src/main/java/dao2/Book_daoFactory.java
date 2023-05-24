package dao2;

public class Book_daoFactory {
	
	public static Book_dao getinstance()
	{
		return new  Book_imp();
		
	}

}
