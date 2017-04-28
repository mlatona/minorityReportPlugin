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
import model.diagram.providers.GeneratorElementTypes;
import model.diagram.providers.GeneratorModelingAssistantProvider;

/**
 * @generated
 */
public class GeneratorModelingAssistantProviderOfContextRelationEditPart extends GeneratorModelingAssistantProvider {

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
		types.add(GeneratorElementTypes.ContextRelationParameters_4012);
		types.add(GeneratorElementTypes.ContextRelationEndingComplexEvent_4001);
		types.add(GeneratorElementTypes.ContextRelationInitialComplexEvent_4016);
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
			types.add(GeneratorElementTypes.ContextRelationParameters_4012);
		}
		if (targetEditPart instanceof ComplexEventEditPart) {
			types.add(GeneratorElementTypes.ContextRelationEndingComplexEvent_4001);
		}
		if (targetEditPart instanceof ComplexEventEditPart) {
			types.add(GeneratorElementTypes.ContextRelationInitialComplexEvent_4016);
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
		if (relationshipType == GeneratorElementTypes.ContextRelationParameters_4012) {
			types.add(GeneratorElementTypes.Parameter_2006);
		} else if (relationshipType == GeneratorElementTypes.ContextRelationEndingComplexEvent_4001) {
			types.add(GeneratorElementTypes.ComplexEvent_2005);
		} else if (relationshipType == GeneratorElementTypes.ContextRelationInitialComplexEvent_4016) {
			types.add(GeneratorElementTypes.ComplexEvent_2005);
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
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(GeneratorElementTypes.HappensContextRelation_4009);
		types.add(GeneratorElementTypes.HoldsAtBetweenContextRelation_4003);
		types.add(GeneratorElementTypes.InitiallyContextRelation_4010);
		types.add(GeneratorElementTypes.HoldsAtContextRelation_4017);
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
		if (relationshipType == GeneratorElementTypes.HappensContextRelation_4009) {
			types.add(GeneratorElementTypes.Happens_2009);
		} else if (relationshipType == GeneratorElementTypes.HoldsAtBetweenContextRelation_4003) {
			types.add(GeneratorElementTypes.HoldsAtBetween_2011);
		} else if (relationshipType == GeneratorElementTypes.InitiallyContextRelation_4010) {
			types.add(GeneratorElementTypes.Initially_2007);
		} else if (relationshipType == GeneratorElementTypes.HoldsAtContextRelation_4017) {
			types.add(GeneratorElementTypes.HoldsAt_2003);
		}
		return types;
	}

}
