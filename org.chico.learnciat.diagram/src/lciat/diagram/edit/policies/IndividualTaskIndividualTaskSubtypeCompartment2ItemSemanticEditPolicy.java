/*
* 
*/
package lciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import lciat.diagram.edit.commands.AdaptiveCreateCommand;
import lciat.diagram.edit.commands.AssimilativeCreateCommand;
import lciat.diagram.edit.commands.CommunicativeCreateCommand;
import lciat.diagram.edit.commands.EvaluativeCreateCommand;
import lciat.diagram.edit.commands.ExperientialCreateCommand;
import lciat.diagram.edit.commands.InformationHandlingCreateCommand;
import lciat.diagram.edit.commands.ProductiveCreateCommand;
import lciat.diagram.edit.commands.SupportCreateCommand;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class IndividualTaskIndividualTaskSubtypeCompartment2ItemSemanticEditPolicy
		extends LciatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public IndividualTaskIndividualTaskSubtypeCompartment2ItemSemanticEditPolicy() {
		super(LciatElementTypes.IndividualTask_3077);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (LciatElementTypes.Assimilative_3033 == req.getElementType()) {
			return getGEFWrapper(new AssimilativeCreateCommand(req));
		}
		if (LciatElementTypes.InformationHandling_3034 == req.getElementType()) {
			return getGEFWrapper(new InformationHandlingCreateCommand(req));
		}
		if (LciatElementTypes.Adaptive_3035 == req.getElementType()) {
			return getGEFWrapper(new AdaptiveCreateCommand(req));
		}
		if (LciatElementTypes.Communicative_3036 == req.getElementType()) {
			return getGEFWrapper(new CommunicativeCreateCommand(req));
		}
		if (LciatElementTypes.Productive_3037 == req.getElementType()) {
			return getGEFWrapper(new ProductiveCreateCommand(req));
		}
		if (LciatElementTypes.Experiential_3038 == req.getElementType()) {
			return getGEFWrapper(new ExperientialCreateCommand(req));
		}
		if (LciatElementTypes.Evaluative_3039 == req.getElementType()) {
			return getGEFWrapper(new EvaluativeCreateCommand(req));
		}
		if (LciatElementTypes.Support_3040 == req.getElementType()) {
			return getGEFWrapper(new SupportCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
