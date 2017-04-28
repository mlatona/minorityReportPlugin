package model.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import model.diagram.providers.GeneratorElementTypes;
import model.diagram.providers.GeneratorModelingAssistantProvider;

/**
 * @generated
 */
public class GeneratorModelingAssistantProviderOfEnvironmentEditPart extends GeneratorModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(11);
		types.add(GeneratorElementTypes.HoldsAt_2003);
		types.add(GeneratorElementTypes.HoldsAtBetween_2011);
		types.add(GeneratorElementTypes.ComplexEvent_2005);
		types.add(GeneratorElementTypes.PrimitiveEvent_2004);
		types.add(GeneratorElementTypes.Instance_2001);
		types.add(GeneratorElementTypes.Parameter_2006);
		types.add(GeneratorElementTypes.ContextRelation_2002);
		types.add(GeneratorElementTypes.Type_2008);
		types.add(GeneratorElementTypes.BehaviouralDescription_2010);
		types.add(GeneratorElementTypes.Happens_2009);
		types.add(GeneratorElementTypes.Initially_2007);
		return types;
	}

}
