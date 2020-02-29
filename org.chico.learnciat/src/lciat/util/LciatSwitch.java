/**
 */
package lciat.util;

import lciat.AbstractTask;
import lciat.Acting;
import lciat.Adaptive;
import lciat.Aggregation;
import lciat.ApplicationTask;
import lciat.Assimilative;
import lciat.Association;
import lciat.Awareness;
import lciat.CTTAbstractTask;
import lciat.CTTCollaborativeTask;
import lciat.CTTDiagram;
import lciat.CTTLink;
import lciat.CTTTask;
import lciat.Chat;
import lciat.Choice;
import lciat.CodeEditor;
import lciat.CollaborativeVisualization;
import lciat.Communicative;
import lciat.ComputerSupported;
import lciat.Concurrency;
import lciat.ConcurrencyWithInformationPassing;
import lciat.Condition;
import lciat.Console;
import lciat.DetailedAbstractTask;
import lciat.DeterministicChoice;
import lciat.Disabling;
import lciat.DisablingWithInformationPassing;
import lciat.Enabling;
import lciat.EnablingWInformation;
import lciat.EnablingWOInformation;
import lciat.EnablingWithInformationPassing;
import lciat.End;
import lciat.Evaluative;
import lciat.ExclusiveEdition;
import lciat.Experiential;
import lciat.FaceToFace;
import lciat.GraphicalEditor;
import lciat.Group;
import lciat.GroupTask;
import lciat.IndependentConcurrency;
import lciat.IndividualTask;
import lciat.IndividualVisualization;
import lciat.InformationHandling;
import lciat.Inheritance;
import lciat.Init;
import lciat.InteractiveTask;
import lciat.LCIANDiagram;
import lciat.LciatPackage;
import lciat.LearningActivity;
import lciat.LearningDiagram;
import lciat.LearningLink;
import lciat.LearningNode;
import lciat.LeftSideLearningNode;
import lciat.Link;
import lciat.Modality;
import lciat.MolefContent1;
import lciat.MolefContent2;
import lciat.MolefContent3;
import lciat.MolefContent4;
import lciat.MolefContent5;
import lciat.MolefContent6;
import lciat.MolefContentNode;
import lciat.MolefCttNode;
import lciat.MolefLearningNode;
import lciat.MolefMultimedia1;
import lciat.MolefMultimedia2;
import lciat.MolefMultimedia3;
import lciat.MolefMultimedia4;
import lciat.MolefMultimedia5;
import lciat.MolefMultimedia6;
import lciat.MolefMultimedia7;
import lciat.MolefMultimediaNode;
import lciat.MolefNode;
import lciat.MolefPersonalization1;
import lciat.MolefPersonalization2;
import lciat.MolefPersonalization3;
import lciat.MolefPersonalization4;
import lciat.MolefPersonalization5;
import lciat.MolefPersonalizationNode;
import lciat.MolefSocial1;
import lciat.MolefSocial2;
import lciat.MolefSocial3;
import lciat.MolefSocial4;
import lciat.MolefSocialNode;
import lciat.MolefTActivities1;
import lciat.MolefTActivities2;
import lciat.MolefTActivities3;
import lciat.MolefTActivities4;
import lciat.MolefTActivities5;
import lciat.MolefTActivities6;
import lciat.MolefTActivities7;
import lciat.MolefTActivities8;
import lciat.MolefTaskAndActivitiesNode;
import lciat.Notification;
import lciat.Online;
import lciat.OrderIndependence;
import lciat.Problems;
import lciat.Productive;
import lciat.Properties;
import lciat.RadarView;
import lciat.Rol;
import lciat.SessionPanel;
import lciat.Sociogram;
import lciat.SociogramLink;
import lciat.SociogramNode;
import lciat.Subtype;
import lciat.Support;
import lciat.SuspendResume;
import lciat.Telepointer;
import lciat.TemporalCondition;
import lciat.TextEditor;
import lciat.Tool;
import lciat.Traceability;
import lciat.TurnTakingTool;
import lciat.UndeterministicChoice;
import lciat.UserTask;
import lciat.WebViewer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see lciat.LciatPackage
 * @generated
 */
public class LciatSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LciatPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LciatSwitch() {
		if (modelPackage == null) {
			modelPackage = LciatPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LciatPackage.LCIAN_DIAGRAM: {
				LCIANDiagram lcianDiagram = (LCIANDiagram)theEObject;
				T result = caseLCIANDiagram(lcianDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.SOCIOGRAM: {
				Sociogram sociogram = (Sociogram)theEObject;
				T result = caseSociogram(sociogram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.SOCIOGRAM_NODE: {
				SociogramNode sociogramNode = (SociogramNode)theEObject;
				T result = caseSociogramNode(sociogramNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.ROL: {
				Rol rol = (Rol)theEObject;
				T result = caseRol(rol);
				if (result == null) result = caseSociogramNode(rol);
				if (result == null) result = caseLeftSideLearningNode(rol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.GROUP: {
				Group group = (Group)theEObject;
				T result = caseGroup(group);
				if (result == null) result = caseSociogramNode(group);
				if (result == null) result = caseLeftSideLearningNode(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.SOCIOGRAM_LINK: {
				SociogramLink sociogramLink = (SociogramLink)theEObject;
				T result = caseSociogramLink(sociogramLink);
				if (result == null) result = caseLink(sociogramLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.INHERITANCE: {
				Inheritance inheritance = (Inheritance)theEObject;
				T result = caseInheritance(inheritance);
				if (result == null) result = caseSociogramLink(inheritance);
				if (result == null) result = caseLink(inheritance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.ACTING: {
				Acting acting = (Acting)theEObject;
				T result = caseActing(acting);
				if (result == null) result = caseSociogramLink(acting);
				if (result == null) result = caseLink(acting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseSociogramLink(association);
				if (result == null) result = caseLink(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.LEARNING_DIAGRAM: {
				LearningDiagram learningDiagram = (LearningDiagram)theEObject;
				T result = caseLearningDiagram(learningDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.LEARNING_NODE: {
				LearningNode learningNode = (LearningNode)theEObject;
				T result = caseLearningNode(learningNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.INIT: {
				Init init = (Init)theEObject;
				T result = caseInit(init);
				if (result == null) result = caseLearningNode(init);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.END: {
				End end = (End)theEObject;
				T result = caseEnd(end);
				if (result == null) result = caseLearningNode(end);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.LEARNING_ACTIVITY: {
				LearningActivity learningActivity = (LearningActivity)theEObject;
				T result = caseLearningActivity(learningActivity);
				if (result == null) result = caseLearningNode(learningActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.LEFT_SIDE_LEARNING_NODE: {
				LeftSideLearningNode leftSideLearningNode = (LeftSideLearningNode)theEObject;
				T result = caseLeftSideLearningNode(leftSideLearningNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.INDIVIDUAL_TASK: {
				IndividualTask individualTask = (IndividualTask)theEObject;
				T result = caseIndividualTask(individualTask);
				if (result == null) result = caseLearningActivity(individualTask);
				if (result == null) result = caseLearningNode(individualTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.GROUP_TASK: {
				GroupTask groupTask = (GroupTask)theEObject;
				T result = caseGroupTask(groupTask);
				if (result == null) result = caseLearningActivity(groupTask);
				if (result == null) result = caseLearningNode(groupTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.ABSTRACT_TASK: {
				AbstractTask abstractTask = (AbstractTask)theEObject;
				T result = caseAbstractTask(abstractTask);
				if (result == null) result = caseLearningActivity(abstractTask);
				if (result == null) result = caseLearningNode(abstractTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.DETAILED_ABSTRACT_TASK: {
				DetailedAbstractTask detailedAbstractTask = (DetailedAbstractTask)theEObject;
				T result = caseDetailedAbstractTask(detailedAbstractTask);
				if (result == null) result = caseLearningActivity(detailedAbstractTask);
				if (result == null) result = caseLearningNode(detailedAbstractTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.OBJECT: {
				lciat.Object object = (lciat.Object)theEObject;
				T result = caseObject(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.TEMPORAL_CONDITION: {
				TemporalCondition temporalCondition = (TemporalCondition)theEObject;
				T result = caseTemporalCondition(temporalCondition);
				if (result == null) result = caseLearningNode(temporalCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.NOTIFICATION: {
				Notification notification = (Notification)theEObject;
				T result = caseNotification(notification);
				if (result == null) result = caseLearningNode(notification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = caseLearningNode(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.SUBTYPE: {
				Subtype subtype = (Subtype)theEObject;
				T result = caseSubtype(subtype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.ASSIMILATIVE: {
				Assimilative assimilative = (Assimilative)theEObject;
				T result = caseAssimilative(assimilative);
				if (result == null) result = caseSubtype(assimilative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.INFORMATION_HANDLING: {
				InformationHandling informationHandling = (InformationHandling)theEObject;
				T result = caseInformationHandling(informationHandling);
				if (result == null) result = caseSubtype(informationHandling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.ADAPTIVE: {
				Adaptive adaptive = (Adaptive)theEObject;
				T result = caseAdaptive(adaptive);
				if (result == null) result = caseSubtype(adaptive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.COMMUNICATIVE: {
				Communicative communicative = (Communicative)theEObject;
				T result = caseCommunicative(communicative);
				if (result == null) result = caseSubtype(communicative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.PRODUCTIVE: {
				Productive productive = (Productive)theEObject;
				T result = caseProductive(productive);
				if (result == null) result = caseSubtype(productive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.EXPERIENTIAL: {
				Experiential experiential = (Experiential)theEObject;
				T result = caseExperiential(experiential);
				if (result == null) result = caseSubtype(experiential);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.EVALUATIVE: {
				Evaluative evaluative = (Evaluative)theEObject;
				T result = caseEvaluative(evaluative);
				if (result == null) result = caseSubtype(evaluative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.SUPPORT: {
				Support support = (Support)theEObject;
				T result = caseSupport(support);
				if (result == null) result = caseSubtype(support);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MODALITY: {
				Modality modality = (Modality)theEObject;
				T result = caseModality(modality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.FACE_TO_FACE: {
				FaceToFace faceToFace = (FaceToFace)theEObject;
				T result = caseFaceToFace(faceToFace);
				if (result == null) result = caseModality(faceToFace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.COMPUTER_SUPPORTED: {
				ComputerSupported computerSupported = (ComputerSupported)theEObject;
				T result = caseComputerSupported(computerSupported);
				if (result == null) result = caseModality(computerSupported);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.ONLINE: {
				Online online = (Online)theEObject;
				T result = caseOnline(online);
				if (result == null) result = caseModality(online);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.LEARNING_LINK: {
				LearningLink learningLink = (LearningLink)theEObject;
				T result = caseLearningLink(learningLink);
				if (result == null) result = caseLink(learningLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.ENABLING_WO_INFORMATION: {
				EnablingWOInformation enablingWOInformation = (EnablingWOInformation)theEObject;
				T result = caseEnablingWOInformation(enablingWOInformation);
				if (result == null) result = caseLearningLink(enablingWOInformation);
				if (result == null) result = caseLink(enablingWOInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.ENABLING_WINFORMATION: {
				EnablingWInformation enablingWInformation = (EnablingWInformation)theEObject;
				T result = caseEnablingWInformation(enablingWInformation);
				if (result == null) result = caseLearningLink(enablingWInformation);
				if (result == null) result = caseLink(enablingWInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.CHOICE: {
				Choice choice = (Choice)theEObject;
				T result = caseChoice(choice);
				if (result == null) result = caseLearningLink(choice);
				if (result == null) result = caseLink(choice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.CONCURRENCY: {
				Concurrency concurrency = (Concurrency)theEObject;
				T result = caseConcurrency(concurrency);
				if (result == null) result = caseLearningLink(concurrency);
				if (result == null) result = caseLink(concurrency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.TOOL: {
				Tool tool = (Tool)theEObject;
				T result = caseTool(tool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.GRAPHICAL_EDITOR: {
				GraphicalEditor graphicalEditor = (GraphicalEditor)theEObject;
				T result = caseGraphicalEditor(graphicalEditor);
				if (result == null) result = caseTool(graphicalEditor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.TEXT_EDITOR: {
				TextEditor textEditor = (TextEditor)theEObject;
				T result = caseTextEditor(textEditor);
				if (result == null) result = caseTool(textEditor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.CODE_EDITOR: {
				CodeEditor codeEditor = (CodeEditor)theEObject;
				T result = caseCodeEditor(codeEditor);
				if (result == null) result = caseTool(codeEditor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.WEB_VIEWER: {
				WebViewer webViewer = (WebViewer)theEObject;
				T result = caseWebViewer(webViewer);
				if (result == null) result = caseTool(webViewer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.AWARENESS: {
				Awareness awareness = (Awareness)theEObject;
				T result = caseAwareness(awareness);
				if (result == null) result = caseLearningNode(awareness);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.SESSION_PANEL: {
				SessionPanel sessionPanel = (SessionPanel)theEObject;
				T result = caseSessionPanel(sessionPanel);
				if (result == null) result = caseAwareness(sessionPanel);
				if (result == null) result = caseLearningNode(sessionPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.CHAT: {
				Chat chat = (Chat)theEObject;
				T result = caseChat(chat);
				if (result == null) result = caseAwareness(chat);
				if (result == null) result = caseLearningNode(chat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.TURN_TAKING_TOOL: {
				TurnTakingTool turnTakingTool = (TurnTakingTool)theEObject;
				T result = caseTurnTakingTool(turnTakingTool);
				if (result == null) result = caseAwareness(turnTakingTool);
				if (result == null) result = caseLearningNode(turnTakingTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.TELEPOINTER: {
				Telepointer telepointer = (Telepointer)theEObject;
				T result = caseTelepointer(telepointer);
				if (result == null) result = caseAwareness(telepointer);
				if (result == null) result = caseLearningNode(telepointer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.RADAR_VIEW: {
				RadarView radarView = (RadarView)theEObject;
				T result = caseRadarView(radarView);
				if (result == null) result = caseAwareness(radarView);
				if (result == null) result = caseLearningNode(radarView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.PROPERTIES: {
				Properties properties = (Properties)theEObject;
				T result = caseProperties(properties);
				if (result == null) result = caseAwareness(properties);
				if (result == null) result = caseLearningNode(properties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.CONSOLE: {
				Console console = (Console)theEObject;
				T result = caseConsole(console);
				if (result == null) result = caseAwareness(console);
				if (result == null) result = caseLearningNode(console);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.PROBLEMS: {
				Problems problems = (Problems)theEObject;
				T result = caseProblems(problems);
				if (result == null) result = caseAwareness(problems);
				if (result == null) result = caseLearningNode(problems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.TRACEABILITY: {
				Traceability traceability = (Traceability)theEObject;
				T result = caseTraceability(traceability);
				if (result == null) result = caseLink(traceability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.CTT_DIAGRAM: {
				CTTDiagram cttDiagram = (CTTDiagram)theEObject;
				T result = caseCTTDiagram(cttDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.CTT_TASK: {
				CTTTask cttTask = (CTTTask)theEObject;
				T result = caseCTTTask(cttTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.EXCLUSIVE_EDITION: {
				ExclusiveEdition exclusiveEdition = (ExclusiveEdition)theEObject;
				T result = caseExclusiveEdition(exclusiveEdition);
				if (result == null) result = caseCTTTask(exclusiveEdition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.COLLABORATIVE_VISUALIZATION: {
				CollaborativeVisualization collaborativeVisualization = (CollaborativeVisualization)theEObject;
				T result = caseCollaborativeVisualization(collaborativeVisualization);
				if (result == null) result = caseCTTTask(collaborativeVisualization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.INDIVIDUAL_VISUALIZATION: {
				IndividualVisualization individualVisualization = (IndividualVisualization)theEObject;
				T result = caseIndividualVisualization(individualVisualization);
				if (result == null) result = caseCTTTask(individualVisualization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.USER_TASK: {
				UserTask userTask = (UserTask)theEObject;
				T result = caseUserTask(userTask);
				if (result == null) result = caseCTTTask(userTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.CTT_ABSTRACT_TASK: {
				CTTAbstractTask cttAbstractTask = (CTTAbstractTask)theEObject;
				T result = caseCTTAbstractTask(cttAbstractTask);
				if (result == null) result = caseCTTTask(cttAbstractTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.INTERACTIVE_TASK: {
				InteractiveTask interactiveTask = (InteractiveTask)theEObject;
				T result = caseInteractiveTask(interactiveTask);
				if (result == null) result = caseCTTTask(interactiveTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.CTT_COLLABORATIVE_TASK: {
				CTTCollaborativeTask cttCollaborativeTask = (CTTCollaborativeTask)theEObject;
				T result = caseCTTCollaborativeTask(cttCollaborativeTask);
				if (result == null) result = caseCTTTask(cttCollaborativeTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.APPLICATION_TASK: {
				ApplicationTask applicationTask = (ApplicationTask)theEObject;
				T result = caseApplicationTask(applicationTask);
				if (result == null) result = caseCTTTask(applicationTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.CTT_LINK: {
				CTTLink cttLink = (CTTLink)theEObject;
				T result = caseCTTLink(cttLink);
				if (result == null) result = caseLink(cttLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.AGGREGATION: {
				Aggregation aggregation = (Aggregation)theEObject;
				T result = caseAggregation(aggregation);
				if (result == null) result = caseCTTLink(aggregation);
				if (result == null) result = caseLink(aggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.ENABLING: {
				Enabling enabling = (Enabling)theEObject;
				T result = caseEnabling(enabling);
				if (result == null) result = caseCTTLink(enabling);
				if (result == null) result = caseLink(enabling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.DISABLING: {
				Disabling disabling = (Disabling)theEObject;
				T result = caseDisabling(disabling);
				if (result == null) result = caseCTTLink(disabling);
				if (result == null) result = caseLink(disabling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.ENABLING_WITH_INFORMATION_PASSING: {
				EnablingWithInformationPassing enablingWithInformationPassing = (EnablingWithInformationPassing)theEObject;
				T result = caseEnablingWithInformationPassing(enablingWithInformationPassing);
				if (result == null) result = caseCTTLink(enablingWithInformationPassing);
				if (result == null) result = caseLink(enablingWithInformationPassing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.DISABLING_WITH_INFORMATION_PASSING: {
				DisablingWithInformationPassing disablingWithInformationPassing = (DisablingWithInformationPassing)theEObject;
				T result = caseDisablingWithInformationPassing(disablingWithInformationPassing);
				if (result == null) result = caseCTTLink(disablingWithInformationPassing);
				if (result == null) result = caseLink(disablingWithInformationPassing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.INDEPENDENT_CONCURRENCY: {
				IndependentConcurrency independentConcurrency = (IndependentConcurrency)theEObject;
				T result = caseIndependentConcurrency(independentConcurrency);
				if (result == null) result = caseCTTLink(independentConcurrency);
				if (result == null) result = caseLink(independentConcurrency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.ORDER_INDEPENDENCE: {
				OrderIndependence orderIndependence = (OrderIndependence)theEObject;
				T result = caseOrderIndependence(orderIndependence);
				if (result == null) result = caseCTTLink(orderIndependence);
				if (result == null) result = caseLink(orderIndependence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.SUSPEND_RESUME: {
				SuspendResume suspendResume = (SuspendResume)theEObject;
				T result = caseSuspendResume(suspendResume);
				if (result == null) result = caseCTTLink(suspendResume);
				if (result == null) result = caseLink(suspendResume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.CONCURRENCY_WITH_INFORMATION_PASSING: {
				ConcurrencyWithInformationPassing concurrencyWithInformationPassing = (ConcurrencyWithInformationPassing)theEObject;
				T result = caseConcurrencyWithInformationPassing(concurrencyWithInformationPassing);
				if (result == null) result = caseCTTLink(concurrencyWithInformationPassing);
				if (result == null) result = caseLink(concurrencyWithInformationPassing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.DETERMINISTIC_CHOICE: {
				DeterministicChoice deterministicChoice = (DeterministicChoice)theEObject;
				T result = caseDeterministicChoice(deterministicChoice);
				if (result == null) result = caseCTTLink(deterministicChoice);
				if (result == null) result = caseLink(deterministicChoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.UNDETERMINISTIC_CHOICE: {
				UndeterministicChoice undeterministicChoice = (UndeterministicChoice)theEObject;
				T result = caseUndeterministicChoice(undeterministicChoice);
				if (result == null) result = caseCTTLink(undeterministicChoice);
				if (result == null) result = caseLink(undeterministicChoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_NODE: {
				MolefNode molefNode = (MolefNode)theEObject;
				T result = caseMolefNode(molefNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_CONTENT_NODE: {
				MolefContentNode molefContentNode = (MolefContentNode)theEObject;
				T result = caseMolefContentNode(molefContentNode);
				if (result == null) result = caseMolefNode(molefContentNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_LEARNING_NODE: {
				MolefLearningNode molefLearningNode = (MolefLearningNode)theEObject;
				T result = caseMolefLearningNode(molefLearningNode);
				if (result == null) result = caseMolefNode(molefLearningNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_CTT_NODE: {
				MolefCttNode molefCttNode = (MolefCttNode)theEObject;
				T result = caseMolefCttNode(molefCttNode);
				if (result == null) result = caseMolefNode(molefCttNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_CONTENT1: {
				MolefContent1 molefContent1 = (MolefContent1)theEObject;
				T result = caseMolefContent1(molefContent1);
				if (result == null) result = caseMolefContentNode(molefContent1);
				if (result == null) result = caseMolefNode(molefContent1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_CONTENT2: {
				MolefContent2 molefContent2 = (MolefContent2)theEObject;
				T result = caseMolefContent2(molefContent2);
				if (result == null) result = caseMolefContentNode(molefContent2);
				if (result == null) result = caseMolefNode(molefContent2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_CONTENT3: {
				MolefContent3 molefContent3 = (MolefContent3)theEObject;
				T result = caseMolefContent3(molefContent3);
				if (result == null) result = caseMolefContentNode(molefContent3);
				if (result == null) result = caseMolefNode(molefContent3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_CONTENT4: {
				MolefContent4 molefContent4 = (MolefContent4)theEObject;
				T result = caseMolefContent4(molefContent4);
				if (result == null) result = caseMolefContentNode(molefContent4);
				if (result == null) result = caseMolefNode(molefContent4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_CONTENT5: {
				MolefContent5 molefContent5 = (MolefContent5)theEObject;
				T result = caseMolefContent5(molefContent5);
				if (result == null) result = caseMolefContentNode(molefContent5);
				if (result == null) result = caseMolefNode(molefContent5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_CONTENT6: {
				MolefContent6 molefContent6 = (MolefContent6)theEObject;
				T result = caseMolefContent6(molefContent6);
				if (result == null) result = caseMolefContentNode(molefContent6);
				if (result == null) result = caseMolefNode(molefContent6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_TASK_AND_ACTIVITIES_NODE: {
				MolefTaskAndActivitiesNode molefTaskAndActivitiesNode = (MolefTaskAndActivitiesNode)theEObject;
				T result = caseMolefTaskAndActivitiesNode(molefTaskAndActivitiesNode);
				if (result == null) result = caseMolefLearningNode(molefTaskAndActivitiesNode);
				if (result == null) result = caseMolefNode(molefTaskAndActivitiesNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_TACTIVITIES1: {
				MolefTActivities1 molefTActivities1 = (MolefTActivities1)theEObject;
				T result = caseMolefTActivities1(molefTActivities1);
				if (result == null) result = caseMolefTaskAndActivitiesNode(molefTActivities1);
				if (result == null) result = caseMolefLearningNode(molefTActivities1);
				if (result == null) result = caseMolefNode(molefTActivities1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_TACTIVITIES2: {
				MolefTActivities2 molefTActivities2 = (MolefTActivities2)theEObject;
				T result = caseMolefTActivities2(molefTActivities2);
				if (result == null) result = caseMolefTaskAndActivitiesNode(molefTActivities2);
				if (result == null) result = caseMolefLearningNode(molefTActivities2);
				if (result == null) result = caseMolefNode(molefTActivities2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_TACTIVITIES3: {
				MolefTActivities3 molefTActivities3 = (MolefTActivities3)theEObject;
				T result = caseMolefTActivities3(molefTActivities3);
				if (result == null) result = caseMolefTaskAndActivitiesNode(molefTActivities3);
				if (result == null) result = caseMolefLearningNode(molefTActivities3);
				if (result == null) result = caseMolefNode(molefTActivities3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_TACTIVITIES4: {
				MolefTActivities4 molefTActivities4 = (MolefTActivities4)theEObject;
				T result = caseMolefTActivities4(molefTActivities4);
				if (result == null) result = caseMolefTaskAndActivitiesNode(molefTActivities4);
				if (result == null) result = caseMolefLearningNode(molefTActivities4);
				if (result == null) result = caseMolefNode(molefTActivities4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_TACTIVITIES5: {
				MolefTActivities5 molefTActivities5 = (MolefTActivities5)theEObject;
				T result = caseMolefTActivities5(molefTActivities5);
				if (result == null) result = caseMolefTaskAndActivitiesNode(molefTActivities5);
				if (result == null) result = caseMolefLearningNode(molefTActivities5);
				if (result == null) result = caseMolefNode(molefTActivities5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_TACTIVITIES6: {
				MolefTActivities6 molefTActivities6 = (MolefTActivities6)theEObject;
				T result = caseMolefTActivities6(molefTActivities6);
				if (result == null) result = caseMolefTaskAndActivitiesNode(molefTActivities6);
				if (result == null) result = caseMolefLearningNode(molefTActivities6);
				if (result == null) result = caseMolefNode(molefTActivities6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_TACTIVITIES7: {
				MolefTActivities7 molefTActivities7 = (MolefTActivities7)theEObject;
				T result = caseMolefTActivities7(molefTActivities7);
				if (result == null) result = caseMolefTaskAndActivitiesNode(molefTActivities7);
				if (result == null) result = caseMolefLearningNode(molefTActivities7);
				if (result == null) result = caseMolefNode(molefTActivities7);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_TACTIVITIES8: {
				MolefTActivities8 molefTActivities8 = (MolefTActivities8)theEObject;
				T result = caseMolefTActivities8(molefTActivities8);
				if (result == null) result = caseMolefTaskAndActivitiesNode(molefTActivities8);
				if (result == null) result = caseMolefLearningNode(molefTActivities8);
				if (result == null) result = caseMolefNode(molefTActivities8);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_SOCIAL_NODE: {
				MolefSocialNode molefSocialNode = (MolefSocialNode)theEObject;
				T result = caseMolefSocialNode(molefSocialNode);
				if (result == null) result = caseMolefLearningNode(molefSocialNode);
				if (result == null) result = caseMolefNode(molefSocialNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_SOCIAL1: {
				MolefSocial1 molefSocial1 = (MolefSocial1)theEObject;
				T result = caseMolefSocial1(molefSocial1);
				if (result == null) result = caseMolefSocialNode(molefSocial1);
				if (result == null) result = caseMolefLearningNode(molefSocial1);
				if (result == null) result = caseMolefNode(molefSocial1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_SOCIAL2: {
				MolefSocial2 molefSocial2 = (MolefSocial2)theEObject;
				T result = caseMolefSocial2(molefSocial2);
				if (result == null) result = caseMolefSocialNode(molefSocial2);
				if (result == null) result = caseMolefLearningNode(molefSocial2);
				if (result == null) result = caseMolefNode(molefSocial2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_SOCIAL3: {
				MolefSocial3 molefSocial3 = (MolefSocial3)theEObject;
				T result = caseMolefSocial3(molefSocial3);
				if (result == null) result = caseMolefSocialNode(molefSocial3);
				if (result == null) result = caseMolefLearningNode(molefSocial3);
				if (result == null) result = caseMolefNode(molefSocial3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_SOCIAL4: {
				MolefSocial4 molefSocial4 = (MolefSocial4)theEObject;
				T result = caseMolefSocial4(molefSocial4);
				if (result == null) result = caseMolefSocialNode(molefSocial4);
				if (result == null) result = caseMolefLearningNode(molefSocial4);
				if (result == null) result = caseMolefNode(molefSocial4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_PERSONALIZATION_NODE: {
				MolefPersonalizationNode molefPersonalizationNode = (MolefPersonalizationNode)theEObject;
				T result = caseMolefPersonalizationNode(molefPersonalizationNode);
				if (result == null) result = caseMolefLearningNode(molefPersonalizationNode);
				if (result == null) result = caseMolefNode(molefPersonalizationNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_PERSONALIZATION1: {
				MolefPersonalization1 molefPersonalization1 = (MolefPersonalization1)theEObject;
				T result = caseMolefPersonalization1(molefPersonalization1);
				if (result == null) result = caseMolefPersonalizationNode(molefPersonalization1);
				if (result == null) result = caseMolefLearningNode(molefPersonalization1);
				if (result == null) result = caseMolefNode(molefPersonalization1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_PERSONALIZATION2: {
				MolefPersonalization2 molefPersonalization2 = (MolefPersonalization2)theEObject;
				T result = caseMolefPersonalization2(molefPersonalization2);
				if (result == null) result = caseMolefPersonalizationNode(molefPersonalization2);
				if (result == null) result = caseMolefLearningNode(molefPersonalization2);
				if (result == null) result = caseMolefNode(molefPersonalization2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_PERSONALIZATION3: {
				MolefPersonalization3 molefPersonalization3 = (MolefPersonalization3)theEObject;
				T result = caseMolefPersonalization3(molefPersonalization3);
				if (result == null) result = caseMolefPersonalizationNode(molefPersonalization3);
				if (result == null) result = caseMolefLearningNode(molefPersonalization3);
				if (result == null) result = caseMolefNode(molefPersonalization3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_PERSONALIZATION4: {
				MolefPersonalization4 molefPersonalization4 = (MolefPersonalization4)theEObject;
				T result = caseMolefPersonalization4(molefPersonalization4);
				if (result == null) result = caseMolefPersonalizationNode(molefPersonalization4);
				if (result == null) result = caseMolefLearningNode(molefPersonalization4);
				if (result == null) result = caseMolefNode(molefPersonalization4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_PERSONALIZATION5: {
				MolefPersonalization5 molefPersonalization5 = (MolefPersonalization5)theEObject;
				T result = caseMolefPersonalization5(molefPersonalization5);
				if (result == null) result = caseMolefPersonalizationNode(molefPersonalization5);
				if (result == null) result = caseMolefLearningNode(molefPersonalization5);
				if (result == null) result = caseMolefNode(molefPersonalization5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_MULTIMEDIA_NODE: {
				MolefMultimediaNode molefMultimediaNode = (MolefMultimediaNode)theEObject;
				T result = caseMolefMultimediaNode(molefMultimediaNode);
				if (result == null) result = caseMolefCttNode(molefMultimediaNode);
				if (result == null) result = caseMolefNode(molefMultimediaNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_MULTIMEDIA1: {
				MolefMultimedia1 molefMultimedia1 = (MolefMultimedia1)theEObject;
				T result = caseMolefMultimedia1(molefMultimedia1);
				if (result == null) result = caseMolefMultimediaNode(molefMultimedia1);
				if (result == null) result = caseMolefCttNode(molefMultimedia1);
				if (result == null) result = caseMolefNode(molefMultimedia1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_MULTIMEDIA2: {
				MolefMultimedia2 molefMultimedia2 = (MolefMultimedia2)theEObject;
				T result = caseMolefMultimedia2(molefMultimedia2);
				if (result == null) result = caseMolefMultimediaNode(molefMultimedia2);
				if (result == null) result = caseMolefCttNode(molefMultimedia2);
				if (result == null) result = caseMolefNode(molefMultimedia2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_MULTIMEDIA3: {
				MolefMultimedia3 molefMultimedia3 = (MolefMultimedia3)theEObject;
				T result = caseMolefMultimedia3(molefMultimedia3);
				if (result == null) result = caseMolefMultimediaNode(molefMultimedia3);
				if (result == null) result = caseMolefCttNode(molefMultimedia3);
				if (result == null) result = caseMolefNode(molefMultimedia3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_MULTIMEDIA4: {
				MolefMultimedia4 molefMultimedia4 = (MolefMultimedia4)theEObject;
				T result = caseMolefMultimedia4(molefMultimedia4);
				if (result == null) result = caseMolefMultimediaNode(molefMultimedia4);
				if (result == null) result = caseMolefCttNode(molefMultimedia4);
				if (result == null) result = caseMolefNode(molefMultimedia4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_MULTIMEDIA5: {
				MolefMultimedia5 molefMultimedia5 = (MolefMultimedia5)theEObject;
				T result = caseMolefMultimedia5(molefMultimedia5);
				if (result == null) result = caseMolefMultimediaNode(molefMultimedia5);
				if (result == null) result = caseMolefCttNode(molefMultimedia5);
				if (result == null) result = caseMolefNode(molefMultimedia5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_MULTIMEDIA6: {
				MolefMultimedia6 molefMultimedia6 = (MolefMultimedia6)theEObject;
				T result = caseMolefMultimedia6(molefMultimedia6);
				if (result == null) result = caseMolefMultimediaNode(molefMultimedia6);
				if (result == null) result = caseMolefCttNode(molefMultimedia6);
				if (result == null) result = caseMolefNode(molefMultimedia6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LciatPackage.MOLEF_MULTIMEDIA7: {
				MolefMultimedia7 molefMultimedia7 = (MolefMultimedia7)theEObject;
				T result = caseMolefMultimedia7(molefMultimedia7);
				if (result == null) result = caseMolefMultimediaNode(molefMultimedia7);
				if (result == null) result = caseMolefCttNode(molefMultimedia7);
				if (result == null) result = caseMolefNode(molefMultimedia7);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LCIAN Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LCIAN Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLCIANDiagram(LCIANDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sociogram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sociogram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSociogram(Sociogram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sociogram Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sociogram Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSociogramNode(SociogramNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRol(Rol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sociogram Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sociogram Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSociogramLink(SociogramLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inheritance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritance(Inheritance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActing(Acting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Learning Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Learning Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLearningDiagram(LearningDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Learning Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Learning Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLearningNode(LearningNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInit(Init object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnd(End object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Learning Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Learning Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLearningActivity(LearningActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Side Learning Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Side Learning Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeftSideLearningNode(LeftSideLearningNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividualTask(IndividualTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupTask(GroupTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTask(AbstractTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detailed Abstract Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detailed Abstract Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetailedAbstractTask(DetailedAbstractTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(lciat.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalCondition(TemporalCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotification(Notification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtype(Subtype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assimilative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assimilative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssimilative(Assimilative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Handling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Handling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationHandling(InformationHandling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptive(Adaptive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communicative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communicative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicative(Communicative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Productive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Productive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductive(Productive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experiential</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experiential</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperiential(Experiential object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluative(Evaluative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupport(Support object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModality(Modality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Face To Face</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Face To Face</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaceToFace(FaceToFace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computer Supported</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computer Supported</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputerSupported(ComputerSupported object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Online</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Online</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnline(Online object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Learning Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Learning Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLearningLink(LearningLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enabling WO Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enabling WO Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnablingWOInformation(EnablingWOInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enabling WInformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enabling WInformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnablingWInformation(EnablingWInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoice(Choice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concurrency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concurrency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcurrency(Concurrency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTool(Tool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphical Editor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphical Editor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicalEditor(GraphicalEditor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Editor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Editor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextEditor(TextEditor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Editor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Editor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeEditor(CodeEditor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Viewer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Viewer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebViewer(WebViewer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Awareness</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Awareness</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwareness(Awareness object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Session Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Session Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSessionPanel(SessionPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChat(Chat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Taking Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Taking Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnTakingTool(TurnTakingTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telepointer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telepointer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelepointer(Telepointer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radar View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radar View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRadarView(RadarView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperties(Properties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Console</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Console</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsole(Console object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problems</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problems</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblems(Problems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceability(Traceability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CTT Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CTT Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCTTDiagram(CTTDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CTT Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CTT Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCTTTask(CTTTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive Edition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive Edition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusiveEdition(ExclusiveEdition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaborative Visualization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaborative Visualization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaborativeVisualization(CollaborativeVisualization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual Visualization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual Visualization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividualVisualization(IndividualVisualization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserTask(UserTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CTT Abstract Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CTT Abstract Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCTTAbstractTask(CTTAbstractTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interactive Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interactive Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractiveTask(InteractiveTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CTT Collaborative Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CTT Collaborative Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCTTCollaborativeTask(CTTCollaborativeTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationTask(ApplicationTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CTT Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CTT Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCTTLink(CTTLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregation(Aggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enabling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enabling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnabling(Enabling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disabling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disabling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisabling(Disabling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enabling With Information Passing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enabling With Information Passing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnablingWithInformationPassing(EnablingWithInformationPassing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disabling With Information Passing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disabling With Information Passing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisablingWithInformationPassing(DisablingWithInformationPassing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Independent Concurrency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Independent Concurrency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndependentConcurrency(IndependentConcurrency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order Independence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order Independence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderIndependence(OrderIndependence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suspend Resume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suspend Resume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuspendResume(SuspendResume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concurrency With Information Passing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concurrency With Information Passing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcurrencyWithInformationPassing(ConcurrencyWithInformationPassing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deterministic Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deterministic Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeterministicChoice(DeterministicChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Undeterministic Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Undeterministic Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUndeterministicChoice(UndeterministicChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefNode(MolefNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Content Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Content Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefContentNode(MolefContentNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Learning Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Learning Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefLearningNode(MolefLearningNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Ctt Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Ctt Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefCttNode(MolefCttNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Content1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Content1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefContent1(MolefContent1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Content2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Content2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefContent2(MolefContent2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Content3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Content3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefContent3(MolefContent3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Content4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Content4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefContent4(MolefContent4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Content5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Content5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefContent5(MolefContent5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Content6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Content6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefContent6(MolefContent6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Task And Activities Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Task And Activities Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefTaskAndActivitiesNode(MolefTaskAndActivitiesNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef TActivities1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef TActivities1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefTActivities1(MolefTActivities1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef TActivities2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef TActivities2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefTActivities2(MolefTActivities2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef TActivities3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef TActivities3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefTActivities3(MolefTActivities3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef TActivities4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef TActivities4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefTActivities4(MolefTActivities4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef TActivities5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef TActivities5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefTActivities5(MolefTActivities5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef TActivities6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef TActivities6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefTActivities6(MolefTActivities6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef TActivities7</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef TActivities7</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefTActivities7(MolefTActivities7 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef TActivities8</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef TActivities8</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefTActivities8(MolefTActivities8 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Social Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Social Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefSocialNode(MolefSocialNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Social1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Social1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefSocial1(MolefSocial1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Social2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Social2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefSocial2(MolefSocial2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Social3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Social3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefSocial3(MolefSocial3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Social4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Social4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefSocial4(MolefSocial4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Personalization Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Personalization Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefPersonalizationNode(MolefPersonalizationNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Personalization1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Personalization1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefPersonalization1(MolefPersonalization1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Personalization2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Personalization2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefPersonalization2(MolefPersonalization2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Personalization3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Personalization3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefPersonalization3(MolefPersonalization3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Personalization4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Personalization4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefPersonalization4(MolefPersonalization4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Personalization5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Personalization5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefPersonalization5(MolefPersonalization5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Multimedia Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Multimedia Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefMultimediaNode(MolefMultimediaNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Multimedia1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Multimedia1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefMultimedia1(MolefMultimedia1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Multimedia2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Multimedia2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefMultimedia2(MolefMultimedia2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Multimedia3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Multimedia3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefMultimedia3(MolefMultimedia3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Multimedia4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Multimedia4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefMultimedia4(MolefMultimedia4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Multimedia5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Multimedia5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefMultimedia5(MolefMultimedia5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Multimedia6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Multimedia6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefMultimedia6(MolefMultimedia6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molef Multimedia7</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molef Multimedia7</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolefMultimedia7(MolefMultimedia7 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LciatSwitch
