package general.model.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import general.model.diagram.edit.parts.BehaviouralDescriptionEditPart;
import general.model.diagram.edit.parts.BehaviouralDescriptionHappensEditPart;
import general.model.diagram.edit.parts.BehaviouralDescriptionHoldsAtBetweensEditPart;
import general.model.diagram.edit.parts.BehaviouralDescriptionHoldsAtsEditPart;
import general.model.diagram.edit.parts.ComplexEventBehaviouralDescriptionsEditPart;
import general.model.diagram.edit.parts.ComplexEventEditPart;
import general.model.diagram.edit.parts.ContextRelationEditPart;
import general.model.diagram.edit.parts.ContextRelationEndingComplexEventEditPart;
import general.model.diagram.edit.parts.ContextRelationInitialComplexEventEditPart;
import general.model.diagram.edit.parts.ContextRelationParametersEditPart;
import general.model.diagram.edit.parts.EnvironmentEditPart;
import general.model.diagram.edit.parts.EventParametersEditPart;
import general.model.diagram.edit.parts.HappensEditPart;
import general.model.diagram.edit.parts.HappensEventEditPart;
import general.model.diagram.edit.parts.HoldsAtBetweenContextRelationEditPart;
import general.model.diagram.edit.parts.HoldsAtBetweenEditPart;
import general.model.diagram.edit.parts.HoldsAtContextRelationEditPart;
import general.model.diagram.edit.parts.HoldsAtEditPart;
import general.model.diagram.edit.parts.InitiallyContextRelationEditPart;
import general.model.diagram.edit.parts.InitiallyEditPart;
import general.model.diagram.edit.parts.InitiallyHappensEditPart;
import general.model.diagram.edit.parts.InitiallyHoldsAtBetweensEditPart;
import general.model.diagram.edit.parts.InitiallyHoldsAtsEditPart;
import general.model.diagram.edit.parts.InstanceEditPart;
import general.model.diagram.edit.parts.InstanceTypeEditPart;
import general.model.diagram.edit.parts.ParameterEditPart;
import general.model.diagram.edit.parts.ParameterInstanceEditPart;
import general.model.diagram.edit.parts.ParameterTypeEditPart;
import general.model.diagram.edit.parts.PrimitiveEventEditPart;
import general.model.diagram.edit.parts.TypeEditPart;
import general.model.diagram.providers.ModelElementTypes;
import model.BehaviouralDescription;
import model.ComplexEvent;
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
import model.PrimitiveEvent;
import model.Type;

/**
 * @generated
 */
public class ModelDiagramUpdater {

	/**
	* @generated
	*/
	public static List<ModelNodeDescriptor> getSemanticChildren(View view) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case EnvironmentEditPart.VISUAL_ID:
			return getEnvironment_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ModelNodeDescriptor> getEnvironment_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Environment modelElement = (Environment) view.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTypes().iterator(); it.hasNext();) {
			Type childElement = (Type) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == TypeEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getParameters().iterator(); it.hasNext();) {
			Parameter childElement = (Parameter) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ParameterEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHoldsAtBetweens().iterator(); it.hasNext();) {
			HoldsAtBetween childElement = (HoldsAtBetween) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HoldsAtBetweenEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getInstances().iterator(); it.hasNext();) {
			Instance childElement = (Instance) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InstanceEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHappens().iterator(); it.hasNext();) {
			Happens childElement = (Happens) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HappensEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getInitials().iterator(); it.hasNext();) {
			Initially childElement = (Initially) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InitiallyEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getBehavDescriptions().iterator(); it.hasNext();) {
			BehaviouralDescription childElement = (BehaviouralDescription) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == BehaviouralDescriptionEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHoldsAts().iterator(); it.hasNext();) {
			HoldsAt childElement = (HoldsAt) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HoldsAtEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEvents().iterator(); it.hasNext();) {
			Event childElement = (Event) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PrimitiveEventEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComplexEventEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getContextRelations().iterator(); it.hasNext();) {
			ContextRelation childElement = (ContextRelation) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ContextRelationEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ModelLinkDescriptor> getContainedLinks(View view) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case EnvironmentEditPart.VISUAL_ID:
			return getEnvironment_1000ContainedLinks(view);
		case TypeEditPart.VISUAL_ID:
			return getType_2001ContainedLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_2002ContainedLinks(view);
		case HoldsAtBetweenEditPart.VISUAL_ID:
			return getHoldsAtBetween_2003ContainedLinks(view);
		case InstanceEditPart.VISUAL_ID:
			return getInstance_2004ContainedLinks(view);
		case HappensEditPart.VISUAL_ID:
			return getHappens_2005ContainedLinks(view);
		case InitiallyEditPart.VISUAL_ID:
			return getInitially_2006ContainedLinks(view);
		case BehaviouralDescriptionEditPart.VISUAL_ID:
			return getBehaviouralDescription_2007ContainedLinks(view);
		case HoldsAtEditPart.VISUAL_ID:
			return getHoldsAt_2008ContainedLinks(view);
		case PrimitiveEventEditPart.VISUAL_ID:
			return getPrimitiveEvent_2009ContainedLinks(view);
		case ComplexEventEditPart.VISUAL_ID:
			return getComplexEvent_2010ContainedLinks(view);
		case ContextRelationEditPart.VISUAL_ID:
			return getContextRelation_2011ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ModelLinkDescriptor> getIncomingLinks(View view) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case TypeEditPart.VISUAL_ID:
			return getType_2001IncomingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_2002IncomingLinks(view);
		case HoldsAtBetweenEditPart.VISUAL_ID:
			return getHoldsAtBetween_2003IncomingLinks(view);
		case InstanceEditPart.VISUAL_ID:
			return getInstance_2004IncomingLinks(view);
		case HappensEditPart.VISUAL_ID:
			return getHappens_2005IncomingLinks(view);
		case InitiallyEditPart.VISUAL_ID:
			return getInitially_2006IncomingLinks(view);
		case BehaviouralDescriptionEditPart.VISUAL_ID:
			return getBehaviouralDescription_2007IncomingLinks(view);
		case HoldsAtEditPart.VISUAL_ID:
			return getHoldsAt_2008IncomingLinks(view);
		case PrimitiveEventEditPart.VISUAL_ID:
			return getPrimitiveEvent_2009IncomingLinks(view);
		case ComplexEventEditPart.VISUAL_ID:
			return getComplexEvent_2010IncomingLinks(view);
		case ContextRelationEditPart.VISUAL_ID:
			return getContextRelation_2011IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ModelLinkDescriptor> getOutgoingLinks(View view) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case TypeEditPart.VISUAL_ID:
			return getType_2001OutgoingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_2002OutgoingLinks(view);
		case HoldsAtBetweenEditPart.VISUAL_ID:
			return getHoldsAtBetween_2003OutgoingLinks(view);
		case InstanceEditPart.VISUAL_ID:
			return getInstance_2004OutgoingLinks(view);
		case HappensEditPart.VISUAL_ID:
			return getHappens_2005OutgoingLinks(view);
		case InitiallyEditPart.VISUAL_ID:
			return getInitially_2006OutgoingLinks(view);
		case BehaviouralDescriptionEditPart.VISUAL_ID:
			return getBehaviouralDescription_2007OutgoingLinks(view);
		case HoldsAtEditPart.VISUAL_ID:
			return getHoldsAt_2008OutgoingLinks(view);
		case PrimitiveEventEditPart.VISUAL_ID:
			return getPrimitiveEvent_2009OutgoingLinks(view);
		case ComplexEventEditPart.VISUAL_ID:
			return getComplexEvent_2010OutgoingLinks(view);
		case ContextRelationEditPart.VISUAL_ID:
			return getContextRelation_2011OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getEnvironment_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getType_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getParameter_2002ContainedLinks(View view) {
		Parameter modelElement = (Parameter) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Parameter_Instance_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Parameter_Type_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getHoldsAtBetween_2003ContainedLinks(View view) {
		HoldsAtBetween modelElement = (HoldsAtBetween) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_HoldsAtBetween_ContextRelation_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getInstance_2004ContainedLinks(View view) {
		Instance modelElement = (Instance) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Instance_Type_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getHappens_2005ContainedLinks(View view) {
		Happens modelElement = (Happens) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Happens_Event_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getInitially_2006ContainedLinks(View view) {
		Initially modelElement = (Initially) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Initially_ContextRelation_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Initially_HoldsAts_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Initially_HoldsAtBetweens_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Initially_Happens_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getBehaviouralDescription_2007ContainedLinks(View view) {
		BehaviouralDescription modelElement = (BehaviouralDescription) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_BehaviouralDescription_HoldsAtBetweens_4014(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_BehaviouralDescription_HoldsAts_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_BehaviouralDescription_Happens_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getHoldsAt_2008ContainedLinks(View view) {
		HoldsAt modelElement = (HoldsAt) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_HoldsAt_ContextRelation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getPrimitiveEvent_2009ContainedLinks(View view) {
		PrimitiveEvent modelElement = (PrimitiveEvent) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Event_Parameters_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getComplexEvent_2010ContainedLinks(View view) {
		ComplexEvent modelElement = (ComplexEvent) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ComplexEvent_BehaviouralDescriptions_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Event_Parameters_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getContextRelation_2011ContainedLinks(View view) {
		ContextRelation modelElement = (ContextRelation) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextRelation_Parameters_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextRelation_EndingComplexEvent_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextRelation_InitialComplexEvent_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getType_2001IncomingLinks(View view) {
		Type modelElement = (Type) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Parameter_Type_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Instance_Type_4018(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getParameter_2002IncomingLinks(View view) {
		Parameter modelElement = (Parameter) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ContextRelation_Parameters_4003(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Event_Parameters_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getHoldsAtBetween_2003IncomingLinks(View view) {
		HoldsAtBetween modelElement = (HoldsAtBetween) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Initially_HoldsAtBetweens_4009(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_BehaviouralDescription_HoldsAtBetweens_4014(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getInstance_2004IncomingLinks(View view) {
		Instance modelElement = (Instance) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Parameter_Instance_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getHappens_2005IncomingLinks(View view) {
		Happens modelElement = (Happens) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Initially_Happens_4011(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_BehaviouralDescription_Happens_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getInitially_2006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getBehaviouralDescription_2007IncomingLinks(View view) {
		BehaviouralDescription modelElement = (BehaviouralDescription) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ComplexEvent_BehaviouralDescriptions_4010(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getHoldsAt_2008IncomingLinks(View view) {
		HoldsAt modelElement = (HoldsAt) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Initially_HoldsAts_4008(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_BehaviouralDescription_HoldsAts_4015(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getPrimitiveEvent_2009IncomingLinks(View view) {
		PrimitiveEvent modelElement = (PrimitiveEvent) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Happens_Event_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getComplexEvent_2010IncomingLinks(View view) {
		ComplexEvent modelElement = (ComplexEvent) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ContextRelation_EndingComplexEvent_4006(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Happens_Event_4007(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ContextRelation_InitialComplexEvent_4016(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getContextRelation_2011IncomingLinks(View view) {
		ContextRelation modelElement = (ContextRelation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_HoldsAt_ContextRelation_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Initially_ContextRelation_4005(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_HoldsAtBetween_ContextRelation_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getType_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getParameter_2002OutgoingLinks(View view) {
		Parameter modelElement = (Parameter) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Parameter_Instance_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Parameter_Type_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getHoldsAtBetween_2003OutgoingLinks(View view) {
		HoldsAtBetween modelElement = (HoldsAtBetween) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_HoldsAtBetween_ContextRelation_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getInstance_2004OutgoingLinks(View view) {
		Instance modelElement = (Instance) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Instance_Type_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getHappens_2005OutgoingLinks(View view) {
		Happens modelElement = (Happens) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Happens_Event_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getInitially_2006OutgoingLinks(View view) {
		Initially modelElement = (Initially) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Initially_ContextRelation_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Initially_HoldsAts_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Initially_HoldsAtBetweens_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Initially_Happens_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getBehaviouralDescription_2007OutgoingLinks(View view) {
		BehaviouralDescription modelElement = (BehaviouralDescription) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_BehaviouralDescription_HoldsAtBetweens_4014(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_BehaviouralDescription_HoldsAts_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_BehaviouralDescription_Happens_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getHoldsAt_2008OutgoingLinks(View view) {
		HoldsAt modelElement = (HoldsAt) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_HoldsAt_ContextRelation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getPrimitiveEvent_2009OutgoingLinks(View view) {
		PrimitiveEvent modelElement = (PrimitiveEvent) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Event_Parameters_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getComplexEvent_2010OutgoingLinks(View view) {
		ComplexEvent modelElement = (ComplexEvent) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ComplexEvent_BehaviouralDescriptions_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Event_Parameters_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getContextRelation_2011OutgoingLinks(View view) {
		ContextRelation modelElement = (ContextRelation) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextRelation_Parameters_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextRelation_EndingComplexEvent_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextRelation_InitialComplexEvent_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_HoldsAt_ContextRelation_4001(
			ContextRelation target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getHoldsAt_ContextRelation()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.HoldsAtContextRelation_4001, HoldsAtContextRelationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Parameter_Instance_4002(
			Instance target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getParameter_Instance()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.ParameterInstance_4002, ParameterInstanceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_ContextRelation_Parameters_4003(
			Parameter target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getContextRelation_Parameters()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.ContextRelationParameters_4003, ContextRelationParametersEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Parameter_Type_4004(Type target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getParameter_Type()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target, ModelElementTypes.ParameterType_4004,
						ParameterTypeEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Initially_ContextRelation_4005(
			ContextRelation target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getInitially_ContextRelation()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.InitiallyContextRelation_4005, InitiallyContextRelationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_ContextRelation_EndingComplexEvent_4006(
			ComplexEvent target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getContextRelation_EndingComplexEvent()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.ContextRelationEndingComplexEvent_4006,
						ContextRelationEndingComplexEventEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Happens_Event_4007(Event target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getHappens_Event()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target, ModelElementTypes.HappensEvent_4007,
						HappensEventEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Initially_HoldsAts_4008(
			HoldsAt target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getInitially_HoldsAts()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.InitiallyHoldsAts_4008, InitiallyHoldsAtsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Initially_HoldsAtBetweens_4009(
			HoldsAtBetween target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getInitially_HoldsAtBetweens()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.InitiallyHoldsAtBetweens_4009, InitiallyHoldsAtBetweensEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_ComplexEvent_BehaviouralDescriptions_4010(
			BehaviouralDescription target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getComplexEvent_BehaviouralDescriptions()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.ComplexEventBehaviouralDescriptions_4010,
						ComplexEventBehaviouralDescriptionsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Initially_Happens_4011(
			Happens target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getInitially_Happens()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.InitiallyHappens_4011, InitiallyHappensEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Event_Parameters_4012(
			Parameter target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getEvent_Parameters()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target, ModelElementTypes.EventParameters_4012,
						EventParametersEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_HoldsAtBetween_ContextRelation_4013(
			ContextRelation target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getHoldsAtBetween_ContextRelation()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.HoldsAtBetweenContextRelation_4013,
						HoldsAtBetweenContextRelationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_BehaviouralDescription_HoldsAtBetweens_4014(
			HoldsAtBetween target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getBehaviouralDescription_HoldsAtBetweens()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.BehaviouralDescriptionHoldsAtBetweens_4014,
						BehaviouralDescriptionHoldsAtBetweensEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_BehaviouralDescription_HoldsAts_4015(
			HoldsAt target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getBehaviouralDescription_HoldsAts()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.BehaviouralDescriptionHoldsAts_4015,
						BehaviouralDescriptionHoldsAtsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_ContextRelation_InitialComplexEvent_4016(
			ComplexEvent target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getContextRelation_InitialComplexEvent()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.ContextRelationInitialComplexEvent_4016,
						ContextRelationInitialComplexEventEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_BehaviouralDescription_Happens_4017(
			Happens target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getBehaviouralDescription_Happens()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.BehaviouralDescriptionHappens_4017,
						BehaviouralDescriptionHappensEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Instance_Type_4018(Type target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getInstance_Type()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target, ModelElementTypes.InstanceType_4018,
						InstanceTypeEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_HoldsAt_ContextRelation_4001(
			HoldsAt source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		ContextRelation destination = source.getContextRelation();
		if (destination == null) {
			return result;
		}
		result.add(new ModelLinkDescriptor(source, destination, ModelElementTypes.HoldsAtContextRelation_4001,
				HoldsAtContextRelationEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Parameter_Instance_4002(
			Parameter source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Instance destination = source.getInstance();
		if (destination == null) {
			return result;
		}
		result.add(new ModelLinkDescriptor(source, destination, ModelElementTypes.ParameterInstance_4002,
				ParameterInstanceEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_ContextRelation_Parameters_4003(
			ContextRelation source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getParameters().iterator(); destinations.hasNext();) {
			Parameter destination = (Parameter) destinations.next();
			result.add(new ModelLinkDescriptor(source, destination, ModelElementTypes.ContextRelationParameters_4003,
					ContextRelationParametersEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Parameter_Type_4004(
			Parameter source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Type destination = source.getType();
		if (destination == null) {
			return result;
		}
		result.add(new ModelLinkDescriptor(source, destination, ModelElementTypes.ParameterType_4004,
				ParameterTypeEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Initially_ContextRelation_4005(
			Initially source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		ContextRelation destination = source.getContextRelation();
		if (destination == null) {
			return result;
		}
		result.add(new ModelLinkDescriptor(source, destination, ModelElementTypes.InitiallyContextRelation_4005,
				InitiallyContextRelationEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_ContextRelation_EndingComplexEvent_4006(
			ContextRelation source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		ComplexEvent destination = source.getEndingComplexEvent();
		if (destination == null) {
			return result;
		}
		result.add(
				new ModelLinkDescriptor(source, destination, ModelElementTypes.ContextRelationEndingComplexEvent_4006,
						ContextRelationEndingComplexEventEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Happens_Event_4007(
			Happens source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Event destination = source.getEvent();
		if (destination == null) {
			return result;
		}
		result.add(new ModelLinkDescriptor(source, destination, ModelElementTypes.HappensEvent_4007,
				HappensEventEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Initially_HoldsAts_4008(
			Initially source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getHoldsAts().iterator(); destinations.hasNext();) {
			HoldsAt destination = (HoldsAt) destinations.next();
			result.add(new ModelLinkDescriptor(source, destination, ModelElementTypes.InitiallyHoldsAts_4008,
					InitiallyHoldsAtsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Initially_HoldsAtBetweens_4009(
			Initially source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getHoldsAtBetweens().iterator(); destinations.hasNext();) {
			HoldsAtBetween destination = (HoldsAtBetween) destinations.next();
			result.add(new ModelLinkDescriptor(source, destination, ModelElementTypes.InitiallyHoldsAtBetweens_4009,
					InitiallyHoldsAtBetweensEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_ComplexEvent_BehaviouralDescriptions_4010(
			ComplexEvent source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		BehaviouralDescription destination = source.getBehaviouralDescriptions();
		if (destination == null) {
			return result;
		}
		result.add(
				new ModelLinkDescriptor(source, destination, ModelElementTypes.ComplexEventBehaviouralDescriptions_4010,
						ComplexEventBehaviouralDescriptionsEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Initially_Happens_4011(
			Initially source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getHappens().iterator(); destinations.hasNext();) {
			Happens destination = (Happens) destinations.next();
			result.add(new ModelLinkDescriptor(source, destination, ModelElementTypes.InitiallyHappens_4011,
					InitiallyHappensEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Event_Parameters_4012(
			Event source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getParameters().iterator(); destinations.hasNext();) {
			Parameter destination = (Parameter) destinations.next();
			result.add(new ModelLinkDescriptor(source, destination, ModelElementTypes.EventParameters_4012,
					EventParametersEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_HoldsAtBetween_ContextRelation_4013(
			HoldsAtBetween source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		ContextRelation destination = source.getContextRelation();
		if (destination == null) {
			return result;
		}
		result.add(new ModelLinkDescriptor(source, destination, ModelElementTypes.HoldsAtBetweenContextRelation_4013,
				HoldsAtBetweenContextRelationEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_BehaviouralDescription_HoldsAtBetweens_4014(
			BehaviouralDescription source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getHoldsAtBetweens().iterator(); destinations.hasNext();) {
			HoldsAtBetween destination = (HoldsAtBetween) destinations.next();
			result.add(new ModelLinkDescriptor(source, destination,
					ModelElementTypes.BehaviouralDescriptionHoldsAtBetweens_4014,
					BehaviouralDescriptionHoldsAtBetweensEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_BehaviouralDescription_HoldsAts_4015(
			BehaviouralDescription source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getHoldsAts().iterator(); destinations.hasNext();) {
			HoldsAt destination = (HoldsAt) destinations.next();
			result.add(
					new ModelLinkDescriptor(source, destination, ModelElementTypes.BehaviouralDescriptionHoldsAts_4015,
							BehaviouralDescriptionHoldsAtsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_ContextRelation_InitialComplexEvent_4016(
			ContextRelation source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		ComplexEvent destination = source.getInitialComplexEvent();
		if (destination == null) {
			return result;
		}
		result.add(
				new ModelLinkDescriptor(source, destination, ModelElementTypes.ContextRelationInitialComplexEvent_4016,
						ContextRelationInitialComplexEventEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_BehaviouralDescription_Happens_4017(
			BehaviouralDescription source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getHappens().iterator(); destinations.hasNext();) {
			Happens destination = (Happens) destinations.next();
			result.add(
					new ModelLinkDescriptor(source, destination, ModelElementTypes.BehaviouralDescriptionHappens_4017,
							BehaviouralDescriptionHappensEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Instance_Type_4018(
			Instance source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Type destination = source.getType();
		if (destination == null) {
			return result;
		}
		result.add(new ModelLinkDescriptor(source, destination, ModelElementTypes.InstanceType_4018,
				InstanceTypeEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<ModelNodeDescriptor> getSemanticChildren(View view) {
			return ModelDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ModelLinkDescriptor> getContainedLinks(View view) {
			return ModelDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ModelLinkDescriptor> getIncomingLinks(View view) {
			return ModelDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ModelLinkDescriptor> getOutgoingLinks(View view) {
			return ModelDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
