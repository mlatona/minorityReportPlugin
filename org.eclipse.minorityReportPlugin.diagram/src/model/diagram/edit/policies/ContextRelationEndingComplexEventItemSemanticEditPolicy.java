package model.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import model.diagram.providers.GeneratorElementTypes;

/**
 * @generated
 */
public class ContextRelationEndingComplexEventItemSemanticEditPolicy extends GeneratorBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ContextRelationEndingComplexEventItemSemanticEditPolicy() {
		super(GeneratorElementTypes.ContextRelationEndingComplexEvent_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
