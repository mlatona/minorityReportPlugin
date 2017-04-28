package model.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import model.diagram.part.GeneratorVisualIDRegistry;

/**
 * @generated
 */
public class GeneratorEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (GeneratorVisualIDRegistry.getVisualID(view)) {

			case EnvironmentEditPart.VISUAL_ID:
				return new EnvironmentEditPart(view);

			case HoldsAtEditPart.VISUAL_ID:
				return new HoldsAtEditPart(view);

			case HoldsAtBetweenEditPart.VISUAL_ID:
				return new HoldsAtBetweenEditPart(view);

			case ComplexEventEditPart.VISUAL_ID:
				return new ComplexEventEditPart(view);

			case ComplexEventNameEditPart.VISUAL_ID:
				return new ComplexEventNameEditPart(view);

			case PrimitiveEventEditPart.VISUAL_ID:
				return new PrimitiveEventEditPart(view);

			case PrimitiveEventNameEditPart.VISUAL_ID:
				return new PrimitiveEventNameEditPart(view);

			case InstanceEditPart.VISUAL_ID:
				return new InstanceEditPart(view);

			case InstanceNameEditPart.VISUAL_ID:
				return new InstanceNameEditPart(view);

			case ParameterEditPart.VISUAL_ID:
				return new ParameterEditPart(view);

			case ParameterNameEditPart.VISUAL_ID:
				return new ParameterNameEditPart(view);

			case ContextRelationEditPart.VISUAL_ID:
				return new ContextRelationEditPart(view);

			case ContextRelationNameEditPart.VISUAL_ID:
				return new ContextRelationNameEditPart(view);

			case TypeEditPart.VISUAL_ID:
				return new TypeEditPart(view);

			case TypeNameEditPart.VISUAL_ID:
				return new TypeNameEditPart(view);

			case BehaviouralDescriptionEditPart.VISUAL_ID:
				return new BehaviouralDescriptionEditPart(view);

			case BehaviouralDescriptionNameEditPart.VISUAL_ID:
				return new BehaviouralDescriptionNameEditPart(view);

			case HappensEditPart.VISUAL_ID:
				return new HappensEditPart(view);

			case InitiallyEditPart.VISUAL_ID:
				return new InitiallyEditPart(view);

			case InitiallyHoldsAtsEditPart.VISUAL_ID:
				return new InitiallyHoldsAtsEditPart(view);

			case HappensContextRelationEditPart.VISUAL_ID:
				return new HappensContextRelationEditPart(view);

			case HoldsAtBetweenContextRelationEditPart.VISUAL_ID:
				return new HoldsAtBetweenContextRelationEditPart(view);

			case InstanceTypeEditPart.VISUAL_ID:
				return new InstanceTypeEditPart(view);

			case EventParametersEditPart.VISUAL_ID:
				return new EventParametersEditPart(view);

			case InitiallyContextRelationEditPart.VISUAL_ID:
				return new InitiallyContextRelationEditPart(view);

			case ParameterTypeEditPart.VISUAL_ID:
				return new ParameterTypeEditPart(view);

			case BehaviouralDescriptionHoldsAtBetweensEditPart.VISUAL_ID:
				return new BehaviouralDescriptionHoldsAtBetweensEditPart(view);

			case InitiallyHoldsAtBetweensEditPart.VISUAL_ID:
				return new InitiallyHoldsAtBetweensEditPart(view);

			case ParameterInstanceEditPart.VISUAL_ID:
				return new ParameterInstanceEditPart(view);

			case BehaviouralDescriptionHappensEditPart.VISUAL_ID:
				return new BehaviouralDescriptionHappensEditPart(view);

			case ComplexEventBehaviouralDescriptionsEditPart.VISUAL_ID:
				return new ComplexEventBehaviouralDescriptionsEditPart(view);

			case ContextRelationParametersEditPart.VISUAL_ID:
				return new ContextRelationParametersEditPart(view);

			case ContextRelationEndingComplexEventEditPart.VISUAL_ID:
				return new ContextRelationEndingComplexEventEditPart(view);

			case ContextRelationInitialComplexEventEditPart.VISUAL_ID:
				return new ContextRelationInitialComplexEventEditPart(view);

			case BehaviouralDescriptionHoldsAtsEditPart.VISUAL_ID:
				return new BehaviouralDescriptionHoldsAtsEditPart(view);

			case InitiallyHappensEditPart.VISUAL_ID:
				return new InitiallyHappensEditPart(view);

			case HoldsAtContextRelationEditPart.VISUAL_ID:
				return new HoldsAtContextRelationEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
