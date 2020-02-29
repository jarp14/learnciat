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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see lciat.LciatPackage
 * @generated
 */
public class LciatAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LciatPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LciatAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LciatPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LciatSwitch<Adapter> modelSwitch =
		new LciatSwitch<Adapter>() {
			@Override
			public Adapter caseLCIANDiagram(LCIANDiagram object) {
				return createLCIANDiagramAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseSociogram(Sociogram object) {
				return createSociogramAdapter();
			}
			@Override
			public Adapter caseSociogramNode(SociogramNode object) {
				return createSociogramNodeAdapter();
			}
			@Override
			public Adapter caseRol(Rol object) {
				return createRolAdapter();
			}
			@Override
			public Adapter caseGroup(Group object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter caseSociogramLink(SociogramLink object) {
				return createSociogramLinkAdapter();
			}
			@Override
			public Adapter caseInheritance(Inheritance object) {
				return createInheritanceAdapter();
			}
			@Override
			public Adapter caseActing(Acting object) {
				return createActingAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseLearningDiagram(LearningDiagram object) {
				return createLearningDiagramAdapter();
			}
			@Override
			public Adapter caseLearningNode(LearningNode object) {
				return createLearningNodeAdapter();
			}
			@Override
			public Adapter caseInit(Init object) {
				return createInitAdapter();
			}
			@Override
			public Adapter caseEnd(End object) {
				return createEndAdapter();
			}
			@Override
			public Adapter caseLearningActivity(LearningActivity object) {
				return createLearningActivityAdapter();
			}
			@Override
			public Adapter caseLeftSideLearningNode(LeftSideLearningNode object) {
				return createLeftSideLearningNodeAdapter();
			}
			@Override
			public Adapter caseIndividualTask(IndividualTask object) {
				return createIndividualTaskAdapter();
			}
			@Override
			public Adapter caseGroupTask(GroupTask object) {
				return createGroupTaskAdapter();
			}
			@Override
			public Adapter caseAbstractTask(AbstractTask object) {
				return createAbstractTaskAdapter();
			}
			@Override
			public Adapter caseDetailedAbstractTask(DetailedAbstractTask object) {
				return createDetailedAbstractTaskAdapter();
			}
			@Override
			public Adapter caseObject(lciat.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseTemporalCondition(TemporalCondition object) {
				return createTemporalConditionAdapter();
			}
			@Override
			public Adapter caseNotification(Notification object) {
				return createNotificationAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseSubtype(Subtype object) {
				return createSubtypeAdapter();
			}
			@Override
			public Adapter caseAssimilative(Assimilative object) {
				return createAssimilativeAdapter();
			}
			@Override
			public Adapter caseInformationHandling(InformationHandling object) {
				return createInformationHandlingAdapter();
			}
			@Override
			public Adapter caseAdaptive(Adaptive object) {
				return createAdaptiveAdapter();
			}
			@Override
			public Adapter caseCommunicative(Communicative object) {
				return createCommunicativeAdapter();
			}
			@Override
			public Adapter caseProductive(Productive object) {
				return createProductiveAdapter();
			}
			@Override
			public Adapter caseExperiential(Experiential object) {
				return createExperientialAdapter();
			}
			@Override
			public Adapter caseEvaluative(Evaluative object) {
				return createEvaluativeAdapter();
			}
			@Override
			public Adapter caseSupport(Support object) {
				return createSupportAdapter();
			}
			@Override
			public Adapter caseModality(Modality object) {
				return createModalityAdapter();
			}
			@Override
			public Adapter caseFaceToFace(FaceToFace object) {
				return createFaceToFaceAdapter();
			}
			@Override
			public Adapter caseComputerSupported(ComputerSupported object) {
				return createComputerSupportedAdapter();
			}
			@Override
			public Adapter caseOnline(Online object) {
				return createOnlineAdapter();
			}
			@Override
			public Adapter caseLearningLink(LearningLink object) {
				return createLearningLinkAdapter();
			}
			@Override
			public Adapter caseEnablingWOInformation(EnablingWOInformation object) {
				return createEnablingWOInformationAdapter();
			}
			@Override
			public Adapter caseEnablingWInformation(EnablingWInformation object) {
				return createEnablingWInformationAdapter();
			}
			@Override
			public Adapter caseChoice(Choice object) {
				return createChoiceAdapter();
			}
			@Override
			public Adapter caseConcurrency(Concurrency object) {
				return createConcurrencyAdapter();
			}
			@Override
			public Adapter caseTool(Tool object) {
				return createToolAdapter();
			}
			@Override
			public Adapter caseGraphicalEditor(GraphicalEditor object) {
				return createGraphicalEditorAdapter();
			}
			@Override
			public Adapter caseTextEditor(TextEditor object) {
				return createTextEditorAdapter();
			}
			@Override
			public Adapter caseCodeEditor(CodeEditor object) {
				return createCodeEditorAdapter();
			}
			@Override
			public Adapter caseWebViewer(WebViewer object) {
				return createWebViewerAdapter();
			}
			@Override
			public Adapter caseAwareness(Awareness object) {
				return createAwarenessAdapter();
			}
			@Override
			public Adapter caseSessionPanel(SessionPanel object) {
				return createSessionPanelAdapter();
			}
			@Override
			public Adapter caseChat(Chat object) {
				return createChatAdapter();
			}
			@Override
			public Adapter caseTurnTakingTool(TurnTakingTool object) {
				return createTurnTakingToolAdapter();
			}
			@Override
			public Adapter caseTelepointer(Telepointer object) {
				return createTelepointerAdapter();
			}
			@Override
			public Adapter caseRadarView(RadarView object) {
				return createRadarViewAdapter();
			}
			@Override
			public Adapter caseProperties(Properties object) {
				return createPropertiesAdapter();
			}
			@Override
			public Adapter caseConsole(Console object) {
				return createConsoleAdapter();
			}
			@Override
			public Adapter caseProblems(Problems object) {
				return createProblemsAdapter();
			}
			@Override
			public Adapter caseTraceability(Traceability object) {
				return createTraceabilityAdapter();
			}
			@Override
			public Adapter caseCTTDiagram(CTTDiagram object) {
				return createCTTDiagramAdapter();
			}
			@Override
			public Adapter caseCTTTask(CTTTask object) {
				return createCTTTaskAdapter();
			}
			@Override
			public Adapter caseExclusiveEdition(ExclusiveEdition object) {
				return createExclusiveEditionAdapter();
			}
			@Override
			public Adapter caseCollaborativeVisualization(CollaborativeVisualization object) {
				return createCollaborativeVisualizationAdapter();
			}
			@Override
			public Adapter caseIndividualVisualization(IndividualVisualization object) {
				return createIndividualVisualizationAdapter();
			}
			@Override
			public Adapter caseUserTask(UserTask object) {
				return createUserTaskAdapter();
			}
			@Override
			public Adapter caseCTTAbstractTask(CTTAbstractTask object) {
				return createCTTAbstractTaskAdapter();
			}
			@Override
			public Adapter caseInteractiveTask(InteractiveTask object) {
				return createInteractiveTaskAdapter();
			}
			@Override
			public Adapter caseCTTCollaborativeTask(CTTCollaborativeTask object) {
				return createCTTCollaborativeTaskAdapter();
			}
			@Override
			public Adapter caseApplicationTask(ApplicationTask object) {
				return createApplicationTaskAdapter();
			}
			@Override
			public Adapter caseCTTLink(CTTLink object) {
				return createCTTLinkAdapter();
			}
			@Override
			public Adapter caseAggregation(Aggregation object) {
				return createAggregationAdapter();
			}
			@Override
			public Adapter caseEnabling(Enabling object) {
				return createEnablingAdapter();
			}
			@Override
			public Adapter caseDisabling(Disabling object) {
				return createDisablingAdapter();
			}
			@Override
			public Adapter caseEnablingWithInformationPassing(EnablingWithInformationPassing object) {
				return createEnablingWithInformationPassingAdapter();
			}
			@Override
			public Adapter caseDisablingWithInformationPassing(DisablingWithInformationPassing object) {
				return createDisablingWithInformationPassingAdapter();
			}
			@Override
			public Adapter caseIndependentConcurrency(IndependentConcurrency object) {
				return createIndependentConcurrencyAdapter();
			}
			@Override
			public Adapter caseOrderIndependence(OrderIndependence object) {
				return createOrderIndependenceAdapter();
			}
			@Override
			public Adapter caseSuspendResume(SuspendResume object) {
				return createSuspendResumeAdapter();
			}
			@Override
			public Adapter caseConcurrencyWithInformationPassing(ConcurrencyWithInformationPassing object) {
				return createConcurrencyWithInformationPassingAdapter();
			}
			@Override
			public Adapter caseDeterministicChoice(DeterministicChoice object) {
				return createDeterministicChoiceAdapter();
			}
			@Override
			public Adapter caseUndeterministicChoice(UndeterministicChoice object) {
				return createUndeterministicChoiceAdapter();
			}
			@Override
			public Adapter caseMolefNode(MolefNode object) {
				return createMolefNodeAdapter();
			}
			@Override
			public Adapter caseMolefContentNode(MolefContentNode object) {
				return createMolefContentNodeAdapter();
			}
			@Override
			public Adapter caseMolefLearningNode(MolefLearningNode object) {
				return createMolefLearningNodeAdapter();
			}
			@Override
			public Adapter caseMolefCttNode(MolefCttNode object) {
				return createMolefCttNodeAdapter();
			}
			@Override
			public Adapter caseMolefContent1(MolefContent1 object) {
				return createMolefContent1Adapter();
			}
			@Override
			public Adapter caseMolefContent2(MolefContent2 object) {
				return createMolefContent2Adapter();
			}
			@Override
			public Adapter caseMolefContent3(MolefContent3 object) {
				return createMolefContent3Adapter();
			}
			@Override
			public Adapter caseMolefContent4(MolefContent4 object) {
				return createMolefContent4Adapter();
			}
			@Override
			public Adapter caseMolefContent5(MolefContent5 object) {
				return createMolefContent5Adapter();
			}
			@Override
			public Adapter caseMolefContent6(MolefContent6 object) {
				return createMolefContent6Adapter();
			}
			@Override
			public Adapter caseMolefTaskAndActivitiesNode(MolefTaskAndActivitiesNode object) {
				return createMolefTaskAndActivitiesNodeAdapter();
			}
			@Override
			public Adapter caseMolefTActivities1(MolefTActivities1 object) {
				return createMolefTActivities1Adapter();
			}
			@Override
			public Adapter caseMolefTActivities2(MolefTActivities2 object) {
				return createMolefTActivities2Adapter();
			}
			@Override
			public Adapter caseMolefTActivities3(MolefTActivities3 object) {
				return createMolefTActivities3Adapter();
			}
			@Override
			public Adapter caseMolefTActivities4(MolefTActivities4 object) {
				return createMolefTActivities4Adapter();
			}
			@Override
			public Adapter caseMolefTActivities5(MolefTActivities5 object) {
				return createMolefTActivities5Adapter();
			}
			@Override
			public Adapter caseMolefTActivities6(MolefTActivities6 object) {
				return createMolefTActivities6Adapter();
			}
			@Override
			public Adapter caseMolefTActivities7(MolefTActivities7 object) {
				return createMolefTActivities7Adapter();
			}
			@Override
			public Adapter caseMolefTActivities8(MolefTActivities8 object) {
				return createMolefTActivities8Adapter();
			}
			@Override
			public Adapter caseMolefSocialNode(MolefSocialNode object) {
				return createMolefSocialNodeAdapter();
			}
			@Override
			public Adapter caseMolefSocial1(MolefSocial1 object) {
				return createMolefSocial1Adapter();
			}
			@Override
			public Adapter caseMolefSocial2(MolefSocial2 object) {
				return createMolefSocial2Adapter();
			}
			@Override
			public Adapter caseMolefSocial3(MolefSocial3 object) {
				return createMolefSocial3Adapter();
			}
			@Override
			public Adapter caseMolefSocial4(MolefSocial4 object) {
				return createMolefSocial4Adapter();
			}
			@Override
			public Adapter caseMolefPersonalizationNode(MolefPersonalizationNode object) {
				return createMolefPersonalizationNodeAdapter();
			}
			@Override
			public Adapter caseMolefPersonalization1(MolefPersonalization1 object) {
				return createMolefPersonalization1Adapter();
			}
			@Override
			public Adapter caseMolefPersonalization2(MolefPersonalization2 object) {
				return createMolefPersonalization2Adapter();
			}
			@Override
			public Adapter caseMolefPersonalization3(MolefPersonalization3 object) {
				return createMolefPersonalization3Adapter();
			}
			@Override
			public Adapter caseMolefPersonalization4(MolefPersonalization4 object) {
				return createMolefPersonalization4Adapter();
			}
			@Override
			public Adapter caseMolefPersonalization5(MolefPersonalization5 object) {
				return createMolefPersonalization5Adapter();
			}
			@Override
			public Adapter caseMolefMultimediaNode(MolefMultimediaNode object) {
				return createMolefMultimediaNodeAdapter();
			}
			@Override
			public Adapter caseMolefMultimedia1(MolefMultimedia1 object) {
				return createMolefMultimedia1Adapter();
			}
			@Override
			public Adapter caseMolefMultimedia2(MolefMultimedia2 object) {
				return createMolefMultimedia2Adapter();
			}
			@Override
			public Adapter caseMolefMultimedia3(MolefMultimedia3 object) {
				return createMolefMultimedia3Adapter();
			}
			@Override
			public Adapter caseMolefMultimedia4(MolefMultimedia4 object) {
				return createMolefMultimedia4Adapter();
			}
			@Override
			public Adapter caseMolefMultimedia5(MolefMultimedia5 object) {
				return createMolefMultimedia5Adapter();
			}
			@Override
			public Adapter caseMolefMultimedia6(MolefMultimedia6 object) {
				return createMolefMultimedia6Adapter();
			}
			@Override
			public Adapter caseMolefMultimedia7(MolefMultimedia7 object) {
				return createMolefMultimedia7Adapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link lciat.LCIANDiagram <em>LCIAN Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.LCIANDiagram
	 * @generated
	 */
	public Adapter createLCIANDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Sociogram <em>Sociogram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Sociogram
	 * @generated
	 */
	public Adapter createSociogramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.SociogramNode <em>Sociogram Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.SociogramNode
	 * @generated
	 */
	public Adapter createSociogramNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Rol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Rol
	 * @generated
	 */
	public Adapter createRolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.SociogramLink <em>Sociogram Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.SociogramLink
	 * @generated
	 */
	public Adapter createSociogramLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Inheritance
	 * @generated
	 */
	public Adapter createInheritanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Acting <em>Acting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Acting
	 * @generated
	 */
	public Adapter createActingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.LearningDiagram <em>Learning Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.LearningDiagram
	 * @generated
	 */
	public Adapter createLearningDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.LearningNode <em>Learning Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.LearningNode
	 * @generated
	 */
	public Adapter createLearningNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Init <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Init
	 * @generated
	 */
	public Adapter createInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.End
	 * @generated
	 */
	public Adapter createEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.LearningActivity <em>Learning Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.LearningActivity
	 * @generated
	 */
	public Adapter createLearningActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.LeftSideLearningNode <em>Left Side Learning Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.LeftSideLearningNode
	 * @generated
	 */
	public Adapter createLeftSideLearningNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.IndividualTask <em>Individual Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.IndividualTask
	 * @generated
	 */
	public Adapter createIndividualTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.GroupTask <em>Group Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.GroupTask
	 * @generated
	 */
	public Adapter createGroupTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.AbstractTask <em>Abstract Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.AbstractTask
	 * @generated
	 */
	public Adapter createAbstractTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.DetailedAbstractTask <em>Detailed Abstract Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.DetailedAbstractTask
	 * @generated
	 */
	public Adapter createDetailedAbstractTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.TemporalCondition <em>Temporal Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.TemporalCondition
	 * @generated
	 */
	public Adapter createTemporalConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Notification
	 * @generated
	 */
	public Adapter createNotificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Subtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Subtype
	 * @generated
	 */
	public Adapter createSubtypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Assimilative <em>Assimilative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Assimilative
	 * @generated
	 */
	public Adapter createAssimilativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.InformationHandling <em>Information Handling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.InformationHandling
	 * @generated
	 */
	public Adapter createInformationHandlingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Adaptive <em>Adaptive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Adaptive
	 * @generated
	 */
	public Adapter createAdaptiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Communicative <em>Communicative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Communicative
	 * @generated
	 */
	public Adapter createCommunicativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Productive <em>Productive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Productive
	 * @generated
	 */
	public Adapter createProductiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Experiential <em>Experiential</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Experiential
	 * @generated
	 */
	public Adapter createExperientialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Evaluative <em>Evaluative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Evaluative
	 * @generated
	 */
	public Adapter createEvaluativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Support <em>Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Support
	 * @generated
	 */
	public Adapter createSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Modality <em>Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Modality
	 * @generated
	 */
	public Adapter createModalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.FaceToFace <em>Face To Face</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.FaceToFace
	 * @generated
	 */
	public Adapter createFaceToFaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.ComputerSupported <em>Computer Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.ComputerSupported
	 * @generated
	 */
	public Adapter createComputerSupportedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Online <em>Online</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Online
	 * @generated
	 */
	public Adapter createOnlineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.LearningLink <em>Learning Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.LearningLink
	 * @generated
	 */
	public Adapter createLearningLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.EnablingWOInformation <em>Enabling WO Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.EnablingWOInformation
	 * @generated
	 */
	public Adapter createEnablingWOInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.EnablingWInformation <em>Enabling WInformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.EnablingWInformation
	 * @generated
	 */
	public Adapter createEnablingWInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Concurrency <em>Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Concurrency
	 * @generated
	 */
	public Adapter createConcurrencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Tool
	 * @generated
	 */
	public Adapter createToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.GraphicalEditor <em>Graphical Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.GraphicalEditor
	 * @generated
	 */
	public Adapter createGraphicalEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.TextEditor <em>Text Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.TextEditor
	 * @generated
	 */
	public Adapter createTextEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.CodeEditor <em>Code Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.CodeEditor
	 * @generated
	 */
	public Adapter createCodeEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.WebViewer <em>Web Viewer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.WebViewer
	 * @generated
	 */
	public Adapter createWebViewerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Awareness <em>Awareness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Awareness
	 * @generated
	 */
	public Adapter createAwarenessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.SessionPanel <em>Session Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.SessionPanel
	 * @generated
	 */
	public Adapter createSessionPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Chat <em>Chat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Chat
	 * @generated
	 */
	public Adapter createChatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.TurnTakingTool <em>Turn Taking Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.TurnTakingTool
	 * @generated
	 */
	public Adapter createTurnTakingToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Telepointer <em>Telepointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Telepointer
	 * @generated
	 */
	public Adapter createTelepointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.RadarView <em>Radar View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.RadarView
	 * @generated
	 */
	public Adapter createRadarViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Properties
	 * @generated
	 */
	public Adapter createPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Console <em>Console</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Console
	 * @generated
	 */
	public Adapter createConsoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Problems <em>Problems</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Problems
	 * @generated
	 */
	public Adapter createProblemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Traceability <em>Traceability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Traceability
	 * @generated
	 */
	public Adapter createTraceabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.CTTDiagram <em>CTT Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.CTTDiagram
	 * @generated
	 */
	public Adapter createCTTDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.CTTTask <em>CTT Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.CTTTask
	 * @generated
	 */
	public Adapter createCTTTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.ExclusiveEdition <em>Exclusive Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.ExclusiveEdition
	 * @generated
	 */
	public Adapter createExclusiveEditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.CollaborativeVisualization <em>Collaborative Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.CollaborativeVisualization
	 * @generated
	 */
	public Adapter createCollaborativeVisualizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.IndividualVisualization <em>Individual Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.IndividualVisualization
	 * @generated
	 */
	public Adapter createIndividualVisualizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.UserTask <em>User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.UserTask
	 * @generated
	 */
	public Adapter createUserTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.CTTAbstractTask <em>CTT Abstract Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.CTTAbstractTask
	 * @generated
	 */
	public Adapter createCTTAbstractTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.InteractiveTask <em>Interactive Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.InteractiveTask
	 * @generated
	 */
	public Adapter createInteractiveTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.CTTCollaborativeTask <em>CTT Collaborative Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.CTTCollaborativeTask
	 * @generated
	 */
	public Adapter createCTTCollaborativeTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.ApplicationTask <em>Application Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.ApplicationTask
	 * @generated
	 */
	public Adapter createApplicationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.CTTLink <em>CTT Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.CTTLink
	 * @generated
	 */
	public Adapter createCTTLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Aggregation
	 * @generated
	 */
	public Adapter createAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Enabling <em>Enabling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Enabling
	 * @generated
	 */
	public Adapter createEnablingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.Disabling <em>Disabling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.Disabling
	 * @generated
	 */
	public Adapter createDisablingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.EnablingWithInformationPassing <em>Enabling With Information Passing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.EnablingWithInformationPassing
	 * @generated
	 */
	public Adapter createEnablingWithInformationPassingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.DisablingWithInformationPassing <em>Disabling With Information Passing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.DisablingWithInformationPassing
	 * @generated
	 */
	public Adapter createDisablingWithInformationPassingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.IndependentConcurrency <em>Independent Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.IndependentConcurrency
	 * @generated
	 */
	public Adapter createIndependentConcurrencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.OrderIndependence <em>Order Independence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.OrderIndependence
	 * @generated
	 */
	public Adapter createOrderIndependenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.SuspendResume <em>Suspend Resume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.SuspendResume
	 * @generated
	 */
	public Adapter createSuspendResumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.ConcurrencyWithInformationPassing <em>Concurrency With Information Passing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.ConcurrencyWithInformationPassing
	 * @generated
	 */
	public Adapter createConcurrencyWithInformationPassingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.DeterministicChoice <em>Deterministic Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.DeterministicChoice
	 * @generated
	 */
	public Adapter createDeterministicChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.UndeterministicChoice <em>Undeterministic Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.UndeterministicChoice
	 * @generated
	 */
	public Adapter createUndeterministicChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefNode <em>Molef Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefNode
	 * @generated
	 */
	public Adapter createMolefNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefContentNode <em>Molef Content Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefContentNode
	 * @generated
	 */
	public Adapter createMolefContentNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefLearningNode <em>Molef Learning Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefLearningNode
	 * @generated
	 */
	public Adapter createMolefLearningNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefCttNode <em>Molef Ctt Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefCttNode
	 * @generated
	 */
	public Adapter createMolefCttNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefContent1 <em>Molef Content1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefContent1
	 * @generated
	 */
	public Adapter createMolefContent1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefContent2 <em>Molef Content2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefContent2
	 * @generated
	 */
	public Adapter createMolefContent2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefContent3 <em>Molef Content3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefContent3
	 * @generated
	 */
	public Adapter createMolefContent3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefContent4 <em>Molef Content4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefContent4
	 * @generated
	 */
	public Adapter createMolefContent4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefContent5 <em>Molef Content5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefContent5
	 * @generated
	 */
	public Adapter createMolefContent5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefContent6 <em>Molef Content6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefContent6
	 * @generated
	 */
	public Adapter createMolefContent6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefTaskAndActivitiesNode <em>Molef Task And Activities Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefTaskAndActivitiesNode
	 * @generated
	 */
	public Adapter createMolefTaskAndActivitiesNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefTActivities1 <em>Molef TActivities1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefTActivities1
	 * @generated
	 */
	public Adapter createMolefTActivities1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefTActivities2 <em>Molef TActivities2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefTActivities2
	 * @generated
	 */
	public Adapter createMolefTActivities2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefTActivities3 <em>Molef TActivities3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefTActivities3
	 * @generated
	 */
	public Adapter createMolefTActivities3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefTActivities4 <em>Molef TActivities4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefTActivities4
	 * @generated
	 */
	public Adapter createMolefTActivities4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefTActivities5 <em>Molef TActivities5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefTActivities5
	 * @generated
	 */
	public Adapter createMolefTActivities5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefTActivities6 <em>Molef TActivities6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefTActivities6
	 * @generated
	 */
	public Adapter createMolefTActivities6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefTActivities7 <em>Molef TActivities7</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefTActivities7
	 * @generated
	 */
	public Adapter createMolefTActivities7Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefTActivities8 <em>Molef TActivities8</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefTActivities8
	 * @generated
	 */
	public Adapter createMolefTActivities8Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefSocialNode <em>Molef Social Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefSocialNode
	 * @generated
	 */
	public Adapter createMolefSocialNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefSocial1 <em>Molef Social1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefSocial1
	 * @generated
	 */
	public Adapter createMolefSocial1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefSocial2 <em>Molef Social2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefSocial2
	 * @generated
	 */
	public Adapter createMolefSocial2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefSocial3 <em>Molef Social3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefSocial3
	 * @generated
	 */
	public Adapter createMolefSocial3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefSocial4 <em>Molef Social4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefSocial4
	 * @generated
	 */
	public Adapter createMolefSocial4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefPersonalizationNode <em>Molef Personalization Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefPersonalizationNode
	 * @generated
	 */
	public Adapter createMolefPersonalizationNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefPersonalization1 <em>Molef Personalization1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefPersonalization1
	 * @generated
	 */
	public Adapter createMolefPersonalization1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefPersonalization2 <em>Molef Personalization2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefPersonalization2
	 * @generated
	 */
	public Adapter createMolefPersonalization2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefPersonalization3 <em>Molef Personalization3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefPersonalization3
	 * @generated
	 */
	public Adapter createMolefPersonalization3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefPersonalization4 <em>Molef Personalization4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefPersonalization4
	 * @generated
	 */
	public Adapter createMolefPersonalization4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefPersonalization5 <em>Molef Personalization5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefPersonalization5
	 * @generated
	 */
	public Adapter createMolefPersonalization5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefMultimediaNode <em>Molef Multimedia Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefMultimediaNode
	 * @generated
	 */
	public Adapter createMolefMultimediaNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefMultimedia1 <em>Molef Multimedia1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefMultimedia1
	 * @generated
	 */
	public Adapter createMolefMultimedia1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefMultimedia2 <em>Molef Multimedia2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefMultimedia2
	 * @generated
	 */
	public Adapter createMolefMultimedia2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefMultimedia3 <em>Molef Multimedia3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefMultimedia3
	 * @generated
	 */
	public Adapter createMolefMultimedia3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefMultimedia4 <em>Molef Multimedia4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefMultimedia4
	 * @generated
	 */
	public Adapter createMolefMultimedia4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefMultimedia5 <em>Molef Multimedia5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefMultimedia5
	 * @generated
	 */
	public Adapter createMolefMultimedia5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefMultimedia6 <em>Molef Multimedia6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefMultimedia6
	 * @generated
	 */
	public Adapter createMolefMultimedia6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lciat.MolefMultimedia7 <em>Molef Multimedia7</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lciat.MolefMultimedia7
	 * @generated
	 */
	public Adapter createMolefMultimedia7Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LciatAdapterFactory
