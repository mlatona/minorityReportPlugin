package model.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import model.diagram.edit.parts.BehaviouralDescriptionEditPart;
import model.diagram.edit.parts.ComplexEventEditPart;
import model.diagram.edit.parts.ParameterEditPart;
import model.diagram.providers.GeneratorElementTypes;
import model.diagram.providers.GeneratorModelingAssistantProvider;

/**
 * @generated
 */
public class GeneratorModelingAssistantProviderOfComplexEventEditPart extends GeneratorModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ComplexEventEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ComplexEventEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(GeneratorElementTypes.EventParameters_4002);
		types.add(GeneratorElementTypes.ComplexEventBehaviouralDescriptions_4008);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ComplexEventEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ComplexEventEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ParameterEditPart) {
			types.add(GeneratorElementTypes.EventParameters_4002);
		}
		if (targetEditPart instanceof BehaviouralDescriptionEditPart) {
			types.add(GeneratorElementTypes.ComplexEventBehaviouralDescriptions_4008);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ComplexEventEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ComplexEventEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == GeneratorElementTypes.EventParameters_4002) {
			types.add(GeneratorElementTypes.Parameter_2006);
		} else if (relationshipType == GeneratorElementTypes.ComplexEventBehaviouralDescriptions_4008) {
			types.add(GeneratorElementTypes.BehaviouralDescription_2010);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ComplexEventEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ComplexEventEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(GeneratorElementTypes.ContextRelationEndingComplexEvent_4001);
		types.add(GeneratorElementTypes.ContextRelationInitialComplexEvent_4016);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ComplexEventEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ComplexEventEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == GeneratorElementTypes.ContextRelationEndingComplexEvent_4001) {
			types.add(GeneratorElementTypes.ContextRelation_2002);
		} else if (relationshipType == GeneratorElementTypes.ContextRelationInitialComplexEvent_4016) {
			types.add(GeneratorElementTypes.ContextRelation_2002);
		}
		return types;
	}

}
