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

import model.diagram.edit.commands.BehaviouralDescriptionHappensCreateCommand;
import model.diagram.edit.commands.BehaviouralDescriptionHappensReorientCommand;
import model.diagram.edit.commands.BehaviouralDescriptionHoldsAtBetweensCreateCommand;
import model.diagram.edit.commands.BehaviouralDescriptionHoldsAtBetweensReorientCommand;
import model.diagram.edit.commands.BehaviouralDescriptionHoldsAtsCreateCommand;
import model.diagram.edit.commands.BehaviouralDescriptionHoldsAtsReorientCommand;
import model.diagram.edit.commands.ComplexEventBehaviouralDescriptionsCreateCommand;
import model.diagram.edit.commands.ComplexEventBehaviouralDescriptionsReorientCommand;
import model.diagram.edit.parts.BehaviouralDescriptionHappensEditPart;
import model.diagram.edit.parts.BehaviouralDescriptionHoldsAtBetweensEditPart;
import model.diagram.edit.parts.BehaviouralDescriptionHoldsAtsEditPart;
import model.diagram.edit.parts.ComplexEventBehaviouralDescriptionsEditPart;
import model.diagram.part.ModelVisualIDRegistry;
import model.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class BehaviouralDescriptionItemSemanticEditPolicy extends ModelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public BehaviouralDescriptionItemSemanticEditPolicy() {
		super(ModelElementTypes.BehaviouralDescription_2010);
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
					.getVisualID(incomingLink) == ComplexEventBehaviouralDescriptionsEditPart.VISUAL_ID) {
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
					.getVisualID(outgoingLink) == BehaviouralDescriptionHoldsAtBetweensEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ModelVisualIDRegistry.getVisualID(outgoingLink) == BehaviouralDescriptionHoldsAtsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ModelVisualIDRegistry.getVisualID(outgoingLink) == BehaviouralDescriptionHappensEditPart.VISUAL_ID) {
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
		if (ModelElementTypes.BehaviouralDescriptionHoldsAtBetweens_4007 == req.getElementType()) {
			return getGEFWrapper(
					new BehaviouralDescriptionHoldsAtBetweensCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ModelElementTypes.ComplexEventBehaviouralDescriptions_4010 == req.getElementType()) {
			return null;
		}
		if (ModelElementTypes.BehaviouralDescriptionHoldsAts_4012 == req.getElementType()) {
			return getGEFWrapper(
					new BehaviouralDescriptionHoldsAtsCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ModelElementTypes.BehaviouralDescriptionHappens_4016 == req.getElementType()) {
			return getGEFWrapper(new BehaviouralDescriptionHappensCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ModelElementTypes.BehaviouralDescriptionHoldsAtBetweens_4007 == req.getElementType()) {
			return null;
		}
		if (ModelElementTypes.ComplexEventBehaviouralDescriptions_4010 == req.getElementType()) {
			return getGEFWrapper(
					new ComplexEventBehaviouralDescriptionsCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ModelElementTypes.BehaviouralDescriptionHoldsAts_4012 == req.getElementType()) {
			return null;
		}
		if (ModelElementTypes.BehaviouralDescriptionHappens_4016 == req.getElementType()) {
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
		case BehaviouralDescriptionHoldsAtBetweensEditPart.VISUAL_ID:
			return getGEFWrapper(new BehaviouralDescriptionHoldsAtBetweensReorientCommand(req));
		case ComplexEventBehaviouralDescriptionsEditPart.VISUAL_ID:
			return getGEFWrapper(new ComplexEventBehaviouralDescriptionsReorientCommand(req));
		case BehaviouralDescriptionHoldsAtsEditPart.VISUAL_ID:
			return getGEFWrapper(new BehaviouralDescriptionHoldsAtsReorientCommand(req));
		case BehaviouralDescriptionHappensEditPart.VISUAL_ID:
			return getGEFWrapper(new BehaviouralDescriptionHappensReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
