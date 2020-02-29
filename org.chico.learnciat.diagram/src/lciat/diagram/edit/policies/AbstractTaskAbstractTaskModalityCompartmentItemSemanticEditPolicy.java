/*
* 
*/
package lciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import lciat.diagram.edit.commands.ComputerSupported3CreateCommand;
import lciat.diagram.edit.commands.FaceToFace3CreateCommand;
import lciat.diagram.edit.commands.Online3CreateCommand;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class AbstractTaskAbstractTaskModalityCompartmentItemSemanticEditPolicy extends LciatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AbstractTaskAbstractTaskModalityCompartmentItemSemanticEditPolicy() {
		super(LciatElementTypes.AbstractTask_3061);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (LciatElementTypes.FaceToFace_3072 == req.getElementType()) {
			return getGEFWrapper(new FaceToFace3CreateCommand(req));
		}
		if (LciatElementTypes.ComputerSupported_3073 == req.getElementType()) {
			return getGEFWrapper(new ComputerSupported3CreateCommand(req));
		}
		if (LciatElementTypes.Online_3074 == req.getElementType()) {
			return getGEFWrapper(new Online3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
