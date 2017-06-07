package behavDesc.model.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class BehaviouralDescriptionHappensItemSemanticEditPolicy
		extends behavDesc.model.diagram.edit.policies.ModelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public BehaviouralDescriptionHappensItemSemanticEditPolicy() {
		super(behavDesc.model.diagram.providers.ModelElementTypes.BehaviouralDescriptionHappens_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
