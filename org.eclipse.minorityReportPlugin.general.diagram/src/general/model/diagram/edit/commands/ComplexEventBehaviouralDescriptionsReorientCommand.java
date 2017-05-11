package general.model.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import general.model.diagram.edit.policies.ModelBaseItemSemanticEditPolicy;
import model.BehaviouralDescription;
import model.ComplexEvent;

/**
 * @generated
 */
public class ComplexEventBehaviouralDescriptionsReorientCommand extends EditElementCommand {

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
	public ComplexEventBehaviouralDescriptionsReorientCommand(ReorientReferenceRelationshipRequest request) {
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
		if (false == referenceOwner instanceof ComplexEvent) {
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
		if (!(oldEnd instanceof BehaviouralDescription && newEnd instanceof ComplexEvent)) {
			return false;
		}
		return ModelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistComplexEventBehaviouralDescriptions_4010(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof BehaviouralDescription && newEnd instanceof BehaviouralDescription)) {
			return false;
		}
		return ModelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistComplexEventBehaviouralDescriptions_4010(getOldSource(), getNewTarget());
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
		getOldSource().setBehaviouralDescriptions(null);
		getNewSource().setBehaviouralDescriptions(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setBehaviouralDescriptions(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected ComplexEvent getOldSource() {
		return (ComplexEvent) referenceOwner;
	}

	/**
	* @generated
	*/
	protected ComplexEvent getNewSource() {
		return (ComplexEvent) newEnd;
	}

	/**
	* @generated
	*/
	protected BehaviouralDescription getOldTarget() {
		return (BehaviouralDescription) oldEnd;
	}

	/**
	* @generated
	*/
	protected BehaviouralDescription getNewTarget() {
		return (BehaviouralDescription) newEnd;
	}
}
