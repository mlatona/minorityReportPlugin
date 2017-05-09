package model.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import model.diagram.edit.policies.HoldsAtBetweenContextRelationItemSemanticEditPolicy;

/**
 * @generated
 */
public class HoldsAtBetweenContextRelationEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4013;

	/**
	* @generated
	*/
	public HoldsAtBetweenContextRelationEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new HoldsAtBetweenContextRelationItemSemanticEditPolicy());
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
		return new HoldsAtBetweenContextRelationFigure();
	}

	/**
	* @generated
	*/
	public HoldsAtBetweenContextRelationFigure getPrimaryShape() {
		return (HoldsAtBetweenContextRelationFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class HoldsAtBetweenContextRelationFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public HoldsAtBetweenContextRelationFigure() {

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
