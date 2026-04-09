import java.io.*;   // for file handling 
import java.util.Scanner;
class program2
{
   public static void main(String Arg[]) throws Exception
 {
        Scanner sobj =new Scanner(System.in);
        File fobj = new File("Marvellous");
        fobj.createNewFile();

        if(fobj.exists())
        {
            System.out.println("Folder is present");
        }
        else 
        {
            
            System.out.println("Folder is  not present");
        }


 }
}