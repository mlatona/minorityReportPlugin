package model.diagram.part;

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
import model.diagram.edit.parts.BehaviouralDescriptionEditPart;
import model.diagram.edit.parts.BehaviouralDescriptionHappensEditPart;
import model.diagram.edit.parts.BehaviouralDescriptionHoldsAtBetweensEditPart;
import model.diagram.edit.parts.BehaviouralDescriptionHoldsAtsEditPart;
import model.diagram.edit.parts.ComplexEventBehaviouralDescriptionsEditPart;
import model.diagram.edit.parts.ComplexEventEditPart;
import model.diagram.edit.parts.ContextRelationEditPart;
import model.diagram.edit.parts.ContextRelationEndingComplexEventEditPart;
import model.diagram.edit.parts.ContextRelationInitialComplexEventEditPart;
import model.diagram.edit.parts.ContextRelationParametersEditPart;
import model.diagram.edit.parts.EnvironmentEditPart;
import model.diagram.edit.parts.HappensEditPart;
import model.diagram.edit.parts.HappensEventEditPart;
import model.diagram.edit.parts.HoldsAtBetweenContextRelationEditPart;
import model.diagram.edit.parts.HoldsAtBetweenEditPart;
import model.diagram.edit.parts.HoldsAtContextRelationEditPart;
import model.diagram.edit.parts.HoldsAtEditPart;
import model.diagram.edit.parts.InitiallyContextRelationEditPart;
import model.diagram.edit.parts.InitiallyEditPart;
import model.diagram.edit.parts.InitiallyHappensEditPart;
import model.diagram.edit.parts.InitiallyHoldsAtBetweensEditPart;
import model.diagram.edit.parts.InitiallyHoldsAtsEditPart;
import model.diagram.edit.parts.InstanceEditPart;
import model.diagram.edit.parts.InstanceTypeEditPart;
import model.diagram.edit.parts.ParameterEditPart;
import model.diagram.edit.parts.ParameterInstanceEditPart;
import model.diagram.edit.parts.ParameterTypeEditPart;
import model.diagram.edit.parts.PrimitiveEventEditPart;
import model.diagram.edit.parts.TypeEditPart;
import model.diagram.providers.ModelElementTypes;

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
		for (Iterator<?> it = modelElement.getHoldsAts().iterator(); it.hasNext();) {
			HoldsAt childElement = (HoldsAt) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HoldsAtEditPart.VISUAL_ID) {
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
		for (Iterator<?> it = modelElement.getHoldsAtBetweens().iterator(); it.hasNext();) {
			HoldsAtBetween childElement = (HoldsAtBetween) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HoldsAtBetweenEditPart.VISUAL_ID) {
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
		for (Iterator<?> it = modelElement.getTypes().iterator(); it.hasNext();) {
			Type childElement = (Type) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == TypeEditPart.VISUAL_ID) {
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
		for (Iterator<?> it = modelElement.getContextRelations().iterator(); it.hasNext();) {
			ContextRelation childElement = (ContextRelation) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ContextRelationEditPart.VISUAL_ID) {
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
		return result;
	}

	/**
	* @generated
	*/
	public static List<ModelLinkDescriptor> getContainedLinks(View view) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case EnvironmentEditPart.VISUAL_ID:
			return getEnvironment_1000ContainedLinks(view);
		case HoldsAtEditPart.VISUAL_ID:
			return getHoldsAt_2003ContainedLinks(view);
		case HappensEditPart.VISUAL_ID:
			return getHappens_2009ContainedLinks(view);
		case InitiallyEditPart.VISUAL_ID:
			return getInitially_2007ContainedLinks(view);
		case HoldsAtBetweenEditPart.VISUAL_ID:
			return getHoldsAtBetween_2011ContainedLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_2006ContainedLinks(view);
		case PrimitiveEventEditPart.VISUAL_ID:
			return getPrimitiveEvent_2004ContainedLinks(view);
		case TypeEditPart.VISUAL_ID:
			return getType_2008ContainedLinks(view);
		case InstanceEditPart.VISUAL_ID:
			return getInstance_2001ContainedLinks(view);
		case ContextRelationEditPart.VISUAL_ID:
			return getContextRelation_2002ContainedLinks(view);
		case BehaviouralDescriptionEditPart.VISUAL_ID:
			return getBehaviouralDescription_2010ContainedLinks(view);
		case ComplexEventEditPart.VISUAL_ID:
			return getComplexEvent_2005ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ModelLinkDescriptor> getIncomingLinks(View view) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case HoldsAtEditPart.VISUAL_ID:
			return getHoldsAt_2003IncomingLinks(view);
		case HappensEditPart.VISUAL_ID:
			return getHappens_2009IncomingLinks(view);
		case InitiallyEditPart.VISUAL_ID:
			return getInitially_2007IncomingLinks(view);
		case HoldsAtBetweenEditPart.VISUAL_ID:
			return getHoldsAtBetween_2011IncomingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_2006IncomingLinks(view);
		case PrimitiveEventEditPart.VISUAL_ID:
			return getPrimitiveEvent_2004IncomingLinks(view);
		case TypeEditPart.VISUAL_ID:
			return getType_2008IncomingLinks(view);
		case InstanceEditPart.VISUAL_ID:
			return getInstance_2001IncomingLinks(view);
		case ContextRelationEditPart.VISUAL_ID:
			return getContextRelation_2002IncomingLinks(view);
		case BehaviouralDescriptionEditPart.VISUAL_ID:
			return getBehaviouralDescription_2010IncomingLinks(view);
		case ComplexEventEditPart.VISUAL_ID:
			return getComplexEvent_2005IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ModelLinkDescriptor> getOutgoingLinks(View view) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case HoldsAtEditPart.VISUAL_ID:
			return getHoldsAt_2003OutgoingLinks(view);
		case HappensEditPart.VISUAL_ID:
			return getHappens_2009OutgoingLinks(view);
		case InitiallyEditPart.VISUAL_ID:
			return getInitially_2007OutgoingLinks(view);
		case HoldsAtBetweenEditPart.VISUAL_ID:
			return getHoldsAtBetween_2011OutgoingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_2006OutgoingLinks(view);
		case PrimitiveEventEditPart.VISUAL_ID:
			return getPrimitiveEvent_2004OutgoingLinks(view);
		case TypeEditPart.VISUAL_ID:
			return getType_2008OutgoingLinks(view);
		case InstanceEditPart.VISUAL_ID:
			return getInstance_2001OutgoingLinks(view);
		case ContextRelationEditPart.VISUAL_ID:
			return getContextRelation_2002OutgoingLinks(view);
		case BehaviouralDescriptionEditPart.VISUAL_ID:
			return getBehaviouralDescription_2010OutgoingLinks(view);
		case ComplexEventEditPart.VISUAL_ID:
			return getComplexEvent_2005OutgoingLinks(view);
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
	public static List<ModelLinkDescriptor> getHoldsAt_2003ContainedLinks(View view) {
		HoldsAt modelElement = (HoldsAt) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_HoldsAt_ContextRelation_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getHappens_2009ContainedLinks(View view) {
		Happens modelElement = (Happens) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Happens_Event_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getInitially_2007ContainedLinks(View view) {
		Initially modelElement = (Initially) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Initially_HoldsAts_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Initially_ContextRelation_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Initially_Happens_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Initially_HoldsAtBetweens_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getHoldsAtBetween_2011ContainedLinks(View view) {
		HoldsAtBetween modelElement = (HoldsAtBetween) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_HoldsAtBetween_ContextRelation_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getParameter_2006ContainedLinks(View view) {
		Parameter modelElement = (Parameter) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Parameter_Instance_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Parameter_Type_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getPrimitiveEvent_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getType_2008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getInstance_2001ContainedLinks(View view) {
		Instance modelElement = (Instance) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Instance_Type_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getContextRelation_2002ContainedLinks(View view) {
		ContextRelation modelElement = (ContextRelation) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextRelation_Parameters_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextRelation_EndingComplexEvent_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextRelation_InitialComplexEvent_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getBehaviouralDescription_2010ContainedLinks(View view) {
		BehaviouralDescription modelElement = (BehaviouralDescription) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_BehaviouralDescription_HoldsAtBetweens_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_BehaviouralDescription_HoldsAts_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_BehaviouralDescription_Happens_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getComplexEvent_2005ContainedLinks(View view) {
		ComplexEvent modelElement = (ComplexEvent) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ComplexEvent_BehaviouralDescriptions_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getHoldsAt_2003IncomingLinks(View view) {
		HoldsAt modelElement = (HoldsAt) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Initially_HoldsAts_4001(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_BehaviouralDescription_HoldsAts_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getHappens_2009IncomingLinks(View view) {
		Happens modelElement = (Happens) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Initially_Happens_4005(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_BehaviouralDescription_Happens_4016(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getInitially_2007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getHoldsAtBetween_2011IncomingLinks(View view) {
		HoldsAtBetween modelElement = (HoldsAtBetween) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_BehaviouralDescription_HoldsAtBetweens_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Initially_HoldsAtBetweens_4014(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getParameter_2006IncomingLinks(View view) {
		Parameter modelElement = (Parameter) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ContextRelation_Parameters_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getPrimitiveEvent_2004IncomingLinks(View view) {
		PrimitiveEvent modelElement = (PrimitiveEvent) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Happens_Event_4019(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getType_2008IncomingLinks(View view) {
		Type modelElement = (Type) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Instance_Type_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Parameter_Type_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getInstance_2001IncomingLinks(View view) {
		Instance modelElement = (Instance) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Parameter_Instance_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getContextRelation_2002IncomingLinks(View view) {
		ContextRelation modelElement = (ContextRelation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_HoldsAtBetween_ContextRelation_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Initially_ContextRelation_4003(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_HoldsAt_ContextRelation_4009(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getBehaviouralDescription_2010IncomingLinks(View view) {
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
	public static List<ModelLinkDescriptor> getComplexEvent_2005IncomingLinks(View view) {
		ComplexEvent modelElement = (ComplexEvent) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ContextRelation_EndingComplexEvent_4015(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ContextRelation_InitialComplexEvent_4017(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Happens_Event_4019(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getHoldsAt_2003OutgoingLinks(View view) {
		HoldsAt modelElement = (HoldsAt) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_HoldsAt_ContextRelation_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getHappens_2009OutgoingLinks(View view) {
		Happens modelElement = (Happens) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Happens_Event_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getInitially_2007OutgoingLinks(View view) {
		Initially modelElement = (Initially) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Initially_HoldsAts_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Initially_ContextRelation_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Initially_Happens_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Initially_HoldsAtBetweens_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getHoldsAtBetween_2011OutgoingLinks(View view) {
		HoldsAtBetween modelElement = (HoldsAtBetween) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_HoldsAtBetween_ContextRelation_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getParameter_2006OutgoingLinks(View view) {
		Parameter modelElement = (Parameter) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Parameter_Instance_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Parameter_Type_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getPrimitiveEvent_2004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getType_2008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getInstance_2001OutgoingLinks(View view) {
		Instance modelElement = (Instance) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Instance_Type_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getContextRelation_2002OutgoingLinks(View view) {
		ContextRelation modelElement = (ContextRelation) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextRelation_Parameters_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextRelation_EndingComplexEvent_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextRelation_InitialComplexEvent_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getBehaviouralDescription_2010OutgoingLinks(View view) {
		BehaviouralDescription modelElement = (BehaviouralDescription) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_BehaviouralDescription_HoldsAtBetweens_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_BehaviouralDescription_HoldsAts_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_BehaviouralDescription_Happens_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getComplexEvent_2005OutgoingLinks(View view) {
		ComplexEvent modelElement = (ComplexEvent) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ComplexEvent_BehaviouralDescriptions_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Initially_HoldsAts_4001(
			HoldsAt target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getInitially_HoldsAts()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.InitiallyHoldsAts_4001, InitiallyHoldsAtsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_HoldsAtBetween_ContextRelation_4002(
			ContextRelation target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getHoldsAtBetween_ContextRelation()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.HoldsAtBetweenContextRelation_4002,
						HoldsAtBetweenContextRelationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Initially_ContextRelation_4003(
			ContextRelation target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getInitially_ContextRelation()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.InitiallyContextRelation_4003, InitiallyContextRelationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Instance_Type_4004(Type target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getInstance_Type()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target, ModelElementTypes.InstanceType_4004,
						InstanceTypeEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Initially_Happens_4005(
			Happens target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getInitially_Happens()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.InitiallyHappens_4005, InitiallyHappensEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Parameter_Instance_4006(
			Instance target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getParameter_Instance()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.ParameterInstance_4006, ParameterInstanceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_BehaviouralDescription_HoldsAtBetweens_4007(
			HoldsAtBetween target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getBehaviouralDescription_HoldsAtBetweens()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.BehaviouralDescriptionHoldsAtBetweens_4007,
						BehaviouralDescriptionHoldsAtBetweensEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Parameter_Type_4008(Type target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getParameter_Type()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target, ModelElementTypes.ParameterType_4008,
						ParameterTypeEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_HoldsAt_ContextRelation_4009(
			ContextRelation target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getHoldsAt_ContextRelation()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.HoldsAtContextRelation_4009, HoldsAtContextRelationEditPart.VISUAL_ID));
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
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_BehaviouralDescription_HoldsAts_4012(
			HoldsAt target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getBehaviouralDescription_HoldsAts()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.BehaviouralDescriptionHoldsAts_4012,
						BehaviouralDescriptionHoldsAtsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_ContextRelation_Parameters_4013(
			Parameter target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getContextRelation_Parameters()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.ContextRelationParameters_4013, ContextRelationParametersEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Initially_HoldsAtBetweens_4014(
			HoldsAtBetween target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getInitially_HoldsAtBetweens()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.InitiallyHoldsAtBetweens_4014, InitiallyHoldsAtBetweensEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_ContextRelation_EndingComplexEvent_4015(
			ComplexEvent target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getContextRelation_EndingComplexEvent()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.ContextRelationEndingComplexEvent_4015,
						ContextRelationEndingComplexEventEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_BehaviouralDescription_Happens_4016(
			Happens target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getBehaviouralDescription_Happens()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.BehaviouralDescriptionHappens_4016,
						BehaviouralDescriptionHappensEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_ContextRelation_InitialComplexEvent_4017(
			ComplexEvent target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getContextRelation_InitialComplexEvent()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target,
						ModelElementTypes.ContextRelationInitialComplexEvent_4017,
						ContextRelationInitialComplexEventEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Happens_Event_4019(Event target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getHappens_Event()) {
				result.add(new ModelLinkDescriptor(setting.getEObject(), target, ModelElementTypes.HappensEvent_4019,
						HappensEventEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Initially_HoldsAts_4001(
			Initially source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getHoldsAts().iterator(); destinations.hasNext();) {
			HoldsAt destination = (HoldsAt) destinations.next();
			result.add(new ModelLinkDescriptor(source, destination, ModelElementTypes.InitiallyHoldsAts_4001,
					InitiallyHoldsAtsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_HoldsAtBetween_ContextRelation_4002(
			HoldsAtBetween source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		ContextRelation destination = source.getContextRelation();
		if (destination == null) {
			return result;
		}
		result.add(new ModelLinkDescriptor(source, destination, ModelElementTypes.HoldsAtBetweenContextRelation_4002,
				HoldsAtBetweenContextRelationEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Initially_ContextRelation_4003(
			Initially source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		ContextRelation destination = source.getContextRelation();
		if (destination == null) {
			return result;
		}
		result.add(new ModelLinkDescriptor(source, destination, ModelElementTypes.InitiallyContextRelation_4003,
				InitiallyContextRelationEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Instance_Type_4004(
			Instance source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Type destination = source.getType();
		if (destination == null) {
			return result;
		}
		result.add(new ModelLinkDescriptor(source, destination, ModelElementTypes.InstanceType_4004,
				InstanceTypeEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Initially_Happens_4005(
			Initially source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getHappens().iterator(); destinations.hasNext();) {
			Happens destination = (Happens) destinations.next();
			result.add(new ModelLinkDescriptor(source, destination, ModelElementTypes.InitiallyHappens_4005,
					InitiallyHappensEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Parameter_Instance_4006(
			Parameter source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Instance destination = source.getInstance();
		if (destination == null) {
			return result;
		}
		result.add(new ModelLinkDescriptor(source, destination, ModelElementTypes.ParameterInstance_4006,
				ParameterInstanceEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_BehaviouralDescription_HoldsAtBetweens_4007(
			BehaviouralDescription source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getHoldsAtBetweens().iterator(); destinations.hasNext();) {
			HoldsAtBetween destination = (HoldsAtBetween) destinations.next();
			result.add(new ModelLinkDescriptor(source, destination,
					ModelElementTypes.BehaviouralDescriptionHoldsAtBetweens_4007,
					BehaviouralDescriptionHoldsAtBetweensEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Parameter_Type_4008(
			Parameter source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Type destination = source.getType();
		if (destination == null) {
			return result;
		}
		result.add(new ModelLinkDescriptor(source, destination, ModelElementTypes.ParameterType_4008,
				ParameterTypeEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_HoldsAt_ContextRelation_4009(
			HoldsAt source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		ContextRelation destination = source.getContextRelation();
		if (destination == null) {
			return result;
		}
		result.add(new ModelLinkDescriptor(source, destination, ModelElementTypes.HoldsAtContextRelation_4009,
				HoldsAtContextRelationEditPart.VISUAL_ID));
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
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_BehaviouralDescription_HoldsAts_4012(
			BehaviouralDescription source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getHoldsAts().iterator(); destinations.hasNext();) {
			HoldsAt destination = (HoldsAt) destinations.next();
			result.add(
					new ModelLinkDescriptor(source, destination, ModelElementTypes.BehaviouralDescriptionHoldsAts_4012,
							BehaviouralDescriptionHoldsAtsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_ContextRelation_Parameters_4013(
			ContextRelation source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getParameters().iterator(); destinations.hasNext();) {
			Parameter destination = (Parameter) destinations.next();
			result.add(new ModelLinkDescriptor(source, destination, ModelElementTypes.ContextRelationParameters_4013,
					ContextRelationParametersEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Initially_HoldsAtBetweens_4014(
			Initially source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getHoldsAtBetweens().iterator(); destinations.hasNext();) {
			HoldsAtBetween destination = (HoldsAtBetween) destinations.next();
			result.add(new ModelLinkDescriptor(source, destination, ModelElementTypes.InitiallyHoldsAtBetweens_4014,
					InitiallyHoldsAtBetweensEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_ContextRelation_EndingComplexEvent_4015(
			ContextRelation source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		ComplexEvent destination = source.getEndingComplexEvent();
		if (destination == null) {
			return result;
		}
		result.add(
				new ModelLinkDescriptor(source, destination, ModelElementTypes.ContextRelationEndingComplexEvent_4015,
						ContextRelationEndingComplexEventEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_BehaviouralDescription_Happens_4016(
			BehaviouralDescription source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getHappens().iterator(); destinations.hasNext();) {
			Happens destination = (Happens) destinations.next();
			result.add(
					new ModelLinkDescriptor(source, destination, ModelElementTypes.BehaviouralDescriptionHappens_4016,
							BehaviouralDescriptionHappensEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_ContextRelation_InitialComplexEvent_4017(
			ContextRelation source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		ComplexEvent destination = source.getInitialComplexEvent();
		if (destination == null) {
			return result;
		}
		result.add(
				new ModelLinkDescriptor(source, destination, ModelElementTypes.ContextRelationInitialComplexEvent_4017,
						ContextRelationInitialComplexEventEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Happens_Event_4019(
			Happens source) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Event destination = source.getEvent();
		if (destination == null) {
			return result;
		}
		result.add(new ModelLinkDescriptor(source, destination, ModelElementTypes.HappensEvent_4019,
				HappensEventEditPart.VISUAL_ID));
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
