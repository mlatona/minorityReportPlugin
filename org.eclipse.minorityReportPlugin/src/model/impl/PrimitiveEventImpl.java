/**
 */
package model.impl;

import model.ModelPackage;
import model.Parameter;
import model.PrimitiveEvent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.PrimitiveEventImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link model.impl.PrimitiveEventImpl#getObserver <em>Observer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimitiveEventImpl extends EventImpl implements PrimitiveEvent {
	/**
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected Parameter agent;
	/**
	 * The cached value of the '{@link #getObserver() <em>Observer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObserver()
	 * @generated
	 * @ordered
	 */
	protected Parameter observer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PRIMITIVE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getAgent() {
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgent(Parameter newAgent, NotificationChain msgs) {
		Parameter oldAgent = agent;
		agent = newAgent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.PRIMITIVE_EVENT__AGENT, oldAgent, newAgent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgent(Parameter newAgent) {
		if (newAgent != agent) {
			NotificationChain msgs = null;
			if (agent != null)
				msgs = ((InternalEObject)agent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PRIMITIVE_EVENT__AGENT, null, msgs);
			if (newAgent != null)
				msgs = ((InternalEObject)newAgent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PRIMITIVE_EVENT__AGENT, null, msgs);
			msgs = basicSetAgent(newAgent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRIMITIVE_EVENT__AGENT, newAgent, newAgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getObserver() {
		return observer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObserver(Parameter newObserver, NotificationChain msgs) {
		Parameter oldObserver = observer;
		observer = newObserver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.PRIMITIVE_EVENT__OBSERVER, oldObserver, newObserver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObserver(Parameter newObserver) {
		if (newObserver != observer) {
			NotificationChain msgs = null;
			if (observer != null)
				msgs = ((InternalEObject)observer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PRIMITIVE_EVENT__OBSERVER, null, msgs);
			if (newObserver != null)
				msgs = ((InternalEObject)newObserver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PRIMITIVE_EVENT__OBSERVER, null, msgs);
			msgs = basicSetObserver(newObserver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRIMITIVE_EVENT__OBSERVER, newObserver, newObserver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.PRIMITIVE_EVENT__AGENT:
				return basicSetAgent(null, msgs);
			case ModelPackage.PRIMITIVE_EVENT__OBSERVER:
				return basicSetObserver(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PRIMITIVE_EVENT__AGENT:
				return getAgent();
			case ModelPackage.PRIMITIVE_EVENT__OBSERVER:
				return getObserver();
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
			case ModelPackage.PRIMITIVE_EVENT__AGENT:
				setAgent((Parameter)newValue);
				return;
			case ModelPackage.PRIMITIVE_EVENT__OBSERVER:
				setObserver((Parameter)newValue);
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
			case ModelPackage.PRIMITIVE_EVENT__AGENT:
				setAgent((Parameter)null);
				return;
			case ModelPackage.PRIMITIVE_EVENT__OBSERVER:
				setObserver((Parameter)null);
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
			case ModelPackage.PRIMITIVE_EVENT__AGENT:
				return agent != null;
			case ModelPackage.PRIMITIVE_EVENT__OBSERVER:
				return observer != null;
		}
		return super.eIsSet(featureID);
	}

} //PrimitiveEventImpl
