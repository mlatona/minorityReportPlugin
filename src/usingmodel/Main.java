package usingmodel;

import xmlParser.*;

import java.io.PrintWriter;
import java.util.Scanner;

import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

public class Main {

	
	public static void main(String args[]) throws java.io.FileNotFoundException, TransformerFactoryConfigurationError, TransformerException{
	
		System.out.println("Starting the program...");
		
		Scanner scan = new Scanner(System.in);
		UsingModel usingModel = new UsingModel();
	
		int num=0;
		try{
		
		while(num!= 10){
			
			System.out.println("What do you want to do?");
			System.out.println("1. Create a new type");
			System.out.println("2. Create a new instance");
			System.out.println("3. Create a new context relation");
			System.out.println("10. Exit the program");
			
			num = scan.nextInt();
			System.out.println("A");

			switch(num){
				case 1: usingModel.createType();
				break;
				case 2: usingModel.createInstance();
				break;
				case 3: usingModel.createContextRelation();
				break;
				case 8: {
					Loader loader = new Loader(usingModel);
					//all the calls to the xmlBuilder functions go here
					loader.typeXmlBuilder();
					
					loader.outputToConsole();
				} break;
			} //End switch
			
		} //End while
		} catch (Exception e){
			e.printStackTrace();
		}
		System.out.println("Program terminated");
		
	} //End main
	
	
	/*
	 * It creates the env.txt file
	 */
	public void createEnvironmentFile() throws java.io.FileNotFoundException{
		
		try(PrintWriter out = new PrintWriter("env.txt")){
			
		}
		
	}
	
}
