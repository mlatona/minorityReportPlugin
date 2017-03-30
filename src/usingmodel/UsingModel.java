package usingmodel;

import java.util.ArrayList;
import java.util.Scanner;

import model.BehaviouralDescription;
import model.ContextRelation;
import model.Event;
import model.Happens;
import model.HoldsAt;
import model.HoldsAtBetween;
import model.Instance;
import model.ModelFactory;
import model.ModelPackage;
import model.Parameter;
import model.PrimitiveEvent;
import model.Type;
import xmlParser.Loader;

public class UsingModel {
	
	private  ModelFactory modelFactory;
	private  ModelPackage modelPackage;
	
	private Scanner scan;
	
	/*
	 * Constructor that initializes main attributes
	 */
	public UsingModel(){
		
		modelPackage = model.ModelPackage.eINSTANCE;
		modelFactory = model.ModelFactory.eINSTANCE;
		scan = new Scanner(System.in);

	}

	// I should create a type using the already existing function in the modelImpl
	// and use this function to only generate nodes. I still don't know where are
	// the collections collecting all the instances of the objects
	public void createType(){
		
		// Input information from the user
		System.out.println("Insert the name of a type:");
		String name = scan.next();
		
		// Creation of the type
		Type type = modelFactory.createType();
		type.setName(name);

		//Creating DOM Element for the XML output
		//Maybe I need to call this just when the user press "Save into XML"
		//loader.createElementType();

		
	}
	
	public void createInstance(){
	/*	System.out.println("Insert the name of the instance:");
		Scanner scan = new Scanner(System.in);
		String instanceName = scan.next();
		System.out.println("Insert the name of the type associated to the instance:");
		boolean exist = false;
		int i;
		do{
			String typeName = scan.next();
			for (i=0; i<types.size(); i++){
				System.out.println(typeName);
				if (typeName.equals(types.get(i).getName()))
					exist = true;
				else if (i == types.size()-1)
					System.out.println("The type doesn't exist. Try again!");
			}
			System.out.println(i);
		}while(!exist);
	
		Instance instance = modelFactory.createInstance();
		instances.add(instance);
		instance.setName(instanceName);
		instance.setType(types.get(i-1));
		*/
	}
	
	public void createContextRelation(){
		
	}
	
	/*
	 * It creates an instance of an event
	 */
	public void createEvent(){
		
		System.out.println("Creating event...");
		 
		PrimitiveEvent primitiveEvent = modelFactory.createPrimitiveEvent();
		
		System.out.println("Choose name for the event:");
		
		primitiveEvent.setName(scan.next());
		
		System.out.printf("Primitive Event with name %s created\n", primitiveEvent.getName());
	}
	
	public void createXML(){
		
	}
	
} // UsingModel
