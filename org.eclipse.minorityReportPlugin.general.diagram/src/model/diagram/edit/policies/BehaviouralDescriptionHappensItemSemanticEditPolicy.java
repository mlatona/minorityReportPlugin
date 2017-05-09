package model.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import model.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class BehaviouralDescriptionHappensItemSemanticEditPolicy extends ModelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public BehaviouralDescriptionHappensItemSemanticEditPolicy() {
		super(ModelElementTypes.BehaviouralDescriptionHappens_4017);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
