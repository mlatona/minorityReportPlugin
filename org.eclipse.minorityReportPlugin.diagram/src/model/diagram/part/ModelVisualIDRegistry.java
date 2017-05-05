package model.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import model.Environment;
import model.ModelPackage;
import model.diagram.edit.parts.BehaviouralDescriptionEditPart;
import model.diagram.edit.parts.BehaviouralDescriptionNameEditPart;
import model.diagram.edit.parts.ComplexEventEditPart;
import model.diagram.edit.parts.ComplexEventNameEditPart;
import model.diagram.edit.parts.ContextRelationEditPart;
import model.diagram.edit.parts.ContextRelationNameEditPart;
import model.diagram.edit.parts.ContextRelationTimeEditPart;
import model.diagram.edit.parts.ContextRelationValueEditPart;
import model.diagram.edit.parts.EnvironmentEditPart;
import model.diagram.edit.parts.HappensEditPart;
import model.diagram.edit.parts.HoldsAtBetweenEditPart;
import model.diagram.edit.parts.HoldsAtEditPart;
import model.diagram.edit.parts.InitiallyEditPart;
import model.diagram.edit.parts.InstanceEditPart;
import model.diagram.edit.parts.InstanceNameEditPart;
import model.diagram.edit.parts.ParameterEditPart;
import model.diagram.edit.parts.ParameterNameEditPart;
import model.diagram.edit.parts.PrimitiveEventEditPart;
import model.diagram.edit.parts.PrimitiveEventNameEditPart;
import model.diagram.edit.parts.TypeEditPart;
import model.diagram.edit.parts.TypeNameEditPart;
import model.diagram.edit.parts.WrappingLabel2EditPart;
import model.diagram.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ModelVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "org.eclipse.minorityReportPlugin.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (EnvironmentEditPart.MODEL_ID.equals(view.getType())) {
				return EnvironmentEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return model.diagram.part.ModelVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				ModelDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ModelPackage.eINSTANCE.getEnvironment().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Environment) domainElement)) {
			return EnvironmentEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = model.diagram.part.ModelVisualIDRegistry.getModelID(containerView);
		if (!EnvironmentEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (EnvironmentEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = model.diagram.part.ModelVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = EnvironmentEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case EnvironmentEditPart.VISUAL_ID:
			if (ModelPackage.eINSTANCE.getHoldsAt().isSuperTypeOf(domainElement.eClass())) {
				return HoldsAtEditPart.VISUAL_ID;
			}
			if (ModelPackage.eINSTANCE.getHappens().isSuperTypeOf(domainElement.eClass())) {
				return HappensEditPart.VISUAL_ID;
			}
			if (ModelPackage.eINSTANCE.getInitially().isSuperTypeOf(domainElement.eClass())) {
				return InitiallyEditPart.VISUAL_ID;
			}
			if (ModelPackage.eINSTANCE.getHoldsAtBetween().isSuperTypeOf(domainElement.eClass())) {
				return HoldsAtBetweenEditPart.VISUAL_ID;
			}
			if (ModelPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
				return ParameterEditPart.VISUAL_ID;
			}
			if (ModelPackage.eINSTANCE.getPrimitiveEvent().isSuperTypeOf(domainElement.eClass())) {
				return PrimitiveEventEditPart.VISUAL_ID;
			}
			if (ModelPackage.eINSTANCE.getType().isSuperTypeOf(domainElement.eClass())) {
				return TypeEditPart.VISUAL_ID;
			}
			if (ModelPackage.eINSTANCE.getInstance().isSuperTypeOf(domainElement.eClass())) {
				return InstanceEditPart.VISUAL_ID;
			}
			if (ModelPackage.eINSTANCE.getContextRelation().isSuperTypeOf(domainElement.eClass())) {
				return ContextRelationEditPart.VISUAL_ID;
			}
			if (ModelPackage.eINSTANCE.getBehaviouralDescription().isSuperTypeOf(domainElement.eClass())) {
				return BehaviouralDescriptionEditPart.VISUAL_ID;
			}
			if (ModelPackage.eINSTANCE.getComplexEvent().isSuperTypeOf(domainElement.eClass())) {
				return ComplexEventEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = model.diagram.part.ModelVisualIDRegistry.getModelID(containerView);
		if (!EnvironmentEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (EnvironmentEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = model.diagram.part.ModelVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = EnvironmentEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case EnvironmentEditPart.VISUAL_ID:
			if (HoldsAtEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HappensEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitiallyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HoldsAtBetweenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveEventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContextRelationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BehaviouralDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComplexEventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParameterEditPart.VISUAL_ID:
			if (ParameterNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimitiveEventEditPart.VISUAL_ID:
			if (PrimitiveEventNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TypeEditPart.VISUAL_ID:
			if (TypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InstanceEditPart.VISUAL_ID:
			if (InstanceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContextRelationEditPart.VISUAL_ID:
			if (ContextRelationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContextRelationTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContextRelationValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BehaviouralDescriptionEditPart.VISUAL_ID:
			if (BehaviouralDescriptionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComplexEventEditPart.VISUAL_ID:
			if (ComplexEventNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(Environment element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case EnvironmentEditPart.VISUAL_ID:
			return false;
		case InstanceEditPart.VISUAL_ID:
		case ContextRelationEditPart.VISUAL_ID:
		case HoldsAtEditPart.VISUAL_ID:
		case PrimitiveEventEditPart.VISUAL_ID:
		case ComplexEventEditPart.VISUAL_ID:
		case ParameterEditPart.VISUAL_ID:
		case InitiallyEditPart.VISUAL_ID:
		case TypeEditPart.VISUAL_ID:
		case HappensEditPart.VISUAL_ID:
		case BehaviouralDescriptionEditPart.VISUAL_ID:
		case HoldsAtBetweenEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return model.diagram.part.ModelVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return model.diagram.part.ModelVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return model.diagram.part.ModelVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return model.diagram.part.ModelVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return model.diagram.part.ModelVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return model.diagram.part.ModelVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
