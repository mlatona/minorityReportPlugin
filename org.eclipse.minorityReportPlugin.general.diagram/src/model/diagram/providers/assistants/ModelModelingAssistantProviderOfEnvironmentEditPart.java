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
		types.add(ModelElementTypes.Type_2001);
		types.add(ModelElementTypes.Parameter_2002);
		types.add(ModelElementTypes.HoldsAtBetween_2003);
		types.add(ModelElementTypes.Instance_2004);
		types.add(ModelElementTypes.Happens_2005);
		types.add(ModelElementTypes.Initially_2006);
		types.add(ModelElementTypes.BehaviouralDescription_2007);
		types.add(ModelElementTypes.HoldsAt_2008);
		types.add(ModelElementTypes.PrimitiveEvent_2009);
		types.add(ModelElementTypes.ComplexEvent_2010);
		types.add(ModelElementTypes.ContextRelation_2011);
		return types;
	}

}
