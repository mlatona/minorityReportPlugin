package model.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import model.diagram.edit.policies.ContextRelationInitialComplexEventItemSemanticEditPolicy;

/**
 * @generated
 */
public class ContextRelationInitialComplexEventEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4017;

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
		return new ContextRelationInitialComplexEventFigure();
	}

	/**
	* @generated
	*/
	public ContextRelationInitialComplexEventFigure getPrimaryShape() {
		return (ContextRelationInitialComplexEventFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ContextRelationInitialComplexEventFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public ContextRelationInitialComplexEventFigure() {

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
