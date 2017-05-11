package general.model.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import general.model.diagram.edit.commands.ComplexEventBehaviouralDescriptionsCreateCommand;
import general.model.diagram.edit.commands.ComplexEventBehaviouralDescriptionsReorientCommand;
import general.model.diagram.edit.commands.ContextRelationEndingComplexEventCreateCommand;
import general.model.diagram.edit.commands.ContextRelationEndingComplexEventReorientCommand;
import general.model.diagram.edit.commands.ContextRelationInitialComplexEventCreateCommand;
import general.model.diagram.edit.commands.ContextRelationInitialComplexEventReorientCommand;
import general.model.diagram.edit.commands.EventParametersCreateCommand;
import general.model.diagram.edit.commands.EventParametersReorientCommand;
import general.model.diagram.edit.commands.HappensEventCreateCommand;
import general.model.diagram.edit.commands.HappensEventReorientCommand;
import general.model.diagram.edit.parts.ComplexEventBehaviouralDescriptionsEditPart;
import general.model.diagram.edit.parts.ContextRelationEndingComplexEventEditPart;
import general.model.diagram.edit.parts.ContextRelationInitialComplexEventEditPart;
import general.model.diagram.edit.parts.EventParametersEditPart;
import general.model.diagram.edit.parts.HappensEventEditPart;
import general.model.diagram.part.ModelVisualIDRegistry;
import general.model.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class ComplexEventItemSemanticEditPolicy extends ModelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ComplexEventItemSemanticEditPolicy() {
		super(ModelElementTypes.ComplexEvent_2010);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (ModelVisualIDRegistry
					.getVisualID(incomingLink) == ContextRelationEndingComplexEventEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ModelVisualIDRegistry.getVisualID(incomingLink) == HappensEventEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ModelVisualIDRegistry
					.getVisualID(incomingLink) == ContextRelationInitialComplexEventEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (ModelVisualIDRegistry
					.getVisualID(outgoingLink) == ComplexEventBehaviouralDescriptionsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ModelVisualIDRegistry.getVisualID(outgoingLink) == EventParametersEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ModelElementTypes.ContextRelationEndingComplexEvent_4006 == req.getElementType()) {
			return null;
		}
		if (ModelElementTypes.HappensEvent_4007 == req.getElementType()) {
			return null;
		}
		if (ModelElementTypes.ComplexEventBehaviouralDescriptions_4010 == req.getElementType()) {
			return getGEFWrapper(
					new ComplexEventBehaviouralDescriptionsCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ModelElementTypes.EventParameters_4012 == req.getElementType()) {
			return getGEFWrapper(new EventParametersCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ModelElementTypes.ContextRelationInitialComplexEvent_4016 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ModelElementTypes.ContextRelationEndingComplexEvent_4006 == req.getElementType()) {
			return getGEFWrapper(
					new ContextRelationEndingComplexEventCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ModelElementTypes.HappensEvent_4007 == req.getElementType()) {
			return getGEFWrapper(new HappensEventCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ModelElementTypes.ComplexEventBehaviouralDescriptions_4010 == req.getElementType()) {
			return null;
		}
		if (ModelElementTypes.EventParameters_4012 == req.getElementType()) {
			return null;
		}
		if (ModelElementTypes.ContextRelationInitialComplexEvent_4016 == req.getElementType()) {
			return getGEFWrapper(
					new ContextRelationInitialComplexEventCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ContextRelationEndingComplexEventEditPart.VISUAL_ID:
			return getGEFWrapper(new ContextRelationEndingComplexEventReorientCommand(req));
		case HappensEventEditPart.VISUAL_ID:
			return getGEFWrapper(new HappensEventReorientCommand(req));
		case ComplexEventBehaviouralDescriptionsEditPart.VISUAL_ID:
			return getGEFWrapper(new ComplexEventBehaviouralDescriptionsReorientCommand(req));
		case EventParametersEditPart.VISUAL_ID:
			return getGEFWrapper(new EventParametersReorientCommand(req));
		case ContextRelationInitialComplexEventEditPart.VISUAL_ID:
			return getGEFWrapper(new ContextRelationInitialComplexEventReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
