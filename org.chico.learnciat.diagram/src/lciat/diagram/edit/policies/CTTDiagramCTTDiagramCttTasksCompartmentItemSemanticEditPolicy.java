/*
* 
*/
package lciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import lciat.diagram.edit.commands.ApplicationTaskCreateCommand;
import lciat.diagram.edit.commands.CTTAbstractTaskCreateCommand;
import lciat.diagram.edit.commands.CTTCollaborativeTaskCreateCommand;
import lciat.diagram.edit.commands.CollaborativeVisualizationCreateCommand;
import lciat.diagram.edit.commands.ExclusiveEditionCreateCommand;
import lciat.diagram.edit.commands.IndividualVisualizationCreateCommand;
import lciat.diagram.edit.commands.InteractiveTaskCreateCommand;
import lciat.diagram.edit.commands.UserTaskCreateCommand;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class CTTDiagramCTTDiagramCttTasksCompartmentItemSemanticEditPolicy extends LciatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CTTDiagramCTTDiagramCttTasksCompartmentItemSemanticEditPolicy() {
		super(LciatElementTypes.CTTDiagram_2003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (LciatElementTypes.ExclusiveEdition_3114 == req.getElementType()) {
			return getGEFWrapper(new ExclusiveEditionCreateCommand(req));
		}
		if (LciatElementTypes.CollaborativeVisualization_3115 == req.getElementType()) {
			return getGEFWrapper(new CollaborativeVisualizationCreateCommand(req));
		}
		if (LciatElementTypes.IndividualVisualization_3116 == req.getElementType()) {
			return getGEFWrapper(new IndividualVisualizationCreateCommand(req));
		}
		if (LciatElementTypes.UserTask_3117 == req.getElementType()) {
			return getGEFWrapper(new UserTaskCreateCommand(req));
		}
		if (LciatElementTypes.CTTAbstractTask_3118 == req.getElementType()) {
			return getGEFWrapper(new CTTAbstractTaskCreateCommand(req));
		}
		if (LciatElementTypes.InteractiveTask_3119 == req.getElementType()) {
			return getGEFWrapper(new InteractiveTaskCreateCommand(req));
		}
		if (LciatElementTypes.CTTCollaborativeTask_3120 == req.getElementType()) {
			return getGEFWrapper(new CTTCollaborativeTaskCreateCommand(req));
		}
		if (LciatElementTypes.ApplicationTask_3121 == req.getElementType()) {
			return getGEFWrapper(new ApplicationTaskCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
