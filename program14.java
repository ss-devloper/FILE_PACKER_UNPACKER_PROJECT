// now onward use streams: inputsream reader ,outputStream write
// converted atring to byte array for writting 
import java.util.Scanner;
import java.io.*;
class program14
{
    public static void main(String Arg[]) throws Exception
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
           // foobj.write(str);  // error  no suitable method found for write(String)
            // need to convert string into byte array

            byte Arr[] = str.getBytes();  // to conver string to byte array

            foobj.write(Arr);

            System.out.println("Length of array is :"+Arr.length);


            
        }
        else 
        {
            System.out.println("There is no such file");
        }
        sobj.close();
    }
}