package event2.model.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
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

import event2.model.diagram.edit.parts.AgentEditPart;
import event2.model.diagram.edit.parts.AgentNameEditPart;
import event2.model.diagram.edit.parts.EnvironmentEditPart;
import event2.model.diagram.edit.parts.ObserverEditPart;
import event2.model.diagram.edit.parts.ObserverNameEditPart;
import event2.model.diagram.edit.parts.ParameterEditPart;
import event2.model.diagram.edit.parts.PrimitiveEventEditPart;
import event2.model.diagram.part.Event2ModelDiagramEditorPlugin;
import event2.model.diagram.part.ModelVisualIDRegistry;
import event2.model.diagram.providers.ModelElementTypes;
import event2.model.diagram.providers.ModelParserProvider;
import model.Parameter;
import model.PrimitiveEvent;

/**
 * @generated
 */
public class ModelNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		Event2ModelDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		Event2ModelDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ModelNavigatorItem && !isOwnView(((ModelNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ModelNavigatorGroup) {
			ModelNavigatorGroup group = (ModelNavigatorGroup) element;
			return Event2ModelDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ModelNavigatorItem) {
			ModelNavigatorItem navigatorItem = (ModelNavigatorItem) element;
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
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case EnvironmentEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?https://github.com/mlatona/minorityReportPlugin?Environment", //$NON-NLS-1$
					ModelElementTypes.Environment_1000);
		case AgentEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?Agent", //$NON-NLS-1$
					ModelElementTypes.Agent_2001);
		case ObserverEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?Observer", //$NON-NLS-1$
					ModelElementTypes.Observer_2002);
		case ParameterEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?Parameter", //$NON-NLS-1$
					ModelElementTypes.Parameter_2003);
		case PrimitiveEventEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://github.com/mlatona/minorityReportPlugin?PrimitiveEvent", //$NON-NLS-1$
					ModelElementTypes.PrimitiveEvent_4001);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = Event2ModelDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && ModelElementTypes.isKnownElementType(elementType)) {
			image = ModelElementTypes.getImage(elementType);
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
		if (element instanceof ModelNavigatorGroup) {
			ModelNavigatorGroup group = (ModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ModelNavigatorItem) {
			ModelNavigatorItem navigatorItem = (ModelNavigatorItem) element;
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
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case EnvironmentEditPart.VISUAL_ID:
			return getEnvironment_1000Text(view);
		case AgentEditPart.VISUAL_ID:
			return getAgent_2001Text(view);
		case ObserverEditPart.VISUAL_ID:
			return getObserver_2002Text(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_2003Text(view);
		case PrimitiveEventEditPart.VISUAL_ID:
			return getPrimitiveEvent_4001Text(view);
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
	private String getAgent_2001Text(View view) {
		IParser parser = ModelParserProvider.getParser(ModelElementTypes.Agent_2001,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry.getType(AgentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Event2ModelDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getObserver_2002Text(View view) {
		IParser parser = ModelParserProvider.getParser(ModelElementTypes.Observer_2002,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry.getType(ObserverNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Event2ModelDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getParameter_2003Text(View view) {
		Parameter domainModelElement = (Parameter) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			Event2ModelDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPrimitiveEvent_4001Text(View view) {
		PrimitiveEvent domainModelElement = (PrimitiveEvent) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			Event2ModelDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4001); //$NON-NLS-1$
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
		return EnvironmentEditPart.MODEL_ID.equals(ModelVisualIDRegistry.getModelID(view));
	}

}
