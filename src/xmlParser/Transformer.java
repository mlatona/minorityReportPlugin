package xmlParser;

import model.Environment;
import model.ModelFactory;

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
		// Creating list of types-instances
		for (int i = 0; i < env.getInstances().size(); i++){
			writer.println(env.getInstances().get(i).getType().getName() + "(" + 
			env.getInstances().get(i).getName() + ")" + ".");		
		}
		
		writer.println("Version 2");
		writer.close();

	}
	
	public Loader getLoader(){
		return loader;
	}
}
