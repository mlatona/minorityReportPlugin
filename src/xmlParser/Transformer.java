package xmlParser;

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
	
	public void createTxtFile() throws FileNotFoundException, UnsupportedEncodingException{
	    
		PrintWriter writer = new PrintWriter("environment.txt", "UTF-8");
		System.out.println("BOH");
		// Creating list of types-instances
		for (int i = 0; i < modelFactory.getTypes().size(); i++){
			System.out.println("BOH");
			writer.println(modelFactory.getInstances().get(i).getType().getName() + "(" + 
			modelFactory.getInstances().get(i).getName() + ")" + ".");		
		}
		writer.close();

	}
	
	public Loader getLoader(){
		return loader;
	}
}
