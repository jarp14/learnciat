/*
* 
*/
package lciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import lciat.diagram.edit.commands.GroupCreateCommand;
import lciat.diagram.edit.commands.RolCreateCommand;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class SociogramSociogramItsSociogramNodesCompartmentItemSemanticEditPolicy
		extends LciatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SociogramSociogramItsSociogramNodesCompartmentItemSemanticEditPolicy() {
		super(LciatElementTypes.Sociogram_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (LciatElementTypes.Rol_3001 == req.getElementType()) {
			return getGEFWrapper(new RolCreateCommand(req));
		}
		if (LciatElementTypes.Group_3002 == req.getElementType()) {
			return getGEFWrapper(new GroupCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
