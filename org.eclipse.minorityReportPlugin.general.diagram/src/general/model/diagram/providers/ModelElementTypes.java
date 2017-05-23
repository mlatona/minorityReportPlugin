package general.model.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import general.model.diagram.edit.parts.BehaviouralDescriptionEditPart;
import general.model.diagram.edit.parts.BehaviouralDescriptionHappensEditPart;
import general.model.diagram.edit.parts.BehaviouralDescriptionHoldsAtBetweensEditPart;
import general.model.diagram.edit.parts.BehaviouralDescriptionHoldsAtsEditPart;
import general.model.diagram.edit.parts.ComplexEventBehaviouralDescriptionsEditPart;
import general.model.diagram.edit.parts.ComplexEventEditPart;
import general.model.diagram.edit.parts.ContextRelationEditPart;
import general.model.diagram.edit.parts.ContextRelationEndingComplexEventEditPart;
import general.model.diagram.edit.parts.ContextRelationInitialComplexEventEditPart;
import general.model.diagram.edit.parts.ContextRelationParametersEditPart;
import general.model.diagram.edit.parts.EnvironmentEditPart;
import general.model.diagram.edit.parts.EventParametersEditPart;
import general.model.diagram.edit.parts.HappensEditPart;
import general.model.diagram.edit.parts.HappensEventEditPart;
import general.model.diagram.edit.parts.HoldsAtBetweenContextRelationEditPart;
import general.model.diagram.edit.parts.HoldsAtBetweenEditPart;
import general.model.diagram.edit.parts.HoldsAtContextRelationEditPart;
import general.model.diagram.edit.parts.HoldsAtEditPart;
import general.model.diagram.edit.parts.InitiallyContextRelationEditPart;
import general.model.diagram.edit.parts.InitiallyEditPart;
import general.model.diagram.edit.parts.InitiallyHappensEditPart;
import general.model.diagram.edit.parts.InitiallyHoldsAtBetweensEditPart;
import general.model.diagram.edit.parts.InitiallyHoldsAtsEditPart;
import general.model.diagram.edit.parts.InstanceEditPart;
import general.model.diagram.edit.parts.InstanceTypeEditPart;
import general.model.diagram.edit.parts.ParameterEditPart;
import general.model.diagram.edit.parts.ParameterInstanceEditPart;
import general.model.diagram.edit.parts.ParameterTypeEditPart;
import general.model.diagram.edit.parts.PrimitiveEventEditPart;
import general.model.diagram.edit.parts.TypeEditPart;
import general.model.diagram.part.ModelDiagramEditorPlugin;
import model.ModelPackage;

/**
 * @generated
 */
public class ModelElementTypes {

	/**
	* @generated
	*/
	private ModelElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ModelDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Environment_1000 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.Environment_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Type_2001 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.Type_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Parameter_2002 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.Parameter_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType HoldsAtBetween_2003 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.HoldsAtBetween_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Instance_2004 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.Instance_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Happens_2005 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.Happens_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Initially_2006 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.Initially_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType BehaviouralDescription_2007 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.BehaviouralDescription_2007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType HoldsAt_2008 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.HoldsAt_2008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PrimitiveEvent_2012 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.PrimitiveEvent_2012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComplexEvent_2010 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.ComplexEvent_2010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ContextRelation_2011 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.ContextRelation_2011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType HoldsAtContextRelation_4001 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.HoldsAtContextRelation_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ParameterInstance_4002 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.ParameterInstance_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ContextRelationParameters_4003 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.ContextRelationParameters_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ParameterType_4004 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.ParameterType_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InitiallyContextRelation_4005 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.InitiallyContextRelation_4005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ContextRelationEndingComplexEvent_4006 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.ContextRelationEndingComplexEvent_4006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType HappensEvent_4007 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.HappensEvent_4007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InitiallyHoldsAts_4008 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.InitiallyHoldsAts_4008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InitiallyHoldsAtBetweens_4009 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.InitiallyHoldsAtBetweens_4009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComplexEventBehaviouralDescriptions_4010 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.ComplexEventBehaviouralDescriptions_4010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InitiallyHappens_4011 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.InitiallyHappens_4011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EventParameters_4012 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.EventParameters_4012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType HoldsAtBetweenContextRelation_4013 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.HoldsAtBetweenContextRelation_4013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType BehaviouralDescriptionHoldsAtBetweens_4014 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.BehaviouralDescriptionHoldsAtBetweens_4014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType BehaviouralDescriptionHoldsAts_4015 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.BehaviouralDescriptionHoldsAts_4015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ContextRelationInitialComplexEvent_4016 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.ContextRelationInitialComplexEvent_4016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType BehaviouralDescriptionHappens_4017 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.BehaviouralDescriptionHappens_4017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InstanceType_4018 = getElementType(
			"org.eclipse.minorityReportPlugin.general.diagram.InstanceType_4018"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Environment_1000, ModelPackage.eINSTANCE.getEnvironment());

			elements.put(Type_2001, ModelPackage.eINSTANCE.getType());

			elements.put(Parameter_2002, ModelPackage.eINSTANCE.getParameter());

			elements.put(HoldsAtBetween_2003, ModelPackage.eINSTANCE.getHoldsAtBetween());

			elements.put(Instance_2004, ModelPackage.eINSTANCE.getInstance());

			elements.put(Happens_2005, ModelPackage.eINSTANCE.getHappens());

			elements.put(Initially_2006, ModelPackage.eINSTANCE.getInitially());

			elements.put(BehaviouralDescription_2007, ModelPackage.eINSTANCE.getBehaviouralDescription());

			elements.put(HoldsAt_2008, ModelPackage.eINSTANCE.getHoldsAt());

			elements.put(PrimitiveEvent_2012, ModelPackage.eINSTANCE.getPrimitiveEvent());

			elements.put(ComplexEvent_2010, ModelPackage.eINSTANCE.getComplexEvent());

			elements.put(ContextRelation_2011, ModelPackage.eINSTANCE.getContextRelation());

			elements.put(HoldsAtContextRelation_4001, ModelPackage.eINSTANCE.getHoldsAt_ContextRelation());

			elements.put(ParameterInstance_4002, ModelPackage.eINSTANCE.getParameter_Instance());

			elements.put(ContextRelationParameters_4003, ModelPackage.eINSTANCE.getContextRelation_Parameters());

			elements.put(ParameterType_4004, ModelPackage.eINSTANCE.getParameter_Type());

			elements.put(InitiallyContextRelation_4005, ModelPackage.eINSTANCE.getInitially_ContextRelation());

			elements.put(ContextRelationEndingComplexEvent_4006,
					ModelPackage.eINSTANCE.getContextRelation_EndingComplexEvent());

			elements.put(HappensEvent_4007, ModelPackage.eINSTANCE.getHappens_Event());

			elements.put(InitiallyHoldsAts_4008, ModelPackage.eINSTANCE.getInitially_HoldsAts());

			elements.put(InitiallyHoldsAtBetweens_4009, ModelPackage.eINSTANCE.getInitially_HoldsAtBetweens());

			elements.put(ComplexEventBehaviouralDescriptions_4010,
					ModelPackage.eINSTANCE.getComplexEvent_BehaviouralDescriptions());

			elements.put(InitiallyHappens_4011, ModelPackage.eINSTANCE.getInitially_Happens());

			elements.put(EventParameters_4012, ModelPackage.eINSTANCE.getEvent_Parameters());

			elements.put(HoldsAtBetweenContextRelation_4013,
					ModelPackage.eINSTANCE.getHoldsAtBetween_ContextRelation());

			elements.put(BehaviouralDescriptionHoldsAtBetweens_4014,
					ModelPackage.eINSTANCE.getBehaviouralDescription_HoldsAtBetweens());

			elements.put(BehaviouralDescriptionHoldsAts_4015,
					ModelPackage.eINSTANCE.getBehaviouralDescription_HoldsAts());

			elements.put(ContextRelationInitialComplexEvent_4016,
					ModelPackage.eINSTANCE.getContextRelation_InitialComplexEvent());

			elements.put(BehaviouralDescriptionHappens_4017,
					ModelPackage.eINSTANCE.getBehaviouralDescription_Happens());

			elements.put(InstanceType_4018, ModelPackage.eINSTANCE.getInstance_Type());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Environment_1000);
			KNOWN_ELEMENT_TYPES.add(Type_2001);
			KNOWN_ELEMENT_TYPES.add(Parameter_2002);
			KNOWN_ELEMENT_TYPES.add(HoldsAtBetween_2003);
			KNOWN_ELEMENT_TYPES.add(Instance_2004);
			KNOWN_ELEMENT_TYPES.add(Happens_2005);
			KNOWN_ELEMENT_TYPES.add(Initially_2006);
			KNOWN_ELEMENT_TYPES.add(BehaviouralDescription_2007);
			KNOWN_ELEMENT_TYPES.add(HoldsAt_2008);
			KNOWN_ELEMENT_TYPES.add(PrimitiveEvent_2012);
			KNOWN_ELEMENT_TYPES.add(ComplexEvent_2010);
			KNOWN_ELEMENT_TYPES.add(ContextRelation_2011);
			KNOWN_ELEMENT_TYPES.add(HoldsAtContextRelation_4001);
			KNOWN_ELEMENT_TYPES.add(ParameterInstance_4002);
			KNOWN_ELEMENT_TYPES.add(ContextRelationParameters_4003);
			KNOWN_ELEMENT_TYPES.add(ParameterType_4004);
			KNOWN_ELEMENT_TYPES.add(InitiallyContextRelation_4005);
			KNOWN_ELEMENT_TYPES.add(ContextRelationEndingComplexEvent_4006);
			KNOWN_ELEMENT_TYPES.add(HappensEvent_4007);
			KNOWN_ELEMENT_TYPES.add(InitiallyHoldsAts_4008);
			KNOWN_ELEMENT_TYPES.add(InitiallyHoldsAtBetweens_4009);
			KNOWN_ELEMENT_TYPES.add(ComplexEventBehaviouralDescriptions_4010);
			KNOWN_ELEMENT_TYPES.add(InitiallyHappens_4011);
			KNOWN_ELEMENT_TYPES.add(EventParameters_4012);
			KNOWN_ELEMENT_TYPES.add(HoldsAtBetweenContextRelation_4013);
			KNOWN_ELEMENT_TYPES.add(BehaviouralDescriptionHoldsAtBetweens_4014);
			KNOWN_ELEMENT_TYPES.add(BehaviouralDescriptionHoldsAts_4015);
			KNOWN_ELEMENT_TYPES.add(ContextRelationInitialComplexEvent_4016);
			KNOWN_ELEMENT_TYPES.add(BehaviouralDescriptionHappens_4017);
			KNOWN_ELEMENT_TYPES.add(InstanceType_4018);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case EnvironmentEditPart.VISUAL_ID:
			return Environment_1000;
		case TypeEditPart.VISUAL_ID:
			return Type_2001;
		case ParameterEditPart.VISUAL_ID:
			return Parameter_2002;
		case HoldsAtBetweenEditPart.VISUAL_ID:
			return HoldsAtBetween_2003;
		case InstanceEditPart.VISUAL_ID:
			return Instance_2004;
		case HappensEditPart.VISUAL_ID:
			return Happens_2005;
		case InitiallyEditPart.VISUAL_ID:
			return Initially_2006;
		case BehaviouralDescriptionEditPart.VISUAL_ID:
			return BehaviouralDescription_2007;
		case HoldsAtEditPart.VISUAL_ID:
			return HoldsAt_2008;
		case PrimitiveEventEditPart.VISUAL_ID:
			return PrimitiveEvent_2012;
		case ComplexEventEditPart.VISUAL_ID:
			return ComplexEvent_2010;
		case ContextRelationEditPart.VISUAL_ID:
			return ContextRelation_2011;
		case HoldsAtContextRelationEditPart.VISUAL_ID:
			return HoldsAtContextRelation_4001;
		case ParameterInstanceEditPart.VISUAL_ID:
			return ParameterInstance_4002;
		case ContextRelationParametersEditPart.VISUAL_ID:
			return ContextRelationParameters_4003;
		case ParameterTypeEditPart.VISUAL_ID:
			return ParameterType_4004;
		case InitiallyContextRelationEditPart.VISUAL_ID:
			return InitiallyContextRelation_4005;
		case ContextRelationEndingComplexEventEditPart.VISUAL_ID:
			return ContextRelationEndingComplexEvent_4006;
		case HappensEventEditPart.VISUAL_ID:
			return HappensEvent_4007;
		case InitiallyHoldsAtsEditPart.VISUAL_ID:
			return InitiallyHoldsAts_4008;
		case InitiallyHoldsAtBetweensEditPart.VISUAL_ID:
			return InitiallyHoldsAtBetweens_4009;
		case ComplexEventBehaviouralDescriptionsEditPart.VISUAL_ID:
			return ComplexEventBehaviouralDescriptions_4010;
		case InitiallyHappensEditPart.VISUAL_ID:
			return InitiallyHappens_4011;
		case EventParametersEditPart.VISUAL_ID:
			return EventParameters_4012;
		case HoldsAtBetweenContextRelationEditPart.VISUAL_ID:
			return HoldsAtBetweenContextRelation_4013;
		case BehaviouralDescriptionHoldsAtBetweensEditPart.VISUAL_ID:
			return BehaviouralDescriptionHoldsAtBetweens_4014;
		case BehaviouralDescriptionHoldsAtsEditPart.VISUAL_ID:
			return BehaviouralDescriptionHoldsAts_4015;
		case ContextRelationInitialComplexEventEditPart.VISUAL_ID:
			return ContextRelationInitialComplexEvent_4016;
		case BehaviouralDescriptionHappensEditPart.VISUAL_ID:
			return BehaviouralDescriptionHappens_4017;
		case InstanceTypeEditPart.VISUAL_ID:
			return InstanceType_4018;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return general.model.diagram.providers.ModelElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return general.model.diagram.providers.ModelElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return general.model.diagram.providers.ModelElementTypes.getElement(elementTypeAdapter);
		}
	};

}
