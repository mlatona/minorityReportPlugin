package model.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase;

import model.BehaviouralDescription;
import model.ComplexEvent;
import model.ContextRelation;
import model.Event;
import model.Happens;
import model.HoldsAt;
import model.HoldsAtBetween;
import model.Initially;
import model.Instance;
import model.Parameter;
import model.Type;
import model.diagram.part.GeneratorDiagramEditorPlugin;
import model.diagram.part.GeneratorVisualIDRegistry;
import model.diagram.providers.GeneratorElementTypes;

/**
 * @generated
 */
public class GeneratorBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	* Extended request data key to hold editpart visual id.
	* @generated
	*/
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	* @generated
	*/
	private final IElementType myElementType;

	/**
	* @generated
	*/
	protected GeneratorBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	* Extended request data key to hold editpart visual id.
	* Add visual id of edited editpart to extended data of the request
	* so command switch can decide what kind of diagram element is being edited.
	* It is done in those cases when it's not possible to deduce diagram
	* element kind from domain element.
	* 
	* @generated
	*/
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart().getModel();
			if (view instanceof View) {
				Integer id = new Integer(GeneratorVisualIDRegistry.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	* Returns visual id from request parameters.
	* @generated
	*/
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	* @generated
	*/
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest, semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	* @generated
	*/
	protected Command addDeleteViewCommand(Command mainCommand, DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand.chain(deleteViewCommand);
	}

	/**
	* @generated
	*/
	private Command getEditHelperCommand(IEditCommandRequest request, Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy
					? ((ICommandProxy) editPolicyCommand).getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, null);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(), command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	* @generated
	*/
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = GeneratorElementTypes.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType : myElementType;
	}

	/**
	* @generated
	*/
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	* @generated
	*/
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	* @generated
	*/
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	* @generated
	*/
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	* Returns editing domain from the host edit part.
	* @generated
	*/
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	* Clean all shortcuts to the host element from the same diagram
	* @generated
	*/
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() //$NON-NLS-1$
					|| nextView.getElement() != view.getElement()) {
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	* @generated
	*/
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = GeneratorDiagramEditorPlugin.getInstance().getLinkConstraints();
		if (cached == null) {
			GeneratorDiagramEditorPlugin.getInstance().setLinkConstraints(cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		* @generated
		*/
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateInitiallyHoldsAts_4006(Initially source, HoldsAt target) {
			if (source != null) {
				if (source.getHoldsAts().contains(target)) {
					return false;
				}
			}

			return canExistInitiallyHoldsAts_4006(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateHappensContextRelation_4009(Happens source, ContextRelation target) {
			if (source != null) {
				if (source.getContextRelation() != null) {
					return false;
				}
			}

			return canExistHappensContextRelation_4009(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateHoldsAtBetweenContextRelation_4003(HoldsAtBetween source, ContextRelation target) {
			if (source != null) {
				if (source.getContextRelation() != null) {
					return false;
				}
			}

			return canExistHoldsAtBetweenContextRelation_4003(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateInstanceType_4005(Instance source, Type target) {
			if (source != null) {
				if (source.getType() != null) {
					return false;
				}
			}

			return canExistInstanceType_4005(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateEventParameters_4002(Event source, Parameter target) {
			if (source != null) {
				if (source.getParameters().contains(target)) {
					return false;
				}
			}

			return canExistEventParameters_4002(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateInitiallyContextRelation_4010(Initially source, ContextRelation target) {
			if (source != null) {
				if (source.getContextRelation() != null) {
					return false;
				}
			}

			return canExistInitiallyContextRelation_4010(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateParameterType_4018(Parameter source, Type target) {
			if (source != null) {
				if (source.getType() != null) {
					return false;
				}
			}

			return canExistParameterType_4018(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateBehaviouralDescriptionHoldsAtBetweens_4007(BehaviouralDescription source,
				HoldsAtBetween target) {
			if (source != null) {
				if (source.getHoldsAtBetweens().contains(target)) {
					return false;
				}
			}

			return canExistBehaviouralDescriptionHoldsAtBetweens_4007(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateInitiallyHoldsAtBetweens_4015(Initially source, HoldsAtBetween target) {
			if (source != null) {
				if (source.getHoldsAtBetweens().contains(target)) {
					return false;
				}
			}

			return canExistInitiallyHoldsAtBetweens_4015(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateParameterInstance_4011(Parameter source, Instance target) {
			if (source != null) {
				if (source.getInstance() != null) {
					return false;
				}
			}

			return canExistParameterInstance_4011(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateBehaviouralDescriptionHappens_4013(BehaviouralDescription source, Happens target) {
			if (source != null) {
				if (source.getHappens().contains(target)) {
					return false;
				}
			}

			return canExistBehaviouralDescriptionHappens_4013(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateComplexEventBehaviouralDescriptions_4008(ComplexEvent source,
				BehaviouralDescription target) {
			if (source != null) {
				if (source.getBehaviouralDescriptions() != null) {
					return false;
				}
			}

			return canExistComplexEventBehaviouralDescriptions_4008(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateContextRelationParameters_4012(ContextRelation source, Parameter target) {
			if (source != null) {
				if (source.getParameters().contains(target)) {
					return false;
				}
			}

			return canExistContextRelationParameters_4012(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateContextRelationEndingComplexEvent_4001(ContextRelation source, ComplexEvent target) {
			if (source != null) {
				if (source.getEndingComplexEvent() != null) {
					return false;
				}
			}

			return canExistContextRelationEndingComplexEvent_4001(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateContextRelationInitialComplexEvent_4016(ContextRelation source, ComplexEvent target) {
			if (source != null) {
				if (source.getInitialComplexEvent() != null) {
					return false;
				}
			}

			return canExistContextRelationInitialComplexEvent_4016(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateBehaviouralDescriptionHoldsAts_4014(BehaviouralDescription source, HoldsAt target) {
			if (source != null) {
				if (source.getHoldsAts().contains(target)) {
					return false;
				}
			}

			return canExistBehaviouralDescriptionHoldsAts_4014(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateInitiallyHappens_4004(Initially source, Happens target) {
			if (source != null) {
				if (source.getHappens().contains(target)) {
					return false;
				}
			}

			return canExistInitiallyHappens_4004(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateHoldsAtContextRelation_4017(HoldsAt source, ContextRelation target) {
			if (source != null) {
				if (source.getContextRelation() != null) {
					return false;
				}
			}

			return canExistHoldsAtContextRelation_4017(source, target);
		}

		/**
		* @generated
		*/
		public boolean canExistInitiallyHoldsAts_4006(Initially source, HoldsAt target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistHappensContextRelation_4009(Happens source, ContextRelation target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistHoldsAtBetweenContextRelation_4003(HoldsAtBetween source, ContextRelation target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistInstanceType_4005(Instance source, Type target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistEventParameters_4002(Event source, Parameter target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistInitiallyContextRelation_4010(Initially source, ContextRelation target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistParameterType_4018(Parameter source, Type target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistBehaviouralDescriptionHoldsAtBetweens_4007(BehaviouralDescription source,
				HoldsAtBetween target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistInitiallyHoldsAtBetweens_4015(Initially source, HoldsAtBetween target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistParameterInstance_4011(Parameter source, Instance target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistBehaviouralDescriptionHappens_4013(BehaviouralDescription source, Happens target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistComplexEventBehaviouralDescriptions_4008(ComplexEvent source,
				BehaviouralDescription target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistContextRelationParameters_4012(ContextRelation source, Parameter target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistContextRelationEndingComplexEvent_4001(ContextRelation source, ComplexEvent target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistContextRelationInitialComplexEvent_4016(ContextRelation source, ComplexEvent target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistBehaviouralDescriptionHoldsAts_4014(BehaviouralDescription source, HoldsAt target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistInitiallyHappens_4004(Initially source, Happens target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistHoldsAtContextRelation_4017(HoldsAt source, ContextRelation target) {
			return true;
		}
	}

}
