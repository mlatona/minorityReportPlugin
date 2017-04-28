package model.diagram.edit.policies;

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

import model.diagram.edit.commands.ContextRelationEndingComplexEventCreateCommand;
import model.diagram.edit.commands.ContextRelationEndingComplexEventReorientCommand;
import model.diagram.edit.commands.ContextRelationInitialComplexEventCreateCommand;
import model.diagram.edit.commands.ContextRelationInitialComplexEventReorientCommand;
import model.diagram.edit.commands.ContextRelationParametersCreateCommand;
import model.diagram.edit.commands.ContextRelationParametersReorientCommand;
import model.diagram.edit.commands.HappensContextRelationCreateCommand;
import model.diagram.edit.commands.HappensContextRelationReorientCommand;
import model.diagram.edit.commands.HoldsAtBetweenContextRelationCreateCommand;
import model.diagram.edit.commands.HoldsAtBetweenContextRelationReorientCommand;
import model.diagram.edit.commands.HoldsAtContextRelationCreateCommand;
import model.diagram.edit.commands.HoldsAtContextRelationReorientCommand;
import model.diagram.edit.commands.InitiallyContextRelationCreateCommand;
import model.diagram.edit.commands.InitiallyContextRelationReorientCommand;
import model.diagram.edit.parts.ContextRelationEndingComplexEventEditPart;
import model.diagram.edit.parts.ContextRelationInitialComplexEventEditPart;
import model.diagram.edit.parts.ContextRelationParametersEditPart;
import model.diagram.edit.parts.HappensContextRelationEditPart;
import model.diagram.edit.parts.HoldsAtBetweenContextRelationEditPart;
import model.diagram.edit.parts.HoldsAtContextRelationEditPart;
import model.diagram.edit.parts.InitiallyContextRelationEditPart;
import model.diagram.part.GeneratorVisualIDRegistry;
import model.diagram.providers.GeneratorElementTypes;

/**
 * @generated
 */
public class ContextRelationItemSemanticEditPolicy extends GeneratorBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ContextRelationItemSemanticEditPolicy() {
		super(GeneratorElementTypes.ContextRelation_2002);
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
			if (GeneratorVisualIDRegistry.getVisualID(incomingLink) == HappensContextRelationEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (GeneratorVisualIDRegistry
					.getVisualID(incomingLink) == HoldsAtBetweenContextRelationEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (GeneratorVisualIDRegistry.getVisualID(incomingLink) == InitiallyContextRelationEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (GeneratorVisualIDRegistry.getVisualID(incomingLink) == HoldsAtContextRelationEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (GeneratorVisualIDRegistry.getVisualID(outgoingLink) == ContextRelationParametersEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (GeneratorVisualIDRegistry
					.getVisualID(outgoingLink) == ContextRelationEndingComplexEventEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (GeneratorVisualIDRegistry
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
		if (GeneratorElementTypes.HappensContextRelation_4009 == req.getElementType()) {
			return null;
		}
		if (GeneratorElementTypes.HoldsAtBetweenContextRelation_4003 == req.getElementType()) {
			return null;
		}
		if (GeneratorElementTypes.InitiallyContextRelation_4010 == req.getElementType()) {
			return null;
		}
		if (GeneratorElementTypes.ContextRelationParameters_4012 == req.getElementType()) {
			return getGEFWrapper(new ContextRelationParametersCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (GeneratorElementTypes.ContextRelationEndingComplexEvent_4001 == req.getElementType()) {
			return getGEFWrapper(
					new ContextRelationEndingComplexEventCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (GeneratorElementTypes.ContextRelationInitialComplexEvent_4016 == req.getElementType()) {
			return getGEFWrapper(
					new ContextRelationInitialComplexEventCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (GeneratorElementTypes.HoldsAtContextRelation_4017 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (GeneratorElementTypes.HappensContextRelation_4009 == req.getElementType()) {
			return getGEFWrapper(new HappensContextRelationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (GeneratorElementTypes.HoldsAtBetweenContextRelation_4003 == req.getElementType()) {
			return getGEFWrapper(new HoldsAtBetweenContextRelationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (GeneratorElementTypes.InitiallyContextRelation_4010 == req.getElementType()) {
			return getGEFWrapper(new InitiallyContextRelationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (GeneratorElementTypes.ContextRelationParameters_4012 == req.getElementType()) {
			return null;
		}
		if (GeneratorElementTypes.ContextRelationEndingComplexEvent_4001 == req.getElementType()) {
			return null;
		}
		if (GeneratorElementTypes.ContextRelationInitialComplexEvent_4016 == req.getElementType()) {
			return null;
		}
		if (GeneratorElementTypes.HoldsAtContextRelation_4017 == req.getElementType()) {
			return getGEFWrapper(new HoldsAtContextRelationCreateCommand(req, req.getSource(), req.getTarget()));
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
		case HappensContextRelationEditPart.VISUAL_ID:
			return getGEFWrapper(new HappensContextRelationReorientCommand(req));
		case HoldsAtBetweenContextRelationEditPart.VISUAL_ID:
			return getGEFWrapper(new HoldsAtBetweenContextRelationReorientCommand(req));
		case InitiallyContextRelationEditPart.VISUAL_ID:
			return getGEFWrapper(new InitiallyContextRelationReorientCommand(req));
		case ContextRelationParametersEditPart.VISUAL_ID:
			return getGEFWrapper(new ContextRelationParametersReorientCommand(req));
		case ContextRelationEndingComplexEventEditPart.VISUAL_ID:
			return getGEFWrapper(new ContextRelationEndingComplexEventReorientCommand(req));
		case ContextRelationInitialComplexEventEditPart.VISUAL_ID:
			return getGEFWrapper(new ContextRelationInitialComplexEventReorientCommand(req));
		case HoldsAtContextRelationEditPart.VISUAL_ID:
			return getGEFWrapper(new HoldsAtContextRelationReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
