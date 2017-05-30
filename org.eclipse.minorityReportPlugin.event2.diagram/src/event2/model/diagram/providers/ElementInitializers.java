package event2.model.diagram.providers;

import event2.model.diagram.part.Event2ModelDiagramEditorPlugin;

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
		ElementInitializers cached = Event2ModelDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			Event2ModelDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
