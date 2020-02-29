/*
 * 
 */
package lciat.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import lciat.diagram.edit.policies.LearningDiagramLearningDiagramMfLearningNodesCompartmentCanonicalEditPolicy;
import lciat.diagram.edit.policies.LearningDiagramLearningDiagramMfLearningNodesCompartmentItemSemanticEditPolicy;
import lciat.diagram.part.LciatVisualIDRegistry;
import lciat.diagram.part.Messages;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart extends ListCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 7004;

	/**
	* @generated
	*/
	public LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected boolean hasModelChildrenChanged(Notification evt) {
		return false;
	}

	/**
	* @generated
	*/
	public String getCompartmentName() {
		return Messages.LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart_title;
	}

	/**
	* @generated
	*/
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new LearningDiagramLearningDiagramMfLearningNodesCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(LciatVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new LearningDiagramLearningDiagramMfLearningNodesCompartmentCanonicalEditPolicy());
	}

	/**
	* @generated
	*/
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == LciatElementTypes.MolefTActivities1_3009) {
				return this;
			}
			if (type == LciatElementTypes.MolefTActivities2_3010) {
				return this;
			}
			if (type == LciatElementTypes.MolefTActivities3_3011) {
				return this;
			}
			if (type == LciatElementTypes.MolefTActivities4_3012) {
				return this;
			}
			if (type == LciatElementTypes.MolefTActivities5_3013) {
				return this;
			}
			if (type == LciatElementTypes.MolefTActivities6_3014) {
				return this;
			}
			if (type == LciatElementTypes.MolefTActivities7_3015) {
				return this;
			}
			if (type == LciatElementTypes.MolefTActivities8_3016) {
				return this;
			}
			if (type == LciatElementTypes.MolefSocial1_3017) {
				return this;
			}
			if (type == LciatElementTypes.MolefSocial2_3018) {
				return this;
			}
			if (type == LciatElementTypes.MolefSocial3_3019) {
				return this;
			}
			if (type == LciatElementTypes.MolefSocial4_3020) {
				return this;
			}
			if (type == LciatElementTypes.MolefPersonalization1_3021) {
				return this;
			}
			if (type == LciatElementTypes.MolefPersonalization2_3022) {
				return this;
			}
			if (type == LciatElementTypes.MolefPersonalization3_3023) {
				return this;
			}
			if (type == LciatElementTypes.MolefPersonalization4_3024) {
				return this;
			}
			if (type == LciatElementTypes.MolefPersonalization5_3025) {
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
