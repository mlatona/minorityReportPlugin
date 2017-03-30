package xmlParser;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import model.ComplexEvent;
import model.Event;
import model.ModelFactory;
import model.PrimitiveEvent;

public class Loader {
	
	private DocumentBuilderFactory docBuilderFactory;
	private DocumentBuilder docBuilder;
	private Document doc;
	private Element mainRootElement;
	
	private ModelFactory modelFactory;
	
	private ArrayList<Element> types;

	/*
	 * Constructor
	 * It initializes the important building classes
	 */
	public Loader(){
				
        try{
        	// Creation of the important DOM objects
        	docBuilderFactory = DocumentBuilderFactory.newInstance();
        	docBuilder = docBuilderFactory.newDocumentBuilder();
        	doc = docBuilder.newDocument();
        	
        	// Creation of the main root element
        	mainRootElement = doc.createElement("Plugin");
        	doc.appendChild(mainRootElement);
        	
        	// Creation of the reference to the singleton model factory
        	modelFactory = model.ModelFactory.eINSTANCE;
        	
        	
        }
        catch(Exception e){
        	
        	e.printStackTrace();
        }
     
	}//End of constructor 
	/*
	 * Creation of all the Node elements
	 */
	public void createXML(){
		
		// Instantiating arraylists
		types = new ArrayList<Element>();
		
		// I need to write a for cycle for each different class
		// Maybe is better doing multiple methods
		for (int i = 0; i < modelFactory.getTypes().size(); i++){
			Element element = doc.createElement("Type");
			element.setAttribute("Name", modelFactory.getTypes().get(i).getName());
			types.add(element);
			mainRootElement.appendChild(element);
		}
		
		
	}
	
	public void typeXmlBuilder(){
		
		/*for (int i = 0; i < model.getTypes().size(); i++){
			Element typeElement = doc.createElement("Type");
			typeElement.setAttribute("name", model.getTypes().get(i).getName());
			mainRootElement.appendChild(typeElement);
			
		}
		*/
		
	}
	
	/*
	 * It constructs the event tags in the XML document
	 */
	public void eventXmlBuilder(Event event){
		
		if (event instanceof PrimitiveEvent){
			Element eventElement = doc.createElement("Event");
			doc.appendChild(eventElement);
			eventElement.setAttribute("type", "PrimitiveEvent");
			eventElement.setAttribute("name", event.getName());
			
			Element parameterElement = doc.createElement("Parameter");
			parameterElement.setAttribute("number", String.valueOf(event.getParameters().get(0).getNumber()));
			eventElement.appendChild(parameterElement);
		}
		
		if (event instanceof ComplexEvent){	
			Element eventElement = doc.createElement("Event");
			doc.appendChild(eventElement);
			eventElement.setAttribute("type", "ComplexEvent");
			eventElement.setAttribute("name", event.getName());
			eventElement.setAttribute("number",String.valueOf(((ComplexEvent) event).getNumber()));
		}
		
	}
	
	/*
	 * It outputs the generated Document to console
	 */
	public void outputToConsole() throws TransformerFactoryConfigurationError, TransformerException{
		
		// output DOM XML to console 
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes"); 
        DOMSource source = new DOMSource(doc);
        StreamResult console = new StreamResult(System.out);
        transformer.transform(source, console);
		
	}
	
	public void outputToFile() throws TransformerFactoryConfigurationError, TransformerException{
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes"); 
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File("file.xml"));
        transformer.transform(source, result);

	}
	
}
