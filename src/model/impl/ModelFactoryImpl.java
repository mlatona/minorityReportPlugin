/**
 */
package model.impl;

import model.*;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	
	// Collections of instances
	private ArrayList<Type> types = new ArrayList<Type>();
	private ArrayList<Instance> instances = new ArrayList<Instance>();
	private ArrayList<Event> events = new ArrayList<Event>();
	private ArrayList<ContextRelation> contextRelations = new ArrayList<ContextRelation>();
	private ArrayList<Initially> initials = new ArrayList<Initially>();
	
	// Inside BehaviouralDescription I can find all the references to HoldsAt, Happens, ...
	// Maybe it's Composite Definition and not Behav. Descr.
	private ArrayList<BehaviouralDescription> behavDescriptions = new ArrayList<BehaviouralDescription>();
	
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.TYPE: return createType();
			case ModelPackage.INSTANCE: return createInstance();
			case ModelPackage.PARAMETER: return createParameter();
			case ModelPackage.CONTEXT_RELATION: return createContextRelation();
			case ModelPackage.PRIMITIVE_EVENT: return createPrimitiveEvent();
			case ModelPackage.COMPLEX_EVENT: return createComplexEvent();
			case ModelPackage.BEHAVIOURAL_DESCRIPTION: return createBehaviouralDescription();
			case ModelPackage.HOLDS_AT: return createHoldsAt();
			case ModelPackage.HAPPENS: return createHappens();
			case ModelPackage.HOLDS_AT_BETWEEN: return createHoldsAtBetween();
			case ModelPackage.INITIALLY: return createInitially();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * It creates a new type and the instance is inserted in the 
	 * corresponding ArrayList
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		types.add(type);
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance createInstance() {
		InstanceImpl instance = new InstanceImpl();
		instances.add(instance);
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextRelation createContextRelation() {
		ContextRelationImpl contextRelation = new ContextRelationImpl();
		contextRelations.add(contextRelation);
		return contextRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveEvent createPrimitiveEvent() {
		PrimitiveEventImpl primitiveEvent = new PrimitiveEventImpl();
		return primitiveEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexEvent createComplexEvent() {
		ComplexEventImpl complexEvent = new ComplexEventImpl();
		return complexEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviouralDescription createBehaviouralDescription() {
		BehaviouralDescriptionImpl behaviouralDescription = new BehaviouralDescriptionImpl();
		return behaviouralDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HoldsAt createHoldsAt() {
		HoldsAtImpl holdsAt = new HoldsAtImpl();
		return holdsAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Happens createHappens() {
		HappensImpl happens = new HappensImpl();
		return happens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HoldsAtBetween createHoldsAtBetween() {
		HoldsAtBetweenImpl holdsAtBetween = new HoldsAtBetweenImpl();
		return holdsAtBetween;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initially createInitially() {
		InitiallyImpl initially = new InitiallyImpl();
		return initially;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

	
	/**** Getters and Setters ****/
	
	public ArrayList<Type> getTypes() {
		return types;
	}

	public void setTypes(ArrayList<Type> types) {
		this.types = types;
	}

	public ArrayList<Event> getEvents() {
		return events;
	}

	public void setEvents(ArrayList<Event> events) {
		this.events = events;
	}

	public ArrayList<ContextRelation> getContextRelations() {
		return contextRelations;
	}

	public void setContextRelations(ArrayList<ContextRelation> contextRelations) {
		this.contextRelations = contextRelations;
	}

	public ArrayList<Initially> getInitials() {
		return initials;
	}

	public void setInitials(ArrayList<Initially> initials) {
		this.initials = initials;
	}

	public ArrayList<BehaviouralDescription> getBehavDescriptions() {
		return behavDescriptions;
	}

	public void setBehavDescriptions(ArrayList<BehaviouralDescription> behavDescriptions) {
		this.behavDescriptions = behavDescriptions;
	}

	public ArrayList<Instance> getInstances() {
		return instances;
	}

	public void setInstances(ArrayList<Instance> instances) {
		this.instances = instances;
	}

} //ModelFactoryImpl
