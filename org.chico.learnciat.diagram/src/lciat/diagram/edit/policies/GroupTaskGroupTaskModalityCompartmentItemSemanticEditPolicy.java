/*
* 
*/
package lciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import lciat.diagram.edit.commands.ComputerSupported2CreateCommand;
import lciat.diagram.edit.commands.FaceToFace2CreateCommand;
import lciat.diagram.edit.commands.Online2CreateCommand;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class GroupTaskGroupTaskModalityCompartmentItemSemanticEditPolicy extends LciatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GroupTaskGroupTaskModalityCompartmentItemSemanticEditPolicy() {
		super(LciatElementTypes.GroupTask_3046);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (LciatElementTypes.FaceToFace_3057 == req.getElementType()) {
			return getGEFWrapper(new FaceToFace2CreateCommand(req));
		}
		if (LciatElementTypes.ComputerSupported_3058 == req.getElementType()) {
			return getGEFWrapper(new ComputerSupported2CreateCommand(req));
		}
		if (LciatElementTypes.Online_3059 == req.getElementType()) {
			return getGEFWrapper(new Online2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
