package xmlParser;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import model.Instance;
import model.ModelFactory;
import model.Type;


public class Loader {
	
	private Document docTypesInstances;
	private DocumentBuilder dBuilder;
	private ModelFactory modelFactory;
	
	/*
	 * Constructor of the class
	 */
	public Loader() throws ParserConfigurationException{

	    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		dBuilder = dbFactory.newDocumentBuilder();
		modelFactory = model.ModelFactory.eINSTANCE;
	   
	}

	/*
	 * Methods that parses the XMI file of types and instances and memorize everything in the model
	 * Maybe I can find a more efficient solution later
	 */
	public void parseTypesInstances() throws SAXException, IOException{
	    System.out.println("I'm in parseTypesInstances");
		File xmiFile = new File("/Users/marco/Documents/runtime-New_configuration/ApplicationInstance/instancesTypes.model");
		docTypesInstances = dBuilder.parse(xmiFile);
		
		// Memorizing types in the model
		NodeList typeNodes = docTypesInstances.getElementsByTagName("types");
		for (int i = 0; i<typeNodes.getLength(); i++ ){
			Element el = (Element) typeNodes.item(i);
			Type type = modelFactory.createType();
			type.setName(el.getAttribute("name"));
			modelFactory.getTypes().add(type);
			System.out.println("I'm in parseTypesInstances");
		}
		for (int i = 0; i<modelFactory.getTypes().size(); i++){
			System.out.println(modelFactory.getTypes().get(i).getName());
			
		}
		
		NodeList instanceNodes = docTypesInstances.getElementsByTagName("instances");
		for (int i = 0; i<instanceNodes.getLength(); i++ ){
			Element el = (Element) instanceNodes.item(i);
			Instance instance = modelFactory.createInstance();
			instance.setName(el.getAttribute("name"));
			modelFactory.getInstances().add(instance);
			
			// Finding the type the instance is referring to and memorizing it in the model
			char temp = el.getAttribute("type").charAt(el.getAttribute("type").length() -1 );
			System.out.println(temp);
			
			// SOLVE CASTING PROBLEM!!!!!
			System.out.println(String.valueOf(temp));
			Element typeIn = (Element) typeNodes.item(Character.getNumericValue(temp));
			System.out.println(typeIn);
			for (int j = 0; j < modelFactory.getTypes().size(); j++){
				System.out.println(typeIn.getAttribute("name"));
				if (modelFactory.getTypes().get(j).getName().equals(typeIn.getAttribute("name")))
				instance.setType(modelFactory.getTypes().get(j));
			}
		}
		
		for (int i = 0; i<modelFactory.getInstances().size(); i++){
			System.out.println("Instance" + modelFactory.getInstances().get(i).getName() + "Type" + modelFactory.getInstances().get(i).getType().getName());
		}		
		
		
		
	}
	
}
