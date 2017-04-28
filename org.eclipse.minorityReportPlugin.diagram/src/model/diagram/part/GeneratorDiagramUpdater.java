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
import model.diagram.edit.parts.EventParametersEditPart;
import model.diagram.edit.parts.HappensContextRelationEditPart;
import model.diagram.edit.parts.HappensEditPart;
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
import model.diagram.providers.GeneratorElementTypes;

/**
 * @generated
 */
public class GeneratorDiagramUpdater {

	/**
	* @generated
	*/
	public static List<GeneratorNodeDescriptor> getSemanticChildren(View view) {
		switch (GeneratorVisualIDRegistry.getVisualID(view)) {
		case EnvironmentEditPart.VISUAL_ID:
			return getEnvironment_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GeneratorNodeDescriptor> getEnvironment_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Environment modelElement = (Environment) view.getElement();
		LinkedList<GeneratorNodeDescriptor> result = new LinkedList<GeneratorNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHoldsAts().iterator(); it.hasNext();) {
			HoldsAt childElement = (HoldsAt) it.next();
			int visualID = GeneratorVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HoldsAtEditPart.VISUAL_ID) {
				result.add(new GeneratorNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHoldsAtBetweens().iterator(); it.hasNext();) {
			HoldsAtBetween childElement = (HoldsAtBetween) it.next();
			int visualID = GeneratorVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HoldsAtBetweenEditPart.VISUAL_ID) {
				result.add(new GeneratorNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEvents().iterator(); it.hasNext();) {
			Event childElement = (Event) it.next();
			int visualID = GeneratorVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ComplexEventEditPart.VISUAL_ID) {
				result.add(new GeneratorNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PrimitiveEventEditPart.VISUAL_ID) {
				result.add(new GeneratorNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getInstances().iterator(); it.hasNext();) {
			Instance childElement = (Instance) it.next();
			int visualID = GeneratorVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InstanceEditPart.VISUAL_ID) {
				result.add(new GeneratorNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getParameters().iterator(); it.hasNext();) {
			Parameter childElement = (Parameter) it.next();
			int visualID = GeneratorVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ParameterEditPart.VISUAL_ID) {
				result.add(new GeneratorNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getContextRelations().iterator(); it.hasNext();) {
			ContextRelation childElement = (ContextRelation) it.next();
			int visualID = GeneratorVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ContextRelationEditPart.VISUAL_ID) {
				result.add(new GeneratorNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTypes().iterator(); it.hasNext();) {
			Type childElement = (Type) it.next();
			int visualID = GeneratorVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == TypeEditPart.VISUAL_ID) {
				result.add(new GeneratorNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getBehavDescriptions().iterator(); it.hasNext();) {
			BehaviouralDescription childElement = (BehaviouralDescription) it.next();
			int visualID = GeneratorVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == BehaviouralDescriptionEditPart.VISUAL_ID) {
				result.add(new GeneratorNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHappens().iterator(); it.hasNext();) {
			Happens childElement = (Happens) it.next();
			int visualID = GeneratorVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HappensEditPart.VISUAL_ID) {
				result.add(new GeneratorNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getInitials().iterator(); it.hasNext();) {
			Initially childElement = (Initially) it.next();
			int visualID = GeneratorVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InitiallyEditPart.VISUAL_ID) {
				result.add(new GeneratorNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<GeneratorLinkDescriptor> getContainedLinks(View view) {
		switch (GeneratorVisualIDRegistry.getVisualID(view)) {
		case EnvironmentEditPart.VISUAL_ID:
			return getEnvironment_1000ContainedLinks(view);
		case HoldsAtEditPart.VISUAL_ID:
			return getHoldsAt_2003ContainedLinks(view);
		case HoldsAtBetweenEditPart.VISUAL_ID:
			return getHoldsAtBetween_2011ContainedLinks(view);
		case ComplexEventEditPart.VISUAL_ID:
			return getComplexEvent_2005ContainedLinks(view);
		case PrimitiveEventEditPart.VISUAL_ID:
			return getPrimitiveEvent_2004ContainedLinks(view);
		case InstanceEditPart.VISUAL_ID:
			return getInstance_2001ContainedLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_2006ContainedLinks(view);
		case ContextRelationEditPart.VISUAL_ID:
			return getContextRelation_2002ContainedLinks(view);
		case TypeEditPart.VISUAL_ID:
			return getType_2008ContainedLinks(view);
		case BehaviouralDescriptionEditPart.VISUAL_ID:
			return getBehaviouralDescription_2010ContainedLinks(view);
		case HappensEditPart.VISUAL_ID:
			return getHappens_2009ContainedLinks(view);
		case InitiallyEditPart.VISUAL_ID:
			return getInitially_2007ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GeneratorLinkDescriptor> getIncomingLinks(View view) {
		switch (GeneratorVisualIDRegistry.getVisualID(view)) {
		case HoldsAtEditPart.VISUAL_ID:
			return getHoldsAt_2003IncomingLinks(view);
		case HoldsAtBetweenEditPart.VISUAL_ID:
			return getHoldsAtBetween_2011IncomingLinks(view);
		case ComplexEventEditPart.VISUAL_ID:
			return getComplexEvent_2005IncomingLinks(view);
		case PrimitiveEventEditPart.VISUAL_ID:
			return getPrimitiveEvent_2004IncomingLinks(view);
		case InstanceEditPart.VISUAL_ID:
			return getInstance_2001IncomingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_2006IncomingLinks(view);
		case ContextRelationEditPart.VISUAL_ID:
			return getContextRelation_2002IncomingLinks(view);
		case TypeEditPart.VISUAL_ID:
			return getType_2008IncomingLinks(view);
		case BehaviouralDescriptionEditPart.VISUAL_ID:
			return getBehaviouralDescription_2010IncomingLinks(view);
		case HappensEditPart.VISUAL_ID:
			return getHappens_2009IncomingLinks(view);
		case InitiallyEditPart.VISUAL_ID:
			return getInitially_2007IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GeneratorLinkDescriptor> getOutgoingLinks(View view) {
		switch (GeneratorVisualIDRegistry.getVisualID(view)) {
		case HoldsAtEditPart.VISUAL_ID:
			return getHoldsAt_2003OutgoingLinks(view);
		case HoldsAtBetweenEditPart.VISUAL_ID:
			return getHoldsAtBetween_2011OutgoingLinks(view);
		case ComplexEventEditPart.VISUAL_ID:
			return getComplexEvent_2005OutgoingLinks(view);
		case PrimitiveEventEditPart.VISUAL_ID:
			return getPrimitiveEvent_2004OutgoingLinks(view);
		case InstanceEditPart.VISUAL_ID:
			return getInstance_2001OutgoingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_2006OutgoingLinks(view);
		case ContextRelationEditPart.VISUAL_ID:
			return getContextRelation_2002OutgoingLinks(view);
		case TypeEditPart.VISUAL_ID:
			return getType_2008OutgoingLinks(view);
		case BehaviouralDescriptionEditPart.VISUAL_ID:
			return getBehaviouralDescription_2010OutgoingLinks(view);
		case HappensEditPart.VISUAL_ID:
			return getHappens_2009OutgoingLinks(view);
		case InitiallyEditPart.VISUAL_ID:
			return getInitially_2007OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getEnvironment_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getHoldsAt_2003ContainedLinks(View view) {
		HoldsAt modelElement = (HoldsAt) view.getElement();
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_HoldsAt_ContextRelation_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getHoldsAtBetween_2011ContainedLinks(View view) {
		HoldsAtBetween modelElement = (HoldsAtBetween) view.getElement();
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_HoldsAtBetween_ContextRelation_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getComplexEvent_2005ContainedLinks(View view) {
		ComplexEvent modelElement = (ComplexEvent) view.getElement();
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Event_Parameters_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ComplexEvent_BehaviouralDescriptions_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getPrimitiveEvent_2004ContainedLinks(View view) {
		PrimitiveEvent modelElement = (PrimitiveEvent) view.getElement();
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Event_Parameters_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getInstance_2001ContainedLinks(View view) {
		Instance modelElement = (Instance) view.getElement();
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Instance_Type_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getParameter_2006ContainedLinks(View view) {
		Parameter modelElement = (Parameter) view.getElement();
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Parameter_Type_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Parameter_Instance_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getContextRelation_2002ContainedLinks(View view) {
		ContextRelation modelElement = (ContextRelation) view.getElement();
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextRelation_Parameters_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextRelation_EndingComplexEvent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextRelation_InitialComplexEvent_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getType_2008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getBehaviouralDescription_2010ContainedLinks(View view) {
		BehaviouralDescription modelElement = (BehaviouralDescription) view.getElement();
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_BehaviouralDescription_HoldsAtBetweens_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_BehaviouralDescription_Happens_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_BehaviouralDescription_HoldsAts_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getHappens_2009ContainedLinks(View view) {
		Happens modelElement = (Happens) view.getElement();
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Happens_ContextRelation_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getInitially_2007ContainedLinks(View view) {
		Initially modelElement = (Initially) view.getElement();
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Initially_HoldsAts_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Initially_ContextRelation_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Initially_HoldsAtBetweens_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Initially_Happens_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getHoldsAt_2003IncomingLinks(View view) {
		HoldsAt modelElement = (HoldsAt) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Initially_HoldsAts_4006(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_BehaviouralDescription_HoldsAts_4014(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getHoldsAtBetween_2011IncomingLinks(View view) {
		HoldsAtBetween modelElement = (HoldsAtBetween) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_BehaviouralDescription_HoldsAtBetweens_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Initially_HoldsAtBetweens_4015(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getComplexEvent_2005IncomingLinks(View view) {
		ComplexEvent modelElement = (ComplexEvent) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ContextRelation_EndingComplexEvent_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ContextRelation_InitialComplexEvent_4016(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getPrimitiveEvent_2004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getInstance_2001IncomingLinks(View view) {
		Instance modelElement = (Instance) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Parameter_Instance_4011(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getParameter_2006IncomingLinks(View view) {
		Parameter modelElement = (Parameter) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Event_Parameters_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ContextRelation_Parameters_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getContextRelation_2002IncomingLinks(View view) {
		ContextRelation modelElement = (ContextRelation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Happens_ContextRelation_4009(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_HoldsAtBetween_ContextRelation_4003(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Initially_ContextRelation_4010(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_HoldsAt_ContextRelation_4017(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getType_2008IncomingLinks(View view) {
		Type modelElement = (Type) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Instance_Type_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Parameter_Type_4018(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getBehaviouralDescription_2010IncomingLinks(View view) {
		BehaviouralDescription modelElement = (BehaviouralDescription) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ComplexEvent_BehaviouralDescriptions_4008(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getHappens_2009IncomingLinks(View view) {
		Happens modelElement = (Happens) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_BehaviouralDescription_Happens_4013(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Initially_Happens_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getInitially_2007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getHoldsAt_2003OutgoingLinks(View view) {
		HoldsAt modelElement = (HoldsAt) view.getElement();
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_HoldsAt_ContextRelation_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getHoldsAtBetween_2011OutgoingLinks(View view) {
		HoldsAtBetween modelElement = (HoldsAtBetween) view.getElement();
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_HoldsAtBetween_ContextRelation_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getComplexEvent_2005OutgoingLinks(View view) {
		ComplexEvent modelElement = (ComplexEvent) view.getElement();
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Event_Parameters_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ComplexEvent_BehaviouralDescriptions_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getPrimitiveEvent_2004OutgoingLinks(View view) {
		PrimitiveEvent modelElement = (PrimitiveEvent) view.getElement();
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Event_Parameters_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getInstance_2001OutgoingLinks(View view) {
		Instance modelElement = (Instance) view.getElement();
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Instance_Type_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getParameter_2006OutgoingLinks(View view) {
		Parameter modelElement = (Parameter) view.getElement();
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Parameter_Type_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Parameter_Instance_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getContextRelation_2002OutgoingLinks(View view) {
		ContextRelation modelElement = (ContextRelation) view.getElement();
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextRelation_Parameters_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextRelation_EndingComplexEvent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextRelation_InitialComplexEvent_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getType_2008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getBehaviouralDescription_2010OutgoingLinks(View view) {
		BehaviouralDescription modelElement = (BehaviouralDescription) view.getElement();
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_BehaviouralDescription_HoldsAtBetweens_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_BehaviouralDescription_Happens_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_BehaviouralDescription_HoldsAts_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getHappens_2009OutgoingLinks(View view) {
		Happens modelElement = (Happens) view.getElement();
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Happens_ContextRelation_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GeneratorLinkDescriptor> getInitially_2007OutgoingLinks(View view) {
		Initially modelElement = (Initially) view.getElement();
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Initially_HoldsAts_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Initially_ContextRelation_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Initially_HoldsAtBetweens_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Initially_Happens_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GeneratorLinkDescriptor> getIncomingFeatureModelFacetLinks_Initially_HoldsAts_4006(
			HoldsAt target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getInitially_HoldsAts()) {
				result.add(new GeneratorLinkDescriptor(setting.getEObject(), target,
						GeneratorElementTypes.InitiallyHoldsAts_4006, InitiallyHoldsAtsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GeneratorLinkDescriptor> getIncomingFeatureModelFacetLinks_Happens_ContextRelation_4009(
			ContextRelation target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getHappens_ContextRelation()) {
				result.add(new GeneratorLinkDescriptor(setting.getEObject(), target,
						GeneratorElementTypes.HappensContextRelation_4009, HappensContextRelationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GeneratorLinkDescriptor> getIncomingFeatureModelFacetLinks_HoldsAtBetween_ContextRelation_4003(
			ContextRelation target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getHoldsAtBetween_ContextRelation()) {
				result.add(new GeneratorLinkDescriptor(setting.getEObject(), target,
						GeneratorElementTypes.HoldsAtBetweenContextRelation_4003,
						HoldsAtBetweenContextRelationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GeneratorLinkDescriptor> getIncomingFeatureModelFacetLinks_Instance_Type_4005(Type target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getInstance_Type()) {
				result.add(new GeneratorLinkDescriptor(setting.getEObject(), target,
						GeneratorElementTypes.InstanceType_4005, InstanceTypeEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GeneratorLinkDescriptor> getIncomingFeatureModelFacetLinks_Event_Parameters_4002(
			Parameter target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getEvent_Parameters()) {
				result.add(new GeneratorLinkDescriptor(setting.getEObject(), target,
						GeneratorElementTypes.EventParameters_4002, EventParametersEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GeneratorLinkDescriptor> getIncomingFeatureModelFacetLinks_Initially_ContextRelation_4010(
			ContextRelation target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getInitially_ContextRelation()) {
				result.add(new GeneratorLinkDescriptor(setting.getEObject(), target,
						GeneratorElementTypes.InitiallyContextRelation_4010,
						InitiallyContextRelationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GeneratorLinkDescriptor> getIncomingFeatureModelFacetLinks_Parameter_Type_4018(
			Type target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getParameter_Type()) {
				result.add(new GeneratorLinkDescriptor(setting.getEObject(), target,
						GeneratorElementTypes.ParameterType_4018, ParameterTypeEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GeneratorLinkDescriptor> getIncomingFeatureModelFacetLinks_BehaviouralDescription_HoldsAtBetweens_4007(
			HoldsAtBetween target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getBehaviouralDescription_HoldsAtBetweens()) {
				result.add(new GeneratorLinkDescriptor(setting.getEObject(), target,
						GeneratorElementTypes.BehaviouralDescriptionHoldsAtBetweens_4007,
						BehaviouralDescriptionHoldsAtBetweensEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GeneratorLinkDescriptor> getIncomingFeatureModelFacetLinks_Initially_HoldsAtBetweens_4015(
			HoldsAtBetween target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getInitially_HoldsAtBetweens()) {
				result.add(new GeneratorLinkDescriptor(setting.getEObject(), target,
						GeneratorElementTypes.InitiallyHoldsAtBetweens_4015,
						InitiallyHoldsAtBetweensEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GeneratorLinkDescriptor> getIncomingFeatureModelFacetLinks_Parameter_Instance_4011(
			Instance target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getParameter_Instance()) {
				result.add(new GeneratorLinkDescriptor(setting.getEObject(), target,
						GeneratorElementTypes.ParameterInstance_4011, ParameterInstanceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GeneratorLinkDescriptor> getIncomingFeatureModelFacetLinks_BehaviouralDescription_Happens_4013(
			Happens target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getBehaviouralDescription_Happens()) {
				result.add(new GeneratorLinkDescriptor(setting.getEObject(), target,
						GeneratorElementTypes.BehaviouralDescriptionHappens_4013,
						BehaviouralDescriptionHappensEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GeneratorLinkDescriptor> getIncomingFeatureModelFacetLinks_ComplexEvent_BehaviouralDescriptions_4008(
			BehaviouralDescription target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getComplexEvent_BehaviouralDescriptions()) {
				result.add(new GeneratorLinkDescriptor(setting.getEObject(), target,
						GeneratorElementTypes.ComplexEventBehaviouralDescriptions_4008,
						ComplexEventBehaviouralDescriptionsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GeneratorLinkDescriptor> getIncomingFeatureModelFacetLinks_ContextRelation_Parameters_4012(
			Parameter target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getContextRelation_Parameters()) {
				result.add(new GeneratorLinkDescriptor(setting.getEObject(), target,
						GeneratorElementTypes.ContextRelationParameters_4012,
						ContextRelationParametersEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GeneratorLinkDescriptor> getIncomingFeatureModelFacetLinks_ContextRelation_EndingComplexEvent_4001(
			ComplexEvent target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getContextRelation_EndingComplexEvent()) {
				result.add(new GeneratorLinkDescriptor(setting.getEObject(), target,
						GeneratorElementTypes.ContextRelationEndingComplexEvent_4001,
						ContextRelationEndingComplexEventEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GeneratorLinkDescriptor> getIncomingFeatureModelFacetLinks_ContextRelation_InitialComplexEvent_4016(
			ComplexEvent target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getContextRelation_InitialComplexEvent()) {
				result.add(new GeneratorLinkDescriptor(setting.getEObject(), target,
						GeneratorElementTypes.ContextRelationInitialComplexEvent_4016,
						ContextRelationInitialComplexEventEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GeneratorLinkDescriptor> getIncomingFeatureModelFacetLinks_BehaviouralDescription_HoldsAts_4014(
			HoldsAt target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getBehaviouralDescription_HoldsAts()) {
				result.add(new GeneratorLinkDescriptor(setting.getEObject(), target,
						GeneratorElementTypes.BehaviouralDescriptionHoldsAts_4014,
						BehaviouralDescriptionHoldsAtsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GeneratorLinkDescriptor> getIncomingFeatureModelFacetLinks_Initially_Happens_4004(
			Happens target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getInitially_Happens()) {
				result.add(new GeneratorLinkDescriptor(setting.getEObject(), target,
						GeneratorElementTypes.InitiallyHappens_4004, InitiallyHappensEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GeneratorLinkDescriptor> getIncomingFeatureModelFacetLinks_HoldsAt_ContextRelation_4017(
			ContextRelation target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModelPackage.eINSTANCE.getHoldsAt_ContextRelation()) {
				result.add(new GeneratorLinkDescriptor(setting.getEObject(), target,
						GeneratorElementTypes.HoldsAtContextRelation_4017, HoldsAtContextRelationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GeneratorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Initially_HoldsAts_4006(
			Initially source) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		for (Iterator<?> destinations = source.getHoldsAts().iterator(); destinations.hasNext();) {
			HoldsAt destination = (HoldsAt) destinations.next();
			result.add(new GeneratorLinkDescriptor(source, destination, GeneratorElementTypes.InitiallyHoldsAts_4006,
					InitiallyHoldsAtsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GeneratorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Happens_ContextRelation_4009(
			Happens source) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		ContextRelation destination = source.getContextRelation();
		if (destination == null) {
			return result;
		}
		result.add(new GeneratorLinkDescriptor(source, destination, GeneratorElementTypes.HappensContextRelation_4009,
				HappensContextRelationEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GeneratorLinkDescriptor> getOutgoingFeatureModelFacetLinks_HoldsAtBetween_ContextRelation_4003(
			HoldsAtBetween source) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		ContextRelation destination = source.getContextRelation();
		if (destination == null) {
			return result;
		}
		result.add(new GeneratorLinkDescriptor(source, destination,
				GeneratorElementTypes.HoldsAtBetweenContextRelation_4003,
				HoldsAtBetweenContextRelationEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GeneratorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Instance_Type_4005(
			Instance source) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		Type destination = source.getType();
		if (destination == null) {
			return result;
		}
		result.add(new GeneratorLinkDescriptor(source, destination, GeneratorElementTypes.InstanceType_4005,
				InstanceTypeEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GeneratorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Event_Parameters_4002(
			Event source) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		for (Iterator<?> destinations = source.getParameters().iterator(); destinations.hasNext();) {
			Parameter destination = (Parameter) destinations.next();
			result.add(new GeneratorLinkDescriptor(source, destination, GeneratorElementTypes.EventParameters_4002,
					EventParametersEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GeneratorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Initially_ContextRelation_4010(
			Initially source) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		ContextRelation destination = source.getContextRelation();
		if (destination == null) {
			return result;
		}
		result.add(new GeneratorLinkDescriptor(source, destination, GeneratorElementTypes.InitiallyContextRelation_4010,
				InitiallyContextRelationEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GeneratorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Parameter_Type_4018(
			Parameter source) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		Type destination = source.getType();
		if (destination == null) {
			return result;
		}
		result.add(new GeneratorLinkDescriptor(source, destination, GeneratorElementTypes.ParameterType_4018,
				ParameterTypeEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GeneratorLinkDescriptor> getOutgoingFeatureModelFacetLinks_BehaviouralDescription_HoldsAtBetweens_4007(
			BehaviouralDescription source) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		for (Iterator<?> destinations = source.getHoldsAtBetweens().iterator(); destinations.hasNext();) {
			HoldsAtBetween destination = (HoldsAtBetween) destinations.next();
			result.add(new GeneratorLinkDescriptor(source, destination,
					GeneratorElementTypes.BehaviouralDescriptionHoldsAtBetweens_4007,
					BehaviouralDescriptionHoldsAtBetweensEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GeneratorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Initially_HoldsAtBetweens_4015(
			Initially source) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		for (Iterator<?> destinations = source.getHoldsAtBetweens().iterator(); destinations.hasNext();) {
			HoldsAtBetween destination = (HoldsAtBetween) destinations.next();
			result.add(new GeneratorLinkDescriptor(source, destination,
					GeneratorElementTypes.InitiallyHoldsAtBetweens_4015, InitiallyHoldsAtBetweensEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GeneratorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Parameter_Instance_4011(
			Parameter source) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		Instance destination = source.getInstance();
		if (destination == null) {
			return result;
		}
		result.add(new GeneratorLinkDescriptor(source, destination, GeneratorElementTypes.ParameterInstance_4011,
				ParameterInstanceEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GeneratorLinkDescriptor> getOutgoingFeatureModelFacetLinks_BehaviouralDescription_Happens_4013(
			BehaviouralDescription source) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		for (Iterator<?> destinations = source.getHappens().iterator(); destinations.hasNext();) {
			Happens destination = (Happens) destinations.next();
			result.add(new GeneratorLinkDescriptor(source, destination,
					GeneratorElementTypes.BehaviouralDescriptionHappens_4013,
					BehaviouralDescriptionHappensEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GeneratorLinkDescriptor> getOutgoingFeatureModelFacetLinks_ComplexEvent_BehaviouralDescriptions_4008(
			ComplexEvent source) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		BehaviouralDescription destination = source.getBehaviouralDescriptions();
		if (destination == null) {
			return result;
		}
		result.add(new GeneratorLinkDescriptor(source, destination,
				GeneratorElementTypes.ComplexEventBehaviouralDescriptions_4008,
				ComplexEventBehaviouralDescriptionsEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GeneratorLinkDescriptor> getOutgoingFeatureModelFacetLinks_ContextRelation_Parameters_4012(
			ContextRelation source) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		for (Iterator<?> destinations = source.getParameters().iterator(); destinations.hasNext();) {
			Parameter destination = (Parameter) destinations.next();
			result.add(new GeneratorLinkDescriptor(source, destination,
					GeneratorElementTypes.ContextRelationParameters_4012, ContextRelationParametersEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GeneratorLinkDescriptor> getOutgoingFeatureModelFacetLinks_ContextRelation_EndingComplexEvent_4001(
			ContextRelation source) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		ComplexEvent destination = source.getEndingComplexEvent();
		if (destination == null) {
			return result;
		}
		result.add(new GeneratorLinkDescriptor(source, destination,
				GeneratorElementTypes.ContextRelationEndingComplexEvent_4001,
				ContextRelationEndingComplexEventEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GeneratorLinkDescriptor> getOutgoingFeatureModelFacetLinks_ContextRelation_InitialComplexEvent_4016(
			ContextRelation source) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		ComplexEvent destination = source.getInitialComplexEvent();
		if (destination == null) {
			return result;
		}
		result.add(new GeneratorLinkDescriptor(source, destination,
				GeneratorElementTypes.ContextRelationInitialComplexEvent_4016,
				ContextRelationInitialComplexEventEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GeneratorLinkDescriptor> getOutgoingFeatureModelFacetLinks_BehaviouralDescription_HoldsAts_4014(
			BehaviouralDescription source) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		for (Iterator<?> destinations = source.getHoldsAts().iterator(); destinations.hasNext();) {
			HoldsAt destination = (HoldsAt) destinations.next();
			result.add(new GeneratorLinkDescriptor(source, destination,
					GeneratorElementTypes.BehaviouralDescriptionHoldsAts_4014,
					BehaviouralDescriptionHoldsAtsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GeneratorLinkDescriptor> getOutgoingFeatureModelFacetLinks_Initially_Happens_4004(
			Initially source) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		for (Iterator<?> destinations = source.getHappens().iterator(); destinations.hasNext();) {
			Happens destination = (Happens) destinations.next();
			result.add(new GeneratorLinkDescriptor(source, destination, GeneratorElementTypes.InitiallyHappens_4004,
					InitiallyHappensEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GeneratorLinkDescriptor> getOutgoingFeatureModelFacetLinks_HoldsAt_ContextRelation_4017(
			HoldsAt source) {
		LinkedList<GeneratorLinkDescriptor> result = new LinkedList<GeneratorLinkDescriptor>();
		ContextRelation destination = source.getContextRelation();
		if (destination == null) {
			return result;
		}
		result.add(new GeneratorLinkDescriptor(source, destination, GeneratorElementTypes.HoldsAtContextRelation_4017,
				HoldsAtContextRelationEditPart.VISUAL_ID));
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

		public List<GeneratorNodeDescriptor> getSemanticChildren(View view) {
			return GeneratorDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<GeneratorLinkDescriptor> getContainedLinks(View view) {
			return GeneratorDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<GeneratorLinkDescriptor> getIncomingLinks(View view) {
			return GeneratorDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<GeneratorLinkDescriptor> getOutgoingLinks(View view) {
			return GeneratorDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
