package general.model.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import general.model.diagram.edit.commands.BehaviouralDescriptionCreateCommand;
import general.model.diagram.edit.commands.ComplexEventCreateCommand;
import general.model.diagram.edit.commands.ContextRelationCreateCommand;
import general.model.diagram.edit.commands.HappensCreateCommand;
import general.model.diagram.edit.commands.HoldsAtBetweenCreateCommand;
import general.model.diagram.edit.commands.HoldsAtCreateCommand;
import general.model.diagram.edit.commands.InitiallyCreateCommand;
import general.model.diagram.edit.commands.InstanceCreateCommand;
import general.model.diagram.edit.commands.ParameterCreateCommand;
import general.model.diagram.edit.commands.PrimitiveEventCreateCommand;
import general.model.diagram.edit.commands.TypeCreateCommand;
import general.model.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class EnvironmentItemSemanticEditPolicy extends ModelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EnvironmentItemSemanticEditPolicy() {
		super(ModelElementTypes.Environment_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.Type_2001 == req.getElementType()) {
			return getGEFWrapper(new TypeCreateCommand(req));
		}
		if (ModelElementTypes.Parameter_2002 == req.getElementType()) {
			return getGEFWrapper(new ParameterCreateCommand(req));
		}
		if (ModelElementTypes.HoldsAtBetween_2003 == req.getElementType()) {
			return getGEFWrapper(new HoldsAtBetweenCreateCommand(req));
		}
		if (ModelElementTypes.Instance_2004 == req.getElementType()) {
			return getGEFWrapper(new InstanceCreateCommand(req));
		}
		if (ModelElementTypes.Happens_2005 == req.getElementType()) {
			return getGEFWrapper(new HappensCreateCommand(req));
		}
		if (ModelElementTypes.Initially_2006 == req.getElementType()) {
			return getGEFWrapper(new InitiallyCreateCommand(req));
		}
		if (ModelElementTypes.BehaviouralDescription_2007 == req.getElementType()) {
			return getGEFWrapper(new BehaviouralDescriptionCreateCommand(req));
		}
		if (ModelElementTypes.HoldsAt_2008 == req.getElementType()) {
			return getGEFWrapper(new HoldsAtCreateCommand(req));
		}
		if (ModelElementTypes.PrimitiveEvent_2009 == req.getElementType()) {
			return getGEFWrapper(new PrimitiveEventCreateCommand(req));
		}
		if (ModelElementTypes.ComplexEvent_2010 == req.getElementType()) {
			return getGEFWrapper(new ComplexEventCreateCommand(req));
		}
		if (ModelElementTypes.ContextRelation_2011 == req.getElementType()) {
			return getGEFWrapper(new ContextRelationCreateCommand(req));
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
