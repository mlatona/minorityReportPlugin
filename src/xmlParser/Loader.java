package xmlParser;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import model.ComplexEvent;
import model.Event;
import model.PrimitiveEvent;


public class Loader {
	
	private DocumentBuilderFactory docBuilderFactory;
	private DocumentBuilder docBuilder;
	private Document doc;

	/*
	 * Constructor
	 * It initializes the important building classes
	 */
	public Loader(){
		
        try{
        	docBuilderFactory = DocumentBuilderFactory.newInstance();
        	docBuilder = docBuilderFactory.newDocumentBuilder();
        	doc = docBuilder.newDocument();
        	
        	//Element mainRootElement = doc.createElement("Event");
        	//doc.appendChild(mainRootElement);
   
  
         //    Element mainRootElement = doc.createElementNS("http://crunchify.com/CrunchifyCreateXMLDOM", "Companies");
         //    doc.appendChild(mainRootElement);
        	
        }
        catch(Exception e){
        	
        	e.printStackTrace();
        }
     
		
	}//End of constructor 
	
	/*
	 * It constructs the XML document
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
	
}
