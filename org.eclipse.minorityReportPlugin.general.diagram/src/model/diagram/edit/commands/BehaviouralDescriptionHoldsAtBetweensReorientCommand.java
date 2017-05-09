package model.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import model.BehaviouralDescription;
import model.HoldsAtBetween;
import model.diagram.edit.policies.ModelBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class BehaviouralDescriptionHoldsAtBetweensReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject referenceOwner;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public BehaviouralDescriptionHoldsAtBetweensReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == referenceOwner instanceof BehaviouralDescription) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof HoldsAtBetween && newEnd instanceof BehaviouralDescription)) {
			return false;
		}
		return ModelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistBehaviouralDescriptionHoldsAtBetweens_4014(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof HoldsAtBetween && newEnd instanceof HoldsAtBetween)) {
			return false;
		}
		return ModelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistBehaviouralDescriptionHoldsAtBetweens_4014(getOldSource(), getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getHoldsAtBetweens().remove(getOldTarget());
		getNewSource().getHoldsAtBetweens().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getHoldsAtBetweens().remove(getOldTarget());
		getOldSource().getHoldsAtBetweens().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected BehaviouralDescription getOldSource() {
		return (BehaviouralDescription) referenceOwner;
	}

	/**
	* @generated
	*/
	protected BehaviouralDescription getNewSource() {
		return (BehaviouralDescription) newEnd;
	}

	/**
	* @generated
	*/
	protected HoldsAtBetween getOldTarget() {
		return (HoldsAtBetween) oldEnd;
	}

	/**
	* @generated
	*/
	protected HoldsAtBetween getNewTarget() {
		return (HoldsAtBetween) newEnd;
	}
}
