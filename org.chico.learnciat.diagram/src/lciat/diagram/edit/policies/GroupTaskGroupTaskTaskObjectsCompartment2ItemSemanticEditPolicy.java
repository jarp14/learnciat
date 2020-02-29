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
public class GroupTaskGroupTaskTaskObjectsCompartment2ItemSemanticEditPolicy extends LciatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GroupTaskGroupTaskTaskObjectsCompartment2ItemSemanticEditPolicy() {
		super(LciatElementTypes.GroupTask_3078);
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
