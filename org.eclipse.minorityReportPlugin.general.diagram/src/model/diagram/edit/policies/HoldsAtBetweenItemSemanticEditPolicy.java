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

import model.diagram.edit.commands.BehaviouralDescriptionHoldsAtBetweensCreateCommand;
import model.diagram.edit.commands.BehaviouralDescriptionHoldsAtBetweensReorientCommand;
import model.diagram.edit.commands.HoldsAtBetweenContextRelationCreateCommand;
import model.diagram.edit.commands.HoldsAtBetweenContextRelationReorientCommand;
import model.diagram.edit.commands.InitiallyHoldsAtBetweensCreateCommand;
import model.diagram.edit.commands.InitiallyHoldsAtBetweensReorientCommand;
import model.diagram.edit.parts.BehaviouralDescriptionHoldsAtBetweensEditPart;
import model.diagram.edit.parts.HoldsAtBetweenContextRelationEditPart;
import model.diagram.edit.parts.InitiallyHoldsAtBetweensEditPart;
import model.diagram.part.ModelVisualIDRegistry;
import model.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class HoldsAtBetweenItemSemanticEditPolicy extends ModelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public HoldsAtBetweenItemSemanticEditPolicy() {
		super(ModelElementTypes.HoldsAtBetween_2003);
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
			if (ModelVisualIDRegistry.getVisualID(incomingLink) == InitiallyHoldsAtBetweensEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ModelVisualIDRegistry
					.getVisualID(incomingLink) == BehaviouralDescriptionHoldsAtBetweensEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (ModelVisualIDRegistry.getVisualID(outgoingLink) == HoldsAtBetweenContextRelationEditPart.VISUAL_ID) {
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
		if (ModelElementTypes.InitiallyHoldsAtBetweens_4009 == req.getElementType()) {
			return null;
		}
		if (ModelElementTypes.HoldsAtBetweenContextRelation_4013 == req.getElementType()) {
			return getGEFWrapper(new HoldsAtBetweenContextRelationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ModelElementTypes.BehaviouralDescriptionHoldsAtBetweens_4014 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ModelElementTypes.InitiallyHoldsAtBetweens_4009 == req.getElementType()) {
			return getGEFWrapper(new InitiallyHoldsAtBetweensCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ModelElementTypes.HoldsAtBetweenContextRelation_4013 == req.getElementType()) {
			return null;
		}
		if (ModelElementTypes.BehaviouralDescriptionHoldsAtBetweens_4014 == req.getElementType()) {
			return getGEFWrapper(
					new BehaviouralDescriptionHoldsAtBetweensCreateCommand(req, req.getSource(), req.getTarget()));
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
		case InitiallyHoldsAtBetweensEditPart.VISUAL_ID:
			return getGEFWrapper(new InitiallyHoldsAtBetweensReorientCommand(req));
		case HoldsAtBetweenContextRelationEditPart.VISUAL_ID:
			return getGEFWrapper(new HoldsAtBetweenContextRelationReorientCommand(req));
		case BehaviouralDescriptionHoldsAtBetweensEditPart.VISUAL_ID:
			return getGEFWrapper(new BehaviouralDescriptionHoldsAtBetweensReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
