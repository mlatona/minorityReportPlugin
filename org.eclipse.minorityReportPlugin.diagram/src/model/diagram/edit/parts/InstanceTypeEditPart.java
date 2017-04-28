package model.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import model.diagram.edit.policies.InstanceTypeItemSemanticEditPolicy;

/**
 * @generated
 */
public class InstanceTypeEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4005;

	/**
	* @generated
	*/
	public InstanceTypeEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new InstanceTypeItemSemanticEditPolicy());
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
		return new InstanceFigure();
	}

	/**
	* @generated
	*/
	public InstanceFigure getPrimaryShape() {
		return (InstanceFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class InstanceFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureInstanceNameFigure;

		/**
		 * @generated
		 */
		public InstanceFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureInstanceNameFigure = new WrappingLabel();

			fFigureInstanceNameFigure.setText("<...>");

			this.add(fFigureInstanceNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInstanceNameFigure() {
			return fFigureInstanceNameFigure;
		}

	}

}
