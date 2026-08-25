// accept the file name from user
// FileWriter ngamed class 
import java.util.Scanner;
import java.io.*;
class program562
{
    public static void main(String A[]) throws Exception
    {
        String FileName =null;
        boolean bRet  =false;
       

        System.out.println("Enter the name of file");
        Scanner sobj =new Scanner(System.in);
        FileName =sobj.nextLine();

        FileWriter fwobj = new FileWriter(FileName);   // Packer.txt created 
        fwobj.write("JAY GANESH...");   // write down in packer.txt

        fwobj.close();
       
        sobj.close();
    }
}