package model.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import model.diagram.edit.policies.ParameterInstanceItemSemanticEditPolicy;

/**
 * @generated
 */
public class ParameterInstanceEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4011;

	/**
	* @generated
	*/
	public ParameterInstanceEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ParameterInstanceItemSemanticEditPolicy());
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
		return new ParameterFigure();
	}

	/**
	* @generated
	*/
	public ParameterFigure getPrimaryShape() {
		return (ParameterFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ParameterFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureParameterNumberFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureParameterNameFigure;

		/**
		 * @generated
		 */
		public ParameterFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureParameterNumberFigure = new WrappingLabel();

			fFigureParameterNumberFigure.setText("<...>");

			this.add(fFigureParameterNumberFigure);

			fFigureParameterNameFigure = new WrappingLabel();

			fFigureParameterNameFigure.setText("<...>");

			this.add(fFigureParameterNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureParameterNumberFigure() {
			return fFigureParameterNumberFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureParameterNameFigure() {
			return fFigureParameterNameFigure;
		}

	}

}
