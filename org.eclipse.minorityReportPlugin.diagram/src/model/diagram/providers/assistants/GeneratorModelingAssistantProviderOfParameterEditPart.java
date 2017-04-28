package model.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import model.diagram.edit.parts.InstanceEditPart;
import model.diagram.edit.parts.ParameterEditPart;
import model.diagram.edit.parts.TypeEditPart;
import model.diagram.providers.GeneratorElementTypes;
import model.diagram.providers.GeneratorModelingAssistantProvider;

/**
 * @generated
 */
public class GeneratorModelingAssistantProviderOfParameterEditPart extends GeneratorModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ParameterEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ParameterEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(GeneratorElementTypes.ParameterType_4018);
		types.add(GeneratorElementTypes.ParameterInstance_4011);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ParameterEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ParameterEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof TypeEditPart) {
			types.add(GeneratorElementTypes.ParameterType_4018);
		}
		if (targetEditPart instanceof InstanceEditPart) {
			types.add(GeneratorElementTypes.ParameterInstance_4011);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ParameterEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ParameterEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == GeneratorElementTypes.ParameterType_4018) {
			types.add(GeneratorElementTypes.Type_2008);
		} else if (relationshipType == GeneratorElementTypes.ParameterInstance_4011) {
			types.add(GeneratorElementTypes.Instance_2001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ParameterEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ParameterEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(GeneratorElementTypes.EventParameters_4002);
		types.add(GeneratorElementTypes.ContextRelationParameters_4012);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ParameterEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ParameterEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == GeneratorElementTypes.EventParameters_4002) {
			types.add(GeneratorElementTypes.ComplexEvent_2005);
			types.add(GeneratorElementTypes.PrimitiveEvent_2004);
		} else if (relationshipType == GeneratorElementTypes.ContextRelationParameters_4012) {
			types.add(GeneratorElementTypes.ContextRelation_2002);
		}
		return types;
	}

}
