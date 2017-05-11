package general.model.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import general.model.diagram.edit.parts.TypeEditPart;
import general.model.diagram.providers.ModelElementTypes;
import general.model.diagram.providers.ModelModelingAssistantProvider;

/**
 * @generated
 */
public class ModelModelingAssistantProviderOfTypeEditPart extends ModelModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((TypeEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(TypeEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ModelElementTypes.ParameterType_4004);
		types.add(ModelElementTypes.InstanceType_4018);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((TypeEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(TypeEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ModelElementTypes.ParameterType_4004) {
			types.add(ModelElementTypes.Parameter_2002);
		} else if (relationshipType == ModelElementTypes.InstanceType_4018) {
			types.add(ModelElementTypes.Instance_2004);
		}
		return types;
	}

}
