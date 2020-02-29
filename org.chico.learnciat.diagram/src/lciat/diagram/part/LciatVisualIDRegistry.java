/*
* 
*/
package lciat.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import lciat.LCIANDiagram;
import lciat.LciatPackage;
import lciat.diagram.edit.parts.*;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class LciatVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "org.chico.learnciat.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (LCIANDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return LCIANDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return lciat.diagram.part.LciatVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				LciatDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (LciatPackage.eINSTANCE.getLCIANDiagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((LCIANDiagram) domainElement)) {
			return LCIANDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = lciat.diagram.part.LciatVisualIDRegistry.getModelID(containerView);
		if (!LCIANDiagramEditPart.MODEL_ID.equals(containerModelID) && !"lciat".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (LCIANDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = lciat.diagram.part.LciatVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = LCIANDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case LCIANDiagramEditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getSociogram().isSuperTypeOf(domainElement.eClass())) {
				return SociogramEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getLearningDiagram().isSuperTypeOf(domainElement.eClass())) {
				return LearningDiagramEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getCTTDiagram().isSuperTypeOf(domainElement.eClass())) {
				return CTTDiagramEditPart.VISUAL_ID;
			}
			break;
		case IndividualTaskEditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getGraphicalEditor().isSuperTypeOf(domainElement.eClass())) {
				return GraphicalEditorEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getTextEditor().isSuperTypeOf(domainElement.eClass())) {
				return TextEditorEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getCodeEditor().isSuperTypeOf(domainElement.eClass())) {
				return CodeEditorEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getWebViewer().isSuperTypeOf(domainElement.eClass())) {
				return WebViewerEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getTool().isSuperTypeOf(domainElement.eClass())) {
				return ToolEditPart.VISUAL_ID;
			}
			break;
		case GroupTaskEditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getGraphicalEditor().isSuperTypeOf(domainElement.eClass())) {
				return GraphicalEditorEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getTextEditor().isSuperTypeOf(domainElement.eClass())) {
				return TextEditorEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getCodeEditor().isSuperTypeOf(domainElement.eClass())) {
				return CodeEditorEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getWebViewer().isSuperTypeOf(domainElement.eClass())) {
				return WebViewerEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getTool().isSuperTypeOf(domainElement.eClass())) {
				return ToolEditPart.VISUAL_ID;
			}
			break;
		case AbstractTaskEditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getGraphicalEditor().isSuperTypeOf(domainElement.eClass())) {
				return GraphicalEditorEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getTextEditor().isSuperTypeOf(domainElement.eClass())) {
				return TextEditorEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getCodeEditor().isSuperTypeOf(domainElement.eClass())) {
				return CodeEditorEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getWebViewer().isSuperTypeOf(domainElement.eClass())) {
				return WebViewerEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getTool().isSuperTypeOf(domainElement.eClass())) {
				return ToolEditPart.VISUAL_ID;
			}
			break;
		case DetailedAbstractTaskEditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getGraphicalEditor().isSuperTypeOf(domainElement.eClass())) {
				return GraphicalEditorEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getTextEditor().isSuperTypeOf(domainElement.eClass())) {
				return TextEditorEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getCodeEditor().isSuperTypeOf(domainElement.eClass())) {
				return CodeEditorEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getWebViewer().isSuperTypeOf(domainElement.eClass())) {
				return WebViewerEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getTool().isSuperTypeOf(domainElement.eClass())) {
				return ToolEditPart.VISUAL_ID;
			}
			break;
		case IndividualTask2EditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getGraphicalEditor().isSuperTypeOf(domainElement.eClass())) {
				return GraphicalEditorEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getTextEditor().isSuperTypeOf(domainElement.eClass())) {
				return TextEditorEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getCodeEditor().isSuperTypeOf(domainElement.eClass())) {
				return CodeEditorEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getWebViewer().isSuperTypeOf(domainElement.eClass())) {
				return WebViewerEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getTool().isSuperTypeOf(domainElement.eClass())) {
				return ToolEditPart.VISUAL_ID;
			}
			break;
		case GroupTask2EditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getGraphicalEditor().isSuperTypeOf(domainElement.eClass())) {
				return GraphicalEditorEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getTextEditor().isSuperTypeOf(domainElement.eClass())) {
				return TextEditorEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getCodeEditor().isSuperTypeOf(domainElement.eClass())) {
				return CodeEditorEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getWebViewer().isSuperTypeOf(domainElement.eClass())) {
				return WebViewerEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getTool().isSuperTypeOf(domainElement.eClass())) {
				return ToolEditPart.VISUAL_ID;
			}
			break;
		case AbstractTask2EditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getGraphicalEditor().isSuperTypeOf(domainElement.eClass())) {
				return GraphicalEditorEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getTextEditor().isSuperTypeOf(domainElement.eClass())) {
				return TextEditorEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getCodeEditor().isSuperTypeOf(domainElement.eClass())) {
				return CodeEditorEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getWebViewer().isSuperTypeOf(domainElement.eClass())) {
				return WebViewerEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getTool().isSuperTypeOf(domainElement.eClass())) {
				return ToolEditPart.VISUAL_ID;
			}
			break;
		case DetailedAbstractTask2EditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getGraphicalEditor().isSuperTypeOf(domainElement.eClass())) {
				return GraphicalEditorEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getTextEditor().isSuperTypeOf(domainElement.eClass())) {
				return TextEditorEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getCodeEditor().isSuperTypeOf(domainElement.eClass())) {
				return CodeEditorEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getWebViewer().isSuperTypeOf(domainElement.eClass())) {
				return WebViewerEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getTool().isSuperTypeOf(domainElement.eClass())) {
				return ToolEditPart.VISUAL_ID;
			}
			break;
		case SociogramSociogramItsSociogramNodesCompartmentEditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getRol().isSuperTypeOf(domainElement.eClass())) {
				return RolEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return GroupEditPart.VISUAL_ID;
			}
			break;
		case SociogramSociogramMfContentNodesCompartmentEditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getMolefContent1().isSuperTypeOf(domainElement.eClass())) {
				return MolefContent1EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefContent2().isSuperTypeOf(domainElement.eClass())) {
				return MolefContent2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefContent3().isSuperTypeOf(domainElement.eClass())) {
				return MolefContent3EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefContent4().isSuperTypeOf(domainElement.eClass())) {
				return MolefContent4EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefContent5().isSuperTypeOf(domainElement.eClass())) {
				return MolefContent5EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefContent6().isSuperTypeOf(domainElement.eClass())) {
				return MolefContent6EditPart.VISUAL_ID;
			}
			break;
		case LearningDiagramLearningDiagramLearningNodesCompartmentEditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getIndividualTask().isSuperTypeOf(domainElement.eClass())) {
				return IndividualTaskEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getGroupTask().isSuperTypeOf(domainElement.eClass())) {
				return GroupTaskEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getAbstractTask().isSuperTypeOf(domainElement.eClass())) {
				return AbstractTaskEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getDetailedAbstractTask().isSuperTypeOf(domainElement.eClass())) {
				return DetailedAbstractTaskEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getSessionPanel().isSuperTypeOf(domainElement.eClass())) {
				return SessionPanel2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getChat().isSuperTypeOf(domainElement.eClass())) {
				return Chat2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getTurnTakingTool().isSuperTypeOf(domainElement.eClass())) {
				return TurnTakingTool2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getTelepointer().isSuperTypeOf(domainElement.eClass())) {
				return Telepointer2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getRadarView().isSuperTypeOf(domainElement.eClass())) {
				return RadarView2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getProperties().isSuperTypeOf(domainElement.eClass())) {
				return Properties2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getConsole().isSuperTypeOf(domainElement.eClass())) {
				return Console2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getProblems().isSuperTypeOf(domainElement.eClass())) {
				return Problems2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getInit().isSuperTypeOf(domainElement.eClass())) {
				return Init2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getEnd().isSuperTypeOf(domainElement.eClass())) {
				return End2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getTemporalCondition().isSuperTypeOf(domainElement.eClass())) {
				return TemporalCondition2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getNotification().isSuperTypeOf(domainElement.eClass())) {
				return Notification2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getCondition().isSuperTypeOf(domainElement.eClass())) {
				return Condition2EditPart.VISUAL_ID;
			}
			break;
		case LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getMolefTActivities1().isSuperTypeOf(domainElement.eClass())) {
				return MolefTActivities1EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefTActivities2().isSuperTypeOf(domainElement.eClass())) {
				return MolefTActivities2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefTActivities3().isSuperTypeOf(domainElement.eClass())) {
				return MolefTActivities3EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefTActivities4().isSuperTypeOf(domainElement.eClass())) {
				return MolefTActivities4EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefTActivities5().isSuperTypeOf(domainElement.eClass())) {
				return MolefTActivities5EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefTActivities6().isSuperTypeOf(domainElement.eClass())) {
				return MolefTActivities6EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefTActivities7().isSuperTypeOf(domainElement.eClass())) {
				return MolefTActivities7EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefTActivities8().isSuperTypeOf(domainElement.eClass())) {
				return MolefTActivities8EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefSocial1().isSuperTypeOf(domainElement.eClass())) {
				return MolefSocial1EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefSocial2().isSuperTypeOf(domainElement.eClass())) {
				return MolefSocial2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefSocial3().isSuperTypeOf(domainElement.eClass())) {
				return MolefSocial3EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefSocial4().isSuperTypeOf(domainElement.eClass())) {
				return MolefSocial4EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefPersonalization1().isSuperTypeOf(domainElement.eClass())) {
				return MolefPersonalization1EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefPersonalization2().isSuperTypeOf(domainElement.eClass())) {
				return MolefPersonalization2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefPersonalization3().isSuperTypeOf(domainElement.eClass())) {
				return MolefPersonalization3EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefPersonalization4().isSuperTypeOf(domainElement.eClass())) {
				return MolefPersonalization4EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefPersonalization5().isSuperTypeOf(domainElement.eClass())) {
				return MolefPersonalization5EditPart.VISUAL_ID;
			}
			break;
		case IndividualTaskIndividualTaskTaskRolesCompartmentEditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getRol().isSuperTypeOf(domainElement.eClass())) {
				return Rol2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group2EditPart.VISUAL_ID;
			}
			break;
		case IndividualTaskIndividualTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getObject().isSuperTypeOf(domainElement.eClass())) {
				return ObjectEditPart.VISUAL_ID;
			}
			break;
		case IndividualTaskIndividualTaskSubtypeCompartmentEditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getAssimilative().isSuperTypeOf(domainElement.eClass())) {
				return AssimilativeEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getInformationHandling().isSuperTypeOf(domainElement.eClass())) {
				return InformationHandlingEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getAdaptive().isSuperTypeOf(domainElement.eClass())) {
				return AdaptiveEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getCommunicative().isSuperTypeOf(domainElement.eClass())) {
				return CommunicativeEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getProductive().isSuperTypeOf(domainElement.eClass())) {
				return ProductiveEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getExperiential().isSuperTypeOf(domainElement.eClass())) {
				return ExperientialEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getEvaluative().isSuperTypeOf(domainElement.eClass())) {
				return EvaluativeEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getSupport().isSuperTypeOf(domainElement.eClass())) {
				return SupportEditPart.VISUAL_ID;
			}
			break;
		case IndividualTaskIndividualTaskModalityCompartmentEditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getFaceToFace().isSuperTypeOf(domainElement.eClass())) {
				return FaceToFaceEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getComputerSupported().isSuperTypeOf(domainElement.eClass())) {
				return ComputerSupportedEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getOnline().isSuperTypeOf(domainElement.eClass())) {
				return OnlineEditPart.VISUAL_ID;
			}
			break;
		case GroupTaskGroupTaskTaskRolesCompartmentEditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getRol().isSuperTypeOf(domainElement.eClass())) {
				return Rol3EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group3EditPart.VISUAL_ID;
			}
			break;
		case GroupTaskGroupTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getObject().isSuperTypeOf(domainElement.eClass())) {
				return Object2EditPart.VISUAL_ID;
			}
			break;
		case GroupTaskGroupTaskSubtypeCompartmentEditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getAssimilative().isSuperTypeOf(domainElement.eClass())) {
				return Assimilative2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getInformationHandling().isSuperTypeOf(domainElement.eClass())) {
				return InformationHandling2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getAdaptive().isSuperTypeOf(domainElement.eClass())) {
				return Adaptive2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getCommunicative().isSuperTypeOf(domainElement.eClass())) {
				return Communicative2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getProductive().isSuperTypeOf(domainElement.eClass())) {
				return Productive2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getExperiential().isSuperTypeOf(domainElement.eClass())) {
				return Experiential2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getEvaluative().isSuperTypeOf(domainElement.eClass())) {
				return Evaluative2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getSupport().isSuperTypeOf(domainElement.eClass())) {
				return Support2EditPart.VISUAL_ID;
			}
			break;
		case GroupTaskGroupTaskModalityCompartmentEditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getFaceToFace().isSuperTypeOf(domainElement.eClass())) {
				return FaceToFace2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getComputerSupported().isSuperTypeOf(domainElement.eClass())) {
				return ComputerSupported2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getOnline().isSuperTypeOf(domainElement.eClass())) {
				return Online2EditPart.VISUAL_ID;
			}
			break;
		case AbstractTaskAbstractTaskTaskRolesCompartmentEditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getRol().isSuperTypeOf(domainElement.eClass())) {
				return Rol4EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group4EditPart.VISUAL_ID;
			}
			break;
		case AbstractTaskAbstractTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getObject().isSuperTypeOf(domainElement.eClass())) {
				return Object3EditPart.VISUAL_ID;
			}
			break;
		case AbstractTaskAbstractTaskSubtypeCompartmentEditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getAssimilative().isSuperTypeOf(domainElement.eClass())) {
				return Assimilative3EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getInformationHandling().isSuperTypeOf(domainElement.eClass())) {
				return InformationHandling3EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getAdaptive().isSuperTypeOf(domainElement.eClass())) {
				return Adaptive3EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getCommunicative().isSuperTypeOf(domainElement.eClass())) {
				return Communicative3EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getProductive().isSuperTypeOf(domainElement.eClass())) {
				return Productive3EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getExperiential().isSuperTypeOf(domainElement.eClass())) {
				return Experiential3EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getEvaluative().isSuperTypeOf(domainElement.eClass())) {
				return Evaluative3EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getSupport().isSuperTypeOf(domainElement.eClass())) {
				return Support3EditPart.VISUAL_ID;
			}
			break;
		case AbstractTaskAbstractTaskModalityCompartmentEditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getFaceToFace().isSuperTypeOf(domainElement.eClass())) {
				return FaceToFace3EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getComputerSupported().isSuperTypeOf(domainElement.eClass())) {
				return ComputerSupported3EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getOnline().isSuperTypeOf(domainElement.eClass())) {
				return Online3EditPart.VISUAL_ID;
			}
			break;
		case DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getIndividualTask().isSuperTypeOf(domainElement.eClass())) {
				return IndividualTask2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getGroupTask().isSuperTypeOf(domainElement.eClass())) {
				return GroupTask2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getAbstractTask().isSuperTypeOf(domainElement.eClass())) {
				return AbstractTask2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getDetailedAbstractTask().isSuperTypeOf(domainElement.eClass())) {
				return DetailedAbstractTask2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getSessionPanel().isSuperTypeOf(domainElement.eClass())) {
				return SessionPanelEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getChat().isSuperTypeOf(domainElement.eClass())) {
				return ChatEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getTurnTakingTool().isSuperTypeOf(domainElement.eClass())) {
				return TurnTakingToolEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getTelepointer().isSuperTypeOf(domainElement.eClass())) {
				return TelepointerEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getRadarView().isSuperTypeOf(domainElement.eClass())) {
				return RadarViewEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getProperties().isSuperTypeOf(domainElement.eClass())) {
				return PropertiesEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getConsole().isSuperTypeOf(domainElement.eClass())) {
				return ConsoleEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getProblems().isSuperTypeOf(domainElement.eClass())) {
				return ProblemsEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getInit().isSuperTypeOf(domainElement.eClass())) {
				return InitEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getEnd().isSuperTypeOf(domainElement.eClass())) {
				return EndEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getTemporalCondition().isSuperTypeOf(domainElement.eClass())) {
				return TemporalConditionEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getNotification().isSuperTypeOf(domainElement.eClass())) {
				return NotificationEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getCondition().isSuperTypeOf(domainElement.eClass())) {
				return ConditionEditPart.VISUAL_ID;
			}
			break;
		case IndividualTaskIndividualTaskTaskRolesCompartment2EditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getRol().isSuperTypeOf(domainElement.eClass())) {
				return Rol2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group2EditPart.VISUAL_ID;
			}
			break;
		case IndividualTaskIndividualTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getObject().isSuperTypeOf(domainElement.eClass())) {
				return ObjectEditPart.VISUAL_ID;
			}
			break;
		case IndividualTaskIndividualTaskSubtypeCompartment2EditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getAssimilative().isSuperTypeOf(domainElement.eClass())) {
				return AssimilativeEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getInformationHandling().isSuperTypeOf(domainElement.eClass())) {
				return InformationHandlingEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getAdaptive().isSuperTypeOf(domainElement.eClass())) {
				return AdaptiveEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getCommunicative().isSuperTypeOf(domainElement.eClass())) {
				return CommunicativeEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getProductive().isSuperTypeOf(domainElement.eClass())) {
				return ProductiveEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getExperiential().isSuperTypeOf(domainElement.eClass())) {
				return ExperientialEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getEvaluative().isSuperTypeOf(domainElement.eClass())) {
				return EvaluativeEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getSupport().isSuperTypeOf(domainElement.eClass())) {
				return SupportEditPart.VISUAL_ID;
			}
			break;
		case IndividualTaskIndividualTaskModalityCompartment2EditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getFaceToFace().isSuperTypeOf(domainElement.eClass())) {
				return FaceToFaceEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getComputerSupported().isSuperTypeOf(domainElement.eClass())) {
				return ComputerSupportedEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getOnline().isSuperTypeOf(domainElement.eClass())) {
				return OnlineEditPart.VISUAL_ID;
			}
			break;
		case GroupTaskGroupTaskTaskRolesCompartment2EditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getRol().isSuperTypeOf(domainElement.eClass())) {
				return Rol3EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group3EditPart.VISUAL_ID;
			}
			break;
		case GroupTaskGroupTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getObject().isSuperTypeOf(domainElement.eClass())) {
				return Object2EditPart.VISUAL_ID;
			}
			break;
		case GroupTaskGroupTaskSubtypeCompartment2EditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getAssimilative().isSuperTypeOf(domainElement.eClass())) {
				return Assimilative2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getInformationHandling().isSuperTypeOf(domainElement.eClass())) {
				return InformationHandling2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getAdaptive().isSuperTypeOf(domainElement.eClass())) {
				return Adaptive2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getCommunicative().isSuperTypeOf(domainElement.eClass())) {
				return Communicative2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getProductive().isSuperTypeOf(domainElement.eClass())) {
				return Productive2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getExperiential().isSuperTypeOf(domainElement.eClass())) {
				return Experiential2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getEvaluative().isSuperTypeOf(domainElement.eClass())) {
				return Evaluative2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getSupport().isSuperTypeOf(domainElement.eClass())) {
				return Support2EditPart.VISUAL_ID;
			}
			break;
		case GroupTaskGroupTaskModalityCompartment2EditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getFaceToFace().isSuperTypeOf(domainElement.eClass())) {
				return FaceToFace2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getComputerSupported().isSuperTypeOf(domainElement.eClass())) {
				return ComputerSupported2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getOnline().isSuperTypeOf(domainElement.eClass())) {
				return Online2EditPart.VISUAL_ID;
			}
			break;
		case AbstractTaskAbstractTaskTaskRolesCompartment2EditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getRol().isSuperTypeOf(domainElement.eClass())) {
				return Rol4EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group4EditPart.VISUAL_ID;
			}
			break;
		case AbstractTaskAbstractTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getObject().isSuperTypeOf(domainElement.eClass())) {
				return Object3EditPart.VISUAL_ID;
			}
			break;
		case AbstractTaskAbstractTaskSubtypeCompartment2EditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getAssimilative().isSuperTypeOf(domainElement.eClass())) {
				return Assimilative3EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getInformationHandling().isSuperTypeOf(domainElement.eClass())) {
				return InformationHandling3EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getAdaptive().isSuperTypeOf(domainElement.eClass())) {
				return Adaptive3EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getCommunicative().isSuperTypeOf(domainElement.eClass())) {
				return Communicative3EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getProductive().isSuperTypeOf(domainElement.eClass())) {
				return Productive3EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getExperiential().isSuperTypeOf(domainElement.eClass())) {
				return Experiential3EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getEvaluative().isSuperTypeOf(domainElement.eClass())) {
				return Evaluative3EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getSupport().isSuperTypeOf(domainElement.eClass())) {
				return Support3EditPart.VISUAL_ID;
			}
			break;
		case AbstractTaskAbstractTaskModalityCompartment2EditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getFaceToFace().isSuperTypeOf(domainElement.eClass())) {
				return FaceToFace3EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getComputerSupported().isSuperTypeOf(domainElement.eClass())) {
				return ComputerSupported3EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getOnline().isSuperTypeOf(domainElement.eClass())) {
				return Online3EditPart.VISUAL_ID;
			}
			break;
		case DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment2EditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getIndividualTask().isSuperTypeOf(domainElement.eClass())) {
				return IndividualTask2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getGroupTask().isSuperTypeOf(domainElement.eClass())) {
				return GroupTask2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getAbstractTask().isSuperTypeOf(domainElement.eClass())) {
				return AbstractTask2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getDetailedAbstractTask().isSuperTypeOf(domainElement.eClass())) {
				return DetailedAbstractTask2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getSessionPanel().isSuperTypeOf(domainElement.eClass())) {
				return SessionPanelEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getChat().isSuperTypeOf(domainElement.eClass())) {
				return ChatEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getTurnTakingTool().isSuperTypeOf(domainElement.eClass())) {
				return TurnTakingToolEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getTelepointer().isSuperTypeOf(domainElement.eClass())) {
				return TelepointerEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getRadarView().isSuperTypeOf(domainElement.eClass())) {
				return RadarViewEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getProperties().isSuperTypeOf(domainElement.eClass())) {
				return PropertiesEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getConsole().isSuperTypeOf(domainElement.eClass())) {
				return ConsoleEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getProblems().isSuperTypeOf(domainElement.eClass())) {
				return ProblemsEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getInit().isSuperTypeOf(domainElement.eClass())) {
				return InitEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getEnd().isSuperTypeOf(domainElement.eClass())) {
				return EndEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getTemporalCondition().isSuperTypeOf(domainElement.eClass())) {
				return TemporalConditionEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getNotification().isSuperTypeOf(domainElement.eClass())) {
				return NotificationEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getCondition().isSuperTypeOf(domainElement.eClass())) {
				return ConditionEditPart.VISUAL_ID;
			}
			break;
		case CTTDiagramCTTDiagramCttTasksCompartmentEditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getExclusiveEdition().isSuperTypeOf(domainElement.eClass())) {
				return ExclusiveEditionEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getCollaborativeVisualization().isSuperTypeOf(domainElement.eClass())) {
				return CollaborativeVisualizationEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getIndividualVisualization().isSuperTypeOf(domainElement.eClass())) {
				return IndividualVisualizationEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getUserTask().isSuperTypeOf(domainElement.eClass())) {
				return UserTaskEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getCTTAbstractTask().isSuperTypeOf(domainElement.eClass())) {
				return CTTAbstractTaskEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getInteractiveTask().isSuperTypeOf(domainElement.eClass())) {
				return InteractiveTaskEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getCTTCollaborativeTask().isSuperTypeOf(domainElement.eClass())) {
				return CTTCollaborativeTaskEditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getApplicationTask().isSuperTypeOf(domainElement.eClass())) {
				return ApplicationTaskEditPart.VISUAL_ID;
			}
			break;
		case CTTDiagramCTTDiagramMfCttNodesCompartmentEditPart.VISUAL_ID:
			if (LciatPackage.eINSTANCE.getMolefMultimedia1().isSuperTypeOf(domainElement.eClass())) {
				return MolefMultimedia1EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefMultimedia2().isSuperTypeOf(domainElement.eClass())) {
				return MolefMultimedia2EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefMultimedia3().isSuperTypeOf(domainElement.eClass())) {
				return MolefMultimedia3EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefMultimedia4().isSuperTypeOf(domainElement.eClass())) {
				return MolefMultimedia4EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefMultimedia5().isSuperTypeOf(domainElement.eClass())) {
				return MolefMultimedia5EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefMultimedia6().isSuperTypeOf(domainElement.eClass())) {
				return MolefMultimedia6EditPart.VISUAL_ID;
			}
			if (LciatPackage.eINSTANCE.getMolefMultimedia7().isSuperTypeOf(domainElement.eClass())) {
				return MolefMultimedia7EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = lciat.diagram.part.LciatVisualIDRegistry.getModelID(containerView);
		if (!LCIANDiagramEditPart.MODEL_ID.equals(containerModelID) && !"lciat".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (LCIANDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = lciat.diagram.part.LciatVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = LCIANDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case LCIANDiagramEditPart.VISUAL_ID:
			if (SociogramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LearningDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CTTDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SociogramEditPart.VISUAL_ID:
			if (SociogramNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SociogramSociogramItsSociogramNodesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SociogramSociogramMfContentNodesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LearningDiagramEditPart.VISUAL_ID:
			if (LearningDiagramNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LearningDiagramLearningDiagramLearningNodesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CTTDiagramEditPart.VISUAL_ID:
			if (CTTDiagramNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CTTDiagramCTTDiagramCttTasksCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CTTDiagramCTTDiagramMfCttNodesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RolEditPart.VISUAL_ID:
			if (RolNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupEditPart.VISUAL_ID:
			if (GroupNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefContent1EditPart.VISUAL_ID:
			if (MolefContent1CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefContent2EditPart.VISUAL_ID:
			if (MolefContent2CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefContent3EditPart.VISUAL_ID:
			if (MolefContent3CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefContent4EditPart.VISUAL_ID:
			if (MolefContent4CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefContent5EditPart.VISUAL_ID:
			if (MolefContent5CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefContent6EditPart.VISUAL_ID:
			if (MolefContent6CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefTActivities1EditPart.VISUAL_ID:
			if (MolefTActivities1CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefTActivities2EditPart.VISUAL_ID:
			if (MolefTActivities2CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefTActivities3EditPart.VISUAL_ID:
			if (MolefTActivities3CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefTActivities4EditPart.VISUAL_ID:
			if (MolefTActivities4CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefTActivities5EditPart.VISUAL_ID:
			if (MolefTActivities5CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefTActivities6EditPart.VISUAL_ID:
			if (MolefTActivities6CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefTActivities7EditPart.VISUAL_ID:
			if (MolefTActivities7CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefTActivities8EditPart.VISUAL_ID:
			if (MolefTActivities8CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefSocial1EditPart.VISUAL_ID:
			if (MolefSocial1CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefSocial2EditPart.VISUAL_ID:
			if (MolefSocial2CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefSocial3EditPart.VISUAL_ID:
			if (MolefSocial3CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefSocial4EditPart.VISUAL_ID:
			if (MolefSocial4CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefPersonalization1EditPart.VISUAL_ID:
			if (MolefPersonalization1CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefPersonalization2EditPart.VISUAL_ID:
			if (MolefPersonalization2CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefPersonalization3EditPart.VISUAL_ID:
			if (MolefPersonalization3CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefPersonalization4EditPart.VISUAL_ID:
			if (MolefPersonalization4CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefPersonalization5EditPart.VISUAL_ID:
			if (MolefPersonalization5CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualTaskEditPart.VISUAL_ID:
			if (IndividualTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndividualTaskIndividualTaskTaskRolesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndividualTaskIndividualTaskTaskObjectsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndividualTaskIndividualTaskSubtypeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndividualTaskIndividualTaskModalityCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GraphicalEditorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextEditorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CodeEditorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebViewerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ToolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Rol2EditPart.VISUAL_ID:
			if (RolName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Group2EditPart.VISUAL_ID:
			if (GroupName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GraphicalEditorEditPart.VISUAL_ID:
			if (GraphicalEditorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TextEditorEditPart.VISUAL_ID:
			if (TextEditorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CodeEditorEditPart.VISUAL_ID:
			if (CodeEditorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebViewerEditPart.VISUAL_ID:
			if (WebViewerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssimilativeEditPart.VISUAL_ID:
			if (AssimilativeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InformationHandlingEditPart.VISUAL_ID:
			if (InformationHandlingNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdaptiveEditPart.VISUAL_ID:
			if (AdaptiveNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CommunicativeEditPart.VISUAL_ID:
			if (CommunicativeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProductiveEditPart.VISUAL_ID:
			if (ProductiveNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExperientialEditPart.VISUAL_ID:
			if (ExperientialNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EvaluativeEditPart.VISUAL_ID:
			if (EvaluativeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SupportEditPart.VISUAL_ID:
			if (SupportNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FaceToFaceEditPart.VISUAL_ID:
			if (FaceToFaceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComputerSupportedEditPart.VISUAL_ID:
			if (ComputerSupportedNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OnlineEditPart.VISUAL_ID:
			if (OnlineNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ToolEditPart.VISUAL_ID:
			if (ToolKindEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ObjectEditPart.VISUAL_ID:
			if (ObjectNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupTaskEditPart.VISUAL_ID:
			if (GroupTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupTaskGroupTaskTaskRolesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupTaskGroupTaskTaskObjectsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupTaskGroupTaskSubtypeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupTaskGroupTaskModalityCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GraphicalEditorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextEditorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CodeEditorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebViewerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ToolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Rol3EditPart.VISUAL_ID:
			if (RolName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Group3EditPart.VISUAL_ID:
			if (GroupName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Assimilative2EditPart.VISUAL_ID:
			if (AssimilativeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InformationHandling2EditPart.VISUAL_ID:
			if (InformationHandlingName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Adaptive2EditPart.VISUAL_ID:
			if (AdaptiveName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Communicative2EditPart.VISUAL_ID:
			if (CommunicativeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Productive2EditPart.VISUAL_ID:
			if (ProductiveName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Experiential2EditPart.VISUAL_ID:
			if (ExperientialName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Evaluative2EditPart.VISUAL_ID:
			if (EvaluativeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Support2EditPart.VISUAL_ID:
			if (SupportName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FaceToFace2EditPart.VISUAL_ID:
			if (FaceToFaceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComputerSupported2EditPart.VISUAL_ID:
			if (ComputerSupportedName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Online2EditPart.VISUAL_ID:
			if (OnlineName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Object2EditPart.VISUAL_ID:
			if (ObjectName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AbstractTaskEditPart.VISUAL_ID:
			if (AbstractTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AbstractTaskAbstractTaskTaskRolesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AbstractTaskAbstractTaskTaskObjectsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AbstractTaskAbstractTaskSubtypeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AbstractTaskAbstractTaskModalityCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GraphicalEditorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextEditorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CodeEditorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebViewerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ToolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Rol4EditPart.VISUAL_ID:
			if (RolName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Group4EditPart.VISUAL_ID:
			if (GroupName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Assimilative3EditPart.VISUAL_ID:
			if (AssimilativeName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InformationHandling3EditPart.VISUAL_ID:
			if (InformationHandlingName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Adaptive3EditPart.VISUAL_ID:
			if (AdaptiveName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Communicative3EditPart.VISUAL_ID:
			if (CommunicativeName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Productive3EditPart.VISUAL_ID:
			if (ProductiveName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Experiential3EditPart.VISUAL_ID:
			if (ExperientialName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Evaluative3EditPart.VISUAL_ID:
			if (EvaluativeName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Support3EditPart.VISUAL_ID:
			if (SupportName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FaceToFace3EditPart.VISUAL_ID:
			if (FaceToFaceName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComputerSupported3EditPart.VISUAL_ID:
			if (ComputerSupportedName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Online3EditPart.VISUAL_ID:
			if (OnlineName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Object3EditPart.VISUAL_ID:
			if (ObjectName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DetailedAbstractTaskEditPart.VISUAL_ID:
			if (DetailedAbstractTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GraphicalEditorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextEditorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CodeEditorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebViewerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ToolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualTask2EditPart.VISUAL_ID:
			if (IndividualTaskName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndividualTaskIndividualTaskTaskRolesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndividualTaskIndividualTaskTaskObjectsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndividualTaskIndividualTaskSubtypeCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndividualTaskIndividualTaskModalityCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GraphicalEditorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextEditorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CodeEditorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebViewerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ToolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupTask2EditPart.VISUAL_ID:
			if (GroupTaskName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupTaskGroupTaskTaskRolesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupTaskGroupTaskTaskObjectsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupTaskGroupTaskSubtypeCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupTaskGroupTaskModalityCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GraphicalEditorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextEditorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CodeEditorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebViewerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ToolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AbstractTask2EditPart.VISUAL_ID:
			if (AbstractTaskName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AbstractTaskAbstractTaskTaskRolesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AbstractTaskAbstractTaskTaskObjectsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AbstractTaskAbstractTaskSubtypeCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AbstractTaskAbstractTaskModalityCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GraphicalEditorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextEditorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CodeEditorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebViewerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ToolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DetailedAbstractTask2EditPart.VISUAL_ID:
			if (DetailedAbstractTaskName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GraphicalEditorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextEditorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CodeEditorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebViewerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ToolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SessionPanelEditPart.VISUAL_ID:
			if (SessionPanelNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ChatEditPart.VISUAL_ID:
			if (ChatNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TurnTakingToolEditPart.VISUAL_ID:
			if (TurnTakingToolNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TelepointerEditPart.VISUAL_ID:
			if (TelepointerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RadarViewEditPart.VISUAL_ID:
			if (RadarViewNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PropertiesEditPart.VISUAL_ID:
			if (PropertiesNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConsoleEditPart.VISUAL_ID:
			if (ConsoleNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProblemsEditPart.VISUAL_ID:
			if (ProblemsNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InitEditPart.VISUAL_ID:
			if (InitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EndEditPart.VISUAL_ID:
			if (EndNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TemporalConditionEditPart.VISUAL_ID:
			if (TemporalConditionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NotificationEditPart.VISUAL_ID:
			if (NotificationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionEditPart.VISUAL_ID:
			if (ConditionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SessionPanel2EditPart.VISUAL_ID:
			if (SessionPanelName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Chat2EditPart.VISUAL_ID:
			if (ChatName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TurnTakingTool2EditPart.VISUAL_ID:
			if (TurnTakingToolName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Telepointer2EditPart.VISUAL_ID:
			if (TelepointerName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RadarView2EditPart.VISUAL_ID:
			if (RadarViewName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Properties2EditPart.VISUAL_ID:
			if (PropertiesName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Console2EditPart.VISUAL_ID:
			if (ConsoleName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Problems2EditPart.VISUAL_ID:
			if (ProblemsName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Init2EditPart.VISUAL_ID:
			if (InitName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case End2EditPart.VISUAL_ID:
			if (EndName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TemporalCondition2EditPart.VISUAL_ID:
			if (TemporalConditionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Notification2EditPart.VISUAL_ID:
			if (NotificationName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Condition2EditPart.VISUAL_ID:
			if (ConditionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefMultimedia1EditPart.VISUAL_ID:
			if (MolefMultimedia1CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefMultimedia2EditPart.VISUAL_ID:
			if (MolefMultimedia2CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefMultimedia3EditPart.VISUAL_ID:
			if (MolefMultimedia3CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefMultimedia4EditPart.VISUAL_ID:
			if (MolefMultimedia4CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefMultimedia5EditPart.VISUAL_ID:
			if (MolefMultimedia5CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefMultimedia6EditPart.VISUAL_ID:
			if (MolefMultimedia6CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MolefMultimedia7EditPart.VISUAL_ID:
			if (MolefMultimedia7CharacteristicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExclusiveEditionEditPart.VISUAL_ID:
			if (ExclusiveEditionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CollaborativeVisualizationEditPart.VISUAL_ID:
			if (CollaborativeVisualizationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualVisualizationEditPart.VISUAL_ID:
			if (IndividualVisualizationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserTaskEditPart.VISUAL_ID:
			if (UserTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CTTAbstractTaskEditPart.VISUAL_ID:
			if (CTTAbstractTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InteractiveTaskEditPart.VISUAL_ID:
			if (InteractiveTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CTTCollaborativeTaskEditPart.VISUAL_ID:
			if (CTTCollaborativeTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ApplicationTaskEditPart.VISUAL_ID:
			if (ApplicationTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SociogramSociogramItsSociogramNodesCompartmentEditPart.VISUAL_ID:
			if (RolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SociogramSociogramMfContentNodesCompartmentEditPart.VISUAL_ID:
			if (MolefContent1EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefContent2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefContent3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefContent4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefContent5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefContent6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LearningDiagramLearningDiagramLearningNodesCompartmentEditPart.VISUAL_ID:
			if (IndividualTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AbstractTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DetailedAbstractTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SessionPanel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Chat2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TurnTakingTool2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Telepointer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadarView2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Properties2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Console2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Problems2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Init2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (End2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TemporalCondition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Notification2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Condition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart.VISUAL_ID:
			if (MolefTActivities1EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefTActivities2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefTActivities3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefTActivities4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefTActivities5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefTActivities6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefTActivities7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefTActivities8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefSocial1EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefSocial2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefSocial3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefSocial4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefPersonalization1EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefPersonalization2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefPersonalization3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefPersonalization4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefPersonalization5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualTaskIndividualTaskTaskRolesCompartmentEditPart.VISUAL_ID:
			if (Rol2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualTaskIndividualTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
			if (ObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualTaskIndividualTaskSubtypeCompartmentEditPart.VISUAL_ID:
			if (AssimilativeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InformationHandlingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdaptiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CommunicativeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProductiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExperientialEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EvaluativeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SupportEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualTaskIndividualTaskModalityCompartmentEditPart.VISUAL_ID:
			if (FaceToFaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComputerSupportedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnlineEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupTaskGroupTaskTaskRolesCompartmentEditPart.VISUAL_ID:
			if (Rol3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Group3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupTaskGroupTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
			if (Object2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupTaskGroupTaskSubtypeCompartmentEditPart.VISUAL_ID:
			if (Assimilative2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InformationHandling2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Adaptive2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Communicative2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Productive2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Experiential2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Evaluative2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Support2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupTaskGroupTaskModalityCompartmentEditPart.VISUAL_ID:
			if (FaceToFace2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComputerSupported2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Online2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AbstractTaskAbstractTaskTaskRolesCompartmentEditPart.VISUAL_ID:
			if (Rol4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Group4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AbstractTaskAbstractTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
			if (Object3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AbstractTaskAbstractTaskSubtypeCompartmentEditPart.VISUAL_ID:
			if (Assimilative3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InformationHandling3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Adaptive3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Communicative3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Productive3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Experiential3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Evaluative3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Support3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AbstractTaskAbstractTaskModalityCompartmentEditPart.VISUAL_ID:
			if (FaceToFace3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComputerSupported3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Online3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart.VISUAL_ID:
			if (IndividualTask2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupTask2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AbstractTask2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DetailedAbstractTask2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SessionPanelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ChatEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TurnTakingToolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TelepointerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadarViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertiesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConsoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProblemsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EndEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TemporalConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotificationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualTaskIndividualTaskTaskRolesCompartment2EditPart.VISUAL_ID:
			if (Rol2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualTaskIndividualTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
			if (ObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualTaskIndividualTaskSubtypeCompartment2EditPart.VISUAL_ID:
			if (AssimilativeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InformationHandlingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdaptiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CommunicativeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProductiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExperientialEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EvaluativeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SupportEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualTaskIndividualTaskModalityCompartment2EditPart.VISUAL_ID:
			if (FaceToFaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComputerSupportedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OnlineEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupTaskGroupTaskTaskRolesCompartment2EditPart.VISUAL_ID:
			if (Rol3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Group3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupTaskGroupTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
			if (Object2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupTaskGroupTaskSubtypeCompartment2EditPart.VISUAL_ID:
			if (Assimilative2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InformationHandling2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Adaptive2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Communicative2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Productive2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Experiential2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Evaluative2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Support2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupTaskGroupTaskModalityCompartment2EditPart.VISUAL_ID:
			if (FaceToFace2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComputerSupported2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Online2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AbstractTaskAbstractTaskTaskRolesCompartment2EditPart.VISUAL_ID:
			if (Rol4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Group4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AbstractTaskAbstractTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
			if (Object3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AbstractTaskAbstractTaskSubtypeCompartment2EditPart.VISUAL_ID:
			if (Assimilative3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InformationHandling3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Adaptive3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Communicative3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Productive3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Experiential3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Evaluative3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Support3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AbstractTaskAbstractTaskModalityCompartment2EditPart.VISUAL_ID:
			if (FaceToFace3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComputerSupported3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Online3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment2EditPart.VISUAL_ID:
			if (IndividualTask2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupTask2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AbstractTask2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DetailedAbstractTask2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SessionPanelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ChatEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TurnTakingToolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TelepointerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadarViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertiesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConsoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProblemsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EndEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TemporalConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotificationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CTTDiagramCTTDiagramCttTasksCompartmentEditPart.VISUAL_ID:
			if (ExclusiveEditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CollaborativeVisualizationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndividualVisualizationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UserTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CTTAbstractTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InteractiveTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CTTCollaborativeTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ApplicationTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CTTDiagramCTTDiagramMfCttNodesCompartmentEditPart.VISUAL_ID:
			if (MolefMultimedia1EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefMultimedia2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefMultimedia3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefMultimedia4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefMultimedia5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefMultimedia6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MolefMultimedia7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InheritanceEditPart.VISUAL_ID:
			if (InheritanceConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActingEditPart.VISUAL_ID:
			if (ActingNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociationEditPart.VISUAL_ID:
			if (AssociationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnablingWOInformationEditPart.VISUAL_ID:
			if (EnablingWOInformationELabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnablingWInformationEditPart.VISUAL_ID:
			if (EnablingWInformationEwLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ChoiceEditPart.VISUAL_ID:
			if (ChoiceDtLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConcurrencyEditPart.VISUAL_ID:
			if (ConcurrencyIcLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnablingEditPart.VISUAL_ID:
			if (EnablingELabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DisablingEditPart.VISUAL_ID:
			if (DisablingDLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnablingWithInformationPassingEditPart.VISUAL_ID:
			if (EnablingWithInformationPassingEwLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DisablingWithInformationPassingEditPart.VISUAL_ID:
			if (DisablingWithInformationPassingDwLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndependentConcurrencyEditPart.VISUAL_ID:
			if (IndependentConcurrencyIcLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OrderIndependenceEditPart.VISUAL_ID:
			if (OrderIndependenceOiLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SuspendResumeEditPart.VISUAL_ID:
			if (SuspendResumeSrLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConcurrencyWithInformationPassingEditPart.VISUAL_ID:
			if (ConcurrencyWithInformationPassingCLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeterministicChoiceEditPart.VISUAL_ID:
			if (DeterministicChoiceDtLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UndeterministicChoiceEditPart.VISUAL_ID:
			if (UndeterministicChoiceUcLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (LciatPackage.eINSTANCE.getInheritance().isSuperTypeOf(domainElement.eClass())) {
			return InheritanceEditPart.VISUAL_ID;
		}
		if (LciatPackage.eINSTANCE.getActing().isSuperTypeOf(domainElement.eClass())) {
			return ActingEditPart.VISUAL_ID;
		}
		if (LciatPackage.eINSTANCE.getAssociation().isSuperTypeOf(domainElement.eClass())) {
			return AssociationEditPart.VISUAL_ID;
		}
		if (LciatPackage.eINSTANCE.getEnablingWOInformation().isSuperTypeOf(domainElement.eClass())) {
			return EnablingWOInformationEditPart.VISUAL_ID;
		}
		if (LciatPackage.eINSTANCE.getEnablingWInformation().isSuperTypeOf(domainElement.eClass())) {
			return EnablingWInformationEditPart.VISUAL_ID;
		}
		if (LciatPackage.eINSTANCE.getChoice().isSuperTypeOf(domainElement.eClass())) {
			return ChoiceEditPart.VISUAL_ID;
		}
		if (LciatPackage.eINSTANCE.getConcurrency().isSuperTypeOf(domainElement.eClass())) {
			return ConcurrencyEditPart.VISUAL_ID;
		}
		if (LciatPackage.eINSTANCE.getAggregation().isSuperTypeOf(domainElement.eClass())) {
			return AggregationEditPart.VISUAL_ID;
		}
		if (LciatPackage.eINSTANCE.getEnabling().isSuperTypeOf(domainElement.eClass())) {
			return EnablingEditPart.VISUAL_ID;
		}
		if (LciatPackage.eINSTANCE.getDisabling().isSuperTypeOf(domainElement.eClass())) {
			return DisablingEditPart.VISUAL_ID;
		}
		if (LciatPackage.eINSTANCE.getEnablingWithInformationPassing().isSuperTypeOf(domainElement.eClass())) {
			return EnablingWithInformationPassingEditPart.VISUAL_ID;
		}
		if (LciatPackage.eINSTANCE.getDisablingWithInformationPassing().isSuperTypeOf(domainElement.eClass())) {
			return DisablingWithInformationPassingEditPart.VISUAL_ID;
		}
		if (LciatPackage.eINSTANCE.getIndependentConcurrency().isSuperTypeOf(domainElement.eClass())) {
			return IndependentConcurrencyEditPart.VISUAL_ID;
		}
		if (LciatPackage.eINSTANCE.getOrderIndependence().isSuperTypeOf(domainElement.eClass())) {
			return OrderIndependenceEditPart.VISUAL_ID;
		}
		if (LciatPackage.eINSTANCE.getSuspendResume().isSuperTypeOf(domainElement.eClass())) {
			return SuspendResumeEditPart.VISUAL_ID;
		}
		if (LciatPackage.eINSTANCE.getConcurrencyWithInformationPassing().isSuperTypeOf(domainElement.eClass())) {
			return ConcurrencyWithInformationPassingEditPart.VISUAL_ID;
		}
		if (LciatPackage.eINSTANCE.getDeterministicChoice().isSuperTypeOf(domainElement.eClass())) {
			return DeterministicChoiceEditPart.VISUAL_ID;
		}
		if (LciatPackage.eINSTANCE.getUndeterministicChoice().isSuperTypeOf(domainElement.eClass())) {
			return UndeterministicChoiceEditPart.VISUAL_ID;
		}
		if (LciatPackage.eINSTANCE.getTraceability().isSuperTypeOf(domainElement.eClass())) {
			return TraceabilityEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(LCIANDiagram element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case SociogramSociogramItsSociogramNodesCompartmentEditPart.VISUAL_ID:
		case SociogramSociogramMfContentNodesCompartmentEditPart.VISUAL_ID:
		case LearningDiagramLearningDiagramLearningNodesCompartmentEditPart.VISUAL_ID:
		case LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart.VISUAL_ID:
		case IndividualTaskIndividualTaskTaskRolesCompartmentEditPart.VISUAL_ID:
		case IndividualTaskIndividualTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
		case IndividualTaskIndividualTaskSubtypeCompartmentEditPart.VISUAL_ID:
		case IndividualTaskIndividualTaskModalityCompartmentEditPart.VISUAL_ID:
		case GroupTaskGroupTaskTaskRolesCompartmentEditPart.VISUAL_ID:
		case GroupTaskGroupTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
		case GroupTaskGroupTaskSubtypeCompartmentEditPart.VISUAL_ID:
		case GroupTaskGroupTaskModalityCompartmentEditPart.VISUAL_ID:
		case AbstractTaskAbstractTaskTaskRolesCompartmentEditPart.VISUAL_ID:
		case AbstractTaskAbstractTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
		case AbstractTaskAbstractTaskSubtypeCompartmentEditPart.VISUAL_ID:
		case AbstractTaskAbstractTaskModalityCompartmentEditPart.VISUAL_ID:
		case DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart.VISUAL_ID:
		case IndividualTaskIndividualTaskTaskRolesCompartment2EditPart.VISUAL_ID:
		case IndividualTaskIndividualTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
		case IndividualTaskIndividualTaskSubtypeCompartment2EditPart.VISUAL_ID:
		case IndividualTaskIndividualTaskModalityCompartment2EditPart.VISUAL_ID:
		case GroupTaskGroupTaskTaskRolesCompartment2EditPart.VISUAL_ID:
		case GroupTaskGroupTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
		case GroupTaskGroupTaskSubtypeCompartment2EditPart.VISUAL_ID:
		case GroupTaskGroupTaskModalityCompartment2EditPart.VISUAL_ID:
		case AbstractTaskAbstractTaskTaskRolesCompartment2EditPart.VISUAL_ID:
		case AbstractTaskAbstractTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
		case AbstractTaskAbstractTaskSubtypeCompartment2EditPart.VISUAL_ID:
		case AbstractTaskAbstractTaskModalityCompartment2EditPart.VISUAL_ID:
		case DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment2EditPart.VISUAL_ID:
		case CTTDiagramCTTDiagramCttTasksCompartmentEditPart.VISUAL_ID:
		case CTTDiagramCTTDiagramMfCttNodesCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case LCIANDiagramEditPart.VISUAL_ID:
			return false;
		case RolEditPart.VISUAL_ID:
		case GroupEditPart.VISUAL_ID:
		case MolefContent1EditPart.VISUAL_ID:
		case MolefContent2EditPart.VISUAL_ID:
		case MolefContent3EditPart.VISUAL_ID:
		case MolefContent4EditPart.VISUAL_ID:
		case MolefContent5EditPart.VISUAL_ID:
		case MolefContent6EditPart.VISUAL_ID:
		case MolefTActivities1EditPart.VISUAL_ID:
		case MolefTActivities2EditPart.VISUAL_ID:
		case MolefTActivities3EditPart.VISUAL_ID:
		case MolefTActivities4EditPart.VISUAL_ID:
		case MolefTActivities5EditPart.VISUAL_ID:
		case MolefTActivities6EditPart.VISUAL_ID:
		case MolefTActivities7EditPart.VISUAL_ID:
		case MolefTActivities8EditPart.VISUAL_ID:
		case MolefSocial1EditPart.VISUAL_ID:
		case MolefSocial2EditPart.VISUAL_ID:
		case MolefSocial3EditPart.VISUAL_ID:
		case MolefSocial4EditPart.VISUAL_ID:
		case MolefPersonalization1EditPart.VISUAL_ID:
		case MolefPersonalization2EditPart.VISUAL_ID:
		case MolefPersonalization3EditPart.VISUAL_ID:
		case MolefPersonalization4EditPart.VISUAL_ID:
		case MolefPersonalization5EditPart.VISUAL_ID:
		case Rol2EditPart.VISUAL_ID:
		case Group2EditPart.VISUAL_ID:
		case GraphicalEditorEditPart.VISUAL_ID:
		case TextEditorEditPart.VISUAL_ID:
		case CodeEditorEditPart.VISUAL_ID:
		case WebViewerEditPart.VISUAL_ID:
		case AssimilativeEditPart.VISUAL_ID:
		case InformationHandlingEditPart.VISUAL_ID:
		case AdaptiveEditPart.VISUAL_ID:
		case CommunicativeEditPart.VISUAL_ID:
		case ProductiveEditPart.VISUAL_ID:
		case ExperientialEditPart.VISUAL_ID:
		case EvaluativeEditPart.VISUAL_ID:
		case SupportEditPart.VISUAL_ID:
		case FaceToFaceEditPart.VISUAL_ID:
		case ComputerSupportedEditPart.VISUAL_ID:
		case OnlineEditPart.VISUAL_ID:
		case ToolEditPart.VISUAL_ID:
		case ObjectEditPart.VISUAL_ID:
		case Rol3EditPart.VISUAL_ID:
		case Group3EditPart.VISUAL_ID:
		case Assimilative2EditPart.VISUAL_ID:
		case InformationHandling2EditPart.VISUAL_ID:
		case Adaptive2EditPart.VISUAL_ID:
		case Communicative2EditPart.VISUAL_ID:
		case Productive2EditPart.VISUAL_ID:
		case Experiential2EditPart.VISUAL_ID:
		case Evaluative2EditPart.VISUAL_ID:
		case Support2EditPart.VISUAL_ID:
		case FaceToFace2EditPart.VISUAL_ID:
		case ComputerSupported2EditPart.VISUAL_ID:
		case Online2EditPart.VISUAL_ID:
		case Object2EditPart.VISUAL_ID:
		case Rol4EditPart.VISUAL_ID:
		case Group4EditPart.VISUAL_ID:
		case Assimilative3EditPart.VISUAL_ID:
		case InformationHandling3EditPart.VISUAL_ID:
		case Adaptive3EditPart.VISUAL_ID:
		case Communicative3EditPart.VISUAL_ID:
		case Productive3EditPart.VISUAL_ID:
		case Experiential3EditPart.VISUAL_ID:
		case Evaluative3EditPart.VISUAL_ID:
		case Support3EditPart.VISUAL_ID:
		case FaceToFace3EditPart.VISUAL_ID:
		case ComputerSupported3EditPart.VISUAL_ID:
		case Online3EditPart.VISUAL_ID:
		case Object3EditPart.VISUAL_ID:
		case SessionPanelEditPart.VISUAL_ID:
		case ChatEditPart.VISUAL_ID:
		case TurnTakingToolEditPart.VISUAL_ID:
		case TelepointerEditPart.VISUAL_ID:
		case RadarViewEditPart.VISUAL_ID:
		case PropertiesEditPart.VISUAL_ID:
		case ConsoleEditPart.VISUAL_ID:
		case ProblemsEditPart.VISUAL_ID:
		case InitEditPart.VISUAL_ID:
		case EndEditPart.VISUAL_ID:
		case TemporalConditionEditPart.VISUAL_ID:
		case NotificationEditPart.VISUAL_ID:
		case ConditionEditPart.VISUAL_ID:
		case SessionPanel2EditPart.VISUAL_ID:
		case Chat2EditPart.VISUAL_ID:
		case TurnTakingTool2EditPart.VISUAL_ID:
		case Telepointer2EditPart.VISUAL_ID:
		case RadarView2EditPart.VISUAL_ID:
		case Properties2EditPart.VISUAL_ID:
		case Console2EditPart.VISUAL_ID:
		case Problems2EditPart.VISUAL_ID:
		case Init2EditPart.VISUAL_ID:
		case End2EditPart.VISUAL_ID:
		case TemporalCondition2EditPart.VISUAL_ID:
		case Notification2EditPart.VISUAL_ID:
		case Condition2EditPart.VISUAL_ID:
		case MolefMultimedia1EditPart.VISUAL_ID:
		case MolefMultimedia2EditPart.VISUAL_ID:
		case MolefMultimedia3EditPart.VISUAL_ID:
		case MolefMultimedia4EditPart.VISUAL_ID:
		case MolefMultimedia5EditPart.VISUAL_ID:
		case MolefMultimedia6EditPart.VISUAL_ID:
		case MolefMultimedia7EditPart.VISUAL_ID:
		case ExclusiveEditionEditPart.VISUAL_ID:
		case CollaborativeVisualizationEditPart.VISUAL_ID:
		case IndividualVisualizationEditPart.VISUAL_ID:
		case UserTaskEditPart.VISUAL_ID:
		case CTTAbstractTaskEditPart.VISUAL_ID:
		case InteractiveTaskEditPart.VISUAL_ID:
		case CTTCollaborativeTaskEditPart.VISUAL_ID:
		case ApplicationTaskEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return lciat.diagram.part.LciatVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return lciat.diagram.part.LciatVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return lciat.diagram.part.LciatVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return lciat.diagram.part.LciatVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return lciat.diagram.part.LciatVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return lciat.diagram.part.LciatVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
