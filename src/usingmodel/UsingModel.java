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

public class UsingModel {
	
	private ArrayList<Type> types;
	private ArrayList<Instance> instances;
	private ArrayList<Parameter> parameters;
	private ArrayList<Event> events;
	private ArrayList<ContextRelation> contextRelations;
	private ArrayList<BehaviouralDescription> behavDescriptions;
	private ArrayList<HoldsAt> holdsAts;
	private ArrayList<Happens> happens;
	private ArrayList<HoldsAtBetween> holdsAtBetweens;
	
	private  ModelFactory modelFactory;
	private  ModelPackage modelPackage;
	
	private Scanner scan;
	
	/*
	 * Constructor that initializes main attributes
	 */
	public UsingModel(){
		
		modelPackage = model.ModelPackage.eINSTANCE;
		modelFactory = model.ModelFactory.eINSTANCE;
		
		types = new ArrayList<Type>();
		instances = new ArrayList<Instance>();
	}

	public void createType(){
		
		System.out.println("Insert the name of a type:");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		
		Type type = modelFactory.createType();
		types.add(type);
		type.setName(name);

	}
	
	public void createInstance(){
		System.out.println("Insert the name of the instance:");
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
	
	
	/****** Getters and Setters ******/
	

	public ArrayList<Type> getTypes() {
		return types;
	}

	public void setTypes(ArrayList<Type> types) {
		this.types = types;
	}

	public ArrayList<Instance> getInstances() {
		return instances;
	}

	public void setInstances(ArrayList<Instance> instances) {
		this.instances = instances;
	}

	public ArrayList<Parameter> getParameters() {
		return parameters;
	}

	public void setParameters(ArrayList<Parameter> parameters) {
		this.parameters = parameters;
	}

	public ArrayList<Event> getEvents() {
		return events;
	}

	public void setEvents(ArrayList<Event> events) {
		this.events = events;
	}

	public ArrayList<ContextRelation> getContextRelations() {
		return contextRelations;
	}

	public void setContextRelations(ArrayList<ContextRelation> contextRelations) {
		this.contextRelations = contextRelations;
	}

	public ArrayList<BehaviouralDescription> getBehavDescriptions() {
		return behavDescriptions;
	}

	public void setBehavDescriptions(ArrayList<BehaviouralDescription> behavDescriptions) {
		this.behavDescriptions = behavDescriptions;
	}

	public ArrayList<HoldsAt> getHoldsAts() {
		return holdsAts;
	}

	public void setHoldsAts(ArrayList<HoldsAt> holdsAts) {
		this.holdsAts = holdsAts;
	}

	public ArrayList<Happens> getHappens() {
		return happens;
	}

	public void setHappens(ArrayList<Happens> happens) {
		this.happens = happens;
	}

	public ArrayList<HoldsAtBetween> getHoldsAtBetweens() {
		return holdsAtBetweens;
	}

	public void setHoldsAtBetweens(ArrayList<HoldsAtBetween> holdsAtBetweens) {
		this.holdsAtBetweens = holdsAtBetweens;
	}
}
