import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteProfile

{
    public static void main(String[] args) 
    {
        
        try {
            
            FileWriter w = new FileWriter("noramanina.txt");
            BufferedWriter bw = new BufferedWriter(w);
            
            bw.write("Name: Nor Amanina Binti Ramly");
            bw.newLine();
            bw.write("Matrix No: 2014842606");
            bw.newLine();
            bw.write("Gender: Female");
            bw.newLine();
            bw.write("Emails: eiyna910@gmail.com");
            bw.newLine();
            bw.write("Mobile Phone: 01125441694");
            bw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
