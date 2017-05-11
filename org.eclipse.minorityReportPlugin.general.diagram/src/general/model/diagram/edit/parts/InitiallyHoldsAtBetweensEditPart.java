package general.model.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import general.model.diagram.edit.policies.InitiallyHoldsAtBetweensItemSemanticEditPolicy;

/**
 * @generated
 */
public class InitiallyHoldsAtBetweensEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4009;

	/**
	* @generated
	*/
	public InitiallyHoldsAtBetweensEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new InitiallyHoldsAtBetweensItemSemanticEditPolicy());
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
		return new InitiallyHoldsAtBetweensFigure();
	}

	/**
	* @generated
	*/
	public InitiallyHoldsAtBetweensFigure getPrimaryShape() {
		return (InitiallyHoldsAtBetweensFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class InitiallyHoldsAtBetweensFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public InitiallyHoldsAtBetweensFigure() {

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

	}

}
