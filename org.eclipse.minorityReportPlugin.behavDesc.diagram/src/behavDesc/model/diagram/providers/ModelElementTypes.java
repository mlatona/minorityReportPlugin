package behavDesc.model.diagram.providers;

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
			behavDesc.model.diagram.part.ModelDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Environment_1000 = getElementType(
			"org.eclipse.minorityReportPlugin.behavDesc.diagram.Environment_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType BehaviouralDescription_2001 = getElementType(
			"org.eclipse.minorityReportPlugin.behavDesc.diagram.BehaviouralDescription_2001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Happens_2002 = getElementType(
			"org.eclipse.minorityReportPlugin.behavDesc.diagram.Happens_2002"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType BehaviouralDescriptionHappens_4001 = getElementType(
			"org.eclipse.minorityReportPlugin.behavDesc.diagram.BehaviouralDescriptionHappens_4001"); //$NON-NLS-1$

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

			elements.put(BehaviouralDescription_2001, ModelPackage.eINSTANCE.getBehaviouralDescription());

			elements.put(Happens_2002, ModelPackage.eINSTANCE.getHappens());

			elements.put(BehaviouralDescriptionHappens_4001,
					ModelPackage.eINSTANCE.getBehaviouralDescription_Happens());
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
			KNOWN_ELEMENT_TYPES.add(BehaviouralDescription_2001);
			KNOWN_ELEMENT_TYPES.add(Happens_2002);
			KNOWN_ELEMENT_TYPES.add(BehaviouralDescriptionHappens_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case behavDesc.model.diagram.edit.parts.EnvironmentEditPart.VISUAL_ID:
			return Environment_1000;
		case behavDesc.model.diagram.edit.parts.BehaviouralDescriptionEditPart.VISUAL_ID:
			return BehaviouralDescription_2001;
		case behavDesc.model.diagram.edit.parts.HappensEditPart.VISUAL_ID:
			return Happens_2002;
		case behavDesc.model.diagram.edit.parts.BehaviouralDescriptionHappensEditPart.VISUAL_ID:
			return BehaviouralDescriptionHappens_4001;
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
			return behavDesc.model.diagram.providers.ModelElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return behavDesc.model.diagram.providers.ModelElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return behavDesc.model.diagram.providers.ModelElementTypes.getElement(elementTypeAdapter);
		}
	};

}
