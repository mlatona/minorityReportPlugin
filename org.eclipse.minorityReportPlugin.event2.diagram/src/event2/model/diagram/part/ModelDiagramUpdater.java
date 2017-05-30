package event2.model.diagram.part;

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

import event2.model.diagram.edit.parts.AgentEditPart;
import event2.model.diagram.edit.parts.EnvironmentEditPart;
import event2.model.diagram.edit.parts.ObserverEditPart;
import event2.model.diagram.edit.parts.ParameterEditPart;
import event2.model.diagram.edit.parts.PrimitiveEventEditPart;
import event2.model.diagram.providers.ModelElementTypes;
import model.Agent;
import model.Environment;
import model.ModelPackage;
import model.Observer;
import model.Parameter;
import model.PrimitiveEvent;

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
		for (Iterator<?> it = modelElement.getParameters().iterator(); it.hasNext();) {
			Parameter childElement = (Parameter) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AgentEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ObserverEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ParameterEditPart.VISUAL_ID) {
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
		case AgentEditPart.VISUAL_ID:
			return getAgent_2001ContainedLinks(view);
		case ObserverEditPart.VISUAL_ID:
			return getObserver_2002ContainedLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_2003ContainedLinks(view);
		case PrimitiveEventEditPart.VISUAL_ID:
			return getPrimitiveEvent_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ModelLinkDescriptor> getIncomingLinks(View view) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case AgentEditPart.VISUAL_ID:
			return getAgent_2001IncomingLinks(view);
		case ObserverEditPart.VISUAL_ID:
			return getObserver_2002IncomingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_2003IncomingLinks(view);
		case PrimitiveEventEditPart.VISUAL_ID:
			return getPrimitiveEvent_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ModelLinkDescriptor> getOutgoingLinks(View view) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case AgentEditPart.VISUAL_ID:
			return getAgent_2001OutgoingLinks(view);
		case ObserverEditPart.VISUAL_ID:
			return getObserver_2002OutgoingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_2003OutgoingLinks(view);
		case PrimitiveEventEditPart.VISUAL_ID:
			return getPrimitiveEvent_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getEnvironment_1000ContainedLinks(View view) {
		Environment modelElement = (Environment) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_PrimitiveEvent_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getAgent_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getObserver_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ModelLinkDescriptor> getParameter_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getPrimitiveEvent_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getAgent_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getObserver_2002IncomingLinks(View view) {
		Observer modelElement = (Observer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_PrimitiveEvent_4001(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<ModelLinkDescriptor> getParameter_2003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getPrimitiveEvent_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getAgent_2001OutgoingLinks(View view) {
		Agent modelElement = (Agent) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_PrimitiveEvent_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getObserver_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ModelLinkDescriptor> getParameter_2003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getPrimitiveEvent_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getContainedTypeModelFacetLinks_PrimitiveEvent_4001(
			Environment container) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> links = container.getEvents().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PrimitiveEvent) {
				continue;
			}
			PrimitiveEvent link = (PrimitiveEvent) linkObject;
			if (PrimitiveEventEditPart.VISUAL_ID != ModelVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Observer dst = link.getObserver();
			Agent src = link.getAgent();
			result.add(new ModelLinkDescriptor(src, dst, link, ModelElementTypes.PrimitiveEvent_4001,
					PrimitiveEventEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingTypeModelFacetLinks_PrimitiveEvent_4001(Observer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ModelPackage.eINSTANCE.getPrimitiveEvent_Observer()
					|| false == setting.getEObject() instanceof PrimitiveEvent) {
				continue;
			}
			PrimitiveEvent link = (PrimitiveEvent) setting.getEObject();
			if (PrimitiveEventEditPart.VISUAL_ID != ModelVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Agent src = link.getAgent();
			result.add(new ModelLinkDescriptor(src, target, link, ModelElementTypes.PrimitiveEvent_4001,
					PrimitiveEventEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModelLinkDescriptor> getOutgoingTypeModelFacetLinks_PrimitiveEvent_4001(Agent source) {
		Environment container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Environment) {
				container = (Environment) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> links = container.getEvents().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PrimitiveEvent) {
				continue;
			}
			PrimitiveEvent link = (PrimitiveEvent) linkObject;
			if (PrimitiveEventEditPart.VISUAL_ID != ModelVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Observer dst = link.getObserver();
			Agent src = link.getAgent();
			if (src != source) {
				continue;
			}
			result.add(new ModelLinkDescriptor(src, dst, link, ModelElementTypes.PrimitiveEvent_4001,
					PrimitiveEventEditPart.VISUAL_ID));
		}
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
