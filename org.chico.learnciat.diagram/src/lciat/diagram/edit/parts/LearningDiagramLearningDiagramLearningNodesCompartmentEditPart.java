/*
 * 
 */
package lciat.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import lciat.diagram.edit.policies.LearningDiagramLearningDiagramLearningNodesCompartmentCanonicalEditPolicy;
import lciat.diagram.edit.policies.LearningDiagramLearningDiagramLearningNodesCompartmentItemSemanticEditPolicy;
import lciat.diagram.part.LciatVisualIDRegistry;
import lciat.diagram.part.Messages;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class LearningDiagramLearningDiagramLearningNodesCompartmentEditPart extends ShapeCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 7003;

	/**
	* @generated
	*/
	public LearningDiagramLearningDiagramLearningNodesCompartmentEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	public String getCompartmentName() {
		return Messages.LearningDiagramLearningDiagramLearningNodesCompartmentEditPart_title;
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
				new LearningDiagramLearningDiagramLearningNodesCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(LciatVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new LearningDiagramLearningDiagramLearningNodesCompartmentCanonicalEditPolicy());
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
			if (type == LciatElementTypes.IndividualTask_3026) {
				return this;
			}
			if (type == LciatElementTypes.GroupTask_3046) {
				return this;
			}
			if (type == LciatElementTypes.AbstractTask_3061) {
				return this;
			}
			if (type == LciatElementTypes.DetailedAbstractTask_3076) {
				return this;
			}
			if (type == LciatElementTypes.SessionPanel_3094) {
				return this;
			}
			if (type == LciatElementTypes.Chat_3095) {
				return this;
			}
			if (type == LciatElementTypes.TurnTakingTool_3096) {
				return this;
			}
			if (type == LciatElementTypes.Telepointer_3097) {
				return this;
			}
			if (type == LciatElementTypes.RadarView_3098) {
				return this;
			}
			if (type == LciatElementTypes.Properties_3099) {
				return this;
			}
			if (type == LciatElementTypes.Console_3100) {
				return this;
			}
			if (type == LciatElementTypes.Problems_3101) {
				return this;
			}
			if (type == LciatElementTypes.Init_3102) {
				return this;
			}
			if (type == LciatElementTypes.End_3103) {
				return this;
			}
			if (type == LciatElementTypes.TemporalCondition_3104) {
				return this;
			}
			if (type == LciatElementTypes.Notification_3105) {
				return this;
			}
			if (type == LciatElementTypes.Condition_3106) {
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			if (RequestConstants.REQ_CONNECTION_END.equals(request.getType())) {
				for (Object type : ((CreateUnspecifiedTypeConnectionRequest) request).getElementTypes()) {
					if (type instanceof IElementType) {
						IElementType elementType = (IElementType) type;
						if (elementType.equals(LciatElementTypes.EnablingWOInformation_4004)
								|| elementType.equals(LciatElementTypes.EnablingWInformation_4005)
								|| elementType.equals(LciatElementTypes.Choice_4006)
								|| elementType.equals(LciatElementTypes.Concurrency_4007))
							return super.getTargetEditPart(request);
					}
				}
			}
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
