/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.ComplexEvent#getNumber <em>Number</em>}</li>
 *   <li>{@link model.ComplexEvent#getBehaviouralDescriptions <em>Behavioural Descriptions</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getComplexEvent()
 * @model
 * @generated
 */
public interface ComplexEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see model.ModelPackage#getComplexEvent_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link model.ComplexEvent#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Behavioural Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavioural Descriptions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavioural Descriptions</em>' reference.
	 * @see #setBehaviouralDescriptions(BehaviouralDescription)
	 * @see model.ModelPackage#getComplexEvent_BehaviouralDescriptions()
	 * @model required="true"
	 * @generated
	 */
	BehaviouralDescription getBehaviouralDescriptions();

	/**
	 * Sets the value of the '{@link model.ComplexEvent#getBehaviouralDescriptions <em>Behavioural Descriptions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavioural Descriptions</em>' reference.
	 * @see #getBehaviouralDescriptions()
	 * @generated
	 */
	void setBehaviouralDescriptions(BehaviouralDescription value);

} // ComplexEvent
