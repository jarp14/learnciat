/*
* 
*/
package lciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import lciat.diagram.edit.commands.MolefContent1CreateCommand;
import lciat.diagram.edit.commands.MolefContent2CreateCommand;
import lciat.diagram.edit.commands.MolefContent3CreateCommand;
import lciat.diagram.edit.commands.MolefContent4CreateCommand;
import lciat.diagram.edit.commands.MolefContent5CreateCommand;
import lciat.diagram.edit.commands.MolefContent6CreateCommand;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class SociogramSociogramMfContentNodesCompartmentItemSemanticEditPolicy extends LciatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SociogramSociogramMfContentNodesCompartmentItemSemanticEditPolicy() {
		super(LciatElementTypes.Sociogram_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (LciatElementTypes.MolefContent1_3003 == req.getElementType()) {
			return getGEFWrapper(new MolefContent1CreateCommand(req));
		}
		if (LciatElementTypes.MolefContent2_3004 == req.getElementType()) {
			return getGEFWrapper(new MolefContent2CreateCommand(req));
		}
		if (LciatElementTypes.MolefContent3_3005 == req.getElementType()) {
			return getGEFWrapper(new MolefContent3CreateCommand(req));
		}
		if (LciatElementTypes.MolefContent4_3006 == req.getElementType()) {
			return getGEFWrapper(new MolefContent4CreateCommand(req));
		}
		if (LciatElementTypes.MolefContent5_3007 == req.getElementType()) {
			return getGEFWrapper(new MolefContent5CreateCommand(req));
		}
		if (LciatElementTypes.MolefContent6_3008 == req.getElementType()) {
			return getGEFWrapper(new MolefContent6CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
