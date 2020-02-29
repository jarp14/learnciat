/**
 */
package lciat.impl;

import lciat.AbstractTask;
import lciat.Acting;
import lciat.Adaptive;
import lciat.Aggregation;
import lciat.ApplicationTask;
import lciat.Assimilative;
import lciat.Association;
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
import lciat.Language;
import lciat.LciatFactory;
import lciat.LciatPackage;
import lciat.LearningActivity;
import lciat.LearningDiagram;
import lciat.LearningLink;
import lciat.LearningNode;
import lciat.Modalities;
import lciat.Modality;
import lciat.MolefContent1;
import lciat.MolefContent2;
import lciat.MolefContent3;
import lciat.MolefContent4;
import lciat.MolefContent5;
import lciat.MolefContent6;
import lciat.MolefMultimedia1;
import lciat.MolefMultimedia2;
import lciat.MolefMultimedia3;
import lciat.MolefMultimedia4;
import lciat.MolefMultimedia5;
import lciat.MolefMultimedia6;
import lciat.MolefMultimedia7;
import lciat.MolefMultimediaNode;
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
import lciat.Position;
import lciat.Problems;
import lciat.Productive;
import lciat.Properties;
import lciat.RadarView;
import lciat.Rol;
import lciat.SessionPanel;
import lciat.Size;
import lciat.Sociogram;
import lciat.SociogramLink;
import lciat.SociogramNode;
import lciat.Subtype;
import lciat.Subtypes;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LciatFactoryImpl extends EFactoryImpl implements LciatFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LciatFactory init() {
		try {
			LciatFactory theLciatFactory = (LciatFactory)EPackage.Registry.INSTANCE.getEFactory(LciatPackage.eNS_URI);
			if (theLciatFactory != null) {
				return theLciatFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LciatFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LciatFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LciatPackage.LCIAN_DIAGRAM: return createLCIANDiagram();
			case LciatPackage.SOCIOGRAM: return createSociogram();
			case LciatPackage.SOCIOGRAM_NODE: return createSociogramNode();
			case LciatPackage.ROL: return createRol();
			case LciatPackage.GROUP: return createGroup();
			case LciatPackage.SOCIOGRAM_LINK: return createSociogramLink();
			case LciatPackage.INHERITANCE: return createInheritance();
			case LciatPackage.ACTING: return createActing();
			case LciatPackage.ASSOCIATION: return createAssociation();
			case LciatPackage.LEARNING_DIAGRAM: return createLearningDiagram();
			case LciatPackage.LEARNING_NODE: return createLearningNode();
			case LciatPackage.INIT: return createInit();
			case LciatPackage.END: return createEnd();
			case LciatPackage.LEARNING_ACTIVITY: return createLearningActivity();
			case LciatPackage.INDIVIDUAL_TASK: return createIndividualTask();
			case LciatPackage.GROUP_TASK: return createGroupTask();
			case LciatPackage.ABSTRACT_TASK: return createAbstractTask();
			case LciatPackage.DETAILED_ABSTRACT_TASK: return createDetailedAbstractTask();
			case LciatPackage.OBJECT: return createObject();
			case LciatPackage.TEMPORAL_CONDITION: return createTemporalCondition();
			case LciatPackage.NOTIFICATION: return createNotification();
			case LciatPackage.CONDITION: return createCondition();
			case LciatPackage.SUBTYPE: return createSubtype();
			case LciatPackage.ASSIMILATIVE: return createAssimilative();
			case LciatPackage.INFORMATION_HANDLING: return createInformationHandling();
			case LciatPackage.ADAPTIVE: return createAdaptive();
			case LciatPackage.COMMUNICATIVE: return createCommunicative();
			case LciatPackage.PRODUCTIVE: return createProductive();
			case LciatPackage.EXPERIENTIAL: return createExperiential();
			case LciatPackage.EVALUATIVE: return createEvaluative();
			case LciatPackage.SUPPORT: return createSupport();
			case LciatPackage.MODALITY: return createModality();
			case LciatPackage.FACE_TO_FACE: return createFaceToFace();
			case LciatPackage.COMPUTER_SUPPORTED: return createComputerSupported();
			case LciatPackage.ONLINE: return createOnline();
			case LciatPackage.LEARNING_LINK: return createLearningLink();
			case LciatPackage.ENABLING_WO_INFORMATION: return createEnablingWOInformation();
			case LciatPackage.ENABLING_WINFORMATION: return createEnablingWInformation();
			case LciatPackage.CHOICE: return createChoice();
			case LciatPackage.CONCURRENCY: return createConcurrency();
			case LciatPackage.TOOL: return createTool();
			case LciatPackage.GRAPHICAL_EDITOR: return createGraphicalEditor();
			case LciatPackage.TEXT_EDITOR: return createTextEditor();
			case LciatPackage.CODE_EDITOR: return createCodeEditor();
			case LciatPackage.WEB_VIEWER: return createWebViewer();
			case LciatPackage.SESSION_PANEL: return createSessionPanel();
			case LciatPackage.CHAT: return createChat();
			case LciatPackage.TURN_TAKING_TOOL: return createTurnTakingTool();
			case LciatPackage.TELEPOINTER: return createTelepointer();
			case LciatPackage.RADAR_VIEW: return createRadarView();
			case LciatPackage.PROPERTIES: return createProperties();
			case LciatPackage.CONSOLE: return createConsole();
			case LciatPackage.PROBLEMS: return createProblems();
			case LciatPackage.TRACEABILITY: return createTraceability();
			case LciatPackage.CTT_DIAGRAM: return createCTTDiagram();
			case LciatPackage.CTT_TASK: return createCTTTask();
			case LciatPackage.EXCLUSIVE_EDITION: return createExclusiveEdition();
			case LciatPackage.COLLABORATIVE_VISUALIZATION: return createCollaborativeVisualization();
			case LciatPackage.INDIVIDUAL_VISUALIZATION: return createIndividualVisualization();
			case LciatPackage.USER_TASK: return createUserTask();
			case LciatPackage.CTT_ABSTRACT_TASK: return createCTTAbstractTask();
			case LciatPackage.INTERACTIVE_TASK: return createInteractiveTask();
			case LciatPackage.CTT_COLLABORATIVE_TASK: return createCTTCollaborativeTask();
			case LciatPackage.APPLICATION_TASK: return createApplicationTask();
			case LciatPackage.CTT_LINK: return createCTTLink();
			case LciatPackage.AGGREGATION: return createAggregation();
			case LciatPackage.ENABLING: return createEnabling();
			case LciatPackage.DISABLING: return createDisabling();
			case LciatPackage.ENABLING_WITH_INFORMATION_PASSING: return createEnablingWithInformationPassing();
			case LciatPackage.DISABLING_WITH_INFORMATION_PASSING: return createDisablingWithInformationPassing();
			case LciatPackage.INDEPENDENT_CONCURRENCY: return createIndependentConcurrency();
			case LciatPackage.ORDER_INDEPENDENCE: return createOrderIndependence();
			case LciatPackage.SUSPEND_RESUME: return createSuspendResume();
			case LciatPackage.CONCURRENCY_WITH_INFORMATION_PASSING: return createConcurrencyWithInformationPassing();
			case LciatPackage.DETERMINISTIC_CHOICE: return createDeterministicChoice();
			case LciatPackage.UNDETERMINISTIC_CHOICE: return createUndeterministicChoice();
			case LciatPackage.MOLEF_CONTENT1: return createMolefContent1();
			case LciatPackage.MOLEF_CONTENT2: return createMolefContent2();
			case LciatPackage.MOLEF_CONTENT3: return createMolefContent3();
			case LciatPackage.MOLEF_CONTENT4: return createMolefContent4();
			case LciatPackage.MOLEF_CONTENT5: return createMolefContent5();
			case LciatPackage.MOLEF_CONTENT6: return createMolefContent6();
			case LciatPackage.MOLEF_TASK_AND_ACTIVITIES_NODE: return createMolefTaskAndActivitiesNode();
			case LciatPackage.MOLEF_TACTIVITIES1: return createMolefTActivities1();
			case LciatPackage.MOLEF_TACTIVITIES2: return createMolefTActivities2();
			case LciatPackage.MOLEF_TACTIVITIES3: return createMolefTActivities3();
			case LciatPackage.MOLEF_TACTIVITIES4: return createMolefTActivities4();
			case LciatPackage.MOLEF_TACTIVITIES5: return createMolefTActivities5();
			case LciatPackage.MOLEF_TACTIVITIES6: return createMolefTActivities6();
			case LciatPackage.MOLEF_TACTIVITIES7: return createMolefTActivities7();
			case LciatPackage.MOLEF_TACTIVITIES8: return createMolefTActivities8();
			case LciatPackage.MOLEF_SOCIAL_NODE: return createMolefSocialNode();
			case LciatPackage.MOLEF_SOCIAL1: return createMolefSocial1();
			case LciatPackage.MOLEF_SOCIAL2: return createMolefSocial2();
			case LciatPackage.MOLEF_SOCIAL3: return createMolefSocial3();
			case LciatPackage.MOLEF_SOCIAL4: return createMolefSocial4();
			case LciatPackage.MOLEF_PERSONALIZATION_NODE: return createMolefPersonalizationNode();
			case LciatPackage.MOLEF_PERSONALIZATION1: return createMolefPersonalization1();
			case LciatPackage.MOLEF_PERSONALIZATION2: return createMolefPersonalization2();
			case LciatPackage.MOLEF_PERSONALIZATION3: return createMolefPersonalization3();
			case LciatPackage.MOLEF_PERSONALIZATION4: return createMolefPersonalization4();
			case LciatPackage.MOLEF_PERSONALIZATION5: return createMolefPersonalization5();
			case LciatPackage.MOLEF_MULTIMEDIA_NODE: return createMolefMultimediaNode();
			case LciatPackage.MOLEF_MULTIMEDIA1: return createMolefMultimedia1();
			case LciatPackage.MOLEF_MULTIMEDIA2: return createMolefMultimedia2();
			case LciatPackage.MOLEF_MULTIMEDIA3: return createMolefMultimedia3();
			case LciatPackage.MOLEF_MULTIMEDIA4: return createMolefMultimedia4();
			case LciatPackage.MOLEF_MULTIMEDIA5: return createMolefMultimedia5();
			case LciatPackage.MOLEF_MULTIMEDIA6: return createMolefMultimedia6();
			case LciatPackage.MOLEF_MULTIMEDIA7: return createMolefMultimedia7();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LciatPackage.SUBTYPES:
				return createSubtypesFromString(eDataType, initialValue);
			case LciatPackage.MODALITIES:
				return createModalitiesFromString(eDataType, initialValue);
			case LciatPackage.POSITION:
				return createPositionFromString(eDataType, initialValue);
			case LciatPackage.LANGUAGE:
				return createLanguageFromString(eDataType, initialValue);
			case LciatPackage.SIZE:
				return createSizeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LciatPackage.SUBTYPES:
				return convertSubtypesToString(eDataType, instanceValue);
			case LciatPackage.MODALITIES:
				return convertModalitiesToString(eDataType, instanceValue);
			case LciatPackage.POSITION:
				return convertPositionToString(eDataType, instanceValue);
			case LciatPackage.LANGUAGE:
				return convertLanguageToString(eDataType, instanceValue);
			case LciatPackage.SIZE:
				return convertSizeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LCIANDiagram createLCIANDiagram() {
		LCIANDiagramImpl lcianDiagram = new LCIANDiagramImpl();
		return lcianDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sociogram createSociogram() {
		SociogramImpl sociogram = new SociogramImpl();
		return sociogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SociogramNode createSociogramNode() {
		SociogramNodeImpl sociogramNode = new SociogramNodeImpl();
		return sociogramNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rol createRol() {
		RolImpl rol = new RolImpl();
		return rol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SociogramLink createSociogramLink() {
		SociogramLinkImpl sociogramLink = new SociogramLinkImpl();
		return sociogramLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inheritance createInheritance() {
		InheritanceImpl inheritance = new InheritanceImpl();
		return inheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Acting createActing() {
		ActingImpl acting = new ActingImpl();
		return acting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningDiagram createLearningDiagram() {
		LearningDiagramImpl learningDiagram = new LearningDiagramImpl();
		return learningDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningNode createLearningNode() {
		LearningNodeImpl learningNode = new LearningNodeImpl();
		return learningNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Init createInit() {
		InitImpl init = new InitImpl();
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End createEnd() {
		EndImpl end = new EndImpl();
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningActivity createLearningActivity() {
		LearningActivityImpl learningActivity = new LearningActivityImpl();
		return learningActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualTask createIndividualTask() {
		IndividualTaskImpl individualTask = new IndividualTaskImpl();
		return individualTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupTask createGroupTask() {
		GroupTaskImpl groupTask = new GroupTaskImpl();
		return groupTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTask createAbstractTask() {
		AbstractTaskImpl abstractTask = new AbstractTaskImpl();
		return abstractTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetailedAbstractTask createDetailedAbstractTask() {
		DetailedAbstractTaskImpl detailedAbstractTask = new DetailedAbstractTaskImpl();
		return detailedAbstractTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public lciat.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalCondition createTemporalCondition() {
		TemporalConditionImpl temporalCondition = new TemporalConditionImpl();
		return temporalCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notification createNotification() {
		NotificationImpl notification = new NotificationImpl();
		return notification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtype createSubtype() {
		SubtypeImpl subtype = new SubtypeImpl();
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assimilative createAssimilative() {
		AssimilativeImpl assimilative = new AssimilativeImpl();
		return assimilative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationHandling createInformationHandling() {
		InformationHandlingImpl informationHandling = new InformationHandlingImpl();
		return informationHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adaptive createAdaptive() {
		AdaptiveImpl adaptive = new AdaptiveImpl();
		return adaptive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communicative createCommunicative() {
		CommunicativeImpl communicative = new CommunicativeImpl();
		return communicative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Productive createProductive() {
		ProductiveImpl productive = new ProductiveImpl();
		return productive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Experiential createExperiential() {
		ExperientialImpl experiential = new ExperientialImpl();
		return experiential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluative createEvaluative() {
		EvaluativeImpl evaluative = new EvaluativeImpl();
		return evaluative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Support createSupport() {
		SupportImpl support = new SupportImpl();
		return support;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modality createModality() {
		ModalityImpl modality = new ModalityImpl();
		return modality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaceToFace createFaceToFace() {
		FaceToFaceImpl faceToFace = new FaceToFaceImpl();
		return faceToFace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputerSupported createComputerSupported() {
		ComputerSupportedImpl computerSupported = new ComputerSupportedImpl();
		return computerSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Online createOnline() {
		OnlineImpl online = new OnlineImpl();
		return online;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningLink createLearningLink() {
		LearningLinkImpl learningLink = new LearningLinkImpl();
		return learningLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnablingWOInformation createEnablingWOInformation() {
		EnablingWOInformationImpl enablingWOInformation = new EnablingWOInformationImpl();
		return enablingWOInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnablingWInformation createEnablingWInformation() {
		EnablingWInformationImpl enablingWInformation = new EnablingWInformationImpl();
		return enablingWInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice createChoice() {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concurrency createConcurrency() {
		ConcurrencyImpl concurrency = new ConcurrencyImpl();
		return concurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tool createTool() {
		ToolImpl tool = new ToolImpl();
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalEditor createGraphicalEditor() {
		GraphicalEditorImpl graphicalEditor = new GraphicalEditorImpl();
		return graphicalEditor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextEditor createTextEditor() {
		TextEditorImpl textEditor = new TextEditorImpl();
		return textEditor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeEditor createCodeEditor() {
		CodeEditorImpl codeEditor = new CodeEditorImpl();
		return codeEditor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebViewer createWebViewer() {
		WebViewerImpl webViewer = new WebViewerImpl();
		return webViewer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionPanel createSessionPanel() {
		SessionPanelImpl sessionPanel = new SessionPanelImpl();
		return sessionPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chat createChat() {
		ChatImpl chat = new ChatImpl();
		return chat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnTakingTool createTurnTakingTool() {
		TurnTakingToolImpl turnTakingTool = new TurnTakingToolImpl();
		return turnTakingTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Telepointer createTelepointer() {
		TelepointerImpl telepointer = new TelepointerImpl();
		return telepointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadarView createRadarView() {
		RadarViewImpl radarView = new RadarViewImpl();
		return radarView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties createProperties() {
		PropertiesImpl properties = new PropertiesImpl();
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Console createConsole() {
		ConsoleImpl console = new ConsoleImpl();
		return console;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Problems createProblems() {
		ProblemsImpl problems = new ProblemsImpl();
		return problems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Traceability createTraceability() {
		TraceabilityImpl traceability = new TraceabilityImpl();
		return traceability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTTDiagram createCTTDiagram() {
		CTTDiagramImpl cttDiagram = new CTTDiagramImpl();
		return cttDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTTTask createCTTTask() {
		CTTTaskImpl cttTask = new CTTTaskImpl();
		return cttTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveEdition createExclusiveEdition() {
		ExclusiveEditionImpl exclusiveEdition = new ExclusiveEditionImpl();
		return exclusiveEdition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborativeVisualization createCollaborativeVisualization() {
		CollaborativeVisualizationImpl collaborativeVisualization = new CollaborativeVisualizationImpl();
		return collaborativeVisualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualVisualization createIndividualVisualization() {
		IndividualVisualizationImpl individualVisualization = new IndividualVisualizationImpl();
		return individualVisualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTask createUserTask() {
		UserTaskImpl userTask = new UserTaskImpl();
		return userTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTTAbstractTask createCTTAbstractTask() {
		CTTAbstractTaskImpl cttAbstractTask = new CTTAbstractTaskImpl();
		return cttAbstractTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractiveTask createInteractiveTask() {
		InteractiveTaskImpl interactiveTask = new InteractiveTaskImpl();
		return interactiveTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTTCollaborativeTask createCTTCollaborativeTask() {
		CTTCollaborativeTaskImpl cttCollaborativeTask = new CTTCollaborativeTaskImpl();
		return cttCollaborativeTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationTask createApplicationTask() {
		ApplicationTaskImpl applicationTask = new ApplicationTaskImpl();
		return applicationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTTLink createCTTLink() {
		CTTLinkImpl cttLink = new CTTLinkImpl();
		return cttLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aggregation createAggregation() {
		AggregationImpl aggregation = new AggregationImpl();
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enabling createEnabling() {
		EnablingImpl enabling = new EnablingImpl();
		return enabling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Disabling createDisabling() {
		DisablingImpl disabling = new DisablingImpl();
		return disabling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnablingWithInformationPassing createEnablingWithInformationPassing() {
		EnablingWithInformationPassingImpl enablingWithInformationPassing = new EnablingWithInformationPassingImpl();
		return enablingWithInformationPassing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisablingWithInformationPassing createDisablingWithInformationPassing() {
		DisablingWithInformationPassingImpl disablingWithInformationPassing = new DisablingWithInformationPassingImpl();
		return disablingWithInformationPassing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndependentConcurrency createIndependentConcurrency() {
		IndependentConcurrencyImpl independentConcurrency = new IndependentConcurrencyImpl();
		return independentConcurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderIndependence createOrderIndependence() {
		OrderIndependenceImpl orderIndependence = new OrderIndependenceImpl();
		return orderIndependence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuspendResume createSuspendResume() {
		SuspendResumeImpl suspendResume = new SuspendResumeImpl();
		return suspendResume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcurrencyWithInformationPassing createConcurrencyWithInformationPassing() {
		ConcurrencyWithInformationPassingImpl concurrencyWithInformationPassing = new ConcurrencyWithInformationPassingImpl();
		return concurrencyWithInformationPassing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeterministicChoice createDeterministicChoice() {
		DeterministicChoiceImpl deterministicChoice = new DeterministicChoiceImpl();
		return deterministicChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UndeterministicChoice createUndeterministicChoice() {
		UndeterministicChoiceImpl undeterministicChoice = new UndeterministicChoiceImpl();
		return undeterministicChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefContent1 createMolefContent1() {
		MolefContent1Impl molefContent1 = new MolefContent1Impl();
		return molefContent1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefContent2 createMolefContent2() {
		MolefContent2Impl molefContent2 = new MolefContent2Impl();
		return molefContent2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefContent3 createMolefContent3() {
		MolefContent3Impl molefContent3 = new MolefContent3Impl();
		return molefContent3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefContent4 createMolefContent4() {
		MolefContent4Impl molefContent4 = new MolefContent4Impl();
		return molefContent4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefContent5 createMolefContent5() {
		MolefContent5Impl molefContent5 = new MolefContent5Impl();
		return molefContent5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefContent6 createMolefContent6() {
		MolefContent6Impl molefContent6 = new MolefContent6Impl();
		return molefContent6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefTaskAndActivitiesNode createMolefTaskAndActivitiesNode() {
		MolefTaskAndActivitiesNodeImpl molefTaskAndActivitiesNode = new MolefTaskAndActivitiesNodeImpl();
		return molefTaskAndActivitiesNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefTActivities1 createMolefTActivities1() {
		MolefTActivities1Impl molefTActivities1 = new MolefTActivities1Impl();
		return molefTActivities1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefTActivities2 createMolefTActivities2() {
		MolefTActivities2Impl molefTActivities2 = new MolefTActivities2Impl();
		return molefTActivities2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefTActivities3 createMolefTActivities3() {
		MolefTActivities3Impl molefTActivities3 = new MolefTActivities3Impl();
		return molefTActivities3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefTActivities4 createMolefTActivities4() {
		MolefTActivities4Impl molefTActivities4 = new MolefTActivities4Impl();
		return molefTActivities4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefTActivities5 createMolefTActivities5() {
		MolefTActivities5Impl molefTActivities5 = new MolefTActivities5Impl();
		return molefTActivities5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefTActivities6 createMolefTActivities6() {
		MolefTActivities6Impl molefTActivities6 = new MolefTActivities6Impl();
		return molefTActivities6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefTActivities7 createMolefTActivities7() {
		MolefTActivities7Impl molefTActivities7 = new MolefTActivities7Impl();
		return molefTActivities7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefTActivities8 createMolefTActivities8() {
		MolefTActivities8Impl molefTActivities8 = new MolefTActivities8Impl();
		return molefTActivities8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefSocialNode createMolefSocialNode() {
		MolefSocialNodeImpl molefSocialNode = new MolefSocialNodeImpl();
		return molefSocialNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefSocial1 createMolefSocial1() {
		MolefSocial1Impl molefSocial1 = new MolefSocial1Impl();
		return molefSocial1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefSocial2 createMolefSocial2() {
		MolefSocial2Impl molefSocial2 = new MolefSocial2Impl();
		return molefSocial2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefSocial3 createMolefSocial3() {
		MolefSocial3Impl molefSocial3 = new MolefSocial3Impl();
		return molefSocial3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefSocial4 createMolefSocial4() {
		MolefSocial4Impl molefSocial4 = new MolefSocial4Impl();
		return molefSocial4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefPersonalizationNode createMolefPersonalizationNode() {
		MolefPersonalizationNodeImpl molefPersonalizationNode = new MolefPersonalizationNodeImpl();
		return molefPersonalizationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefPersonalization1 createMolefPersonalization1() {
		MolefPersonalization1Impl molefPersonalization1 = new MolefPersonalization1Impl();
		return molefPersonalization1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefPersonalization2 createMolefPersonalization2() {
		MolefPersonalization2Impl molefPersonalization2 = new MolefPersonalization2Impl();
		return molefPersonalization2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefPersonalization3 createMolefPersonalization3() {
		MolefPersonalization3Impl molefPersonalization3 = new MolefPersonalization3Impl();
		return molefPersonalization3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefPersonalization4 createMolefPersonalization4() {
		MolefPersonalization4Impl molefPersonalization4 = new MolefPersonalization4Impl();
		return molefPersonalization4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefPersonalization5 createMolefPersonalization5() {
		MolefPersonalization5Impl molefPersonalization5 = new MolefPersonalization5Impl();
		return molefPersonalization5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefMultimediaNode createMolefMultimediaNode() {
		MolefMultimediaNodeImpl molefMultimediaNode = new MolefMultimediaNodeImpl();
		return molefMultimediaNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefMultimedia1 createMolefMultimedia1() {
		MolefMultimedia1Impl molefMultimedia1 = new MolefMultimedia1Impl();
		return molefMultimedia1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefMultimedia2 createMolefMultimedia2() {
		MolefMultimedia2Impl molefMultimedia2 = new MolefMultimedia2Impl();
		return molefMultimedia2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefMultimedia3 createMolefMultimedia3() {
		MolefMultimedia3Impl molefMultimedia3 = new MolefMultimedia3Impl();
		return molefMultimedia3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefMultimedia4 createMolefMultimedia4() {
		MolefMultimedia4Impl molefMultimedia4 = new MolefMultimedia4Impl();
		return molefMultimedia4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefMultimedia5 createMolefMultimedia5() {
		MolefMultimedia5Impl molefMultimedia5 = new MolefMultimedia5Impl();
		return molefMultimedia5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefMultimedia6 createMolefMultimedia6() {
		MolefMultimedia6Impl molefMultimedia6 = new MolefMultimedia6Impl();
		return molefMultimedia6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolefMultimedia7 createMolefMultimedia7() {
		MolefMultimedia7Impl molefMultimedia7 = new MolefMultimedia7Impl();
		return molefMultimedia7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtypes createSubtypesFromString(EDataType eDataType, String initialValue) {
		Subtypes result = Subtypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubtypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modalities createModalitiesFromString(EDataType eDataType, String initialValue) {
		Modalities result = Modalities.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModalitiesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position createPositionFromString(EDataType eDataType, String initialValue) {
		Position result = Position.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language createLanguageFromString(EDataType eDataType, String initialValue) {
		Language result = Language.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size createSizeFromString(EDataType eDataType, String initialValue) {
		Size result = Size.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSizeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LciatPackage getLciatPackage() {
		return (LciatPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LciatPackage getPackage() {
		return LciatPackage.eINSTANCE;
	}

} //LciatFactoryImpl
