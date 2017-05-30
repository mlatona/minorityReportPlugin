package behavDesc.model.diagram.navigator;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import model.BehaviouralDescription;

/**
 * @generated
 */
public class ModelNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		behavDesc.model.diagram.part.ModelDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		behavDesc.model.diagram.part.ModelDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof behavDesc.model.diagram.navigator.ModelNavigatorItem
				&& !isOwnView(((behavDesc.model.diagram.navigator.ModelNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof behavDesc.model.diagram.navigator.ModelNavigatorGroup) {
			behavDesc.model.diagram.navigator.ModelNavigatorGroup group = (behavDesc.model.diagram.navigator.ModelNavigatorGroup) element;
			return behavDesc.model.diagram.part.ModelDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof behavDesc.model.diagram.navigator.ModelNavigatorItem) {
			behavDesc.model.diagram.navigator.ModelNavigatorItem navigatorItem = (behavDesc.model.diagram.navigator.ModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (behavDesc.model.diagram.part.ModelVisualIDRegistry.getVisualID(view)) {
		case behavDesc.model.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?https://github.com/mlatona/minorityReportPlugin?Environment", //$NON-NLS-1$
					behavDesc.model.diagram.providers.ModelElementTypes.Environment_1000);
		case behavDesc.model.diagram.edit.parts.BehaviouralDescriptionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?BehaviouralDescription", //$NON-NLS-1$
					behavDesc.model.diagram.providers.ModelElementTypes.BehaviouralDescription_2001);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = behavDesc.model.diagram.part.ModelDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& behavDesc.model.diagram.providers.ModelElementTypes.isKnownElementType(elementType)) {
			image = behavDesc.model.diagram.providers.ModelElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof behavDesc.model.diagram.navigator.ModelNavigatorGroup) {
			behavDesc.model.diagram.navigator.ModelNavigatorGroup group = (behavDesc.model.diagram.navigator.ModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof behavDesc.model.diagram.navigator.ModelNavigatorItem) {
			behavDesc.model.diagram.navigator.ModelNavigatorItem navigatorItem = (behavDesc.model.diagram.navigator.ModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (behavDesc.model.diagram.part.ModelVisualIDRegistry.getVisualID(view)) {
		case behavDesc.model.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID:
			return getEnvironment_1000Text(view);
		case behavDesc.model.diagram.edit.parts.BehaviouralDescriptionEditPart.VISUAL_ID:
			return getBehaviouralDescription_2001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getEnvironment_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getBehaviouralDescription_2001Text(View view) {
		BehaviouralDescription domainModelElement = (BehaviouralDescription) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			behavDesc.model.diagram.part.ModelDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return behavDesc.model.diagram.edit.parts.EnvironmentEditPart.MODEL_ID
				.equals(behavDesc.model.diagram.part.ModelVisualIDRegistry.getModelID(view));
	}

}
