package behavDesc.model.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ModelModelingAssistantProviderOfBehaviouralDescriptionEditPart
		extends behavDesc.model.diagram.providers.ModelModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource(
				(behavDesc.model.diagram.edit.parts.BehaviouralDescriptionEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(
			behavDesc.model.diagram.edit.parts.BehaviouralDescriptionEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(behavDesc.model.diagram.providers.ModelElementTypes.BehaviouralDescriptionHappens_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(behavDesc.model.diagram.edit.parts.BehaviouralDescriptionEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			behavDesc.model.diagram.edit.parts.BehaviouralDescriptionEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof behavDesc.model.diagram.edit.parts.HappensEditPart) {
			types.add(behavDesc.model.diagram.providers.ModelElementTypes.BehaviouralDescriptionHappens_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((behavDesc.model.diagram.edit.parts.BehaviouralDescriptionEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(
			behavDesc.model.diagram.edit.parts.BehaviouralDescriptionEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == behavDesc.model.diagram.providers.ModelElementTypes.BehaviouralDescriptionHappens_4001) {
			types.add(behavDesc.model.diagram.providers.ModelElementTypes.Happens_2002);
		}
		return types;
	}

}
