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

import lciat.diagram.edit.commands.AggregationCreateCommand;
import lciat.diagram.edit.commands.AggregationReorientCommand;
import lciat.diagram.edit.commands.ConcurrencyWithInformationPassingCreateCommand;
import lciat.diagram.edit.commands.ConcurrencyWithInformationPassingReorientCommand;
import lciat.diagram.edit.commands.DeterministicChoiceCreateCommand;
import lciat.diagram.edit.commands.DeterministicChoiceReorientCommand;
import lciat.diagram.edit.commands.DisablingCreateCommand;
import lciat.diagram.edit.commands.DisablingReorientCommand;
import lciat.diagram.edit.commands.DisablingWithInformationPassingCreateCommand;
import lciat.diagram.edit.commands.DisablingWithInformationPassingReorientCommand;
import lciat.diagram.edit.commands.EnablingCreateCommand;
import lciat.diagram.edit.commands.EnablingReorientCommand;
import lciat.diagram.edit.commands.EnablingWithInformationPassingCreateCommand;
import lciat.diagram.edit.commands.EnablingWithInformationPassingReorientCommand;
import lciat.diagram.edit.commands.IndependentConcurrencyCreateCommand;
import lciat.diagram.edit.commands.IndependentConcurrencyReorientCommand;
import lciat.diagram.edit.commands.OrderIndependenceCreateCommand;
import lciat.diagram.edit.commands.OrderIndependenceReorientCommand;
import lciat.diagram.edit.commands.SuspendResumeCreateCommand;
import lciat.diagram.edit.commands.SuspendResumeReorientCommand;
import lciat.diagram.edit.commands.UndeterministicChoiceCreateCommand;
import lciat.diagram.edit.commands.UndeterministicChoiceReorientCommand;
import lciat.diagram.edit.parts.AggregationEditPart;
import lciat.diagram.edit.parts.ConcurrencyWithInformationPassingEditPart;
import lciat.diagram.edit.parts.DeterministicChoiceEditPart;
import lciat.diagram.edit.parts.DisablingEditPart;
import lciat.diagram.edit.parts.DisablingWithInformationPassingEditPart;
import lciat.diagram.edit.parts.EnablingEditPart;
import lciat.diagram.edit.parts.EnablingWithInformationPassingEditPart;
import lciat.diagram.edit.parts.IndependentConcurrencyEditPart;
import lciat.diagram.edit.parts.OrderIndependenceEditPart;
import lciat.diagram.edit.parts.SuspendResumeEditPart;
import lciat.diagram.edit.parts.UndeterministicChoiceEditPart;
import lciat.diagram.part.LciatVisualIDRegistry;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class CTTCollaborativeTaskItemSemanticEditPolicy extends LciatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CTTCollaborativeTaskItemSemanticEditPolicy() {
		super(LciatElementTypes.CTTCollaborativeTask_3120);
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
			if (LciatVisualIDRegistry.getVisualID(incomingLink) == AggregationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(incomingLink) == EnablingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(incomingLink) == DisablingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(incomingLink) == EnablingWithInformationPassingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(incomingLink) == DisablingWithInformationPassingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(incomingLink) == IndependentConcurrencyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(incomingLink) == OrderIndependenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(incomingLink) == SuspendResumeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (LciatVisualIDRegistry
					.getVisualID(incomingLink) == ConcurrencyWithInformationPassingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(incomingLink) == DeterministicChoiceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(incomingLink) == UndeterministicChoiceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (LciatVisualIDRegistry.getVisualID(outgoingLink) == AggregationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(outgoingLink) == EnablingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(outgoingLink) == DisablingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(outgoingLink) == EnablingWithInformationPassingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(outgoingLink) == DisablingWithInformationPassingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(outgoingLink) == IndependentConcurrencyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(outgoingLink) == OrderIndependenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(outgoingLink) == SuspendResumeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (LciatVisualIDRegistry
					.getVisualID(outgoingLink) == ConcurrencyWithInformationPassingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(outgoingLink) == DeterministicChoiceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(outgoingLink) == UndeterministicChoiceEditPart.VISUAL_ID) {
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
		if (LciatElementTypes.Aggregation_4008 == req.getElementType()) {
			return getGEFWrapper(new AggregationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.Enabling_4009 == req.getElementType()) {
			return getGEFWrapper(new EnablingCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.Disabling_4010 == req.getElementType()) {
			return getGEFWrapper(new DisablingCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.EnablingWithInformationPassing_4011 == req.getElementType()) {
			return getGEFWrapper(
					new EnablingWithInformationPassingCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.DisablingWithInformationPassing_4012 == req.getElementType()) {
			return getGEFWrapper(
					new DisablingWithInformationPassingCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.IndependentConcurrency_4013 == req.getElementType()) {
			return getGEFWrapper(new IndependentConcurrencyCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.OrderIndependence_4014 == req.getElementType()) {
			return getGEFWrapper(new OrderIndependenceCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.SuspendResume_4015 == req.getElementType()) {
			return getGEFWrapper(new SuspendResumeCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.ConcurrencyWithInformationPassing_4016 == req.getElementType()) {
			return getGEFWrapper(
					new ConcurrencyWithInformationPassingCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.DeterministicChoice_4017 == req.getElementType()) {
			return getGEFWrapper(new DeterministicChoiceCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.UndeterministicChoice_4018 == req.getElementType()) {
			return getGEFWrapper(new UndeterministicChoiceCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (LciatElementTypes.Aggregation_4008 == req.getElementType()) {
			return getGEFWrapper(new AggregationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.Enabling_4009 == req.getElementType()) {
			return getGEFWrapper(new EnablingCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.Disabling_4010 == req.getElementType()) {
			return getGEFWrapper(new DisablingCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.EnablingWithInformationPassing_4011 == req.getElementType()) {
			return getGEFWrapper(
					new EnablingWithInformationPassingCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.DisablingWithInformationPassing_4012 == req.getElementType()) {
			return getGEFWrapper(
					new DisablingWithInformationPassingCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.IndependentConcurrency_4013 == req.getElementType()) {
			return getGEFWrapper(new IndependentConcurrencyCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.OrderIndependence_4014 == req.getElementType()) {
			return getGEFWrapper(new OrderIndependenceCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.SuspendResume_4015 == req.getElementType()) {
			return getGEFWrapper(new SuspendResumeCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.ConcurrencyWithInformationPassing_4016 == req.getElementType()) {
			return getGEFWrapper(
					new ConcurrencyWithInformationPassingCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.DeterministicChoice_4017 == req.getElementType()) {
			return getGEFWrapper(new DeterministicChoiceCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.UndeterministicChoice_4018 == req.getElementType()) {
			return getGEFWrapper(new UndeterministicChoiceCreateCommand(req, req.getSource(), req.getTarget()));
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
		case AggregationEditPart.VISUAL_ID:
			return getGEFWrapper(new AggregationReorientCommand(req));
		case EnablingEditPart.VISUAL_ID:
			return getGEFWrapper(new EnablingReorientCommand(req));
		case DisablingEditPart.VISUAL_ID:
			return getGEFWrapper(new DisablingReorientCommand(req));
		case EnablingWithInformationPassingEditPart.VISUAL_ID:
			return getGEFWrapper(new EnablingWithInformationPassingReorientCommand(req));
		case DisablingWithInformationPassingEditPart.VISUAL_ID:
			return getGEFWrapper(new DisablingWithInformationPassingReorientCommand(req));
		case IndependentConcurrencyEditPart.VISUAL_ID:
			return getGEFWrapper(new IndependentConcurrencyReorientCommand(req));
		case OrderIndependenceEditPart.VISUAL_ID:
			return getGEFWrapper(new OrderIndependenceReorientCommand(req));
		case SuspendResumeEditPart.VISUAL_ID:
			return getGEFWrapper(new SuspendResumeReorientCommand(req));
		case ConcurrencyWithInformationPassingEditPart.VISUAL_ID:
			return getGEFWrapper(new ConcurrencyWithInformationPassingReorientCommand(req));
		case DeterministicChoiceEditPart.VISUAL_ID:
			return getGEFWrapper(new DeterministicChoiceReorientCommand(req));
		case UndeterministicChoiceEditPart.VISUAL_ID:
			return getGEFWrapper(new UndeterministicChoiceReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
