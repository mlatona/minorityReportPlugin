package contextRelation.model.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ContextRelationParametersItemSemanticEditPolicy
		extends contextRelation.model.diagram.edit.policies.ModelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ContextRelationParametersItemSemanticEditPolicy() {
		super(contextRelation.model.diagram.providers.ModelElementTypes.ContextRelationParameters_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
