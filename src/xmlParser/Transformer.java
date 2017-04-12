package xmlParser;

import javax.xml.parsers.ParserConfigurationException;

/*
 * This class has to create a new file .txt based on the information saved in the model
 * This class has to call the loader to parse the files XMI and then has to create the new file .txt
 * For now the Main class is calling all the methods in loader but later this class has to do this job
 */
public class Transformer {
	
	private Loader loader;
	
	public Transformer() throws ParserConfigurationException{
		
		loader = new Loader();
	}
	
	
	public Loader getLoader(){
		return loader;
	}
}
