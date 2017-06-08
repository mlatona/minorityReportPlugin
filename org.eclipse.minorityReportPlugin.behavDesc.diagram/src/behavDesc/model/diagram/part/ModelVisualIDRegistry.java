package behavDesc.model.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import model.Environment;
import model.ModelPackage;

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
	private static final String DEBUG_KEY = "org.eclipse.kEEPER.plugin.behavDesc.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (behavDesc.model.diagram.edit.parts.EnvironmentEditPart.MODEL_ID.equals(view.getType())) {
				return behavDesc.model.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return behavDesc.model.diagram.part.ModelVisualIDRegistry.getVisualID(view.getType());
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
				behavDesc.model.diagram.part.ModelDiagramEditorPlugin.getInstance()
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
			return behavDesc.model.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID;
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
		String containerModelID = behavDesc.model.diagram.part.ModelVisualIDRegistry.getModelID(containerView);
		if (!behavDesc.model.diagram.edit.parts.EnvironmentEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (behavDesc.model.diagram.edit.parts.EnvironmentEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = behavDesc.model.diagram.part.ModelVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = behavDesc.model.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case behavDesc.model.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID:
			if (ModelPackage.eINSTANCE.getBehaviouralDescription().isSuperTypeOf(domainElement.eClass())) {
				return behavDesc.model.diagram.edit.parts.BehaviouralDescriptionEditPart.VISUAL_ID;
			}
			if (ModelPackage.eINSTANCE.getHappens().isSuperTypeOf(domainElement.eClass())) {
				return behavDesc.model.diagram.edit.parts.HappensEditPart.VISUAL_ID;
			}
			if (ModelPackage.eINSTANCE.getHoldsAt().isSuperTypeOf(domainElement.eClass())) {
				return behavDesc.model.diagram.edit.parts.HoldsAtEditPart.VISUAL_ID;
			}
			if (ModelPackage.eINSTANCE.getHoldsAtBetween().isSuperTypeOf(domainElement.eClass())) {
				return behavDesc.model.diagram.edit.parts.HoldsAtBetweenEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = behavDesc.model.diagram.part.ModelVisualIDRegistry.getModelID(containerView);
		if (!behavDesc.model.diagram.edit.parts.EnvironmentEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (behavDesc.model.diagram.edit.parts.EnvironmentEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = behavDesc.model.diagram.part.ModelVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = behavDesc.model.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case behavDesc.model.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID:
			if (behavDesc.model.diagram.edit.parts.BehaviouralDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (behavDesc.model.diagram.edit.parts.HappensEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (behavDesc.model.diagram.edit.parts.HoldsAtEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (behavDesc.model.diagram.edit.parts.HoldsAtBetweenEditPart.VISUAL_ID == nodeVisualID) {
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
		case behavDesc.model.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID:
			return false;
		case behavDesc.model.diagram.edit.parts.BehaviouralDescriptionEditPart.VISUAL_ID:
		case behavDesc.model.diagram.edit.parts.HappensEditPart.VISUAL_ID:
		case behavDesc.model.diagram.edit.parts.HoldsAtEditPart.VISUAL_ID:
		case behavDesc.model.diagram.edit.parts.HoldsAtBetweenEditPart.VISUAL_ID:
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
			return behavDesc.model.diagram.part.ModelVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return behavDesc.model.diagram.part.ModelVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return behavDesc.model.diagram.part.ModelVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return behavDesc.model.diagram.part.ModelVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return behavDesc.model.diagram.part.ModelVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return behavDesc.model.diagram.part.ModelVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
