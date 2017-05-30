package event2.model.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import event2.model.diagram.providers.ModelElementTypes;
import event2.model.diagram.providers.ModelModelingAssistantProvider;

/**
 * @generated
 */
public class ModelModelingAssistantProviderOfEnvironmentEditPart extends ModelModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ModelElementTypes.Agent_2001);
		types.add(ModelElementTypes.Observer_2002);
		types.add(ModelElementTypes.Parameter_2003);
		return types;
	}

}
