/*
* 
*/
package lciat.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import lciat.diagram.edit.parts.*;
import lciat.diagram.part.LciatDiagramEditorPlugin;
import lciat.diagram.part.LciatVisualIDRegistry;
import lciat.diagram.providers.LciatElementTypes;
import lciat.diagram.providers.LciatParserProvider;

/**
 * @generated
 */
public class LciatNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		LciatDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		LciatDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof LciatNavigatorItem && !isOwnView(((LciatNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof LciatNavigatorGroup) {
			LciatNavigatorGroup group = (LciatNavigatorGroup) element;
			return LciatDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof LciatNavigatorItem) {
			LciatNavigatorItem navigatorItem = (LciatNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (LciatVisualIDRegistry.getVisualID(view)) {
		case LCIANDiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?lciat?LCIANDiagram", LciatElementTypes.LCIANDiagram_1000); //$NON-NLS-1$
		case SociogramEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?lciat?Sociogram", LciatElementTypes.Sociogram_2001); //$NON-NLS-1$
		case LearningDiagramEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?lciat?LearningDiagram", LciatElementTypes.LearningDiagram_2002); //$NON-NLS-1$
		case CTTDiagramEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?lciat?CTTDiagram", LciatElementTypes.CTTDiagram_2003); //$NON-NLS-1$
		case RolEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Rol", LciatElementTypes.Rol_3001); //$NON-NLS-1$
		case GroupEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Group", LciatElementTypes.Group_3002); //$NON-NLS-1$
		case MolefContent1EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefContent1", LciatElementTypes.MolefContent1_3003); //$NON-NLS-1$
		case MolefContent2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefContent2", LciatElementTypes.MolefContent2_3004); //$NON-NLS-1$
		case MolefContent3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefContent3", LciatElementTypes.MolefContent3_3005); //$NON-NLS-1$
		case MolefContent4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefContent4", LciatElementTypes.MolefContent4_3006); //$NON-NLS-1$
		case MolefContent5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefContent5", LciatElementTypes.MolefContent5_3007); //$NON-NLS-1$
		case MolefContent6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefContent6", LciatElementTypes.MolefContent6_3008); //$NON-NLS-1$
		case MolefTActivities1EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefTActivities1", LciatElementTypes.MolefTActivities1_3009); //$NON-NLS-1$
		case MolefTActivities2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefTActivities2", LciatElementTypes.MolefTActivities2_3010); //$NON-NLS-1$
		case MolefTActivities3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefTActivities3", LciatElementTypes.MolefTActivities3_3011); //$NON-NLS-1$
		case MolefTActivities4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefTActivities4", LciatElementTypes.MolefTActivities4_3012); //$NON-NLS-1$
		case MolefTActivities5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefTActivities5", LciatElementTypes.MolefTActivities5_3013); //$NON-NLS-1$
		case MolefTActivities6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefTActivities6", LciatElementTypes.MolefTActivities6_3014); //$NON-NLS-1$
		case MolefTActivities7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefTActivities7", LciatElementTypes.MolefTActivities7_3015); //$NON-NLS-1$
		case MolefTActivities8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefTActivities8", LciatElementTypes.MolefTActivities8_3016); //$NON-NLS-1$
		case MolefSocial1EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefSocial1", LciatElementTypes.MolefSocial1_3017); //$NON-NLS-1$
		case MolefSocial2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefSocial2", LciatElementTypes.MolefSocial2_3018); //$NON-NLS-1$
		case MolefSocial3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefSocial3", LciatElementTypes.MolefSocial3_3019); //$NON-NLS-1$
		case MolefSocial4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefSocial4", LciatElementTypes.MolefSocial4_3020); //$NON-NLS-1$
		case MolefPersonalization1EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefPersonalization1", LciatElementTypes.MolefPersonalization1_3021); //$NON-NLS-1$
		case MolefPersonalization2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefPersonalization2", LciatElementTypes.MolefPersonalization2_3022); //$NON-NLS-1$
		case MolefPersonalization3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefPersonalization3", LciatElementTypes.MolefPersonalization3_3023); //$NON-NLS-1$
		case MolefPersonalization4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefPersonalization4", LciatElementTypes.MolefPersonalization4_3024); //$NON-NLS-1$
		case MolefPersonalization5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefPersonalization5", LciatElementTypes.MolefPersonalization5_3025); //$NON-NLS-1$
		case IndividualTaskEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?IndividualTask", LciatElementTypes.IndividualTask_3026); //$NON-NLS-1$
		case Rol2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Rol", LciatElementTypes.Rol_3027); //$NON-NLS-1$
		case Group2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Group", LciatElementTypes.Group_3028); //$NON-NLS-1$
		case GraphicalEditorEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?GraphicalEditor", LciatElementTypes.GraphicalEditor_3029); //$NON-NLS-1$
		case TextEditorEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?TextEditor", LciatElementTypes.TextEditor_3030); //$NON-NLS-1$
		case CodeEditorEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?CodeEditor", LciatElementTypes.CodeEditor_3031); //$NON-NLS-1$
		case WebViewerEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?WebViewer", LciatElementTypes.WebViewer_3032); //$NON-NLS-1$
		case AssimilativeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Assimilative", LciatElementTypes.Assimilative_3033); //$NON-NLS-1$
		case InformationHandlingEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?InformationHandling", LciatElementTypes.InformationHandling_3034); //$NON-NLS-1$
		case AdaptiveEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Adaptive", LciatElementTypes.Adaptive_3035); //$NON-NLS-1$
		case CommunicativeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Communicative", LciatElementTypes.Communicative_3036); //$NON-NLS-1$
		case ProductiveEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Productive", LciatElementTypes.Productive_3037); //$NON-NLS-1$
		case ExperientialEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Experiential", LciatElementTypes.Experiential_3038); //$NON-NLS-1$
		case EvaluativeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Evaluative", LciatElementTypes.Evaluative_3039); //$NON-NLS-1$
		case SupportEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Support", LciatElementTypes.Support_3040); //$NON-NLS-1$
		case FaceToFaceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?FaceToFace", LciatElementTypes.FaceToFace_3041); //$NON-NLS-1$
		case ComputerSupportedEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?ComputerSupported", LciatElementTypes.ComputerSupported_3042); //$NON-NLS-1$
		case OnlineEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Online", LciatElementTypes.Online_3043); //$NON-NLS-1$
		case ToolEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Tool", LciatElementTypes.Tool_3044); //$NON-NLS-1$
		case ObjectEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Object", LciatElementTypes.Object_3045); //$NON-NLS-1$
		case GroupTaskEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?GroupTask", LciatElementTypes.GroupTask_3046); //$NON-NLS-1$
		case Rol3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Rol", LciatElementTypes.Rol_3047); //$NON-NLS-1$
		case Group3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Group", LciatElementTypes.Group_3048); //$NON-NLS-1$
		case Assimilative2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Assimilative", LciatElementTypes.Assimilative_3049); //$NON-NLS-1$
		case InformationHandling2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?InformationHandling", LciatElementTypes.InformationHandling_3050); //$NON-NLS-1$
		case Adaptive2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Adaptive", LciatElementTypes.Adaptive_3051); //$NON-NLS-1$
		case Communicative2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Communicative", LciatElementTypes.Communicative_3052); //$NON-NLS-1$
		case Productive2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Productive", LciatElementTypes.Productive_3053); //$NON-NLS-1$
		case Experiential2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Experiential", LciatElementTypes.Experiential_3054); //$NON-NLS-1$
		case Evaluative2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Evaluative", LciatElementTypes.Evaluative_3055); //$NON-NLS-1$
		case Support2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Support", LciatElementTypes.Support_3056); //$NON-NLS-1$
		case FaceToFace2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?FaceToFace", LciatElementTypes.FaceToFace_3057); //$NON-NLS-1$
		case ComputerSupported2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?ComputerSupported", LciatElementTypes.ComputerSupported_3058); //$NON-NLS-1$
		case Online2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Online", LciatElementTypes.Online_3059); //$NON-NLS-1$
		case Object2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Object", LciatElementTypes.Object_3060); //$NON-NLS-1$
		case AbstractTaskEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?AbstractTask", LciatElementTypes.AbstractTask_3061); //$NON-NLS-1$
		case Rol4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Rol", LciatElementTypes.Rol_3062); //$NON-NLS-1$
		case Group4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Group", LciatElementTypes.Group_3063); //$NON-NLS-1$
		case Assimilative3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Assimilative", LciatElementTypes.Assimilative_3064); //$NON-NLS-1$
		case InformationHandling3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?InformationHandling", LciatElementTypes.InformationHandling_3065); //$NON-NLS-1$
		case Adaptive3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Adaptive", LciatElementTypes.Adaptive_3066); //$NON-NLS-1$
		case Communicative3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Communicative", LciatElementTypes.Communicative_3067); //$NON-NLS-1$
		case Productive3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Productive", LciatElementTypes.Productive_3068); //$NON-NLS-1$
		case Experiential3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Experiential", LciatElementTypes.Experiential_3069); //$NON-NLS-1$
		case Evaluative3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Evaluative", LciatElementTypes.Evaluative_3070); //$NON-NLS-1$
		case Support3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Support", LciatElementTypes.Support_3071); //$NON-NLS-1$
		case FaceToFace3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?FaceToFace", LciatElementTypes.FaceToFace_3072); //$NON-NLS-1$
		case ComputerSupported3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?ComputerSupported", LciatElementTypes.ComputerSupported_3073); //$NON-NLS-1$
		case Online3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Online", LciatElementTypes.Online_3074); //$NON-NLS-1$
		case Object3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Object", LciatElementTypes.Object_3075); //$NON-NLS-1$
		case DetailedAbstractTaskEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?DetailedAbstractTask", LciatElementTypes.DetailedAbstractTask_3076); //$NON-NLS-1$
		case IndividualTask2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?IndividualTask", LciatElementTypes.IndividualTask_3077); //$NON-NLS-1$
		case GroupTask2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?GroupTask", LciatElementTypes.GroupTask_3078); //$NON-NLS-1$
		case AbstractTask2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?AbstractTask", LciatElementTypes.AbstractTask_3079); //$NON-NLS-1$
		case DetailedAbstractTask2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?DetailedAbstractTask", LciatElementTypes.DetailedAbstractTask_3080); //$NON-NLS-1$
		case SessionPanelEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?SessionPanel", LciatElementTypes.SessionPanel_3081); //$NON-NLS-1$
		case ChatEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Chat", LciatElementTypes.Chat_3082); //$NON-NLS-1$
		case TurnTakingToolEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?TurnTakingTool", LciatElementTypes.TurnTakingTool_3083); //$NON-NLS-1$
		case TelepointerEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Telepointer", LciatElementTypes.Telepointer_3084); //$NON-NLS-1$
		case RadarViewEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?RadarView", LciatElementTypes.RadarView_3085); //$NON-NLS-1$
		case PropertiesEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Properties", LciatElementTypes.Properties_3086); //$NON-NLS-1$
		case ConsoleEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Console", LciatElementTypes.Console_3087); //$NON-NLS-1$
		case ProblemsEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Problems", LciatElementTypes.Problems_3088); //$NON-NLS-1$
		case InitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Init", LciatElementTypes.Init_3089); //$NON-NLS-1$
		case EndEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?End", LciatElementTypes.End_3090); //$NON-NLS-1$
		case TemporalConditionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?TemporalCondition", LciatElementTypes.TemporalCondition_3091); //$NON-NLS-1$
		case NotificationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Notification", LciatElementTypes.Notification_3092); //$NON-NLS-1$
		case ConditionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Condition", LciatElementTypes.Condition_3093); //$NON-NLS-1$
		case SessionPanel2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?SessionPanel", LciatElementTypes.SessionPanel_3094); //$NON-NLS-1$
		case Chat2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Chat", LciatElementTypes.Chat_3095); //$NON-NLS-1$
		case TurnTakingTool2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?TurnTakingTool", LciatElementTypes.TurnTakingTool_3096); //$NON-NLS-1$
		case Telepointer2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Telepointer", LciatElementTypes.Telepointer_3097); //$NON-NLS-1$
		case RadarView2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?RadarView", LciatElementTypes.RadarView_3098); //$NON-NLS-1$
		case Properties2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Properties", LciatElementTypes.Properties_3099); //$NON-NLS-1$
		case Console2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Console", LciatElementTypes.Console_3100); //$NON-NLS-1$
		case Problems2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Problems", LciatElementTypes.Problems_3101); //$NON-NLS-1$
		case Init2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Init", LciatElementTypes.Init_3102); //$NON-NLS-1$
		case End2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?End", LciatElementTypes.End_3103); //$NON-NLS-1$
		case TemporalCondition2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?TemporalCondition", LciatElementTypes.TemporalCondition_3104); //$NON-NLS-1$
		case Notification2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Notification", LciatElementTypes.Notification_3105); //$NON-NLS-1$
		case Condition2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?Condition", LciatElementTypes.Condition_3106); //$NON-NLS-1$
		case MolefMultimedia1EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefMultimedia1", LciatElementTypes.MolefMultimedia1_3107); //$NON-NLS-1$
		case MolefMultimedia2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefMultimedia2", LciatElementTypes.MolefMultimedia2_3108); //$NON-NLS-1$
		case MolefMultimedia3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefMultimedia3", LciatElementTypes.MolefMultimedia3_3109); //$NON-NLS-1$
		case MolefMultimedia4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefMultimedia4", LciatElementTypes.MolefMultimedia4_3110); //$NON-NLS-1$
		case MolefMultimedia5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefMultimedia5", LciatElementTypes.MolefMultimedia5_3111); //$NON-NLS-1$
		case MolefMultimedia6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefMultimedia6", LciatElementTypes.MolefMultimedia6_3112); //$NON-NLS-1$
		case MolefMultimedia7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?MolefMultimedia7", LciatElementTypes.MolefMultimedia7_3113); //$NON-NLS-1$
		case ExclusiveEditionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?ExclusiveEdition", LciatElementTypes.ExclusiveEdition_3114); //$NON-NLS-1$
		case CollaborativeVisualizationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?CollaborativeVisualization", //$NON-NLS-1$
					LciatElementTypes.CollaborativeVisualization_3115);
		case IndividualVisualizationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?IndividualVisualization", //$NON-NLS-1$
					LciatElementTypes.IndividualVisualization_3116);
		case UserTaskEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?UserTask", LciatElementTypes.UserTask_3117); //$NON-NLS-1$
		case CTTAbstractTaskEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?CTTAbstractTask", LciatElementTypes.CTTAbstractTask_3118); //$NON-NLS-1$
		case InteractiveTaskEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?InteractiveTask", LciatElementTypes.InteractiveTask_3119); //$NON-NLS-1$
		case CTTCollaborativeTaskEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?CTTCollaborativeTask", LciatElementTypes.CTTCollaborativeTask_3120); //$NON-NLS-1$
		case ApplicationTaskEditPart.VISUAL_ID:
			return getImage("Navigator?Node?lciat?ApplicationTask", LciatElementTypes.ApplicationTask_3121); //$NON-NLS-1$
		case InheritanceEditPart.VISUAL_ID:
			return getImage("Navigator?Link?lciat?Inheritance", LciatElementTypes.Inheritance_4001); //$NON-NLS-1$
		case ActingEditPart.VISUAL_ID:
			return getImage("Navigator?Link?lciat?Acting", LciatElementTypes.Acting_4002); //$NON-NLS-1$
		case AssociationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?lciat?Association", LciatElementTypes.Association_4003); //$NON-NLS-1$
		case EnablingWOInformationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?lciat?EnablingWOInformation", LciatElementTypes.EnablingWOInformation_4004); //$NON-NLS-1$
		case EnablingWInformationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?lciat?EnablingWInformation", LciatElementTypes.EnablingWInformation_4005); //$NON-NLS-1$
		case ChoiceEditPart.VISUAL_ID:
			return getImage("Navigator?Link?lciat?Choice", LciatElementTypes.Choice_4006); //$NON-NLS-1$
		case ConcurrencyEditPart.VISUAL_ID:
			return getImage("Navigator?Link?lciat?Concurrency", LciatElementTypes.Concurrency_4007); //$NON-NLS-1$
		case AggregationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?lciat?Aggregation", LciatElementTypes.Aggregation_4008); //$NON-NLS-1$
		case EnablingEditPart.VISUAL_ID:
			return getImage("Navigator?Link?lciat?Enabling", LciatElementTypes.Enabling_4009); //$NON-NLS-1$
		case DisablingEditPart.VISUAL_ID:
			return getImage("Navigator?Link?lciat?Disabling", LciatElementTypes.Disabling_4010); //$NON-NLS-1$
		case EnablingWithInformationPassingEditPart.VISUAL_ID:
			return getImage("Navigator?Link?lciat?EnablingWithInformationPassing", //$NON-NLS-1$
					LciatElementTypes.EnablingWithInformationPassing_4011);
		case DisablingWithInformationPassingEditPart.VISUAL_ID:
			return getImage("Navigator?Link?lciat?DisablingWithInformationPassing", //$NON-NLS-1$
					LciatElementTypes.DisablingWithInformationPassing_4012);
		case IndependentConcurrencyEditPart.VISUAL_ID:
			return getImage("Navigator?Link?lciat?IndependentConcurrency", //$NON-NLS-1$
					LciatElementTypes.IndependentConcurrency_4013);
		case OrderIndependenceEditPart.VISUAL_ID:
			return getImage("Navigator?Link?lciat?OrderIndependence", LciatElementTypes.OrderIndependence_4014); //$NON-NLS-1$
		case SuspendResumeEditPart.VISUAL_ID:
			return getImage("Navigator?Link?lciat?SuspendResume", LciatElementTypes.SuspendResume_4015); //$NON-NLS-1$
		case ConcurrencyWithInformationPassingEditPart.VISUAL_ID:
			return getImage("Navigator?Link?lciat?ConcurrencyWithInformationPassing", //$NON-NLS-1$
					LciatElementTypes.ConcurrencyWithInformationPassing_4016);
		case DeterministicChoiceEditPart.VISUAL_ID:
			return getImage("Navigator?Link?lciat?DeterministicChoice", LciatElementTypes.DeterministicChoice_4017); //$NON-NLS-1$
		case UndeterministicChoiceEditPart.VISUAL_ID:
			return getImage("Navigator?Link?lciat?UndeterministicChoice", LciatElementTypes.UndeterministicChoice_4018); //$NON-NLS-1$
		case TraceabilityEditPart.VISUAL_ID:
			return getImage("Navigator?Link?lciat?Traceability", LciatElementTypes.Traceability_4019); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = LciatDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && LciatElementTypes.isKnownElementType(elementType)) {
			image = LciatElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof LciatNavigatorGroup) {
			LciatNavigatorGroup group = (LciatNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof LciatNavigatorItem) {
			LciatNavigatorItem navigatorItem = (LciatNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (LciatVisualIDRegistry.getVisualID(view)) {
		case LCIANDiagramEditPart.VISUAL_ID:
			return getLCIANDiagram_1000Text(view);
		case SociogramEditPart.VISUAL_ID:
			return getSociogram_2001Text(view);
		case LearningDiagramEditPart.VISUAL_ID:
			return getLearningDiagram_2002Text(view);
		case CTTDiagramEditPart.VISUAL_ID:
			return getCTTDiagram_2003Text(view);
		case RolEditPart.VISUAL_ID:
			return getRol_3001Text(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3002Text(view);
		case MolefContent1EditPart.VISUAL_ID:
			return getMolefContent1_3003Text(view);
		case MolefContent2EditPart.VISUAL_ID:
			return getMolefContent2_3004Text(view);
		case MolefContent3EditPart.VISUAL_ID:
			return getMolefContent3_3005Text(view);
		case MolefContent4EditPart.VISUAL_ID:
			return getMolefContent4_3006Text(view);
		case MolefContent5EditPart.VISUAL_ID:
			return getMolefContent5_3007Text(view);
		case MolefContent6EditPart.VISUAL_ID:
			return getMolefContent6_3008Text(view);
		case MolefTActivities1EditPart.VISUAL_ID:
			return getMolefTActivities1_3009Text(view);
		case MolefTActivities2EditPart.VISUAL_ID:
			return getMolefTActivities2_3010Text(view);
		case MolefTActivities3EditPart.VISUAL_ID:
			return getMolefTActivities3_3011Text(view);
		case MolefTActivities4EditPart.VISUAL_ID:
			return getMolefTActivities4_3012Text(view);
		case MolefTActivities5EditPart.VISUAL_ID:
			return getMolefTActivities5_3013Text(view);
		case MolefTActivities6EditPart.VISUAL_ID:
			return getMolefTActivities6_3014Text(view);
		case MolefTActivities7EditPart.VISUAL_ID:
			return getMolefTActivities7_3015Text(view);
		case MolefTActivities8EditPart.VISUAL_ID:
			return getMolefTActivities8_3016Text(view);
		case MolefSocial1EditPart.VISUAL_ID:
			return getMolefSocial1_3017Text(view);
		case MolefSocial2EditPart.VISUAL_ID:
			return getMolefSocial2_3018Text(view);
		case MolefSocial3EditPart.VISUAL_ID:
			return getMolefSocial3_3019Text(view);
		case MolefSocial4EditPart.VISUAL_ID:
			return getMolefSocial4_3020Text(view);
		case MolefPersonalization1EditPart.VISUAL_ID:
			return getMolefPersonalization1_3021Text(view);
		case MolefPersonalization2EditPart.VISUAL_ID:
			return getMolefPersonalization2_3022Text(view);
		case MolefPersonalization3EditPart.VISUAL_ID:
			return getMolefPersonalization3_3023Text(view);
		case MolefPersonalization4EditPart.VISUAL_ID:
			return getMolefPersonalization4_3024Text(view);
		case MolefPersonalization5EditPart.VISUAL_ID:
			return getMolefPersonalization5_3025Text(view);
		case IndividualTaskEditPart.VISUAL_ID:
			return getIndividualTask_3026Text(view);
		case Rol2EditPart.VISUAL_ID:
			return getRol_3027Text(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3028Text(view);
		case GraphicalEditorEditPart.VISUAL_ID:
			return getGraphicalEditor_3029Text(view);
		case TextEditorEditPart.VISUAL_ID:
			return getTextEditor_3030Text(view);
		case CodeEditorEditPart.VISUAL_ID:
			return getCodeEditor_3031Text(view);
		case WebViewerEditPart.VISUAL_ID:
			return getWebViewer_3032Text(view);
		case AssimilativeEditPart.VISUAL_ID:
			return getAssimilative_3033Text(view);
		case InformationHandlingEditPart.VISUAL_ID:
			return getInformationHandling_3034Text(view);
		case AdaptiveEditPart.VISUAL_ID:
			return getAdaptive_3035Text(view);
		case CommunicativeEditPart.VISUAL_ID:
			return getCommunicative_3036Text(view);
		case ProductiveEditPart.VISUAL_ID:
			return getProductive_3037Text(view);
		case ExperientialEditPart.VISUAL_ID:
			return getExperiential_3038Text(view);
		case EvaluativeEditPart.VISUAL_ID:
			return getEvaluative_3039Text(view);
		case SupportEditPart.VISUAL_ID:
			return getSupport_3040Text(view);
		case FaceToFaceEditPart.VISUAL_ID:
			return getFaceToFace_3041Text(view);
		case ComputerSupportedEditPart.VISUAL_ID:
			return getComputerSupported_3042Text(view);
		case OnlineEditPart.VISUAL_ID:
			return getOnline_3043Text(view);
		case ToolEditPart.VISUAL_ID:
			return getTool_3044Text(view);
		case ObjectEditPart.VISUAL_ID:
			return getObject_3045Text(view);
		case GroupTaskEditPart.VISUAL_ID:
			return getGroupTask_3046Text(view);
		case Rol3EditPart.VISUAL_ID:
			return getRol_3047Text(view);
		case Group3EditPart.VISUAL_ID:
			return getGroup_3048Text(view);
		case Assimilative2EditPart.VISUAL_ID:
			return getAssimilative_3049Text(view);
		case InformationHandling2EditPart.VISUAL_ID:
			return getInformationHandling_3050Text(view);
		case Adaptive2EditPart.VISUAL_ID:
			return getAdaptive_3051Text(view);
		case Communicative2EditPart.VISUAL_ID:
			return getCommunicative_3052Text(view);
		case Productive2EditPart.VISUAL_ID:
			return getProductive_3053Text(view);
		case Experiential2EditPart.VISUAL_ID:
			return getExperiential_3054Text(view);
		case Evaluative2EditPart.VISUAL_ID:
			return getEvaluative_3055Text(view);
		case Support2EditPart.VISUAL_ID:
			return getSupport_3056Text(view);
		case FaceToFace2EditPart.VISUAL_ID:
			return getFaceToFace_3057Text(view);
		case ComputerSupported2EditPart.VISUAL_ID:
			return getComputerSupported_3058Text(view);
		case Online2EditPart.VISUAL_ID:
			return getOnline_3059Text(view);
		case Object2EditPart.VISUAL_ID:
			return getObject_3060Text(view);
		case AbstractTaskEditPart.VISUAL_ID:
			return getAbstractTask_3061Text(view);
		case Rol4EditPart.VISUAL_ID:
			return getRol_3062Text(view);
		case Group4EditPart.VISUAL_ID:
			return getGroup_3063Text(view);
		case Assimilative3EditPart.VISUAL_ID:
			return getAssimilative_3064Text(view);
		case InformationHandling3EditPart.VISUAL_ID:
			return getInformationHandling_3065Text(view);
		case Adaptive3EditPart.VISUAL_ID:
			return getAdaptive_3066Text(view);
		case Communicative3EditPart.VISUAL_ID:
			return getCommunicative_3067Text(view);
		case Productive3EditPart.VISUAL_ID:
			return getProductive_3068Text(view);
		case Experiential3EditPart.VISUAL_ID:
			return getExperiential_3069Text(view);
		case Evaluative3EditPart.VISUAL_ID:
			return getEvaluative_3070Text(view);
		case Support3EditPart.VISUAL_ID:
			return getSupport_3071Text(view);
		case FaceToFace3EditPart.VISUAL_ID:
			return getFaceToFace_3072Text(view);
		case ComputerSupported3EditPart.VISUAL_ID:
			return getComputerSupported_3073Text(view);
		case Online3EditPart.VISUAL_ID:
			return getOnline_3074Text(view);
		case Object3EditPart.VISUAL_ID:
			return getObject_3075Text(view);
		case DetailedAbstractTaskEditPart.VISUAL_ID:
			return getDetailedAbstractTask_3076Text(view);
		case IndividualTask2EditPart.VISUAL_ID:
			return getIndividualTask_3077Text(view);
		case GroupTask2EditPart.VISUAL_ID:
			return getGroupTask_3078Text(view);
		case AbstractTask2EditPart.VISUAL_ID:
			return getAbstractTask_3079Text(view);
		case DetailedAbstractTask2EditPart.VISUAL_ID:
			return getDetailedAbstractTask_3080Text(view);
		case SessionPanelEditPart.VISUAL_ID:
			return getSessionPanel_3081Text(view);
		case ChatEditPart.VISUAL_ID:
			return getChat_3082Text(view);
		case TurnTakingToolEditPart.VISUAL_ID:
			return getTurnTakingTool_3083Text(view);
		case TelepointerEditPart.VISUAL_ID:
			return getTelepointer_3084Text(view);
		case RadarViewEditPart.VISUAL_ID:
			return getRadarView_3085Text(view);
		case PropertiesEditPart.VISUAL_ID:
			return getProperties_3086Text(view);
		case ConsoleEditPart.VISUAL_ID:
			return getConsole_3087Text(view);
		case ProblemsEditPart.VISUAL_ID:
			return getProblems_3088Text(view);
		case InitEditPart.VISUAL_ID:
			return getInit_3089Text(view);
		case EndEditPart.VISUAL_ID:
			return getEnd_3090Text(view);
		case TemporalConditionEditPart.VISUAL_ID:
			return getTemporalCondition_3091Text(view);
		case NotificationEditPart.VISUAL_ID:
			return getNotification_3092Text(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_3093Text(view);
		case SessionPanel2EditPart.VISUAL_ID:
			return getSessionPanel_3094Text(view);
		case Chat2EditPart.VISUAL_ID:
			return getChat_3095Text(view);
		case TurnTakingTool2EditPart.VISUAL_ID:
			return getTurnTakingTool_3096Text(view);
		case Telepointer2EditPart.VISUAL_ID:
			return getTelepointer_3097Text(view);
		case RadarView2EditPart.VISUAL_ID:
			return getRadarView_3098Text(view);
		case Properties2EditPart.VISUAL_ID:
			return getProperties_3099Text(view);
		case Console2EditPart.VISUAL_ID:
			return getConsole_3100Text(view);
		case Problems2EditPart.VISUAL_ID:
			return getProblems_3101Text(view);
		case Init2EditPart.VISUAL_ID:
			return getInit_3102Text(view);
		case End2EditPart.VISUAL_ID:
			return getEnd_3103Text(view);
		case TemporalCondition2EditPart.VISUAL_ID:
			return getTemporalCondition_3104Text(view);
		case Notification2EditPart.VISUAL_ID:
			return getNotification_3105Text(view);
		case Condition2EditPart.VISUAL_ID:
			return getCondition_3106Text(view);
		case MolefMultimedia1EditPart.VISUAL_ID:
			return getMolefMultimedia1_3107Text(view);
		case MolefMultimedia2EditPart.VISUAL_ID:
			return getMolefMultimedia2_3108Text(view);
		case MolefMultimedia3EditPart.VISUAL_ID:
			return getMolefMultimedia3_3109Text(view);
		case MolefMultimedia4EditPart.VISUAL_ID:
			return getMolefMultimedia4_3110Text(view);
		case MolefMultimedia5EditPart.VISUAL_ID:
			return getMolefMultimedia5_3111Text(view);
		case MolefMultimedia6EditPart.VISUAL_ID:
			return getMolefMultimedia6_3112Text(view);
		case MolefMultimedia7EditPart.VISUAL_ID:
			return getMolefMultimedia7_3113Text(view);
		case ExclusiveEditionEditPart.VISUAL_ID:
			return getExclusiveEdition_3114Text(view);
		case CollaborativeVisualizationEditPart.VISUAL_ID:
			return getCollaborativeVisualization_3115Text(view);
		case IndividualVisualizationEditPart.VISUAL_ID:
			return getIndividualVisualization_3116Text(view);
		case UserTaskEditPart.VISUAL_ID:
			return getUserTask_3117Text(view);
		case CTTAbstractTaskEditPart.VISUAL_ID:
			return getCTTAbstractTask_3118Text(view);
		case InteractiveTaskEditPart.VISUAL_ID:
			return getInteractiveTask_3119Text(view);
		case CTTCollaborativeTaskEditPart.VISUAL_ID:
			return getCTTCollaborativeTask_3120Text(view);
		case ApplicationTaskEditPart.VISUAL_ID:
			return getApplicationTask_3121Text(view);
		case InheritanceEditPart.VISUAL_ID:
			return getInheritance_4001Text(view);
		case ActingEditPart.VISUAL_ID:
			return getActing_4002Text(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4003Text(view);
		case EnablingWOInformationEditPart.VISUAL_ID:
			return getEnablingWOInformation_4004Text(view);
		case EnablingWInformationEditPart.VISUAL_ID:
			return getEnablingWInformation_4005Text(view);
		case ChoiceEditPart.VISUAL_ID:
			return getChoice_4006Text(view);
		case ConcurrencyEditPart.VISUAL_ID:
			return getConcurrency_4007Text(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4008Text(view);
		case EnablingEditPart.VISUAL_ID:
			return getEnabling_4009Text(view);
		case DisablingEditPart.VISUAL_ID:
			return getDisabling_4010Text(view);
		case EnablingWithInformationPassingEditPart.VISUAL_ID:
			return getEnablingWithInformationPassing_4011Text(view);
		case DisablingWithInformationPassingEditPart.VISUAL_ID:
			return getDisablingWithInformationPassing_4012Text(view);
		case IndependentConcurrencyEditPart.VISUAL_ID:
			return getIndependentConcurrency_4013Text(view);
		case OrderIndependenceEditPart.VISUAL_ID:
			return getOrderIndependence_4014Text(view);
		case SuspendResumeEditPart.VISUAL_ID:
			return getSuspendResume_4015Text(view);
		case ConcurrencyWithInformationPassingEditPart.VISUAL_ID:
			return getConcurrencyWithInformationPassing_4016Text(view);
		case DeterministicChoiceEditPart.VISUAL_ID:
			return getDeterministicChoice_4017Text(view);
		case UndeterministicChoiceEditPart.VISUAL_ID:
			return getUndeterministicChoice_4018Text(view);
		case TraceabilityEditPart.VISUAL_ID:
			return getTraceability_4019Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getLCIANDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getSociogram_2001Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Sociogram_2001,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(SociogramNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLearningDiagram_2002Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.LearningDiagram_2002,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(LearningDiagramNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5108); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCTTDiagram_2003Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.CTTDiagram_2003,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(CTTDiagramNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5124); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRol_3001Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Rol_3001,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(RolNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroup_3002Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Group_3002,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(GroupNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefContent1_3003Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefContent1_3003,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefContent1CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefContent2_3004Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefContent2_3004,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefContent2CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefContent3_3005Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefContent3_3005,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefContent3CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefContent4_3006Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefContent4_3006,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefContent4CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefContent5_3007Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefContent5_3007,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefContent5CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefContent6_3008Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefContent6_3008,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefContent6CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefTActivities1_3009Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefTActivities1_3009,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefTActivities1CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefTActivities2_3010Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefTActivities2_3010,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefTActivities2CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefTActivities3_3011Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefTActivities3_3011,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefTActivities3CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefTActivities4_3012Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefTActivities4_3012,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefTActivities4CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefTActivities5_3013Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefTActivities5_3013,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefTActivities5CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefTActivities6_3014Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefTActivities6_3014,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefTActivities6CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefTActivities7_3015Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefTActivities7_3015,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefTActivities7CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefTActivities8_3016Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefTActivities8_3016,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefTActivities8CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefSocial1_3017Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefSocial1_3017,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefSocial1CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefSocial2_3018Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefSocial2_3018,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefSocial2CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefSocial3_3019Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefSocial3_3019,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefSocial3CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefSocial4_3020Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefSocial4_3020,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefSocial4CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefPersonalization1_3021Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefPersonalization1_3021,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefPersonalization1CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefPersonalization2_3022Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefPersonalization2_3022,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefPersonalization2CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefPersonalization3_3023Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefPersonalization3_3023,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefPersonalization3CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefPersonalization4_3024Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefPersonalization4_3024,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefPersonalization4CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefPersonalization5_3025Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefPersonalization5_3025,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefPersonalization5CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIndividualTask_3026Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.IndividualTask_3026,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(IndividualTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRol_3027Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Rol_3027,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(RolName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroup_3028Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Group_3028,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(GroupName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGraphicalEditor_3029Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.GraphicalEditor_3029,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(GraphicalEditorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTextEditor_3030Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.TextEditor_3030,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(TextEditorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCodeEditor_3031Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.CodeEditor_3031,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(CodeEditorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getWebViewer_3032Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.WebViewer_3032,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(WebViewerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAssimilative_3033Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Assimilative_3033,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(AssimilativeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInformationHandling_3034Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.InformationHandling_3034,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(InformationHandlingNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdaptive_3035Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Adaptive_3035,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(AdaptiveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCommunicative_3036Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Communicative_3036,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(CommunicativeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getProductive_3037Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Productive_3037,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ProductiveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExperiential_3038Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Experiential_3038,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ExperientialNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEvaluative_3039Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Evaluative_3039,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(EvaluativeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSupport_3040Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Support_3040,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(SupportNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFaceToFace_3041Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.FaceToFace_3041,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(FaceToFaceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComputerSupported_3042Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.ComputerSupported_3042,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ComputerSupportedNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOnline_3043Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Online_3043,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(OnlineNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTool_3044Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Tool_3044,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ToolKindEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getObject_3045Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Object_3045,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ObjectNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroupTask_3046Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.GroupTask_3046,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(GroupTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5061); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRol_3047Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Rol_3047,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(RolName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroup_3048Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Group_3048,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(GroupName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAssimilative_3049Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Assimilative_3049,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(AssimilativeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5049); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInformationHandling_3050Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.InformationHandling_3050,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(InformationHandlingName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdaptive_3051Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Adaptive_3051,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(AdaptiveName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCommunicative_3052Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Communicative_3052,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(CommunicativeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getProductive_3053Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Productive_3053,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ProductiveName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5053); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExperiential_3054Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Experiential_3054,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ExperientialName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5054); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEvaluative_3055Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Evaluative_3055,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(EvaluativeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5055); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSupport_3056Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Support_3056,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(SupportName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5056); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFaceToFace_3057Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.FaceToFace_3057,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(FaceToFaceName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComputerSupported_3058Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.ComputerSupported_3058,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ComputerSupportedName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5058); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOnline_3059Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Online_3059,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(OnlineName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5059); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getObject_3060Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Object_3060,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ObjectName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAbstractTask_3061Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.AbstractTask_3061,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(AbstractTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5076); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRol_3062Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Rol_3062,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(RolName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5062); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroup_3063Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Group_3063,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(GroupName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5063); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAssimilative_3064Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Assimilative_3064,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(AssimilativeName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5064); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInformationHandling_3065Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.InformationHandling_3065,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(InformationHandlingName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5065); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAdaptive_3066Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Adaptive_3066,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(AdaptiveName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5066); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCommunicative_3067Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Communicative_3067,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(CommunicativeName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5067); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getProductive_3068Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Productive_3068,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ProductiveName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5068); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExperiential_3069Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Experiential_3069,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ExperientialName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5069); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEvaluative_3070Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Evaluative_3070,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(EvaluativeName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5070); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSupport_3071Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Support_3071,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(SupportName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5071); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFaceToFace_3072Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.FaceToFace_3072,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(FaceToFaceName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5072); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComputerSupported_3073Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.ComputerSupported_3073,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ComputerSupportedName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5073); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOnline_3074Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Online_3074,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(OnlineName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5074); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getObject_3075Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Object_3075,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ObjectName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5075); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDetailedAbstractTask_3076Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.DetailedAbstractTask_3076,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(DetailedAbstractTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5094); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIndividualTask_3077Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.IndividualTask_3077,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(IndividualTaskName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5077); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroupTask_3078Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.GroupTask_3078,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(GroupTaskName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5078); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAbstractTask_3079Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.AbstractTask_3079,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(AbstractTaskName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5079); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDetailedAbstractTask_3080Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.DetailedAbstractTask_3080,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(DetailedAbstractTaskName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5093); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSessionPanel_3081Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.SessionPanel_3081,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(SessionPanelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5080); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getChat_3082Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Chat_3082,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ChatNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5081); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTurnTakingTool_3083Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.TurnTakingTool_3083,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(TurnTakingToolNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5082); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTelepointer_3084Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Telepointer_3084,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(TelepointerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5083); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRadarView_3085Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.RadarView_3085,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(RadarViewNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5084); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getProperties_3086Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Properties_3086,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(PropertiesNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5085); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConsole_3087Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Console_3087,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ConsoleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5086); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getProblems_3088Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Problems_3088,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ProblemsNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5087); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInit_3089Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Init_3089,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(InitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5088); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEnd_3090Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.End_3090,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(EndNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5089); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTemporalCondition_3091Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.TemporalCondition_3091,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(TemporalConditionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5090); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNotification_3092Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Notification_3092,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(NotificationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5091); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCondition_3093Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Condition_3093,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ConditionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5092); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSessionPanel_3094Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.SessionPanel_3094,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(SessionPanelName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5095); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getChat_3095Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Chat_3095,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ChatName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5096); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTurnTakingTool_3096Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.TurnTakingTool_3096,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(TurnTakingToolName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5097); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTelepointer_3097Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Telepointer_3097,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(TelepointerName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5098); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRadarView_3098Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.RadarView_3098,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(RadarViewName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5099); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getProperties_3099Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Properties_3099,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(PropertiesName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5100); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConsole_3100Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Console_3100,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ConsoleName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5101); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getProblems_3101Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Problems_3101,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ProblemsName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5102); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInit_3102Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Init_3102,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(InitName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5103); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEnd_3103Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.End_3103,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(EndName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5104); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTemporalCondition_3104Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.TemporalCondition_3104,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(TemporalConditionName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5105); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNotification_3105Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Notification_3105,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(NotificationName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5106); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCondition_3106Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Condition_3106,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ConditionName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5107); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefMultimedia1_3107Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefMultimedia1_3107,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefMultimedia1CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5109); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefMultimedia2_3108Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefMultimedia2_3108,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefMultimedia2CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5110); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefMultimedia3_3109Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefMultimedia3_3109,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefMultimedia3CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5111); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefMultimedia4_3110Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefMultimedia4_3110,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefMultimedia4CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5112); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefMultimedia5_3111Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefMultimedia5_3111,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefMultimedia5CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5113); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefMultimedia6_3112Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefMultimedia6_3112,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefMultimedia6CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5114); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMolefMultimedia7_3113Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.MolefMultimedia7_3113,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(MolefMultimedia7CharacteristicEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5115); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExclusiveEdition_3114Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.ExclusiveEdition_3114,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ExclusiveEditionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5116); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCollaborativeVisualization_3115Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.CollaborativeVisualization_3115,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(CollaborativeVisualizationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5117); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIndividualVisualization_3116Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.IndividualVisualization_3116,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(IndividualVisualizationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5118); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUserTask_3117Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.UserTask_3117,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(UserTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5119); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCTTAbstractTask_3118Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.CTTAbstractTask_3118,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(CTTAbstractTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5120); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInteractiveTask_3119Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.InteractiveTask_3119,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(InteractiveTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5121); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCTTCollaborativeTask_3120Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.CTTCollaborativeTask_3120,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(CTTCollaborativeTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5122); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getApplicationTask_3121Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.ApplicationTask_3121,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ApplicationTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5123); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInheritance_4001Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Inheritance_4001,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(InheritanceConditionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActing_4002Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Acting_4002,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ActingNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAssociation_4003Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Association_4003,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(AssociationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEnablingWOInformation_4004Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.EnablingWOInformation_4004,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(EnablingWOInformationELabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEnablingWInformation_4005Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.EnablingWInformation_4005,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(EnablingWInformationEwLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getChoice_4006Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Choice_4006,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ChoiceDtLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConcurrency_4007Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Concurrency_4007,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ConcurrencyIcLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAggregation_4008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getEnabling_4009Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Enabling_4009,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(EnablingELabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDisabling_4010Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.Disabling_4010,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(DisablingDLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEnablingWithInformationPassing_4011Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.EnablingWithInformationPassing_4011,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(EnablingWithInformationPassingEwLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDisablingWithInformationPassing_4012Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.DisablingWithInformationPassing_4012,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(DisablingWithInformationPassingDwLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIndependentConcurrency_4013Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.IndependentConcurrency_4013,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(IndependentConcurrencyIcLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOrderIndependence_4014Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.OrderIndependence_4014,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(OrderIndependenceOiLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSuspendResume_4015Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.SuspendResume_4015,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(SuspendResumeSrLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConcurrencyWithInformationPassing_4016Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.ConcurrencyWithInformationPassing_4016,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(ConcurrencyWithInformationPassingCLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDeterministicChoice_4017Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.DeterministicChoice_4017,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(DeterministicChoiceDtLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUndeterministicChoice_4018Text(View view) {
		IParser parser = LciatParserProvider.getParser(LciatElementTypes.UndeterministicChoice_4018,
				view.getElement() != null ? view.getElement() : view,
				LciatVisualIDRegistry.getType(UndeterministicChoiceUcLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			LciatDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTraceability_4019Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return LCIANDiagramEditPart.MODEL_ID.equals(LciatVisualIDRegistry.getModelID(view));
	}

}
