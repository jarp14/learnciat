/*
* 
*/
package lciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import lciat.diagram.edit.commands.MolefPersonalization1CreateCommand;
import lciat.diagram.edit.commands.MolefPersonalization2CreateCommand;
import lciat.diagram.edit.commands.MolefPersonalization3CreateCommand;
import lciat.diagram.edit.commands.MolefPersonalization4CreateCommand;
import lciat.diagram.edit.commands.MolefPersonalization5CreateCommand;
import lciat.diagram.edit.commands.MolefSocial1CreateCommand;
import lciat.diagram.edit.commands.MolefSocial2CreateCommand;
import lciat.diagram.edit.commands.MolefSocial3CreateCommand;
import lciat.diagram.edit.commands.MolefSocial4CreateCommand;
import lciat.diagram.edit.commands.MolefTActivities1CreateCommand;
import lciat.diagram.edit.commands.MolefTActivities2CreateCommand;
import lciat.diagram.edit.commands.MolefTActivities3CreateCommand;
import lciat.diagram.edit.commands.MolefTActivities4CreateCommand;
import lciat.diagram.edit.commands.MolefTActivities5CreateCommand;
import lciat.diagram.edit.commands.MolefTActivities6CreateCommand;
import lciat.diagram.edit.commands.MolefTActivities7CreateCommand;
import lciat.diagram.edit.commands.MolefTActivities8CreateCommand;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class LearningDiagramLearningDiagramMfLearningNodesCompartmentItemSemanticEditPolicy
		extends LciatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public LearningDiagramLearningDiagramMfLearningNodesCompartmentItemSemanticEditPolicy() {
		super(LciatElementTypes.LearningDiagram_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (LciatElementTypes.MolefTActivities1_3009 == req.getElementType()) {
			return getGEFWrapper(new MolefTActivities1CreateCommand(req));
		}
		if (LciatElementTypes.MolefTActivities2_3010 == req.getElementType()) {
			return getGEFWrapper(new MolefTActivities2CreateCommand(req));
		}
		if (LciatElementTypes.MolefTActivities3_3011 == req.getElementType()) {
			return getGEFWrapper(new MolefTActivities3CreateCommand(req));
		}
		if (LciatElementTypes.MolefTActivities4_3012 == req.getElementType()) {
			return getGEFWrapper(new MolefTActivities4CreateCommand(req));
		}
		if (LciatElementTypes.MolefTActivities5_3013 == req.getElementType()) {
			return getGEFWrapper(new MolefTActivities5CreateCommand(req));
		}
		if (LciatElementTypes.MolefTActivities6_3014 == req.getElementType()) {
			return getGEFWrapper(new MolefTActivities6CreateCommand(req));
		}
		if (LciatElementTypes.MolefTActivities7_3015 == req.getElementType()) {
			return getGEFWrapper(new MolefTActivities7CreateCommand(req));
		}
		if (LciatElementTypes.MolefTActivities8_3016 == req.getElementType()) {
			return getGEFWrapper(new MolefTActivities8CreateCommand(req));
		}
		if (LciatElementTypes.MolefSocial1_3017 == req.getElementType()) {
			return getGEFWrapper(new MolefSocial1CreateCommand(req));
		}
		if (LciatElementTypes.MolefSocial2_3018 == req.getElementType()) {
			return getGEFWrapper(new MolefSocial2CreateCommand(req));
		}
		if (LciatElementTypes.MolefSocial3_3019 == req.getElementType()) {
			return getGEFWrapper(new MolefSocial3CreateCommand(req));
		}
		if (LciatElementTypes.MolefSocial4_3020 == req.getElementType()) {
			return getGEFWrapper(new MolefSocial4CreateCommand(req));
		}
		if (LciatElementTypes.MolefPersonalization1_3021 == req.getElementType()) {
			return getGEFWrapper(new MolefPersonalization1CreateCommand(req));
		}
		if (LciatElementTypes.MolefPersonalization2_3022 == req.getElementType()) {
			return getGEFWrapper(new MolefPersonalization2CreateCommand(req));
		}
		if (LciatElementTypes.MolefPersonalization3_3023 == req.getElementType()) {
			return getGEFWrapper(new MolefPersonalization3CreateCommand(req));
		}
		if (LciatElementTypes.MolefPersonalization4_3024 == req.getElementType()) {
			return getGEFWrapper(new MolefPersonalization4CreateCommand(req));
		}
		if (LciatElementTypes.MolefPersonalization5_3025 == req.getElementType()) {
			return getGEFWrapper(new MolefPersonalization5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
