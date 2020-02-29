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
import lciat.Language;
import lciat.LciatFactory;
import lciat.LciatPackage;
import lciat.LearningActivity;
import lciat.LearningDiagram;
import lciat.LearningLink;
import lciat.LearningNode;
import lciat.LeftSideLearningNode;
import lciat.Link;
import lciat.Modalities;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LciatPackageImpl extends EPackageImpl implements LciatPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lcianDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sociogramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sociogramNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sociogramLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass learningDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass learningNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass learningActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leftSideLearningNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detailedAbstractTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assimilativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationHandlingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experientialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faceToFaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computerSupportedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onlineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass learningLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enablingWOInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enablingWInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicalEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webViewerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awarenessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sessionPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnTakingToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telepointerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radarViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cttDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cttTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveEditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborativeVisualizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualVisualizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cttAbstractTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactiveTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cttCollaborativeTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cttLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enablingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disablingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enablingWithInformationPassingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disablingWithInformationPassingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass independentConcurrencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderIndependenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suspendResumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrencyWithInformationPassingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deterministicChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass undeterministicChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefContentNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefLearningNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefCttNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefContent1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefContent2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefContent3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefContent4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefContent5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefContent6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefTaskAndActivitiesNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefTActivities1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefTActivities2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefTActivities3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefTActivities4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefTActivities5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefTActivities6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefTActivities7EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefTActivities8EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefSocialNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefSocial1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefSocial2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefSocial3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefSocial4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefPersonalizationNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefPersonalization1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefPersonalization2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefPersonalization3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefPersonalization4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefPersonalization5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefMultimediaNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefMultimedia1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefMultimedia2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefMultimedia3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefMultimedia4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefMultimedia5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefMultimedia6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molefMultimedia7EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subtypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modalitiesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum positionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum languageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sizeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see lciat.LciatPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LciatPackageImpl() {
		super(eNS_URI, LciatFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LciatPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LciatPackage init() {
		if (isInited) return (LciatPackage)EPackage.Registry.INSTANCE.getEPackage(LciatPackage.eNS_URI);

		// Obtain or create and register package
		LciatPackageImpl theLciatPackage = (LciatPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LciatPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LciatPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theLciatPackage.createPackageContents();

		// Initialize created meta-data
		theLciatPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLciatPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LciatPackage.eNS_URI, theLciatPackage);
		return theLciatPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLCIANDiagram() {
		return lcianDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLCIANDiagram_ItsSociograms() {
		return (EReference)lcianDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLCIANDiagram_ItsLearningDiagrams() {
		return (EReference)lcianDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLCIANDiagram_ItsCttDiagrams() {
		return (EReference)lcianDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLCIANDiagram_ItsLinks() {
		return (EReference)lcianDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSociogram() {
		return sociogramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSociogram_Name() {
		return (EAttribute)sociogramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSociogram_ItsSociogramNodes() {
		return (EReference)sociogramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSociogram_MfContentNodes() {
		return (EReference)sociogramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSociogramNode() {
		return sociogramNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSociogramNode_Name() {
		return (EAttribute)sociogramNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRol() {
		return rolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRol_ItsGroup() {
		return (EReference)rolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRol_Supertype() {
		return (EReference)rolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRol_Subtype() {
		return (EReference)rolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Contains() {
		return (EReference)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSociogramLink() {
		return sociogramLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSociogramLink_Source() {
		return (EReference)sociogramLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSociogramLink_Target() {
		return (EReference)sociogramLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritance() {
		return inheritanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInheritance_Condition() {
		return (EAttribute)inheritanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActing() {
		return actingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActing_Name() {
		return (EAttribute)actingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActing_N() {
		return (EAttribute)actingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActing_M() {
		return (EAttribute)actingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_Name() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_N() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_M() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLearningDiagram() {
		return learningDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLearningDiagram_Name() {
		return (EAttribute)learningDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningDiagram_MolefLearningNodes() {
		return (EReference)learningDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningDiagram_LearningNodes() {
		return (EReference)learningDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningDiagram_MfLearningNodes() {
		return (EReference)learningDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLearningNode() {
		return learningNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInit() {
		return initEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInit_Name() {
		return (EAttribute)initEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnd() {
		return endEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnd_Name() {
		return (EAttribute)endEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLearningActivity() {
		return learningActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLearningActivity_Name() {
		return (EAttribute)learningActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLearningActivity_ItsModality() {
		return (EAttribute)learningActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLearningActivity_ItsSubtype() {
		return (EAttribute)learningActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningActivity_Tools() {
		return (EReference)learningActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeftSideLearningNode() {
		return leftSideLearningNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividualTask() {
		return individualTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualTask_TaskRoles() {
		return (EReference)individualTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualTask_TaskObjects() {
		return (EReference)individualTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualTask_Subtype() {
		return (EReference)individualTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualTask_Modality() {
		return (EReference)individualTaskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupTask() {
		return groupTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupTask_TaskRoles() {
		return (EReference)groupTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupTask_TaskObjects() {
		return (EReference)groupTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupTask_Subtype() {
		return (EReference)groupTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupTask_Modality() {
		return (EReference)groupTaskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupTask_EGL_Tool() {
		return (EReference)groupTaskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupTask_EGL_Transformation() {
		return (EAttribute)groupTaskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTask() {
		return abstractTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTask_TaskRoles() {
		return (EReference)abstractTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTask_TaskObjects() {
		return (EReference)abstractTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTask_Subtype() {
		return (EReference)abstractTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTask_Modality() {
		return (EReference)abstractTaskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetailedAbstractTask() {
		return detailedAbstractTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetailedAbstractTask_LearningNodes() {
		return (EReference)detailedAbstractTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject() {
		return objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObject_Name() {
		return (EAttribute)objectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_Object() {
		return (EReference)objectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObject_Modifier() {
		return (EAttribute)objectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_ModifiedBy() {
		return (EReference)objectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalCondition() {
		return temporalConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalCondition_Name() {
		return (EAttribute)temporalConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotification() {
		return notificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotification_Name() {
		return (EAttribute)notificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Name() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtype() {
		return subtypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssimilative() {
		return assimilativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssimilative_Name() {
		return (EAttribute)assimilativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationHandling() {
		return informationHandlingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformationHandling_Name() {
		return (EAttribute)informationHandlingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptive() {
		return adaptiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdaptive_Name() {
		return (EAttribute)adaptiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicative() {
		return communicativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicative_Name() {
		return (EAttribute)communicativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductive() {
		return productiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductive_Name() {
		return (EAttribute)productiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExperiential() {
		return experientialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperiential_Name() {
		return (EAttribute)experientialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluative() {
		return evaluativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluative_Name() {
		return (EAttribute)evaluativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupport() {
		return supportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupport_Name() {
		return (EAttribute)supportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModality() {
		return modalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModality_Name() {
		return (EAttribute)modalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaceToFace() {
		return faceToFaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaceToFace_Kind() {
		return (EAttribute)faceToFaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputerSupported() {
		return computerSupportedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputerSupported_Kind() {
		return (EAttribute)computerSupportedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnline() {
		return onlineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnline_Kind() {
		return (EAttribute)onlineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLearningLink() {
		return learningLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningLink_Source() {
		return (EReference)learningLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningLink_Target() {
		return (EReference)learningLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnablingWOInformation() {
		return enablingWOInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnablingWOInformation_ELabel() {
		return (EAttribute)enablingWOInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnablingWInformation() {
		return enablingWInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnablingWInformation_EwLabel() {
		return (EAttribute)enablingWInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoice() {
		return choiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChoice_DtLabel() {
		return (EAttribute)choiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcurrency() {
		return concurrencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcurrency_IcLabel() {
		return (EAttribute)concurrencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTool() {
		return toolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTool_Kind() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTool_Chat() {
		return (EReference)toolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTool_SessionPanel() {
		return (EReference)toolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphicalEditor() {
		return graphicalEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalEditor_Name() {
		return (EAttribute)graphicalEditorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphicalEditor_TurnTakingTool() {
		return (EReference)graphicalEditorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphicalEditor_Telepointer() {
		return (EReference)graphicalEditorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphicalEditor_RadarView() {
		return (EReference)graphicalEditorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphicalEditor_Properties() {
		return (EReference)graphicalEditorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphicalEditor_Problems() {
		return (EReference)graphicalEditorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextEditor() {
		return textEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextEditor_Name() {
		return (EAttribute)textEditorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextEditor_TurnTakingTool() {
		return (EReference)textEditorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextEditor_RadarView() {
		return (EReference)textEditorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextEditor_Console() {
		return (EReference)textEditorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextEditor_Problems() {
		return (EReference)textEditorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeEditor() {
		return codeEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeEditor_Name() {
		return (EAttribute)codeEditorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeEditor_TurnTakingTool() {
		return (EReference)codeEditorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeEditor_RadarView() {
		return (EReference)codeEditorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeEditor_Console() {
		return (EReference)codeEditorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeEditor_Problems() {
		return (EReference)codeEditorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebViewer() {
		return webViewerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebViewer_Name() {
		return (EAttribute)webViewerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAwareness() {
		return awarenessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSessionPanel() {
		return sessionPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionPanel_Name() {
		return (EAttribute)sessionPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionPanel_Position() {
		return (EAttribute)sessionPanelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionPanel_Language() {
		return (EAttribute)sessionPanelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionPanel_Size() {
		return (EAttribute)sessionPanelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChat() {
		return chatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChat_Name() {
		return (EAttribute)chatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChat_IsStructured() {
		return (EAttribute)chatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChat_Position() {
		return (EAttribute)chatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChat_Language() {
		return (EAttribute)chatEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChat_Size() {
		return (EAttribute)chatEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnTakingTool() {
		return turnTakingToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnTakingTool_Name() {
		return (EAttribute)turnTakingToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnTakingTool_Position() {
		return (EAttribute)turnTakingToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnTakingTool_Language() {
		return (EAttribute)turnTakingToolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnTakingTool_Size() {
		return (EAttribute)turnTakingToolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTelepointer() {
		return telepointerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelepointer_Name() {
		return (EAttribute)telepointerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRadarView() {
		return radarViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadarView_Name() {
		return (EAttribute)radarViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadarView_Position() {
		return (EAttribute)radarViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperties() {
		return propertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperties_Name() {
		return (EAttribute)propertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperties_Position() {
		return (EAttribute)propertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsole() {
		return consoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsole_Name() {
		return (EAttribute)consoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsole_Position() {
		return (EAttribute)consoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblems() {
		return problemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProblems_Name() {
		return (EAttribute)problemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProblems_Position() {
		return (EAttribute)problemsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraceability() {
		return traceabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceability_Awarelement() {
		return (EReference)traceabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceability_Toolelement() {
		return (EReference)traceabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCTTDiagram() {
		return cttDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCTTDiagram_Name() {
		return (EAttribute)cttDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCTTDiagram_MolefCttNodes() {
		return (EReference)cttDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCTTDiagram_CttTasks() {
		return (EReference)cttDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCTTDiagram_MfCttNodes() {
		return (EReference)cttDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCTTTask() {
		return cttTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCTTTask_Name() {
		return (EAttribute)cttTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCTTTask_CttLinks() {
		return (EReference)cttTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusiveEdition() {
		return exclusiveEditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaborativeVisualization() {
		return collaborativeVisualizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividualVisualization() {
		return individualVisualizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserTask() {
		return userTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCTTAbstractTask() {
		return cttAbstractTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractiveTask() {
		return interactiveTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCTTCollaborativeTask() {
		return cttCollaborativeTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationTask() {
		return applicationTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCTTLink() {
		return cttLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCTTLink_Source() {
		return (EReference)cttLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCTTLink_Target() {
		return (EReference)cttLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregation() {
		return aggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnabling() {
		return enablingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnabling_ELabel() {
		return (EAttribute)enablingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisabling() {
		return disablingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisabling_DLabel() {
		return (EAttribute)disablingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnablingWithInformationPassing() {
		return enablingWithInformationPassingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnablingWithInformationPassing_EwLabel() {
		return (EAttribute)enablingWithInformationPassingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisablingWithInformationPassing() {
		return disablingWithInformationPassingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisablingWithInformationPassing_DwLabel() {
		return (EAttribute)disablingWithInformationPassingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndependentConcurrency() {
		return independentConcurrencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndependentConcurrency_IcLabel() {
		return (EAttribute)independentConcurrencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderIndependence() {
		return orderIndependenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderIndependence_OiLabel() {
		return (EAttribute)orderIndependenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuspendResume() {
		return suspendResumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuspendResume_SrLabel() {
		return (EAttribute)suspendResumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcurrencyWithInformationPassing() {
		return concurrencyWithInformationPassingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcurrencyWithInformationPassing_CLabel() {
		return (EAttribute)concurrencyWithInformationPassingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeterministicChoice() {
		return deterministicChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeterministicChoice_DtLabel() {
		return (EAttribute)deterministicChoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUndeterministicChoice() {
		return undeterministicChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUndeterministicChoice_UcLabel() {
		return (EAttribute)undeterministicChoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefNode() {
		return molefNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefContentNode() {
		return molefContentNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefLearningNode() {
		return molefLearningNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefCttNode() {
		return molefCttNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefContent1() {
		return molefContent1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefContent1_Characteristic() {
		return (EAttribute)molefContent1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefContent2() {
		return molefContent2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefContent2_Characteristic() {
		return (EAttribute)molefContent2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefContent3() {
		return molefContent3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefContent3_Characteristic() {
		return (EAttribute)molefContent3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefContent4() {
		return molefContent4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefContent4_Characteristic() {
		return (EAttribute)molefContent4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefContent5() {
		return molefContent5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefContent5_Characteristic() {
		return (EAttribute)molefContent5EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefContent6() {
		return molefContent6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefContent6_Characteristic() {
		return (EAttribute)molefContent6EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefTaskAndActivitiesNode() {
		return molefTaskAndActivitiesNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefTActivities1() {
		return molefTActivities1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefTActivities1_Characteristic() {
		return (EAttribute)molefTActivities1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefTActivities2() {
		return molefTActivities2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefTActivities2_Characteristic() {
		return (EAttribute)molefTActivities2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefTActivities3() {
		return molefTActivities3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefTActivities3_Characteristic() {
		return (EAttribute)molefTActivities3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefTActivities4() {
		return molefTActivities4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefTActivities4_Characteristic() {
		return (EAttribute)molefTActivities4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefTActivities5() {
		return molefTActivities5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefTActivities5_Characteristic() {
		return (EAttribute)molefTActivities5EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefTActivities6() {
		return molefTActivities6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefTActivities6_Characteristic() {
		return (EAttribute)molefTActivities6EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefTActivities7() {
		return molefTActivities7EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefTActivities7_Characteristic() {
		return (EAttribute)molefTActivities7EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefTActivities8() {
		return molefTActivities8EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefTActivities8_Characteristic() {
		return (EAttribute)molefTActivities8EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefSocialNode() {
		return molefSocialNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefSocial1() {
		return molefSocial1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefSocial1_Characteristic() {
		return (EAttribute)molefSocial1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefSocial2() {
		return molefSocial2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefSocial2_Characteristic() {
		return (EAttribute)molefSocial2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefSocial3() {
		return molefSocial3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefSocial3_Characteristic() {
		return (EAttribute)molefSocial3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefSocial4() {
		return molefSocial4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefSocial4_Characteristic() {
		return (EAttribute)molefSocial4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefPersonalizationNode() {
		return molefPersonalizationNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefPersonalization1() {
		return molefPersonalization1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefPersonalization1_Characteristic() {
		return (EAttribute)molefPersonalization1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefPersonalization2() {
		return molefPersonalization2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefPersonalization2_Characteristic() {
		return (EAttribute)molefPersonalization2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefPersonalization3() {
		return molefPersonalization3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefPersonalization3_Characteristic() {
		return (EAttribute)molefPersonalization3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefPersonalization4() {
		return molefPersonalization4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefPersonalization4_Characteristic() {
		return (EAttribute)molefPersonalization4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefPersonalization5() {
		return molefPersonalization5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefPersonalization5_Characteristic() {
		return (EAttribute)molefPersonalization5EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefMultimediaNode() {
		return molefMultimediaNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefMultimedia1() {
		return molefMultimedia1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefMultimedia1_Characteristic() {
		return (EAttribute)molefMultimedia1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefMultimedia2() {
		return molefMultimedia2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefMultimedia2_Characteristic() {
		return (EAttribute)molefMultimedia2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefMultimedia3() {
		return molefMultimedia3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefMultimedia3_Characteristic() {
		return (EAttribute)molefMultimedia3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefMultimedia4() {
		return molefMultimedia4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefMultimedia4_Characteristic() {
		return (EAttribute)molefMultimedia4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefMultimedia5() {
		return molefMultimedia5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefMultimedia5_Characteristic() {
		return (EAttribute)molefMultimedia5EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefMultimedia6() {
		return molefMultimedia6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefMultimedia6_Characteristic() {
		return (EAttribute)molefMultimedia6EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolefMultimedia7() {
		return molefMultimedia7EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolefMultimedia7_Characteristic() {
		return (EAttribute)molefMultimedia7EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubtypes() {
		return subtypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModalities() {
		return modalitiesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPosition() {
		return positionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLanguage() {
		return languageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSize() {
		return sizeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LciatFactory getLciatFactory() {
		return (LciatFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		lcianDiagramEClass = createEClass(LCIAN_DIAGRAM);
		createEReference(lcianDiagramEClass, LCIAN_DIAGRAM__ITS_SOCIOGRAMS);
		createEReference(lcianDiagramEClass, LCIAN_DIAGRAM__ITS_LEARNING_DIAGRAMS);
		createEReference(lcianDiagramEClass, LCIAN_DIAGRAM__ITS_CTT_DIAGRAMS);
		createEReference(lcianDiagramEClass, LCIAN_DIAGRAM__ITS_LINKS);

		linkEClass = createEClass(LINK);

		sociogramEClass = createEClass(SOCIOGRAM);
		createEAttribute(sociogramEClass, SOCIOGRAM__NAME);
		createEReference(sociogramEClass, SOCIOGRAM__ITS_SOCIOGRAM_NODES);
		createEReference(sociogramEClass, SOCIOGRAM__MF_CONTENT_NODES);

		sociogramNodeEClass = createEClass(SOCIOGRAM_NODE);
		createEAttribute(sociogramNodeEClass, SOCIOGRAM_NODE__NAME);

		rolEClass = createEClass(ROL);
		createEReference(rolEClass, ROL__ITS_GROUP);
		createEReference(rolEClass, ROL__SUPERTYPE);
		createEReference(rolEClass, ROL__SUBTYPE);

		groupEClass = createEClass(GROUP);
		createEReference(groupEClass, GROUP__CONTAINS);

		sociogramLinkEClass = createEClass(SOCIOGRAM_LINK);
		createEReference(sociogramLinkEClass, SOCIOGRAM_LINK__SOURCE);
		createEReference(sociogramLinkEClass, SOCIOGRAM_LINK__TARGET);

		inheritanceEClass = createEClass(INHERITANCE);
		createEAttribute(inheritanceEClass, INHERITANCE__CONDITION);

		actingEClass = createEClass(ACTING);
		createEAttribute(actingEClass, ACTING__NAME);
		createEAttribute(actingEClass, ACTING__N);
		createEAttribute(actingEClass, ACTING__M);

		associationEClass = createEClass(ASSOCIATION);
		createEAttribute(associationEClass, ASSOCIATION__NAME);
		createEAttribute(associationEClass, ASSOCIATION__N);
		createEAttribute(associationEClass, ASSOCIATION__M);

		learningDiagramEClass = createEClass(LEARNING_DIAGRAM);
		createEAttribute(learningDiagramEClass, LEARNING_DIAGRAM__NAME);
		createEReference(learningDiagramEClass, LEARNING_DIAGRAM__MOLEF_LEARNING_NODES);
		createEReference(learningDiagramEClass, LEARNING_DIAGRAM__LEARNING_NODES);
		createEReference(learningDiagramEClass, LEARNING_DIAGRAM__MF_LEARNING_NODES);

		learningNodeEClass = createEClass(LEARNING_NODE);

		initEClass = createEClass(INIT);
		createEAttribute(initEClass, INIT__NAME);

		endEClass = createEClass(END);
		createEAttribute(endEClass, END__NAME);

		learningActivityEClass = createEClass(LEARNING_ACTIVITY);
		createEAttribute(learningActivityEClass, LEARNING_ACTIVITY__NAME);
		createEAttribute(learningActivityEClass, LEARNING_ACTIVITY__ITS_MODALITY);
		createEAttribute(learningActivityEClass, LEARNING_ACTIVITY__ITS_SUBTYPE);
		createEReference(learningActivityEClass, LEARNING_ACTIVITY__TOOLS);

		leftSideLearningNodeEClass = createEClass(LEFT_SIDE_LEARNING_NODE);

		individualTaskEClass = createEClass(INDIVIDUAL_TASK);
		createEReference(individualTaskEClass, INDIVIDUAL_TASK__TASK_ROLES);
		createEReference(individualTaskEClass, INDIVIDUAL_TASK__TASK_OBJECTS);
		createEReference(individualTaskEClass, INDIVIDUAL_TASK__SUBTYPE);
		createEReference(individualTaskEClass, INDIVIDUAL_TASK__MODALITY);

		groupTaskEClass = createEClass(GROUP_TASK);
		createEReference(groupTaskEClass, GROUP_TASK__TASK_ROLES);
		createEReference(groupTaskEClass, GROUP_TASK__TASK_OBJECTS);
		createEReference(groupTaskEClass, GROUP_TASK__SUBTYPE);
		createEReference(groupTaskEClass, GROUP_TASK__MODALITY);
		createEReference(groupTaskEClass, GROUP_TASK__EGL_TOOL);
		createEAttribute(groupTaskEClass, GROUP_TASK__EGL_TRANSFORMATION);

		abstractTaskEClass = createEClass(ABSTRACT_TASK);
		createEReference(abstractTaskEClass, ABSTRACT_TASK__TASK_ROLES);
		createEReference(abstractTaskEClass, ABSTRACT_TASK__TASK_OBJECTS);
		createEReference(abstractTaskEClass, ABSTRACT_TASK__SUBTYPE);
		createEReference(abstractTaskEClass, ABSTRACT_TASK__MODALITY);

		detailedAbstractTaskEClass = createEClass(DETAILED_ABSTRACT_TASK);
		createEReference(detailedAbstractTaskEClass, DETAILED_ABSTRACT_TASK__LEARNING_NODES);

		objectEClass = createEClass(OBJECT);
		createEAttribute(objectEClass, OBJECT__NAME);
		createEReference(objectEClass, OBJECT__OBJECT);
		createEAttribute(objectEClass, OBJECT__MODIFIER);
		createEReference(objectEClass, OBJECT__MODIFIED_BY);

		temporalConditionEClass = createEClass(TEMPORAL_CONDITION);
		createEAttribute(temporalConditionEClass, TEMPORAL_CONDITION__NAME);

		notificationEClass = createEClass(NOTIFICATION);
		createEAttribute(notificationEClass, NOTIFICATION__NAME);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__NAME);

		subtypeEClass = createEClass(SUBTYPE);

		assimilativeEClass = createEClass(ASSIMILATIVE);
		createEAttribute(assimilativeEClass, ASSIMILATIVE__NAME);

		informationHandlingEClass = createEClass(INFORMATION_HANDLING);
		createEAttribute(informationHandlingEClass, INFORMATION_HANDLING__NAME);

		adaptiveEClass = createEClass(ADAPTIVE);
		createEAttribute(adaptiveEClass, ADAPTIVE__NAME);

		communicativeEClass = createEClass(COMMUNICATIVE);
		createEAttribute(communicativeEClass, COMMUNICATIVE__NAME);

		productiveEClass = createEClass(PRODUCTIVE);
		createEAttribute(productiveEClass, PRODUCTIVE__NAME);

		experientialEClass = createEClass(EXPERIENTIAL);
		createEAttribute(experientialEClass, EXPERIENTIAL__NAME);

		evaluativeEClass = createEClass(EVALUATIVE);
		createEAttribute(evaluativeEClass, EVALUATIVE__NAME);

		supportEClass = createEClass(SUPPORT);
		createEAttribute(supportEClass, SUPPORT__NAME);

		modalityEClass = createEClass(MODALITY);
		createEAttribute(modalityEClass, MODALITY__NAME);

		faceToFaceEClass = createEClass(FACE_TO_FACE);
		createEAttribute(faceToFaceEClass, FACE_TO_FACE__KIND);

		computerSupportedEClass = createEClass(COMPUTER_SUPPORTED);
		createEAttribute(computerSupportedEClass, COMPUTER_SUPPORTED__KIND);

		onlineEClass = createEClass(ONLINE);
		createEAttribute(onlineEClass, ONLINE__KIND);

		learningLinkEClass = createEClass(LEARNING_LINK);
		createEReference(learningLinkEClass, LEARNING_LINK__SOURCE);
		createEReference(learningLinkEClass, LEARNING_LINK__TARGET);

		enablingWOInformationEClass = createEClass(ENABLING_WO_INFORMATION);
		createEAttribute(enablingWOInformationEClass, ENABLING_WO_INFORMATION__ELABEL);

		enablingWInformationEClass = createEClass(ENABLING_WINFORMATION);
		createEAttribute(enablingWInformationEClass, ENABLING_WINFORMATION__EW_LABEL);

		choiceEClass = createEClass(CHOICE);
		createEAttribute(choiceEClass, CHOICE__DT_LABEL);

		concurrencyEClass = createEClass(CONCURRENCY);
		createEAttribute(concurrencyEClass, CONCURRENCY__IC_LABEL);

		toolEClass = createEClass(TOOL);
		createEAttribute(toolEClass, TOOL__KIND);
		createEReference(toolEClass, TOOL__CHAT);
		createEReference(toolEClass, TOOL__SESSION_PANEL);

		graphicalEditorEClass = createEClass(GRAPHICAL_EDITOR);
		createEAttribute(graphicalEditorEClass, GRAPHICAL_EDITOR__NAME);
		createEReference(graphicalEditorEClass, GRAPHICAL_EDITOR__TURN_TAKING_TOOL);
		createEReference(graphicalEditorEClass, GRAPHICAL_EDITOR__TELEPOINTER);
		createEReference(graphicalEditorEClass, GRAPHICAL_EDITOR__RADAR_VIEW);
		createEReference(graphicalEditorEClass, GRAPHICAL_EDITOR__PROPERTIES);
		createEReference(graphicalEditorEClass, GRAPHICAL_EDITOR__PROBLEMS);

		textEditorEClass = createEClass(TEXT_EDITOR);
		createEAttribute(textEditorEClass, TEXT_EDITOR__NAME);
		createEReference(textEditorEClass, TEXT_EDITOR__TURN_TAKING_TOOL);
		createEReference(textEditorEClass, TEXT_EDITOR__RADAR_VIEW);
		createEReference(textEditorEClass, TEXT_EDITOR__CONSOLE);
		createEReference(textEditorEClass, TEXT_EDITOR__PROBLEMS);

		codeEditorEClass = createEClass(CODE_EDITOR);
		createEAttribute(codeEditorEClass, CODE_EDITOR__NAME);
		createEReference(codeEditorEClass, CODE_EDITOR__TURN_TAKING_TOOL);
		createEReference(codeEditorEClass, CODE_EDITOR__RADAR_VIEW);
		createEReference(codeEditorEClass, CODE_EDITOR__CONSOLE);
		createEReference(codeEditorEClass, CODE_EDITOR__PROBLEMS);

		webViewerEClass = createEClass(WEB_VIEWER);
		createEAttribute(webViewerEClass, WEB_VIEWER__NAME);

		awarenessEClass = createEClass(AWARENESS);

		sessionPanelEClass = createEClass(SESSION_PANEL);
		createEAttribute(sessionPanelEClass, SESSION_PANEL__NAME);
		createEAttribute(sessionPanelEClass, SESSION_PANEL__POSITION);
		createEAttribute(sessionPanelEClass, SESSION_PANEL__LANGUAGE);
		createEAttribute(sessionPanelEClass, SESSION_PANEL__SIZE);

		chatEClass = createEClass(CHAT);
		createEAttribute(chatEClass, CHAT__NAME);
		createEAttribute(chatEClass, CHAT__IS_STRUCTURED);
		createEAttribute(chatEClass, CHAT__POSITION);
		createEAttribute(chatEClass, CHAT__LANGUAGE);
		createEAttribute(chatEClass, CHAT__SIZE);

		turnTakingToolEClass = createEClass(TURN_TAKING_TOOL);
		createEAttribute(turnTakingToolEClass, TURN_TAKING_TOOL__NAME);
		createEAttribute(turnTakingToolEClass, TURN_TAKING_TOOL__POSITION);
		createEAttribute(turnTakingToolEClass, TURN_TAKING_TOOL__LANGUAGE);
		createEAttribute(turnTakingToolEClass, TURN_TAKING_TOOL__SIZE);

		telepointerEClass = createEClass(TELEPOINTER);
		createEAttribute(telepointerEClass, TELEPOINTER__NAME);

		radarViewEClass = createEClass(RADAR_VIEW);
		createEAttribute(radarViewEClass, RADAR_VIEW__NAME);
		createEAttribute(radarViewEClass, RADAR_VIEW__POSITION);

		propertiesEClass = createEClass(PROPERTIES);
		createEAttribute(propertiesEClass, PROPERTIES__NAME);
		createEAttribute(propertiesEClass, PROPERTIES__POSITION);

		consoleEClass = createEClass(CONSOLE);
		createEAttribute(consoleEClass, CONSOLE__NAME);
		createEAttribute(consoleEClass, CONSOLE__POSITION);

		problemsEClass = createEClass(PROBLEMS);
		createEAttribute(problemsEClass, PROBLEMS__NAME);
		createEAttribute(problemsEClass, PROBLEMS__POSITION);

		traceabilityEClass = createEClass(TRACEABILITY);
		createEReference(traceabilityEClass, TRACEABILITY__AWARELEMENT);
		createEReference(traceabilityEClass, TRACEABILITY__TOOLELEMENT);

		cttDiagramEClass = createEClass(CTT_DIAGRAM);
		createEAttribute(cttDiagramEClass, CTT_DIAGRAM__NAME);
		createEReference(cttDiagramEClass, CTT_DIAGRAM__MOLEF_CTT_NODES);
		createEReference(cttDiagramEClass, CTT_DIAGRAM__CTT_TASKS);
		createEReference(cttDiagramEClass, CTT_DIAGRAM__MF_CTT_NODES);

		cttTaskEClass = createEClass(CTT_TASK);
		createEAttribute(cttTaskEClass, CTT_TASK__NAME);
		createEReference(cttTaskEClass, CTT_TASK__CTT_LINKS);

		exclusiveEditionEClass = createEClass(EXCLUSIVE_EDITION);

		collaborativeVisualizationEClass = createEClass(COLLABORATIVE_VISUALIZATION);

		individualVisualizationEClass = createEClass(INDIVIDUAL_VISUALIZATION);

		userTaskEClass = createEClass(USER_TASK);

		cttAbstractTaskEClass = createEClass(CTT_ABSTRACT_TASK);

		interactiveTaskEClass = createEClass(INTERACTIVE_TASK);

		cttCollaborativeTaskEClass = createEClass(CTT_COLLABORATIVE_TASK);

		applicationTaskEClass = createEClass(APPLICATION_TASK);

		cttLinkEClass = createEClass(CTT_LINK);
		createEReference(cttLinkEClass, CTT_LINK__SOURCE);
		createEReference(cttLinkEClass, CTT_LINK__TARGET);

		aggregationEClass = createEClass(AGGREGATION);

		enablingEClass = createEClass(ENABLING);
		createEAttribute(enablingEClass, ENABLING__ELABEL);

		disablingEClass = createEClass(DISABLING);
		createEAttribute(disablingEClass, DISABLING__DLABEL);

		enablingWithInformationPassingEClass = createEClass(ENABLING_WITH_INFORMATION_PASSING);
		createEAttribute(enablingWithInformationPassingEClass, ENABLING_WITH_INFORMATION_PASSING__EW_LABEL);

		disablingWithInformationPassingEClass = createEClass(DISABLING_WITH_INFORMATION_PASSING);
		createEAttribute(disablingWithInformationPassingEClass, DISABLING_WITH_INFORMATION_PASSING__DW_LABEL);

		independentConcurrencyEClass = createEClass(INDEPENDENT_CONCURRENCY);
		createEAttribute(independentConcurrencyEClass, INDEPENDENT_CONCURRENCY__IC_LABEL);

		orderIndependenceEClass = createEClass(ORDER_INDEPENDENCE);
		createEAttribute(orderIndependenceEClass, ORDER_INDEPENDENCE__OI_LABEL);

		suspendResumeEClass = createEClass(SUSPEND_RESUME);
		createEAttribute(suspendResumeEClass, SUSPEND_RESUME__SR_LABEL);

		concurrencyWithInformationPassingEClass = createEClass(CONCURRENCY_WITH_INFORMATION_PASSING);
		createEAttribute(concurrencyWithInformationPassingEClass, CONCURRENCY_WITH_INFORMATION_PASSING__CLABEL);

		deterministicChoiceEClass = createEClass(DETERMINISTIC_CHOICE);
		createEAttribute(deterministicChoiceEClass, DETERMINISTIC_CHOICE__DT_LABEL);

		undeterministicChoiceEClass = createEClass(UNDETERMINISTIC_CHOICE);
		createEAttribute(undeterministicChoiceEClass, UNDETERMINISTIC_CHOICE__UC_LABEL);

		molefNodeEClass = createEClass(MOLEF_NODE);

		molefContentNodeEClass = createEClass(MOLEF_CONTENT_NODE);

		molefLearningNodeEClass = createEClass(MOLEF_LEARNING_NODE);

		molefCttNodeEClass = createEClass(MOLEF_CTT_NODE);

		molefContent1EClass = createEClass(MOLEF_CONTENT1);
		createEAttribute(molefContent1EClass, MOLEF_CONTENT1__CHARACTERISTIC);

		molefContent2EClass = createEClass(MOLEF_CONTENT2);
		createEAttribute(molefContent2EClass, MOLEF_CONTENT2__CHARACTERISTIC);

		molefContent3EClass = createEClass(MOLEF_CONTENT3);
		createEAttribute(molefContent3EClass, MOLEF_CONTENT3__CHARACTERISTIC);

		molefContent4EClass = createEClass(MOLEF_CONTENT4);
		createEAttribute(molefContent4EClass, MOLEF_CONTENT4__CHARACTERISTIC);

		molefContent5EClass = createEClass(MOLEF_CONTENT5);
		createEAttribute(molefContent5EClass, MOLEF_CONTENT5__CHARACTERISTIC);

		molefContent6EClass = createEClass(MOLEF_CONTENT6);
		createEAttribute(molefContent6EClass, MOLEF_CONTENT6__CHARACTERISTIC);

		molefTaskAndActivitiesNodeEClass = createEClass(MOLEF_TASK_AND_ACTIVITIES_NODE);

		molefTActivities1EClass = createEClass(MOLEF_TACTIVITIES1);
		createEAttribute(molefTActivities1EClass, MOLEF_TACTIVITIES1__CHARACTERISTIC);

		molefTActivities2EClass = createEClass(MOLEF_TACTIVITIES2);
		createEAttribute(molefTActivities2EClass, MOLEF_TACTIVITIES2__CHARACTERISTIC);

		molefTActivities3EClass = createEClass(MOLEF_TACTIVITIES3);
		createEAttribute(molefTActivities3EClass, MOLEF_TACTIVITIES3__CHARACTERISTIC);

		molefTActivities4EClass = createEClass(MOLEF_TACTIVITIES4);
		createEAttribute(molefTActivities4EClass, MOLEF_TACTIVITIES4__CHARACTERISTIC);

		molefTActivities5EClass = createEClass(MOLEF_TACTIVITIES5);
		createEAttribute(molefTActivities5EClass, MOLEF_TACTIVITIES5__CHARACTERISTIC);

		molefTActivities6EClass = createEClass(MOLEF_TACTIVITIES6);
		createEAttribute(molefTActivities6EClass, MOLEF_TACTIVITIES6__CHARACTERISTIC);

		molefTActivities7EClass = createEClass(MOLEF_TACTIVITIES7);
		createEAttribute(molefTActivities7EClass, MOLEF_TACTIVITIES7__CHARACTERISTIC);

		molefTActivities8EClass = createEClass(MOLEF_TACTIVITIES8);
		createEAttribute(molefTActivities8EClass, MOLEF_TACTIVITIES8__CHARACTERISTIC);

		molefSocialNodeEClass = createEClass(MOLEF_SOCIAL_NODE);

		molefSocial1EClass = createEClass(MOLEF_SOCIAL1);
		createEAttribute(molefSocial1EClass, MOLEF_SOCIAL1__CHARACTERISTIC);

		molefSocial2EClass = createEClass(MOLEF_SOCIAL2);
		createEAttribute(molefSocial2EClass, MOLEF_SOCIAL2__CHARACTERISTIC);

		molefSocial3EClass = createEClass(MOLEF_SOCIAL3);
		createEAttribute(molefSocial3EClass, MOLEF_SOCIAL3__CHARACTERISTIC);

		molefSocial4EClass = createEClass(MOLEF_SOCIAL4);
		createEAttribute(molefSocial4EClass, MOLEF_SOCIAL4__CHARACTERISTIC);

		molefPersonalizationNodeEClass = createEClass(MOLEF_PERSONALIZATION_NODE);

		molefPersonalization1EClass = createEClass(MOLEF_PERSONALIZATION1);
		createEAttribute(molefPersonalization1EClass, MOLEF_PERSONALIZATION1__CHARACTERISTIC);

		molefPersonalization2EClass = createEClass(MOLEF_PERSONALIZATION2);
		createEAttribute(molefPersonalization2EClass, MOLEF_PERSONALIZATION2__CHARACTERISTIC);

		molefPersonalization3EClass = createEClass(MOLEF_PERSONALIZATION3);
		createEAttribute(molefPersonalization3EClass, MOLEF_PERSONALIZATION3__CHARACTERISTIC);

		molefPersonalization4EClass = createEClass(MOLEF_PERSONALIZATION4);
		createEAttribute(molefPersonalization4EClass, MOLEF_PERSONALIZATION4__CHARACTERISTIC);

		molefPersonalization5EClass = createEClass(MOLEF_PERSONALIZATION5);
		createEAttribute(molefPersonalization5EClass, MOLEF_PERSONALIZATION5__CHARACTERISTIC);

		molefMultimediaNodeEClass = createEClass(MOLEF_MULTIMEDIA_NODE);

		molefMultimedia1EClass = createEClass(MOLEF_MULTIMEDIA1);
		createEAttribute(molefMultimedia1EClass, MOLEF_MULTIMEDIA1__CHARACTERISTIC);

		molefMultimedia2EClass = createEClass(MOLEF_MULTIMEDIA2);
		createEAttribute(molefMultimedia2EClass, MOLEF_MULTIMEDIA2__CHARACTERISTIC);

		molefMultimedia3EClass = createEClass(MOLEF_MULTIMEDIA3);
		createEAttribute(molefMultimedia3EClass, MOLEF_MULTIMEDIA3__CHARACTERISTIC);

		molefMultimedia4EClass = createEClass(MOLEF_MULTIMEDIA4);
		createEAttribute(molefMultimedia4EClass, MOLEF_MULTIMEDIA4__CHARACTERISTIC);

		molefMultimedia5EClass = createEClass(MOLEF_MULTIMEDIA5);
		createEAttribute(molefMultimedia5EClass, MOLEF_MULTIMEDIA5__CHARACTERISTIC);

		molefMultimedia6EClass = createEClass(MOLEF_MULTIMEDIA6);
		createEAttribute(molefMultimedia6EClass, MOLEF_MULTIMEDIA6__CHARACTERISTIC);

		molefMultimedia7EClass = createEClass(MOLEF_MULTIMEDIA7);
		createEAttribute(molefMultimedia7EClass, MOLEF_MULTIMEDIA7__CHARACTERISTIC);

		// Create enums
		subtypesEEnum = createEEnum(SUBTYPES);
		modalitiesEEnum = createEEnum(MODALITIES);
		positionEEnum = createEEnum(POSITION);
		languageEEnum = createEEnum(LANGUAGE);
		sizeEEnum = createEEnum(SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rolEClass.getESuperTypes().add(this.getSociogramNode());
		rolEClass.getESuperTypes().add(this.getLeftSideLearningNode());
		groupEClass.getESuperTypes().add(this.getSociogramNode());
		groupEClass.getESuperTypes().add(this.getLeftSideLearningNode());
		sociogramLinkEClass.getESuperTypes().add(this.getLink());
		inheritanceEClass.getESuperTypes().add(this.getSociogramLink());
		actingEClass.getESuperTypes().add(this.getSociogramLink());
		associationEClass.getESuperTypes().add(this.getSociogramLink());
		initEClass.getESuperTypes().add(this.getLearningNode());
		endEClass.getESuperTypes().add(this.getLearningNode());
		learningActivityEClass.getESuperTypes().add(this.getLearningNode());
		individualTaskEClass.getESuperTypes().add(this.getLearningActivity());
		groupTaskEClass.getESuperTypes().add(this.getLearningActivity());
		abstractTaskEClass.getESuperTypes().add(this.getLearningActivity());
		detailedAbstractTaskEClass.getESuperTypes().add(this.getLearningActivity());
		temporalConditionEClass.getESuperTypes().add(this.getLearningNode());
		notificationEClass.getESuperTypes().add(this.getLearningNode());
		conditionEClass.getESuperTypes().add(this.getLearningNode());
		assimilativeEClass.getESuperTypes().add(this.getSubtype());
		informationHandlingEClass.getESuperTypes().add(this.getSubtype());
		adaptiveEClass.getESuperTypes().add(this.getSubtype());
		communicativeEClass.getESuperTypes().add(this.getSubtype());
		productiveEClass.getESuperTypes().add(this.getSubtype());
		experientialEClass.getESuperTypes().add(this.getSubtype());
		evaluativeEClass.getESuperTypes().add(this.getSubtype());
		supportEClass.getESuperTypes().add(this.getSubtype());
		faceToFaceEClass.getESuperTypes().add(this.getModality());
		computerSupportedEClass.getESuperTypes().add(this.getModality());
		onlineEClass.getESuperTypes().add(this.getModality());
		learningLinkEClass.getESuperTypes().add(this.getLink());
		enablingWOInformationEClass.getESuperTypes().add(this.getLearningLink());
		enablingWInformationEClass.getESuperTypes().add(this.getLearningLink());
		choiceEClass.getESuperTypes().add(this.getLearningLink());
		concurrencyEClass.getESuperTypes().add(this.getLearningLink());
		graphicalEditorEClass.getESuperTypes().add(this.getTool());
		textEditorEClass.getESuperTypes().add(this.getTool());
		codeEditorEClass.getESuperTypes().add(this.getTool());
		webViewerEClass.getESuperTypes().add(this.getTool());
		awarenessEClass.getESuperTypes().add(this.getLearningNode());
		sessionPanelEClass.getESuperTypes().add(this.getAwareness());
		chatEClass.getESuperTypes().add(this.getAwareness());
		turnTakingToolEClass.getESuperTypes().add(this.getAwareness());
		telepointerEClass.getESuperTypes().add(this.getAwareness());
		radarViewEClass.getESuperTypes().add(this.getAwareness());
		propertiesEClass.getESuperTypes().add(this.getAwareness());
		consoleEClass.getESuperTypes().add(this.getAwareness());
		problemsEClass.getESuperTypes().add(this.getAwareness());
		traceabilityEClass.getESuperTypes().add(this.getLink());
		exclusiveEditionEClass.getESuperTypes().add(this.getCTTTask());
		collaborativeVisualizationEClass.getESuperTypes().add(this.getCTTTask());
		individualVisualizationEClass.getESuperTypes().add(this.getCTTTask());
		userTaskEClass.getESuperTypes().add(this.getCTTTask());
		cttAbstractTaskEClass.getESuperTypes().add(this.getCTTTask());
		interactiveTaskEClass.getESuperTypes().add(this.getCTTTask());
		cttCollaborativeTaskEClass.getESuperTypes().add(this.getCTTTask());
		applicationTaskEClass.getESuperTypes().add(this.getCTTTask());
		cttLinkEClass.getESuperTypes().add(this.getLink());
		aggregationEClass.getESuperTypes().add(this.getCTTLink());
		enablingEClass.getESuperTypes().add(this.getCTTLink());
		disablingEClass.getESuperTypes().add(this.getCTTLink());
		enablingWithInformationPassingEClass.getESuperTypes().add(this.getCTTLink());
		disablingWithInformationPassingEClass.getESuperTypes().add(this.getCTTLink());
		independentConcurrencyEClass.getESuperTypes().add(this.getCTTLink());
		orderIndependenceEClass.getESuperTypes().add(this.getCTTLink());
		suspendResumeEClass.getESuperTypes().add(this.getCTTLink());
		concurrencyWithInformationPassingEClass.getESuperTypes().add(this.getCTTLink());
		deterministicChoiceEClass.getESuperTypes().add(this.getCTTLink());
		undeterministicChoiceEClass.getESuperTypes().add(this.getCTTLink());
		molefContentNodeEClass.getESuperTypes().add(this.getMolefNode());
		molefLearningNodeEClass.getESuperTypes().add(this.getMolefNode());
		molefCttNodeEClass.getESuperTypes().add(this.getMolefNode());
		molefContent1EClass.getESuperTypes().add(this.getMolefContentNode());
		molefContent2EClass.getESuperTypes().add(this.getMolefContentNode());
		molefContent3EClass.getESuperTypes().add(this.getMolefContentNode());
		molefContent4EClass.getESuperTypes().add(this.getMolefContentNode());
		molefContent5EClass.getESuperTypes().add(this.getMolefContentNode());
		molefContent6EClass.getESuperTypes().add(this.getMolefContentNode());
		molefTaskAndActivitiesNodeEClass.getESuperTypes().add(this.getMolefLearningNode());
		molefTActivities1EClass.getESuperTypes().add(this.getMolefTaskAndActivitiesNode());
		molefTActivities2EClass.getESuperTypes().add(this.getMolefTaskAndActivitiesNode());
		molefTActivities3EClass.getESuperTypes().add(this.getMolefTaskAndActivitiesNode());
		molefTActivities4EClass.getESuperTypes().add(this.getMolefTaskAndActivitiesNode());
		molefTActivities5EClass.getESuperTypes().add(this.getMolefTaskAndActivitiesNode());
		molefTActivities6EClass.getESuperTypes().add(this.getMolefTaskAndActivitiesNode());
		molefTActivities7EClass.getESuperTypes().add(this.getMolefTaskAndActivitiesNode());
		molefTActivities8EClass.getESuperTypes().add(this.getMolefTaskAndActivitiesNode());
		molefSocialNodeEClass.getESuperTypes().add(this.getMolefLearningNode());
		molefSocial1EClass.getESuperTypes().add(this.getMolefSocialNode());
		molefSocial2EClass.getESuperTypes().add(this.getMolefSocialNode());
		molefSocial3EClass.getESuperTypes().add(this.getMolefSocialNode());
		molefSocial4EClass.getESuperTypes().add(this.getMolefSocialNode());
		molefPersonalizationNodeEClass.getESuperTypes().add(this.getMolefLearningNode());
		molefPersonalization1EClass.getESuperTypes().add(this.getMolefPersonalizationNode());
		molefPersonalization2EClass.getESuperTypes().add(this.getMolefPersonalizationNode());
		molefPersonalization3EClass.getESuperTypes().add(this.getMolefPersonalizationNode());
		molefPersonalization4EClass.getESuperTypes().add(this.getMolefPersonalizationNode());
		molefPersonalization5EClass.getESuperTypes().add(this.getMolefPersonalizationNode());
		molefMultimediaNodeEClass.getESuperTypes().add(this.getMolefCttNode());
		molefMultimedia1EClass.getESuperTypes().add(this.getMolefMultimediaNode());
		molefMultimedia2EClass.getESuperTypes().add(this.getMolefMultimediaNode());
		molefMultimedia3EClass.getESuperTypes().add(this.getMolefMultimediaNode());
		molefMultimedia4EClass.getESuperTypes().add(this.getMolefMultimediaNode());
		molefMultimedia5EClass.getESuperTypes().add(this.getMolefMultimediaNode());
		molefMultimedia6EClass.getESuperTypes().add(this.getMolefMultimediaNode());
		molefMultimedia7EClass.getESuperTypes().add(this.getMolefMultimediaNode());

		// Initialize classes and features; add operations and parameters
		initEClass(lcianDiagramEClass, LCIANDiagram.class, "LCIANDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLCIANDiagram_ItsSociograms(), this.getSociogram(), null, "itsSociograms", null, 0, -1, LCIANDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLCIANDiagram_ItsLearningDiagrams(), this.getLearningDiagram(), null, "itsLearningDiagrams", null, 0, -1, LCIANDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLCIANDiagram_ItsCttDiagrams(), this.getCTTDiagram(), null, "itsCttDiagrams", null, 0, -1, LCIANDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLCIANDiagram_ItsLinks(), this.getLink(), null, "itsLinks", null, 0, -1, LCIANDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sociogramEClass, Sociogram.class, "Sociogram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSociogram_Name(), ecorePackage.getEString(), "name", "Sociogram :: ", 0, 1, Sociogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSociogram_ItsSociogramNodes(), this.getSociogramNode(), null, "itsSociogramNodes", null, 0, -1, Sociogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSociogram_MfContentNodes(), this.getMolefContentNode(), null, "mfContentNodes", null, 0, -1, Sociogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sociogramNodeEClass, SociogramNode.class, "SociogramNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSociogramNode_Name(), ecorePackage.getEString(), "name", "<...>", 0, 1, SociogramNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rolEClass, Rol.class, "Rol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRol_ItsGroup(), this.getGroup(), null, "itsGroup", null, 0, -1, Rol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRol_Supertype(), this.getRol(), null, "supertype", null, 0, -1, Rol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRol_Subtype(), this.getRol(), null, "subtype", null, 0, -1, Rol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroup_Contains(), this.getRol(), null, "contains", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sociogramLinkEClass, SociogramLink.class, "SociogramLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSociogramLink_Source(), this.getSociogramNode(), null, "source", null, 1, 1, SociogramLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSociogramLink_Target(), this.getSociogramNode(), null, "target", null, 1, 1, SociogramLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inheritanceEClass, Inheritance.class, "Inheritance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInheritance_Condition(), ecorePackage.getEString(), "condition", " ", 0, 1, Inheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actingEClass, Acting.class, "Acting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActing_Name(), ecorePackage.getEString(), "name", "(n..m)", 0, 1, Acting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActing_N(), ecorePackage.getEInt(), "n", null, 0, 1, Acting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActing_M(), ecorePackage.getEInt(), "m", null, 0, 1, Acting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociation_Name(), ecorePackage.getEString(), "name", "(n..m)", 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_N(), ecorePackage.getEInt(), "n", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_M(), ecorePackage.getEInt(), "m", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(learningDiagramEClass, LearningDiagram.class, "LearningDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLearningDiagram_Name(), ecorePackage.getEString(), "name", "Learning-Design :: ", 0, 1, LearningDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearningDiagram_MolefLearningNodes(), this.getMolefLearningNode(), null, "molefLearningNodes", null, 0, -1, LearningDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearningDiagram_LearningNodes(), this.getLearningNode(), null, "learningNodes", null, 0, -1, LearningDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearningDiagram_MfLearningNodes(), this.getMolefLearningNode(), null, "mfLearningNodes", null, 0, -1, LearningDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(learningNodeEClass, LearningNode.class, "LearningNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initEClass, Init.class, "Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInit_Name(), ecorePackage.getEString(), "name", " ", 0, 1, Init.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endEClass, End.class, "End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnd_Name(), ecorePackage.getEString(), "name", " ", 0, 1, End.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(learningActivityEClass, LearningActivity.class, "LearningActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLearningActivity_Name(), ecorePackage.getEString(), "name", "<...>", 0, 1, LearningActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLearningActivity_ItsModality(), this.getModalities(), "itsModality", null, 1, 1, LearningActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLearningActivity_ItsSubtype(), this.getSubtypes(), "itsSubtype", null, 1, 1, LearningActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearningActivity_Tools(), this.getTool(), null, "tools", null, 0, -1, LearningActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(leftSideLearningNodeEClass, LeftSideLearningNode.class, "LeftSideLearningNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(individualTaskEClass, IndividualTask.class, "IndividualTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndividualTask_TaskRoles(), this.getLeftSideLearningNode(), null, "taskRoles", null, 1, 1, IndividualTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndividualTask_TaskObjects(), this.getObject(), null, "taskObjects", null, 0, -1, IndividualTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndividualTask_Subtype(), this.getSubtype(), null, "subtype", null, 1, 1, IndividualTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndividualTask_Modality(), this.getModality(), null, "modality", null, 1, 1, IndividualTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupTaskEClass, GroupTask.class, "GroupTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupTask_TaskRoles(), this.getLeftSideLearningNode(), null, "taskRoles", null, 0, -1, GroupTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroupTask_TaskObjects(), this.getObject(), null, "taskObjects", null, 0, -1, GroupTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroupTask_Subtype(), this.getSubtype(), null, "subtype", null, 1, 1, GroupTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroupTask_Modality(), this.getModality(), null, "modality", null, 1, 1, GroupTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroupTask_EGL_Tool(), this.getTool(), null, "EGL_Tool", null, 0, 1, GroupTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupTask_EGL_Transformation(), ecorePackage.getEBoolean(), "EGL_Transformation", "false", 0, 1, GroupTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractTaskEClass, AbstractTask.class, "AbstractTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractTask_TaskRoles(), this.getLeftSideLearningNode(), null, "taskRoles", null, 0, -1, AbstractTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTask_TaskObjects(), this.getObject(), null, "taskObjects", null, 0, -1, AbstractTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTask_Subtype(), this.getSubtype(), null, "subtype", null, 1, 1, AbstractTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTask_Modality(), this.getModality(), null, "modality", null, 1, 1, AbstractTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(detailedAbstractTaskEClass, DetailedAbstractTask.class, "DetailedAbstractTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDetailedAbstractTask_LearningNodes(), this.getLearningNode(), null, "LearningNodes", null, 0, -1, DetailedAbstractTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectEClass, lciat.Object.class, "Object", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObject_Name(), ecorePackage.getEString(), "name", "C/R/W: Object", 0, 1, lciat.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObject_Object(), this.getObject(), null, "object", null, 0, 1, lciat.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObject_Modifier(), ecorePackage.getEString(), "modifier", null, 0, 1, lciat.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObject_ModifiedBy(), this.getLeftSideLearningNode(), null, "modifiedBy", null, 0, 1, lciat.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalConditionEClass, TemporalCondition.class, "TemporalCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemporalCondition_Name(), ecorePackage.getEString(), "name", "...", 0, 1, TemporalCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notificationEClass, Notification.class, "Notification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotification_Name(), ecorePackage.getEString(), "name", "...", 0, 1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Name(), ecorePackage.getEString(), "name", "? ...", 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subtypeEClass, Subtype.class, "Subtype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assimilativeEClass, Assimilative.class, "Assimilative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssimilative_Name(), ecorePackage.getEString(), "name", "Assimilative", 0, 1, Assimilative.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationHandlingEClass, InformationHandling.class, "InformationHandling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInformationHandling_Name(), ecorePackage.getEString(), "name", "Information Handling", 0, 1, InformationHandling.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adaptiveEClass, Adaptive.class, "Adaptive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdaptive_Name(), ecorePackage.getEString(), "name", "Adaptive", 0, 1, Adaptive.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicativeEClass, Communicative.class, "Communicative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicative_Name(), ecorePackage.getEString(), "name", "Communicative", 0, 1, Communicative.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productiveEClass, Productive.class, "Productive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductive_Name(), ecorePackage.getEString(), "name", "Productive", 0, 1, Productive.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(experientialEClass, Experiential.class, "Experiential", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExperiential_Name(), ecorePackage.getEString(), "name", "Experiential", 0, 1, Experiential.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluativeEClass, Evaluative.class, "Evaluative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvaluative_Name(), ecorePackage.getEString(), "name", "Evaluative", 0, 1, Evaluative.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supportEClass, Support.class, "Support", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSupport_Name(), ecorePackage.getEString(), "name", "Support", 0, 1, Support.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modalityEClass, Modality.class, "Modality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModality_Name(), ecorePackage.getEString(), "name", " ", 0, 1, Modality.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(faceToFaceEClass, FaceToFace.class, "FaceToFace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFaceToFace_Kind(), ecorePackage.getEString(), "kind", "FaceToFace", 0, 1, FaceToFace.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computerSupportedEClass, ComputerSupported.class, "ComputerSupported", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComputerSupported_Kind(), ecorePackage.getEString(), "kind", "ComputerSupported", 0, 1, ComputerSupported.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onlineEClass, Online.class, "Online", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOnline_Kind(), ecorePackage.getEString(), "kind", "Online", 0, 1, Online.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(learningLinkEClass, LearningLink.class, "LearningLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLearningLink_Source(), this.getLearningNode(), null, "source", null, 1, 1, LearningLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearningLink_Target(), this.getLearningNode(), null, "target", null, 1, 1, LearningLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enablingWOInformationEClass, EnablingWOInformation.class, "EnablingWOInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnablingWOInformation_ELabel(), ecorePackage.getEString(), "eLabel", ">>", 0, 1, EnablingWOInformation.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enablingWInformationEClass, EnablingWInformation.class, "EnablingWInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnablingWInformation_EwLabel(), ecorePackage.getEString(), "ewLabel", "[]>>", 0, 1, EnablingWInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChoice_DtLabel(), ecorePackage.getEString(), "dtLabel", "[]", 0, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concurrencyEClass, Concurrency.class, "Concurrency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcurrency_IcLabel(), ecorePackage.getEString(), "icLabel", "|||", 0, 1, Concurrency.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolEClass, Tool.class, "Tool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTool_Kind(), ecorePackage.getEString(), "kind", "Tool", 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTool_Chat(), this.getChat(), null, "chat", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTool_SessionPanel(), this.getSessionPanel(), null, "sessionPanel", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicalEditorEClass, GraphicalEditor.class, "GraphicalEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicalEditor_Name(), ecorePackage.getEString(), "name", "Graph. Editor", 0, 1, GraphicalEditor.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphicalEditor_TurnTakingTool(), this.getTurnTakingTool(), null, "turnTakingTool", null, 1, 1, GraphicalEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphicalEditor_Telepointer(), this.getTelepointer(), null, "telepointer", null, 0, 1, GraphicalEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphicalEditor_RadarView(), this.getRadarView(), null, "radarView", null, 0, 1, GraphicalEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphicalEditor_Properties(), this.getProperties(), null, "properties", null, 0, 1, GraphicalEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphicalEditor_Problems(), this.getProblems(), null, "problems", null, 0, 1, GraphicalEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textEditorEClass, TextEditor.class, "TextEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextEditor_Name(), ecorePackage.getEString(), "name", "Text Editor", 0, 1, TextEditor.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextEditor_TurnTakingTool(), this.getTurnTakingTool(), null, "turnTakingTool", null, 1, 1, TextEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextEditor_RadarView(), this.getRadarView(), null, "radarView", null, 0, 1, TextEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextEditor_Console(), this.getConsole(), null, "console", null, 0, 1, TextEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextEditor_Problems(), this.getProblems(), null, "problems", null, 0, 1, TextEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeEditorEClass, CodeEditor.class, "CodeEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodeEditor_Name(), ecorePackage.getEString(), "name", "Code Editor", 0, 1, CodeEditor.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeEditor_TurnTakingTool(), this.getTurnTakingTool(), null, "turnTakingTool", null, 1, 1, CodeEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeEditor_RadarView(), this.getRadarView(), null, "radarView", null, 0, 1, CodeEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeEditor_Console(), this.getConsole(), null, "console", null, 0, 1, CodeEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeEditor_Problems(), this.getProblems(), null, "problems", null, 0, 1, CodeEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webViewerEClass, WebViewer.class, "WebViewer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebViewer_Name(), ecorePackage.getEString(), "name", "Web", 0, 1, WebViewer.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awarenessEClass, Awareness.class, "Awareness", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sessionPanelEClass, SessionPanel.class, "SessionPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSessionPanel_Name(), ecorePackage.getEString(), "name", "Session", 0, 1, SessionPanel.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSessionPanel_Position(), this.getPosition(), "position", null, 0, 1, SessionPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSessionPanel_Language(), this.getLanguage(), "language", null, 0, 1, SessionPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSessionPanel_Size(), this.getSize(), "size", null, 0, 1, SessionPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chatEClass, Chat.class, "Chat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChat_Name(), ecorePackage.getEString(), "name", "Chat", 0, 1, Chat.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChat_IsStructured(), ecorePackage.getEBoolean(), "isStructured", "true", 0, 1, Chat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChat_Position(), this.getPosition(), "position", null, 0, 1, Chat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChat_Language(), this.getLanguage(), "language", null, 0, 1, Chat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChat_Size(), this.getSize(), "size", null, 0, 1, Chat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turnTakingToolEClass, TurnTakingTool.class, "TurnTakingTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTurnTakingTool_Name(), ecorePackage.getEString(), "name", "TurnTaking", 0, 1, TurnTakingTool.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurnTakingTool_Position(), this.getPosition(), "position", null, 0, 1, TurnTakingTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurnTakingTool_Language(), this.getLanguage(), "language", null, 0, 1, TurnTakingTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurnTakingTool_Size(), this.getSize(), "size", null, 0, 1, TurnTakingTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(telepointerEClass, Telepointer.class, "Telepointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTelepointer_Name(), ecorePackage.getEString(), "name", "Telepointer", 0, 1, Telepointer.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(radarViewEClass, RadarView.class, "RadarView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRadarView_Name(), ecorePackage.getEString(), "name", "Radar", 0, 1, RadarView.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadarView_Position(), this.getPosition(), "position", null, 0, 1, RadarView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesEClass, Properties.class, "Properties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperties_Name(), ecorePackage.getEString(), "name", "Properties", 0, 1, Properties.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperties_Position(), this.getPosition(), "position", null, 0, 1, Properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(consoleEClass, Console.class, "Console", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConsole_Name(), ecorePackage.getEString(), "name", "Console", 0, 1, Console.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsole_Position(), this.getPosition(), "position", null, 0, 1, Console.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(problemsEClass, Problems.class, "Problems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProblems_Name(), ecorePackage.getEString(), "name", "Problems", 0, 1, Problems.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProblems_Position(), this.getPosition(), "position", null, 0, 1, Problems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceabilityEClass, Traceability.class, "Traceability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTraceability_Awarelement(), this.getAwareness(), null, "awarelement", null, 1, 1, Traceability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraceability_Toolelement(), this.getTool(), null, "toolelement", null, 1, 1, Traceability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cttDiagramEClass, CTTDiagram.class, "CTTDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCTTDiagram_Name(), ecorePackage.getEString(), "name", "CTT :: ", 0, 1, CTTDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCTTDiagram_MolefCttNodes(), this.getMolefCttNode(), null, "molefCttNodes", null, 0, -1, CTTDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCTTDiagram_CttTasks(), this.getCTTTask(), null, "cttTasks", null, 0, -1, CTTDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCTTDiagram_MfCttNodes(), this.getMolefCttNode(), null, "mfCttNodes", null, 0, -1, CTTDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cttTaskEClass, CTTTask.class, "CTTTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCTTTask_Name(), ecorePackage.getEString(), "name", "<...>", 0, 1, CTTTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCTTTask_CttLinks(), this.getCTTLink(), null, "cttLinks", null, 0, -1, CTTTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exclusiveEditionEClass, ExclusiveEdition.class, "ExclusiveEdition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collaborativeVisualizationEClass, CollaborativeVisualization.class, "CollaborativeVisualization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(individualVisualizationEClass, IndividualVisualization.class, "IndividualVisualization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userTaskEClass, UserTask.class, "UserTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cttAbstractTaskEClass, CTTAbstractTask.class, "CTTAbstractTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactiveTaskEClass, InteractiveTask.class, "InteractiveTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cttCollaborativeTaskEClass, CTTCollaborativeTask.class, "CTTCollaborativeTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationTaskEClass, ApplicationTask.class, "ApplicationTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cttLinkEClass, CTTLink.class, "CTTLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCTTLink_Source(), this.getCTTTask(), null, "source", null, 1, 1, CTTLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCTTLink_Target(), this.getCTTTask(), null, "target", null, 1, 1, CTTLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregationEClass, Aggregation.class, "Aggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enablingEClass, Enabling.class, "Enabling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnabling_ELabel(), ecorePackage.getEString(), "eLabel", ">>", 0, 1, Enabling.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disablingEClass, Disabling.class, "Disabling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisabling_DLabel(), ecorePackage.getEString(), "dLabel", "[>", 0, 1, Disabling.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enablingWithInformationPassingEClass, EnablingWithInformationPassing.class, "EnablingWithInformationPassing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnablingWithInformationPassing_EwLabel(), ecorePackage.getEString(), "ewLabel", "[]>>", 0, 1, EnablingWithInformationPassing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disablingWithInformationPassingEClass, DisablingWithInformationPassing.class, "DisablingWithInformationPassing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisablingWithInformationPassing_DwLabel(), ecorePackage.getEString(), "dwLabel", "[]|>", 0, 1, DisablingWithInformationPassing.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(independentConcurrencyEClass, IndependentConcurrency.class, "IndependentConcurrency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndependentConcurrency_IcLabel(), ecorePackage.getEString(), "icLabel", "|||", 0, 1, IndependentConcurrency.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderIndependenceEClass, OrderIndependence.class, "OrderIndependence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderIndependence_OiLabel(), ecorePackage.getEString(), "oiLabel", "|=|", 0, 1, OrderIndependence.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(suspendResumeEClass, SuspendResume.class, "SuspendResume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuspendResume_SrLabel(), ecorePackage.getEString(), "srLabel", "|>", 0, 1, SuspendResume.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concurrencyWithInformationPassingEClass, ConcurrencyWithInformationPassing.class, "ConcurrencyWithInformationPassing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcurrencyWithInformationPassing_CLabel(), ecorePackage.getEString(), "cLabel", "|[]|", 0, 1, ConcurrencyWithInformationPassing.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deterministicChoiceEClass, DeterministicChoice.class, "DeterministicChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeterministicChoice_DtLabel(), ecorePackage.getEString(), "dtLabel", "[]", 0, 1, DeterministicChoice.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(undeterministicChoiceEClass, UndeterministicChoice.class, "UndeterministicChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUndeterministicChoice_UcLabel(), ecorePackage.getEString(), "ucLabel", "\u00c7", 0, 1, UndeterministicChoice.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefNodeEClass, MolefNode.class, "MolefNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(molefContentNodeEClass, MolefContentNode.class, "MolefContentNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(molefLearningNodeEClass, MolefLearningNode.class, "MolefLearningNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(molefCttNodeEClass, MolefCttNode.class, "MolefCttNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(molefContent1EClass, MolefContent1.class, "MolefContent1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefContent1_Characteristic(), ecorePackage.getEString(), "characteristic", "The content is organized into modules or units", 0, 1, MolefContent1.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefContent2EClass, MolefContent2.class, "MolefContent2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefContent2_Characteristic(), ecorePackage.getEString(), "characteristic", "The learning objectives are defined at the beginning of the module or unit", 0, 1, MolefContent2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefContent3EClass, MolefContent3.class, "MolefContent3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefContent3_Characteristic(), ecorePackage.getEString(), "characteristic", "Adviced that previous knowledge are required", 0, 1, MolefContent3.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefContent4EClass, MolefContent4.class, "MolefContent4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefContent4_Characteristic(), ecorePackage.getEString(), "characteristic", "The explanation of the concepts is presented in a clear and concise manner", 0, 1, MolefContent4.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefContent5EClass, MolefContent5.class, "MolefContent5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefContent5_Characteristic(), ecorePackage.getEString(), "characteristic", "The modules or units are organized according to levels of difficulty", 0, 1, MolefContent5.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefContent6EClass, MolefContent6.class, "MolefContent6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefContent6_Characteristic(), ecorePackage.getEString(), "characteristic", "There are links to external resources related to the content and adapted for mobile devices", 0, 1, MolefContent6.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefTaskAndActivitiesNodeEClass, MolefTaskAndActivitiesNode.class, "MolefTaskAndActivitiesNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(molefTActivities1EClass, MolefTActivities1.class, "MolefTActivities1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefTActivities1_Characteristic(), ecorePackage.getEString(), "characteristic", "Activities are proposed to acquire new skills that determine their learning (i.e. Questions, exercises, problem resolution, etc.)", 0, 1, MolefTActivities1.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefTActivities2EClass, MolefTActivities2.class, "MolefTActivities2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefTActivities2_Characteristic(), ecorePackage.getEString(), "characteristic", "The activities facilitate the understanding of educational content", 0, 1, MolefTActivities2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefTActivities3EClass, MolefTActivities3.class, "MolefTActivities3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefTActivities3_Characteristic(), ecorePackage.getEString(), "characteristic", "Learning activities help to improve or strengthen skills", 0, 1, MolefTActivities3.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefTActivities4EClass, MolefTActivities4.class, "MolefTActivities4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefTActivities4_Characteristic(), ecorePackage.getEString(), "characteristic", "The activities allow students to integrate new information with previous learning", 0, 1, MolefTActivities4.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefTActivities5EClass, MolefTActivities5.class, "MolefTActivities5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefTActivities5_Characteristic(), ecorePackage.getEString(), "characteristic", "Activities reflect practices relevant to real or professional life", 0, 1, MolefTActivities5.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefTActivities6EClass, MolefTActivities6.class, "MolefTActivities6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefTActivities6_Characteristic(), ecorePackage.getEString(), "characteristic", "The activities are consistent with the capabilities of students (neither too easy nor too dificult)", 0, 1, MolefTActivities6.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefTActivities7EClass, MolefTActivities7.class, "MolefTActivities7", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefTActivities7_Characteristic(), ecorePackage.getEString(), "characteristic", "There are activities to evaluate learning educational content (i.e. Tests, exercises, evaluations, etc.)", 0, 1, MolefTActivities7.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefTActivities8EClass, MolefTActivities8.class, "MolefTActivities8", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefTActivities8_Characteristic(), ecorePackage.getEString(), "characteristic", "The activities take advantage of functionalities or advantages of the use of mobile devices", 0, 1, MolefTActivities8.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefSocialNodeEClass, MolefSocialNode.class, "MolefSocialNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(molefSocial1EClass, MolefSocial1.class, "MolefSocial1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefSocial1_Characteristic(), ecorePackage.getEString(), "characteristic", "There are opportunities for students to do projects or group work", 0, 1, MolefSocial1.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefSocial2EClass, MolefSocial2.class, "MolefSocial2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefSocial2_Characteristic(), ecorePackage.getEString(), "characteristic", "The application allows you to communicate with other peers -chat, email, etc.-", 0, 1, MolefSocial2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefSocial3EClass, MolefSocial3.class, "MolefSocial3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefSocial3_Characteristic(), ecorePackage.getEString(), "characteristic", "The application allows you to share information, photos, videos or work-related documents for discussion", 0, 1, MolefSocial3.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefSocial4EClass, MolefSocial4.class, "MolefSocial4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefSocial4_Characteristic(), ecorePackage.getEString(), "characteristic", "The system allows competitive opportunities among students (ie. Display achievements)", 0, 1, MolefSocial4.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefPersonalizationNodeEClass, MolefPersonalizationNode.class, "MolefPersonalizationNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(molefPersonalization1EClass, MolefPersonalization1.class, "MolefPersonalization1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefPersonalization1_Characteristic(), ecorePackage.getEString(), "characteristic", "The students have freedom to direct their learning", 0, 1, MolefPersonalization1.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefPersonalization2EClass, MolefPersonalization2.class, "MolefPersonalization2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefPersonalization2_Characteristic(), ecorePackage.getEString(), "characteristic", "The students have the control of the contents they learn and the sequence they follow", 0, 1, MolefPersonalization2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefPersonalization3EClass, MolefPersonalization3.class, "MolefPersonalization3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefPersonalization3_Characteristic(), ecorePackage.getEString(), "characteristic", "The materials represent multiple views of the knowledge", 0, 1, MolefPersonalization3.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefPersonalization4EClass, MolefPersonalization4.class, "MolefPersonalization4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefPersonalization4_Characteristic(), ecorePackage.getEString(), "characteristic", "The students can customize their learning to suit their learning strategies (videos, text or audios)", 0, 1, MolefPersonalization4.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefPersonalization5EClass, MolefPersonalization5.class, "MolefPersonalization5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefPersonalization5_Characteristic(), ecorePackage.getEString(), "characteristic", "The tests and evaluations can be customized to the students abilities", 0, 1, MolefPersonalization5.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefMultimediaNodeEClass, MolefMultimediaNode.class, "MolefMultimediaNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(molefMultimedia1EClass, MolefMultimedia1.class, "MolefMultimedia1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefMultimedia1_Characteristic(), ecorePackage.getEString(), "characteristic", "Various multimedia resources (videos, images, audios, animations, simulations, etc.) related to the learning objectives are presented", 0, 1, MolefMultimedia1.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefMultimedia2EClass, MolefMultimedia2.class, "MolefMultimedia2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefMultimedia2_Characteristic(), ecorePackage.getEString(), "characteristic", "Multimedia resources have been properly selected to facilitate learning", 0, 1, MolefMultimedia2.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefMultimedia3EClass, MolefMultimedia3.class, "MolefMultimedia3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefMultimedia3_Characteristic(), ecorePackage.getEString(), "characteristic", "Multimedia resources have a shorter duration than 7 minutes", 0, 1, MolefMultimedia3.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefMultimedia4EClass, MolefMultimedia4.class, "MolefMultimedia4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefMultimedia4_Characteristic(), ecorePackage.getEString(), "characteristic", "Multimedia content have good quality video, audio and images", 0, 1, MolefMultimedia4.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefMultimedia5EClass, MolefMultimedia5.class, "MolefMultimedia5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefMultimedia5_Characteristic(), ecorePackage.getEString(), "characteristic", "Multimedia resources can be downloaded to the mobile device", 0, 1, MolefMultimedia5.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefMultimedia6EClass, MolefMultimedia6.class, "MolefMultimedia6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefMultimedia6_Characteristic(), ecorePackage.getEString(), "characteristic", "Multimedia resources are appropiately sized to be downloaded to the mobile", 0, 1, MolefMultimedia6.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molefMultimedia7EClass, MolefMultimedia7.class, "MolefMultimedia7", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolefMultimedia7_Characteristic(), ecorePackage.getEString(), "characteristic", "There is an adequate proportion of multimedia resources", 0, 1, MolefMultimedia7.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(subtypesEEnum, Subtypes.class, "Subtypes");
		addEEnumLiteral(subtypesEEnum, Subtypes.NONE);
		addEEnumLiteral(subtypesEEnum, Subtypes.ASSIMILATIVE);
		addEEnumLiteral(subtypesEEnum, Subtypes.ADAPTIVE);
		addEEnumLiteral(subtypesEEnum, Subtypes.INFORMATION_HANDLING);
		addEEnumLiteral(subtypesEEnum, Subtypes.COMMUNICATIVE);
		addEEnumLiteral(subtypesEEnum, Subtypes.PRODUCTIVE);
		addEEnumLiteral(subtypesEEnum, Subtypes.EXPERIENTIAL);
		addEEnumLiteral(subtypesEEnum, Subtypes.EVALUATIVE);
		addEEnumLiteral(subtypesEEnum, Subtypes.SUPPORT);

		initEEnum(modalitiesEEnum, Modalities.class, "Modalities");
		addEEnumLiteral(modalitiesEEnum, Modalities.NONE);
		addEEnumLiteral(modalitiesEEnum, Modalities.FACE_TO_FACE);
		addEEnumLiteral(modalitiesEEnum, Modalities.COMPUTER_SUPPORTED);
		addEEnumLiteral(modalitiesEEnum, Modalities.ONLINE);

		initEEnum(positionEEnum, Position.class, "Position");
		addEEnumLiteral(positionEEnum, Position.NONE);
		addEEnumLiteral(positionEEnum, Position.LEFT);
		addEEnumLiteral(positionEEnum, Position.RIGHT);
		addEEnumLiteral(positionEEnum, Position.BOTTOM);

		initEEnum(languageEEnum, Language.class, "Language");
		addEEnumLiteral(languageEEnum, Language.NONE);
		addEEnumLiteral(languageEEnum, Language.ENGLISH);
		addEEnumLiteral(languageEEnum, Language.SPANISH);

		initEEnum(sizeEEnum, Size.class, "Size");
		addEEnumLiteral(sizeEEnum, Size.NONE);
		addEEnumLiteral(sizeEEnum, Size.LARGE);
		addEEnumLiteral(sizeEEnum, Size.SMALL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
		// gmf.affixed
		createGmf_5Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (lcianDiagramEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (sociogramEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/Sociogram.gif"
		   });	
		addAnnotation
		  (rolEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Rol",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/Rol.gif"
		   });	
		addAnnotation
		  (groupEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Group",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/Group.gif"
		   });	
		addAnnotation
		  (learningDiagramEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Learning Diagram",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/LearningDesignDiagram.gif"
		   });	
		addAnnotation
		  (initEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.InitialFigure",
			 "tool.name", "Initial",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/Initial.gif",
			 "label", "name",
			 "label.icon", "false",
			 "label.placement", "external",
			 "resizable", "false",
			 "size", "16,16"
		   });	
		addAnnotation
		  (endEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.FinalFigure",
			 "tool.name", "Final",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/Final.gif",
			 "label", "name",
			 "label.icon", "false",
			 "label.placement", "external",
			 "resizable", "false",
			 "size", "16,16"
		   });	
		addAnnotation
		  (individualTaskEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Individual Learning",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/IndividualLearningTask.gif"
		   });	
		addAnnotation
		  (groupTaskEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Group Learning",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/GroupLearningTask.gif"
		   });	
		addAnnotation
		  (abstractTaskEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Abstract Learning",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/AbstractLearningTask.gif"
		   });	
		addAnnotation
		  (detailedAbstractTaskEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Detailed Abstract Learning",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/AbstractLearningTask.gif"
		   });	
		addAnnotation
		  (objectEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Object",
			 "label.icon", "false",
			 "figure", "rectangle",
			 "color", "154,236,255",
			 "size", "100,20",
			 "border.color", "0,179,255",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/Object.gif"
		   });	
		addAnnotation
		  (temporalConditionEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Temporal Condition",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/TemporalCondition.gif"
		   });	
		addAnnotation
		  (notificationEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Notification",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/Notification.gif"
		   });	
		addAnnotation
		  (conditionEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Condition",
			 "label.icon", "false",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/Condition.gif"
		   });	
		addAnnotation
		  (assimilativeEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Assimilative",
			 "label.icon", "false",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/Assimilative.gif"
		   });	
		addAnnotation
		  (informationHandlingEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Information Handling",
			 "label.icon", "false",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/InformationHandling.gif"
		   });	
		addAnnotation
		  (adaptiveEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Adaptive",
			 "label.icon", "false",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/Adaptive.gif"
		   });	
		addAnnotation
		  (communicativeEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Communicative",
			 "label.icon", "false",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/Communicative.gif"
		   });	
		addAnnotation
		  (productiveEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Productive",
			 "label.icon", "false",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/Productive.gif"
		   });	
		addAnnotation
		  (experientialEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Experiential",
			 "label.icon", "false",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/Experiential.gif"
		   });	
		addAnnotation
		  (evaluativeEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Evaluative",
			 "label.icon", "false",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/Evaluative.gif"
		   });	
		addAnnotation
		  (supportEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Support",
			 "label.icon", "false",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/Support.gif"
		   });	
		addAnnotation
		  (faceToFaceEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.FaceToFaceFigure",
			 "tool.name", "Face-to-face",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/FaceToFace.gif",
			 "label", "name",
			 "label.icon", "false",
			 "label.placement", "external",
			 "resizable", "false",
			 "size", "16,16"
		   });	
		addAnnotation
		  (computerSupportedEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.ComputerSupportedFigure",
			 "tool.name", "Computer-Supported",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/ComputerSupported.gif",
			 "label", "name",
			 "label.icon", "false",
			 "label.placement", "external",
			 "resizable", "false",
			 "size", "16,16"
		   });	
		addAnnotation
		  (onlineEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.OnlineFigure",
			 "tool.name", "Online",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/Online.gif",
			 "label", "name",
			 "label.icon", "false",
			 "label.placement", "external",
			 "resizable", "false",
			 "size", "16,16"
		   });	
		addAnnotation
		  (toolEClass, 
		   source, 
		   new String[] {
			 "label", "kind",
			 "tool.name", "Tool",
			 "figure", "polygon",
			 "resizable", "false",
			 "label.icon", "false",
			 "polygon.x", "0 20 49 69 49 20",
			 "polygon.y", "20 0 0 20 40 40",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/Tool.gif"
		   });	
		addAnnotation
		  (graphicalEditorEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Graphical Editor",
			 "figure", "polygon",
			 "resizable", "false",
			 "label.icon", "false",
			 "polygon.x", "0 20 49 69 49 20",
			 "polygon.y", "20 0 0 20 40 40",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/GraphicalEditor.gif"
		   });	
		addAnnotation
		  (textEditorEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Text Editor",
			 "figure", "polygon",
			 "resizable", "false",
			 "label.icon", "false",
			 "polygon.x", "0 20 49 69 49 20",
			 "polygon.y", "20 0 0 20 40 40",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/TextEditor.gif"
		   });	
		addAnnotation
		  (codeEditorEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Code Editor",
			 "figure", "polygon",
			 "resizable", "false",
			 "label.icon", "false",
			 "polygon.x", "0 20 49 69 49 20",
			 "polygon.y", "20 0 0 20 40 40",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/CodeEditor.gif"
		   });	
		addAnnotation
		  (webViewerEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Web Viewer",
			 "figure", "polygon",
			 "resizable", "false",
			 "label.icon", "false",
			 "polygon.x", "0 20 49 69 49 20",
			 "polygon.y", "20 0 0 20 40 40",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/WebViewer.gif"
		   });	
		addAnnotation
		  (sessionPanelEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Session Panel",
			 "figure", "ellipse",
			 "resizable", "false",
			 "label.icon", "false",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/SessionPanel.gif"
		   });	
		addAnnotation
		  (chatEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Chat",
			 "figure", "ellipse",
			 "resizable", "false",
			 "label.icon", "false",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/Chat.gif"
		   });	
		addAnnotation
		  (turnTakingToolEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "TurnTaking Panel",
			 "figure", "ellipse",
			 "resizable", "false",
			 "label.icon", "false",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/TurnTaking.gif"
		   });	
		addAnnotation
		  (telepointerEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Telepointer",
			 "figure", "ellipse",
			 "resizable", "false",
			 "label.icon", "false",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/Telepointer.gif"
		   });	
		addAnnotation
		  (radarViewEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Radar View",
			 "figure", "ellipse",
			 "resizable", "false",
			 "label.icon", "false",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/RadarView.gif"
		   });	
		addAnnotation
		  (propertiesEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Properties",
			 "figure", "ellipse",
			 "resizable", "false",
			 "label.icon", "false",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/Properties.gif"
		   });	
		addAnnotation
		  (consoleEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Console",
			 "figure", "ellipse",
			 "resizable", "false",
			 "label.icon", "false",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/Console.gif"
		   });	
		addAnnotation
		  (problemsEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.name", "Problems",
			 "figure", "ellipse",
			 "resizable", "false",
			 "label.icon", "false",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/Problems.gif"
		   });	
		addAnnotation
		  (cttDiagramEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/CTTDiagram.gif"
		   });	
		addAnnotation
		  (exclusiveEditionEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.ExclusiveEditionFigure",
			 "tool.name", "Exclusive Edition",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/ExclusiveEdition.gif",
			 "label", "name",
			 "label.icon", "false",
			 "label.placement", "external",
			 "resizable", "false",
			 "size", "16,16"
		   });	
		addAnnotation
		  (collaborativeVisualizationEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.CollaborativeVisualizationFigure",
			 "tool.name", "Collaborative Visualization",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/CollaborativeVisualization.gif",
			 "label", "name",
			 "label.icon", "false",
			 "label.placement", "external",
			 "resizable", "false",
			 "size", "16,16"
		   });	
		addAnnotation
		  (individualVisualizationEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.IndividualVisualizationFigure",
			 "tool.name", "Individual Visualization",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/IndividualVisualization.gif",
			 "label", "name",
			 "label.icon", "false",
			 "label.placement", "external",
			 "resizable", "false",
			 "size", "16,16"
		   });	
		addAnnotation
		  (userTaskEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.UserTaskFigure",
			 "tool.name", "User Task",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/UserTask.gif",
			 "label", "name",
			 "label.icon", "false",
			 "label.placement", "external",
			 "resizable", "false",
			 "size", "16,16"
		   });	
		addAnnotation
		  (cttAbstractTaskEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.AbstractTaskFigure",
			 "tool.name", "Abstract Task",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/AbstractTask.gif",
			 "label", "name",
			 "label.icon", "false",
			 "label.placement", "external",
			 "resizable", "false",
			 "size", "16,16"
		   });	
		addAnnotation
		  (interactiveTaskEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.InteractiveTaskFigure",
			 "tool.name", "Interactive Task",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/InteractionTask.gif",
			 "label", "name",
			 "label.icon", "false",
			 "label.placement", "external",
			 "resizable", "false",
			 "size", "16,16"
		   });	
		addAnnotation
		  (cttCollaborativeTaskEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.CollaborativeTaskFigure",
			 "tool.name", "Collaborative Task",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/CollaborativeTask.gif",
			 "label", "name",
			 "label.icon", "false",
			 "label.placement", "external",
			 "resizable", "false",
			 "size", "16,16"
		   });	
		addAnnotation
		  (applicationTaskEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.ApplicationTaskFigure",
			 "tool.name", "Application Task",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/ApplicationTask.gif",
			 "label", "name",
			 "label.icon", "false",
			 "label.placement", "external",
			 "resizable", "false",
			 "size", "16,16"
		   });	
		addAnnotation
		  (molefContent1EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Content 1",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefContent1.gif",
			 "tool.description", "The content is organized into modules or units"
		   });	
		addAnnotation
		  (molefContent2EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Content 2",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefContent2.gif",
			 "tool.description", "The learning objectives are defined at the beginning of the module or unit"
		   });	
		addAnnotation
		  (molefContent3EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Content 3",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefContent3.gif",
			 "tool.description", "Adviced that previous knowledge are required"
		   });	
		addAnnotation
		  (molefContent4EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Content 4",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefContent4.gif",
			 "tool.description", "The explanation of the concepts is presented in a clear and concise manner"
		   });	
		addAnnotation
		  (molefContent5EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Content 5",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefContent5.gif",
			 "tool.description", "The modules or units are organized according to levels of difficulty"
		   });	
		addAnnotation
		  (molefContent6EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Content 6",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefContent6.gif",
			 "tool.description", "There are links to external resources related to the content and adapted for mobile devices"
		   });	
		addAnnotation
		  (molefTActivities1EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Task and Activities 1",
			 "border.color", "255,255,255",
			 "size", "600,18",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefTActivities1.gif",
			 "tool.description", "Activities are proposed to acquire new skills that determine their learning -i.e. Questions, exercises, problem resolution, etc.-"
		   });	
		addAnnotation
		  (molefTActivities2EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Task and Activities 2",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefTActivities2.gif",
			 "tool.description", "The activities facilitate the understanding of educational content"
		   });	
		addAnnotation
		  (molefTActivities3EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Task and Activities 3",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefTActivities3.gif",
			 "tool.description", "Learning activities help to improve or strengthen skills"
		   });	
		addAnnotation
		  (molefTActivities4EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Task and Activities 4",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefTActivities4.gif",
			 "tool.description", "The activities allow students to integrate new information with previous learning"
		   });	
		addAnnotation
		  (molefTActivities5EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Task and Activities 5",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefTActivities5.gif",
			 "tool.description", "Activities reflect practices relevant to real or professional life"
		   });	
		addAnnotation
		  (molefTActivities6EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Task and Activities 6",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefTActivities6.gif",
			 "tool.description", "The activities are consistent with the capabilities of students -neither too easy nor too dificult-"
		   });	
		addAnnotation
		  (molefTActivities7EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Task and Activities 7",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefTActivities7.gif",
			 "tool.description", "There are activities to evaluate learning educational content -i.e. Tests, exercises, evaluations, etc.-"
		   });	
		addAnnotation
		  (molefTActivities8EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Task and Activities 8",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefTActivities8.gif",
			 "tool.description", "The activities take advantage of functionalities or advantages of the use of mobile devices"
		   });	
		addAnnotation
		  (molefSocial1EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Social 1",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefSocial1.gif",
			 "tool.description", "There are opportunities for students to do projects or group work"
		   });	
		addAnnotation
		  (molefSocial2EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Social 2",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefSocial2.gif",
			 "tool.description", "The application allows you to communicate with other peers -chat, email, etc.-"
		   });	
		addAnnotation
		  (molefSocial3EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Social 3",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefSocial3.gif",
			 "tool.description", "The application allows you to share information, photos, videos or work-related documents for discussion"
		   });	
		addAnnotation
		  (molefSocial4EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Social 4",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefSocial4.gif",
			 "tool.description", "The system allows competitive opportunities among students -ie. Display achievements-"
		   });	
		addAnnotation
		  (molefPersonalization1EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Personalization 1",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefPersonalization1.gif",
			 "tool.description", "The students have freedom to direct their learning"
		   });	
		addAnnotation
		  (molefPersonalization2EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Personalization 2",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefPersonalization2.gif",
			 "tool.description", "The students have the control of the contents they learn and the sequence they follow"
		   });	
		addAnnotation
		  (molefPersonalization3EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Personalization 3",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefPersonalization3.gif",
			 "tool.description", "The materials represent multiple views of the knowledge"
		   });	
		addAnnotation
		  (molefPersonalization4EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Personalization 4",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefPersonalization4.gif",
			 "tool.description", "The students can customize their learning to suit their learning strategies -videos, text or audios-"
		   });	
		addAnnotation
		  (molefPersonalization5EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Personalization 5",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefPersonalization5.gif",
			 "tool.description", "The tests and evaluations can be customized to the students abilities"
		   });	
		addAnnotation
		  (molefMultimedia1EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Multimedia 1",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefMultimedia1.gif",
			 "tool.description", "Various multimedia resources -videos, images, audios, animations, simulation, etc.- related to the learning objectives are presented"
		   });	
		addAnnotation
		  (molefMultimedia2EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Multimedia 2",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefMultimedia2.gif",
			 "tool.description", "Multimedia resources have been properly selected to facilitate learning"
		   });	
		addAnnotation
		  (molefMultimedia3EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Multimedia 3",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefMultimedia3.gif",
			 "tool.description", "Multimedia resources have a shorter duration than 7 minutes"
		   });	
		addAnnotation
		  (molefMultimedia4EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Multimedia 4",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefMultimedia4.gif",
			 "tool.description", "Multimedia content have good quality video, audio and images"
		   });	
		addAnnotation
		  (molefMultimedia5EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Multimedia 5",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefMultimedia5.gif",
			 "tool.description", "Multimedia resources can be downloaded to the mobile device"
		   });	
		addAnnotation
		  (molefMultimedia6EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Multimedia 6",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefMultimedia6.gif",
			 "tool.description", "Multimedia resources are appropiately sized to be downloaded to the mobile"
		   });	
		addAnnotation
		  (molefMultimedia7EClass, 
		   source, 
		   new String[] {
			 "label", "characteristic",
			 "tool.name", "Multimedia 7",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/MolefMultimedia7.gif",
			 "tool.description", "There is an adequate proportion of multimedia resources"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getSociogram_ItsSociogramNodes(), 
		   source, 
		   new String[] {
			 "layout", "free",
			 "collapsible", "false"
		   });	
		addAnnotation
		  (getSociogram_MfContentNodes(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "true"
		   });	
		addAnnotation
		  (getLearningDiagram_LearningNodes(), 
		   source, 
		   new String[] {
			 "layout", "free",
			 "collapsible", "true"
		   });	
		addAnnotation
		  (getLearningDiagram_MfLearningNodes(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "true"
		   });	
		addAnnotation
		  (getIndividualTask_TaskRoles(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "true"
		   });	
		addAnnotation
		  (getIndividualTask_TaskObjects(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "true"
		   });	
		addAnnotation
		  (getIndividualTask_Subtype(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "false"
		   });	
		addAnnotation
		  (getIndividualTask_Modality(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "false"
		   });	
		addAnnotation
		  (getGroupTask_TaskRoles(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "true"
		   });	
		addAnnotation
		  (getGroupTask_TaskObjects(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "true"
		   });	
		addAnnotation
		  (getGroupTask_Subtype(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "false"
		   });	
		addAnnotation
		  (getGroupTask_Modality(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "false"
		   });	
		addAnnotation
		  (getAbstractTask_TaskRoles(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "true"
		   });	
		addAnnotation
		  (getAbstractTask_TaskObjects(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "true"
		   });	
		addAnnotation
		  (getAbstractTask_Subtype(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "false"
		   });	
		addAnnotation
		  (getAbstractTask_Modality(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "false"
		   });	
		addAnnotation
		  (getDetailedAbstractTask_LearningNodes(), 
		   source, 
		   new String[] {
			 "layout", "free",
			 "collapsible", "true"
		   });	
		addAnnotation
		  (getCTTDiagram_CttTasks(), 
		   source, 
		   new String[] {
			 "layout", "free",
			 "collapsible", "true"
		   });	
		addAnnotation
		  (getCTTDiagram_MfCttNodes(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "true"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (inheritanceEClass, 
		   source, 
		   new String[] {
			 "label", "condition",
			 "source", "source",
			 "target", "target",
			 "target.decoration", "closedarrow",
			 "style", "solid",
			 "width", "1",
			 "color", "0,0,0",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/Inheritance.gif",
			 "source.constraint", "self <> oppositeEnd",
			 "target.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (actingEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "source", "source",
			 "target", "target",
			 "target.decoration", "closedarrow",
			 "style", "dash",
			 "width", "1",
			 "color", "0,0,0",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/Acting.gif",
			 "source.constraint", "self <> oppositeEnd",
			 "target.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (associationEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "1",
			 "color", "0,0,0",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/Association.gif",
			 "source.constraint", "self <> oppositeEnd",
			 "target.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (enablingWOInformationEClass, 
		   source, 
		   new String[] {
			 "label", "eLabel",
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "1",
			 "color", "0,0,0",
			 "tool.name", "Enabling w/o Information",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/EnablingTransition.gif",
			 "source.constraint", "self <> oppositeEnd",
			 "target.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (enablingWInformationEClass, 
		   source, 
		   new String[] {
			 "label", "ewLabel",
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "1",
			 "color", "0,0,0",
			 "tool.name", "Enabling w Information",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/EnablingWithInformationPassingTransition.gif",
			 "source.constraint", "self <> oppositeEnd",
			 "target.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (choiceEClass, 
		   source, 
		   new String[] {
			 "label", "dtLabel",
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "1",
			 "color", "0,0,0",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/DeterministicChoiceTransition.gif",
			 "source.constraint", "self <> oppositeEnd",
			 "target.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (concurrencyEClass, 
		   source, 
		   new String[] {
			 "label", "icLabel",
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "1",
			 "color", "0,0,0",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/IndependentConcurrencyTransition.gif",
			 "source.constraint", "self <> oppositeEnd",
			 "target.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (traceabilityEClass, 
		   source, 
		   new String[] {
			 "source", "awarelement",
			 "target", "toolelement",
			 "style", "dash",
			 "width", "1",
			 "color", "0,0,0",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/traceability.gif",
			 "target.decoration", "arrow",
			 "source.constraint", "self <> oppositeEnd",
			 "target.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (aggregationEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "1",
			 "color", "0,0,0",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/AggregationTransition.gif",
			 "source.constraint", "self <> oppositeEnd",
			 "target.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (enablingEClass, 
		   source, 
		   new String[] {
			 "label", "eLabel",
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "1",
			 "color", "0,0,0",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/EnablingTransition.gif",
			 "source.constraint", "self <> oppositeEnd",
			 "target.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (disablingEClass, 
		   source, 
		   new String[] {
			 "label", "dLabel",
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "1",
			 "color", "0,0,0",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/DisablingTransition.gif",
			 "source.constraint", "self <> oppositeEnd",
			 "target.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (enablingWithInformationPassingEClass, 
		   source, 
		   new String[] {
			 "label", "ewLabel",
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "1",
			 "color", "0,0,0",
			 "tool.name", "Enabling With Information Passing",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/EnablingWithInformationPassingTransition.gif",
			 "source.constraint", "self <> oppositeEnd",
			 "target.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (disablingWithInformationPassingEClass, 
		   source, 
		   new String[] {
			 "label", "dwLabel",
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "1",
			 "color", "0,0,0",
			 "tool.name", "Disabling With Information Passing",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/DisablingWithInformationPassingTransition.gif",
			 "source.constraint", "self <> oppositeEnd",
			 "target.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (independentConcurrencyEClass, 
		   source, 
		   new String[] {
			 "label", "icLabel",
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "1",
			 "color", "0,0,0",
			 "tool.name", "Independent Concurrency",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/IndependentConcurrencyTransition.gif",
			 "source.constraint", "self <> oppositeEnd",
			 "target.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (orderIndependenceEClass, 
		   source, 
		   new String[] {
			 "label", "oiLabel",
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "1",
			 "color", "0,0,0",
			 "tool.name", "Order Independence",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/OrderIndependenceTransition.gif",
			 "source.constraint", "self <> oppositeEnd",
			 "target.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (suspendResumeEClass, 
		   source, 
		   new String[] {
			 "label", "srLabel",
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "1",
			 "color", "0,0,0",
			 "tool.name", "Suspend Resume",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/SuspendResumeTransition.gif",
			 "source.constraint", "self <> oppositeEnd",
			 "target.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (concurrencyWithInformationPassingEClass, 
		   source, 
		   new String[] {
			 "label", "cLabel",
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "1",
			 "color", "0,0,0",
			 "tool.name", "Concurrency With Information Passing",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/ConcurrencyWithInformationPassingTransition.gif",
			 "source.constraint", "self <> oppositeEnd",
			 "target.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (deterministicChoiceEClass, 
		   source, 
		   new String[] {
			 "label", "dtLabel",
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "1",
			 "color", "0,0,0",
			 "tool.name", "Deterministic Choice",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/DeterministicChoiceTransition.gif",
			 "source.constraint", "self <> oppositeEnd",
			 "target.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (undeterministicChoiceEClass, 
		   source, 
		   new String[] {
			 "label", "ucLabel",
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "1",
			 "color", "0,0,0",
			 "tool.name", "Undeterministic Choice",
			 "tool.small.bundle", "org.chico.learnciat.figures",
			 "tool.small.path", "images/UndeterministicChoiceTransition.gif",
			 "source.constraint", "self <> oppositeEnd",
			 "target.constraint", "self <> oppositeEnd"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.affixed</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_5Annotations() {
		String source = "gmf.affixed";	
		addAnnotation
		  (getLearningActivity_Tools(), 
		   source, 
		   new String[] {
		   });
	}

} //LciatPackageImpl
