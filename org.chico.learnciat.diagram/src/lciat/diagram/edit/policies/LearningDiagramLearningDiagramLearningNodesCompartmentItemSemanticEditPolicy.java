/*
* 
*/
package lciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import lciat.diagram.edit.commands.AbstractTaskCreateCommand;
import lciat.diagram.edit.commands.Chat2CreateCommand;
import lciat.diagram.edit.commands.Condition2CreateCommand;
import lciat.diagram.edit.commands.Console2CreateCommand;
import lciat.diagram.edit.commands.DetailedAbstractTaskCreateCommand;
import lciat.diagram.edit.commands.End2CreateCommand;
import lciat.diagram.edit.commands.GroupTaskCreateCommand;
import lciat.diagram.edit.commands.IndividualTaskCreateCommand;
import lciat.diagram.edit.commands.Init2CreateCommand;
import lciat.diagram.edit.commands.Notification2CreateCommand;
import lciat.diagram.edit.commands.Problems2CreateCommand;
import lciat.diagram.edit.commands.Properties2CreateCommand;
import lciat.diagram.edit.commands.RadarView2CreateCommand;
import lciat.diagram.edit.commands.SessionPanel2CreateCommand;
import lciat.diagram.edit.commands.Telepointer2CreateCommand;
import lciat.diagram.edit.commands.TemporalCondition2CreateCommand;
import lciat.diagram.edit.commands.TurnTakingTool2CreateCommand;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class LearningDiagramLearningDiagramLearningNodesCompartmentItemSemanticEditPolicy
		extends LciatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public LearningDiagramLearningDiagramLearningNodesCompartmentItemSemanticEditPolicy() {
		super(LciatElementTypes.LearningDiagram_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (LciatElementTypes.IndividualTask_3026 == req.getElementType()) {
			return getGEFWrapper(new IndividualTaskCreateCommand(req));
		}
		if (LciatElementTypes.GroupTask_3046 == req.getElementType()) {
			return getGEFWrapper(new GroupTaskCreateCommand(req));
		}
		if (LciatElementTypes.AbstractTask_3061 == req.getElementType()) {
			return getGEFWrapper(new AbstractTaskCreateCommand(req));
		}
		if (LciatElementTypes.DetailedAbstractTask_3076 == req.getElementType()) {
			return getGEFWrapper(new DetailedAbstractTaskCreateCommand(req));
		}
		if (LciatElementTypes.SessionPanel_3094 == req.getElementType()) {
			return getGEFWrapper(new SessionPanel2CreateCommand(req));
		}
		if (LciatElementTypes.Chat_3095 == req.getElementType()) {
			return getGEFWrapper(new Chat2CreateCommand(req));
		}
		if (LciatElementTypes.TurnTakingTool_3096 == req.getElementType()) {
			return getGEFWrapper(new TurnTakingTool2CreateCommand(req));
		}
		if (LciatElementTypes.Telepointer_3097 == req.getElementType()) {
			return getGEFWrapper(new Telepointer2CreateCommand(req));
		}
		if (LciatElementTypes.RadarView_3098 == req.getElementType()) {
			return getGEFWrapper(new RadarView2CreateCommand(req));
		}
		if (LciatElementTypes.Properties_3099 == req.getElementType()) {
			return getGEFWrapper(new Properties2CreateCommand(req));
		}
		if (LciatElementTypes.Console_3100 == req.getElementType()) {
			return getGEFWrapper(new Console2CreateCommand(req));
		}
		if (LciatElementTypes.Problems_3101 == req.getElementType()) {
			return getGEFWrapper(new Problems2CreateCommand(req));
		}
		if (LciatElementTypes.Init_3102 == req.getElementType()) {
			return getGEFWrapper(new Init2CreateCommand(req));
		}
		if (LciatElementTypes.End_3103 == req.getElementType()) {
			return getGEFWrapper(new End2CreateCommand(req));
		}
		if (LciatElementTypes.TemporalCondition_3104 == req.getElementType()) {
			return getGEFWrapper(new TemporalCondition2CreateCommand(req));
		}
		if (LciatElementTypes.Notification_3105 == req.getElementType()) {
			return getGEFWrapper(new Notification2CreateCommand(req));
		}
		if (LciatElementTypes.Condition_3106 == req.getElementType()) {
			return getGEFWrapper(new Condition2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
