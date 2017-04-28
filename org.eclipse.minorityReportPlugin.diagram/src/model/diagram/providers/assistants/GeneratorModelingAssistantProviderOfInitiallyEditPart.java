package model.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import model.diagram.edit.parts.ContextRelationEditPart;
import model.diagram.edit.parts.HappensEditPart;
import model.diagram.edit.parts.HoldsAtBetweenEditPart;
import model.diagram.edit.parts.HoldsAtEditPart;
import model.diagram.edit.parts.InitiallyEditPart;
import model.diagram.providers.GeneratorElementTypes;
import model.diagram.providers.GeneratorModelingAssistantProvider;

/**
 * @generated
 */
public class GeneratorModelingAssistantProviderOfInitiallyEditPart extends GeneratorModelingAssistantProvider {

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
		types.add(GeneratorElementTypes.InitiallyHoldsAts_4006);
		types.add(GeneratorElementTypes.InitiallyContextRelation_4010);
		types.add(GeneratorElementTypes.InitiallyHoldsAtBetweens_4015);
		types.add(GeneratorElementTypes.InitiallyHappens_4004);
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
		if (targetEditPart instanceof HoldsAtEditPart) {
			types.add(GeneratorElementTypes.InitiallyHoldsAts_4006);
		}
		if (targetEditPart instanceof ContextRelationEditPart) {
			types.add(GeneratorElementTypes.InitiallyContextRelation_4010);
		}
		if (targetEditPart instanceof HoldsAtBetweenEditPart) {
			types.add(GeneratorElementTypes.InitiallyHoldsAtBetweens_4015);
		}
		if (targetEditPart instanceof HappensEditPart) {
			types.add(GeneratorElementTypes.InitiallyHappens_4004);
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
		if (relationshipType == GeneratorElementTypes.InitiallyHoldsAts_4006) {
			types.add(GeneratorElementTypes.HoldsAt_2003);
		} else if (relationshipType == GeneratorElementTypes.InitiallyContextRelation_4010) {
			types.add(GeneratorElementTypes.ContextRelation_2002);
		} else if (relationshipType == GeneratorElementTypes.InitiallyHoldsAtBetweens_4015) {
			types.add(GeneratorElementTypes.HoldsAtBetween_2011);
		} else if (relationshipType == GeneratorElementTypes.InitiallyHappens_4004) {
			types.add(GeneratorElementTypes.Happens_2009);
		}
		return types;
	}

}
