package model.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import model.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class ComplexEventBehaviouralDescriptionsItemSemanticEditPolicy extends ModelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ComplexEventBehaviouralDescriptionsItemSemanticEditPolicy() {
		super(ModelElementTypes.ComplexEventBehaviouralDescriptions_4010);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}