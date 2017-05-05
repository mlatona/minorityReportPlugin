/**
 */
package model.impl;

import java.util.Collection;

import model.BehaviouralDescription;
import model.ContextRelation;
import model.Environment;
import model.Event;
import model.Happens;
import model.HoldsAt;
import model.HoldsAtBetween;
import model.Initially;
import model.Instance;
import model.ModelPackage;
import model.Parameter;
import model.Type;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.EnvironmentImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link model.impl.EnvironmentImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link model.impl.EnvironmentImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link model.impl.EnvironmentImpl#getContextRelations <em>Context Relations</em>}</li>
 *   <li>{@link model.impl.EnvironmentImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link model.impl.EnvironmentImpl#getBehavDescriptions <em>Behav Descriptions</em>}</li>
 *   <li>{@link model.impl.EnvironmentImpl#getHoldsAts <em>Holds Ats</em>}</li>
 *   <li>{@link model.impl.EnvironmentImpl#getHappens <em>Happens</em>}</li>
 *   <li>{@link model.impl.EnvironmentImpl#getHoldsAtBetweens <em>Holds At Betweens</em>}</li>
 *   <li>{@link model.impl.EnvironmentImpl#getInitials <em>Initials</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentImpl extends MinimalEObjectImpl.Container implements Environment {
	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<Instance> instances;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getContextRelations() <em>Context Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextRelation> contextRelations;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getBehavDescriptions() <em>Behav Descriptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviouralDescription> behavDescriptions;

	/**
	 * The cached value of the '{@link #getHoldsAts() <em>Holds Ats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldsAts()
	 * @generated
	 * @ordered
	 */
	protected EList<HoldsAt> holdsAts;

	/**
	 * The cached value of the '{@link #getHappens() <em>Happens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHappens()
	 * @generated
	 * @ordered
	 */
	protected EList<Happens> happens;

	/**
	 * The cached value of the '{@link #getHoldsAtBetweens() <em>Holds At Betweens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldsAtBetweens()
	 * @generated
	 * @ordered
	 */
	protected EList<HoldsAtBetween> holdsAtBetweens;

	/**
	 * The cached value of the '{@link #getInitials() <em>Initials</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitials()
	 * @generated
	 * @ordered
	 */
	protected EList<Initially> initials;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<Type>(Type.class, this, ModelPackage.ENVIRONMENT__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instance> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentEList<Instance>(Instance.class, this, ModelPackage.ENVIRONMENT__INSTANCES);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, ModelPackage.ENVIRONMENT__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextRelation> getContextRelations() {
		if (contextRelations == null) {
			contextRelations = new EObjectContainmentEList<ContextRelation>(ContextRelation.class, this, ModelPackage.ENVIRONMENT__CONTEXT_RELATIONS);
		}
		return contextRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, ModelPackage.ENVIRONMENT__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviouralDescription> getBehavDescriptions() {
		if (behavDescriptions == null) {
			behavDescriptions = new EObjectContainmentEList<BehaviouralDescription>(BehaviouralDescription.class, this, ModelPackage.ENVIRONMENT__BEHAV_DESCRIPTIONS);
		}
		return behavDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HoldsAt> getHoldsAts() {
		if (holdsAts == null) {
			holdsAts = new EObjectContainmentEList<HoldsAt>(HoldsAt.class, this, ModelPackage.ENVIRONMENT__HOLDS_ATS);
		}
		return holdsAts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Happens> getHappens() {
		if (happens == null) {
			happens = new EObjectContainmentEList<Happens>(Happens.class, this, ModelPackage.ENVIRONMENT__HAPPENS);
		}
		return happens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HoldsAtBetween> getHoldsAtBetweens() {
		if (holdsAtBetweens == null) {
			holdsAtBetweens = new EObjectContainmentEList<HoldsAtBetween>(HoldsAtBetween.class, this, ModelPackage.ENVIRONMENT__HOLDS_AT_BETWEENS);
		}
		return holdsAtBetweens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Initially> getInitials() {
		if (initials == null) {
			initials = new EObjectContainmentEList<Initially>(Initially.class, this, ModelPackage.ENVIRONMENT__INITIALS);
		}
		return initials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ENVIRONMENT__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case ModelPackage.ENVIRONMENT__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
			case ModelPackage.ENVIRONMENT__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case ModelPackage.ENVIRONMENT__CONTEXT_RELATIONS:
				return ((InternalEList<?>)getContextRelations()).basicRemove(otherEnd, msgs);
			case ModelPackage.ENVIRONMENT__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case ModelPackage.ENVIRONMENT__BEHAV_DESCRIPTIONS:
				return ((InternalEList<?>)getBehavDescriptions()).basicRemove(otherEnd, msgs);
			case ModelPackage.ENVIRONMENT__HOLDS_ATS:
				return ((InternalEList<?>)getHoldsAts()).basicRemove(otherEnd, msgs);
			case ModelPackage.ENVIRONMENT__HAPPENS:
				return ((InternalEList<?>)getHappens()).basicRemove(otherEnd, msgs);
			case ModelPackage.ENVIRONMENT__HOLDS_AT_BETWEENS:
				return ((InternalEList<?>)getHoldsAtBetweens()).basicRemove(otherEnd, msgs);
			case ModelPackage.ENVIRONMENT__INITIALS:
				return ((InternalEList<?>)getInitials()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.ENVIRONMENT__TYPES:
				return getTypes();
			case ModelPackage.ENVIRONMENT__INSTANCES:
				return getInstances();
			case ModelPackage.ENVIRONMENT__PARAMETERS:
				return getParameters();
			case ModelPackage.ENVIRONMENT__CONTEXT_RELATIONS:
				return getContextRelations();
			case ModelPackage.ENVIRONMENT__EVENTS:
				return getEvents();
			case ModelPackage.ENVIRONMENT__BEHAV_DESCRIPTIONS:
				return getBehavDescriptions();
			case ModelPackage.ENVIRONMENT__HOLDS_ATS:
				return getHoldsAts();
			case ModelPackage.ENVIRONMENT__HAPPENS:
				return getHappens();
			case ModelPackage.ENVIRONMENT__HOLDS_AT_BETWEENS:
				return getHoldsAtBetweens();
			case ModelPackage.ENVIRONMENT__INITIALS:
				return getInitials();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.ENVIRONMENT__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case ModelPackage.ENVIRONMENT__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends Instance>)newValue);
				return;
			case ModelPackage.ENVIRONMENT__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ModelPackage.ENVIRONMENT__CONTEXT_RELATIONS:
				getContextRelations().clear();
				getContextRelations().addAll((Collection<? extends ContextRelation>)newValue);
				return;
			case ModelPackage.ENVIRONMENT__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case ModelPackage.ENVIRONMENT__BEHAV_DESCRIPTIONS:
				getBehavDescriptions().clear();
				getBehavDescriptions().addAll((Collection<? extends BehaviouralDescription>)newValue);
				return;
			case ModelPackage.ENVIRONMENT__HOLDS_ATS:
				getHoldsAts().clear();
				getHoldsAts().addAll((Collection<? extends HoldsAt>)newValue);
				return;
			case ModelPackage.ENVIRONMENT__HAPPENS:
				getHappens().clear();
				getHappens().addAll((Collection<? extends Happens>)newValue);
				return;
			case ModelPackage.ENVIRONMENT__HOLDS_AT_BETWEENS:
				getHoldsAtBetweens().clear();
				getHoldsAtBetweens().addAll((Collection<? extends HoldsAtBetween>)newValue);
				return;
			case ModelPackage.ENVIRONMENT__INITIALS:
				getInitials().clear();
				getInitials().addAll((Collection<? extends Initially>)newValue);
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
			case ModelPackage.ENVIRONMENT__TYPES:
				getTypes().clear();
				return;
			case ModelPackage.ENVIRONMENT__INSTANCES:
				getInstances().clear();
				return;
			case ModelPackage.ENVIRONMENT__PARAMETERS:
				getParameters().clear();
				return;
			case ModelPackage.ENVIRONMENT__CONTEXT_RELATIONS:
				getContextRelations().clear();
				return;
			case ModelPackage.ENVIRONMENT__EVENTS:
				getEvents().clear();
				return;
			case ModelPackage.ENVIRONMENT__BEHAV_DESCRIPTIONS:
				getBehavDescriptions().clear();
				return;
			case ModelPackage.ENVIRONMENT__HOLDS_ATS:
				getHoldsAts().clear();
				return;
			case ModelPackage.ENVIRONMENT__HAPPENS:
				getHappens().clear();
				return;
			case ModelPackage.ENVIRONMENT__HOLDS_AT_BETWEENS:
				getHoldsAtBetweens().clear();
				return;
			case ModelPackage.ENVIRONMENT__INITIALS:
				getInitials().clear();
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
			case ModelPackage.ENVIRONMENT__TYPES:
				return types != null && !types.isEmpty();
			case ModelPackage.ENVIRONMENT__INSTANCES:
				return instances != null && !instances.isEmpty();
			case ModelPackage.ENVIRONMENT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ModelPackage.ENVIRONMENT__CONTEXT_RELATIONS:
				return contextRelations != null && !contextRelations.isEmpty();
			case ModelPackage.ENVIRONMENT__EVENTS:
				return events != null && !events.isEmpty();
			case ModelPackage.ENVIRONMENT__BEHAV_DESCRIPTIONS:
				return behavDescriptions != null && !behavDescriptions.isEmpty();
			case ModelPackage.ENVIRONMENT__HOLDS_ATS:
				return holdsAts != null && !holdsAts.isEmpty();
			case ModelPackage.ENVIRONMENT__HAPPENS:
				return happens != null && !happens.isEmpty();
			case ModelPackage.ENVIRONMENT__HOLDS_AT_BETWEENS:
				return holdsAtBetweens != null && !holdsAtBetweens.isEmpty();
			case ModelPackage.ENVIRONMENT__INITIALS:
				return initials != null && !initials.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	
	public void setTypes(EList<Type> types) {
		this.types = types;
	}

	public void setInstances(EList<Instance> instances) {
		this.instances = instances;
	}

	public void setParameters(EList<Parameter> parameters) {
		this.parameters = parameters;
	}

	public void setContextRelations(EList<ContextRelation> contextRelations) {
		this.contextRelations = contextRelations;
	}

	public void setEvents(EList<Event> events) {
		this.events = events;
	}

	public void setBehavDescriptions(EList<BehaviouralDescription> behavDescriptions) {
		this.behavDescriptions = behavDescriptions;
	}

	public void setHoldsAts(EList<HoldsAt> holdsAts) {
		this.holdsAts = holdsAts;
	}

	public void setHappens(EList<Happens> happens) {
		this.happens = happens;
	}

	public void setHoldsAtBetweens(EList<HoldsAtBetween> holdsAtBetweens) {
		this.holdsAtBetweens = holdsAtBetweens;
	}

	public void setInitials(EList<Initially> initials) {
		this.initials = initials;
	}

} //EnvironmentImpl
