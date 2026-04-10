// now onward use streams: inputsream reader ,outputStream write
import java.util.Scanner;
import java.io.*;
class program18
{
    public static void main(String Arg[]) throws Exception
    {
        String FileName = null;
        byte Buffer[] = new byte[100]; 
        boolean bRet =false;
        int iRet =0;
        System.out.println("Enter the name of file");
        Scanner sobj = new Scanner(System.in);
        FileName =sobj.nextLine();

        File fobj = new File(FileName);
        
        if(fobj.exists())
        {
            String str =null;
            FileInputStream fiobj = new FileInputStream(fobj);

            while((bRet=fiobj.read((Buffer))!= -1)) // means upto whwere file not ends
            {
                str = new String(Buffer);
                System.out.print(str);
                str =null;  // due to that its come from string pool to heap
                
            }
            System.out.println();
        }
        else 
        {
            System.out.println("There is no such file");
        }
        sobj.close();
    }
}