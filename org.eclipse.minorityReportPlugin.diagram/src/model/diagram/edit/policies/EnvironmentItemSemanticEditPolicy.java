package model.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import model.diagram.edit.commands.BehaviouralDescriptionCreateCommand;
import model.diagram.edit.commands.ComplexEventCreateCommand;
import model.diagram.edit.commands.ContextRelationCreateCommand;
import model.diagram.edit.commands.HappensCreateCommand;
import model.diagram.edit.commands.HoldsAtBetweenCreateCommand;
import model.diagram.edit.commands.HoldsAtCreateCommand;
import model.diagram.edit.commands.InitiallyCreateCommand;
import model.diagram.edit.commands.InstanceCreateCommand;
import model.diagram.edit.commands.ParameterCreateCommand;
import model.diagram.edit.commands.PrimitiveEventCreateCommand;
import model.diagram.edit.commands.TypeCreateCommand;
import model.diagram.providers.GeneratorElementTypes;

/**
 * @generated
 */
public class EnvironmentItemSemanticEditPolicy extends GeneratorBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EnvironmentItemSemanticEditPolicy() {
		super(GeneratorElementTypes.Environment_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GeneratorElementTypes.HoldsAt_2003 == req.getElementType()) {
			return getGEFWrapper(new HoldsAtCreateCommand(req));
		}
		if (GeneratorElementTypes.HoldsAtBetween_2011 == req.getElementType()) {
			return getGEFWrapper(new HoldsAtBetweenCreateCommand(req));
		}
		if (GeneratorElementTypes.ComplexEvent_2005 == req.getElementType()) {
			return getGEFWrapper(new ComplexEventCreateCommand(req));
		}
		if (GeneratorElementTypes.PrimitiveEvent_2004 == req.getElementType()) {
			return getGEFWrapper(new PrimitiveEventCreateCommand(req));
		}
		if (GeneratorElementTypes.Instance_2001 == req.getElementType()) {
			return getGEFWrapper(new InstanceCreateCommand(req));
		}
		if (GeneratorElementTypes.Parameter_2006 == req.getElementType()) {
			return getGEFWrapper(new ParameterCreateCommand(req));
		}
		if (GeneratorElementTypes.ContextRelation_2002 == req.getElementType()) {
			return getGEFWrapper(new ContextRelationCreateCommand(req));
		}
		if (GeneratorElementTypes.Type_2008 == req.getElementType()) {
			return getGEFWrapper(new TypeCreateCommand(req));
		}
		if (GeneratorElementTypes.BehaviouralDescription_2010 == req.getElementType()) {
			return getGEFWrapper(new BehaviouralDescriptionCreateCommand(req));
		}
		if (GeneratorElementTypes.Happens_2009 == req.getElementType()) {
			return getGEFWrapper(new HappensCreateCommand(req));
		}
		if (GeneratorElementTypes.Initially_2007 == req.getElementType()) {
			return getGEFWrapper(new InitiallyCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
