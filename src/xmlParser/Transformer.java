package xmlParser;

import model.ComplexEvent;
import model.Environment;
import model.ModelFactory;
import model.PrimitiveEvent;

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
		
		// CONTEXT RELATIONS
		writer.println("\n% **** Context Relations ****\n");
		// Creating list of Context Relations
		for (int i = 0; i < env.getContextRelations().size(); i++){
			writer.printf("fluent(%s(", env.getContextRelations().get(i).getName());
			for (int j = 0; j < env.getContextRelations().get(i).getParameters().size(); j++){
				if (j != env.getContextRelations().get(i).getParameters().size()-1)
					writer.printf("%c,", env.getContextRelations().get(i).getParameters().get(j).getType().getName().charAt(0));
				else
					writer.printf("%c)):-", env.getContextRelations().get(i).getParameters().get(j).getType().getName().charAt(0));	
			}
			for (int j = 0; j < env.getContextRelations().get(i).getParameters().size(); j++){
				if (j != env.getContextRelations().get(i).getParameters().size()-1)
					writer.printf("%s(%c), ", env.getContextRelations().get(i).getParameters().get(j).getType().getName(),env.getContextRelations().get(i).getParameters().get(j).getType().getName().charAt(0));
				else
					writer.printf("%s(%c).\n\n", env.getContextRelations().get(i).getParameters().get(j).getType().getName(),env.getContextRelations().get(i).getParameters().get(j).getType().getName().charAt(0));				
			}
		} // Context Relations
		
		// EVENTS
		writer.println("% ********* Behaviour Descriptions *********\n");
		writer.println("% ***** Primitive Events *****\n");
		// Creating list of events
		for (int i = 0; i < env.getEvents().size(); i++){
			if (env.getEvents().get(i) instanceof PrimitiveEvent){
				System.out.println("Primitive event");
			}
		}
		
		writer.println("% ***** Complex Events *****\n");		
		writer.println("event(V):-ce(V)");
		for (int i = 0; i < env.getEvents().size(); i++){
			if (env.getEvents().get(i) instanceof ComplexEvent){
				System.out.println("Complex event");
				writer.printf("ce("+ env.getEvents().get(i).getName() + "(");
				for (int j = 0; j < env.getEvents().get(i).getParameters().size(); j++){
					if (j != env.getEvents().get(i).getParameters().size()-1)
						writer.printf("%c,", env.getEvents().get(i).getParameters().get(j).getType().getName().charAt(0));
					else
						writer.printf("%c)):-", env.getEvents().get(i).getParameters().get(j).getType().getName().charAt(0));	
				}
				for (int j = 0; j < env.getEvents().get(i).getParameters().size(); j++){
					if (j != env.getEvents().get(i).getParameters().size()-1)
						writer.printf("%s(%c),", env.getEvents().get(i).getParameters().get(j).getType().getName(), env.getEvents().get(i).getParameters().get(j).getType().getName().charAt(0));
					else
						writer.printf("%s(%c).\n\n", env.getEvents().get(i).getParameters().get(j).getType().getName(), env.getEvents().get(i).getParameters().get(j).getType().getName().charAt(0));
				}
			}
		}
		
		
		
		writer.println("% Version 2");
		writer.close();

	}
	
	public Loader getLoader(){
		return loader;
	}
}
