package dao;

public class LibrariandaoFactory {
	public static Librariandao getInstance()
	{
		return new LibrariandaoImp();
		
	}

}
