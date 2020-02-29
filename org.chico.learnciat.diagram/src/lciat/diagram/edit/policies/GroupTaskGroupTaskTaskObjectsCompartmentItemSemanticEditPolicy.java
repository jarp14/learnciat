/*
* 
*/
package lciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import lciat.diagram.edit.commands.Object2CreateCommand;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class GroupTaskGroupTaskTaskObjectsCompartmentItemSemanticEditPolicy extends LciatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GroupTaskGroupTaskTaskObjectsCompartmentItemSemanticEditPolicy() {
		super(LciatElementTypes.GroupTask_3046);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (LciatElementTypes.Object_3060 == req.getElementType()) {
			return getGEFWrapper(new Object2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
