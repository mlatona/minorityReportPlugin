package behavDesc.model.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import model.BehaviouralDescription;
import model.Environment;

/**
 * @generated
 */
public class ModelDiagramUpdater {

	/**
	* @generated
	*/
	public static List<behavDesc.model.diagram.part.ModelNodeDescriptor> getSemanticChildren(View view) {
		switch (behavDesc.model.diagram.part.ModelVisualIDRegistry.getVisualID(view)) {
		case behavDesc.model.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID:
			return getEnvironment_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<behavDesc.model.diagram.part.ModelNodeDescriptor> getEnvironment_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Environment modelElement = (Environment) view.getElement();
		LinkedList<behavDesc.model.diagram.part.ModelNodeDescriptor> result = new LinkedList<behavDesc.model.diagram.part.ModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getBehavDescriptions().iterator(); it.hasNext();) {
			BehaviouralDescription childElement = (BehaviouralDescription) it.next();
			int visualID = behavDesc.model.diagram.part.ModelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == behavDesc.model.diagram.edit.parts.BehaviouralDescriptionEditPart.VISUAL_ID) {
				result.add(new behavDesc.model.diagram.part.ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<behavDesc.model.diagram.part.ModelLinkDescriptor> getContainedLinks(View view) {
		switch (behavDesc.model.diagram.part.ModelVisualIDRegistry.getVisualID(view)) {
		case behavDesc.model.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID:
			return getEnvironment_1000ContainedLinks(view);
		case behavDesc.model.diagram.edit.parts.BehaviouralDescriptionEditPart.VISUAL_ID:
			return getBehaviouralDescription_2001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<behavDesc.model.diagram.part.ModelLinkDescriptor> getIncomingLinks(View view) {
		switch (behavDesc.model.diagram.part.ModelVisualIDRegistry.getVisualID(view)) {
		case behavDesc.model.diagram.edit.parts.BehaviouralDescriptionEditPart.VISUAL_ID:
			return getBehaviouralDescription_2001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<behavDesc.model.diagram.part.ModelLinkDescriptor> getOutgoingLinks(View view) {
		switch (behavDesc.model.diagram.part.ModelVisualIDRegistry.getVisualID(view)) {
		case behavDesc.model.diagram.edit.parts.BehaviouralDescriptionEditPart.VISUAL_ID:
			return getBehaviouralDescription_2001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<behavDesc.model.diagram.part.ModelLinkDescriptor> getEnvironment_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<behavDesc.model.diagram.part.ModelLinkDescriptor> getBehaviouralDescription_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<behavDesc.model.diagram.part.ModelLinkDescriptor> getBehaviouralDescription_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<behavDesc.model.diagram.part.ModelLinkDescriptor> getBehaviouralDescription_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<behavDesc.model.diagram.part.ModelNodeDescriptor> getSemanticChildren(View view) {
			return ModelDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<behavDesc.model.diagram.part.ModelLinkDescriptor> getContainedLinks(View view) {
			return ModelDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<behavDesc.model.diagram.part.ModelLinkDescriptor> getIncomingLinks(View view) {
			return ModelDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<behavDesc.model.diagram.part.ModelLinkDescriptor> getOutgoingLinks(View view) {
			return ModelDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
