package model.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import model.diagram.providers.ModelElementTypes;
import model.diagram.providers.ModelModelingAssistantProvider;

/**
 * @generated
 */
public class ModelModelingAssistantProviderOfEnvironmentEditPart extends ModelModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(11);
		types.add(ModelElementTypes.HoldsAt_2003);
		types.add(ModelElementTypes.Happens_2009);
		types.add(ModelElementTypes.Initially_2007);
		types.add(ModelElementTypes.HoldsAtBetween_2011);
		types.add(ModelElementTypes.Parameter_2006);
		types.add(ModelElementTypes.PrimitiveEvent_2004);
		types.add(ModelElementTypes.Type_2008);
		types.add(ModelElementTypes.Instance_2001);
		types.add(ModelElementTypes.ContextRelation_2002);
		types.add(ModelElementTypes.BehaviouralDescription_2010);
		types.add(ModelElementTypes.ComplexEvent_2005);
		return types;
	}

}
