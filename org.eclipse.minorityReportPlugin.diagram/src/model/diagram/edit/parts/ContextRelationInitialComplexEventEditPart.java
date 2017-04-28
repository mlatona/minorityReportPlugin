package model.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import model.diagram.edit.policies.ContextRelationInitialComplexEventItemSemanticEditPolicy;

/**
 * @generated
 */
public class ContextRelationInitialComplexEventEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4016;

	/**
	* @generated
	*/
	public ContextRelationInitialComplexEventEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ContextRelationInitialComplexEventItemSemanticEditPolicy());
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
		return new ContextRelationFigure();
	}

	/**
	* @generated
	*/
	public ContextRelationFigure getPrimaryShape() {
		return (ContextRelationFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ContextRelationFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureContextRelationNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureContextRelationValueFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureContextRelationTimeFigure;

		/**
		 * @generated
		 */
		public ContextRelationFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureContextRelationNameFigure = new WrappingLabel();

			fFigureContextRelationNameFigure.setText("<...>");

			this.add(fFigureContextRelationNameFigure);

			fFigureContextRelationValueFigure = new WrappingLabel();

			fFigureContextRelationValueFigure.setText("<...>");

			this.add(fFigureContextRelationValueFigure);

			fFigureContextRelationTimeFigure = new WrappingLabel();

			fFigureContextRelationTimeFigure.setText("<...>");

			this.add(fFigureContextRelationTimeFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureContextRelationNameFigure() {
			return fFigureContextRelationNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureContextRelationValueFigure() {
			return fFigureContextRelationValueFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureContextRelationTimeFigure() {
			return fFigureContextRelationTimeFigure;
		}

	}

}
