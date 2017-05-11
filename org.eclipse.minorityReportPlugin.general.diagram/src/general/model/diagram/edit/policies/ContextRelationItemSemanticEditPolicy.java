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

import general.model.diagram.edit.commands.ContextRelationEndingComplexEventCreateCommand;
import general.model.diagram.edit.commands.ContextRelationEndingComplexEventReorientCommand;
import general.model.diagram.edit.commands.ContextRelationInitialComplexEventCreateCommand;
import general.model.diagram.edit.commands.ContextRelationInitialComplexEventReorientCommand;
import general.model.diagram.edit.commands.ContextRelationParametersCreateCommand;
import general.model.diagram.edit.commands.ContextRelationParametersReorientCommand;
import general.model.diagram.edit.commands.HoldsAtBetweenContextRelationCreateCommand;
import general.model.diagram.edit.commands.HoldsAtBetweenContextRelationReorientCommand;
import general.model.diagram.edit.commands.HoldsAtContextRelationCreateCommand;
import general.model.diagram.edit.commands.HoldsAtContextRelationReorientCommand;
import general.model.diagram.edit.commands.InitiallyContextRelationCreateCommand;
import general.model.diagram.edit.commands.InitiallyContextRelationReorientCommand;
import general.model.diagram.edit.parts.ContextRelationEndingComplexEventEditPart;
import general.model.diagram.edit.parts.ContextRelationInitialComplexEventEditPart;
import general.model.diagram.edit.parts.ContextRelationParametersEditPart;
import general.model.diagram.edit.parts.HoldsAtBetweenContextRelationEditPart;
import general.model.diagram.edit.parts.HoldsAtContextRelationEditPart;
import general.model.diagram.edit.parts.InitiallyContextRelationEditPart;
import general.model.diagram.part.ModelVisualIDRegistry;
import general.model.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class ContextRelationItemSemanticEditPolicy extends ModelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ContextRelationItemSemanticEditPolicy() {
		super(ModelElementTypes.ContextRelation_2011);
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
			if (ModelVisualIDRegistry.getVisualID(incomingLink) == HoldsAtContextRelationEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ModelVisualIDRegistry.getVisualID(incomingLink) == InitiallyContextRelationEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ModelVisualIDRegistry.getVisualID(incomingLink) == HoldsAtBetweenContextRelationEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (ModelVisualIDRegistry.getVisualID(outgoingLink) == ContextRelationParametersEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ModelVisualIDRegistry
					.getVisualID(outgoingLink) == ContextRelationEndingComplexEventEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ModelVisualIDRegistry
					.getVisualID(outgoingLink) == ContextRelationInitialComplexEventEditPart.VISUAL_ID) {
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
		if (ModelElementTypes.HoldsAtContextRelation_4001 == req.getElementType()) {
			return null;
		}
		if (ModelElementTypes.ContextRelationParameters_4003 == req.getElementType()) {
			return getGEFWrapper(new ContextRelationParametersCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ModelElementTypes.InitiallyContextRelation_4005 == req.getElementType()) {
			return null;
		}
		if (ModelElementTypes.ContextRelationEndingComplexEvent_4006 == req.getElementType()) {
			return getGEFWrapper(
					new ContextRelationEndingComplexEventCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ModelElementTypes.HoldsAtBetweenContextRelation_4013 == req.getElementType()) {
			return null;
		}
		if (ModelElementTypes.ContextRelationInitialComplexEvent_4016 == req.getElementType()) {
			return getGEFWrapper(
					new ContextRelationInitialComplexEventCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ModelElementTypes.HoldsAtContextRelation_4001 == req.getElementType()) {
			return getGEFWrapper(new HoldsAtContextRelationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ModelElementTypes.ContextRelationParameters_4003 == req.getElementType()) {
			return null;
		}
		if (ModelElementTypes.InitiallyContextRelation_4005 == req.getElementType()) {
			return getGEFWrapper(new InitiallyContextRelationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ModelElementTypes.ContextRelationEndingComplexEvent_4006 == req.getElementType()) {
			return null;
		}
		if (ModelElementTypes.HoldsAtBetweenContextRelation_4013 == req.getElementType()) {
			return getGEFWrapper(new HoldsAtBetweenContextRelationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ModelElementTypes.ContextRelationInitialComplexEvent_4016 == req.getElementType()) {
			return null;
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
		case HoldsAtContextRelationEditPart.VISUAL_ID:
			return getGEFWrapper(new HoldsAtContextRelationReorientCommand(req));
		case ContextRelationParametersEditPart.VISUAL_ID:
			return getGEFWrapper(new ContextRelationParametersReorientCommand(req));
		case InitiallyContextRelationEditPart.VISUAL_ID:
			return getGEFWrapper(new InitiallyContextRelationReorientCommand(req));
		case ContextRelationEndingComplexEventEditPart.VISUAL_ID:
			return getGEFWrapper(new ContextRelationEndingComplexEventReorientCommand(req));
		case HoldsAtBetweenContextRelationEditPart.VISUAL_ID:
			return getGEFWrapper(new HoldsAtBetweenContextRelationReorientCommand(req));
		case ContextRelationInitialComplexEventEditPart.VISUAL_ID:
			return getGEFWrapper(new ContextRelationInitialComplexEventReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
