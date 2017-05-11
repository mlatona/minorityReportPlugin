package general.model.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import general.model.diagram.edit.parts.BehaviouralDescriptionEditPart;
import general.model.diagram.edit.parts.HappensEditPart;
import general.model.diagram.edit.parts.HoldsAtBetweenEditPart;
import general.model.diagram.edit.parts.HoldsAtEditPart;
import general.model.diagram.providers.ModelElementTypes;
import general.model.diagram.providers.ModelModelingAssistantProvider;

/**
 * @generated
 */
public class ModelModelingAssistantProviderOfBehaviouralDescriptionEditPart extends ModelModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((BehaviouralDescriptionEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(BehaviouralDescriptionEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ModelElementTypes.BehaviouralDescriptionHoldsAtBetweens_4014);
		types.add(ModelElementTypes.BehaviouralDescriptionHoldsAts_4015);
		types.add(ModelElementTypes.BehaviouralDescriptionHappens_4017);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((BehaviouralDescriptionEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(BehaviouralDescriptionEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof HoldsAtBetweenEditPart) {
			types.add(ModelElementTypes.BehaviouralDescriptionHoldsAtBetweens_4014);
		}
		if (targetEditPart instanceof HoldsAtEditPart) {
			types.add(ModelElementTypes.BehaviouralDescriptionHoldsAts_4015);
		}
		if (targetEditPart instanceof HappensEditPart) {
			types.add(ModelElementTypes.BehaviouralDescriptionHappens_4017);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((BehaviouralDescriptionEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(BehaviouralDescriptionEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ModelElementTypes.BehaviouralDescriptionHoldsAtBetweens_4014) {
			types.add(ModelElementTypes.HoldsAtBetween_2003);
		} else if (relationshipType == ModelElementTypes.BehaviouralDescriptionHoldsAts_4015) {
			types.add(ModelElementTypes.HoldsAt_2008);
		} else if (relationshipType == ModelElementTypes.BehaviouralDescriptionHappens_4017) {
			types.add(ModelElementTypes.Happens_2005);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((BehaviouralDescriptionEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(BehaviouralDescriptionEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ModelElementTypes.ComplexEventBehaviouralDescriptions_4010);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((BehaviouralDescriptionEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(BehaviouralDescriptionEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ModelElementTypes.ComplexEventBehaviouralDescriptions_4010) {
			types.add(ModelElementTypes.ComplexEvent_2010);
		}
		return types;
	}

}
