package model.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import model.ModelPackage;
import model.diagram.edit.parts.BehaviouralDescriptionNameEditPart;
import model.diagram.edit.parts.ComplexEventNameEditPart;
import model.diagram.edit.parts.ContextRelationNameEditPart;
import model.diagram.edit.parts.ContextRelationTimeEditPart;
import model.diagram.edit.parts.ContextRelationValueEditPart;
import model.diagram.edit.parts.InstanceNameEditPart;
import model.diagram.edit.parts.ParameterNameEditPart;
import model.diagram.edit.parts.PrimitiveEventNameEditPart;
import model.diagram.edit.parts.TypeNameEditPart;
import model.diagram.parsers.MessageFormatParser;
import model.diagram.part.ModelVisualIDRegistry;

/**
 * @generated
 */
public class ModelParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser parameterName_5005Parser;

	/**
	* @generated
	*/
	private IParser getParameterName_5005Parser() {
		if (parameterName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE.getParameter_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parameterName_5005Parser = parser;
		}
		return parameterName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser primitiveEventName_5003Parser;

	/**
	* @generated
	*/
	private IParser getPrimitiveEventName_5003Parser() {
		if (primitiveEventName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE.getEvent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			primitiveEventName_5003Parser = parser;
		}
		return primitiveEventName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser typeName_5006Parser;

	/**
	* @generated
	*/
	private IParser getTypeName_5006Parser() {
		if (typeName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE.getType_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			typeName_5006Parser = parser;
		}
		return typeName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser instanceName_5001Parser;

	/**
	* @generated
	*/
	private IParser getInstanceName_5001Parser() {
		if (instanceName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE.getInstance_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			instanceName_5001Parser = parser;
		}
		return instanceName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser contextRelationName_5002Parser;

	/**
	* @generated
	*/
	private IParser getContextRelationName_5002Parser() {
		if (contextRelationName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE.getContextRelation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contextRelationName_5002Parser = parser;
		}
		return contextRelationName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser contextRelationTime_5008Parser;

	/**
	* @generated
	*/
	private IParser getContextRelationTime_5008Parser() {
		if (contextRelationTime_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE.getContextRelation_Time() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contextRelationTime_5008Parser = parser;
		}
		return contextRelationTime_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser contextRelationValue_5009Parser;

	/**
	* @generated
	*/
	private IParser getContextRelationValue_5009Parser() {
		if (contextRelationValue_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE.getContextRelation_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contextRelationValue_5009Parser = parser;
		}
		return contextRelationValue_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser behaviouralDescriptionName_5007Parser;

	/**
	* @generated
	*/
	private IParser getBehaviouralDescriptionName_5007Parser() {
		if (behaviouralDescriptionName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE.getBehaviouralDescription_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			behaviouralDescriptionName_5007Parser = parser;
		}
		return behaviouralDescriptionName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser complexEventName_5004Parser;

	/**
	* @generated
	*/
	private IParser getComplexEventName_5004Parser() {
		if (complexEventName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE.getEvent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			complexEventName_5004Parser = parser;
		}
		return complexEventName_5004Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ParameterNameEditPart.VISUAL_ID:
			return getParameterName_5005Parser();
		case PrimitiveEventNameEditPart.VISUAL_ID:
			return getPrimitiveEventName_5003Parser();
		case TypeNameEditPart.VISUAL_ID:
			return getTypeName_5006Parser();
		case InstanceNameEditPart.VISUAL_ID:
			return getInstanceName_5001Parser();
		case ContextRelationNameEditPart.VISUAL_ID:
			return getContextRelationName_5002Parser();
		case ContextRelationTimeEditPart.VISUAL_ID:
			return getContextRelationTime_5008Parser();
		case ContextRelationValueEditPart.VISUAL_ID:
			return getContextRelationValue_5009Parser();
		case BehaviouralDescriptionNameEditPart.VISUAL_ID:
			return getBehaviouralDescriptionName_5007Parser();
		case ComplexEventNameEditPart.VISUAL_ID:
			return getComplexEventName_5004Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ModelVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ModelVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ModelElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
