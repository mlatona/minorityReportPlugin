package general.model.diagram.providers;

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

import general.model.diagram.edit.parts.BehaviouralDescriptionNameEditPart;
import general.model.diagram.edit.parts.ComplexEventNameEditPart;
import general.model.diagram.edit.parts.ContextRelationNameEditPart;
import general.model.diagram.edit.parts.HappensTimeEditPart;
import general.model.diagram.edit.parts.HoldsAtTimeEditPart;
import general.model.diagram.edit.parts.InstanceNameEditPart;
import general.model.diagram.edit.parts.ParameterNameEditPart;
import general.model.diagram.edit.parts.PrimitiveEventNameEditPart;
import general.model.diagram.edit.parts.TypeNameEditPart;
import general.model.diagram.parsers.MessageFormatParser;
import general.model.diagram.part.ModelVisualIDRegistry;
import model.ModelPackage;

/**
 * @generated
 */
public class ModelParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser typeName_5001Parser;

	/**
	* @generated
	*/
	private IParser getTypeName_5001Parser() {
		if (typeName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE.getType_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			typeName_5001Parser = parser;
		}
		return typeName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser parameterName_5002Parser;

	/**
	* @generated
	*/
	private IParser getParameterName_5002Parser() {
		if (parameterName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE.getParameter_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parameterName_5002Parser = parser;
		}
		return parameterName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser instanceName_5003Parser;

	/**
	* @generated
	*/
	private IParser getInstanceName_5003Parser() {
		if (instanceName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE.getInstance_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			instanceName_5003Parser = parser;
		}
		return instanceName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser happensTime_5004Parser;

	/**
	* @generated
	*/
	private IParser getHappensTime_5004Parser() {
		if (happensTime_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE.getHappens_Time() };
			MessageFormatParser parser = new MessageFormatParser(features);
			happensTime_5004Parser = parser;
		}
		return happensTime_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser behaviouralDescriptionName_5005Parser;

	/**
	* @generated
	*/
	private IParser getBehaviouralDescriptionName_5005Parser() {
		if (behaviouralDescriptionName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE.getBehaviouralDescription_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			behaviouralDescriptionName_5005Parser = parser;
		}
		return behaviouralDescriptionName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser holdsAtTime_5006Parser;

	/**
	* @generated
	*/
	private IParser getHoldsAtTime_5006Parser() {
		if (holdsAtTime_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE.getHoldsAt_Time() };
			MessageFormatParser parser = new MessageFormatParser(features);
			holdsAtTime_5006Parser = parser;
		}
		return holdsAtTime_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser complexEventName_5008Parser;

	/**
	* @generated
	*/
	private IParser getComplexEventName_5008Parser() {
		if (complexEventName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE.getEvent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			complexEventName_5008Parser = parser;
		}
		return complexEventName_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser contextRelationName_5009Parser;

	/**
	* @generated
	*/
	private IParser getContextRelationName_5009Parser() {
		if (contextRelationName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE.getContextRelation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contextRelationName_5009Parser = parser;
		}
		return contextRelationName_5009Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case TypeNameEditPart.VISUAL_ID:
			return getTypeName_5001Parser();
		case ParameterNameEditPart.VISUAL_ID:
			return getParameterName_5002Parser();
		case InstanceNameEditPart.VISUAL_ID:
			return getInstanceName_5003Parser();
		case HappensTimeEditPart.VISUAL_ID:
			return getHappensTime_5004Parser();
		case BehaviouralDescriptionNameEditPart.VISUAL_ID:
			return getBehaviouralDescriptionName_5005Parser();
		case HoldsAtTimeEditPart.VISUAL_ID:
			return getHoldsAtTime_5006Parser();
		case ComplexEventNameEditPart.VISUAL_ID:
			return getComplexEventName_5008Parser();
		case ContextRelationNameEditPart.VISUAL_ID:
			return getContextRelationName_5009Parser();
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
