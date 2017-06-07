package behavDesc.model.diagram.edit.parts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.minorityReportPlugin.ui.figures.BehaviouralDescriptionFigure;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ListDialog;

import behavDesc.model.diagram.part.ModelDiagramEditor;
import model.Happens;
import model.ModelPackage;
import model.impl.HappensImpl;

/**
 * @generated
 */
public class BehaviouralDescriptionEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2001;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	private ModelDiagramEditor editor;

	private TransactionalEditingDomain editingDomain;
	/**
	* @generated NOT
	*/
	public BehaviouralDescriptionEditPart(View view) {
		super(view);
		editor = (ModelDiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		editingDomain = editor.getEditingDomain();;
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new behavDesc.model.diagram.edit.policies.BehaviouralDescriptionItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated NOT
	*/
	protected IFigure createNodeShape(RectangleFigure r) {
		return primaryShape = new BehaviouralDescriptionFigure(r);
	}

	/**
	* @generated NOT
	*/
	public BehaviouralDescriptionFigure getPrimaryShape() {
		return (BehaviouralDescriptionFigure) primaryShape;
	}

	/**
	* @generated NOT
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated NOT
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		RectangleFigure r = new RectangleFigure();
		r.setLineWidth(5);
		r.setSize(200, 120);
		figure.add(r);
		IFigure shape = createNodeShape(r);
		figure.add(shape);
		contentPane = setupContentPane(shape);

		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	@Override
	public void performRequest(Request req) {
		if (req.getType() == RequestConstants.REQ_OPEN) {
			ElementListSelectionDialog dialog = new ElementListSelectionDialog(null, new LabelProvider());
			dialog.setElements(new String[] { "Happens", "Holds at", "Holds at between", "Not holds at between" });
			dialog.setMultipleSelection(false);
			dialog.setTitle("Which predicate do you want to select");
			// user pressed cancel
			if (dialog.open() != Window.OK) {
				return;
			}
			String predicateSelection = (String) dialog.getResult()[0];

			switch (predicateSelection) {
			case "Happens": {
				getPrimaryShape().setHappens();
				try {
					// Parsing event file
					LoadEvents loadEvents = new LoadEvents();

					// Creating second dialog
					ElementListSelectionDialog showEventsDialog = new ElementListSelectionDialog(null,
							new LabelProvider());
					String[] eventsNameArray = new String[loadEvents.getEnvironment().getEvents().size()];
					for (int i = 0; i < loadEvents.getEnvironment().getEvents().size(); i++) {
						eventsNameArray[i] = loadEvents.getEnvironment().getEvents().get(i).getName();
					}
					showEventsDialog.setElements(eventsNameArray);
					showEventsDialog.setMultipleSelection(false);
					showEventsDialog.setTitle("Select an event");
					// user pressed cancel
					if (showEventsDialog.open() != Window.OK) {
						return;
					}

					String eventSelection = (String) showEventsDialog.getResult()[0];
					System.out.println("event selected: " + eventSelection);

					// Creating third dialog
					int timeSelection = createTimeInstantsDialog();

					// Creating Happens

					Command cmd = editor.createAndExecuteShapeRequestCommand(
							behavDesc.model.diagram.providers.ModelElementTypes.Happens_2002,
							editor.getDiagramEditPart());
					editor.getDiagramEditPart().getDiagramEditDomain().getDiagramCommandStack();
					//	SetRequest setRequest = new SetRequest(editingDomain, comp, org.eclipse.minorityReportPlugin.model.eINSTANCE.getClassOne_Name(), name);
					//SetRequest setRequest = new SetRequest(editingDomain, null, null, model);
					//setRequest.setParameter("oldValue", comp.getName());
					Collection<?> results = DiagramCommandStack.getReturnValues(cmd);
						
					Iterator<?> iter = results.iterator();
					
					while (iter.hasNext()){
						Object obj = iter.next();
						
						if (obj instanceof CreateElementRequestAdapter){
							
							CreateElementRequestAdapter cra = (CreateElementRequestAdapter) obj;
							Happens newHappens;
							
							newHappens = (HappensImpl) cra.resolve();
							
							SetRequest setRequest = new SetRequest(editor.getEditingDomain(), newHappens, ModelPackage.eINSTANCE.getHappens_Time(), timeSelection);
							SetValueCommand operation = new SetValueCommand(setRequest);
							editor.getDiagramEditDomain().getDiagramCommandStack().execute(new 
									ICommandProxy(operation));
							
							System.out.println("Time instant set");
						}
						System.out.println(iter.next().toString());
					
					}
			
					System.out.println("DONE");

				} catch (IOException e) {
					e.printStackTrace();
				}
			} // Happens
				break;

			case "Holds at": {
				getPrimaryShape().setHoldsAt();

			} // Holds at
				break;

			case "Holds at between": {
				getPrimaryShape().setHoldsAtBetween();
			} // Holds at between
				break;

			case "Not holds at between": {
				getPrimaryShape().setNotHoldsAtBetween();
			} // Not holds at between
				break;

			}

		}
	}

	public int createTimeInstantsDialog() {
		// Creating third dialog
		ElementListSelectionDialog timeInstantDialog = new ElementListSelectionDialog(null, new LabelProvider());
		String[] timeInstantsArray = new String[getPrimaryShape().getTimeInstants()];
		for (int i = 0; i < getPrimaryShape().getTimeInstants(); i++) {
			timeInstantsArray[i] = Integer.toString(i + 1);
		}
		timeInstantDialog.setElements(timeInstantsArray);
		timeInstantDialog.setMultipleSelection(false);
		timeInstantDialog.setTitle("Select a time instant");
		// user pressed cancel
		if (timeInstantDialog.open() != Window.OK) {
			return -1;
		}
		String timeSelection = (String) timeInstantDialog.getResult()[0];
		System.out.println("time selected: " + timeSelection);

		return Integer.parseInt(timeSelection);
	}

}
