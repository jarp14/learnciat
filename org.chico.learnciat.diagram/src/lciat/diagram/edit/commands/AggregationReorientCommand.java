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

import lciat.Aggregation;
import lciat.CTTTask;
import lciat.LCIANDiagram;
import lciat.diagram.edit.policies.LciatBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class AggregationReorientCommand extends EditElementCommand {

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
	public AggregationReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Aggregation) {
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
		if (!(oldEnd instanceof CTTTask && newEnd instanceof CTTTask)) {
			return false;
		}
		CTTTask target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof LCIANDiagram)) {
			return false;
		}
		LCIANDiagram container = (LCIANDiagram) getLink().eContainer();
		return LciatBaseItemSemanticEditPolicy.getLinkConstraints().canExistAggregation_4008(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof CTTTask && newEnd instanceof CTTTask)) {
			return false;
		}
		CTTTask source = getLink().getSource();
		if (!(getLink().eContainer() instanceof LCIANDiagram)) {
			return false;
		}
		LCIANDiagram container = (LCIANDiagram) getLink().eContainer();
		return LciatBaseItemSemanticEditPolicy.getLinkConstraints().canExistAggregation_4008(container, getLink(),
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
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected Aggregation getLink() {
		return (Aggregation) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected CTTTask getOldSource() {
		return (CTTTask) oldEnd;
	}

	/**
	* @generated
	*/
	protected CTTTask getNewSource() {
		return (CTTTask) newEnd;
	}

	/**
	* @generated
	*/
	protected CTTTask getOldTarget() {
		return (CTTTask) oldEnd;
	}

	/**
	* @generated
	*/
	protected CTTTask getNewTarget() {
		return (CTTTask) newEnd;
	}
}
