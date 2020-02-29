/*
* 
*/
package lciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import lciat.diagram.edit.commands.Object3CreateCommand;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class AbstractTaskAbstractTaskTaskObjectsCompartmentItemSemanticEditPolicy
		extends LciatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AbstractTaskAbstractTaskTaskObjectsCompartmentItemSemanticEditPolicy() {
		super(LciatElementTypes.AbstractTask_3061);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (LciatElementTypes.Object_3075 == req.getElementType()) {
			return getGEFWrapper(new Object3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
