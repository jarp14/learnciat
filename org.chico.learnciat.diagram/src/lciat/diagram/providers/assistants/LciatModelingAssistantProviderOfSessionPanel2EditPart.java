/*
 * 
 */
package lciat.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import lciat.diagram.edit.parts.AbstractTask2EditPart;
import lciat.diagram.edit.parts.AbstractTaskEditPart;
import lciat.diagram.edit.parts.Chat2EditPart;
import lciat.diagram.edit.parts.ChatEditPart;
import lciat.diagram.edit.parts.CodeEditorEditPart;
import lciat.diagram.edit.parts.Condition2EditPart;
import lciat.diagram.edit.parts.ConditionEditPart;
import lciat.diagram.edit.parts.Console2EditPart;
import lciat.diagram.edit.parts.ConsoleEditPart;
import lciat.diagram.edit.parts.DetailedAbstractTask2EditPart;
import lciat.diagram.edit.parts.DetailedAbstractTaskEditPart;
import lciat.diagram.edit.parts.End2EditPart;
import lciat.diagram.edit.parts.EndEditPart;
import lciat.diagram.edit.parts.GraphicalEditorEditPart;
import lciat.diagram.edit.parts.GroupTask2EditPart;
import lciat.diagram.edit.parts.GroupTaskEditPart;
import lciat.diagram.edit.parts.IndividualTask2EditPart;
import lciat.diagram.edit.parts.IndividualTaskEditPart;
import lciat.diagram.edit.parts.Init2EditPart;
import lciat.diagram.edit.parts.InitEditPart;
import lciat.diagram.edit.parts.Notification2EditPart;
import lciat.diagram.edit.parts.NotificationEditPart;
import lciat.diagram.edit.parts.Problems2EditPart;
import lciat.diagram.edit.parts.ProblemsEditPart;
import lciat.diagram.edit.parts.Properties2EditPart;
import lciat.diagram.edit.parts.PropertiesEditPart;
import lciat.diagram.edit.parts.RadarView2EditPart;
import lciat.diagram.edit.parts.RadarViewEditPart;
import lciat.diagram.edit.parts.SessionPanel2EditPart;
import lciat.diagram.edit.parts.SessionPanelEditPart;
import lciat.diagram.edit.parts.Telepointer2EditPart;
import lciat.diagram.edit.parts.TelepointerEditPart;
import lciat.diagram.edit.parts.TemporalCondition2EditPart;
import lciat.diagram.edit.parts.TemporalConditionEditPart;
import lciat.diagram.edit.parts.TextEditorEditPart;
import lciat.diagram.edit.parts.ToolEditPart;
import lciat.diagram.edit.parts.TurnTakingTool2EditPart;
import lciat.diagram.edit.parts.TurnTakingToolEditPart;
import lciat.diagram.edit.parts.WebViewerEditPart;
import lciat.diagram.providers.LciatElementTypes;
import lciat.diagram.providers.LciatModelingAssistantProvider;

/**
 * @generated
 */
public class LciatModelingAssistantProviderOfSessionPanel2EditPart extends LciatModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((SessionPanel2EditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(SessionPanel2EditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(LciatElementTypes.EnablingWOInformation_4004);
		types.add(LciatElementTypes.EnablingWInformation_4005);
		types.add(LciatElementTypes.Choice_4006);
		types.add(LciatElementTypes.Concurrency_4007);
		types.add(LciatElementTypes.Traceability_4019);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((SessionPanel2EditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(SessionPanel2EditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof IndividualTaskEditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof GroupTaskEditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof AbstractTaskEditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof DetailedAbstractTaskEditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof IndividualTask2EditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof GroupTask2EditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof AbstractTask2EditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof DetailedAbstractTask2EditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof SessionPanelEditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof ChatEditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof TurnTakingToolEditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof TelepointerEditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof RadarViewEditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof PropertiesEditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof ConsoleEditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof ProblemsEditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof InitEditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof EndEditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof TemporalConditionEditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof NotificationEditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof ConditionEditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof SessionPanel2EditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof Chat2EditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof TurnTakingTool2EditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof Telepointer2EditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof RadarView2EditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof Properties2EditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof Console2EditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof Problems2EditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof Init2EditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof End2EditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof TemporalCondition2EditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof Notification2EditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof Condition2EditPart) {
			types.add(LciatElementTypes.EnablingWOInformation_4004);
		}
		if (targetEditPart instanceof IndividualTaskEditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof GroupTaskEditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof AbstractTaskEditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof DetailedAbstractTaskEditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof IndividualTask2EditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof GroupTask2EditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof AbstractTask2EditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof DetailedAbstractTask2EditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof SessionPanelEditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof ChatEditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof TurnTakingToolEditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof TelepointerEditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof RadarViewEditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof PropertiesEditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof ConsoleEditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof ProblemsEditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof InitEditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof EndEditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof TemporalConditionEditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof NotificationEditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof ConditionEditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof SessionPanel2EditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof Chat2EditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof TurnTakingTool2EditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof Telepointer2EditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof RadarView2EditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof Properties2EditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof Console2EditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof Problems2EditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof Init2EditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof End2EditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof TemporalCondition2EditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof Notification2EditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof Condition2EditPart) {
			types.add(LciatElementTypes.EnablingWInformation_4005);
		}
		if (targetEditPart instanceof IndividualTaskEditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof GroupTaskEditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof AbstractTaskEditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof DetailedAbstractTaskEditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof IndividualTask2EditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof GroupTask2EditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof AbstractTask2EditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof DetailedAbstractTask2EditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof SessionPanelEditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof ChatEditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof TurnTakingToolEditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof TelepointerEditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof RadarViewEditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof PropertiesEditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof ConsoleEditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof ProblemsEditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof InitEditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof EndEditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof TemporalConditionEditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof NotificationEditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof ConditionEditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof SessionPanel2EditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof Chat2EditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof TurnTakingTool2EditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof Telepointer2EditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof RadarView2EditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof Properties2EditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof Console2EditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof Problems2EditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof Init2EditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof End2EditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof TemporalCondition2EditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof Notification2EditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof Condition2EditPart) {
			types.add(LciatElementTypes.Choice_4006);
		}
		if (targetEditPart instanceof IndividualTaskEditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof GroupTaskEditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof AbstractTaskEditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof DetailedAbstractTaskEditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof IndividualTask2EditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof GroupTask2EditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof AbstractTask2EditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof DetailedAbstractTask2EditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof SessionPanelEditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof ChatEditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof TurnTakingToolEditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof TelepointerEditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof RadarViewEditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof PropertiesEditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof ConsoleEditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof ProblemsEditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof InitEditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof EndEditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof TemporalConditionEditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof NotificationEditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof ConditionEditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof SessionPanel2EditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof Chat2EditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof TurnTakingTool2EditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof Telepointer2EditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof RadarView2EditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof Properties2EditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof Console2EditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof Problems2EditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof Init2EditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof End2EditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof TemporalCondition2EditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof Notification2EditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof Condition2EditPart) {
			types.add(LciatElementTypes.Concurrency_4007);
		}
		if (targetEditPart instanceof GraphicalEditorEditPart) {
			types.add(LciatElementTypes.Traceability_4019);
		}
		if (targetEditPart instanceof TextEditorEditPart) {
			types.add(LciatElementTypes.Traceability_4019);
		}
		if (targetEditPart instanceof CodeEditorEditPart) {
			types.add(LciatElementTypes.Traceability_4019);
		}
		if (targetEditPart instanceof WebViewerEditPart) {
			types.add(LciatElementTypes.Traceability_4019);
		}
		if (targetEditPart instanceof ToolEditPart) {
			types.add(LciatElementTypes.Traceability_4019);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((SessionPanel2EditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(SessionPanel2EditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == LciatElementTypes.EnablingWOInformation_4004) {
			types.add(LciatElementTypes.IndividualTask_3026);
			types.add(LciatElementTypes.GroupTask_3046);
			types.add(LciatElementTypes.AbstractTask_3061);
			types.add(LciatElementTypes.DetailedAbstractTask_3076);
			types.add(LciatElementTypes.IndividualTask_3077);
			types.add(LciatElementTypes.GroupTask_3078);
			types.add(LciatElementTypes.AbstractTask_3079);
			types.add(LciatElementTypes.DetailedAbstractTask_3080);
			types.add(LciatElementTypes.SessionPanel_3081);
			types.add(LciatElementTypes.Chat_3082);
			types.add(LciatElementTypes.TurnTakingTool_3083);
			types.add(LciatElementTypes.Telepointer_3084);
			types.add(LciatElementTypes.RadarView_3085);
			types.add(LciatElementTypes.Properties_3086);
			types.add(LciatElementTypes.Console_3087);
			types.add(LciatElementTypes.Problems_3088);
			types.add(LciatElementTypes.Init_3089);
			types.add(LciatElementTypes.End_3090);
			types.add(LciatElementTypes.TemporalCondition_3091);
			types.add(LciatElementTypes.Notification_3092);
			types.add(LciatElementTypes.Condition_3093);
			types.add(LciatElementTypes.SessionPanel_3094);
			types.add(LciatElementTypes.Chat_3095);
			types.add(LciatElementTypes.TurnTakingTool_3096);
			types.add(LciatElementTypes.Telepointer_3097);
			types.add(LciatElementTypes.RadarView_3098);
			types.add(LciatElementTypes.Properties_3099);
			types.add(LciatElementTypes.Console_3100);
			types.add(LciatElementTypes.Problems_3101);
			types.add(LciatElementTypes.Init_3102);
			types.add(LciatElementTypes.End_3103);
			types.add(LciatElementTypes.TemporalCondition_3104);
			types.add(LciatElementTypes.Notification_3105);
			types.add(LciatElementTypes.Condition_3106);
		} else if (relationshipType == LciatElementTypes.EnablingWInformation_4005) {
			types.add(LciatElementTypes.IndividualTask_3026);
			types.add(LciatElementTypes.GroupTask_3046);
			types.add(LciatElementTypes.AbstractTask_3061);
			types.add(LciatElementTypes.DetailedAbstractTask_3076);
			types.add(LciatElementTypes.IndividualTask_3077);
			types.add(LciatElementTypes.GroupTask_3078);
			types.add(LciatElementTypes.AbstractTask_3079);
			types.add(LciatElementTypes.DetailedAbstractTask_3080);
			types.add(LciatElementTypes.SessionPanel_3081);
			types.add(LciatElementTypes.Chat_3082);
			types.add(LciatElementTypes.TurnTakingTool_3083);
			types.add(LciatElementTypes.Telepointer_3084);
			types.add(LciatElementTypes.RadarView_3085);
			types.add(LciatElementTypes.Properties_3086);
			types.add(LciatElementTypes.Console_3087);
			types.add(LciatElementTypes.Problems_3088);
			types.add(LciatElementTypes.Init_3089);
			types.add(LciatElementTypes.End_3090);
			types.add(LciatElementTypes.TemporalCondition_3091);
			types.add(LciatElementTypes.Notification_3092);
			types.add(LciatElementTypes.Condition_3093);
			types.add(LciatElementTypes.SessionPanel_3094);
			types.add(LciatElementTypes.Chat_3095);
			types.add(LciatElementTypes.TurnTakingTool_3096);
			types.add(LciatElementTypes.Telepointer_3097);
			types.add(LciatElementTypes.RadarView_3098);
			types.add(LciatElementTypes.Properties_3099);
			types.add(LciatElementTypes.Console_3100);
			types.add(LciatElementTypes.Problems_3101);
			types.add(LciatElementTypes.Init_3102);
			types.add(LciatElementTypes.End_3103);
			types.add(LciatElementTypes.TemporalCondition_3104);
			types.add(LciatElementTypes.Notification_3105);
			types.add(LciatElementTypes.Condition_3106);
		} else if (relationshipType == LciatElementTypes.Choice_4006) {
			types.add(LciatElementTypes.IndividualTask_3026);
			types.add(LciatElementTypes.GroupTask_3046);
			types.add(LciatElementTypes.AbstractTask_3061);
			types.add(LciatElementTypes.DetailedAbstractTask_3076);
			types.add(LciatElementTypes.IndividualTask_3077);
			types.add(LciatElementTypes.GroupTask_3078);
			types.add(LciatElementTypes.AbstractTask_3079);
			types.add(LciatElementTypes.DetailedAbstractTask_3080);
			types.add(LciatElementTypes.SessionPanel_3081);
			types.add(LciatElementTypes.Chat_3082);
			types.add(LciatElementTypes.TurnTakingTool_3083);
			types.add(LciatElementTypes.Telepointer_3084);
			types.add(LciatElementTypes.RadarView_3085);
			types.add(LciatElementTypes.Properties_3086);
			types.add(LciatElementTypes.Console_3087);
			types.add(LciatElementTypes.Problems_3088);
			types.add(LciatElementTypes.Init_3089);
			types.add(LciatElementTypes.End_3090);
			types.add(LciatElementTypes.TemporalCondition_3091);
			types.add(LciatElementTypes.Notification_3092);
			types.add(LciatElementTypes.Condition_3093);
			types.add(LciatElementTypes.SessionPanel_3094);
			types.add(LciatElementTypes.Chat_3095);
			types.add(LciatElementTypes.TurnTakingTool_3096);
			types.add(LciatElementTypes.Telepointer_3097);
			types.add(LciatElementTypes.RadarView_3098);
			types.add(LciatElementTypes.Properties_3099);
			types.add(LciatElementTypes.Console_3100);
			types.add(LciatElementTypes.Problems_3101);
			types.add(LciatElementTypes.Init_3102);
			types.add(LciatElementTypes.End_3103);
			types.add(LciatElementTypes.TemporalCondition_3104);
			types.add(LciatElementTypes.Notification_3105);
			types.add(LciatElementTypes.Condition_3106);
		} else if (relationshipType == LciatElementTypes.Concurrency_4007) {
			types.add(LciatElementTypes.IndividualTask_3026);
			types.add(LciatElementTypes.GroupTask_3046);
			types.add(LciatElementTypes.AbstractTask_3061);
			types.add(LciatElementTypes.DetailedAbstractTask_3076);
			types.add(LciatElementTypes.IndividualTask_3077);
			types.add(LciatElementTypes.GroupTask_3078);
			types.add(LciatElementTypes.AbstractTask_3079);
			types.add(LciatElementTypes.DetailedAbstractTask_3080);
			types.add(LciatElementTypes.SessionPanel_3081);
			types.add(LciatElementTypes.Chat_3082);
			types.add(LciatElementTypes.TurnTakingTool_3083);
			types.add(LciatElementTypes.Telepointer_3084);
			types.add(LciatElementTypes.RadarView_3085);
			types.add(LciatElementTypes.Properties_3086);
			types.add(LciatElementTypes.Console_3087);
			types.add(LciatElementTypes.Problems_3088);
			types.add(LciatElementTypes.Init_3089);
			types.add(LciatElementTypes.End_3090);
			types.add(LciatElementTypes.TemporalCondition_3091);
			types.add(LciatElementTypes.Notification_3092);
			types.add(LciatElementTypes.Condition_3093);
			types.add(LciatElementTypes.SessionPanel_3094);
			types.add(LciatElementTypes.Chat_3095);
			types.add(LciatElementTypes.TurnTakingTool_3096);
			types.add(LciatElementTypes.Telepointer_3097);
			types.add(LciatElementTypes.RadarView_3098);
			types.add(LciatElementTypes.Properties_3099);
			types.add(LciatElementTypes.Console_3100);
			types.add(LciatElementTypes.Problems_3101);
			types.add(LciatElementTypes.Init_3102);
			types.add(LciatElementTypes.End_3103);
			types.add(LciatElementTypes.TemporalCondition_3104);
			types.add(LciatElementTypes.Notification_3105);
			types.add(LciatElementTypes.Condition_3106);
		} else if (relationshipType == LciatElementTypes.Traceability_4019) {
			types.add(LciatElementTypes.GraphicalEditor_3029);
			types.add(LciatElementTypes.TextEditor_3030);
			types.add(LciatElementTypes.CodeEditor_3031);
			types.add(LciatElementTypes.WebViewer_3032);
			types.add(LciatElementTypes.Tool_3044);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((SessionPanel2EditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(SessionPanel2EditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(LciatElementTypes.EnablingWOInformation_4004);
		types.add(LciatElementTypes.EnablingWInformation_4005);
		types.add(LciatElementTypes.Choice_4006);
		types.add(LciatElementTypes.Concurrency_4007);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((SessionPanel2EditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(SessionPanel2EditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == LciatElementTypes.EnablingWOInformation_4004) {
			types.add(LciatElementTypes.IndividualTask_3026);
			types.add(LciatElementTypes.GroupTask_3046);
			types.add(LciatElementTypes.AbstractTask_3061);
			types.add(LciatElementTypes.DetailedAbstractTask_3076);
			types.add(LciatElementTypes.IndividualTask_3077);
			types.add(LciatElementTypes.GroupTask_3078);
			types.add(LciatElementTypes.AbstractTask_3079);
			types.add(LciatElementTypes.DetailedAbstractTask_3080);
			types.add(LciatElementTypes.SessionPanel_3081);
			types.add(LciatElementTypes.Chat_3082);
			types.add(LciatElementTypes.TurnTakingTool_3083);
			types.add(LciatElementTypes.Telepointer_3084);
			types.add(LciatElementTypes.RadarView_3085);
			types.add(LciatElementTypes.Properties_3086);
			types.add(LciatElementTypes.Console_3087);
			types.add(LciatElementTypes.Problems_3088);
			types.add(LciatElementTypes.Init_3089);
			types.add(LciatElementTypes.End_3090);
			types.add(LciatElementTypes.TemporalCondition_3091);
			types.add(LciatElementTypes.Notification_3092);
			types.add(LciatElementTypes.Condition_3093);
			types.add(LciatElementTypes.SessionPanel_3094);
			types.add(LciatElementTypes.Chat_3095);
			types.add(LciatElementTypes.TurnTakingTool_3096);
			types.add(LciatElementTypes.Telepointer_3097);
			types.add(LciatElementTypes.RadarView_3098);
			types.add(LciatElementTypes.Properties_3099);
			types.add(LciatElementTypes.Console_3100);
			types.add(LciatElementTypes.Problems_3101);
			types.add(LciatElementTypes.Init_3102);
			types.add(LciatElementTypes.End_3103);
			types.add(LciatElementTypes.TemporalCondition_3104);
			types.add(LciatElementTypes.Notification_3105);
			types.add(LciatElementTypes.Condition_3106);
		} else if (relationshipType == LciatElementTypes.EnablingWInformation_4005) {
			types.add(LciatElementTypes.IndividualTask_3026);
			types.add(LciatElementTypes.GroupTask_3046);
			types.add(LciatElementTypes.AbstractTask_3061);
			types.add(LciatElementTypes.DetailedAbstractTask_3076);
			types.add(LciatElementTypes.IndividualTask_3077);
			types.add(LciatElementTypes.GroupTask_3078);
			types.add(LciatElementTypes.AbstractTask_3079);
			types.add(LciatElementTypes.DetailedAbstractTask_3080);
			types.add(LciatElementTypes.SessionPanel_3081);
			types.add(LciatElementTypes.Chat_3082);
			types.add(LciatElementTypes.TurnTakingTool_3083);
			types.add(LciatElementTypes.Telepointer_3084);
			types.add(LciatElementTypes.RadarView_3085);
			types.add(LciatElementTypes.Properties_3086);
			types.add(LciatElementTypes.Console_3087);
			types.add(LciatElementTypes.Problems_3088);
			types.add(LciatElementTypes.Init_3089);
			types.add(LciatElementTypes.End_3090);
			types.add(LciatElementTypes.TemporalCondition_3091);
			types.add(LciatElementTypes.Notification_3092);
			types.add(LciatElementTypes.Condition_3093);
			types.add(LciatElementTypes.SessionPanel_3094);
			types.add(LciatElementTypes.Chat_3095);
			types.add(LciatElementTypes.TurnTakingTool_3096);
			types.add(LciatElementTypes.Telepointer_3097);
			types.add(LciatElementTypes.RadarView_3098);
			types.add(LciatElementTypes.Properties_3099);
			types.add(LciatElementTypes.Console_3100);
			types.add(LciatElementTypes.Problems_3101);
			types.add(LciatElementTypes.Init_3102);
			types.add(LciatElementTypes.End_3103);
			types.add(LciatElementTypes.TemporalCondition_3104);
			types.add(LciatElementTypes.Notification_3105);
			types.add(LciatElementTypes.Condition_3106);
		} else if (relationshipType == LciatElementTypes.Choice_4006) {
			types.add(LciatElementTypes.IndividualTask_3026);
			types.add(LciatElementTypes.GroupTask_3046);
			types.add(LciatElementTypes.AbstractTask_3061);
			types.add(LciatElementTypes.DetailedAbstractTask_3076);
			types.add(LciatElementTypes.IndividualTask_3077);
			types.add(LciatElementTypes.GroupTask_3078);
			types.add(LciatElementTypes.AbstractTask_3079);
			types.add(LciatElementTypes.DetailedAbstractTask_3080);
			types.add(LciatElementTypes.SessionPanel_3081);
			types.add(LciatElementTypes.Chat_3082);
			types.add(LciatElementTypes.TurnTakingTool_3083);
			types.add(LciatElementTypes.Telepointer_3084);
			types.add(LciatElementTypes.RadarView_3085);
			types.add(LciatElementTypes.Properties_3086);
			types.add(LciatElementTypes.Console_3087);
			types.add(LciatElementTypes.Problems_3088);
			types.add(LciatElementTypes.Init_3089);
			types.add(LciatElementTypes.End_3090);
			types.add(LciatElementTypes.TemporalCondition_3091);
			types.add(LciatElementTypes.Notification_3092);
			types.add(LciatElementTypes.Condition_3093);
			types.add(LciatElementTypes.SessionPanel_3094);
			types.add(LciatElementTypes.Chat_3095);
			types.add(LciatElementTypes.TurnTakingTool_3096);
			types.add(LciatElementTypes.Telepointer_3097);
			types.add(LciatElementTypes.RadarView_3098);
			types.add(LciatElementTypes.Properties_3099);
			types.add(LciatElementTypes.Console_3100);
			types.add(LciatElementTypes.Problems_3101);
			types.add(LciatElementTypes.Init_3102);
			types.add(LciatElementTypes.End_3103);
			types.add(LciatElementTypes.TemporalCondition_3104);
			types.add(LciatElementTypes.Notification_3105);
			types.add(LciatElementTypes.Condition_3106);
		} else if (relationshipType == LciatElementTypes.Concurrency_4007) {
			types.add(LciatElementTypes.IndividualTask_3026);
			types.add(LciatElementTypes.GroupTask_3046);
			types.add(LciatElementTypes.AbstractTask_3061);
			types.add(LciatElementTypes.DetailedAbstractTask_3076);
			types.add(LciatElementTypes.IndividualTask_3077);
			types.add(LciatElementTypes.GroupTask_3078);
			types.add(LciatElementTypes.AbstractTask_3079);
			types.add(LciatElementTypes.DetailedAbstractTask_3080);
			types.add(LciatElementTypes.SessionPanel_3081);
			types.add(LciatElementTypes.Chat_3082);
			types.add(LciatElementTypes.TurnTakingTool_3083);
			types.add(LciatElementTypes.Telepointer_3084);
			types.add(LciatElementTypes.RadarView_3085);
			types.add(LciatElementTypes.Properties_3086);
			types.add(LciatElementTypes.Console_3087);
			types.add(LciatElementTypes.Problems_3088);
			types.add(LciatElementTypes.Init_3089);
			types.add(LciatElementTypes.End_3090);
			types.add(LciatElementTypes.TemporalCondition_3091);
			types.add(LciatElementTypes.Notification_3092);
			types.add(LciatElementTypes.Condition_3093);
			types.add(LciatElementTypes.SessionPanel_3094);
			types.add(LciatElementTypes.Chat_3095);
			types.add(LciatElementTypes.TurnTakingTool_3096);
			types.add(LciatElementTypes.Telepointer_3097);
			types.add(LciatElementTypes.RadarView_3098);
			types.add(LciatElementTypes.Properties_3099);
			types.add(LciatElementTypes.Console_3100);
			types.add(LciatElementTypes.Problems_3101);
			types.add(LciatElementTypes.Init_3102);
			types.add(LciatElementTypes.End_3103);
			types.add(LciatElementTypes.TemporalCondition_3104);
			types.add(LciatElementTypes.Notification_3105);
			types.add(LciatElementTypes.Condition_3106);
		}
		return types;
	}

}
