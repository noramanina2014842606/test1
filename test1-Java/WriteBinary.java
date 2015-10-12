import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.CharArrayWriter;

public class WriteBinary{
    public static void main(String[] args) throws IOException {
        String fileName = "noramanina.bin";
        try {
        FileOutputStream nn = new FileOutputStream(fileName);
        ObjectOutputStream os = new ObjectOutputStream(nn);
        
        os.writeChars("Name: Nor Amanina Binti Raly ");
        os.writeChars("Matrix No: 2014842606");
        os.writeChars("Gender: Female");
        os.writeChars("Emails: eiyna910@gmail.com");
        os.writeChars("Mobile Phone: 01125441694");
        os.close();
        
    } catch (FileNotFoundException e){
         e.printStackTrace();
        }
    catch (IOException e) {
        e.printStackTrace();
    }
    System.out.println("Done" );
    
    
}
}
    
        