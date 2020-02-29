/*
 * 
 */
package lciat.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import lciat.diagram.part.LciatVisualIDRegistry;

/**
 * @generated
 */
public class LciatEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (LciatVisualIDRegistry.getVisualID(view)) {

			case LCIANDiagramEditPart.VISUAL_ID:
				return new LCIANDiagramEditPart(view);

			case SociogramEditPart.VISUAL_ID:
				return new SociogramEditPart(view);

			case SociogramNameEditPart.VISUAL_ID:
				return new SociogramNameEditPart(view);

			case LearningDiagramEditPart.VISUAL_ID:
				return new LearningDiagramEditPart(view);

			case LearningDiagramNameEditPart.VISUAL_ID:
				return new LearningDiagramNameEditPart(view);

			case CTTDiagramEditPart.VISUAL_ID:
				return new CTTDiagramEditPart(view);

			case CTTDiagramNameEditPart.VISUAL_ID:
				return new CTTDiagramNameEditPart(view);

			case RolEditPart.VISUAL_ID:
				return new RolEditPart(view);

			case RolNameEditPart.VISUAL_ID:
				return new RolNameEditPart(view);

			case GroupEditPart.VISUAL_ID:
				return new GroupEditPart(view);

			case GroupNameEditPart.VISUAL_ID:
				return new GroupNameEditPart(view);

			case MolefContent1EditPart.VISUAL_ID:
				return new MolefContent1EditPart(view);

			case MolefContent1CharacteristicEditPart.VISUAL_ID:
				return new MolefContent1CharacteristicEditPart(view);

			case MolefContent2EditPart.VISUAL_ID:
				return new MolefContent2EditPart(view);

			case MolefContent2CharacteristicEditPart.VISUAL_ID:
				return new MolefContent2CharacteristicEditPart(view);

			case MolefContent3EditPart.VISUAL_ID:
				return new MolefContent3EditPart(view);

			case MolefContent3CharacteristicEditPart.VISUAL_ID:
				return new MolefContent3CharacteristicEditPart(view);

			case MolefContent4EditPart.VISUAL_ID:
				return new MolefContent4EditPart(view);

			case MolefContent4CharacteristicEditPart.VISUAL_ID:
				return new MolefContent4CharacteristicEditPart(view);

			case MolefContent5EditPart.VISUAL_ID:
				return new MolefContent5EditPart(view);

			case MolefContent5CharacteristicEditPart.VISUAL_ID:
				return new MolefContent5CharacteristicEditPart(view);

			case MolefContent6EditPart.VISUAL_ID:
				return new MolefContent6EditPart(view);

			case MolefContent6CharacteristicEditPart.VISUAL_ID:
				return new MolefContent6CharacteristicEditPart(view);

			case MolefTActivities1EditPart.VISUAL_ID:
				return new MolefTActivities1EditPart(view);

			case MolefTActivities1CharacteristicEditPart.VISUAL_ID:
				return new MolefTActivities1CharacteristicEditPart(view);

			case MolefTActivities2EditPart.VISUAL_ID:
				return new MolefTActivities2EditPart(view);

			case MolefTActivities2CharacteristicEditPart.VISUAL_ID:
				return new MolefTActivities2CharacteristicEditPart(view);

			case MolefTActivities3EditPart.VISUAL_ID:
				return new MolefTActivities3EditPart(view);

			case MolefTActivities3CharacteristicEditPart.VISUAL_ID:
				return new MolefTActivities3CharacteristicEditPart(view);

			case MolefTActivities4EditPart.VISUAL_ID:
				return new MolefTActivities4EditPart(view);

			case MolefTActivities4CharacteristicEditPart.VISUAL_ID:
				return new MolefTActivities4CharacteristicEditPart(view);

			case MolefTActivities5EditPart.VISUAL_ID:
				return new MolefTActivities5EditPart(view);

			case MolefTActivities5CharacteristicEditPart.VISUAL_ID:
				return new MolefTActivities5CharacteristicEditPart(view);

			case MolefTActivities6EditPart.VISUAL_ID:
				return new MolefTActivities6EditPart(view);

			case MolefTActivities6CharacteristicEditPart.VISUAL_ID:
				return new MolefTActivities6CharacteristicEditPart(view);

			case MolefTActivities7EditPart.VISUAL_ID:
				return new MolefTActivities7EditPart(view);

			case MolefTActivities7CharacteristicEditPart.VISUAL_ID:
				return new MolefTActivities7CharacteristicEditPart(view);

			case MolefTActivities8EditPart.VISUAL_ID:
				return new MolefTActivities8EditPart(view);

			case MolefTActivities8CharacteristicEditPart.VISUAL_ID:
				return new MolefTActivities8CharacteristicEditPart(view);

			case MolefSocial1EditPart.VISUAL_ID:
				return new MolefSocial1EditPart(view);

			case MolefSocial1CharacteristicEditPart.VISUAL_ID:
				return new MolefSocial1CharacteristicEditPart(view);

			case MolefSocial2EditPart.VISUAL_ID:
				return new MolefSocial2EditPart(view);

			case MolefSocial2CharacteristicEditPart.VISUAL_ID:
				return new MolefSocial2CharacteristicEditPart(view);

			case MolefSocial3EditPart.VISUAL_ID:
				return new MolefSocial3EditPart(view);

			case MolefSocial3CharacteristicEditPart.VISUAL_ID:
				return new MolefSocial3CharacteristicEditPart(view);

			case MolefSocial4EditPart.VISUAL_ID:
				return new MolefSocial4EditPart(view);

			case MolefSocial4CharacteristicEditPart.VISUAL_ID:
				return new MolefSocial4CharacteristicEditPart(view);

			case MolefPersonalization1EditPart.VISUAL_ID:
				return new MolefPersonalization1EditPart(view);

			case MolefPersonalization1CharacteristicEditPart.VISUAL_ID:
				return new MolefPersonalization1CharacteristicEditPart(view);

			case MolefPersonalization2EditPart.VISUAL_ID:
				return new MolefPersonalization2EditPart(view);

			case MolefPersonalization2CharacteristicEditPart.VISUAL_ID:
				return new MolefPersonalization2CharacteristicEditPart(view);

			case MolefPersonalization3EditPart.VISUAL_ID:
				return new MolefPersonalization3EditPart(view);

			case MolefPersonalization3CharacteristicEditPart.VISUAL_ID:
				return new MolefPersonalization3CharacteristicEditPart(view);

			case MolefPersonalization4EditPart.VISUAL_ID:
				return new MolefPersonalization4EditPart(view);

			case MolefPersonalization4CharacteristicEditPart.VISUAL_ID:
				return new MolefPersonalization4CharacteristicEditPart(view);

			case MolefPersonalization5EditPart.VISUAL_ID:
				return new MolefPersonalization5EditPart(view);

			case MolefPersonalization5CharacteristicEditPart.VISUAL_ID:
				return new MolefPersonalization5CharacteristicEditPart(view);

			case IndividualTaskEditPart.VISUAL_ID:
				return new IndividualTaskEditPart(view);

			case IndividualTaskNameEditPart.VISUAL_ID:
				return new IndividualTaskNameEditPart(view);

			case Rol2EditPart.VISUAL_ID:
				return new Rol2EditPart(view);

			case RolName2EditPart.VISUAL_ID:
				return new RolName2EditPart(view);

			case Group2EditPart.VISUAL_ID:
				return new Group2EditPart(view);

			case GroupName2EditPart.VISUAL_ID:
				return new GroupName2EditPart(view);

			case GraphicalEditorEditPart.VISUAL_ID:
				return new GraphicalEditorEditPart(view);

			case GraphicalEditorNameEditPart.VISUAL_ID:
				return new GraphicalEditorNameEditPart(view);

			case TextEditorEditPart.VISUAL_ID:
				return new TextEditorEditPart(view);

			case TextEditorNameEditPart.VISUAL_ID:
				return new TextEditorNameEditPart(view);

			case CodeEditorEditPart.VISUAL_ID:
				return new CodeEditorEditPart(view);

			case CodeEditorNameEditPart.VISUAL_ID:
				return new CodeEditorNameEditPart(view);

			case WebViewerEditPart.VISUAL_ID:
				return new WebViewerEditPart(view);

			case WebViewerNameEditPart.VISUAL_ID:
				return new WebViewerNameEditPart(view);

			case AssimilativeEditPart.VISUAL_ID:
				return new AssimilativeEditPart(view);

			case AssimilativeNameEditPart.VISUAL_ID:
				return new AssimilativeNameEditPart(view);

			case InformationHandlingEditPart.VISUAL_ID:
				return new InformationHandlingEditPart(view);

			case InformationHandlingNameEditPart.VISUAL_ID:
				return new InformationHandlingNameEditPart(view);

			case AdaptiveEditPart.VISUAL_ID:
				return new AdaptiveEditPart(view);

			case AdaptiveNameEditPart.VISUAL_ID:
				return new AdaptiveNameEditPart(view);

			case CommunicativeEditPart.VISUAL_ID:
				return new CommunicativeEditPart(view);

			case CommunicativeNameEditPart.VISUAL_ID:
				return new CommunicativeNameEditPart(view);

			case ProductiveEditPart.VISUAL_ID:
				return new ProductiveEditPart(view);

			case ProductiveNameEditPart.VISUAL_ID:
				return new ProductiveNameEditPart(view);

			case ExperientialEditPart.VISUAL_ID:
				return new ExperientialEditPart(view);

			case ExperientialNameEditPart.VISUAL_ID:
				return new ExperientialNameEditPart(view);

			case EvaluativeEditPart.VISUAL_ID:
				return new EvaluativeEditPart(view);

			case EvaluativeNameEditPart.VISUAL_ID:
				return new EvaluativeNameEditPart(view);

			case SupportEditPart.VISUAL_ID:
				return new SupportEditPart(view);

			case SupportNameEditPart.VISUAL_ID:
				return new SupportNameEditPart(view);

			case FaceToFaceEditPart.VISUAL_ID:
				return new FaceToFaceEditPart(view);

			case FaceToFaceNameEditPart.VISUAL_ID:
				return new FaceToFaceNameEditPart(view);

			case ComputerSupportedEditPart.VISUAL_ID:
				return new ComputerSupportedEditPart(view);

			case ComputerSupportedNameEditPart.VISUAL_ID:
				return new ComputerSupportedNameEditPart(view);

			case OnlineEditPart.VISUAL_ID:
				return new OnlineEditPart(view);

			case OnlineNameEditPart.VISUAL_ID:
				return new OnlineNameEditPart(view);

			case ToolEditPart.VISUAL_ID:
				return new ToolEditPart(view);

			case ToolKindEditPart.VISUAL_ID:
				return new ToolKindEditPart(view);

			case ObjectEditPart.VISUAL_ID:
				return new ObjectEditPart(view);

			case ObjectNameEditPart.VISUAL_ID:
				return new ObjectNameEditPart(view);

			case GroupTaskEditPart.VISUAL_ID:
				return new GroupTaskEditPart(view);

			case GroupTaskNameEditPart.VISUAL_ID:
				return new GroupTaskNameEditPart(view);

			case Rol3EditPart.VISUAL_ID:
				return new Rol3EditPart(view);

			case RolName3EditPart.VISUAL_ID:
				return new RolName3EditPart(view);

			case Group3EditPart.VISUAL_ID:
				return new Group3EditPart(view);

			case GroupName3EditPart.VISUAL_ID:
				return new GroupName3EditPart(view);

			case Assimilative2EditPart.VISUAL_ID:
				return new Assimilative2EditPart(view);

			case AssimilativeName2EditPart.VISUAL_ID:
				return new AssimilativeName2EditPart(view);

			case InformationHandling2EditPart.VISUAL_ID:
				return new InformationHandling2EditPart(view);

			case InformationHandlingName2EditPart.VISUAL_ID:
				return new InformationHandlingName2EditPart(view);

			case Adaptive2EditPart.VISUAL_ID:
				return new Adaptive2EditPart(view);

			case AdaptiveName2EditPart.VISUAL_ID:
				return new AdaptiveName2EditPart(view);

			case Communicative2EditPart.VISUAL_ID:
				return new Communicative2EditPart(view);

			case CommunicativeName2EditPart.VISUAL_ID:
				return new CommunicativeName2EditPart(view);

			case Productive2EditPart.VISUAL_ID:
				return new Productive2EditPart(view);

			case ProductiveName2EditPart.VISUAL_ID:
				return new ProductiveName2EditPart(view);

			case Experiential2EditPart.VISUAL_ID:
				return new Experiential2EditPart(view);

			case ExperientialName2EditPart.VISUAL_ID:
				return new ExperientialName2EditPart(view);

			case Evaluative2EditPart.VISUAL_ID:
				return new Evaluative2EditPart(view);

			case EvaluativeName2EditPart.VISUAL_ID:
				return new EvaluativeName2EditPart(view);

			case Support2EditPart.VISUAL_ID:
				return new Support2EditPart(view);

			case SupportName2EditPart.VISUAL_ID:
				return new SupportName2EditPart(view);

			case FaceToFace2EditPart.VISUAL_ID:
				return new FaceToFace2EditPart(view);

			case FaceToFaceName2EditPart.VISUAL_ID:
				return new FaceToFaceName2EditPart(view);

			case ComputerSupported2EditPart.VISUAL_ID:
				return new ComputerSupported2EditPart(view);

			case ComputerSupportedName2EditPart.VISUAL_ID:
				return new ComputerSupportedName2EditPart(view);

			case Online2EditPart.VISUAL_ID:
				return new Online2EditPart(view);

			case OnlineName2EditPart.VISUAL_ID:
				return new OnlineName2EditPart(view);

			case Object2EditPart.VISUAL_ID:
				return new Object2EditPart(view);

			case ObjectName2EditPart.VISUAL_ID:
				return new ObjectName2EditPart(view);

			case AbstractTaskEditPart.VISUAL_ID:
				return new AbstractTaskEditPart(view);

			case AbstractTaskNameEditPart.VISUAL_ID:
				return new AbstractTaskNameEditPart(view);

			case Rol4EditPart.VISUAL_ID:
				return new Rol4EditPart(view);

			case RolName4EditPart.VISUAL_ID:
				return new RolName4EditPart(view);

			case Group4EditPart.VISUAL_ID:
				return new Group4EditPart(view);

			case GroupName4EditPart.VISUAL_ID:
				return new GroupName4EditPart(view);

			case Assimilative3EditPart.VISUAL_ID:
				return new Assimilative3EditPart(view);

			case AssimilativeName3EditPart.VISUAL_ID:
				return new AssimilativeName3EditPart(view);

			case InformationHandling3EditPart.VISUAL_ID:
				return new InformationHandling3EditPart(view);

			case InformationHandlingName3EditPart.VISUAL_ID:
				return new InformationHandlingName3EditPart(view);

			case Adaptive3EditPart.VISUAL_ID:
				return new Adaptive3EditPart(view);

			case AdaptiveName3EditPart.VISUAL_ID:
				return new AdaptiveName3EditPart(view);

			case Communicative3EditPart.VISUAL_ID:
				return new Communicative3EditPart(view);

			case CommunicativeName3EditPart.VISUAL_ID:
				return new CommunicativeName3EditPart(view);

			case Productive3EditPart.VISUAL_ID:
				return new Productive3EditPart(view);

			case ProductiveName3EditPart.VISUAL_ID:
				return new ProductiveName3EditPart(view);

			case Experiential3EditPart.VISUAL_ID:
				return new Experiential3EditPart(view);

			case ExperientialName3EditPart.VISUAL_ID:
				return new ExperientialName3EditPart(view);

			case Evaluative3EditPart.VISUAL_ID:
				return new Evaluative3EditPart(view);

			case EvaluativeName3EditPart.VISUAL_ID:
				return new EvaluativeName3EditPart(view);

			case Support3EditPart.VISUAL_ID:
				return new Support3EditPart(view);

			case SupportName3EditPart.VISUAL_ID:
				return new SupportName3EditPart(view);

			case FaceToFace3EditPart.VISUAL_ID:
				return new FaceToFace3EditPart(view);

			case FaceToFaceName3EditPart.VISUAL_ID:
				return new FaceToFaceName3EditPart(view);

			case ComputerSupported3EditPart.VISUAL_ID:
				return new ComputerSupported3EditPart(view);

			case ComputerSupportedName3EditPart.VISUAL_ID:
				return new ComputerSupportedName3EditPart(view);

			case Online3EditPart.VISUAL_ID:
				return new Online3EditPart(view);

			case OnlineName3EditPart.VISUAL_ID:
				return new OnlineName3EditPart(view);

			case Object3EditPart.VISUAL_ID:
				return new Object3EditPart(view);

			case ObjectName3EditPart.VISUAL_ID:
				return new ObjectName3EditPart(view);

			case DetailedAbstractTaskEditPart.VISUAL_ID:
				return new DetailedAbstractTaskEditPart(view);

			case DetailedAbstractTaskNameEditPart.VISUAL_ID:
				return new DetailedAbstractTaskNameEditPart(view);

			case IndividualTask2EditPart.VISUAL_ID:
				return new IndividualTask2EditPart(view);

			case IndividualTaskName2EditPart.VISUAL_ID:
				return new IndividualTaskName2EditPart(view);

			case GroupTask2EditPart.VISUAL_ID:
				return new GroupTask2EditPart(view);

			case GroupTaskName2EditPart.VISUAL_ID:
				return new GroupTaskName2EditPart(view);

			case AbstractTask2EditPart.VISUAL_ID:
				return new AbstractTask2EditPart(view);

			case AbstractTaskName2EditPart.VISUAL_ID:
				return new AbstractTaskName2EditPart(view);

			case DetailedAbstractTask2EditPart.VISUAL_ID:
				return new DetailedAbstractTask2EditPart(view);

			case DetailedAbstractTaskName2EditPart.VISUAL_ID:
				return new DetailedAbstractTaskName2EditPart(view);

			case SessionPanelEditPart.VISUAL_ID:
				return new SessionPanelEditPart(view);

			case SessionPanelNameEditPart.VISUAL_ID:
				return new SessionPanelNameEditPart(view);

			case ChatEditPart.VISUAL_ID:
				return new ChatEditPart(view);

			case ChatNameEditPart.VISUAL_ID:
				return new ChatNameEditPart(view);

			case TurnTakingToolEditPart.VISUAL_ID:
				return new TurnTakingToolEditPart(view);

			case TurnTakingToolNameEditPart.VISUAL_ID:
				return new TurnTakingToolNameEditPart(view);

			case TelepointerEditPart.VISUAL_ID:
				return new TelepointerEditPart(view);

			case TelepointerNameEditPart.VISUAL_ID:
				return new TelepointerNameEditPart(view);

			case RadarViewEditPart.VISUAL_ID:
				return new RadarViewEditPart(view);

			case RadarViewNameEditPart.VISUAL_ID:
				return new RadarViewNameEditPart(view);

			case PropertiesEditPart.VISUAL_ID:
				return new PropertiesEditPart(view);

			case PropertiesNameEditPart.VISUAL_ID:
				return new PropertiesNameEditPart(view);

			case ConsoleEditPart.VISUAL_ID:
				return new ConsoleEditPart(view);

			case ConsoleNameEditPart.VISUAL_ID:
				return new ConsoleNameEditPart(view);

			case ProblemsEditPart.VISUAL_ID:
				return new ProblemsEditPart(view);

			case ProblemsNameEditPart.VISUAL_ID:
				return new ProblemsNameEditPart(view);

			case InitEditPart.VISUAL_ID:
				return new InitEditPart(view);

			case InitNameEditPart.VISUAL_ID:
				return new InitNameEditPart(view);

			case EndEditPart.VISUAL_ID:
				return new EndEditPart(view);

			case EndNameEditPart.VISUAL_ID:
				return new EndNameEditPart(view);

			case TemporalConditionEditPart.VISUAL_ID:
				return new TemporalConditionEditPart(view);

			case TemporalConditionNameEditPart.VISUAL_ID:
				return new TemporalConditionNameEditPart(view);

			case NotificationEditPart.VISUAL_ID:
				return new NotificationEditPart(view);

			case NotificationNameEditPart.VISUAL_ID:
				return new NotificationNameEditPart(view);

			case ConditionEditPart.VISUAL_ID:
				return new ConditionEditPart(view);

			case ConditionNameEditPart.VISUAL_ID:
				return new ConditionNameEditPart(view);

			case SessionPanel2EditPart.VISUAL_ID:
				return new SessionPanel2EditPart(view);

			case SessionPanelName2EditPart.VISUAL_ID:
				return new SessionPanelName2EditPart(view);

			case Chat2EditPart.VISUAL_ID:
				return new Chat2EditPart(view);

			case ChatName2EditPart.VISUAL_ID:
				return new ChatName2EditPart(view);

			case TurnTakingTool2EditPart.VISUAL_ID:
				return new TurnTakingTool2EditPart(view);

			case TurnTakingToolName2EditPart.VISUAL_ID:
				return new TurnTakingToolName2EditPart(view);

			case Telepointer2EditPart.VISUAL_ID:
				return new Telepointer2EditPart(view);

			case TelepointerName2EditPart.VISUAL_ID:
				return new TelepointerName2EditPart(view);

			case RadarView2EditPart.VISUAL_ID:
				return new RadarView2EditPart(view);

			case RadarViewName2EditPart.VISUAL_ID:
				return new RadarViewName2EditPart(view);

			case Properties2EditPart.VISUAL_ID:
				return new Properties2EditPart(view);

			case PropertiesName2EditPart.VISUAL_ID:
				return new PropertiesName2EditPart(view);

			case Console2EditPart.VISUAL_ID:
				return new Console2EditPart(view);

			case ConsoleName2EditPart.VISUAL_ID:
				return new ConsoleName2EditPart(view);

			case Problems2EditPart.VISUAL_ID:
				return new Problems2EditPart(view);

			case ProblemsName2EditPart.VISUAL_ID:
				return new ProblemsName2EditPart(view);

			case Init2EditPart.VISUAL_ID:
				return new Init2EditPart(view);

			case InitName2EditPart.VISUAL_ID:
				return new InitName2EditPart(view);

			case End2EditPart.VISUAL_ID:
				return new End2EditPart(view);

			case EndName2EditPart.VISUAL_ID:
				return new EndName2EditPart(view);

			case TemporalCondition2EditPart.VISUAL_ID:
				return new TemporalCondition2EditPart(view);

			case TemporalConditionName2EditPart.VISUAL_ID:
				return new TemporalConditionName2EditPart(view);

			case Notification2EditPart.VISUAL_ID:
				return new Notification2EditPart(view);

			case NotificationName2EditPart.VISUAL_ID:
				return new NotificationName2EditPart(view);

			case Condition2EditPart.VISUAL_ID:
				return new Condition2EditPart(view);

			case ConditionName2EditPart.VISUAL_ID:
				return new ConditionName2EditPart(view);

			case MolefMultimedia1EditPart.VISUAL_ID:
				return new MolefMultimedia1EditPart(view);

			case MolefMultimedia1CharacteristicEditPart.VISUAL_ID:
				return new MolefMultimedia1CharacteristicEditPart(view);

			case MolefMultimedia2EditPart.VISUAL_ID:
				return new MolefMultimedia2EditPart(view);

			case MolefMultimedia2CharacteristicEditPart.VISUAL_ID:
				return new MolefMultimedia2CharacteristicEditPart(view);

			case MolefMultimedia3EditPart.VISUAL_ID:
				return new MolefMultimedia3EditPart(view);

			case MolefMultimedia3CharacteristicEditPart.VISUAL_ID:
				return new MolefMultimedia3CharacteristicEditPart(view);

			case MolefMultimedia4EditPart.VISUAL_ID:
				return new MolefMultimedia4EditPart(view);

			case MolefMultimedia4CharacteristicEditPart.VISUAL_ID:
				return new MolefMultimedia4CharacteristicEditPart(view);

			case MolefMultimedia5EditPart.VISUAL_ID:
				return new MolefMultimedia5EditPart(view);

			case MolefMultimedia5CharacteristicEditPart.VISUAL_ID:
				return new MolefMultimedia5CharacteristicEditPart(view);

			case MolefMultimedia6EditPart.VISUAL_ID:
				return new MolefMultimedia6EditPart(view);

			case MolefMultimedia6CharacteristicEditPart.VISUAL_ID:
				return new MolefMultimedia6CharacteristicEditPart(view);

			case MolefMultimedia7EditPart.VISUAL_ID:
				return new MolefMultimedia7EditPart(view);

			case MolefMultimedia7CharacteristicEditPart.VISUAL_ID:
				return new MolefMultimedia7CharacteristicEditPart(view);

			case ExclusiveEditionEditPart.VISUAL_ID:
				return new ExclusiveEditionEditPart(view);

			case ExclusiveEditionNameEditPart.VISUAL_ID:
				return new ExclusiveEditionNameEditPart(view);

			case CollaborativeVisualizationEditPart.VISUAL_ID:
				return new CollaborativeVisualizationEditPart(view);

			case CollaborativeVisualizationNameEditPart.VISUAL_ID:
				return new CollaborativeVisualizationNameEditPart(view);

			case IndividualVisualizationEditPart.VISUAL_ID:
				return new IndividualVisualizationEditPart(view);

			case IndividualVisualizationNameEditPart.VISUAL_ID:
				return new IndividualVisualizationNameEditPart(view);

			case UserTaskEditPart.VISUAL_ID:
				return new UserTaskEditPart(view);

			case UserTaskNameEditPart.VISUAL_ID:
				return new UserTaskNameEditPart(view);

			case CTTAbstractTaskEditPart.VISUAL_ID:
				return new CTTAbstractTaskEditPart(view);

			case CTTAbstractTaskNameEditPart.VISUAL_ID:
				return new CTTAbstractTaskNameEditPart(view);

			case InteractiveTaskEditPart.VISUAL_ID:
				return new InteractiveTaskEditPart(view);

			case InteractiveTaskNameEditPart.VISUAL_ID:
				return new InteractiveTaskNameEditPart(view);

			case CTTCollaborativeTaskEditPart.VISUAL_ID:
				return new CTTCollaborativeTaskEditPart(view);

			case CTTCollaborativeTaskNameEditPart.VISUAL_ID:
				return new CTTCollaborativeTaskNameEditPart(view);

			case ApplicationTaskEditPart.VISUAL_ID:
				return new ApplicationTaskEditPart(view);

			case ApplicationTaskNameEditPart.VISUAL_ID:
				return new ApplicationTaskNameEditPart(view);

			case SociogramSociogramItsSociogramNodesCompartmentEditPart.VISUAL_ID:
				return new SociogramSociogramItsSociogramNodesCompartmentEditPart(view);

			case SociogramSociogramMfContentNodesCompartmentEditPart.VISUAL_ID:
				return new SociogramSociogramMfContentNodesCompartmentEditPart(view);

			case LearningDiagramLearningDiagramLearningNodesCompartmentEditPart.VISUAL_ID:
				return new LearningDiagramLearningDiagramLearningNodesCompartmentEditPart(view);

			case LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart.VISUAL_ID:
				return new LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart(view);

			case IndividualTaskIndividualTaskTaskRolesCompartmentEditPart.VISUAL_ID:
				return new IndividualTaskIndividualTaskTaskRolesCompartmentEditPart(view);

			case IndividualTaskIndividualTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
				return new IndividualTaskIndividualTaskTaskObjectsCompartmentEditPart(view);

			case IndividualTaskIndividualTaskSubtypeCompartmentEditPart.VISUAL_ID:
				return new IndividualTaskIndividualTaskSubtypeCompartmentEditPart(view);

			case IndividualTaskIndividualTaskModalityCompartmentEditPart.VISUAL_ID:
				return new IndividualTaskIndividualTaskModalityCompartmentEditPart(view);

			case GroupTaskGroupTaskTaskRolesCompartmentEditPart.VISUAL_ID:
				return new GroupTaskGroupTaskTaskRolesCompartmentEditPart(view);

			case GroupTaskGroupTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
				return new GroupTaskGroupTaskTaskObjectsCompartmentEditPart(view);

			case GroupTaskGroupTaskSubtypeCompartmentEditPart.VISUAL_ID:
				return new GroupTaskGroupTaskSubtypeCompartmentEditPart(view);

			case GroupTaskGroupTaskModalityCompartmentEditPart.VISUAL_ID:
				return new GroupTaskGroupTaskModalityCompartmentEditPart(view);

			case AbstractTaskAbstractTaskTaskRolesCompartmentEditPart.VISUAL_ID:
				return new AbstractTaskAbstractTaskTaskRolesCompartmentEditPart(view);

			case AbstractTaskAbstractTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
				return new AbstractTaskAbstractTaskTaskObjectsCompartmentEditPart(view);

			case AbstractTaskAbstractTaskSubtypeCompartmentEditPart.VISUAL_ID:
				return new AbstractTaskAbstractTaskSubtypeCompartmentEditPart(view);

			case AbstractTaskAbstractTaskModalityCompartmentEditPart.VISUAL_ID:
				return new AbstractTaskAbstractTaskModalityCompartmentEditPart(view);

			case DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart.VISUAL_ID:
				return new DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart(view);

			case IndividualTaskIndividualTaskTaskRolesCompartment2EditPart.VISUAL_ID:
				return new IndividualTaskIndividualTaskTaskRolesCompartment2EditPart(view);

			case IndividualTaskIndividualTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
				return new IndividualTaskIndividualTaskTaskObjectsCompartment2EditPart(view);

			case IndividualTaskIndividualTaskSubtypeCompartment2EditPart.VISUAL_ID:
				return new IndividualTaskIndividualTaskSubtypeCompartment2EditPart(view);

			case IndividualTaskIndividualTaskModalityCompartment2EditPart.VISUAL_ID:
				return new IndividualTaskIndividualTaskModalityCompartment2EditPart(view);

			case GroupTaskGroupTaskTaskRolesCompartment2EditPart.VISUAL_ID:
				return new GroupTaskGroupTaskTaskRolesCompartment2EditPart(view);

			case GroupTaskGroupTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
				return new GroupTaskGroupTaskTaskObjectsCompartment2EditPart(view);

			case GroupTaskGroupTaskSubtypeCompartment2EditPart.VISUAL_ID:
				return new GroupTaskGroupTaskSubtypeCompartment2EditPart(view);

			case GroupTaskGroupTaskModalityCompartment2EditPart.VISUAL_ID:
				return new GroupTaskGroupTaskModalityCompartment2EditPart(view);

			case AbstractTaskAbstractTaskTaskRolesCompartment2EditPart.VISUAL_ID:
				return new AbstractTaskAbstractTaskTaskRolesCompartment2EditPart(view);

			case AbstractTaskAbstractTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
				return new AbstractTaskAbstractTaskTaskObjectsCompartment2EditPart(view);

			case AbstractTaskAbstractTaskSubtypeCompartment2EditPart.VISUAL_ID:
				return new AbstractTaskAbstractTaskSubtypeCompartment2EditPart(view);

			case AbstractTaskAbstractTaskModalityCompartment2EditPart.VISUAL_ID:
				return new AbstractTaskAbstractTaskModalityCompartment2EditPart(view);

			case DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment2EditPart.VISUAL_ID:
				return new DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment2EditPart(view);

			case CTTDiagramCTTDiagramCttTasksCompartmentEditPart.VISUAL_ID:
				return new CTTDiagramCTTDiagramCttTasksCompartmentEditPart(view);

			case CTTDiagramCTTDiagramMfCttNodesCompartmentEditPart.VISUAL_ID:
				return new CTTDiagramCTTDiagramMfCttNodesCompartmentEditPart(view);

			case InheritanceEditPart.VISUAL_ID:
				return new InheritanceEditPart(view);

			case InheritanceConditionEditPart.VISUAL_ID:
				return new InheritanceConditionEditPart(view);

			case ActingEditPart.VISUAL_ID:
				return new ActingEditPart(view);

			case ActingNameEditPart.VISUAL_ID:
				return new ActingNameEditPart(view);

			case AssociationEditPart.VISUAL_ID:
				return new AssociationEditPart(view);

			case AssociationNameEditPart.VISUAL_ID:
				return new AssociationNameEditPart(view);

			case EnablingWOInformationEditPart.VISUAL_ID:
				return new EnablingWOInformationEditPart(view);

			case EnablingWOInformationELabelEditPart.VISUAL_ID:
				return new EnablingWOInformationELabelEditPart(view);

			case EnablingWInformationEditPart.VISUAL_ID:
				return new EnablingWInformationEditPart(view);

			case EnablingWInformationEwLabelEditPart.VISUAL_ID:
				return new EnablingWInformationEwLabelEditPart(view);

			case ChoiceEditPart.VISUAL_ID:
				return new ChoiceEditPart(view);

			case ChoiceDtLabelEditPart.VISUAL_ID:
				return new ChoiceDtLabelEditPart(view);

			case ConcurrencyEditPart.VISUAL_ID:
				return new ConcurrencyEditPart(view);

			case ConcurrencyIcLabelEditPart.VISUAL_ID:
				return new ConcurrencyIcLabelEditPart(view);

			case AggregationEditPart.VISUAL_ID:
				return new AggregationEditPart(view);

			case EnablingEditPart.VISUAL_ID:
				return new EnablingEditPart(view);

			case EnablingELabelEditPart.VISUAL_ID:
				return new EnablingELabelEditPart(view);

			case DisablingEditPart.VISUAL_ID:
				return new DisablingEditPart(view);

			case DisablingDLabelEditPart.VISUAL_ID:
				return new DisablingDLabelEditPart(view);

			case EnablingWithInformationPassingEditPart.VISUAL_ID:
				return new EnablingWithInformationPassingEditPart(view);

			case EnablingWithInformationPassingEwLabelEditPart.VISUAL_ID:
				return new EnablingWithInformationPassingEwLabelEditPart(view);

			case DisablingWithInformationPassingEditPart.VISUAL_ID:
				return new DisablingWithInformationPassingEditPart(view);

			case DisablingWithInformationPassingDwLabelEditPart.VISUAL_ID:
				return new DisablingWithInformationPassingDwLabelEditPart(view);

			case IndependentConcurrencyEditPart.VISUAL_ID:
				return new IndependentConcurrencyEditPart(view);

			case IndependentConcurrencyIcLabelEditPart.VISUAL_ID:
				return new IndependentConcurrencyIcLabelEditPart(view);

			case OrderIndependenceEditPart.VISUAL_ID:
				return new OrderIndependenceEditPart(view);

			case OrderIndependenceOiLabelEditPart.VISUAL_ID:
				return new OrderIndependenceOiLabelEditPart(view);

			case SuspendResumeEditPart.VISUAL_ID:
				return new SuspendResumeEditPart(view);

			case SuspendResumeSrLabelEditPart.VISUAL_ID:
				return new SuspendResumeSrLabelEditPart(view);

			case ConcurrencyWithInformationPassingEditPart.VISUAL_ID:
				return new ConcurrencyWithInformationPassingEditPart(view);

			case ConcurrencyWithInformationPassingCLabelEditPart.VISUAL_ID:
				return new ConcurrencyWithInformationPassingCLabelEditPart(view);

			case DeterministicChoiceEditPart.VISUAL_ID:
				return new DeterministicChoiceEditPart(view);

			case DeterministicChoiceDtLabelEditPart.VISUAL_ID:
				return new DeterministicChoiceDtLabelEditPart(view);

			case UndeterministicChoiceEditPart.VISUAL_ID:
				return new UndeterministicChoiceEditPart(view);

			case UndeterministicChoiceUcLabelEditPart.VISUAL_ID:
				return new UndeterministicChoiceUcLabelEditPart(view);

			case TraceabilityEditPart.VISUAL_ID:
				return new TraceabilityEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
