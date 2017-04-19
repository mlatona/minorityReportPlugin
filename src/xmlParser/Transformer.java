package xmlParser;

import model.ComplexEvent;
import model.ContextRelation;
import model.Environment;
import model.Event;
import model.ModelFactory;
import model.PrimitiveEvent;
import model.impl.ComplexEventImpl;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.xml.parsers.ParserConfigurationException;

/*
 * This class has to create a new file .txt based on the information saved in the model
 * This class has to call the loader to parse the files XMI and then has to create the new file .txt
 * For now the Main class is calling all the methods in loader but later this class has to do this job
 */
public class Transformer {
	
	private Loader loader;
	private ModelFactory modelFactory;
	
	public Transformer() throws ParserConfigurationException{
		
		modelFactory = model.ModelFactory.eINSTANCE;
		
		loader = new Loader();
		
	}
	
	public void createTxtFile(Environment env) throws FileNotFoundException, UnsupportedEncodingException{
	    
		PrintWriter writer = new PrintWriter("environment.txt", "UTF-8");
		
		writer.println("% ****************** Environment Description ******************\n");
		writer.println("% ********* Context Description *********\n");
		writer.println("% ***** Types and Instances *****\n");
		
		// Creating list of types-instances
		for (int i = 0; i < env.getInstances().size(); i++){
			writer.println(env.getInstances().get(i).getType().getName() + "(" + 
			env.getInstances().get(i).getName() + ")" + ".");		
		}
		
		//CONTEXT RELATIONS
		writer.println("\n\n% **** Context Relations ****\n");
		//Creating list of Context Relations
		for (int i = 0; i < env.getContextRelations().size(); i++){
			writer.printf("fluent(%s", env.getContextRelations().get(i).getName());
			writeContextRelationParameters(env.getContextRelations().get(i), writer);
			writer.printf("):-\n\t");
			for (int j = 0; j < env.getContextRelations().get(i).getParameters().size(); j++){
				if (j != env.getContextRelations().get(i).getParameters().size()-1)
					writer.printf("%s(%c), ", env.getContextRelations().get(i).getParameters().get(j).getType().getName(),env.getContextRelations().get(i).getParameters().get(j).getType().getName().charAt(0));
				else
					writer.printf("%s(%c).\n", env.getContextRelations().get(i).getParameters().get(j).getType().getName(),env.getContextRelations().get(i).getParameters().get(j).getType().getName().charAt(0));				
			}
		} //Context Relations
		
		//EVENTS
		writer.println("\n\n% ********* Behaviour Descriptions *********\n");
		writer.println("% ***** Primitive Events *****\n");
		writer.println("event(V):-\n\tpe(V)");
		//Creating list of primitive events
		for (int i = 0; i < env.getEvents().size(); i++){
			if (env.getEvents().get(i) instanceof PrimitiveEvent){
				System.out.println("Primitive event");
				
				//TO-DO
			
			}
		} //Primitive events
		
		writer.println("\n% ***** Complex Events *****\n");		
		writer.printf("event(V):-\nce(V)\n\n");
		//Creating list of complex events
		for (int i = 0; i < env.getEvents().size(); i++){
			if (env.getEvents().get(i) instanceof ComplexEvent){
				writer.printf("ce("+ env.getEvents().get(i).getName());
				
				writeEventParameters(env.getEvents().get(i), writer);
				writer.printf("):-\n\t");
				for (int j = 0; j < env.getEvents().get(i).getParameters().size(); j++){
					if (j != env.getEvents().get(i).getParameters().size()-1)
						writer.printf("%s(%c),", env.getEvents().get(i).getParameters().get(j).getType().getName(), env.getEvents().get(i).getParameters().get(j).getType().getName().charAt(0));
					else
						writer.printf("%s(%c).\n", env.getEvents().get(i).getParameters().get(j).getType().getName(), env.getEvents().get(i).getParameters().get(j).getType().getName().charAt(0));
				}
			}
		} //Complex events
		
		writer.println("\n\n% ***** Composite Definitions *****\n");
		for (int i = 0; i < env.getBehavDescriptions().size(); i++){
			Event event = new ComplexEventImpl(); //Because it is a complexEvent for sure
			writer.printf("happens("+ env.getBehavDescriptions().get(i).getName());
			for (int j = 0; j < env.getEvents().size(); j++){
				if (env.getEvents().get(j).getName().equals(env.getBehavDescriptions().get(i).getName())){
					event = env.getEvents().get(j);
				}	
			}
			writeEventParameters(event, writer);
			writer.printf(",T2,TR):-\n");
			writer.println("\ttrace(TR),");
			writer.println("\ttrace(TR),");
			
			
			//TO-DO Complete here the behavioural description output
			
			for (int j = 0; j < env.getBehavDescriptions().get(i).getHoldsAts().size(); j++){
				writer.printf("holdsAt("+env.getBehavDescriptions().get(i).getHoldsAts().get(j).getContextRelation().getName());
				
				writeContextRelationParameters(env.getBehavDescriptions().get(i).getHoldsAts().get(j).getContextRelation(), writer);
				
				writer.printf(",T"+env.getBehavDescriptions().get(i).getHoldsAts().get(j).getTime() +",TR),\n");
			}
			writer.println();
			writer.println();
			
		}
		
		writer.println("% Version 2");
		writer.close();

	}
	
	private void writeContextRelationParameters(ContextRelation cr, PrintWriter writer){
		writer.printf("(");
		for (int j = 0; j < cr.getParameters().size(); j++){
			if (j != cr.getParameters().size()-1)
				writer.printf("%c,", cr.getParameters().get(j).getType().getName().charAt(0));
			else
				writer.printf("%c)", cr.getParameters().get(j).getType().getName().charAt(0));	
		}
		
		
		
	}
	
	private void writeEventParameters(Event ev, PrintWriter writer){
		writer.printf("(");
		for (int j = 0; j < ev.getParameters().size(); j++){
			if (j != ev.getParameters().size()-1)
				writer.printf("%c,", ev.getParameters().get(j).getType().getName().charAt(0));
			else
				writer.printf("%c)", ev.getParameters().get(j).getType().getName().charAt(0));
		}
		
	}
	
	
	public Loader getLoader(){
		return loader;
	}
}
