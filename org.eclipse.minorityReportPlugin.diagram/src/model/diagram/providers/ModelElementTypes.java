package model.diagram.providers;

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

import model.ModelPackage;
import model.diagram.edit.parts.BehaviouralDescriptionEditPart;
import model.diagram.edit.parts.BehaviouralDescriptionHappensEditPart;
import model.diagram.edit.parts.BehaviouralDescriptionHoldsAtBetweensEditPart;
import model.diagram.edit.parts.BehaviouralDescriptionHoldsAtsEditPart;
import model.diagram.edit.parts.ComplexEventBehaviouralDescriptionsEditPart;
import model.diagram.edit.parts.ComplexEventEditPart;
import model.diagram.edit.parts.ContextRelationEditPart;
import model.diagram.edit.parts.ContextRelationEndingComplexEventEditPart;
import model.diagram.edit.parts.ContextRelationInitialComplexEventEditPart;
import model.diagram.edit.parts.ContextRelationParametersEditPart;
import model.diagram.edit.parts.EnvironmentEditPart;
import model.diagram.edit.parts.HappensEditPart;
import model.diagram.edit.parts.HappensEventEditPart;
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
import model.diagram.edit.parts.InstanceTypeEditPart;
import model.diagram.edit.parts.ParameterEditPart;
import model.diagram.edit.parts.ParameterInstanceEditPart;
import model.diagram.edit.parts.ParameterTypeEditPart;
import model.diagram.edit.parts.PrimitiveEventEditPart;
import model.diagram.edit.parts.TypeEditPart;
import model.diagram.part.ModelDiagramEditorPlugin;

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
			"org.eclipse.minorityReportPlugin.diagram.Environment_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType HoldsAt_2003 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.HoldsAt_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Happens_2009 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.Happens_2009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Initially_2007 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.Initially_2007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType HoldsAtBetween_2011 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.HoldsAtBetween_2011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Parameter_2006 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.Parameter_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PrimitiveEvent_2004 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.PrimitiveEvent_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Type_2008 = getElementType("org.eclipse.minorityReportPlugin.diagram.Type_2008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Instance_2001 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.Instance_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ContextRelation_2002 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.ContextRelation_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType BehaviouralDescription_2010 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.BehaviouralDescription_2010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComplexEvent_2005 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.ComplexEvent_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InitiallyHoldsAts_4001 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.InitiallyHoldsAts_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType HoldsAtBetweenContextRelation_4002 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.HoldsAtBetweenContextRelation_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InitiallyContextRelation_4003 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.InitiallyContextRelation_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InstanceType_4004 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.InstanceType_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InitiallyHappens_4005 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.InitiallyHappens_4005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ParameterInstance_4006 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.ParameterInstance_4006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType BehaviouralDescriptionHoldsAtBetweens_4007 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.BehaviouralDescriptionHoldsAtBetweens_4007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ParameterType_4008 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.ParameterType_4008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType HoldsAtContextRelation_4009 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.HoldsAtContextRelation_4009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComplexEventBehaviouralDescriptions_4010 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.ComplexEventBehaviouralDescriptions_4010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType BehaviouralDescriptionHoldsAts_4012 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.BehaviouralDescriptionHoldsAts_4012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ContextRelationParameters_4013 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.ContextRelationParameters_4013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InitiallyHoldsAtBetweens_4014 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.InitiallyHoldsAtBetweens_4014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ContextRelationEndingComplexEvent_4015 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.ContextRelationEndingComplexEvent_4015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType BehaviouralDescriptionHappens_4016 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.BehaviouralDescriptionHappens_4016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ContextRelationInitialComplexEvent_4017 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.ContextRelationInitialComplexEvent_4017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType HappensEvent_4019 = getElementType(
			"org.eclipse.minorityReportPlugin.diagram.HappensEvent_4019"); //$NON-NLS-1$

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

			elements.put(HoldsAt_2003, ModelPackage.eINSTANCE.getHoldsAt());

			elements.put(Happens_2009, ModelPackage.eINSTANCE.getHappens());

			elements.put(Initially_2007, ModelPackage.eINSTANCE.getInitially());

			elements.put(HoldsAtBetween_2011, ModelPackage.eINSTANCE.getHoldsAtBetween());

			elements.put(Parameter_2006, ModelPackage.eINSTANCE.getParameter());

			elements.put(PrimitiveEvent_2004, ModelPackage.eINSTANCE.getPrimitiveEvent());

			elements.put(Type_2008, ModelPackage.eINSTANCE.getType());

			elements.put(Instance_2001, ModelPackage.eINSTANCE.getInstance());

			elements.put(ContextRelation_2002, ModelPackage.eINSTANCE.getContextRelation());

			elements.put(BehaviouralDescription_2010, ModelPackage.eINSTANCE.getBehaviouralDescription());

			elements.put(ComplexEvent_2005, ModelPackage.eINSTANCE.getComplexEvent());

			elements.put(InitiallyHoldsAts_4001, ModelPackage.eINSTANCE.getInitially_HoldsAts());

			elements.put(HoldsAtBetweenContextRelation_4002,
					ModelPackage.eINSTANCE.getHoldsAtBetween_ContextRelation());

			elements.put(InitiallyContextRelation_4003, ModelPackage.eINSTANCE.getInitially_ContextRelation());

			elements.put(InstanceType_4004, ModelPackage.eINSTANCE.getInstance_Type());

			elements.put(InitiallyHappens_4005, ModelPackage.eINSTANCE.getInitially_Happens());

			elements.put(ParameterInstance_4006, ModelPackage.eINSTANCE.getParameter_Instance());

			elements.put(BehaviouralDescriptionHoldsAtBetweens_4007,
					ModelPackage.eINSTANCE.getBehaviouralDescription_HoldsAtBetweens());

			elements.put(ParameterType_4008, ModelPackage.eINSTANCE.getParameter_Type());

			elements.put(HoldsAtContextRelation_4009, ModelPackage.eINSTANCE.getHoldsAt_ContextRelation());

			elements.put(ComplexEventBehaviouralDescriptions_4010,
					ModelPackage.eINSTANCE.getComplexEvent_BehaviouralDescriptions());

			elements.put(BehaviouralDescriptionHoldsAts_4012,
					ModelPackage.eINSTANCE.getBehaviouralDescription_HoldsAts());

			elements.put(ContextRelationParameters_4013, ModelPackage.eINSTANCE.getContextRelation_Parameters());

			elements.put(InitiallyHoldsAtBetweens_4014, ModelPackage.eINSTANCE.getInitially_HoldsAtBetweens());

			elements.put(ContextRelationEndingComplexEvent_4015,
					ModelPackage.eINSTANCE.getContextRelation_EndingComplexEvent());

			elements.put(BehaviouralDescriptionHappens_4016,
					ModelPackage.eINSTANCE.getBehaviouralDescription_Happens());

			elements.put(ContextRelationInitialComplexEvent_4017,
					ModelPackage.eINSTANCE.getContextRelation_InitialComplexEvent());

			elements.put(HappensEvent_4019, ModelPackage.eINSTANCE.getHappens_Event());
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
			KNOWN_ELEMENT_TYPES.add(HoldsAt_2003);
			KNOWN_ELEMENT_TYPES.add(Happens_2009);
			KNOWN_ELEMENT_TYPES.add(Initially_2007);
			KNOWN_ELEMENT_TYPES.add(HoldsAtBetween_2011);
			KNOWN_ELEMENT_TYPES.add(Parameter_2006);
			KNOWN_ELEMENT_TYPES.add(PrimitiveEvent_2004);
			KNOWN_ELEMENT_TYPES.add(Type_2008);
			KNOWN_ELEMENT_TYPES.add(Instance_2001);
			KNOWN_ELEMENT_TYPES.add(ContextRelation_2002);
			KNOWN_ELEMENT_TYPES.add(BehaviouralDescription_2010);
			KNOWN_ELEMENT_TYPES.add(ComplexEvent_2005);
			KNOWN_ELEMENT_TYPES.add(InitiallyHoldsAts_4001);
			KNOWN_ELEMENT_TYPES.add(HoldsAtBetweenContextRelation_4002);
			KNOWN_ELEMENT_TYPES.add(InitiallyContextRelation_4003);
			KNOWN_ELEMENT_TYPES.add(InstanceType_4004);
			KNOWN_ELEMENT_TYPES.add(InitiallyHappens_4005);
			KNOWN_ELEMENT_TYPES.add(ParameterInstance_4006);
			KNOWN_ELEMENT_TYPES.add(BehaviouralDescriptionHoldsAtBetweens_4007);
			KNOWN_ELEMENT_TYPES.add(ParameterType_4008);
			KNOWN_ELEMENT_TYPES.add(HoldsAtContextRelation_4009);
			KNOWN_ELEMENT_TYPES.add(ComplexEventBehaviouralDescriptions_4010);
			KNOWN_ELEMENT_TYPES.add(BehaviouralDescriptionHoldsAts_4012);
			KNOWN_ELEMENT_TYPES.add(ContextRelationParameters_4013);
			KNOWN_ELEMENT_TYPES.add(InitiallyHoldsAtBetweens_4014);
			KNOWN_ELEMENT_TYPES.add(ContextRelationEndingComplexEvent_4015);
			KNOWN_ELEMENT_TYPES.add(BehaviouralDescriptionHappens_4016);
			KNOWN_ELEMENT_TYPES.add(ContextRelationInitialComplexEvent_4017);
			KNOWN_ELEMENT_TYPES.add(HappensEvent_4019);
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
		case HoldsAtEditPart.VISUAL_ID:
			return HoldsAt_2003;
		case HappensEditPart.VISUAL_ID:
			return Happens_2009;
		case InitiallyEditPart.VISUAL_ID:
			return Initially_2007;
		case HoldsAtBetweenEditPart.VISUAL_ID:
			return HoldsAtBetween_2011;
		case ParameterEditPart.VISUAL_ID:
			return Parameter_2006;
		case PrimitiveEventEditPart.VISUAL_ID:
			return PrimitiveEvent_2004;
		case TypeEditPart.VISUAL_ID:
			return Type_2008;
		case InstanceEditPart.VISUAL_ID:
			return Instance_2001;
		case ContextRelationEditPart.VISUAL_ID:
			return ContextRelation_2002;
		case BehaviouralDescriptionEditPart.VISUAL_ID:
			return BehaviouralDescription_2010;
		case ComplexEventEditPart.VISUAL_ID:
			return ComplexEvent_2005;
		case InitiallyHoldsAtsEditPart.VISUAL_ID:
			return InitiallyHoldsAts_4001;
		case HoldsAtBetweenContextRelationEditPart.VISUAL_ID:
			return HoldsAtBetweenContextRelation_4002;
		case InitiallyContextRelationEditPart.VISUAL_ID:
			return InitiallyContextRelation_4003;
		case InstanceTypeEditPart.VISUAL_ID:
			return InstanceType_4004;
		case InitiallyHappensEditPart.VISUAL_ID:
			return InitiallyHappens_4005;
		case ParameterInstanceEditPart.VISUAL_ID:
			return ParameterInstance_4006;
		case BehaviouralDescriptionHoldsAtBetweensEditPart.VISUAL_ID:
			return BehaviouralDescriptionHoldsAtBetweens_4007;
		case ParameterTypeEditPart.VISUAL_ID:
			return ParameterType_4008;
		case HoldsAtContextRelationEditPart.VISUAL_ID:
			return HoldsAtContextRelation_4009;
		case ComplexEventBehaviouralDescriptionsEditPart.VISUAL_ID:
			return ComplexEventBehaviouralDescriptions_4010;
		case BehaviouralDescriptionHoldsAtsEditPart.VISUAL_ID:
			return BehaviouralDescriptionHoldsAts_4012;
		case ContextRelationParametersEditPart.VISUAL_ID:
			return ContextRelationParameters_4013;
		case InitiallyHoldsAtBetweensEditPart.VISUAL_ID:
			return InitiallyHoldsAtBetweens_4014;
		case ContextRelationEndingComplexEventEditPart.VISUAL_ID:
			return ContextRelationEndingComplexEvent_4015;
		case BehaviouralDescriptionHappensEditPart.VISUAL_ID:
			return BehaviouralDescriptionHappens_4016;
		case ContextRelationInitialComplexEventEditPart.VISUAL_ID:
			return ContextRelationInitialComplexEvent_4017;
		case HappensEventEditPart.VISUAL_ID:
			return HappensEvent_4019;
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
			return model.diagram.providers.ModelElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return model.diagram.providers.ModelElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return model.diagram.providers.ModelElementTypes.getElement(elementTypeAdapter);
		}
	};

}
