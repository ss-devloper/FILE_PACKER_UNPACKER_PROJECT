// now onward use streams: inputsream reader ,outputStream write
import java.util.Scanner;
import java.io.*;
class program16
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

            byte Arr[] = new byte[50];  // only 50 bytes it will read // 1024 fix  upto whwre file not finish lets do it in next file
            fiobj.read(Arr);
            String str = new String(Arr); // this is how we conver byte into string 
            System.out.println(str);  // 

        }
        else 
        {
            System.out.println("There is no such file");
        }
        sobj.close();
    }
}