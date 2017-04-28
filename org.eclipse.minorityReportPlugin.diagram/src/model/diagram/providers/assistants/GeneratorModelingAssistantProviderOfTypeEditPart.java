package model.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import model.diagram.edit.parts.TypeEditPart;
import model.diagram.providers.GeneratorElementTypes;
import model.diagram.providers.GeneratorModelingAssistantProvider;

/**
 * @generated
 */
public class GeneratorModelingAssistantProviderOfTypeEditPart extends GeneratorModelingAssistantProvider {

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
		types.add(GeneratorElementTypes.InstanceType_4005);
		types.add(GeneratorElementTypes.ParameterType_4018);
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
		if (relationshipType == GeneratorElementTypes.InstanceType_4005) {
			types.add(GeneratorElementTypes.Instance_2001);
		} else if (relationshipType == GeneratorElementTypes.ParameterType_4018) {
			types.add(GeneratorElementTypes.Parameter_2006);
		}
		return types;
	}

}
