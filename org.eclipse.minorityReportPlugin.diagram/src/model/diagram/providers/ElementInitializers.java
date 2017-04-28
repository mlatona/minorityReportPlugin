package model.diagram.providers;

import model.diagram.part.GeneratorDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = GeneratorDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			GeneratorDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
