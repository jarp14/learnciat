/*
 * 
 */
package lciat.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import lciat.diagram.edit.policies.AbstractTaskAbstractTaskSubtypeCompartmentCanonicalEditPolicy;
import lciat.diagram.edit.policies.AbstractTaskAbstractTaskSubtypeCompartmentItemSemanticEditPolicy;
import lciat.diagram.part.LciatVisualIDRegistry;
import lciat.diagram.part.Messages;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class AbstractTaskAbstractTaskSubtypeCompartmentEditPart extends ListCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 7015;

	/**
	* @generated
	*/
	public AbstractTaskAbstractTaskSubtypeCompartmentEditPart(View view) {
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
		return Messages.AbstractTaskAbstractTaskSubtypeCompartmentEditPart_title;
	}

	/**
	* @generated
	*/
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
		result.setTitleVisibility(false);
		result.setBorder(null);
		return result;
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AbstractTaskAbstractTaskSubtypeCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(LciatVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new AbstractTaskAbstractTaskSubtypeCompartmentCanonicalEditPolicy());
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
			if (type == LciatElementTypes.Assimilative_3064) {
				return this;
			}
			if (type == LciatElementTypes.InformationHandling_3065) {
				return this;
			}
			if (type == LciatElementTypes.Adaptive_3066) {
				return this;
			}
			if (type == LciatElementTypes.Communicative_3067) {
				return this;
			}
			if (type == LciatElementTypes.Productive_3068) {
				return this;
			}
			if (type == LciatElementTypes.Experiential_3069) {
				return this;
			}
			if (type == LciatElementTypes.Evaluative_3070) {
				return this;
			}
			if (type == LciatElementTypes.Support_3071) {
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
