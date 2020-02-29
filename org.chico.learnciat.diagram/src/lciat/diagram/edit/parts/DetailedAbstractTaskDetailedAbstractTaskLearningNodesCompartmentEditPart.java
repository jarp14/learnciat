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

import lciat.diagram.edit.policies.DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentCanonicalEditPolicy;
import lciat.diagram.edit.policies.DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentItemSemanticEditPolicy;
import lciat.diagram.part.LciatVisualIDRegistry;
import lciat.diagram.part.Messages;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart extends ShapeCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 7017;

	/**
	* @generated
	*/
	public DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	public String getCompartmentName() {
		return Messages.DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart_title;
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
				new DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(LciatVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentCanonicalEditPolicy());
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
			if (type == LciatElementTypes.IndividualTask_3077) {
				return this;
			}
			if (type == LciatElementTypes.GroupTask_3078) {
				return this;
			}
			if (type == LciatElementTypes.AbstractTask_3079) {
				return this;
			}
			if (type == LciatElementTypes.DetailedAbstractTask_3080) {
				return this;
			}
			if (type == LciatElementTypes.SessionPanel_3081) {
				return this;
			}
			if (type == LciatElementTypes.Chat_3082) {
				return this;
			}
			if (type == LciatElementTypes.TurnTakingTool_3083) {
				return this;
			}
			if (type == LciatElementTypes.Telepointer_3084) {
				return this;
			}
			if (type == LciatElementTypes.RadarView_3085) {
				return this;
			}
			if (type == LciatElementTypes.Properties_3086) {
				return this;
			}
			if (type == LciatElementTypes.Console_3087) {
				return this;
			}
			if (type == LciatElementTypes.Problems_3088) {
				return this;
			}
			if (type == LciatElementTypes.Init_3089) {
				return this;
			}
			if (type == LciatElementTypes.End_3090) {
				return this;
			}
			if (type == LciatElementTypes.TemporalCondition_3091) {
				return this;
			}
			if (type == LciatElementTypes.Notification_3092) {
				return this;
			}
			if (type == LciatElementTypes.Condition_3093) {
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
