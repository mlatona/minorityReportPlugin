package model.diagram.navigator;

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

import model.HoldsAtBetween;
import model.diagram.edit.parts.BehaviouralDescriptionEditPart;
import model.diagram.edit.parts.BehaviouralDescriptionHappensEditPart;
import model.diagram.edit.parts.BehaviouralDescriptionHoldsAtBetweensEditPart;
import model.diagram.edit.parts.BehaviouralDescriptionHoldsAtsEditPart;
import model.diagram.edit.parts.BehaviouralDescriptionNameEditPart;
import model.diagram.edit.parts.ComplexEventBehaviouralDescriptionsEditPart;
import model.diagram.edit.parts.ComplexEventEditPart;
import model.diagram.edit.parts.ComplexEventNameEditPart;
import model.diagram.edit.parts.ContextRelationEditPart;
import model.diagram.edit.parts.ContextRelationEndingComplexEventEditPart;
import model.diagram.edit.parts.ContextRelationInitialComplexEventEditPart;
import model.diagram.edit.parts.ContextRelationNameEditPart;
import model.diagram.edit.parts.ContextRelationParametersEditPart;
import model.diagram.edit.parts.EnvironmentEditPart;
import model.diagram.edit.parts.EventParametersEditPart;
import model.diagram.edit.parts.HappensEditPart;
import model.diagram.edit.parts.HappensEventEditPart;
import model.diagram.edit.parts.HappensTimeEditPart;
import model.diagram.edit.parts.HoldsAtBetweenContextRelationEditPart;
import model.diagram.edit.parts.HoldsAtBetweenEditPart;
import model.diagram.edit.parts.HoldsAtContextRelationEditPart;
import model.diagram.edit.parts.HoldsAtEditPart;
import model.diagram.edit.parts.HoldsAtTimeEditPart;
import model.diagram.edit.parts.InitiallyContextRelationEditPart;
import model.diagram.edit.parts.InitiallyEditPart;
import model.diagram.edit.parts.InitiallyHappensEditPart;
import model.diagram.edit.parts.InitiallyHoldsAtBetweensEditPart;
import model.diagram.edit.parts.InitiallyHoldsAtsEditPart;
import model.diagram.edit.parts.InstanceEditPart;
import model.diagram.edit.parts.InstanceNameEditPart;
import model.diagram.edit.parts.InstanceTypeEditPart;
import model.diagram.edit.parts.ParameterEditPart;
import model.diagram.edit.parts.ParameterInstanceEditPart;
import model.diagram.edit.parts.ParameterNameEditPart;
import model.diagram.edit.parts.ParameterTypeEditPart;
import model.diagram.edit.parts.PrimitiveEventEditPart;
import model.diagram.edit.parts.PrimitiveEventNameEditPart;
import model.diagram.edit.parts.TypeEditPart;
import model.diagram.edit.parts.TypeNameEditPart;
import model.diagram.part.ModelDiagramEditorPlugin;
import model.diagram.part.ModelVisualIDRegistry;
import model.diagram.providers.ModelElementTypes;
import model.diagram.providers.ModelParserProvider;

/**
 * @generated
 */
public class ModelNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ModelDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		ModelDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
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
			return ModelDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
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
		case TypeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?Type", //$NON-NLS-1$
					ModelElementTypes.Type_2001);
		case ParameterEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?Parameter", //$NON-NLS-1$
					ModelElementTypes.Parameter_2002);
		case HoldsAtBetweenEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?HoldsAtBetween", //$NON-NLS-1$
					ModelElementTypes.HoldsAtBetween_2003);
		case InstanceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?Instance", //$NON-NLS-1$
					ModelElementTypes.Instance_2004);
		case HappensEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?Happens", //$NON-NLS-1$
					ModelElementTypes.Happens_2005);
		case InitiallyEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?Initially", //$NON-NLS-1$
					ModelElementTypes.Initially_2006);
		case BehaviouralDescriptionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?BehaviouralDescription", //$NON-NLS-1$
					ModelElementTypes.BehaviouralDescription_2007);
		case HoldsAtEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?HoldsAt", //$NON-NLS-1$
					ModelElementTypes.HoldsAt_2008);
		case PrimitiveEventEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?PrimitiveEvent", //$NON-NLS-1$
					ModelElementTypes.PrimitiveEvent_2009);
		case ComplexEventEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?ComplexEvent", //$NON-NLS-1$
					ModelElementTypes.ComplexEvent_2010);
		case ContextRelationEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?ContextRelation", //$NON-NLS-1$
					ModelElementTypes.ContextRelation_2011);
		case HoldsAtContextRelationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://github.com/mlatona/minorityReportPlugin?HoldsAt?contextRelation", //$NON-NLS-1$
					ModelElementTypes.HoldsAtContextRelation_4001);
		case ParameterInstanceEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://github.com/mlatona/minorityReportPlugin?Parameter?instance", //$NON-NLS-1$
					ModelElementTypes.ParameterInstance_4002);
		case ContextRelationParametersEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://github.com/mlatona/minorityReportPlugin?ContextRelation?parameters", //$NON-NLS-1$
					ModelElementTypes.ContextRelationParameters_4003);
		case ParameterTypeEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://github.com/mlatona/minorityReportPlugin?Parameter?type", //$NON-NLS-1$
					ModelElementTypes.ParameterType_4004);
		case InitiallyContextRelationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://github.com/mlatona/minorityReportPlugin?Initially?contextRelation", //$NON-NLS-1$
					ModelElementTypes.InitiallyContextRelation_4005);
		case ContextRelationEndingComplexEventEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?https://github.com/mlatona/minorityReportPlugin?ContextRelation?endingComplexEvent", //$NON-NLS-1$
					ModelElementTypes.ContextRelationEndingComplexEvent_4006);
		case HappensEventEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://github.com/mlatona/minorityReportPlugin?Happens?event", //$NON-NLS-1$
					ModelElementTypes.HappensEvent_4007);
		case InitiallyHoldsAtsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://github.com/mlatona/minorityReportPlugin?Initially?holdsAts", //$NON-NLS-1$
					ModelElementTypes.InitiallyHoldsAts_4008);
		case InitiallyHoldsAtBetweensEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://github.com/mlatona/minorityReportPlugin?Initially?holdsAtBetweens", //$NON-NLS-1$
					ModelElementTypes.InitiallyHoldsAtBetweens_4009);
		case ComplexEventBehaviouralDescriptionsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?https://github.com/mlatona/minorityReportPlugin?ComplexEvent?behaviouralDescriptions", //$NON-NLS-1$
					ModelElementTypes.ComplexEventBehaviouralDescriptions_4010);
		case InitiallyHappensEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://github.com/mlatona/minorityReportPlugin?Initially?happens", //$NON-NLS-1$
					ModelElementTypes.InitiallyHappens_4011);
		case EventParametersEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://github.com/mlatona/minorityReportPlugin?Event?parameters", //$NON-NLS-1$
					ModelElementTypes.EventParameters_4012);
		case HoldsAtBetweenContextRelationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?https://github.com/mlatona/minorityReportPlugin?HoldsAtBetween?contextRelation", //$NON-NLS-1$
					ModelElementTypes.HoldsAtBetweenContextRelation_4013);
		case BehaviouralDescriptionHoldsAtBetweensEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?https://github.com/mlatona/minorityReportPlugin?BehaviouralDescription?holdsAtBetweens", //$NON-NLS-1$
					ModelElementTypes.BehaviouralDescriptionHoldsAtBetweens_4014);
		case BehaviouralDescriptionHoldsAtsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?https://github.com/mlatona/minorityReportPlugin?BehaviouralDescription?holdsAts", //$NON-NLS-1$
					ModelElementTypes.BehaviouralDescriptionHoldsAts_4015);
		case ContextRelationInitialComplexEventEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?https://github.com/mlatona/minorityReportPlugin?ContextRelation?initialComplexEvent", //$NON-NLS-1$
					ModelElementTypes.ContextRelationInitialComplexEvent_4016);
		case BehaviouralDescriptionHappensEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?https://github.com/mlatona/minorityReportPlugin?BehaviouralDescription?happens", //$NON-NLS-1$
					ModelElementTypes.BehaviouralDescriptionHappens_4017);
		case InstanceTypeEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://github.com/mlatona/minorityReportPlugin?Instance?type", //$NON-NLS-1$
					ModelElementTypes.InstanceType_4018);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ModelDiagramEditorPlugin.getInstance().getImageRegistry();
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
		case TypeEditPart.VISUAL_ID:
			return getType_2001Text(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_2002Text(view);
		case HoldsAtBetweenEditPart.VISUAL_ID:
			return getHoldsAtBetween_2003Text(view);
		case InstanceEditPart.VISUAL_ID:
			return getInstance_2004Text(view);
		case HappensEditPart.VISUAL_ID:
			return getHappens_2005Text(view);
		case InitiallyEditPart.VISUAL_ID:
			return getInitially_2006Text(view);
		case BehaviouralDescriptionEditPart.VISUAL_ID:
			return getBehaviouralDescription_2007Text(view);
		case HoldsAtEditPart.VISUAL_ID:
			return getHoldsAt_2008Text(view);
		case PrimitiveEventEditPart.VISUAL_ID:
			return getPrimitiveEvent_2009Text(view);
		case ComplexEventEditPart.VISUAL_ID:
			return getComplexEvent_2010Text(view);
		case ContextRelationEditPart.VISUAL_ID:
			return getContextRelation_2011Text(view);
		case HoldsAtContextRelationEditPart.VISUAL_ID:
			return getHoldsAtContextRelation_4001Text(view);
		case ParameterInstanceEditPart.VISUAL_ID:
			return getParameterInstance_4002Text(view);
		case ContextRelationParametersEditPart.VISUAL_ID:
			return getContextRelationParameters_4003Text(view);
		case ParameterTypeEditPart.VISUAL_ID:
			return getParameterType_4004Text(view);
		case InitiallyContextRelationEditPart.VISUAL_ID:
			return getInitiallyContextRelation_4005Text(view);
		case ContextRelationEndingComplexEventEditPart.VISUAL_ID:
			return getContextRelationEndingComplexEvent_4006Text(view);
		case HappensEventEditPart.VISUAL_ID:
			return getHappensEvent_4007Text(view);
		case InitiallyHoldsAtsEditPart.VISUAL_ID:
			return getInitiallyHoldsAts_4008Text(view);
		case InitiallyHoldsAtBetweensEditPart.VISUAL_ID:
			return getInitiallyHoldsAtBetweens_4009Text(view);
		case ComplexEventBehaviouralDescriptionsEditPart.VISUAL_ID:
			return getComplexEventBehaviouralDescriptions_4010Text(view);
		case InitiallyHappensEditPart.VISUAL_ID:
			return getInitiallyHappens_4011Text(view);
		case EventParametersEditPart.VISUAL_ID:
			return getEventParameters_4012Text(view);
		case HoldsAtBetweenContextRelationEditPart.VISUAL_ID:
			return getHoldsAtBetweenContextRelation_4013Text(view);
		case BehaviouralDescriptionHoldsAtBetweensEditPart.VISUAL_ID:
			return getBehaviouralDescriptionHoldsAtBetweens_4014Text(view);
		case BehaviouralDescriptionHoldsAtsEditPart.VISUAL_ID:
			return getBehaviouralDescriptionHoldsAts_4015Text(view);
		case ContextRelationInitialComplexEventEditPart.VISUAL_ID:
			return getContextRelationInitialComplexEvent_4016Text(view);
		case BehaviouralDescriptionHappensEditPart.VISUAL_ID:
			return getBehaviouralDescriptionHappens_4017Text(view);
		case InstanceTypeEditPart.VISUAL_ID:
			return getInstanceType_4018Text(view);
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
	private String getType_2001Text(View view) {
		IParser parser = ModelParserProvider.getParser(ModelElementTypes.Type_2001,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry.getType(TypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getParameter_2002Text(View view) {
		IParser parser = ModelParserProvider.getParser(ModelElementTypes.Parameter_2002,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry.getType(ParameterNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getHoldsAtBetween_2003Text(View view) {
		HoldsAtBetween domainModelElement = (HoldsAtBetween) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getInitialTime());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInstance_2004Text(View view) {
		IParser parser = ModelParserProvider.getParser(ModelElementTypes.Instance_2004,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry.getType(InstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getHappens_2005Text(View view) {
		IParser parser = ModelParserProvider.getParser(ModelElementTypes.Happens_2005,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry.getType(HappensTimeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInitially_2006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getBehaviouralDescription_2007Text(View view) {
		IParser parser = ModelParserProvider.getParser(ModelElementTypes.BehaviouralDescription_2007,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry.getType(BehaviouralDescriptionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getHoldsAt_2008Text(View view) {
		IParser parser = ModelParserProvider.getParser(ModelElementTypes.HoldsAt_2008,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry.getType(HoldsAtTimeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPrimitiveEvent_2009Text(View view) {
		IParser parser = ModelParserProvider.getParser(ModelElementTypes.PrimitiveEvent_2009,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry.getType(PrimitiveEventNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComplexEvent_2010Text(View view) {
		IParser parser = ModelParserProvider.getParser(ModelElementTypes.ComplexEvent_2010,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry.getType(ComplexEventNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContextRelation_2011Text(View view) {
		IParser parser = ModelParserProvider.getParser(ModelElementTypes.ContextRelation_2011,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry.getType(ContextRelationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getHoldsAtContextRelation_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getParameterInstance_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getContextRelationParameters_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getParameterType_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getInitiallyContextRelation_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getContextRelationEndingComplexEvent_4006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getHappensEvent_4007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getInitiallyHoldsAts_4008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getInitiallyHoldsAtBetweens_4009Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getComplexEventBehaviouralDescriptions_4010Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getInitiallyHappens_4011Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getEventParameters_4012Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getHoldsAtBetweenContextRelation_4013Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getBehaviouralDescriptionHoldsAtBetweens_4014Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getBehaviouralDescriptionHoldsAts_4015Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getContextRelationInitialComplexEvent_4016Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getBehaviouralDescriptionHappens_4017Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getInstanceType_4018Text(View view) {
		return ""; //$NON-NLS-1$
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
