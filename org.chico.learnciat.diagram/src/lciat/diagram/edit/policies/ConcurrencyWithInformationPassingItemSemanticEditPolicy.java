/*
* 
*/
package lciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class ConcurrencyWithInformationPassingItemSemanticEditPolicy extends LciatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ConcurrencyWithInformationPassingItemSemanticEditPolicy() {
		super(LciatElementTypes.ConcurrencyWithInformationPassing_4016);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
