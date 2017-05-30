package event2.model.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import event2.model.diagram.edit.policies.ModelBaseItemSemanticEditPolicy;
import model.Agent;
import model.Environment;
import model.Observer;
import model.PrimitiveEvent;

/**
 * @generated
 */
public class PrimitiveEventReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

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
	public PrimitiveEventReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof PrimitiveEvent) {
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
		if (!(oldEnd instanceof Agent && newEnd instanceof Agent)) {
			return false;
		}
		Observer target = getLink().getObserver();
		if (!(getLink().eContainer() instanceof Environment)) {
			return false;
		}
		Environment container = (Environment) getLink().eContainer();
		return ModelBaseItemSemanticEditPolicy.getLinkConstraints().canExistPrimitiveEvent_4001(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Observer && newEnd instanceof Observer)) {
			return false;
		}
		Agent source = getLink().getAgent();
		if (!(getLink().eContainer() instanceof Environment)) {
			return false;
		}
		Environment container = (Environment) getLink().eContainer();
		return ModelBaseItemSemanticEditPolicy.getLinkConstraints().canExistPrimitiveEvent_4001(container, getLink(),
				source, getNewTarget());
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
		getLink().setAgent(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setObserver(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected PrimitiveEvent getLink() {
		return (PrimitiveEvent) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected Agent getOldSource() {
		return (Agent) oldEnd;
	}

	/**
	* @generated
	*/
	protected Agent getNewSource() {
		return (Agent) newEnd;
	}

	/**
	* @generated
	*/
	protected Observer getOldTarget() {
		return (Observer) oldEnd;
	}

	/**
	* @generated
	*/
	protected Observer getNewTarget() {
		return (Observer) newEnd;
	}
}
