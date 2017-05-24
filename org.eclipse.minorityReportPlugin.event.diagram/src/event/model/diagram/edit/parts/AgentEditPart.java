package event.model.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.lite.svg.SVGFigure;
import org.eclipse.gmf.runtime.lite.svg.SVGUtils;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import event.model.diagram.edit.policies.AgentItemSemanticEditPolicy;
import event.model.diagram.part.ModelVisualIDRegistry;

/**
 * @generated
 */
public class AgentEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2007;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public AgentEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new AgentItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new AgentFigure();
	}

	/**
	* @generated
	*/
	public AgentFigure getPrimaryShape() {
		return (AgentFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AgentNameEditPart) {
			((AgentNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureAgentName());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AgentNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	* @generated
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
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
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
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
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

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(ModelVisualIDRegistry.getType(AgentNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class AgentFigure extends SVGFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAgentName;

		/**
		 * @generated
		 */
		public AgentFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			this.setURI("platform:/plugin/org.eclipse.minorityReportPlugin.event.diagram/icons/agent.svg");
			this.setForegroundColor(ColorConstants.blue);
			this.setBackgroundColor(THIS_BACK);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureAgentName = new WrappingLabel();

			fFigureAgentName.setText("--AGENT NAME HERE--");

			this.add(fFigureAgentName);

		}

		/**
		 * @generated
		 */
		public Color getBackgroundColor() {
			NodeList nodes = getNodes("//:circle|//:polygon"); //$NON-NLS-1$
			if (nodes.getLength() > 0) {
				Element element = (Element) nodes.item(0);
				return getColor(element, "fill"); //$NON-NLS-1$
			}
			return null;
		}

		/**
		 * @generated
		 */
		public void setBackgroundColor(Color value) {
			String svalue = SVGUtils.toSVGColor(getDocument(), value);
			NodeList nodes = getNodes("//:circle|//:polygon"); //$NON-NLS-1$
			for (int i = 0; i < nodes.getLength(); i++) {
				((Element) nodes.item(i)).setAttributeNS(null, "fill", //$NON-NLS-1$
						svalue);
			}
			super.setBackgroundColor(value);
		}

		/**
		 * @generated
		 */
		public Color getForegroundColor() {
			NodeList nodes = getNodes("//:polygon"); //$NON-NLS-1$
			if (nodes.getLength() > 0) {
				Element element = (Element) nodes.item(0);
				return getColor(element, "stroke"); //$NON-NLS-1$
			}
			return null;
		}

		/**
		 * @generated
		 */
		public void setForegroundColor(Color value) {
			String svalue = SVGUtils.toSVGColor(getDocument(), value);
			NodeList nodes = getNodes("//:polygon"); //$NON-NLS-1$
			for (int i = 0; i < nodes.getLength(); i++) {
				((Element) nodes.item(i)).setAttributeNS(null, "stroke", //$NON-NLS-1$
						svalue);
			}
			super.setForegroundColor(value);
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAgentName() {
			return fFigureAgentName;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 18, 178, 178);

}
