// accept file name from user 
// using FileWriter the inbuilt class of java used to write data in file in character format
import java.util.Scanner;
import java.io.*;

class program10
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
           /* 
                System.out.println((char)frobj.read());  // only single character read // ascii value 74 comes so used(char)
                System.out.println((char)frobj.read());   // not efficient
                System.out.println((char)frobj.read()); 
           */
          // read chunk by chunk insted
          char Buffer[] =new char[50];  // created 50 bytes array to store character

          frobj.read(Buffer,0,10);  // 0 isoffset 10 length if give 13 next ... dots also read

          System.out.println("Data from file is :"+(String)Buffer); // error  if remove typecasting unreadable data get 
           
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