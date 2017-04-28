package model.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import model.diagram.edit.parts.EnvironmentEditPart;
import model.diagram.edit.parts.GeneratorEditPartFactory;
import model.diagram.part.GeneratorVisualIDRegistry;

/**
 * @generated
 */
public class GeneratorEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public GeneratorEditPartProvider() {
		super(new GeneratorEditPartFactory(), GeneratorVisualIDRegistry.TYPED_INSTANCE, EnvironmentEditPart.MODEL_ID);
	}

}
