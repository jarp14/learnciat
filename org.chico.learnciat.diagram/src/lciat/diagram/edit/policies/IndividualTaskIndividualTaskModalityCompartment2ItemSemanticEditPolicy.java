/*
* 
*/
package lciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import lciat.diagram.edit.commands.ComputerSupportedCreateCommand;
import lciat.diagram.edit.commands.FaceToFaceCreateCommand;
import lciat.diagram.edit.commands.OnlineCreateCommand;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class IndividualTaskIndividualTaskModalityCompartment2ItemSemanticEditPolicy
		extends LciatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public IndividualTaskIndividualTaskModalityCompartment2ItemSemanticEditPolicy() {
		super(LciatElementTypes.IndividualTask_3077);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (LciatElementTypes.FaceToFace_3041 == req.getElementType()) {
			return getGEFWrapper(new FaceToFaceCreateCommand(req));
		}
		if (LciatElementTypes.ComputerSupported_3042 == req.getElementType()) {
			return getGEFWrapper(new ComputerSupportedCreateCommand(req));
		}
		if (LciatElementTypes.Online_3043 == req.getElementType()) {
			return getGEFWrapper(new OnlineCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
