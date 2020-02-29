/*
* 
*/
package lciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import lciat.diagram.edit.commands.Group3CreateCommand;
import lciat.diagram.edit.commands.Rol3CreateCommand;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class GroupTaskGroupTaskTaskRolesCompartmentItemSemanticEditPolicy extends LciatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GroupTaskGroupTaskTaskRolesCompartmentItemSemanticEditPolicy() {
		super(LciatElementTypes.GroupTask_3046);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (LciatElementTypes.Rol_3047 == req.getElementType()) {
			return getGEFWrapper(new Rol3CreateCommand(req));
		}
		if (LciatElementTypes.Group_3048 == req.getElementType()) {
			return getGEFWrapper(new Group3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
