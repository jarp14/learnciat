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

import lciat.diagram.edit.policies.CTTDiagramCTTDiagramCttTasksCompartmentCanonicalEditPolicy;
import lciat.diagram.edit.policies.CTTDiagramCTTDiagramCttTasksCompartmentItemSemanticEditPolicy;
import lciat.diagram.part.LciatVisualIDRegistry;
import lciat.diagram.part.Messages;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class CTTDiagramCTTDiagramCttTasksCompartmentEditPart extends ShapeCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 7031;

	/**
	* @generated
	*/
	public CTTDiagramCTTDiagramCttTasksCompartmentEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	public String getCompartmentName() {
		return Messages.CTTDiagramCTTDiagramCttTasksCompartmentEditPart_title;
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
				new CTTDiagramCTTDiagramCttTasksCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(LciatVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new CTTDiagramCTTDiagramCttTasksCompartmentCanonicalEditPolicy());
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
			if (type == LciatElementTypes.ExclusiveEdition_3114) {
				return this;
			}
			if (type == LciatElementTypes.CollaborativeVisualization_3115) {
				return this;
			}
			if (type == LciatElementTypes.IndividualVisualization_3116) {
				return this;
			}
			if (type == LciatElementTypes.UserTask_3117) {
				return this;
			}
			if (type == LciatElementTypes.CTTAbstractTask_3118) {
				return this;
			}
			if (type == LciatElementTypes.InteractiveTask_3119) {
				return this;
			}
			if (type == LciatElementTypes.CTTCollaborativeTask_3120) {
				return this;
			}
			if (type == LciatElementTypes.ApplicationTask_3121) {
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			if (RequestConstants.REQ_CONNECTION_END.equals(request.getType())) {
				for (Object type : ((CreateUnspecifiedTypeConnectionRequest) request).getElementTypes()) {
					if (type instanceof IElementType) {
						IElementType elementType = (IElementType) type;
						if (elementType.equals(LciatElementTypes.Aggregation_4008)
								|| elementType.equals(LciatElementTypes.Enabling_4009)
								|| elementType.equals(LciatElementTypes.Disabling_4010)
								|| elementType.equals(LciatElementTypes.EnablingWithInformationPassing_4011)
								|| elementType.equals(LciatElementTypes.DisablingWithInformationPassing_4012)
								|| elementType.equals(LciatElementTypes.IndependentConcurrency_4013)
								|| elementType.equals(LciatElementTypes.OrderIndependence_4014)
								|| elementType.equals(LciatElementTypes.SuspendResume_4015)
								|| elementType.equals(LciatElementTypes.ConcurrencyWithInformationPassing_4016)
								|| elementType.equals(LciatElementTypes.DeterministicChoice_4017)
								|| elementType.equals(LciatElementTypes.UndeterministicChoice_4018))
							return super.getTargetEditPart(request);
					}
				}
			}
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
