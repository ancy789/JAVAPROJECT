import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionPgm {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		FileInputStream f=new FileInputStream("E://st.exe");       //Compiletime exception
		
		try {
		int a=20,b=0;
		int c=a/b;                            //Arithmetic exception
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());                                 //Runtime  Exception
		}
		System.out.println("Hello");
		
		try
		{
		String s=null;      
		System.out.println(s.length());                       //Nullpointer Exception
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
