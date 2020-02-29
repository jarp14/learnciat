/*
* 
*/
package lciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import lciat.diagram.edit.commands.Group2CreateCommand;
import lciat.diagram.edit.commands.Rol2CreateCommand;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class IndividualTaskIndividualTaskTaskRolesCompartment2ItemSemanticEditPolicy
		extends LciatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public IndividualTaskIndividualTaskTaskRolesCompartment2ItemSemanticEditPolicy() {
		super(LciatElementTypes.IndividualTask_3077);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (LciatElementTypes.Rol_3027 == req.getElementType()) {
			return getGEFWrapper(new Rol2CreateCommand(req));
		}
		if (LciatElementTypes.Group_3028 == req.getElementType()) {
			return getGEFWrapper(new Group2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
