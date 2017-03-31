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
	private ArrayList<Element> instances;
	private ArrayList<Element> contextRelations;
	private ArrayList<Element> parameters;	
	
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
        	
        	// Instantiating ArrayLists
    		types = new ArrayList<Element>();
    		instances = new ArrayList<Element>();
    		contextRelations = new ArrayList<Element>();
    		parameters = new ArrayList<Element>();
        	
        }
        catch(Exception e){
        	
        	e.printStackTrace();
        }
     
	}//End of constructor 
	/*
	 * Creation of all the Node elements
	 */
	public void createXML(){
		
		// I need to write a for cycle for each different class
		// Maybe is better doing multiple methods
		
		// List of types
		for (int i = 0; i < modelFactory.getTypes().size(); i++){
			Element element = doc.createElement("Type");
			element.setAttribute("name", modelFactory.getTypes().get(i).getName());
			types.add(element);
			mainRootElement.appendChild(element);
		}
		
		// Association instance - type
		for (int i = 0; i < modelFactory.getInstances().size(); i++){
			Element element = doc.createElement("Instance");
			element.setAttribute("name", modelFactory.getInstances().get(i).getName());
			element.setAttribute("type", modelFactory.getInstances().get(i).getType().getName());
			instances.add(element);
			mainRootElement.appendChild(element);
		}
		
		// List of Context Relations
		for (int i = 0; i < modelFactory.getContextRelations().size(); i++){
			
			// Creating ContextRelation element
			Element contextRelationElement = doc.createElement("ContextRelation");
			contextRelationElement.setAttribute("name", modelFactory.getContextRelations().get(i).getName());
			if(modelFactory.getContextRelations().get(i).isValue())
				contextRelationElement.setAttribute("value", "true");
			else if (!modelFactory.getContextRelations().get(i).isValue())
				contextRelationElement.setAttribute("value", "false");
			
			contextRelations.add(contextRelationElement);
			
			// Creating Parameter elements
			Element parameter1Element = doc.createElement("Parameter1");
			Element parameter2Element = doc.createElement("Parameter2");
			parameter1Element.setAttribute("type", modelFactory.getContextRelations().get(i).getParameters().get(0).getType().getName());
			parameter2Element.setAttribute("type", modelFactory.getContextRelations().get(i).getParameters().get(1).getType().getName());

			parameters.add(parameter1Element);
			parameters.add(parameter2Element);
			
			mainRootElement.appendChild(contextRelationElement);
			contextRelationElement.appendChild(parameter1Element);
			contextRelationElement.appendChild(parameter2Element);

		}
		
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
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        DOMSource source = new DOMSource(doc);
        StreamResult console = new StreamResult(System.out);
        transformer.transform(source, console);
		
	}
	
	public void outputToFile() throws TransformerFactoryConfigurationError, TransformerException{
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File("file.xml"));
        transformer.transform(source, result);

	}
	
}
