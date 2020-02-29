/*
* 
*/
package lciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import lciat.diagram.edit.commands.Adaptive2CreateCommand;
import lciat.diagram.edit.commands.Assimilative2CreateCommand;
import lciat.diagram.edit.commands.Communicative2CreateCommand;
import lciat.diagram.edit.commands.Evaluative2CreateCommand;
import lciat.diagram.edit.commands.Experiential2CreateCommand;
import lciat.diagram.edit.commands.InformationHandling2CreateCommand;
import lciat.diagram.edit.commands.Productive2CreateCommand;
import lciat.diagram.edit.commands.Support2CreateCommand;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class GroupTaskGroupTaskSubtypeCompartmentItemSemanticEditPolicy extends LciatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GroupTaskGroupTaskSubtypeCompartmentItemSemanticEditPolicy() {
		super(LciatElementTypes.GroupTask_3046);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (LciatElementTypes.Assimilative_3049 == req.getElementType()) {
			return getGEFWrapper(new Assimilative2CreateCommand(req));
		}
		if (LciatElementTypes.InformationHandling_3050 == req.getElementType()) {
			return getGEFWrapper(new InformationHandling2CreateCommand(req));
		}
		if (LciatElementTypes.Adaptive_3051 == req.getElementType()) {
			return getGEFWrapper(new Adaptive2CreateCommand(req));
		}
		if (LciatElementTypes.Communicative_3052 == req.getElementType()) {
			return getGEFWrapper(new Communicative2CreateCommand(req));
		}
		if (LciatElementTypes.Productive_3053 == req.getElementType()) {
			return getGEFWrapper(new Productive2CreateCommand(req));
		}
		if (LciatElementTypes.Experiential_3054 == req.getElementType()) {
			return getGEFWrapper(new Experiential2CreateCommand(req));
		}
		if (LciatElementTypes.Evaluative_3055 == req.getElementType()) {
			return getGEFWrapper(new Evaluative2CreateCommand(req));
		}
		if (LciatElementTypes.Support_3056 == req.getElementType()) {
			return getGEFWrapper(new Support2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
