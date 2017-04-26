/**
 */
package model.impl;

import model.BehaviouralDescription;
import model.ComplexEvent;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.ComplexEventImpl#getTime <em>Time</em>}</li>
 *   <li>{@link model.impl.ComplexEventImpl#getBehaviouralDescriptions <em>Behavioural Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexEventImpl extends EventImpl implements ComplexEvent {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected int time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBehaviouralDescriptions() <em>Behavioural Descriptions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviouralDescriptions()
	 * @generated
	 * @ordered
	 */
	protected BehaviouralDescription behaviouralDescriptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.COMPLEX_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(int newTime) {
		int oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMPLEX_EVENT__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviouralDescription getBehaviouralDescriptions() {
		if (behaviouralDescriptions != null && behaviouralDescriptions.eIsProxy()) {
			InternalEObject oldBehaviouralDescriptions = (InternalEObject)behaviouralDescriptions;
			behaviouralDescriptions = (BehaviouralDescription)eResolveProxy(oldBehaviouralDescriptions);
			if (behaviouralDescriptions != oldBehaviouralDescriptions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.COMPLEX_EVENT__BEHAVIOURAL_DESCRIPTIONS, oldBehaviouralDescriptions, behaviouralDescriptions));
			}
		}
		return behaviouralDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviouralDescription basicGetBehaviouralDescriptions() {
		return behaviouralDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviouralDescriptions(BehaviouralDescription newBehaviouralDescriptions) {
		BehaviouralDescription oldBehaviouralDescriptions = behaviouralDescriptions;
		behaviouralDescriptions = newBehaviouralDescriptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMPLEX_EVENT__BEHAVIOURAL_DESCRIPTIONS, oldBehaviouralDescriptions, behaviouralDescriptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.COMPLEX_EVENT__TIME:
				return getTime();
			case ModelPackage.COMPLEX_EVENT__BEHAVIOURAL_DESCRIPTIONS:
				if (resolve) return getBehaviouralDescriptions();
				return basicGetBehaviouralDescriptions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.COMPLEX_EVENT__TIME:
				setTime((Integer)newValue);
				return;
			case ModelPackage.COMPLEX_EVENT__BEHAVIOURAL_DESCRIPTIONS:
				setBehaviouralDescriptions((BehaviouralDescription)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.COMPLEX_EVENT__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case ModelPackage.COMPLEX_EVENT__BEHAVIOURAL_DESCRIPTIONS:
				setBehaviouralDescriptions((BehaviouralDescription)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.COMPLEX_EVENT__TIME:
				return time != TIME_EDEFAULT;
			case ModelPackage.COMPLEX_EVENT__BEHAVIOURAL_DESCRIPTIONS:
				return behaviouralDescriptions != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //ComplexEventImpl
