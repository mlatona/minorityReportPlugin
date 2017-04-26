package usingmodel;

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

	/*
	 * It creates a new Type object
	 */
	public void createType(){
		
		String name;
		
		do{ // Loop that iterates till the name is unique
			System.out.println("Insert the name of a type:");
			name = scan.next();
		} while(checkingExistence("Type", name)); 
		
			// Creation of the type
			Type type = modelFactory.createType();
			type.setName(name);

	} // createType()
	
	/*
	 * It creates a new Instance object
	 */
	public void createInstance(){
		String name;
		boolean exist = false;
		
		do{ // Loop that iterates till the name is unique
			System.out.println("Insert the name of the instance:");
			name = scan.next();			
		}while(checkingExistence("Instance", name));
		
		do{
			System.out.println("Insert the name of the type associated to the instance:");
			String typeName = scan.next();
		
			int i=0;
		
			// Looking for the type in the modelFactory
			while (!exist && i < modelFactory.getTypes().size()){
				if (typeName.equals(modelFactory.getTypes().get(i).getName())){
					Instance instance = modelFactory.createInstance();
					instance.setName(name);
					instance.setType(modelFactory.getTypes().get(i));
					exist = true;
				}
				i++;
			}
			
			// Logic of the program if the type has not been found
			if (!exist){
				System.out.println("The type associated to that name has not been found. Try again!");
			}
			
		}while(!exist);
		
	} // createInstance()
	
	/*
	 * It creates a new ContextRelation object. For now the parameters related to a CR
	 * can be just two
	 */
	public void createContextRelation(){
		
		String name, type1, type2;
		
		do{
			System.out.println("Insert the name of the context relation:");
			name = scan.next();			
		}while(checkingExistence("ContextRelation", name));

		System.out.println("Insert the types of the two parameters you want the context relation relates");
		type1 = scan.next();
		
		while(!checkingExistence("Type", type1)){
			System.out.println("The type doesn't exist. Try again!");	
			type1 = scan.next();
		}
		type2 = scan.next();
	
		while(!checkingExistence("Type", type2)){
			System.out.println("The type doesn't exist. Try again!");	
			type2 = scan.next();
		}
		
		// Context Relation creation
		ContextRelation contextRelation = modelFactory.createContextRelation();
		contextRelation.setName(name);
		contextRelation.setValue(false);
		
		// Parameters creation
		Parameter parameter1 = modelFactory.createParameter();
		Parameter parameter2 = modelFactory.createParameter();
		parameter1.setNumber(0);
		parameter2.setNumber(1);
		parameter1.setType(findType(type1));
		parameter2.setType(findType(type2));
		
		// Linking the context relation just created to the parameters
		contextRelation.getParameters().add(parameter1);
		contextRelation.getParameters().add(parameter2);
	
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
	
	/*
	 * It checks if exists another instance of any kind of object that the user is trying
	 * to create with the same name. It return true if it exists, false otherwise.
	 */
	private boolean checkingExistence(String objectType, String name){
		
		if (objectType.equals("Type")){
			for (int i = 0; i < modelFactory.getTypes().size(); i++){
				if (name.equals(modelFactory.getTypes().get(i).getName())){
					return true;
				}
			}
		}
		else if (objectType.equals("Instance")){
			for (int i = 0; i < modelFactory.getInstances().size(); i++){
				if (name.equals(modelFactory.getInstances().get(i).getName())){
					return true;
				}
			}
		}
		else if (objectType.equals("ContextRelation")){
			for (int i = 0; i < modelFactory.getContextRelations().size(); i++){
				if (name.equals(modelFactory.getContextRelations().get(i).getName())){
					return true;
				}
			}
		}
		
		// TO BE CONTINUED
		
		return false;
		
	} // checkingExistence()
	
	/*
	 * Find the instance of the object Type with the name typeName
	 */
	private Type findType(String typeName){
		
		Type result;
		
		for (int i = 0; i < modelFactory.getTypes().size(); i++)
			if (typeName.equals(modelFactory.getTypes().get(i).getName())){
				result = modelFactory.getTypes().get(i);
				return result;
			}
		return null;
	}
	
} // UsingModel
