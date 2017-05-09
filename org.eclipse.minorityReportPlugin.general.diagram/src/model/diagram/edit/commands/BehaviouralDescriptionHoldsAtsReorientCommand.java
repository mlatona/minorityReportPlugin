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
import model.HoldsAt;
import model.diagram.edit.policies.ModelBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class BehaviouralDescriptionHoldsAtsReorientCommand extends EditElementCommand {

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
	public BehaviouralDescriptionHoldsAtsReorientCommand(ReorientReferenceRelationshipRequest request) {
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
		if (!(oldEnd instanceof HoldsAt && newEnd instanceof BehaviouralDescription)) {
			return false;
		}
		return ModelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistBehaviouralDescriptionHoldsAts_4015(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof HoldsAt && newEnd instanceof HoldsAt)) {
			return false;
		}
		return ModelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistBehaviouralDescriptionHoldsAts_4015(getOldSource(), getNewTarget());
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
		getOldSource().getHoldsAts().remove(getOldTarget());
		getNewSource().getHoldsAts().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getHoldsAts().remove(getOldTarget());
		getOldSource().getHoldsAts().add(getNewTarget());
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
	protected HoldsAt getOldTarget() {
		return (HoldsAt) oldEnd;
	}

	/**
	* @generated
	*/
	protected HoldsAt getNewTarget() {
		return (HoldsAt) newEnd;
	}
}
