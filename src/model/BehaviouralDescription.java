/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioural Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.BehaviouralDescription#getHoldsAts <em>Holds Ats</em>}</li>
 *   <li>{@link model.BehaviouralDescription#getHappens <em>Happens</em>}</li>
 *   <li>{@link model.BehaviouralDescription#getHoldsAtBetweens <em>Holds At Betweens</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getBehaviouralDescription()
 * @model
 * @generated
 */
public interface BehaviouralDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Holds Ats</b></em>' reference list.
	 * The list contents are of type {@link model.HoldsAt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holds Ats</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holds Ats</em>' reference list.
	 * @see model.ModelPackage#getBehaviouralDescription_HoldsAts()
	 * @model
	 * @generated
	 */
	EList<HoldsAt> getHoldsAts();

	/**
	 * Returns the value of the '<em><b>Happens</b></em>' reference list.
	 * The list contents are of type {@link model.Happens}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Happens</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Happens</em>' reference list.
	 * @see model.ModelPackage#getBehaviouralDescription_Happens()
	 * @model
	 * @generated
	 */
	EList<Happens> getHappens();

	/**
	 * Returns the value of the '<em><b>Holds At Betweens</b></em>' reference list.
	 * The list contents are of type {@link model.HoldsAtBetween}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holds At Betweens</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holds At Betweens</em>' reference list.
	 * @see model.ModelPackage#getBehaviouralDescription_HoldsAtBetweens()
	 * @model
	 * @generated
	 */
	EList<HoldsAtBetween> getHoldsAtBetweens();

} // BehaviouralDescription
