import java.io.BufferedReader;
import java.io.FileReader;


public class ReadProfile
{
	public static void main(String[] args)throws Exception
	{
	    
	    FileReader file = new FileReader ("noramanina.txt");
	    BufferedReader reader = new BufferedReader (file);
	    
	    //String text = " ";
	    String line;
	    
	    //String line = null;
	    while ((line = reader.readLine()) != null)
	    {    
	    System.out.println(line);
	   }
	   reader.close();
	 }
}