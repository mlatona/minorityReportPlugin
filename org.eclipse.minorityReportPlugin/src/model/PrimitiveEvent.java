/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.PrimitiveEvent#getAgent <em>Agent</em>}</li>
 *   <li>{@link model.PrimitiveEvent#getObserver <em>Observer</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getPrimitiveEvent()
 * @model
 * @generated
 */
public interface PrimitiveEvent extends Event {

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' containment reference.
	 * @see #setAgent(Parameter)
	 * @see model.ModelPackage#getPrimitiveEvent_Agent()
	 * @model containment="true"
	 * @generated
	 */
	Parameter getAgent();

	/**
	 * Sets the value of the '{@link model.PrimitiveEvent#getAgent <em>Agent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' containment reference.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(Parameter value);

	/**
	 * Returns the value of the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observer</em>' containment reference.
	 * @see #setObserver(Parameter)
	 * @see model.ModelPackage#getPrimitiveEvent_Observer()
	 * @model containment="true"
	 * @generated
	 */
	Parameter getObserver();

	/**
	 * Sets the value of the '{@link model.PrimitiveEvent#getObserver <em>Observer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observer</em>' containment reference.
	 * @see #getObserver()
	 * @generated
	 */
	void setObserver(Parameter value);
} // PrimitiveEvent
