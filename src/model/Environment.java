/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Environment#getTypes <em>Types</em>}</li>
 *   <li>{@link model.Environment#getInstances <em>Instances</em>}</li>
 *   <li>{@link model.Environment#getParameters <em>Parameters</em>}</li>
 *   <li>{@link model.Environment#getContextRelations <em>Context Relations</em>}</li>
 *   <li>{@link model.Environment#getEvents <em>Events</em>}</li>
 *   <li>{@link model.Environment#getBehavDescriptions <em>Behav Descriptions</em>}</li>
 *   <li>{@link model.Environment#getHoldsAts <em>Holds Ats</em>}</li>
 *   <li>{@link model.Environment#getHappens <em>Happens</em>}</li>
 *   <li>{@link model.Environment#getHoldsAtBetweens <em>Holds At Betweens</em>}</li>
 *   <li>{@link model.Environment#getInitials <em>Initials</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends EObject {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link model.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see model.ModelPackage#getEnvironment_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link model.Instance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see model.ModelPackage#getEnvironment_Instances()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instance> getInstances();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link model.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see model.ModelPackage#getEnvironment_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Context Relations</b></em>' containment reference list.
	 * The list contents are of type {@link model.ContextRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Relations</em>' containment reference list.
	 * @see model.ModelPackage#getEnvironment_ContextRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextRelation> getContextRelations();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link model.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see model.ModelPackage#getEnvironment_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Behav Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link model.BehaviouralDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behav Descriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behav Descriptions</em>' containment reference list.
	 * @see model.ModelPackage#getEnvironment_BehavDescriptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<BehaviouralDescription> getBehavDescriptions();

	/**
	 * Returns the value of the '<em><b>Holds Ats</b></em>' containment reference list.
	 * The list contents are of type {@link model.HoldsAt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holds Ats</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holds Ats</em>' containment reference list.
	 * @see model.ModelPackage#getEnvironment_HoldsAts()
	 * @model containment="true"
	 * @generated
	 */
	EList<HoldsAt> getHoldsAts();

	/**
	 * Returns the value of the '<em><b>Happens</b></em>' containment reference list.
	 * The list contents are of type {@link model.Happens}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Happens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Happens</em>' containment reference list.
	 * @see model.ModelPackage#getEnvironment_Happens()
	 * @model containment="true"
	 * @generated
	 */
	EList<Happens> getHappens();

	/**
	 * Returns the value of the '<em><b>Holds At Betweens</b></em>' containment reference list.
	 * The list contents are of type {@link model.HoldsAtBetween}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holds At Betweens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holds At Betweens</em>' containment reference list.
	 * @see model.ModelPackage#getEnvironment_HoldsAtBetweens()
	 * @model containment="true"
	 * @generated
	 */
	EList<HoldsAtBetween> getHoldsAtBetweens();

	/**
	 * Returns the value of the '<em><b>Initials</b></em>' containment reference list.
	 * The list contents are of type {@link model.Initially}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initials</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initials</em>' containment reference list.
	 * @see model.ModelPackage#getEnvironment_Initials()
	 * @model containment="true"
	 * @generated
	 */
	EList<Initially> getInitials();
	
	void setTypes(EList<Type> types);
	
	void setInstances(EList<Instance> instances);
	
	void setContextRelations(EList<ContextRelation> contextRelations);
	
	void setEvents(EList<Event> events);
	
	void setBehavDescriptions(EList<BehaviouralDescription> behavDescriptions);

} // Environment
