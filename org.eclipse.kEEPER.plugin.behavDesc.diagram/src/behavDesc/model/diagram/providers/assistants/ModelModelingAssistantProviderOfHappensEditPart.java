package behavDesc.model.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ModelModelingAssistantProviderOfHappensEditPart
		extends behavDesc.model.diagram.providers.ModelModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((behavDesc.model.diagram.edit.parts.HappensEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(behavDesc.model.diagram.edit.parts.HappensEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(behavDesc.model.diagram.providers.ModelElementTypes.BehaviouralDescriptionHappens_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((behavDesc.model.diagram.edit.parts.HappensEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(behavDesc.model.diagram.edit.parts.HappensEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == behavDesc.model.diagram.providers.ModelElementTypes.BehaviouralDescriptionHappens_4001) {
			types.add(behavDesc.model.diagram.providers.ModelElementTypes.BehaviouralDescription_2001);
		}
		return types;
	}

}
