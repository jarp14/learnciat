/*
* 
*/
package lciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import lciat.diagram.edit.commands.ObjectCreateCommand;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class IndividualTaskIndividualTaskTaskObjectsCompartment2ItemSemanticEditPolicy
		extends LciatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public IndividualTaskIndividualTaskTaskObjectsCompartment2ItemSemanticEditPolicy() {
		super(LciatElementTypes.IndividualTask_3077);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (LciatElementTypes.Object_3045 == req.getElementType()) {
			return getGEFWrapper(new ObjectCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
