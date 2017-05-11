package general.model.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import general.model.diagram.edit.policies.BehaviouralDescriptionHappensItemSemanticEditPolicy;

/**
 * @generated
 */
public class BehaviouralDescriptionHappensEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4017;

	/**
	* @generated
	*/
	public BehaviouralDescriptionHappensEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new BehaviouralDescriptionHappensItemSemanticEditPolicy());
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
		return new BehaviouralDescriptionHappensFigure();
	}

	/**
	* @generated
	*/
	public BehaviouralDescriptionHappensFigure getPrimaryShape() {
		return (BehaviouralDescriptionHappensFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class BehaviouralDescriptionHappensFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public BehaviouralDescriptionHappensFigure() {

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
