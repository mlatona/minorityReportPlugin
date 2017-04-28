package model.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import model.diagram.edit.policies.ComplexEventBehaviouralDescriptionsItemSemanticEditPolicy;

/**
 * @generated
 */
public class ComplexEventBehaviouralDescriptionsEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4008;

	/**
	* @generated
	*/
	public ComplexEventBehaviouralDescriptionsEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ComplexEventBehaviouralDescriptionsItemSemanticEditPolicy());
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/

	protected Connection createConnectionFigure() {
		return new ComplexEventFigure();
	}

	/**
	* @generated
	*/
	public ComplexEventFigure getPrimaryShape() {
		return (ComplexEventFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ComplexEventFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureComplexEventNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureComplexEventTimeFigure;

		/**
		 * @generated
		 */
		public ComplexEventFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureComplexEventNameFigure = new WrappingLabel();

			fFigureComplexEventNameFigure.setText("<...>");

			this.add(fFigureComplexEventNameFigure);

			fFigureComplexEventTimeFigure = new WrappingLabel();

			fFigureComplexEventTimeFigure.setText("<...>");

			this.add(fFigureComplexEventTimeFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureComplexEventNameFigure() {
			return fFigureComplexEventNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureComplexEventTimeFigure() {
			return fFigureComplexEventTimeFigure;
		}

	}

}
