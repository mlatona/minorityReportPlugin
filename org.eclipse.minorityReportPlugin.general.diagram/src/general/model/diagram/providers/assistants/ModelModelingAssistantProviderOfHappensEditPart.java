package general.model.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import general.model.diagram.edit.parts.ComplexEventEditPart;
import general.model.diagram.edit.parts.HappensEditPart;
import general.model.diagram.edit.parts.PrimitiveEventEditPart;
import general.model.diagram.providers.ModelElementTypes;
import general.model.diagram.providers.ModelModelingAssistantProvider;

/**
 * @generated
 */
public class ModelModelingAssistantProviderOfHappensEditPart extends ModelModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((HappensEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(HappensEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ModelElementTypes.HappensEvent_4007);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((HappensEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(HappensEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof PrimitiveEventEditPart) {
			types.add(ModelElementTypes.HappensEvent_4007);
		}
		if (targetEditPart instanceof ComplexEventEditPart) {
			types.add(ModelElementTypes.HappensEvent_4007);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((HappensEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(HappensEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ModelElementTypes.HappensEvent_4007) {
			types.add(ModelElementTypes.PrimitiveEvent_2009);
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
		return doGetRelTypesOnTarget((HappensEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(HappensEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ModelElementTypes.InitiallyHappens_4011);
		types.add(ModelElementTypes.BehaviouralDescriptionHappens_4017);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((HappensEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(HappensEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ModelElementTypes.InitiallyHappens_4011) {
			types.add(ModelElementTypes.Initially_2006);
		} else if (relationshipType == ModelElementTypes.BehaviouralDescriptionHappens_4017) {
			types.add(ModelElementTypes.BehaviouralDescription_2007);
		}
		return types;
	}

}
