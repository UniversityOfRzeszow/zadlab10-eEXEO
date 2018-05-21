package pl.edu.ur.oopl10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class WprowadzZKonsoli 
{
    
    static void gInt()
    {
        System.out.println("Int: ");
        Scanner imp = new Scanner(System.in);
        try 
        { 
            int temp = imp.nextInt();
            FileReader fr = new FileReader("int.txt");
            BufferedReader br = new BufferedReader(fr);
            String output = br.readLine();
            br.close();
            
            FileWriter fwo = new FileWriter("int.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write(temp);
            bwo.newLine();
            bwo.close();
        }catch (IOException e)
        {
           System.out.println(e);
        }
    }
    
    
    static void gString()
    {
        System.out.println("String: ");
        Scanner imp = new Scanner(System.in);
        try
        { 
            String temp = imp.nextLine();
            FileReader fr = new FileReader("string.txt");
            BufferedReader br = new BufferedReader(fr);
            String output = br.readLine();
            br.close();
            
            FileWriter fwo = new FileWriter("string.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write(temp);
            bwo.newLine();
            bwo.close();
        }
        catch (IOException e)
        {
           System.out.println(e);
        }
    }
    
    
    static void gChar()
    {
       System.out.println("Char: ");
       Scanner imp = new Scanner(System.in);
       try 
       { 
            char temp = imp.next().charAt(0);
            FileReader fr = new FileReader("char.txt");
            BufferedReader br = new BufferedReader(fr); 
            String output = br.readLine();
            br.close();
            
            FileWriter fwo = new FileWriter("char.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write(temp);
            bwo.newLine();
            bwo.close();
       }catch (IOException e)
       {
           System.out.println(e);
       }
    }
       
    static void gFloat()
    {
        System.out.println("Float: ");
        Scanner imp = new Scanner(System.in);
        try 
        { 
            Float temp = imp.nextFloat();
            FileReader fr = new FileReader("float.txt");
            BufferedReader br = new BufferedReader(fr); 
            String output = br.readLine();
            br.close();
            
            FileWriter fwo = new FileWriter("float.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write((int) (float) temp);
            bwo.newLine();
            bwo.close();
       }catch (IOException e)
       {
           System.out.println(e);
       }
    }
}