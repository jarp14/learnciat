/*
* 
*/
package lciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import lciat.diagram.edit.commands.Adaptive3CreateCommand;
import lciat.diagram.edit.commands.Assimilative3CreateCommand;
import lciat.diagram.edit.commands.Communicative3CreateCommand;
import lciat.diagram.edit.commands.Evaluative3CreateCommand;
import lciat.diagram.edit.commands.Experiential3CreateCommand;
import lciat.diagram.edit.commands.InformationHandling3CreateCommand;
import lciat.diagram.edit.commands.Productive3CreateCommand;
import lciat.diagram.edit.commands.Support3CreateCommand;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class AbstractTaskAbstractTaskSubtypeCompartment2ItemSemanticEditPolicy extends LciatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AbstractTaskAbstractTaskSubtypeCompartment2ItemSemanticEditPolicy() {
		super(LciatElementTypes.AbstractTask_3079);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (LciatElementTypes.Assimilative_3064 == req.getElementType()) {
			return getGEFWrapper(new Assimilative3CreateCommand(req));
		}
		if (LciatElementTypes.InformationHandling_3065 == req.getElementType()) {
			return getGEFWrapper(new InformationHandling3CreateCommand(req));
		}
		if (LciatElementTypes.Adaptive_3066 == req.getElementType()) {
			return getGEFWrapper(new Adaptive3CreateCommand(req));
		}
		if (LciatElementTypes.Communicative_3067 == req.getElementType()) {
			return getGEFWrapper(new Communicative3CreateCommand(req));
		}
		if (LciatElementTypes.Productive_3068 == req.getElementType()) {
			return getGEFWrapper(new Productive3CreateCommand(req));
		}
		if (LciatElementTypes.Experiential_3069 == req.getElementType()) {
			return getGEFWrapper(new Experiential3CreateCommand(req));
		}
		if (LciatElementTypes.Evaluative_3070 == req.getElementType()) {
			return getGEFWrapper(new Evaluative3CreateCommand(req));
		}
		if (LciatElementTypes.Support_3071 == req.getElementType()) {
			return getGEFWrapper(new Support3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
