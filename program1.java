import java.io.*;   // for file handling 
import java.util.Scanner;
class program1 
{
   public static void main(String Arg[]) throws Exception
   {
      
      File fobj = new File("Demo.txt");  // object creation 

      boolean bRet = fobj.createNewFile();     // so file creted
      if(bRet == true )
      {
         System.out.println("file gets successfully creted");
      }
      else 
      {
          System.out.println("file not creted");
      }
   } 
}