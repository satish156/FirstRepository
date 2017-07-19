package MyFirstWeb;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ConsoleEx {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		Console c = System.console();
//		System.out.println("enter name ");
//		try{
//		String a = c.readLine();
//		char[] ch =c.readPassword();
//		String pass = String.valueOf(ch);
//		System.out.println("hello " +pass);
//		}catch(Exception e){};
//		
		
//		
//		   InputStreamReader r=new InputStreamReader(System.in);    
//		    BufferedReader br=new BufferedReader(r);            
//		    System.out.println("Enter your name");    
//		    String name=br.readLine();    
//		    System.out.println("Welcome "+name); 
//	
		    FileOutputStream fout=new FileOutputStream("E:\\testout.txt ");    
		    PrintStream pout=new PrintStream(fout);    
		    pout.println(2016);    
		    pout.println("Hello Java");    
		    pout.println("Welcome to Java");    
		    pout.close();    
		    fout.close();    
		   System.out.println("Success?");   
	}
	
	

}
