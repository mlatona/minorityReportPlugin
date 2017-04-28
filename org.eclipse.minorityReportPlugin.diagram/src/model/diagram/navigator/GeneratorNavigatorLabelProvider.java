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

import model.Happens;
import model.HoldsAt;
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
import model.diagram.edit.parts.HappensContextRelationEditPart;
import model.diagram.edit.parts.HappensEditPart;
import model.diagram.edit.parts.HoldsAtBetweenContextRelationEditPart;
import model.diagram.edit.parts.HoldsAtBetweenEditPart;
import model.diagram.edit.parts.HoldsAtContextRelationEditPart;
import model.diagram.edit.parts.HoldsAtEditPart;
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
import model.diagram.part.GeneratorDiagramEditorPlugin;
import model.diagram.part.GeneratorVisualIDRegistry;
import model.diagram.providers.GeneratorElementTypes;
import model.diagram.providers.GeneratorParserProvider;

/**
 * @generated
 */
public class GeneratorNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		GeneratorDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		GeneratorDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof GeneratorNavigatorItem && !isOwnView(((GeneratorNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof GeneratorNavigatorGroup) {
			GeneratorNavigatorGroup group = (GeneratorNavigatorGroup) element;
			return GeneratorDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof GeneratorNavigatorItem) {
			GeneratorNavigatorItem navigatorItem = (GeneratorNavigatorItem) element;
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
		switch (GeneratorVisualIDRegistry.getVisualID(view)) {
		case EnvironmentEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?https://github.com/mlatona/minorityReportPlugin?Environment", //$NON-NLS-1$
					GeneratorElementTypes.Environment_1000);
		case InstanceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?Instance", //$NON-NLS-1$
					GeneratorElementTypes.Instance_2001);
		case ContextRelationEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?ContextRelation", //$NON-NLS-1$
					GeneratorElementTypes.ContextRelation_2002);
		case HoldsAtEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?HoldsAt", //$NON-NLS-1$
					GeneratorElementTypes.HoldsAt_2003);
		case PrimitiveEventEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?PrimitiveEvent", //$NON-NLS-1$
					GeneratorElementTypes.PrimitiveEvent_2004);
		case ComplexEventEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?ComplexEvent", //$NON-NLS-1$
					GeneratorElementTypes.ComplexEvent_2005);
		case ParameterEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?Parameter", //$NON-NLS-1$
					GeneratorElementTypes.Parameter_2006);
		case InitiallyEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?Initially", //$NON-NLS-1$
					GeneratorElementTypes.Initially_2007);
		case TypeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?Type", //$NON-NLS-1$
					GeneratorElementTypes.Type_2008);
		case HappensEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?Happens", //$NON-NLS-1$
					GeneratorElementTypes.Happens_2009);
		case BehaviouralDescriptionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?BehaviouralDescription", //$NON-NLS-1$
					GeneratorElementTypes.BehaviouralDescription_2010);
		case HoldsAtBetweenEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://github.com/mlatona/minorityReportPlugin?HoldsAtBetween", //$NON-NLS-1$
					GeneratorElementTypes.HoldsAtBetween_2011);
		case ContextRelationEndingComplexEventEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?https://github.com/mlatona/minorityReportPlugin?ContextRelation?endingComplexEvent", //$NON-NLS-1$
					GeneratorElementTypes.ContextRelationEndingComplexEvent_4001);
		case EventParametersEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://github.com/mlatona/minorityReportPlugin?Event?parameters", //$NON-NLS-1$
					GeneratorElementTypes.EventParameters_4002);
		case HoldsAtBetweenContextRelationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?https://github.com/mlatona/minorityReportPlugin?HoldsAtBetween?contextRelation", //$NON-NLS-1$
					GeneratorElementTypes.HoldsAtBetweenContextRelation_4003);
		case InitiallyHappensEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://github.com/mlatona/minorityReportPlugin?Initially?happens", //$NON-NLS-1$
					GeneratorElementTypes.InitiallyHappens_4004);
		case InstanceTypeEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://github.com/mlatona/minorityReportPlugin?Instance?type", //$NON-NLS-1$
					GeneratorElementTypes.InstanceType_4005);
		case InitiallyHoldsAtsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://github.com/mlatona/minorityReportPlugin?Initially?holdsAts", //$NON-NLS-1$
					GeneratorElementTypes.InitiallyHoldsAts_4006);
		case BehaviouralDescriptionHoldsAtBetweensEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?https://github.com/mlatona/minorityReportPlugin?BehaviouralDescription?holdsAtBetweens", //$NON-NLS-1$
					GeneratorElementTypes.BehaviouralDescriptionHoldsAtBetweens_4007);
		case ComplexEventBehaviouralDescriptionsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?https://github.com/mlatona/minorityReportPlugin?ComplexEvent?behaviouralDescriptions", //$NON-NLS-1$
					GeneratorElementTypes.ComplexEventBehaviouralDescriptions_4008);
		case HappensContextRelationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://github.com/mlatona/minorityReportPlugin?Happens?contextRelation", //$NON-NLS-1$
					GeneratorElementTypes.HappensContextRelation_4009);
		case InitiallyContextRelationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://github.com/mlatona/minorityReportPlugin?Initially?contextRelation", //$NON-NLS-1$
					GeneratorElementTypes.InitiallyContextRelation_4010);
		case ParameterInstanceEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://github.com/mlatona/minorityReportPlugin?Parameter?instance", //$NON-NLS-1$
					GeneratorElementTypes.ParameterInstance_4011);
		case ContextRelationParametersEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://github.com/mlatona/minorityReportPlugin?ContextRelation?parameters", //$NON-NLS-1$
					GeneratorElementTypes.ContextRelationParameters_4012);
		case BehaviouralDescriptionHappensEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?https://github.com/mlatona/minorityReportPlugin?BehaviouralDescription?happens", //$NON-NLS-1$
					GeneratorElementTypes.BehaviouralDescriptionHappens_4013);
		case BehaviouralDescriptionHoldsAtsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?https://github.com/mlatona/minorityReportPlugin?BehaviouralDescription?holdsAts", //$NON-NLS-1$
					GeneratorElementTypes.BehaviouralDescriptionHoldsAts_4014);
		case InitiallyHoldsAtBetweensEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://github.com/mlatona/minorityReportPlugin?Initially?holdsAtBetweens", //$NON-NLS-1$
					GeneratorElementTypes.InitiallyHoldsAtBetweens_4015);
		case ContextRelationInitialComplexEventEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?https://github.com/mlatona/minorityReportPlugin?ContextRelation?initialComplexEvent", //$NON-NLS-1$
					GeneratorElementTypes.ContextRelationInitialComplexEvent_4016);
		case HoldsAtContextRelationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://github.com/mlatona/minorityReportPlugin?HoldsAt?contextRelation", //$NON-NLS-1$
					GeneratorElementTypes.HoldsAtContextRelation_4017);
		case ParameterTypeEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://github.com/mlatona/minorityReportPlugin?Parameter?type", //$NON-NLS-1$
					GeneratorElementTypes.ParameterType_4018);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = GeneratorDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && GeneratorElementTypes.isKnownElementType(elementType)) {
			image = GeneratorElementTypes.getImage(elementType);
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
		if (element instanceof GeneratorNavigatorGroup) {
			GeneratorNavigatorGroup group = (GeneratorNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof GeneratorNavigatorItem) {
			GeneratorNavigatorItem navigatorItem = (GeneratorNavigatorItem) element;
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
		switch (GeneratorVisualIDRegistry.getVisualID(view)) {
		case EnvironmentEditPart.VISUAL_ID:
			return getEnvironment_1000Text(view);
		case InstanceEditPart.VISUAL_ID:
			return getInstance_2001Text(view);
		case ContextRelationEditPart.VISUAL_ID:
			return getContextRelation_2002Text(view);
		case HoldsAtEditPart.VISUAL_ID:
			return getHoldsAt_2003Text(view);
		case PrimitiveEventEditPart.VISUAL_ID:
			return getPrimitiveEvent_2004Text(view);
		case ComplexEventEditPart.VISUAL_ID:
			return getComplexEvent_2005Text(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_2006Text(view);
		case InitiallyEditPart.VISUAL_ID:
			return getInitially_2007Text(view);
		case TypeEditPart.VISUAL_ID:
			return getType_2008Text(view);
		case HappensEditPart.VISUAL_ID:
			return getHappens_2009Text(view);
		case BehaviouralDescriptionEditPart.VISUAL_ID:
			return getBehaviouralDescription_2010Text(view);
		case HoldsAtBetweenEditPart.VISUAL_ID:
			return getHoldsAtBetween_2011Text(view);
		case ContextRelationEndingComplexEventEditPart.VISUAL_ID:
			return getContextRelationEndingComplexEvent_4001Text(view);
		case EventParametersEditPart.VISUAL_ID:
			return getEventParameters_4002Text(view);
		case HoldsAtBetweenContextRelationEditPart.VISUAL_ID:
			return getHoldsAtBetweenContextRelation_4003Text(view);
		case InitiallyHappensEditPart.VISUAL_ID:
			return getInitiallyHappens_4004Text(view);
		case InstanceTypeEditPart.VISUAL_ID:
			return getInstanceType_4005Text(view);
		case InitiallyHoldsAtsEditPart.VISUAL_ID:
			return getInitiallyHoldsAts_4006Text(view);
		case BehaviouralDescriptionHoldsAtBetweensEditPart.VISUAL_ID:
			return getBehaviouralDescriptionHoldsAtBetweens_4007Text(view);
		case ComplexEventBehaviouralDescriptionsEditPart.VISUAL_ID:
			return getComplexEventBehaviouralDescriptions_4008Text(view);
		case HappensContextRelationEditPart.VISUAL_ID:
			return getHappensContextRelation_4009Text(view);
		case InitiallyContextRelationEditPart.VISUAL_ID:
			return getInitiallyContextRelation_4010Text(view);
		case ParameterInstanceEditPart.VISUAL_ID:
			return getParameterInstance_4011Text(view);
		case ContextRelationParametersEditPart.VISUAL_ID:
			return getContextRelationParameters_4012Text(view);
		case BehaviouralDescriptionHappensEditPart.VISUAL_ID:
			return getBehaviouralDescriptionHappens_4013Text(view);
		case BehaviouralDescriptionHoldsAtsEditPart.VISUAL_ID:
			return getBehaviouralDescriptionHoldsAts_4014Text(view);
		case InitiallyHoldsAtBetweensEditPart.VISUAL_ID:
			return getInitiallyHoldsAtBetweens_4015Text(view);
		case ContextRelationInitialComplexEventEditPart.VISUAL_ID:
			return getContextRelationInitialComplexEvent_4016Text(view);
		case HoldsAtContextRelationEditPart.VISUAL_ID:
			return getHoldsAtContextRelation_4017Text(view);
		case ParameterTypeEditPart.VISUAL_ID:
			return getParameterType_4018Text(view);
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
	private String getInstance_2001Text(View view) {
		IParser parser = GeneratorParserProvider.getParser(GeneratorElementTypes.Instance_2001,
				view.getElement() != null ? view.getElement() : view,
				GeneratorVisualIDRegistry.getType(InstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GeneratorDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContextRelation_2002Text(View view) {
		IParser parser = GeneratorParserProvider.getParser(GeneratorElementTypes.ContextRelation_2002,
				view.getElement() != null ? view.getElement() : view,
				GeneratorVisualIDRegistry.getType(ContextRelationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GeneratorDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getHoldsAt_2003Text(View view) {
		HoldsAt domainModelElement = (HoldsAt) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getTime());
		} else {
			GeneratorDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPrimitiveEvent_2004Text(View view) {
		IParser parser = GeneratorParserProvider.getParser(GeneratorElementTypes.PrimitiveEvent_2004,
				view.getElement() != null ? view.getElement() : view,
				GeneratorVisualIDRegistry.getType(PrimitiveEventNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GeneratorDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComplexEvent_2005Text(View view) {
		IParser parser = GeneratorParserProvider.getParser(GeneratorElementTypes.ComplexEvent_2005,
				view.getElement() != null ? view.getElement() : view,
				GeneratorVisualIDRegistry.getType(ComplexEventNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GeneratorDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getParameter_2006Text(View view) {
		IParser parser = GeneratorParserProvider.getParser(GeneratorElementTypes.Parameter_2006,
				view.getElement() != null ? view.getElement() : view,
				GeneratorVisualIDRegistry.getType(ParameterNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GeneratorDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInitially_2007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getType_2008Text(View view) {
		IParser parser = GeneratorParserProvider.getParser(GeneratorElementTypes.Type_2008,
				view.getElement() != null ? view.getElement() : view,
				GeneratorVisualIDRegistry.getType(TypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GeneratorDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getHappens_2009Text(View view) {
		Happens domainModelElement = (Happens) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getTime());
		} else {
			GeneratorDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBehaviouralDescription_2010Text(View view) {
		IParser parser = GeneratorParserProvider.getParser(GeneratorElementTypes.BehaviouralDescription_2010,
				view.getElement() != null ? view.getElement() : view,
				GeneratorVisualIDRegistry.getType(BehaviouralDescriptionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GeneratorDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getHoldsAtBetween_2011Text(View view) {
		HoldsAtBetween domainModelElement = (HoldsAtBetween) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getInitialTime());
		} else {
			GeneratorDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContextRelationEndingComplexEvent_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getEventParameters_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getHoldsAtBetweenContextRelation_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getInitiallyHappens_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getInstanceType_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getInitiallyHoldsAts_4006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getBehaviouralDescriptionHoldsAtBetweens_4007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getComplexEventBehaviouralDescriptions_4008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getHappensContextRelation_4009Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getInitiallyContextRelation_4010Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getParameterInstance_4011Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getContextRelationParameters_4012Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getBehaviouralDescriptionHappens_4013Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getBehaviouralDescriptionHoldsAts_4014Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getInitiallyHoldsAtBetweens_4015Text(View view) {
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
	private String getHoldsAtContextRelation_4017Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getParameterType_4018Text(View view) {
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
		return EnvironmentEditPart.MODEL_ID.equals(GeneratorVisualIDRegistry.getModelID(view));
	}

}
