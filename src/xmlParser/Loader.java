package xmlParser;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import model.ComplexEvent;
import model.Environment;
import model.Instance;
import model.ModelFactory;
import model.ModelPackage;
import model.Parameter;
import model.Type;
import model.impl.EnvironmentImpl;


public class Loader {
	
	private Document docTypesInstances;
	private DocumentBuilder dBuilder;
	private ModelPackage modelPackage;
	private ModelFactory modelFactory;
	
	/*
	 * Constructor of the class
	 */
	public Loader() throws ParserConfigurationException{

	    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		dBuilder = dbFactory.newDocumentBuilder();
		modelPackage = ModelPackage.eINSTANCE;
		modelFactory = model.ModelFactory.eINSTANCE;
	   
	}

	/*
	 * Methods that parses the XMI file of types and instances and memorize everything in the model
	 * Maybe I can find a more efficient solution later
	 */
	public Environment parseFiles() throws SAXException, IOException{
	    
		/**********  FIRST VERSION ALGORITHM *********/
		
		/*
		
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
		
		*/
		
		/************ SECOND VERSION ALGORITHM **********/
		Environment env = new EnvironmentImpl();
		/*
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("xmi", new XMIResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource1 = resSet.getResource(URI.createURI("file:/Users/marco/Documents/runtime-New_configuration/ApplicationInstance/instancesTypes.model"), true);
		Resource resource2 = resSet.getResource(URI.createURI("file:/Users/marco/Documents/runtime-New_configuration/ApplicationInstance/ContextRelations.model"), true);
		resource1.load(null);
		resource2.load(null);
		*/		
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
		.put(Resource.Factory.Registry.DEFAULT_EXTENSION,new XMIResourceFactoryImpl());

		// load the resource and resolve the proxies
		ResourceSet rs = new ResourceSetImpl();
		Resource r1 = rs.createResource(URI.createFileURI("/Users/marco/Documents/runtime-New_configuration/ApplicationInstance/instancesTypes.model"));
		Resource r2 = rs.createResource(URI.createFileURI("/Users/marco/Documents/runtime-New_configuration/ApplicationInstance/ContextRelations.model"));
		Resource r3 = rs.createResource(URI.createFileURI("/Users/marco/Documents/runtime-New_configuration/ApplicationInstance/Events.model"));
		Resource r4 = rs.createResource(URI.createFileURI("/Users/marco/Documents/runtime-New_configuration/ApplicationInstance/BehavDescriptions.model"));		
		r1.load(null);
		r2.load(null);
		r3.load(null);
		r4.load(null);
		//EcoreUtil.resolveAll(rs); 
		
		Environment env1 = (Environment) r1.getContents().get(0);
		Environment env2 = (Environment) r2.getContents().get(0);
		Environment env3 = (Environment) r3.getContents().get(0);
		Environment env4 = (Environment) r4.getContents().get(0);		
						
		env.setTypes(env1.getTypes());
		env.setInstances(env1.getInstances());
		env.setContextRelations(env2.getContextRelations());
		env.setEvents(env3.getEvents());
		env.setBehavDescriptions(env4.getBehavDescriptions());
				
		// Verification
		for (int i = 0; i < env.getInstances().size(); i++){
			System.out.println("Instance: " + env.getInstances().get(i).getName() + "  Type: " + env.getInstances().get(i).getType().getName());
		}
		for (int i = 0; i < env.getContextRelations().size(); i++){
			if (env.getContextRelations().get(i).getInitialComplexEvent() != null && env.getContextRelations().get(i).getEndingComplexEvent() != null)
				System.out.println("Context Relation: " + env.getContextRelations().get(i).getName() + "  Parameter1: " + env.getContextRelations().get(i).getParameters().get(0).getType().getName() +
						"  Initial Event: " + env.getContextRelations().get(i).getInitialComplexEvent().getName() +"  Ending Event: " + env.getContextRelations().get(i).getEndingComplexEvent().getName());
			else
				System.out.println("Context Relation: " + env.getContextRelations().get(i).getName() + "  Parameter1: " + env.getContextRelations().get(i).getParameters().get(0).getType().getName());				
		}
		for (int i = 0; i < env.getEvents().size(); i++){
			if (env.getEvents().get(i) instanceof ComplexEvent){
				ComplexEvent ce = (ComplexEvent) env.getEvents().get(i);
				for (int j = 0; j < ce.getBehaviouralDescriptions().getHoldsAts().size(); j++){
					System.out.println("Event: " + env.getEvents().get(i).getName() + "  HoldsAt: " + ce.getBehaviouralDescriptions().getHoldsAts().get(j).getContextRelation().getName());
				}
				for (int j = 0; j < ce.getBehaviouralDescriptions().getHappens().size(); j++){
					System.out.println("Event: " + env.getEvents().get(i).getName() + "  Happens: " + ce.getBehaviouralDescriptions().getHappens().get(j).getContextRelation().getName());
				}
				for (int j = 0; j < ce.getBehaviouralDescriptions().getHoldsAtBetweens().size(); j++){
					System.out.println("Event: " + env.getEvents().get(i).getName() + "  HoldsAtBetween: " + ce.getBehaviouralDescriptions().getHoldsAtBetweens().get(j).getContextRelation().getName());
				}
			}
		}

		return env; 
	} //parseTypesInstances()
	
}
