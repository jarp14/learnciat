/*
* 
*/
package lciat.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import lciat.diagram.edit.commands.ChoiceCreateCommand;
import lciat.diagram.edit.commands.ChoiceReorientCommand;
import lciat.diagram.edit.commands.ConcurrencyCreateCommand;
import lciat.diagram.edit.commands.ConcurrencyReorientCommand;
import lciat.diagram.edit.commands.EnablingWInformationCreateCommand;
import lciat.diagram.edit.commands.EnablingWInformationReorientCommand;
import lciat.diagram.edit.commands.EnablingWOInformationCreateCommand;
import lciat.diagram.edit.commands.EnablingWOInformationReorientCommand;
import lciat.diagram.edit.parts.ChoiceEditPart;
import lciat.diagram.edit.parts.ConcurrencyEditPart;
import lciat.diagram.edit.parts.EnablingWInformationEditPart;
import lciat.diagram.edit.parts.EnablingWOInformationEditPart;
import lciat.diagram.part.LciatVisualIDRegistry;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class End2ItemSemanticEditPolicy extends LciatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public End2ItemSemanticEditPolicy() {
		super(LciatElementTypes.End_3103);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (LciatVisualIDRegistry.getVisualID(incomingLink) == EnablingWOInformationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(incomingLink) == EnablingWInformationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(incomingLink) == ChoiceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(incomingLink) == ConcurrencyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (LciatVisualIDRegistry.getVisualID(outgoingLink) == EnablingWOInformationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(outgoingLink) == EnablingWInformationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(outgoingLink) == ChoiceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(outgoingLink) == ConcurrencyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (LciatElementTypes.EnablingWOInformation_4004 == req.getElementType()) {
			return getGEFWrapper(new EnablingWOInformationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.EnablingWInformation_4005 == req.getElementType()) {
			return getGEFWrapper(new EnablingWInformationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.Choice_4006 == req.getElementType()) {
			return getGEFWrapper(new ChoiceCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.Concurrency_4007 == req.getElementType()) {
			return getGEFWrapper(new ConcurrencyCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (LciatElementTypes.EnablingWOInformation_4004 == req.getElementType()) {
			return getGEFWrapper(new EnablingWOInformationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.EnablingWInformation_4005 == req.getElementType()) {
			return getGEFWrapper(new EnablingWInformationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.Choice_4006 == req.getElementType()) {
			return getGEFWrapper(new ChoiceCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.Concurrency_4007 == req.getElementType()) {
			return getGEFWrapper(new ConcurrencyCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case EnablingWOInformationEditPart.VISUAL_ID:
			return getGEFWrapper(new EnablingWOInformationReorientCommand(req));
		case EnablingWInformationEditPart.VISUAL_ID:
			return getGEFWrapper(new EnablingWInformationReorientCommand(req));
		case ChoiceEditPart.VISUAL_ID:
			return getGEFWrapper(new ChoiceReorientCommand(req));
		case ConcurrencyEditPart.VISUAL_ID:
			return getGEFWrapper(new ConcurrencyReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
