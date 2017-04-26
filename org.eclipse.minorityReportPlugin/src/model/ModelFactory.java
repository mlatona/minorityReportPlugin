/**
 */
package model;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = model.impl.ModelFactoryImpl.init();
	
	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance</em>'.
	 * @generated
	 */
	Instance createInstance();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Context Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Relation</em>'.
	 * @generated
	 */
	ContextRelation createContextRelation();

	/**
	 * Returns a new object of class '<em>Primitive Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Event</em>'.
	 * @generated
	 */
	PrimitiveEvent createPrimitiveEvent();

	/**
	 * Returns a new object of class '<em>Complex Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Event</em>'.
	 * @generated
	 */
	ComplexEvent createComplexEvent();

	/**
	 * Returns a new object of class '<em>Behavioural Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavioural Description</em>'.
	 * @generated
	 */
	BehaviouralDescription createBehaviouralDescription();

	/**
	 * Returns a new object of class '<em>Holds At</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Holds At</em>'.
	 * @generated
	 */
	HoldsAt createHoldsAt();

	/**
	 * Returns a new object of class '<em>Happens</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Happens</em>'.
	 * @generated
	 */
	Happens createHappens();

	/**
	 * Returns a new object of class '<em>Holds At Between</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Holds At Between</em>'.
	 * @generated
	 */
	HoldsAtBetween createHoldsAtBetween();

	/**
	 * Returns a new object of class '<em>Initially</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initially</em>'.
	 * @generated
	 */
	Initially createInitially();

	/**
	 * Returns a new object of class '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment</em>'.
	 * @generated
	 */
	Environment createEnvironment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();
	
	ArrayList<Type> getTypes();
	
	ArrayList<Instance> getInstances();
	
	ArrayList<Event> getEvents();
	
	ArrayList<ContextRelation> getContextRelations();
	
	ArrayList<BehaviouralDescription> getBehavDescriptions();
	
	ArrayList<Initially> getInitials();
	
	void setTypes(ArrayList<Type> types);
	
	void setInstances(ArrayList<Instance> instances);
	
	void setEvents(ArrayList<Event> events);
	
	void setContextRelations(ArrayList<ContextRelation> contextRelations);
	
	void setBehavDescriptions(ArrayList<BehaviouralDescription> behavDescriptions);
	
	void setInitials(ArrayList<Initially> initials);
	
	

} //ModelFactory
