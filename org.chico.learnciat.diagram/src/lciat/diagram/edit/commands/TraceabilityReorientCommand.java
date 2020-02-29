/*
 * 
 */
package lciat.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import lciat.Awareness;
import lciat.LCIANDiagram;
import lciat.Tool;
import lciat.Traceability;
import lciat.diagram.edit.policies.LciatBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class TraceabilityReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public TraceabilityReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Traceability) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Awareness && newEnd instanceof Awareness)) {
			return false;
		}
		Tool target = getLink().getToolelement();
		if (!(getLink().eContainer() instanceof LCIANDiagram)) {
			return false;
		}
		LCIANDiagram container = (LCIANDiagram) getLink().eContainer();
		return LciatBaseItemSemanticEditPolicy.getLinkConstraints().canExistTraceability_4019(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Tool && newEnd instanceof Tool)) {
			return false;
		}
		Awareness source = getLink().getAwarelement();
		if (!(getLink().eContainer() instanceof LCIANDiagram)) {
			return false;
		}
		LCIANDiagram container = (LCIANDiagram) getLink().eContainer();
		return LciatBaseItemSemanticEditPolicy.getLinkConstraints().canExistTraceability_4019(container, getLink(),
				source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setAwarelement(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setToolelement(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected Traceability getLink() {
		return (Traceability) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected Awareness getOldSource() {
		return (Awareness) oldEnd;
	}

	/**
	* @generated
	*/
	protected Awareness getNewSource() {
		return (Awareness) newEnd;
	}

	/**
	* @generated
	*/
	protected Tool getOldTarget() {
		return (Tool) oldEnd;
	}

	/**
	* @generated
	*/
	protected Tool getNewTarget() {
		return (Tool) newEnd;
	}
}
