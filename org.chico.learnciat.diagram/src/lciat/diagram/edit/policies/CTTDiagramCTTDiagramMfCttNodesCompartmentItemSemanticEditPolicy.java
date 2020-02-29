/*
* 
*/
package lciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import lciat.diagram.edit.commands.MolefMultimedia1CreateCommand;
import lciat.diagram.edit.commands.MolefMultimedia2CreateCommand;
import lciat.diagram.edit.commands.MolefMultimedia3CreateCommand;
import lciat.diagram.edit.commands.MolefMultimedia4CreateCommand;
import lciat.diagram.edit.commands.MolefMultimedia5CreateCommand;
import lciat.diagram.edit.commands.MolefMultimedia6CreateCommand;
import lciat.diagram.edit.commands.MolefMultimedia7CreateCommand;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class CTTDiagramCTTDiagramMfCttNodesCompartmentItemSemanticEditPolicy extends LciatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CTTDiagramCTTDiagramMfCttNodesCompartmentItemSemanticEditPolicy() {
		super(LciatElementTypes.CTTDiagram_2003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (LciatElementTypes.MolefMultimedia1_3107 == req.getElementType()) {
			return getGEFWrapper(new MolefMultimedia1CreateCommand(req));
		}
		if (LciatElementTypes.MolefMultimedia2_3108 == req.getElementType()) {
			return getGEFWrapper(new MolefMultimedia2CreateCommand(req));
		}
		if (LciatElementTypes.MolefMultimedia3_3109 == req.getElementType()) {
			return getGEFWrapper(new MolefMultimedia3CreateCommand(req));
		}
		if (LciatElementTypes.MolefMultimedia4_3110 == req.getElementType()) {
			return getGEFWrapper(new MolefMultimedia4CreateCommand(req));
		}
		if (LciatElementTypes.MolefMultimedia5_3111 == req.getElementType()) {
			return getGEFWrapper(new MolefMultimedia5CreateCommand(req));
		}
		if (LciatElementTypes.MolefMultimedia6_3112 == req.getElementType()) {
			return getGEFWrapper(new MolefMultimedia6CreateCommand(req));
		}
		if (LciatElementTypes.MolefMultimedia7_3113 == req.getElementType()) {
			return getGEFWrapper(new MolefMultimedia7CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
