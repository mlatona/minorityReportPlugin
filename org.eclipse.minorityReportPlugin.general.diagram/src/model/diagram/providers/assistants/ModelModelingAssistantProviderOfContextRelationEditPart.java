package model.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import model.diagram.edit.parts.ComplexEventEditPart;
import model.diagram.edit.parts.ContextRelationEditPart;
import model.diagram.edit.parts.ParameterEditPart;
import model.diagram.providers.ModelElementTypes;
import model.diagram.providers.ModelModelingAssistantProvider;

/**
 * @generated
 */
public class ModelModelingAssistantProviderOfContextRelationEditPart extends ModelModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ContextRelationEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ContextRelationEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ModelElementTypes.ContextRelationParameters_4003);
		types.add(ModelElementTypes.ContextRelationEndingComplexEvent_4006);
		types.add(ModelElementTypes.ContextRelationInitialComplexEvent_4016);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ContextRelationEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ContextRelationEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ParameterEditPart) {
			types.add(ModelElementTypes.ContextRelationParameters_4003);
		}
		if (targetEditPart instanceof ComplexEventEditPart) {
			types.add(ModelElementTypes.ContextRelationEndingComplexEvent_4006);
		}
		if (targetEditPart instanceof ComplexEventEditPart) {
			types.add(ModelElementTypes.ContextRelationInitialComplexEvent_4016);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ContextRelationEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ContextRelationEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ModelElementTypes.ContextRelationParameters_4003) {
			types.add(ModelElementTypes.Parameter_2002);
		} else if (relationshipType == ModelElementTypes.ContextRelationEndingComplexEvent_4006) {
			types.add(ModelElementTypes.ComplexEvent_2010);
		} else if (relationshipType == ModelElementTypes.ContextRelationInitialComplexEvent_4016) {
			types.add(ModelElementTypes.ComplexEvent_2010);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ContextRelationEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ContextRelationEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ModelElementTypes.HoldsAtContextRelation_4001);
		types.add(ModelElementTypes.InitiallyContextRelation_4005);
		types.add(ModelElementTypes.HoldsAtBetweenContextRelation_4013);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ContextRelationEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ContextRelationEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ModelElementTypes.HoldsAtContextRelation_4001) {
			types.add(ModelElementTypes.HoldsAt_2008);
		} else if (relationshipType == ModelElementTypes.InitiallyContextRelation_4005) {
			types.add(ModelElementTypes.Initially_2006);
		} else if (relationshipType == ModelElementTypes.HoldsAtBetweenContextRelation_4013) {
			types.add(ModelElementTypes.HoldsAtBetween_2003);
		}
		return types;
	}

}
