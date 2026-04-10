// now onward use streams: inputsream reader ,outputStream write
import java.util.Scanner;
import java.io.*;
class program15
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
            FileInputStream fiobj = new FileInputStream(fobj);

            byte Arr[] = new byte[50];
            fiobj.read(Arr);

            System.out.println(Arr);  // got  output but in byte format its unreadeable so lets convert it

        }
        else 
        {
            System.out.println("There is no such file");
        }
        sobj.close();
    }
}