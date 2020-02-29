/*
* 
*/
package lciat.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import lciat.diagram.edit.commands.CTTDiagramCreateCommand;
import lciat.diagram.edit.commands.LearningDiagramCreateCommand;
import lciat.diagram.edit.commands.SociogramCreateCommand;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class LCIANDiagramItemSemanticEditPolicy extends LciatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public LCIANDiagramItemSemanticEditPolicy() {
		super(LciatElementTypes.LCIANDiagram_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (LciatElementTypes.Sociogram_2001 == req.getElementType()) {
			return getGEFWrapper(new SociogramCreateCommand(req));
		}
		if (LciatElementTypes.LearningDiagram_2002 == req.getElementType()) {
			return getGEFWrapper(new LearningDiagramCreateCommand(req));
		}
		if (LciatElementTypes.CTTDiagram_2003 == req.getElementType()) {
			return getGEFWrapper(new CTTDiagramCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
