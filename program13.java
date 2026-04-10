// now onward use streams: inputsream reader ,outputStream write
import java.util.Scanner;
import java.io.*;
class program13 
{
    public static void main(String Arg[])
    {
        String FileName = null;
        System.out.println("Enter the name of file");
        Scanner sobj = new Scanner(System.in);
        FileName =sobj.nextLine();

        File fobj = new File(FileName);
        
        if(fobj.exists())
        {
            // to write the data 
            FileOutputStream foobj = new FileOutputStream(fobj);

            String str = "Jay Ganesh......";
            foobj.write(str);  // error  no suitable method found for write(String)
            // need to convert string into byte array
            
        }
        else 
        {
            System.out.println("There is no such file");
        }
        sobj.close();
    }
}