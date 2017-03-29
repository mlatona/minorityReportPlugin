package usingmodel;

import model.*;
import xmlParser.*;

import java.io.PrintWriter;
import java.util.Scanner;

import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

public class UsingModel {
	
	private static ModelFactory modelFactory;

	public static void main(String args[]) throws java.io.FileNotFoundException, TransformerFactoryConfigurationError, TransformerException{
		
		System.out.println("Starting the program...");
		
		Scanner scan = new Scanner(System.in);		 
		ModelPackage modelPackage = model.ModelPackage.eINSTANCE;
		modelFactory = model.ModelFactory.eINSTANCE;	
		 
		System.out.println("Creating event...");
		 
		PrimitiveEvent primitiveEvent = modelFactory.createPrimitiveEvent();
		
		System.out.println("Choose name for the event:");
		
		primitiveEvent.setName(scan.next());
		
		System.out.printf("Primitive Event with name %s created\n", primitiveEvent.getName());
		
		System.out.println("Creating parameters and instance");
		
		Parameter param1 = modelFactory.createParameter();
	//	Parameter param2 = modelFactory.createParameter();
		Instance instance1 = modelFactory.createInstance();
		instance1.setName("instance1");
		param1.setInstance(instance1);
		primitiveEvent.getParameters().add(param1);
		
		Loader loader = new Loader();
		loader.eventXmlBuilder(primitiveEvent);
		loader.outputToConsole();
		
		scan.close();
		
		System.out.println("Program terminated");
		
	}
	
	/*
	 * It creates the env.txt file
	 */
	public void createEnvironmentFile() throws java.io.FileNotFoundException{
		
		try(PrintWriter out = new PrintWriter("env.txt")){
			
		}
		
	}
	
}
