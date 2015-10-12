import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.CharArrayWriter;

public class ReadBinary{
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader ("noramanina.bin");
	    BufferedReader reader = new BufferedReader (file);
	    
	    
	    String line;
	    
	    
	    while ((line = reader.readLine()) != null)
	    {    
	    System.out.println(line);
	   }
	   reader.close();
	 }
}