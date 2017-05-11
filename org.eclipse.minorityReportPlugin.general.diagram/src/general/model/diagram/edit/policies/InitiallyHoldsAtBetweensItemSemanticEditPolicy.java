package general.model.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import general.model.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class InitiallyHoldsAtBetweensItemSemanticEditPolicy extends ModelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InitiallyHoldsAtBetweensItemSemanticEditPolicy() {
		super(ModelElementTypes.InitiallyHoldsAtBetweens_4009);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
