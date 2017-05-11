package general.model.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import general.model.diagram.edit.parts.BehaviouralDescriptionEditPart;
import general.model.diagram.edit.parts.ComplexEventEditPart;
import general.model.diagram.edit.parts.ParameterEditPart;
import general.model.diagram.providers.ModelElementTypes;
import general.model.diagram.providers.ModelModelingAssistantProvider;

/**
 * @generated
 */
public class ModelModelingAssistantProviderOfComplexEventEditPart extends ModelModelingAssistantProvider {

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
		types.add(ModelElementTypes.ComplexEventBehaviouralDescriptions_4010);
		types.add(ModelElementTypes.EventParameters_4012);
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
		if (targetEditPart instanceof BehaviouralDescriptionEditPart) {
			types.add(ModelElementTypes.ComplexEventBehaviouralDescriptions_4010);
		}
		if (targetEditPart instanceof ParameterEditPart) {
			types.add(ModelElementTypes.EventParameters_4012);
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
		if (relationshipType == ModelElementTypes.ComplexEventBehaviouralDescriptions_4010) {
			types.add(ModelElementTypes.BehaviouralDescription_2007);
		} else if (relationshipType == ModelElementTypes.EventParameters_4012) {
			types.add(ModelElementTypes.Parameter_2002);
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
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ModelElementTypes.ContextRelationEndingComplexEvent_4006);
		types.add(ModelElementTypes.HappensEvent_4007);
		types.add(ModelElementTypes.ContextRelationInitialComplexEvent_4016);
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
		if (relationshipType == ModelElementTypes.ContextRelationEndingComplexEvent_4006) {
			types.add(ModelElementTypes.ContextRelation_2011);
		} else if (relationshipType == ModelElementTypes.HappensEvent_4007) {
			types.add(ModelElementTypes.Happens_2005);
		} else if (relationshipType == ModelElementTypes.ContextRelationInitialComplexEvent_4016) {
			types.add(ModelElementTypes.ContextRelation_2011);
		}
		return types;
	}

}
