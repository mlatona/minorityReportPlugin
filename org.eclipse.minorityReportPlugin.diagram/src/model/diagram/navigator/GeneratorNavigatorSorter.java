package model.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import model.diagram.part.GeneratorVisualIDRegistry;

/**
 * @generated
 */
public class GeneratorNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4020;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof GeneratorNavigatorItem) {
			GeneratorNavigatorItem item = (GeneratorNavigatorItem) element;
			return GeneratorVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
