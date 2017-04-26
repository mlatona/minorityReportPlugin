package usingmodel;

import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import model.Environment;
import model.impl.EnvironmentImpl;
import xmlParser.Loader;
import xmlParser.Transformer;

public class Main {
		
	public static void main(String args[]) throws ParserConfigurationException, SAXException, IOException{
		Scanner scan = new Scanner(System.in);
		int num=0;
		Transformer transform = new Transformer();
		do{ 
			System.out.println("What do you want to do?");
			System.out.println("1. Parse Types and Instances file and output to txt");
			System.out.println("10. Exit the program");
			
			num = scan.nextInt();
			
			switch(num){
				case 1:{
						Environment env = transform.getLoader().parseFiles();
						transform.createTxtFile(env);
					
				}break;
				case 2: 
					break;
			}
			
		}while(num!=10);
		
		

		System.out.println("program terminated");
		
	}

}
