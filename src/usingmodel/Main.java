package usingmodel;

import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import xmlParser.Loader;
import xmlParser.Transformer;

public class Main {
		
	public static void main(String args[]) throws ParserConfigurationException, SAXException, IOException{
		Scanner scan = new Scanner(System.in);
		int num=0;
		Transformer transform = new Transformer();
		
		do{
			System.out.println("What do you want to do?");
			System.out.println("1. Parse Types and Instances file");
			System.out.println("2. Create types");
			System.out.println("3. Create instances");
			System.out.println("10. Exit the program");
			
			num = scan.nextInt();
			
			switch(num){
				case 1:{
						transform.getLoader().parseTypesInstances();
					
				}break;
				case 2: transform.createTxtFile();
					break;
			}
			
		}while(num!=10);
		
		

		System.out.println("program terminated");
		
	}

}
