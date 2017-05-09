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

import model.diagram.edit.commands.InitiallyContextRelationCreateCommand;
import model.diagram.edit.commands.InitiallyContextRelationReorientCommand;
import model.diagram.edit.commands.InitiallyHappensCreateCommand;
import model.diagram.edit.commands.InitiallyHappensReorientCommand;
import model.diagram.edit.commands.InitiallyHoldsAtBetweensCreateCommand;
import model.diagram.edit.commands.InitiallyHoldsAtBetweensReorientCommand;
import model.diagram.edit.commands.InitiallyHoldsAtsCreateCommand;
import model.diagram.edit.commands.InitiallyHoldsAtsReorientCommand;
import model.diagram.edit.parts.InitiallyContextRelationEditPart;
import model.diagram.edit.parts.InitiallyHappensEditPart;
import model.diagram.edit.parts.InitiallyHoldsAtBetweensEditPart;
import model.diagram.edit.parts.InitiallyHoldsAtsEditPart;
import model.diagram.part.ModelVisualIDRegistry;
import model.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class InitiallyItemSemanticEditPolicy extends ModelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InitiallyItemSemanticEditPolicy() {
		super(ModelElementTypes.Initially_2006);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (ModelVisualIDRegistry.getVisualID(outgoingLink) == InitiallyContextRelationEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ModelVisualIDRegistry.getVisualID(outgoingLink) == InitiallyHoldsAtsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ModelVisualIDRegistry.getVisualID(outgoingLink) == InitiallyHoldsAtBetweensEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ModelVisualIDRegistry.getVisualID(outgoingLink) == InitiallyHappensEditPart.VISUAL_ID) {
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
		if (ModelElementTypes.InitiallyContextRelation_4005 == req.getElementType()) {
			return getGEFWrapper(new InitiallyContextRelationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ModelElementTypes.InitiallyHoldsAts_4008 == req.getElementType()) {
			return getGEFWrapper(new InitiallyHoldsAtsCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ModelElementTypes.InitiallyHoldsAtBetweens_4009 == req.getElementType()) {
			return getGEFWrapper(new InitiallyHoldsAtBetweensCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ModelElementTypes.InitiallyHappens_4011 == req.getElementType()) {
			return getGEFWrapper(new InitiallyHappensCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ModelElementTypes.InitiallyContextRelation_4005 == req.getElementType()) {
			return null;
		}
		if (ModelElementTypes.InitiallyHoldsAts_4008 == req.getElementType()) {
			return null;
		}
		if (ModelElementTypes.InitiallyHoldsAtBetweens_4009 == req.getElementType()) {
			return null;
		}
		if (ModelElementTypes.InitiallyHappens_4011 == req.getElementType()) {
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
		case InitiallyContextRelationEditPart.VISUAL_ID:
			return getGEFWrapper(new InitiallyContextRelationReorientCommand(req));
		case InitiallyHoldsAtsEditPart.VISUAL_ID:
			return getGEFWrapper(new InitiallyHoldsAtsReorientCommand(req));
		case InitiallyHoldsAtBetweensEditPart.VISUAL_ID:
			return getGEFWrapper(new InitiallyHoldsAtBetweensReorientCommand(req));
		case InitiallyHappensEditPart.VISUAL_ID:
			return getGEFWrapper(new InitiallyHappensReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
