package general.model.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import general.model.diagram.edit.parts.ContextRelationEditPart;
import general.model.diagram.edit.parts.HoldsAtEditPart;
import general.model.diagram.providers.ModelElementTypes;
import general.model.diagram.providers.ModelModelingAssistantProvider;

/**
 * @generated
 */
public class ModelModelingAssistantProviderOfHoldsAtEditPart extends ModelModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((HoldsAtEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(HoldsAtEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ModelElementTypes.HoldsAtContextRelation_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((HoldsAtEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(HoldsAtEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ContextRelationEditPart) {
			types.add(ModelElementTypes.HoldsAtContextRelation_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((HoldsAtEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(HoldsAtEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ModelElementTypes.HoldsAtContextRelation_4001) {
			types.add(ModelElementTypes.ContextRelation_2011);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((HoldsAtEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(HoldsAtEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ModelElementTypes.InitiallyHoldsAts_4008);
		types.add(ModelElementTypes.BehaviouralDescriptionHoldsAts_4015);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((HoldsAtEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(HoldsAtEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ModelElementTypes.InitiallyHoldsAts_4008) {
			types.add(ModelElementTypes.Initially_2006);
		} else if (relationshipType == ModelElementTypes.BehaviouralDescriptionHoldsAts_4015) {
			types.add(ModelElementTypes.BehaviouralDescription_2007);
		}
		return types;
	}

}
