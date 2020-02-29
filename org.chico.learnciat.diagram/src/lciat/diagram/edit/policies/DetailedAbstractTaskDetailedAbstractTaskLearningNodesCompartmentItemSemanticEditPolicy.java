/*
* 
*/
package lciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import lciat.diagram.edit.commands.AbstractTask2CreateCommand;
import lciat.diagram.edit.commands.ChatCreateCommand;
import lciat.diagram.edit.commands.ConditionCreateCommand;
import lciat.diagram.edit.commands.ConsoleCreateCommand;
import lciat.diagram.edit.commands.DetailedAbstractTask2CreateCommand;
import lciat.diagram.edit.commands.EndCreateCommand;
import lciat.diagram.edit.commands.GroupTask2CreateCommand;
import lciat.diagram.edit.commands.IndividualTask2CreateCommand;
import lciat.diagram.edit.commands.InitCreateCommand;
import lciat.diagram.edit.commands.NotificationCreateCommand;
import lciat.diagram.edit.commands.ProblemsCreateCommand;
import lciat.diagram.edit.commands.PropertiesCreateCommand;
import lciat.diagram.edit.commands.RadarViewCreateCommand;
import lciat.diagram.edit.commands.SessionPanelCreateCommand;
import lciat.diagram.edit.commands.TelepointerCreateCommand;
import lciat.diagram.edit.commands.TemporalConditionCreateCommand;
import lciat.diagram.edit.commands.TurnTakingToolCreateCommand;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentItemSemanticEditPolicy
		extends LciatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentItemSemanticEditPolicy() {
		super(LciatElementTypes.DetailedAbstractTask_3076);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (LciatElementTypes.IndividualTask_3077 == req.getElementType()) {
			return getGEFWrapper(new IndividualTask2CreateCommand(req));
		}
		if (LciatElementTypes.GroupTask_3078 == req.getElementType()) {
			return getGEFWrapper(new GroupTask2CreateCommand(req));
		}
		if (LciatElementTypes.AbstractTask_3079 == req.getElementType()) {
			return getGEFWrapper(new AbstractTask2CreateCommand(req));
		}
		if (LciatElementTypes.DetailedAbstractTask_3080 == req.getElementType()) {
			return getGEFWrapper(new DetailedAbstractTask2CreateCommand(req));
		}
		if (LciatElementTypes.SessionPanel_3081 == req.getElementType()) {
			return getGEFWrapper(new SessionPanelCreateCommand(req));
		}
		if (LciatElementTypes.Chat_3082 == req.getElementType()) {
			return getGEFWrapper(new ChatCreateCommand(req));
		}
		if (LciatElementTypes.TurnTakingTool_3083 == req.getElementType()) {
			return getGEFWrapper(new TurnTakingToolCreateCommand(req));
		}
		if (LciatElementTypes.Telepointer_3084 == req.getElementType()) {
			return getGEFWrapper(new TelepointerCreateCommand(req));
		}
		if (LciatElementTypes.RadarView_3085 == req.getElementType()) {
			return getGEFWrapper(new RadarViewCreateCommand(req));
		}
		if (LciatElementTypes.Properties_3086 == req.getElementType()) {
			return getGEFWrapper(new PropertiesCreateCommand(req));
		}
		if (LciatElementTypes.Console_3087 == req.getElementType()) {
			return getGEFWrapper(new ConsoleCreateCommand(req));
		}
		if (LciatElementTypes.Problems_3088 == req.getElementType()) {
			return getGEFWrapper(new ProblemsCreateCommand(req));
		}
		if (LciatElementTypes.Init_3089 == req.getElementType()) {
			return getGEFWrapper(new InitCreateCommand(req));
		}
		if (LciatElementTypes.End_3090 == req.getElementType()) {
			return getGEFWrapper(new EndCreateCommand(req));
		}
		if (LciatElementTypes.TemporalCondition_3091 == req.getElementType()) {
			return getGEFWrapper(new TemporalConditionCreateCommand(req));
		}
		if (LciatElementTypes.Notification_3092 == req.getElementType()) {
			return getGEFWrapper(new NotificationCreateCommand(req));
		}
		if (LciatElementTypes.Condition_3093 == req.getElementType()) {
			return getGEFWrapper(new ConditionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
