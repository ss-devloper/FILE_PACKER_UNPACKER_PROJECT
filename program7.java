// accept file name from user 
// using FileWriter the inbuilt class of java used to write data in file in character format
import java.util.Scanner;
import java.io.*;

class program7
{
    public static void main(String A[]) throws Exception
    {
        String FileName =null;

        Scanner sobj =new Scanner(System.in);
        System.out.println("Enter the name of file ");
        FileName=sobj.nextLine();

        FileReader frobj =new FileReader(FileName);  // if file not exist : Filenotfound Exception
        
        sobj.close();
        frobj.close();

    }


}