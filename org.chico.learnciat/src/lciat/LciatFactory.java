/**
 */
package lciat;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see lciat.LciatPackage
 * @generated
 */
public interface LciatFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LciatFactory eINSTANCE = lciat.impl.LciatFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>LCIAN Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LCIAN Diagram</em>'.
	 * @generated
	 */
	LCIANDiagram createLCIANDiagram();

	/**
	 * Returns a new object of class '<em>Sociogram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sociogram</em>'.
	 * @generated
	 */
	Sociogram createSociogram();

	/**
	 * Returns a new object of class '<em>Sociogram Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sociogram Node</em>'.
	 * @generated
	 */
	SociogramNode createSociogramNode();

	/**
	 * Returns a new object of class '<em>Rol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rol</em>'.
	 * @generated
	 */
	Rol createRol();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	Group createGroup();

	/**
	 * Returns a new object of class '<em>Sociogram Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sociogram Link</em>'.
	 * @generated
	 */
	SociogramLink createSociogramLink();

	/**
	 * Returns a new object of class '<em>Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inheritance</em>'.
	 * @generated
	 */
	Inheritance createInheritance();

	/**
	 * Returns a new object of class '<em>Acting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acting</em>'.
	 * @generated
	 */
	Acting createActing();

	/**
	 * Returns a new object of class '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association</em>'.
	 * @generated
	 */
	Association createAssociation();

	/**
	 * Returns a new object of class '<em>Learning Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Learning Diagram</em>'.
	 * @generated
	 */
	LearningDiagram createLearningDiagram();

	/**
	 * Returns a new object of class '<em>Learning Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Learning Node</em>'.
	 * @generated
	 */
	LearningNode createLearningNode();

	/**
	 * Returns a new object of class '<em>Init</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Init</em>'.
	 * @generated
	 */
	Init createInit();

	/**
	 * Returns a new object of class '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End</em>'.
	 * @generated
	 */
	End createEnd();

	/**
	 * Returns a new object of class '<em>Learning Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Learning Activity</em>'.
	 * @generated
	 */
	LearningActivity createLearningActivity();

	/**
	 * Returns a new object of class '<em>Individual Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Individual Task</em>'.
	 * @generated
	 */
	IndividualTask createIndividualTask();

	/**
	 * Returns a new object of class '<em>Group Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Task</em>'.
	 * @generated
	 */
	GroupTask createGroupTask();

	/**
	 * Returns a new object of class '<em>Abstract Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Task</em>'.
	 * @generated
	 */
	AbstractTask createAbstractTask();

	/**
	 * Returns a new object of class '<em>Detailed Abstract Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detailed Abstract Task</em>'.
	 * @generated
	 */
	DetailedAbstractTask createDetailedAbstractTask();

	/**
	 * Returns a new object of class '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object</em>'.
	 * @generated
	 */
	Object createObject();

	/**
	 * Returns a new object of class '<em>Temporal Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Condition</em>'.
	 * @generated
	 */
	TemporalCondition createTemporalCondition();

	/**
	 * Returns a new object of class '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notification</em>'.
	 * @generated
	 */
	Notification createNotification();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Subtype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subtype</em>'.
	 * @generated
	 */
	Subtype createSubtype();

	/**
	 * Returns a new object of class '<em>Assimilative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assimilative</em>'.
	 * @generated
	 */
	Assimilative createAssimilative();

	/**
	 * Returns a new object of class '<em>Information Handling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Handling</em>'.
	 * @generated
	 */
	InformationHandling createInformationHandling();

	/**
	 * Returns a new object of class '<em>Adaptive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adaptive</em>'.
	 * @generated
	 */
	Adaptive createAdaptive();

	/**
	 * Returns a new object of class '<em>Communicative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communicative</em>'.
	 * @generated
	 */
	Communicative createCommunicative();

	/**
	 * Returns a new object of class '<em>Productive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Productive</em>'.
	 * @generated
	 */
	Productive createProductive();

	/**
	 * Returns a new object of class '<em>Experiential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experiential</em>'.
	 * @generated
	 */
	Experiential createExperiential();

	/**
	 * Returns a new object of class '<em>Evaluative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluative</em>'.
	 * @generated
	 */
	Evaluative createEvaluative();

	/**
	 * Returns a new object of class '<em>Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Support</em>'.
	 * @generated
	 */
	Support createSupport();

	/**
	 * Returns a new object of class '<em>Modality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modality</em>'.
	 * @generated
	 */
	Modality createModality();

	/**
	 * Returns a new object of class '<em>Face To Face</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Face To Face</em>'.
	 * @generated
	 */
	FaceToFace createFaceToFace();

	/**
	 * Returns a new object of class '<em>Computer Supported</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computer Supported</em>'.
	 * @generated
	 */
	ComputerSupported createComputerSupported();

	/**
	 * Returns a new object of class '<em>Online</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Online</em>'.
	 * @generated
	 */
	Online createOnline();

	/**
	 * Returns a new object of class '<em>Learning Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Learning Link</em>'.
	 * @generated
	 */
	LearningLink createLearningLink();

	/**
	 * Returns a new object of class '<em>Enabling WO Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enabling WO Information</em>'.
	 * @generated
	 */
	EnablingWOInformation createEnablingWOInformation();

	/**
	 * Returns a new object of class '<em>Enabling WInformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enabling WInformation</em>'.
	 * @generated
	 */
	EnablingWInformation createEnablingWInformation();

	/**
	 * Returns a new object of class '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice</em>'.
	 * @generated
	 */
	Choice createChoice();

	/**
	 * Returns a new object of class '<em>Concurrency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concurrency</em>'.
	 * @generated
	 */
	Concurrency createConcurrency();

	/**
	 * Returns a new object of class '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool</em>'.
	 * @generated
	 */
	Tool createTool();

	/**
	 * Returns a new object of class '<em>Graphical Editor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graphical Editor</em>'.
	 * @generated
	 */
	GraphicalEditor createGraphicalEditor();

	/**
	 * Returns a new object of class '<em>Text Editor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Editor</em>'.
	 * @generated
	 */
	TextEditor createTextEditor();

	/**
	 * Returns a new object of class '<em>Code Editor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Editor</em>'.
	 * @generated
	 */
	CodeEditor createCodeEditor();

	/**
	 * Returns a new object of class '<em>Web Viewer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Viewer</em>'.
	 * @generated
	 */
	WebViewer createWebViewer();

	/**
	 * Returns a new object of class '<em>Session Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Session Panel</em>'.
	 * @generated
	 */
	SessionPanel createSessionPanel();

	/**
	 * Returns a new object of class '<em>Chat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chat</em>'.
	 * @generated
	 */
	Chat createChat();

	/**
	 * Returns a new object of class '<em>Turn Taking Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn Taking Tool</em>'.
	 * @generated
	 */
	TurnTakingTool createTurnTakingTool();

	/**
	 * Returns a new object of class '<em>Telepointer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Telepointer</em>'.
	 * @generated
	 */
	Telepointer createTelepointer();

	/**
	 * Returns a new object of class '<em>Radar View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radar View</em>'.
	 * @generated
	 */
	RadarView createRadarView();

	/**
	 * Returns a new object of class '<em>Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Properties</em>'.
	 * @generated
	 */
	Properties createProperties();

	/**
	 * Returns a new object of class '<em>Console</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Console</em>'.
	 * @generated
	 */
	Console createConsole();

	/**
	 * Returns a new object of class '<em>Problems</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problems</em>'.
	 * @generated
	 */
	Problems createProblems();

	/**
	 * Returns a new object of class '<em>Traceability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traceability</em>'.
	 * @generated
	 */
	Traceability createTraceability();

	/**
	 * Returns a new object of class '<em>CTT Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CTT Diagram</em>'.
	 * @generated
	 */
	CTTDiagram createCTTDiagram();

	/**
	 * Returns a new object of class '<em>CTT Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CTT Task</em>'.
	 * @generated
	 */
	CTTTask createCTTTask();

	/**
	 * Returns a new object of class '<em>Exclusive Edition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclusive Edition</em>'.
	 * @generated
	 */
	ExclusiveEdition createExclusiveEdition();

	/**
	 * Returns a new object of class '<em>Collaborative Visualization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collaborative Visualization</em>'.
	 * @generated
	 */
	CollaborativeVisualization createCollaborativeVisualization();

	/**
	 * Returns a new object of class '<em>Individual Visualization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Individual Visualization</em>'.
	 * @generated
	 */
	IndividualVisualization createIndividualVisualization();

	/**
	 * Returns a new object of class '<em>User Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Task</em>'.
	 * @generated
	 */
	UserTask createUserTask();

	/**
	 * Returns a new object of class '<em>CTT Abstract Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CTT Abstract Task</em>'.
	 * @generated
	 */
	CTTAbstractTask createCTTAbstractTask();

	/**
	 * Returns a new object of class '<em>Interactive Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interactive Task</em>'.
	 * @generated
	 */
	InteractiveTask createInteractiveTask();

	/**
	 * Returns a new object of class '<em>CTT Collaborative Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CTT Collaborative Task</em>'.
	 * @generated
	 */
	CTTCollaborativeTask createCTTCollaborativeTask();

	/**
	 * Returns a new object of class '<em>Application Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Task</em>'.
	 * @generated
	 */
	ApplicationTask createApplicationTask();

	/**
	 * Returns a new object of class '<em>CTT Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CTT Link</em>'.
	 * @generated
	 */
	CTTLink createCTTLink();

	/**
	 * Returns a new object of class '<em>Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregation</em>'.
	 * @generated
	 */
	Aggregation createAggregation();

	/**
	 * Returns a new object of class '<em>Enabling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enabling</em>'.
	 * @generated
	 */
	Enabling createEnabling();

	/**
	 * Returns a new object of class '<em>Disabling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disabling</em>'.
	 * @generated
	 */
	Disabling createDisabling();

	/**
	 * Returns a new object of class '<em>Enabling With Information Passing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enabling With Information Passing</em>'.
	 * @generated
	 */
	EnablingWithInformationPassing createEnablingWithInformationPassing();

	/**
	 * Returns a new object of class '<em>Disabling With Information Passing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disabling With Information Passing</em>'.
	 * @generated
	 */
	DisablingWithInformationPassing createDisablingWithInformationPassing();

	/**
	 * Returns a new object of class '<em>Independent Concurrency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Independent Concurrency</em>'.
	 * @generated
	 */
	IndependentConcurrency createIndependentConcurrency();

	/**
	 * Returns a new object of class '<em>Order Independence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Independence</em>'.
	 * @generated
	 */
	OrderIndependence createOrderIndependence();

	/**
	 * Returns a new object of class '<em>Suspend Resume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suspend Resume</em>'.
	 * @generated
	 */
	SuspendResume createSuspendResume();

	/**
	 * Returns a new object of class '<em>Concurrency With Information Passing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concurrency With Information Passing</em>'.
	 * @generated
	 */
	ConcurrencyWithInformationPassing createConcurrencyWithInformationPassing();

	/**
	 * Returns a new object of class '<em>Deterministic Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deterministic Choice</em>'.
	 * @generated
	 */
	DeterministicChoice createDeterministicChoice();

	/**
	 * Returns a new object of class '<em>Undeterministic Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Undeterministic Choice</em>'.
	 * @generated
	 */
	UndeterministicChoice createUndeterministicChoice();

	/**
	 * Returns a new object of class '<em>Molef Content1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef Content1</em>'.
	 * @generated
	 */
	MolefContent1 createMolefContent1();

	/**
	 * Returns a new object of class '<em>Molef Content2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef Content2</em>'.
	 * @generated
	 */
	MolefContent2 createMolefContent2();

	/**
	 * Returns a new object of class '<em>Molef Content3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef Content3</em>'.
	 * @generated
	 */
	MolefContent3 createMolefContent3();

	/**
	 * Returns a new object of class '<em>Molef Content4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef Content4</em>'.
	 * @generated
	 */
	MolefContent4 createMolefContent4();

	/**
	 * Returns a new object of class '<em>Molef Content5</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef Content5</em>'.
	 * @generated
	 */
	MolefContent5 createMolefContent5();

	/**
	 * Returns a new object of class '<em>Molef Content6</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef Content6</em>'.
	 * @generated
	 */
	MolefContent6 createMolefContent6();

	/**
	 * Returns a new object of class '<em>Molef Task And Activities Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef Task And Activities Node</em>'.
	 * @generated
	 */
	MolefTaskAndActivitiesNode createMolefTaskAndActivitiesNode();

	/**
	 * Returns a new object of class '<em>Molef TActivities1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef TActivities1</em>'.
	 * @generated
	 */
	MolefTActivities1 createMolefTActivities1();

	/**
	 * Returns a new object of class '<em>Molef TActivities2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef TActivities2</em>'.
	 * @generated
	 */
	MolefTActivities2 createMolefTActivities2();

	/**
	 * Returns a new object of class '<em>Molef TActivities3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef TActivities3</em>'.
	 * @generated
	 */
	MolefTActivities3 createMolefTActivities3();

	/**
	 * Returns a new object of class '<em>Molef TActivities4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef TActivities4</em>'.
	 * @generated
	 */
	MolefTActivities4 createMolefTActivities4();

	/**
	 * Returns a new object of class '<em>Molef TActivities5</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef TActivities5</em>'.
	 * @generated
	 */
	MolefTActivities5 createMolefTActivities5();

	/**
	 * Returns a new object of class '<em>Molef TActivities6</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef TActivities6</em>'.
	 * @generated
	 */
	MolefTActivities6 createMolefTActivities6();

	/**
	 * Returns a new object of class '<em>Molef TActivities7</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef TActivities7</em>'.
	 * @generated
	 */
	MolefTActivities7 createMolefTActivities7();

	/**
	 * Returns a new object of class '<em>Molef TActivities8</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef TActivities8</em>'.
	 * @generated
	 */
	MolefTActivities8 createMolefTActivities8();

	/**
	 * Returns a new object of class '<em>Molef Social Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef Social Node</em>'.
	 * @generated
	 */
	MolefSocialNode createMolefSocialNode();

	/**
	 * Returns a new object of class '<em>Molef Social1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef Social1</em>'.
	 * @generated
	 */
	MolefSocial1 createMolefSocial1();

	/**
	 * Returns a new object of class '<em>Molef Social2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef Social2</em>'.
	 * @generated
	 */
	MolefSocial2 createMolefSocial2();

	/**
	 * Returns a new object of class '<em>Molef Social3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef Social3</em>'.
	 * @generated
	 */
	MolefSocial3 createMolefSocial3();

	/**
	 * Returns a new object of class '<em>Molef Social4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef Social4</em>'.
	 * @generated
	 */
	MolefSocial4 createMolefSocial4();

	/**
	 * Returns a new object of class '<em>Molef Personalization Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef Personalization Node</em>'.
	 * @generated
	 */
	MolefPersonalizationNode createMolefPersonalizationNode();

	/**
	 * Returns a new object of class '<em>Molef Personalization1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef Personalization1</em>'.
	 * @generated
	 */
	MolefPersonalization1 createMolefPersonalization1();

	/**
	 * Returns a new object of class '<em>Molef Personalization2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef Personalization2</em>'.
	 * @generated
	 */
	MolefPersonalization2 createMolefPersonalization2();

	/**
	 * Returns a new object of class '<em>Molef Personalization3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef Personalization3</em>'.
	 * @generated
	 */
	MolefPersonalization3 createMolefPersonalization3();

	/**
	 * Returns a new object of class '<em>Molef Personalization4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef Personalization4</em>'.
	 * @generated
	 */
	MolefPersonalization4 createMolefPersonalization4();

	/**
	 * Returns a new object of class '<em>Molef Personalization5</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef Personalization5</em>'.
	 * @generated
	 */
	MolefPersonalization5 createMolefPersonalization5();

	/**
	 * Returns a new object of class '<em>Molef Multimedia Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef Multimedia Node</em>'.
	 * @generated
	 */
	MolefMultimediaNode createMolefMultimediaNode();

	/**
	 * Returns a new object of class '<em>Molef Multimedia1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef Multimedia1</em>'.
	 * @generated
	 */
	MolefMultimedia1 createMolefMultimedia1();

	/**
	 * Returns a new object of class '<em>Molef Multimedia2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef Multimedia2</em>'.
	 * @generated
	 */
	MolefMultimedia2 createMolefMultimedia2();

	/**
	 * Returns a new object of class '<em>Molef Multimedia3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef Multimedia3</em>'.
	 * @generated
	 */
	MolefMultimedia3 createMolefMultimedia3();

	/**
	 * Returns a new object of class '<em>Molef Multimedia4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef Multimedia4</em>'.
	 * @generated
	 */
	MolefMultimedia4 createMolefMultimedia4();

	/**
	 * Returns a new object of class '<em>Molef Multimedia5</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef Multimedia5</em>'.
	 * @generated
	 */
	MolefMultimedia5 createMolefMultimedia5();

	/**
	 * Returns a new object of class '<em>Molef Multimedia6</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef Multimedia6</em>'.
	 * @generated
	 */
	MolefMultimedia6 createMolefMultimedia6();

	/**
	 * Returns a new object of class '<em>Molef Multimedia7</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molef Multimedia7</em>'.
	 * @generated
	 */
	MolefMultimedia7 createMolefMultimedia7();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LciatPackage getLciatPackage();

} //LciatFactory
