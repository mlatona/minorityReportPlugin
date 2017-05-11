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

import general.model.diagram.edit.commands.BehaviouralDescriptionHoldsAtsCreateCommand;
import general.model.diagram.edit.commands.BehaviouralDescriptionHoldsAtsReorientCommand;
import general.model.diagram.edit.commands.HoldsAtContextRelationCreateCommand;
import general.model.diagram.edit.commands.HoldsAtContextRelationReorientCommand;
import general.model.diagram.edit.commands.InitiallyHoldsAtsCreateCommand;
import general.model.diagram.edit.commands.InitiallyHoldsAtsReorientCommand;
import general.model.diagram.edit.parts.BehaviouralDescriptionHoldsAtsEditPart;
import general.model.diagram.edit.parts.HoldsAtContextRelationEditPart;
import general.model.diagram.edit.parts.InitiallyHoldsAtsEditPart;
import general.model.diagram.part.ModelVisualIDRegistry;
import general.model.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class HoldsAtItemSemanticEditPolicy extends ModelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public HoldsAtItemSemanticEditPolicy() {
		super(ModelElementTypes.HoldsAt_2008);
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
			if (ModelVisualIDRegistry.getVisualID(incomingLink) == InitiallyHoldsAtsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ModelVisualIDRegistry.getVisualID(incomingLink) == BehaviouralDescriptionHoldsAtsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (ModelVisualIDRegistry.getVisualID(outgoingLink) == HoldsAtContextRelationEditPart.VISUAL_ID) {
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
			return getGEFWrapper(new HoldsAtContextRelationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ModelElementTypes.InitiallyHoldsAts_4008 == req.getElementType()) {
			return null;
		}
		if (ModelElementTypes.BehaviouralDescriptionHoldsAts_4015 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ModelElementTypes.HoldsAtContextRelation_4001 == req.getElementType()) {
			return null;
		}
		if (ModelElementTypes.InitiallyHoldsAts_4008 == req.getElementType()) {
			return getGEFWrapper(new InitiallyHoldsAtsCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ModelElementTypes.BehaviouralDescriptionHoldsAts_4015 == req.getElementType()) {
			return getGEFWrapper(
					new BehaviouralDescriptionHoldsAtsCreateCommand(req, req.getSource(), req.getTarget()));
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
		case InitiallyHoldsAtsEditPart.VISUAL_ID:
			return getGEFWrapper(new InitiallyHoldsAtsReorientCommand(req));
		case BehaviouralDescriptionHoldsAtsEditPart.VISUAL_ID:
			return getGEFWrapper(new BehaviouralDescriptionHoldsAtsReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
