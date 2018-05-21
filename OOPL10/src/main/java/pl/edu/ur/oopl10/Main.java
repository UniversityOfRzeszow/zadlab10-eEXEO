package pl.edu.ur.oopl10;

import java.util.Random;
import java.util.Scanner;
import static pl.edu.ur.oopl10.WprowadzZKonsoli.*;

public class Main 
{

    public static void main(String[] args) 
    {
        div2();
        gInt();
        
        //ZADANIE 2
        Scanner imp = new Scanner(System.in);
        char[] arr = {'a', 'b', 'c'};
        
        System.out.println("Podaj nr. elementu");
        int i = imp.nextInt();
        try 
        {
            System.out.println(arr[i]);
        }catch(ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Wykroczenie poza zakres tablicy, szczegóły:");
            System.out.println(e);
        }
    }
    
    //ZADANIE 3
    
    public static void div1()
    {
        Scanner imp = new Scanner(System.in);
        try 
        {
           System.out.println("Enter divider and divisor:");
           int divid = imp.nextInt();
           int divis = imp.nextInt();
           double wynik = divid / divis;
           System.out.println(wynik);
        }catch (ArithmeticException e) 
        {
            System.err.println("You can't do that. More:\n"+e);
        }
    }
    
    //ZADANIE 4
    
    public static void div2()
    {
        int ex = 0;
        Random gen = new Random();
        while(ex<3)
        {
            int t1 = gen.nextInt(21)-10;
            int t2 = gen.nextInt(21)-10;
            System.out.print("\n"+t1 + " / " + t2 + " = "); 
            try
            {
                System.out.println("" + (t1/t2));
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
                ex++;
            }
        }
    }
    
}
