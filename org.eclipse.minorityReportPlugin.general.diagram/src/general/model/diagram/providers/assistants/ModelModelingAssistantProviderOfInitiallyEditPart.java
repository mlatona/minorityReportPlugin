package general.model.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import general.model.diagram.edit.parts.ContextRelationEditPart;
import general.model.diagram.edit.parts.HappensEditPart;
import general.model.diagram.edit.parts.HoldsAtBetweenEditPart;
import general.model.diagram.edit.parts.HoldsAtEditPart;
import general.model.diagram.edit.parts.InitiallyEditPart;
import general.model.diagram.providers.ModelElementTypes;
import general.model.diagram.providers.ModelModelingAssistantProvider;

/**
 * @generated
 */
public class ModelModelingAssistantProviderOfInitiallyEditPart extends ModelModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((InitiallyEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(InitiallyEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(ModelElementTypes.InitiallyContextRelation_4005);
		types.add(ModelElementTypes.InitiallyHoldsAts_4008);
		types.add(ModelElementTypes.InitiallyHoldsAtBetweens_4009);
		types.add(ModelElementTypes.InitiallyHappens_4011);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((InitiallyEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(InitiallyEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ContextRelationEditPart) {
			types.add(ModelElementTypes.InitiallyContextRelation_4005);
		}
		if (targetEditPart instanceof HoldsAtEditPart) {
			types.add(ModelElementTypes.InitiallyHoldsAts_4008);
		}
		if (targetEditPart instanceof HoldsAtBetweenEditPart) {
			types.add(ModelElementTypes.InitiallyHoldsAtBetweens_4009);
		}
		if (targetEditPart instanceof HappensEditPart) {
			types.add(ModelElementTypes.InitiallyHappens_4011);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((InitiallyEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(InitiallyEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ModelElementTypes.InitiallyContextRelation_4005) {
			types.add(ModelElementTypes.ContextRelation_2011);
		} else if (relationshipType == ModelElementTypes.InitiallyHoldsAts_4008) {
			types.add(ModelElementTypes.HoldsAt_2008);
		} else if (relationshipType == ModelElementTypes.InitiallyHoldsAtBetweens_4009) {
			types.add(ModelElementTypes.HoldsAtBetween_2003);
		} else if (relationshipType == ModelElementTypes.InitiallyHappens_4011) {
			types.add(ModelElementTypes.Happens_2005);
		}
		return types;
	}

}
