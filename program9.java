// accept file name from user 
// using FileWriter the inbuilt class of java used to write data in file in character format
import java.util.Scanner;
import java.io.*;

class program9
{
    public static void main(String A[]) throws Exception
    {
        String FileName =null;
        FileReader frobj =null;

        Scanner sobj =new Scanner(System.in);
        System.out.println("Enter the name of file ");
        FileName=sobj.nextLine();
        File fobj =new File(FileName);


        if(fobj.exists())
        {
            
           frobj =new FileReader(FileName);  // if file not exist : Filenotfound 
           
           System.out.println((char)frobj.read());  // single character read // ascii value 74 comes so used(char)
           System.out.println((char)frobj.read()); 
           System.out.println((char)frobj.read()); 
        }
        else 
        {
            System.out.println("There is no such file ");
        }
        
        if(frobj !=null)   // otherwise null point exception  
        {
            frobj.close();
        }
        sobj.close();
        

    }


}