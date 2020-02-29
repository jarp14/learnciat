/*
* 
*/
package lciat.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import lciat.AbstractTask;
import lciat.Acting;
import lciat.Aggregation;
import lciat.ApplicationTask;
import lciat.Association;
import lciat.Awareness;
import lciat.CTTAbstractTask;
import lciat.CTTCollaborativeTask;
import lciat.CTTDiagram;
import lciat.CTTTask;
import lciat.Chat;
import lciat.Choice;
import lciat.CodeEditor;
import lciat.CollaborativeVisualization;
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
import lciat.ExclusiveEdition;
import lciat.GraphicalEditor;
import lciat.Group;
import lciat.GroupTask;
import lciat.IndependentConcurrency;
import lciat.IndividualTask;
import lciat.IndividualVisualization;
import lciat.Inheritance;
import lciat.Init;
import lciat.InteractiveTask;
import lciat.LCIANDiagram;
import lciat.LciatPackage;
import lciat.LearningDiagram;
import lciat.LearningNode;
import lciat.LeftSideLearningNode;
import lciat.Modality;
import lciat.MolefContentNode;
import lciat.MolefCttNode;
import lciat.MolefLearningNode;
import lciat.Notification;
import lciat.Object;
import lciat.OrderIndependence;
import lciat.Problems;
import lciat.Properties;
import lciat.RadarView;
import lciat.Rol;
import lciat.SessionPanel;
import lciat.Sociogram;
import lciat.SociogramNode;
import lciat.Subtype;
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
import lciat.diagram.edit.parts.*;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class LciatDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getSemanticChildren(View view) {
		switch (LciatVisualIDRegistry.getVisualID(view)) {
		case LCIANDiagramEditPart.VISUAL_ID:
			return getLCIANDiagram_1000SemanticChildren(view);
		case IndividualTaskEditPart.VISUAL_ID:
			return getIndividualTask_3026SemanticChildren(view);
		case GroupTaskEditPart.VISUAL_ID:
			return getGroupTask_3046SemanticChildren(view);
		case AbstractTaskEditPart.VISUAL_ID:
			return getAbstractTask_3061SemanticChildren(view);
		case DetailedAbstractTaskEditPart.VISUAL_ID:
			return getDetailedAbstractTask_3076SemanticChildren(view);
		case IndividualTask2EditPart.VISUAL_ID:
			return getIndividualTask_3077SemanticChildren(view);
		case GroupTask2EditPart.VISUAL_ID:
			return getGroupTask_3078SemanticChildren(view);
		case AbstractTask2EditPart.VISUAL_ID:
			return getAbstractTask_3079SemanticChildren(view);
		case DetailedAbstractTask2EditPart.VISUAL_ID:
			return getDetailedAbstractTask_3080SemanticChildren(view);
		case SociogramSociogramItsSociogramNodesCompartmentEditPart.VISUAL_ID:
			return getSociogramSociogramItsSociogramNodesCompartment_7001SemanticChildren(view);
		case SociogramSociogramMfContentNodesCompartmentEditPart.VISUAL_ID:
			return getSociogramSociogramMfContentNodesCompartment_7002SemanticChildren(view);
		case LearningDiagramLearningDiagramLearningNodesCompartmentEditPart.VISUAL_ID:
			return getLearningDiagramLearningDiagramLearningNodesCompartment_7003SemanticChildren(view);
		case LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart.VISUAL_ID:
			return getLearningDiagramLearningDiagramMfLearningNodesCompartment_7004SemanticChildren(view);
		case IndividualTaskIndividualTaskTaskRolesCompartmentEditPart.VISUAL_ID:
			return getIndividualTaskIndividualTaskTaskRolesCompartment_7005SemanticChildren(view);
		case IndividualTaskIndividualTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
			return getIndividualTaskIndividualTaskTaskObjectsCompartment_7006SemanticChildren(view);
		case IndividualTaskIndividualTaskSubtypeCompartmentEditPart.VISUAL_ID:
			return getIndividualTaskIndividualTaskSubtypeCompartment_7007SemanticChildren(view);
		case IndividualTaskIndividualTaskModalityCompartmentEditPart.VISUAL_ID:
			return getIndividualTaskIndividualTaskModalityCompartment_7008SemanticChildren(view);
		case GroupTaskGroupTaskTaskRolesCompartmentEditPart.VISUAL_ID:
			return getGroupTaskGroupTaskTaskRolesCompartment_7009SemanticChildren(view);
		case GroupTaskGroupTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
			return getGroupTaskGroupTaskTaskObjectsCompartment_7010SemanticChildren(view);
		case GroupTaskGroupTaskSubtypeCompartmentEditPart.VISUAL_ID:
			return getGroupTaskGroupTaskSubtypeCompartment_7011SemanticChildren(view);
		case GroupTaskGroupTaskModalityCompartmentEditPart.VISUAL_ID:
			return getGroupTaskGroupTaskModalityCompartment_7012SemanticChildren(view);
		case AbstractTaskAbstractTaskTaskRolesCompartmentEditPart.VISUAL_ID:
			return getAbstractTaskAbstractTaskTaskRolesCompartment_7013SemanticChildren(view);
		case AbstractTaskAbstractTaskTaskObjectsCompartmentEditPart.VISUAL_ID:
			return getAbstractTaskAbstractTaskTaskObjectsCompartment_7014SemanticChildren(view);
		case AbstractTaskAbstractTaskSubtypeCompartmentEditPart.VISUAL_ID:
			return getAbstractTaskAbstractTaskSubtypeCompartment_7015SemanticChildren(view);
		case AbstractTaskAbstractTaskModalityCompartmentEditPart.VISUAL_ID:
			return getAbstractTaskAbstractTaskModalityCompartment_7016SemanticChildren(view);
		case DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart.VISUAL_ID:
			return getDetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment_7017SemanticChildren(view);
		case IndividualTaskIndividualTaskTaskRolesCompartment2EditPart.VISUAL_ID:
			return getIndividualTaskIndividualTaskTaskRolesCompartment_7018SemanticChildren(view);
		case IndividualTaskIndividualTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
			return getIndividualTaskIndividualTaskTaskObjectsCompartment_7019SemanticChildren(view);
		case IndividualTaskIndividualTaskSubtypeCompartment2EditPart.VISUAL_ID:
			return getIndividualTaskIndividualTaskSubtypeCompartment_7020SemanticChildren(view);
		case IndividualTaskIndividualTaskModalityCompartment2EditPart.VISUAL_ID:
			return getIndividualTaskIndividualTaskModalityCompartment_7021SemanticChildren(view);
		case GroupTaskGroupTaskTaskRolesCompartment2EditPart.VISUAL_ID:
			return getGroupTaskGroupTaskTaskRolesCompartment_7022SemanticChildren(view);
		case GroupTaskGroupTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
			return getGroupTaskGroupTaskTaskObjectsCompartment_7023SemanticChildren(view);
		case GroupTaskGroupTaskSubtypeCompartment2EditPart.VISUAL_ID:
			return getGroupTaskGroupTaskSubtypeCompartment_7024SemanticChildren(view);
		case GroupTaskGroupTaskModalityCompartment2EditPart.VISUAL_ID:
			return getGroupTaskGroupTaskModalityCompartment_7025SemanticChildren(view);
		case AbstractTaskAbstractTaskTaskRolesCompartment2EditPart.VISUAL_ID:
			return getAbstractTaskAbstractTaskTaskRolesCompartment_7026SemanticChildren(view);
		case AbstractTaskAbstractTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
			return getAbstractTaskAbstractTaskTaskObjectsCompartment_7027SemanticChildren(view);
		case AbstractTaskAbstractTaskSubtypeCompartment2EditPart.VISUAL_ID:
			return getAbstractTaskAbstractTaskSubtypeCompartment_7028SemanticChildren(view);
		case AbstractTaskAbstractTaskModalityCompartment2EditPart.VISUAL_ID:
			return getAbstractTaskAbstractTaskModalityCompartment_7029SemanticChildren(view);
		case DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment2EditPart.VISUAL_ID:
			return getDetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment_7030SemanticChildren(view);
		case CTTDiagramCTTDiagramCttTasksCompartmentEditPart.VISUAL_ID:
			return getCTTDiagramCTTDiagramCttTasksCompartment_7031SemanticChildren(view);
		case CTTDiagramCTTDiagramMfCttNodesCompartmentEditPart.VISUAL_ID:
			return getCTTDiagramCTTDiagramMfCttNodesCompartment_7032SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getLCIANDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		LCIANDiagram modelElement = (LCIANDiagram) view.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getItsSociograms().iterator(); it.hasNext();) {
			Sociogram childElement = (Sociogram) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SociogramEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getItsLearningDiagrams().iterator(); it.hasNext();) {
			LearningDiagram childElement = (LearningDiagram) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LearningDiagramEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getItsCttDiagrams().iterator(); it.hasNext();) {
			CTTDiagram childElement = (CTTDiagram) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CTTDiagramEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getIndividualTask_3026SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		IndividualTask modelElement = (IndividualTask) view.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTools().iterator(); it.hasNext();) {
			Tool childElement = (Tool) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == GraphicalEditorEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextEditorEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CodeEditorEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WebViewerEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ToolEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getGroupTask_3046SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		GroupTask modelElement = (GroupTask) view.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTools().iterator(); it.hasNext();) {
			Tool childElement = (Tool) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == GraphicalEditorEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextEditorEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CodeEditorEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WebViewerEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ToolEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getAbstractTask_3061SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		AbstractTask modelElement = (AbstractTask) view.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTools().iterator(); it.hasNext();) {
			Tool childElement = (Tool) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == GraphicalEditorEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextEditorEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CodeEditorEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WebViewerEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ToolEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getDetailedAbstractTask_3076SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		DetailedAbstractTask modelElement = (DetailedAbstractTask) view.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTools().iterator(); it.hasNext();) {
			Tool childElement = (Tool) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == GraphicalEditorEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextEditorEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CodeEditorEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WebViewerEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ToolEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getIndividualTask_3077SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		IndividualTask modelElement = (IndividualTask) view.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTools().iterator(); it.hasNext();) {
			Tool childElement = (Tool) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == GraphicalEditorEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextEditorEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CodeEditorEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WebViewerEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ToolEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getGroupTask_3078SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		GroupTask modelElement = (GroupTask) view.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTools().iterator(); it.hasNext();) {
			Tool childElement = (Tool) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == GraphicalEditorEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextEditorEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CodeEditorEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WebViewerEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ToolEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getAbstractTask_3079SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		AbstractTask modelElement = (AbstractTask) view.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTools().iterator(); it.hasNext();) {
			Tool childElement = (Tool) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == GraphicalEditorEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextEditorEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CodeEditorEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WebViewerEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ToolEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getDetailedAbstractTask_3080SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		DetailedAbstractTask modelElement = (DetailedAbstractTask) view.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTools().iterator(); it.hasNext();) {
			Tool childElement = (Tool) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == GraphicalEditorEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextEditorEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CodeEditorEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WebViewerEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ToolEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getSociogramSociogramItsSociogramNodesCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Sociogram modelElement = (Sociogram) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getItsSociogramNodes().iterator(); it.hasNext();) {
			SociogramNode childElement = (SociogramNode) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RolEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getSociogramSociogramMfContentNodesCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Sociogram modelElement = (Sociogram) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMfContentNodes().iterator(); it.hasNext();) {
			MolefContentNode childElement = (MolefContentNode) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MolefContent1EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefContent2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefContent3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefContent4EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefContent5EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefContent6EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getLearningDiagramLearningDiagramLearningNodesCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LearningDiagram modelElement = (LearningDiagram) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLearningNodes().iterator(); it.hasNext();) {
			LearningNode childElement = (LearningNode) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == IndividualTaskEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupTaskEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AbstractTaskEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DetailedAbstractTaskEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SessionPanel2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Chat2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TurnTakingTool2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Telepointer2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadarView2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Properties2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Console2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Problems2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Init2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == End2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TemporalCondition2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Notification2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Condition2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getLearningDiagramLearningDiagramMfLearningNodesCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LearningDiagram modelElement = (LearningDiagram) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMfLearningNodes().iterator(); it.hasNext();) {
			MolefLearningNode childElement = (MolefLearningNode) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MolefTActivities1EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefTActivities2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefTActivities3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefTActivities4EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefTActivities5EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefTActivities6EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefTActivities7EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefTActivities8EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefSocial1EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefSocial2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefSocial3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefSocial4EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefPersonalization1EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefPersonalization2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefPersonalization3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefPersonalization4EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefPersonalization5EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getIndividualTaskIndividualTaskTaskRolesCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IndividualTask modelElement = (IndividualTask) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		{
			LeftSideLearningNode childElement = modelElement.getTaskRoles();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Rol2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Group2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getIndividualTaskIndividualTaskTaskObjectsCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IndividualTask modelElement = (IndividualTask) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTaskObjects().iterator(); it.hasNext();) {
			Object childElement = (Object) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ObjectEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getIndividualTaskIndividualTaskSubtypeCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IndividualTask modelElement = (IndividualTask) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		{
			Subtype childElement = modelElement.getSubtype();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AssimilativeEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == InformationHandlingEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == AdaptiveEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == CommunicativeEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == ProductiveEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExperientialEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == EvaluativeEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == SupportEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getIndividualTaskIndividualTaskModalityCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IndividualTask modelElement = (IndividualTask) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		{
			Modality childElement = modelElement.getModality();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FaceToFaceEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == ComputerSupportedEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == OnlineEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getGroupTaskGroupTaskTaskRolesCompartment_7009SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GroupTask modelElement = (GroupTask) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTaskRoles().iterator(); it.hasNext();) {
			LeftSideLearningNode childElement = (LeftSideLearningNode) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Rol3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Group3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getGroupTaskGroupTaskTaskObjectsCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GroupTask modelElement = (GroupTask) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTaskObjects().iterator(); it.hasNext();) {
			Object childElement = (Object) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Object2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getGroupTaskGroupTaskSubtypeCompartment_7011SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GroupTask modelElement = (GroupTask) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		{
			Subtype childElement = modelElement.getSubtype();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Assimilative2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == InformationHandling2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Adaptive2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Communicative2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Productive2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Experiential2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Evaluative2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Support2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getGroupTaskGroupTaskModalityCompartment_7012SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GroupTask modelElement = (GroupTask) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		{
			Modality childElement = modelElement.getModality();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FaceToFace2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == ComputerSupported2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Online2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getAbstractTaskAbstractTaskTaskRolesCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AbstractTask modelElement = (AbstractTask) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTaskRoles().iterator(); it.hasNext();) {
			LeftSideLearningNode childElement = (LeftSideLearningNode) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Rol4EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Group4EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getAbstractTaskAbstractTaskTaskObjectsCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AbstractTask modelElement = (AbstractTask) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTaskObjects().iterator(); it.hasNext();) {
			Object childElement = (Object) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Object3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getAbstractTaskAbstractTaskSubtypeCompartment_7015SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AbstractTask modelElement = (AbstractTask) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		{
			Subtype childElement = modelElement.getSubtype();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Assimilative3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == InformationHandling3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Adaptive3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Communicative3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Productive3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Experiential3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Evaluative3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Support3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getAbstractTaskAbstractTaskModalityCompartment_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AbstractTask modelElement = (AbstractTask) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		{
			Modality childElement = modelElement.getModality();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FaceToFace3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == ComputerSupported3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Online3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getDetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment_7017SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DetailedAbstractTask modelElement = (DetailedAbstractTask) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLearningNodes().iterator(); it.hasNext();) {
			LearningNode childElement = (LearningNode) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == IndividualTask2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupTask2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AbstractTask2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DetailedAbstractTask2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SessionPanelEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ChatEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TurnTakingToolEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TelepointerEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadarViewEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PropertiesEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConsoleEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ProblemsEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InitEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EndEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TemporalConditionEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotificationEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getIndividualTaskIndividualTaskTaskRolesCompartment_7018SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IndividualTask modelElement = (IndividualTask) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		{
			LeftSideLearningNode childElement = modelElement.getTaskRoles();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Rol2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Group2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getIndividualTaskIndividualTaskTaskObjectsCompartment_7019SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IndividualTask modelElement = (IndividualTask) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTaskObjects().iterator(); it.hasNext();) {
			Object childElement = (Object) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ObjectEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getIndividualTaskIndividualTaskSubtypeCompartment_7020SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IndividualTask modelElement = (IndividualTask) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		{
			Subtype childElement = modelElement.getSubtype();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AssimilativeEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == InformationHandlingEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == AdaptiveEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == CommunicativeEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == ProductiveEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == ExperientialEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == EvaluativeEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == SupportEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getIndividualTaskIndividualTaskModalityCompartment_7021SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IndividualTask modelElement = (IndividualTask) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		{
			Modality childElement = modelElement.getModality();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FaceToFaceEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == ComputerSupportedEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == OnlineEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getGroupTaskGroupTaskTaskRolesCompartment_7022SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GroupTask modelElement = (GroupTask) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTaskRoles().iterator(); it.hasNext();) {
			LeftSideLearningNode childElement = (LeftSideLearningNode) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Rol3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Group3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getGroupTaskGroupTaskTaskObjectsCompartment_7023SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GroupTask modelElement = (GroupTask) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTaskObjects().iterator(); it.hasNext();) {
			Object childElement = (Object) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Object2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getGroupTaskGroupTaskSubtypeCompartment_7024SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GroupTask modelElement = (GroupTask) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		{
			Subtype childElement = modelElement.getSubtype();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Assimilative2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == InformationHandling2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Adaptive2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Communicative2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Productive2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Experiential2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Evaluative2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Support2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getGroupTaskGroupTaskModalityCompartment_7025SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GroupTask modelElement = (GroupTask) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		{
			Modality childElement = modelElement.getModality();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FaceToFace2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == ComputerSupported2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Online2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getAbstractTaskAbstractTaskTaskRolesCompartment_7026SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AbstractTask modelElement = (AbstractTask) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTaskRoles().iterator(); it.hasNext();) {
			LeftSideLearningNode childElement = (LeftSideLearningNode) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Rol4EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Group4EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getAbstractTaskAbstractTaskTaskObjectsCompartment_7027SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AbstractTask modelElement = (AbstractTask) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTaskObjects().iterator(); it.hasNext();) {
			Object childElement = (Object) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Object3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getAbstractTaskAbstractTaskSubtypeCompartment_7028SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AbstractTask modelElement = (AbstractTask) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		{
			Subtype childElement = modelElement.getSubtype();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Assimilative3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == InformationHandling3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Adaptive3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Communicative3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Productive3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Experiential3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Evaluative3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Support3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getAbstractTaskAbstractTaskModalityCompartment_7029SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AbstractTask modelElement = (AbstractTask) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		{
			Modality childElement = modelElement.getModality();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FaceToFace3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == ComputerSupported3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
			if (visualID == Online3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getDetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment_7030SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DetailedAbstractTask modelElement = (DetailedAbstractTask) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLearningNodes().iterator(); it.hasNext();) {
			LearningNode childElement = (LearningNode) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == IndividualTask2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupTask2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AbstractTask2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DetailedAbstractTask2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SessionPanelEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ChatEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TurnTakingToolEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TelepointerEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadarViewEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PropertiesEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConsoleEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ProblemsEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InitEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EndEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TemporalConditionEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotificationEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getCTTDiagramCTTDiagramCttTasksCompartment_7031SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CTTDiagram modelElement = (CTTDiagram) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCttTasks().iterator(); it.hasNext();) {
			CTTTask childElement = (CTTTask) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ExclusiveEditionEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CollaborativeVisualizationEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IndividualVisualizationEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UserTaskEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CTTAbstractTaskEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InteractiveTaskEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CTTCollaborativeTaskEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ApplicationTaskEditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatNodeDescriptor> getCTTDiagramCTTDiagramMfCttNodesCompartment_7032SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CTTDiagram modelElement = (CTTDiagram) containerView.getElement();
		LinkedList<LciatNodeDescriptor> result = new LinkedList<LciatNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMfCttNodes().iterator(); it.hasNext();) {
			MolefCttNode childElement = (MolefCttNode) it.next();
			int visualID = LciatVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MolefMultimedia1EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefMultimedia2EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefMultimedia3EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefMultimedia4EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefMultimedia5EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefMultimedia6EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MolefMultimedia7EditPart.VISUAL_ID) {
				result.add(new LciatNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<LciatLinkDescriptor> getContainedLinks(View view) {
		switch (LciatVisualIDRegistry.getVisualID(view)) {
		case LCIANDiagramEditPart.VISUAL_ID:
			return getLCIANDiagram_1000ContainedLinks(view);
		case SociogramEditPart.VISUAL_ID:
			return getSociogram_2001ContainedLinks(view);
		case LearningDiagramEditPart.VISUAL_ID:
			return getLearningDiagram_2002ContainedLinks(view);
		case CTTDiagramEditPart.VISUAL_ID:
			return getCTTDiagram_2003ContainedLinks(view);
		case RolEditPart.VISUAL_ID:
			return getRol_3001ContainedLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3002ContainedLinks(view);
		case MolefContent1EditPart.VISUAL_ID:
			return getMolefContent1_3003ContainedLinks(view);
		case MolefContent2EditPart.VISUAL_ID:
			return getMolefContent2_3004ContainedLinks(view);
		case MolefContent3EditPart.VISUAL_ID:
			return getMolefContent3_3005ContainedLinks(view);
		case MolefContent4EditPart.VISUAL_ID:
			return getMolefContent4_3006ContainedLinks(view);
		case MolefContent5EditPart.VISUAL_ID:
			return getMolefContent5_3007ContainedLinks(view);
		case MolefContent6EditPart.VISUAL_ID:
			return getMolefContent6_3008ContainedLinks(view);
		case MolefTActivities1EditPart.VISUAL_ID:
			return getMolefTActivities1_3009ContainedLinks(view);
		case MolefTActivities2EditPart.VISUAL_ID:
			return getMolefTActivities2_3010ContainedLinks(view);
		case MolefTActivities3EditPart.VISUAL_ID:
			return getMolefTActivities3_3011ContainedLinks(view);
		case MolefTActivities4EditPart.VISUAL_ID:
			return getMolefTActivities4_3012ContainedLinks(view);
		case MolefTActivities5EditPart.VISUAL_ID:
			return getMolefTActivities5_3013ContainedLinks(view);
		case MolefTActivities6EditPart.VISUAL_ID:
			return getMolefTActivities6_3014ContainedLinks(view);
		case MolefTActivities7EditPart.VISUAL_ID:
			return getMolefTActivities7_3015ContainedLinks(view);
		case MolefTActivities8EditPart.VISUAL_ID:
			return getMolefTActivities8_3016ContainedLinks(view);
		case MolefSocial1EditPart.VISUAL_ID:
			return getMolefSocial1_3017ContainedLinks(view);
		case MolefSocial2EditPart.VISUAL_ID:
			return getMolefSocial2_3018ContainedLinks(view);
		case MolefSocial3EditPart.VISUAL_ID:
			return getMolefSocial3_3019ContainedLinks(view);
		case MolefSocial4EditPart.VISUAL_ID:
			return getMolefSocial4_3020ContainedLinks(view);
		case MolefPersonalization1EditPart.VISUAL_ID:
			return getMolefPersonalization1_3021ContainedLinks(view);
		case MolefPersonalization2EditPart.VISUAL_ID:
			return getMolefPersonalization2_3022ContainedLinks(view);
		case MolefPersonalization3EditPart.VISUAL_ID:
			return getMolefPersonalization3_3023ContainedLinks(view);
		case MolefPersonalization4EditPart.VISUAL_ID:
			return getMolefPersonalization4_3024ContainedLinks(view);
		case MolefPersonalization5EditPart.VISUAL_ID:
			return getMolefPersonalization5_3025ContainedLinks(view);
		case IndividualTaskEditPart.VISUAL_ID:
			return getIndividualTask_3026ContainedLinks(view);
		case Rol2EditPart.VISUAL_ID:
			return getRol_3027ContainedLinks(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3028ContainedLinks(view);
		case GraphicalEditorEditPart.VISUAL_ID:
			return getGraphicalEditor_3029ContainedLinks(view);
		case TextEditorEditPart.VISUAL_ID:
			return getTextEditor_3030ContainedLinks(view);
		case CodeEditorEditPart.VISUAL_ID:
			return getCodeEditor_3031ContainedLinks(view);
		case WebViewerEditPart.VISUAL_ID:
			return getWebViewer_3032ContainedLinks(view);
		case AssimilativeEditPart.VISUAL_ID:
			return getAssimilative_3033ContainedLinks(view);
		case InformationHandlingEditPart.VISUAL_ID:
			return getInformationHandling_3034ContainedLinks(view);
		case AdaptiveEditPart.VISUAL_ID:
			return getAdaptive_3035ContainedLinks(view);
		case CommunicativeEditPart.VISUAL_ID:
			return getCommunicative_3036ContainedLinks(view);
		case ProductiveEditPart.VISUAL_ID:
			return getProductive_3037ContainedLinks(view);
		case ExperientialEditPart.VISUAL_ID:
			return getExperiential_3038ContainedLinks(view);
		case EvaluativeEditPart.VISUAL_ID:
			return getEvaluative_3039ContainedLinks(view);
		case SupportEditPart.VISUAL_ID:
			return getSupport_3040ContainedLinks(view);
		case FaceToFaceEditPart.VISUAL_ID:
			return getFaceToFace_3041ContainedLinks(view);
		case ComputerSupportedEditPart.VISUAL_ID:
			return getComputerSupported_3042ContainedLinks(view);
		case OnlineEditPart.VISUAL_ID:
			return getOnline_3043ContainedLinks(view);
		case ToolEditPart.VISUAL_ID:
			return getTool_3044ContainedLinks(view);
		case ObjectEditPart.VISUAL_ID:
			return getObject_3045ContainedLinks(view);
		case GroupTaskEditPart.VISUAL_ID:
			return getGroupTask_3046ContainedLinks(view);
		case Rol3EditPart.VISUAL_ID:
			return getRol_3047ContainedLinks(view);
		case Group3EditPart.VISUAL_ID:
			return getGroup_3048ContainedLinks(view);
		case Assimilative2EditPart.VISUAL_ID:
			return getAssimilative_3049ContainedLinks(view);
		case InformationHandling2EditPart.VISUAL_ID:
			return getInformationHandling_3050ContainedLinks(view);
		case Adaptive2EditPart.VISUAL_ID:
			return getAdaptive_3051ContainedLinks(view);
		case Communicative2EditPart.VISUAL_ID:
			return getCommunicative_3052ContainedLinks(view);
		case Productive2EditPart.VISUAL_ID:
			return getProductive_3053ContainedLinks(view);
		case Experiential2EditPart.VISUAL_ID:
			return getExperiential_3054ContainedLinks(view);
		case Evaluative2EditPart.VISUAL_ID:
			return getEvaluative_3055ContainedLinks(view);
		case Support2EditPart.VISUAL_ID:
			return getSupport_3056ContainedLinks(view);
		case FaceToFace2EditPart.VISUAL_ID:
			return getFaceToFace_3057ContainedLinks(view);
		case ComputerSupported2EditPart.VISUAL_ID:
			return getComputerSupported_3058ContainedLinks(view);
		case Online2EditPart.VISUAL_ID:
			return getOnline_3059ContainedLinks(view);
		case Object2EditPart.VISUAL_ID:
			return getObject_3060ContainedLinks(view);
		case AbstractTaskEditPart.VISUAL_ID:
			return getAbstractTask_3061ContainedLinks(view);
		case Rol4EditPart.VISUAL_ID:
			return getRol_3062ContainedLinks(view);
		case Group4EditPart.VISUAL_ID:
			return getGroup_3063ContainedLinks(view);
		case Assimilative3EditPart.VISUAL_ID:
			return getAssimilative_3064ContainedLinks(view);
		case InformationHandling3EditPart.VISUAL_ID:
			return getInformationHandling_3065ContainedLinks(view);
		case Adaptive3EditPart.VISUAL_ID:
			return getAdaptive_3066ContainedLinks(view);
		case Communicative3EditPart.VISUAL_ID:
			return getCommunicative_3067ContainedLinks(view);
		case Productive3EditPart.VISUAL_ID:
			return getProductive_3068ContainedLinks(view);
		case Experiential3EditPart.VISUAL_ID:
			return getExperiential_3069ContainedLinks(view);
		case Evaluative3EditPart.VISUAL_ID:
			return getEvaluative_3070ContainedLinks(view);
		case Support3EditPart.VISUAL_ID:
			return getSupport_3071ContainedLinks(view);
		case FaceToFace3EditPart.VISUAL_ID:
			return getFaceToFace_3072ContainedLinks(view);
		case ComputerSupported3EditPart.VISUAL_ID:
			return getComputerSupported_3073ContainedLinks(view);
		case Online3EditPart.VISUAL_ID:
			return getOnline_3074ContainedLinks(view);
		case Object3EditPart.VISUAL_ID:
			return getObject_3075ContainedLinks(view);
		case DetailedAbstractTaskEditPart.VISUAL_ID:
			return getDetailedAbstractTask_3076ContainedLinks(view);
		case IndividualTask2EditPart.VISUAL_ID:
			return getIndividualTask_3077ContainedLinks(view);
		case GroupTask2EditPart.VISUAL_ID:
			return getGroupTask_3078ContainedLinks(view);
		case AbstractTask2EditPart.VISUAL_ID:
			return getAbstractTask_3079ContainedLinks(view);
		case DetailedAbstractTask2EditPart.VISUAL_ID:
			return getDetailedAbstractTask_3080ContainedLinks(view);
		case SessionPanelEditPart.VISUAL_ID:
			return getSessionPanel_3081ContainedLinks(view);
		case ChatEditPart.VISUAL_ID:
			return getChat_3082ContainedLinks(view);
		case TurnTakingToolEditPart.VISUAL_ID:
			return getTurnTakingTool_3083ContainedLinks(view);
		case TelepointerEditPart.VISUAL_ID:
			return getTelepointer_3084ContainedLinks(view);
		case RadarViewEditPart.VISUAL_ID:
			return getRadarView_3085ContainedLinks(view);
		case PropertiesEditPart.VISUAL_ID:
			return getProperties_3086ContainedLinks(view);
		case ConsoleEditPart.VISUAL_ID:
			return getConsole_3087ContainedLinks(view);
		case ProblemsEditPart.VISUAL_ID:
			return getProblems_3088ContainedLinks(view);
		case InitEditPart.VISUAL_ID:
			return getInit_3089ContainedLinks(view);
		case EndEditPart.VISUAL_ID:
			return getEnd_3090ContainedLinks(view);
		case TemporalConditionEditPart.VISUAL_ID:
			return getTemporalCondition_3091ContainedLinks(view);
		case NotificationEditPart.VISUAL_ID:
			return getNotification_3092ContainedLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_3093ContainedLinks(view);
		case SessionPanel2EditPart.VISUAL_ID:
			return getSessionPanel_3094ContainedLinks(view);
		case Chat2EditPart.VISUAL_ID:
			return getChat_3095ContainedLinks(view);
		case TurnTakingTool2EditPart.VISUAL_ID:
			return getTurnTakingTool_3096ContainedLinks(view);
		case Telepointer2EditPart.VISUAL_ID:
			return getTelepointer_3097ContainedLinks(view);
		case RadarView2EditPart.VISUAL_ID:
			return getRadarView_3098ContainedLinks(view);
		case Properties2EditPart.VISUAL_ID:
			return getProperties_3099ContainedLinks(view);
		case Console2EditPart.VISUAL_ID:
			return getConsole_3100ContainedLinks(view);
		case Problems2EditPart.VISUAL_ID:
			return getProblems_3101ContainedLinks(view);
		case Init2EditPart.VISUAL_ID:
			return getInit_3102ContainedLinks(view);
		case End2EditPart.VISUAL_ID:
			return getEnd_3103ContainedLinks(view);
		case TemporalCondition2EditPart.VISUAL_ID:
			return getTemporalCondition_3104ContainedLinks(view);
		case Notification2EditPart.VISUAL_ID:
			return getNotification_3105ContainedLinks(view);
		case Condition2EditPart.VISUAL_ID:
			return getCondition_3106ContainedLinks(view);
		case MolefMultimedia1EditPart.VISUAL_ID:
			return getMolefMultimedia1_3107ContainedLinks(view);
		case MolefMultimedia2EditPart.VISUAL_ID:
			return getMolefMultimedia2_3108ContainedLinks(view);
		case MolefMultimedia3EditPart.VISUAL_ID:
			return getMolefMultimedia3_3109ContainedLinks(view);
		case MolefMultimedia4EditPart.VISUAL_ID:
			return getMolefMultimedia4_3110ContainedLinks(view);
		case MolefMultimedia5EditPart.VISUAL_ID:
			return getMolefMultimedia5_3111ContainedLinks(view);
		case MolefMultimedia6EditPart.VISUAL_ID:
			return getMolefMultimedia6_3112ContainedLinks(view);
		case MolefMultimedia7EditPart.VISUAL_ID:
			return getMolefMultimedia7_3113ContainedLinks(view);
		case ExclusiveEditionEditPart.VISUAL_ID:
			return getExclusiveEdition_3114ContainedLinks(view);
		case CollaborativeVisualizationEditPart.VISUAL_ID:
			return getCollaborativeVisualization_3115ContainedLinks(view);
		case IndividualVisualizationEditPart.VISUAL_ID:
			return getIndividualVisualization_3116ContainedLinks(view);
		case UserTaskEditPart.VISUAL_ID:
			return getUserTask_3117ContainedLinks(view);
		case CTTAbstractTaskEditPart.VISUAL_ID:
			return getCTTAbstractTask_3118ContainedLinks(view);
		case InteractiveTaskEditPart.VISUAL_ID:
			return getInteractiveTask_3119ContainedLinks(view);
		case CTTCollaborativeTaskEditPart.VISUAL_ID:
			return getCTTCollaborativeTask_3120ContainedLinks(view);
		case ApplicationTaskEditPart.VISUAL_ID:
			return getApplicationTask_3121ContainedLinks(view);
		case InheritanceEditPart.VISUAL_ID:
			return getInheritance_4001ContainedLinks(view);
		case ActingEditPart.VISUAL_ID:
			return getActing_4002ContainedLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4003ContainedLinks(view);
		case EnablingWOInformationEditPart.VISUAL_ID:
			return getEnablingWOInformation_4004ContainedLinks(view);
		case EnablingWInformationEditPart.VISUAL_ID:
			return getEnablingWInformation_4005ContainedLinks(view);
		case ChoiceEditPart.VISUAL_ID:
			return getChoice_4006ContainedLinks(view);
		case ConcurrencyEditPart.VISUAL_ID:
			return getConcurrency_4007ContainedLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4008ContainedLinks(view);
		case EnablingEditPart.VISUAL_ID:
			return getEnabling_4009ContainedLinks(view);
		case DisablingEditPart.VISUAL_ID:
			return getDisabling_4010ContainedLinks(view);
		case EnablingWithInformationPassingEditPart.VISUAL_ID:
			return getEnablingWithInformationPassing_4011ContainedLinks(view);
		case DisablingWithInformationPassingEditPart.VISUAL_ID:
			return getDisablingWithInformationPassing_4012ContainedLinks(view);
		case IndependentConcurrencyEditPart.VISUAL_ID:
			return getIndependentConcurrency_4013ContainedLinks(view);
		case OrderIndependenceEditPart.VISUAL_ID:
			return getOrderIndependence_4014ContainedLinks(view);
		case SuspendResumeEditPart.VISUAL_ID:
			return getSuspendResume_4015ContainedLinks(view);
		case ConcurrencyWithInformationPassingEditPart.VISUAL_ID:
			return getConcurrencyWithInformationPassing_4016ContainedLinks(view);
		case DeterministicChoiceEditPart.VISUAL_ID:
			return getDeterministicChoice_4017ContainedLinks(view);
		case UndeterministicChoiceEditPart.VISUAL_ID:
			return getUndeterministicChoice_4018ContainedLinks(view);
		case TraceabilityEditPart.VISUAL_ID:
			return getTraceability_4019ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<LciatLinkDescriptor> getIncomingLinks(View view) {
		switch (LciatVisualIDRegistry.getVisualID(view)) {
		case SociogramEditPart.VISUAL_ID:
			return getSociogram_2001IncomingLinks(view);
		case LearningDiagramEditPart.VISUAL_ID:
			return getLearningDiagram_2002IncomingLinks(view);
		case CTTDiagramEditPart.VISUAL_ID:
			return getCTTDiagram_2003IncomingLinks(view);
		case RolEditPart.VISUAL_ID:
			return getRol_3001IncomingLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3002IncomingLinks(view);
		case MolefContent1EditPart.VISUAL_ID:
			return getMolefContent1_3003IncomingLinks(view);
		case MolefContent2EditPart.VISUAL_ID:
			return getMolefContent2_3004IncomingLinks(view);
		case MolefContent3EditPart.VISUAL_ID:
			return getMolefContent3_3005IncomingLinks(view);
		case MolefContent4EditPart.VISUAL_ID:
			return getMolefContent4_3006IncomingLinks(view);
		case MolefContent5EditPart.VISUAL_ID:
			return getMolefContent5_3007IncomingLinks(view);
		case MolefContent6EditPart.VISUAL_ID:
			return getMolefContent6_3008IncomingLinks(view);
		case MolefTActivities1EditPart.VISUAL_ID:
			return getMolefTActivities1_3009IncomingLinks(view);
		case MolefTActivities2EditPart.VISUAL_ID:
			return getMolefTActivities2_3010IncomingLinks(view);
		case MolefTActivities3EditPart.VISUAL_ID:
			return getMolefTActivities3_3011IncomingLinks(view);
		case MolefTActivities4EditPart.VISUAL_ID:
			return getMolefTActivities4_3012IncomingLinks(view);
		case MolefTActivities5EditPart.VISUAL_ID:
			return getMolefTActivities5_3013IncomingLinks(view);
		case MolefTActivities6EditPart.VISUAL_ID:
			return getMolefTActivities6_3014IncomingLinks(view);
		case MolefTActivities7EditPart.VISUAL_ID:
			return getMolefTActivities7_3015IncomingLinks(view);
		case MolefTActivities8EditPart.VISUAL_ID:
			return getMolefTActivities8_3016IncomingLinks(view);
		case MolefSocial1EditPart.VISUAL_ID:
			return getMolefSocial1_3017IncomingLinks(view);
		case MolefSocial2EditPart.VISUAL_ID:
			return getMolefSocial2_3018IncomingLinks(view);
		case MolefSocial3EditPart.VISUAL_ID:
			return getMolefSocial3_3019IncomingLinks(view);
		case MolefSocial4EditPart.VISUAL_ID:
			return getMolefSocial4_3020IncomingLinks(view);
		case MolefPersonalization1EditPart.VISUAL_ID:
			return getMolefPersonalization1_3021IncomingLinks(view);
		case MolefPersonalization2EditPart.VISUAL_ID:
			return getMolefPersonalization2_3022IncomingLinks(view);
		case MolefPersonalization3EditPart.VISUAL_ID:
			return getMolefPersonalization3_3023IncomingLinks(view);
		case MolefPersonalization4EditPart.VISUAL_ID:
			return getMolefPersonalization4_3024IncomingLinks(view);
		case MolefPersonalization5EditPart.VISUAL_ID:
			return getMolefPersonalization5_3025IncomingLinks(view);
		case IndividualTaskEditPart.VISUAL_ID:
			return getIndividualTask_3026IncomingLinks(view);
		case Rol2EditPart.VISUAL_ID:
			return getRol_3027IncomingLinks(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3028IncomingLinks(view);
		case GraphicalEditorEditPart.VISUAL_ID:
			return getGraphicalEditor_3029IncomingLinks(view);
		case TextEditorEditPart.VISUAL_ID:
			return getTextEditor_3030IncomingLinks(view);
		case CodeEditorEditPart.VISUAL_ID:
			return getCodeEditor_3031IncomingLinks(view);
		case WebViewerEditPart.VISUAL_ID:
			return getWebViewer_3032IncomingLinks(view);
		case AssimilativeEditPart.VISUAL_ID:
			return getAssimilative_3033IncomingLinks(view);
		case InformationHandlingEditPart.VISUAL_ID:
			return getInformationHandling_3034IncomingLinks(view);
		case AdaptiveEditPart.VISUAL_ID:
			return getAdaptive_3035IncomingLinks(view);
		case CommunicativeEditPart.VISUAL_ID:
			return getCommunicative_3036IncomingLinks(view);
		case ProductiveEditPart.VISUAL_ID:
			return getProductive_3037IncomingLinks(view);
		case ExperientialEditPart.VISUAL_ID:
			return getExperiential_3038IncomingLinks(view);
		case EvaluativeEditPart.VISUAL_ID:
			return getEvaluative_3039IncomingLinks(view);
		case SupportEditPart.VISUAL_ID:
			return getSupport_3040IncomingLinks(view);
		case FaceToFaceEditPart.VISUAL_ID:
			return getFaceToFace_3041IncomingLinks(view);
		case ComputerSupportedEditPart.VISUAL_ID:
			return getComputerSupported_3042IncomingLinks(view);
		case OnlineEditPart.VISUAL_ID:
			return getOnline_3043IncomingLinks(view);
		case ToolEditPart.VISUAL_ID:
			return getTool_3044IncomingLinks(view);
		case ObjectEditPart.VISUAL_ID:
			return getObject_3045IncomingLinks(view);
		case GroupTaskEditPart.VISUAL_ID:
			return getGroupTask_3046IncomingLinks(view);
		case Rol3EditPart.VISUAL_ID:
			return getRol_3047IncomingLinks(view);
		case Group3EditPart.VISUAL_ID:
			return getGroup_3048IncomingLinks(view);
		case Assimilative2EditPart.VISUAL_ID:
			return getAssimilative_3049IncomingLinks(view);
		case InformationHandling2EditPart.VISUAL_ID:
			return getInformationHandling_3050IncomingLinks(view);
		case Adaptive2EditPart.VISUAL_ID:
			return getAdaptive_3051IncomingLinks(view);
		case Communicative2EditPart.VISUAL_ID:
			return getCommunicative_3052IncomingLinks(view);
		case Productive2EditPart.VISUAL_ID:
			return getProductive_3053IncomingLinks(view);
		case Experiential2EditPart.VISUAL_ID:
			return getExperiential_3054IncomingLinks(view);
		case Evaluative2EditPart.VISUAL_ID:
			return getEvaluative_3055IncomingLinks(view);
		case Support2EditPart.VISUAL_ID:
			return getSupport_3056IncomingLinks(view);
		case FaceToFace2EditPart.VISUAL_ID:
			return getFaceToFace_3057IncomingLinks(view);
		case ComputerSupported2EditPart.VISUAL_ID:
			return getComputerSupported_3058IncomingLinks(view);
		case Online2EditPart.VISUAL_ID:
			return getOnline_3059IncomingLinks(view);
		case Object2EditPart.VISUAL_ID:
			return getObject_3060IncomingLinks(view);
		case AbstractTaskEditPart.VISUAL_ID:
			return getAbstractTask_3061IncomingLinks(view);
		case Rol4EditPart.VISUAL_ID:
			return getRol_3062IncomingLinks(view);
		case Group4EditPart.VISUAL_ID:
			return getGroup_3063IncomingLinks(view);
		case Assimilative3EditPart.VISUAL_ID:
			return getAssimilative_3064IncomingLinks(view);
		case InformationHandling3EditPart.VISUAL_ID:
			return getInformationHandling_3065IncomingLinks(view);
		case Adaptive3EditPart.VISUAL_ID:
			return getAdaptive_3066IncomingLinks(view);
		case Communicative3EditPart.VISUAL_ID:
			return getCommunicative_3067IncomingLinks(view);
		case Productive3EditPart.VISUAL_ID:
			return getProductive_3068IncomingLinks(view);
		case Experiential3EditPart.VISUAL_ID:
			return getExperiential_3069IncomingLinks(view);
		case Evaluative3EditPart.VISUAL_ID:
			return getEvaluative_3070IncomingLinks(view);
		case Support3EditPart.VISUAL_ID:
			return getSupport_3071IncomingLinks(view);
		case FaceToFace3EditPart.VISUAL_ID:
			return getFaceToFace_3072IncomingLinks(view);
		case ComputerSupported3EditPart.VISUAL_ID:
			return getComputerSupported_3073IncomingLinks(view);
		case Online3EditPart.VISUAL_ID:
			return getOnline_3074IncomingLinks(view);
		case Object3EditPart.VISUAL_ID:
			return getObject_3075IncomingLinks(view);
		case DetailedAbstractTaskEditPart.VISUAL_ID:
			return getDetailedAbstractTask_3076IncomingLinks(view);
		case IndividualTask2EditPart.VISUAL_ID:
			return getIndividualTask_3077IncomingLinks(view);
		case GroupTask2EditPart.VISUAL_ID:
			return getGroupTask_3078IncomingLinks(view);
		case AbstractTask2EditPart.VISUAL_ID:
			return getAbstractTask_3079IncomingLinks(view);
		case DetailedAbstractTask2EditPart.VISUAL_ID:
			return getDetailedAbstractTask_3080IncomingLinks(view);
		case SessionPanelEditPart.VISUAL_ID:
			return getSessionPanel_3081IncomingLinks(view);
		case ChatEditPart.VISUAL_ID:
			return getChat_3082IncomingLinks(view);
		case TurnTakingToolEditPart.VISUAL_ID:
			return getTurnTakingTool_3083IncomingLinks(view);
		case TelepointerEditPart.VISUAL_ID:
			return getTelepointer_3084IncomingLinks(view);
		case RadarViewEditPart.VISUAL_ID:
			return getRadarView_3085IncomingLinks(view);
		case PropertiesEditPart.VISUAL_ID:
			return getProperties_3086IncomingLinks(view);
		case ConsoleEditPart.VISUAL_ID:
			return getConsole_3087IncomingLinks(view);
		case ProblemsEditPart.VISUAL_ID:
			return getProblems_3088IncomingLinks(view);
		case InitEditPart.VISUAL_ID:
			return getInit_3089IncomingLinks(view);
		case EndEditPart.VISUAL_ID:
			return getEnd_3090IncomingLinks(view);
		case TemporalConditionEditPart.VISUAL_ID:
			return getTemporalCondition_3091IncomingLinks(view);
		case NotificationEditPart.VISUAL_ID:
			return getNotification_3092IncomingLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_3093IncomingLinks(view);
		case SessionPanel2EditPart.VISUAL_ID:
			return getSessionPanel_3094IncomingLinks(view);
		case Chat2EditPart.VISUAL_ID:
			return getChat_3095IncomingLinks(view);
		case TurnTakingTool2EditPart.VISUAL_ID:
			return getTurnTakingTool_3096IncomingLinks(view);
		case Telepointer2EditPart.VISUAL_ID:
			return getTelepointer_3097IncomingLinks(view);
		case RadarView2EditPart.VISUAL_ID:
			return getRadarView_3098IncomingLinks(view);
		case Properties2EditPart.VISUAL_ID:
			return getProperties_3099IncomingLinks(view);
		case Console2EditPart.VISUAL_ID:
			return getConsole_3100IncomingLinks(view);
		case Problems2EditPart.VISUAL_ID:
			return getProblems_3101IncomingLinks(view);
		case Init2EditPart.VISUAL_ID:
			return getInit_3102IncomingLinks(view);
		case End2EditPart.VISUAL_ID:
			return getEnd_3103IncomingLinks(view);
		case TemporalCondition2EditPart.VISUAL_ID:
			return getTemporalCondition_3104IncomingLinks(view);
		case Notification2EditPart.VISUAL_ID:
			return getNotification_3105IncomingLinks(view);
		case Condition2EditPart.VISUAL_ID:
			return getCondition_3106IncomingLinks(view);
		case MolefMultimedia1EditPart.VISUAL_ID:
			return getMolefMultimedia1_3107IncomingLinks(view);
		case MolefMultimedia2EditPart.VISUAL_ID:
			return getMolefMultimedia2_3108IncomingLinks(view);
		case MolefMultimedia3EditPart.VISUAL_ID:
			return getMolefMultimedia3_3109IncomingLinks(view);
		case MolefMultimedia4EditPart.VISUAL_ID:
			return getMolefMultimedia4_3110IncomingLinks(view);
		case MolefMultimedia5EditPart.VISUAL_ID:
			return getMolefMultimedia5_3111IncomingLinks(view);
		case MolefMultimedia6EditPart.VISUAL_ID:
			return getMolefMultimedia6_3112IncomingLinks(view);
		case MolefMultimedia7EditPart.VISUAL_ID:
			return getMolefMultimedia7_3113IncomingLinks(view);
		case ExclusiveEditionEditPart.VISUAL_ID:
			return getExclusiveEdition_3114IncomingLinks(view);
		case CollaborativeVisualizationEditPart.VISUAL_ID:
			return getCollaborativeVisualization_3115IncomingLinks(view);
		case IndividualVisualizationEditPart.VISUAL_ID:
			return getIndividualVisualization_3116IncomingLinks(view);
		case UserTaskEditPart.VISUAL_ID:
			return getUserTask_3117IncomingLinks(view);
		case CTTAbstractTaskEditPart.VISUAL_ID:
			return getCTTAbstractTask_3118IncomingLinks(view);
		case InteractiveTaskEditPart.VISUAL_ID:
			return getInteractiveTask_3119IncomingLinks(view);
		case CTTCollaborativeTaskEditPart.VISUAL_ID:
			return getCTTCollaborativeTask_3120IncomingLinks(view);
		case ApplicationTaskEditPart.VISUAL_ID:
			return getApplicationTask_3121IncomingLinks(view);
		case InheritanceEditPart.VISUAL_ID:
			return getInheritance_4001IncomingLinks(view);
		case ActingEditPart.VISUAL_ID:
			return getActing_4002IncomingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4003IncomingLinks(view);
		case EnablingWOInformationEditPart.VISUAL_ID:
			return getEnablingWOInformation_4004IncomingLinks(view);
		case EnablingWInformationEditPart.VISUAL_ID:
			return getEnablingWInformation_4005IncomingLinks(view);
		case ChoiceEditPart.VISUAL_ID:
			return getChoice_4006IncomingLinks(view);
		case ConcurrencyEditPart.VISUAL_ID:
			return getConcurrency_4007IncomingLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4008IncomingLinks(view);
		case EnablingEditPart.VISUAL_ID:
			return getEnabling_4009IncomingLinks(view);
		case DisablingEditPart.VISUAL_ID:
			return getDisabling_4010IncomingLinks(view);
		case EnablingWithInformationPassingEditPart.VISUAL_ID:
			return getEnablingWithInformationPassing_4011IncomingLinks(view);
		case DisablingWithInformationPassingEditPart.VISUAL_ID:
			return getDisablingWithInformationPassing_4012IncomingLinks(view);
		case IndependentConcurrencyEditPart.VISUAL_ID:
			return getIndependentConcurrency_4013IncomingLinks(view);
		case OrderIndependenceEditPart.VISUAL_ID:
			return getOrderIndependence_4014IncomingLinks(view);
		case SuspendResumeEditPart.VISUAL_ID:
			return getSuspendResume_4015IncomingLinks(view);
		case ConcurrencyWithInformationPassingEditPart.VISUAL_ID:
			return getConcurrencyWithInformationPassing_4016IncomingLinks(view);
		case DeterministicChoiceEditPart.VISUAL_ID:
			return getDeterministicChoice_4017IncomingLinks(view);
		case UndeterministicChoiceEditPart.VISUAL_ID:
			return getUndeterministicChoice_4018IncomingLinks(view);
		case TraceabilityEditPart.VISUAL_ID:
			return getTraceability_4019IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<LciatLinkDescriptor> getOutgoingLinks(View view) {
		switch (LciatVisualIDRegistry.getVisualID(view)) {
		case SociogramEditPart.VISUAL_ID:
			return getSociogram_2001OutgoingLinks(view);
		case LearningDiagramEditPart.VISUAL_ID:
			return getLearningDiagram_2002OutgoingLinks(view);
		case CTTDiagramEditPart.VISUAL_ID:
			return getCTTDiagram_2003OutgoingLinks(view);
		case RolEditPart.VISUAL_ID:
			return getRol_3001OutgoingLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3002OutgoingLinks(view);
		case MolefContent1EditPart.VISUAL_ID:
			return getMolefContent1_3003OutgoingLinks(view);
		case MolefContent2EditPart.VISUAL_ID:
			return getMolefContent2_3004OutgoingLinks(view);
		case MolefContent3EditPart.VISUAL_ID:
			return getMolefContent3_3005OutgoingLinks(view);
		case MolefContent4EditPart.VISUAL_ID:
			return getMolefContent4_3006OutgoingLinks(view);
		case MolefContent5EditPart.VISUAL_ID:
			return getMolefContent5_3007OutgoingLinks(view);
		case MolefContent6EditPart.VISUAL_ID:
			return getMolefContent6_3008OutgoingLinks(view);
		case MolefTActivities1EditPart.VISUAL_ID:
			return getMolefTActivities1_3009OutgoingLinks(view);
		case MolefTActivities2EditPart.VISUAL_ID:
			return getMolefTActivities2_3010OutgoingLinks(view);
		case MolefTActivities3EditPart.VISUAL_ID:
			return getMolefTActivities3_3011OutgoingLinks(view);
		case MolefTActivities4EditPart.VISUAL_ID:
			return getMolefTActivities4_3012OutgoingLinks(view);
		case MolefTActivities5EditPart.VISUAL_ID:
			return getMolefTActivities5_3013OutgoingLinks(view);
		case MolefTActivities6EditPart.VISUAL_ID:
			return getMolefTActivities6_3014OutgoingLinks(view);
		case MolefTActivities7EditPart.VISUAL_ID:
			return getMolefTActivities7_3015OutgoingLinks(view);
		case MolefTActivities8EditPart.VISUAL_ID:
			return getMolefTActivities8_3016OutgoingLinks(view);
		case MolefSocial1EditPart.VISUAL_ID:
			return getMolefSocial1_3017OutgoingLinks(view);
		case MolefSocial2EditPart.VISUAL_ID:
			return getMolefSocial2_3018OutgoingLinks(view);
		case MolefSocial3EditPart.VISUAL_ID:
			return getMolefSocial3_3019OutgoingLinks(view);
		case MolefSocial4EditPart.VISUAL_ID:
			return getMolefSocial4_3020OutgoingLinks(view);
		case MolefPersonalization1EditPart.VISUAL_ID:
			return getMolefPersonalization1_3021OutgoingLinks(view);
		case MolefPersonalization2EditPart.VISUAL_ID:
			return getMolefPersonalization2_3022OutgoingLinks(view);
		case MolefPersonalization3EditPart.VISUAL_ID:
			return getMolefPersonalization3_3023OutgoingLinks(view);
		case MolefPersonalization4EditPart.VISUAL_ID:
			return getMolefPersonalization4_3024OutgoingLinks(view);
		case MolefPersonalization5EditPart.VISUAL_ID:
			return getMolefPersonalization5_3025OutgoingLinks(view);
		case IndividualTaskEditPart.VISUAL_ID:
			return getIndividualTask_3026OutgoingLinks(view);
		case Rol2EditPart.VISUAL_ID:
			return getRol_3027OutgoingLinks(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3028OutgoingLinks(view);
		case GraphicalEditorEditPart.VISUAL_ID:
			return getGraphicalEditor_3029OutgoingLinks(view);
		case TextEditorEditPart.VISUAL_ID:
			return getTextEditor_3030OutgoingLinks(view);
		case CodeEditorEditPart.VISUAL_ID:
			return getCodeEditor_3031OutgoingLinks(view);
		case WebViewerEditPart.VISUAL_ID:
			return getWebViewer_3032OutgoingLinks(view);
		case AssimilativeEditPart.VISUAL_ID:
			return getAssimilative_3033OutgoingLinks(view);
		case InformationHandlingEditPart.VISUAL_ID:
			return getInformationHandling_3034OutgoingLinks(view);
		case AdaptiveEditPart.VISUAL_ID:
			return getAdaptive_3035OutgoingLinks(view);
		case CommunicativeEditPart.VISUAL_ID:
			return getCommunicative_3036OutgoingLinks(view);
		case ProductiveEditPart.VISUAL_ID:
			return getProductive_3037OutgoingLinks(view);
		case ExperientialEditPart.VISUAL_ID:
			return getExperiential_3038OutgoingLinks(view);
		case EvaluativeEditPart.VISUAL_ID:
			return getEvaluative_3039OutgoingLinks(view);
		case SupportEditPart.VISUAL_ID:
			return getSupport_3040OutgoingLinks(view);
		case FaceToFaceEditPart.VISUAL_ID:
			return getFaceToFace_3041OutgoingLinks(view);
		case ComputerSupportedEditPart.VISUAL_ID:
			return getComputerSupported_3042OutgoingLinks(view);
		case OnlineEditPart.VISUAL_ID:
			return getOnline_3043OutgoingLinks(view);
		case ToolEditPart.VISUAL_ID:
			return getTool_3044OutgoingLinks(view);
		case ObjectEditPart.VISUAL_ID:
			return getObject_3045OutgoingLinks(view);
		case GroupTaskEditPart.VISUAL_ID:
			return getGroupTask_3046OutgoingLinks(view);
		case Rol3EditPart.VISUAL_ID:
			return getRol_3047OutgoingLinks(view);
		case Group3EditPart.VISUAL_ID:
			return getGroup_3048OutgoingLinks(view);
		case Assimilative2EditPart.VISUAL_ID:
			return getAssimilative_3049OutgoingLinks(view);
		case InformationHandling2EditPart.VISUAL_ID:
			return getInformationHandling_3050OutgoingLinks(view);
		case Adaptive2EditPart.VISUAL_ID:
			return getAdaptive_3051OutgoingLinks(view);
		case Communicative2EditPart.VISUAL_ID:
			return getCommunicative_3052OutgoingLinks(view);
		case Productive2EditPart.VISUAL_ID:
			return getProductive_3053OutgoingLinks(view);
		case Experiential2EditPart.VISUAL_ID:
			return getExperiential_3054OutgoingLinks(view);
		case Evaluative2EditPart.VISUAL_ID:
			return getEvaluative_3055OutgoingLinks(view);
		case Support2EditPart.VISUAL_ID:
			return getSupport_3056OutgoingLinks(view);
		case FaceToFace2EditPart.VISUAL_ID:
			return getFaceToFace_3057OutgoingLinks(view);
		case ComputerSupported2EditPart.VISUAL_ID:
			return getComputerSupported_3058OutgoingLinks(view);
		case Online2EditPart.VISUAL_ID:
			return getOnline_3059OutgoingLinks(view);
		case Object2EditPart.VISUAL_ID:
			return getObject_3060OutgoingLinks(view);
		case AbstractTaskEditPart.VISUAL_ID:
			return getAbstractTask_3061OutgoingLinks(view);
		case Rol4EditPart.VISUAL_ID:
			return getRol_3062OutgoingLinks(view);
		case Group4EditPart.VISUAL_ID:
			return getGroup_3063OutgoingLinks(view);
		case Assimilative3EditPart.VISUAL_ID:
			return getAssimilative_3064OutgoingLinks(view);
		case InformationHandling3EditPart.VISUAL_ID:
			return getInformationHandling_3065OutgoingLinks(view);
		case Adaptive3EditPart.VISUAL_ID:
			return getAdaptive_3066OutgoingLinks(view);
		case Communicative3EditPart.VISUAL_ID:
			return getCommunicative_3067OutgoingLinks(view);
		case Productive3EditPart.VISUAL_ID:
			return getProductive_3068OutgoingLinks(view);
		case Experiential3EditPart.VISUAL_ID:
			return getExperiential_3069OutgoingLinks(view);
		case Evaluative3EditPart.VISUAL_ID:
			return getEvaluative_3070OutgoingLinks(view);
		case Support3EditPart.VISUAL_ID:
			return getSupport_3071OutgoingLinks(view);
		case FaceToFace3EditPart.VISUAL_ID:
			return getFaceToFace_3072OutgoingLinks(view);
		case ComputerSupported3EditPart.VISUAL_ID:
			return getComputerSupported_3073OutgoingLinks(view);
		case Online3EditPart.VISUAL_ID:
			return getOnline_3074OutgoingLinks(view);
		case Object3EditPart.VISUAL_ID:
			return getObject_3075OutgoingLinks(view);
		case DetailedAbstractTaskEditPart.VISUAL_ID:
			return getDetailedAbstractTask_3076OutgoingLinks(view);
		case IndividualTask2EditPart.VISUAL_ID:
			return getIndividualTask_3077OutgoingLinks(view);
		case GroupTask2EditPart.VISUAL_ID:
			return getGroupTask_3078OutgoingLinks(view);
		case AbstractTask2EditPart.VISUAL_ID:
			return getAbstractTask_3079OutgoingLinks(view);
		case DetailedAbstractTask2EditPart.VISUAL_ID:
			return getDetailedAbstractTask_3080OutgoingLinks(view);
		case SessionPanelEditPart.VISUAL_ID:
			return getSessionPanel_3081OutgoingLinks(view);
		case ChatEditPart.VISUAL_ID:
			return getChat_3082OutgoingLinks(view);
		case TurnTakingToolEditPart.VISUAL_ID:
			return getTurnTakingTool_3083OutgoingLinks(view);
		case TelepointerEditPart.VISUAL_ID:
			return getTelepointer_3084OutgoingLinks(view);
		case RadarViewEditPart.VISUAL_ID:
			return getRadarView_3085OutgoingLinks(view);
		case PropertiesEditPart.VISUAL_ID:
			return getProperties_3086OutgoingLinks(view);
		case ConsoleEditPart.VISUAL_ID:
			return getConsole_3087OutgoingLinks(view);
		case ProblemsEditPart.VISUAL_ID:
			return getProblems_3088OutgoingLinks(view);
		case InitEditPart.VISUAL_ID:
			return getInit_3089OutgoingLinks(view);
		case EndEditPart.VISUAL_ID:
			return getEnd_3090OutgoingLinks(view);
		case TemporalConditionEditPart.VISUAL_ID:
			return getTemporalCondition_3091OutgoingLinks(view);
		case NotificationEditPart.VISUAL_ID:
			return getNotification_3092OutgoingLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_3093OutgoingLinks(view);
		case SessionPanel2EditPart.VISUAL_ID:
			return getSessionPanel_3094OutgoingLinks(view);
		case Chat2EditPart.VISUAL_ID:
			return getChat_3095OutgoingLinks(view);
		case TurnTakingTool2EditPart.VISUAL_ID:
			return getTurnTakingTool_3096OutgoingLinks(view);
		case Telepointer2EditPart.VISUAL_ID:
			return getTelepointer_3097OutgoingLinks(view);
		case RadarView2EditPart.VISUAL_ID:
			return getRadarView_3098OutgoingLinks(view);
		case Properties2EditPart.VISUAL_ID:
			return getProperties_3099OutgoingLinks(view);
		case Console2EditPart.VISUAL_ID:
			return getConsole_3100OutgoingLinks(view);
		case Problems2EditPart.VISUAL_ID:
			return getProblems_3101OutgoingLinks(view);
		case Init2EditPart.VISUAL_ID:
			return getInit_3102OutgoingLinks(view);
		case End2EditPart.VISUAL_ID:
			return getEnd_3103OutgoingLinks(view);
		case TemporalCondition2EditPart.VISUAL_ID:
			return getTemporalCondition_3104OutgoingLinks(view);
		case Notification2EditPart.VISUAL_ID:
			return getNotification_3105OutgoingLinks(view);
		case Condition2EditPart.VISUAL_ID:
			return getCondition_3106OutgoingLinks(view);
		case MolefMultimedia1EditPart.VISUAL_ID:
			return getMolefMultimedia1_3107OutgoingLinks(view);
		case MolefMultimedia2EditPart.VISUAL_ID:
			return getMolefMultimedia2_3108OutgoingLinks(view);
		case MolefMultimedia3EditPart.VISUAL_ID:
			return getMolefMultimedia3_3109OutgoingLinks(view);
		case MolefMultimedia4EditPart.VISUAL_ID:
			return getMolefMultimedia4_3110OutgoingLinks(view);
		case MolefMultimedia5EditPart.VISUAL_ID:
			return getMolefMultimedia5_3111OutgoingLinks(view);
		case MolefMultimedia6EditPart.VISUAL_ID:
			return getMolefMultimedia6_3112OutgoingLinks(view);
		case MolefMultimedia7EditPart.VISUAL_ID:
			return getMolefMultimedia7_3113OutgoingLinks(view);
		case ExclusiveEditionEditPart.VISUAL_ID:
			return getExclusiveEdition_3114OutgoingLinks(view);
		case CollaborativeVisualizationEditPart.VISUAL_ID:
			return getCollaborativeVisualization_3115OutgoingLinks(view);
		case IndividualVisualizationEditPart.VISUAL_ID:
			return getIndividualVisualization_3116OutgoingLinks(view);
		case UserTaskEditPart.VISUAL_ID:
			return getUserTask_3117OutgoingLinks(view);
		case CTTAbstractTaskEditPart.VISUAL_ID:
			return getCTTAbstractTask_3118OutgoingLinks(view);
		case InteractiveTaskEditPart.VISUAL_ID:
			return getInteractiveTask_3119OutgoingLinks(view);
		case CTTCollaborativeTaskEditPart.VISUAL_ID:
			return getCTTCollaborativeTask_3120OutgoingLinks(view);
		case ApplicationTaskEditPart.VISUAL_ID:
			return getApplicationTask_3121OutgoingLinks(view);
		case InheritanceEditPart.VISUAL_ID:
			return getInheritance_4001OutgoingLinks(view);
		case ActingEditPart.VISUAL_ID:
			return getActing_4002OutgoingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4003OutgoingLinks(view);
		case EnablingWOInformationEditPart.VISUAL_ID:
			return getEnablingWOInformation_4004OutgoingLinks(view);
		case EnablingWInformationEditPart.VISUAL_ID:
			return getEnablingWInformation_4005OutgoingLinks(view);
		case ChoiceEditPart.VISUAL_ID:
			return getChoice_4006OutgoingLinks(view);
		case ConcurrencyEditPart.VISUAL_ID:
			return getConcurrency_4007OutgoingLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4008OutgoingLinks(view);
		case EnablingEditPart.VISUAL_ID:
			return getEnabling_4009OutgoingLinks(view);
		case DisablingEditPart.VISUAL_ID:
			return getDisabling_4010OutgoingLinks(view);
		case EnablingWithInformationPassingEditPart.VISUAL_ID:
			return getEnablingWithInformationPassing_4011OutgoingLinks(view);
		case DisablingWithInformationPassingEditPart.VISUAL_ID:
			return getDisablingWithInformationPassing_4012OutgoingLinks(view);
		case IndependentConcurrencyEditPart.VISUAL_ID:
			return getIndependentConcurrency_4013OutgoingLinks(view);
		case OrderIndependenceEditPart.VISUAL_ID:
			return getOrderIndependence_4014OutgoingLinks(view);
		case SuspendResumeEditPart.VISUAL_ID:
			return getSuspendResume_4015OutgoingLinks(view);
		case ConcurrencyWithInformationPassingEditPart.VISUAL_ID:
			return getConcurrencyWithInformationPassing_4016OutgoingLinks(view);
		case DeterministicChoiceEditPart.VISUAL_ID:
			return getDeterministicChoice_4017OutgoingLinks(view);
		case UndeterministicChoiceEditPart.VISUAL_ID:
			return getUndeterministicChoice_4018OutgoingLinks(view);
		case TraceabilityEditPart.VISUAL_ID:
			return getTraceability_4019OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getLCIANDiagram_1000ContainedLinks(View view) {
		LCIANDiagram modelElement = (LCIANDiagram) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Concurrency_4007(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Aggregation_4008(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Enabling_4009(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Disabling_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_EnablingWithInformationPassing_4011(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DisablingWithInformationPassing_4012(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_IndependentConcurrency_4013(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_OrderIndependence_4014(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_SuspendResume_4015(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ConcurrencyWithInformationPassing_4016(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DeterministicChoice_4017(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_UndeterministicChoice_4018(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Traceability_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getSociogram_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getLearningDiagram_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCTTDiagram_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getRol_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getGroup_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefContent1_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefContent2_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefContent3_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefContent4_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefContent5_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefContent6_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefTActivities1_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefTActivities2_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefTActivities3_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefTActivities4_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefTActivities5_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefTActivities6_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefTActivities7_3015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefTActivities8_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefSocial1_3017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefSocial2_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefSocial3_3019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefSocial4_3020ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefPersonalization1_3021ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefPersonalization2_3022ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefPersonalization3_3023ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefPersonalization4_3024ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefPersonalization5_3025ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getIndividualTask_3026ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getRol_3027ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getGroup_3028ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getGraphicalEditor_3029ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTextEditor_3030ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCodeEditor_3031ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getWebViewer_3032ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAssimilative_3033ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getInformationHandling_3034ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAdaptive_3035ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCommunicative_3036ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getProductive_3037ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getExperiential_3038ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEvaluative_3039ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getSupport_3040ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getFaceToFace_3041ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getComputerSupported_3042ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getOnline_3043ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTool_3044ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getObject_3045ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getGroupTask_3046ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getRol_3047ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getGroup_3048ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAssimilative_3049ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getInformationHandling_3050ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAdaptive_3051ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCommunicative_3052ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getProductive_3053ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getExperiential_3054ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEvaluative_3055ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getSupport_3056ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getFaceToFace_3057ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getComputerSupported_3058ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getOnline_3059ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getObject_3060ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAbstractTask_3061ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getRol_3062ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getGroup_3063ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAssimilative_3064ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getInformationHandling_3065ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAdaptive_3066ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCommunicative_3067ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getProductive_3068ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getExperiential_3069ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEvaluative_3070ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getSupport_3071ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getFaceToFace_3072ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getComputerSupported_3073ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getOnline_3074ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getObject_3075ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getDetailedAbstractTask_3076ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getIndividualTask_3077ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getGroupTask_3078ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAbstractTask_3079ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getDetailedAbstractTask_3080ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getSessionPanel_3081ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getChat_3082ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTurnTakingTool_3083ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTelepointer_3084ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getRadarView_3085ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getProperties_3086ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getConsole_3087ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getProblems_3088ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getInit_3089ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEnd_3090ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTemporalCondition_3091ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getNotification_3092ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCondition_3093ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getSessionPanel_3094ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getChat_3095ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTurnTakingTool_3096ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTelepointer_3097ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getRadarView_3098ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getProperties_3099ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getConsole_3100ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getProblems_3101ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getInit_3102ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEnd_3103ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTemporalCondition_3104ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getNotification_3105ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCondition_3106ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefMultimedia1_3107ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefMultimedia2_3108ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefMultimedia3_3109ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefMultimedia4_3110ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefMultimedia5_3111ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefMultimedia6_3112ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefMultimedia7_3113ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getExclusiveEdition_3114ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCollaborativeVisualization_3115ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getIndividualVisualization_3116ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getUserTask_3117ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCTTAbstractTask_3118ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getInteractiveTask_3119ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCTTCollaborativeTask_3120ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getApplicationTask_3121ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getInheritance_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getActing_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAssociation_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEnablingWOInformation_4004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEnablingWInformation_4005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getChoice_4006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getConcurrency_4007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAggregation_4008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEnabling_4009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getDisabling_4010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEnablingWithInformationPassing_4011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getDisablingWithInformationPassing_4012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getIndependentConcurrency_4013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getOrderIndependence_4014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getSuspendResume_4015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getConcurrencyWithInformationPassing_4016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getDeterministicChoice_4017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getUndeterministicChoice_4018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTraceability_4019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getSociogram_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getLearningDiagram_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCTTDiagram_2003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getRol_3001IncomingLinks(View view) {
		Rol modelElement = (Rol) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getGroup_3002IncomingLinks(View view) {
		Group modelElement = (Group) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefContent1_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefContent2_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefContent3_3005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefContent4_3006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefContent5_3007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefContent6_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefTActivities1_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefTActivities2_3010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefTActivities3_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefTActivities4_3012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefTActivities5_3013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefTActivities6_3014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefTActivities7_3015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefTActivities8_3016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefSocial1_3017IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefSocial2_3018IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefSocial3_3019IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefSocial4_3020IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefPersonalization1_3021IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefPersonalization2_3022IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefPersonalization3_3023IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefPersonalization4_3024IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefPersonalization5_3025IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getIndividualTask_3026IncomingLinks(View view) {
		IndividualTask modelElement = (IndividualTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getRol_3027IncomingLinks(View view) {
		Rol modelElement = (Rol) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getGroup_3028IncomingLinks(View view) {
		Group modelElement = (Group) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getGraphicalEditor_3029IncomingLinks(View view) {
		GraphicalEditor modelElement = (GraphicalEditor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Traceability_4019(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTextEditor_3030IncomingLinks(View view) {
		TextEditor modelElement = (TextEditor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Traceability_4019(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCodeEditor_3031IncomingLinks(View view) {
		CodeEditor modelElement = (CodeEditor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Traceability_4019(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getWebViewer_3032IncomingLinks(View view) {
		WebViewer modelElement = (WebViewer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Traceability_4019(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAssimilative_3033IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getInformationHandling_3034IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAdaptive_3035IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCommunicative_3036IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getProductive_3037IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getExperiential_3038IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEvaluative_3039IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getSupport_3040IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getFaceToFace_3041IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getComputerSupported_3042IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getOnline_3043IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTool_3044IncomingLinks(View view) {
		Tool modelElement = (Tool) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Traceability_4019(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getObject_3045IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getGroupTask_3046IncomingLinks(View view) {
		GroupTask modelElement = (GroupTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getRol_3047IncomingLinks(View view) {
		Rol modelElement = (Rol) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getGroup_3048IncomingLinks(View view) {
		Group modelElement = (Group) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAssimilative_3049IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getInformationHandling_3050IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAdaptive_3051IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCommunicative_3052IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getProductive_3053IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getExperiential_3054IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEvaluative_3055IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getSupport_3056IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getFaceToFace_3057IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getComputerSupported_3058IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getOnline_3059IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getObject_3060IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAbstractTask_3061IncomingLinks(View view) {
		AbstractTask modelElement = (AbstractTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getRol_3062IncomingLinks(View view) {
		Rol modelElement = (Rol) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getGroup_3063IncomingLinks(View view) {
		Group modelElement = (Group) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Inheritance_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Acting_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAssimilative_3064IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getInformationHandling_3065IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAdaptive_3066IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCommunicative_3067IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getProductive_3068IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getExperiential_3069IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEvaluative_3070IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getSupport_3071IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getFaceToFace_3072IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getComputerSupported_3073IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getOnline_3074IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getObject_3075IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getDetailedAbstractTask_3076IncomingLinks(View view) {
		DetailedAbstractTask modelElement = (DetailedAbstractTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getIndividualTask_3077IncomingLinks(View view) {
		IndividualTask modelElement = (IndividualTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getGroupTask_3078IncomingLinks(View view) {
		GroupTask modelElement = (GroupTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAbstractTask_3079IncomingLinks(View view) {
		AbstractTask modelElement = (AbstractTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getDetailedAbstractTask_3080IncomingLinks(View view) {
		DetailedAbstractTask modelElement = (DetailedAbstractTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getSessionPanel_3081IncomingLinks(View view) {
		SessionPanel modelElement = (SessionPanel) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getChat_3082IncomingLinks(View view) {
		Chat modelElement = (Chat) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTurnTakingTool_3083IncomingLinks(View view) {
		TurnTakingTool modelElement = (TurnTakingTool) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTelepointer_3084IncomingLinks(View view) {
		Telepointer modelElement = (Telepointer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getRadarView_3085IncomingLinks(View view) {
		RadarView modelElement = (RadarView) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getProperties_3086IncomingLinks(View view) {
		Properties modelElement = (Properties) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getConsole_3087IncomingLinks(View view) {
		Console modelElement = (Console) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getProblems_3088IncomingLinks(View view) {
		Problems modelElement = (Problems) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getInit_3089IncomingLinks(View view) {
		Init modelElement = (Init) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEnd_3090IncomingLinks(View view) {
		End modelElement = (End) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTemporalCondition_3091IncomingLinks(View view) {
		TemporalCondition modelElement = (TemporalCondition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getNotification_3092IncomingLinks(View view) {
		Notification modelElement = (Notification) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCondition_3093IncomingLinks(View view) {
		Condition modelElement = (Condition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getSessionPanel_3094IncomingLinks(View view) {
		SessionPanel modelElement = (SessionPanel) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getChat_3095IncomingLinks(View view) {
		Chat modelElement = (Chat) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTurnTakingTool_3096IncomingLinks(View view) {
		TurnTakingTool modelElement = (TurnTakingTool) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTelepointer_3097IncomingLinks(View view) {
		Telepointer modelElement = (Telepointer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getRadarView_3098IncomingLinks(View view) {
		RadarView modelElement = (RadarView) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getProperties_3099IncomingLinks(View view) {
		Properties modelElement = (Properties) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getConsole_3100IncomingLinks(View view) {
		Console modelElement = (Console) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getProblems_3101IncomingLinks(View view) {
		Problems modelElement = (Problems) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getInit_3102IncomingLinks(View view) {
		Init modelElement = (Init) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEnd_3103IncomingLinks(View view) {
		End modelElement = (End) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTemporalCondition_3104IncomingLinks(View view) {
		TemporalCondition modelElement = (TemporalCondition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getNotification_3105IncomingLinks(View view) {
		Notification modelElement = (Notification) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCondition_3106IncomingLinks(View view) {
		Condition modelElement = (Condition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnablingWInformation_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Concurrency_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefMultimedia1_3107IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefMultimedia2_3108IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefMultimedia3_3109IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefMultimedia4_3110IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefMultimedia5_3111IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefMultimedia6_3112IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefMultimedia7_3113IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getExclusiveEdition_3114IncomingLinks(View view) {
		ExclusiveEdition modelElement = (ExclusiveEdition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4014(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4015(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4017(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4018(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCollaborativeVisualization_3115IncomingLinks(View view) {
		CollaborativeVisualization modelElement = (CollaborativeVisualization) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4014(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4015(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4017(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4018(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getIndividualVisualization_3116IncomingLinks(View view) {
		IndividualVisualization modelElement = (IndividualVisualization) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4014(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4015(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4017(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4018(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getUserTask_3117IncomingLinks(View view) {
		UserTask modelElement = (UserTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4014(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4015(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4017(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4018(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCTTAbstractTask_3118IncomingLinks(View view) {
		CTTAbstractTask modelElement = (CTTAbstractTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4014(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4015(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4017(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4018(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getInteractiveTask_3119IncomingLinks(View view) {
		InteractiveTask modelElement = (InteractiveTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4014(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4015(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4017(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4018(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCTTCollaborativeTask_3120IncomingLinks(View view) {
		CTTCollaborativeTask modelElement = (CTTCollaborativeTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4014(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4015(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4017(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4018(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getApplicationTask_3121IncomingLinks(View view) {
		ApplicationTask modelElement = (ApplicationTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Enabling_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Disabling_4010(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4011(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IndependentConcurrency_4013(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrderIndependence_4014(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SuspendResume_4015(modelElement, crossReferences));
		result.addAll(
				getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4016(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DeterministicChoice_4017(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndeterministicChoice_4018(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getInheritance_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getActing_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAssociation_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEnablingWOInformation_4004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEnablingWInformation_4005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getChoice_4006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getConcurrency_4007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAggregation_4008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEnabling_4009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getDisabling_4010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEnablingWithInformationPassing_4011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getDisablingWithInformationPassing_4012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getIndependentConcurrency_4013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getOrderIndependence_4014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getSuspendResume_4015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getConcurrencyWithInformationPassing_4016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getDeterministicChoice_4017IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getUndeterministicChoice_4018IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTraceability_4019IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getSociogram_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getLearningDiagram_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCTTDiagram_2003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getRol_3001OutgoingLinks(View view) {
		Rol modelElement = (Rol) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getGroup_3002OutgoingLinks(View view) {
		Group modelElement = (Group) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefContent1_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefContent2_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefContent3_3005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefContent4_3006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefContent5_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefContent6_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefTActivities1_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefTActivities2_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefTActivities3_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefTActivities4_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefTActivities5_3013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefTActivities6_3014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefTActivities7_3015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefTActivities8_3016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefSocial1_3017OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefSocial2_3018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefSocial3_3019OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefSocial4_3020OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefPersonalization1_3021OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefPersonalization2_3022OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefPersonalization3_3023OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefPersonalization4_3024OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefPersonalization5_3025OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getIndividualTask_3026OutgoingLinks(View view) {
		IndividualTask modelElement = (IndividualTask) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getRol_3027OutgoingLinks(View view) {
		Rol modelElement = (Rol) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getGroup_3028OutgoingLinks(View view) {
		Group modelElement = (Group) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getGraphicalEditor_3029OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTextEditor_3030OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCodeEditor_3031OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getWebViewer_3032OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAssimilative_3033OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getInformationHandling_3034OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAdaptive_3035OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCommunicative_3036OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getProductive_3037OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getExperiential_3038OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEvaluative_3039OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getSupport_3040OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getFaceToFace_3041OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getComputerSupported_3042OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getOnline_3043OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTool_3044OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getObject_3045OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getGroupTask_3046OutgoingLinks(View view) {
		GroupTask modelElement = (GroupTask) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getRol_3047OutgoingLinks(View view) {
		Rol modelElement = (Rol) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getGroup_3048OutgoingLinks(View view) {
		Group modelElement = (Group) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAssimilative_3049OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getInformationHandling_3050OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAdaptive_3051OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCommunicative_3052OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getProductive_3053OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getExperiential_3054OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEvaluative_3055OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getSupport_3056OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getFaceToFace_3057OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getComputerSupported_3058OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getOnline_3059OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getObject_3060OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAbstractTask_3061OutgoingLinks(View view) {
		AbstractTask modelElement = (AbstractTask) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getRol_3062OutgoingLinks(View view) {
		Rol modelElement = (Rol) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getGroup_3063OutgoingLinks(View view) {
		Group modelElement = (Group) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Inheritance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Acting_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAssimilative_3064OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getInformationHandling_3065OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAdaptive_3066OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCommunicative_3067OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getProductive_3068OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getExperiential_3069OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEvaluative_3070OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getSupport_3071OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getFaceToFace_3072OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getComputerSupported_3073OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getOnline_3074OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getObject_3075OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getDetailedAbstractTask_3076OutgoingLinks(View view) {
		DetailedAbstractTask modelElement = (DetailedAbstractTask) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getIndividualTask_3077OutgoingLinks(View view) {
		IndividualTask modelElement = (IndividualTask) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getGroupTask_3078OutgoingLinks(View view) {
		GroupTask modelElement = (GroupTask) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAbstractTask_3079OutgoingLinks(View view) {
		AbstractTask modelElement = (AbstractTask) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getDetailedAbstractTask_3080OutgoingLinks(View view) {
		DetailedAbstractTask modelElement = (DetailedAbstractTask) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getSessionPanel_3081OutgoingLinks(View view) {
		SessionPanel modelElement = (SessionPanel) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Traceability_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getChat_3082OutgoingLinks(View view) {
		Chat modelElement = (Chat) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Traceability_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTurnTakingTool_3083OutgoingLinks(View view) {
		TurnTakingTool modelElement = (TurnTakingTool) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Traceability_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTelepointer_3084OutgoingLinks(View view) {
		Telepointer modelElement = (Telepointer) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Traceability_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getRadarView_3085OutgoingLinks(View view) {
		RadarView modelElement = (RadarView) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Traceability_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getProperties_3086OutgoingLinks(View view) {
		Properties modelElement = (Properties) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Traceability_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getConsole_3087OutgoingLinks(View view) {
		Console modelElement = (Console) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Traceability_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getProblems_3088OutgoingLinks(View view) {
		Problems modelElement = (Problems) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Traceability_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getInit_3089OutgoingLinks(View view) {
		Init modelElement = (Init) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEnd_3090OutgoingLinks(View view) {
		End modelElement = (End) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTemporalCondition_3091OutgoingLinks(View view) {
		TemporalCondition modelElement = (TemporalCondition) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getNotification_3092OutgoingLinks(View view) {
		Notification modelElement = (Notification) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCondition_3093OutgoingLinks(View view) {
		Condition modelElement = (Condition) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getSessionPanel_3094OutgoingLinks(View view) {
		SessionPanel modelElement = (SessionPanel) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Traceability_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getChat_3095OutgoingLinks(View view) {
		Chat modelElement = (Chat) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Traceability_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTurnTakingTool_3096OutgoingLinks(View view) {
		TurnTakingTool modelElement = (TurnTakingTool) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Traceability_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTelepointer_3097OutgoingLinks(View view) {
		Telepointer modelElement = (Telepointer) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Traceability_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getRadarView_3098OutgoingLinks(View view) {
		RadarView modelElement = (RadarView) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Traceability_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getProperties_3099OutgoingLinks(View view) {
		Properties modelElement = (Properties) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Traceability_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getConsole_3100OutgoingLinks(View view) {
		Console modelElement = (Console) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Traceability_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getProblems_3101OutgoingLinks(View view) {
		Problems modelElement = (Problems) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Traceability_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getInit_3102OutgoingLinks(View view) {
		Init modelElement = (Init) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEnd_3103OutgoingLinks(View view) {
		End modelElement = (End) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTemporalCondition_3104OutgoingLinks(View view) {
		TemporalCondition modelElement = (TemporalCondition) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getNotification_3105OutgoingLinks(View view) {
		Notification modelElement = (Notification) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCondition_3106OutgoingLinks(View view) {
		Condition modelElement = (Condition) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Concurrency_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefMultimedia1_3107OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefMultimedia2_3108OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefMultimedia3_3109OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefMultimedia4_3110OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefMultimedia5_3111OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefMultimedia6_3112OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getMolefMultimedia7_3113OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getExclusiveEdition_3114OutgoingLinks(View view) {
		ExclusiveEdition modelElement = (ExclusiveEdition) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4017(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCollaborativeVisualization_3115OutgoingLinks(View view) {
		CollaborativeVisualization modelElement = (CollaborativeVisualization) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4017(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getIndividualVisualization_3116OutgoingLinks(View view) {
		IndividualVisualization modelElement = (IndividualVisualization) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4017(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getUserTask_3117OutgoingLinks(View view) {
		UserTask modelElement = (UserTask) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4017(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCTTAbstractTask_3118OutgoingLinks(View view) {
		CTTAbstractTask modelElement = (CTTAbstractTask) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4017(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getInteractiveTask_3119OutgoingLinks(View view) {
		InteractiveTask modelElement = (InteractiveTask) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4017(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getCTTCollaborativeTask_3120OutgoingLinks(View view) {
		CTTCollaborativeTask modelElement = (CTTCollaborativeTask) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4017(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getApplicationTask_3121OutgoingLinks(View view) {
		ApplicationTask modelElement = (ApplicationTask) view.getElement();
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Enabling_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Disabling_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IndependentConcurrency_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OrderIndependence_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SuspendResume_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DeterministicChoice_4017(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndeterministicChoice_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getInheritance_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getActing_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAssociation_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEnablingWOInformation_4004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEnablingWInformation_4005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getChoice_4006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getConcurrency_4007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getAggregation_4008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEnabling_4009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getDisabling_4010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getEnablingWithInformationPassing_4011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getDisablingWithInformationPassing_4012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getIndependentConcurrency_4013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getOrderIndependence_4014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getSuspendResume_4015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getConcurrencyWithInformationPassing_4016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getDeterministicChoice_4017OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getUndeterministicChoice_4018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<LciatLinkDescriptor> getTraceability_4019OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getContainedTypeModelFacetLinks_Inheritance_4001(
			LCIANDiagram container) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Inheritance) {
				continue;
			}
			Inheritance link = (Inheritance) linkObject;
			if (InheritanceEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SociogramNode dst = link.getTarget();
			SociogramNode src = link.getSource();
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.Inheritance_4001,
					InheritanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getContainedTypeModelFacetLinks_Acting_4002(LCIANDiagram container) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Acting) {
				continue;
			}
			Acting link = (Acting) linkObject;
			if (ActingEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SociogramNode dst = link.getTarget();
			SociogramNode src = link.getSource();
			result.add(
					new LciatLinkDescriptor(src, dst, link, LciatElementTypes.Acting_4002, ActingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getContainedTypeModelFacetLinks_Association_4003(
			LCIANDiagram container) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SociogramNode dst = link.getTarget();
			SociogramNode src = link.getSource();
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.Association_4003,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getContainedTypeModelFacetLinks_EnablingWOInformation_4004(
			LCIANDiagram container) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EnablingWOInformation) {
				continue;
			}
			EnablingWOInformation link = (EnablingWOInformation) linkObject;
			if (EnablingWOInformationEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			LearningNode dst = link.getTarget();
			LearningNode src = link.getSource();
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.EnablingWOInformation_4004,
					EnablingWOInformationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getContainedTypeModelFacetLinks_EnablingWInformation_4005(
			LCIANDiagram container) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EnablingWInformation) {
				continue;
			}
			EnablingWInformation link = (EnablingWInformation) linkObject;
			if (EnablingWInformationEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			LearningNode dst = link.getTarget();
			LearningNode src = link.getSource();
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.EnablingWInformation_4005,
					EnablingWInformationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getContainedTypeModelFacetLinks_Choice_4006(LCIANDiagram container) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Choice) {
				continue;
			}
			Choice link = (Choice) linkObject;
			if (ChoiceEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			LearningNode dst = link.getTarget();
			LearningNode src = link.getSource();
			result.add(
					new LciatLinkDescriptor(src, dst, link, LciatElementTypes.Choice_4006, ChoiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getContainedTypeModelFacetLinks_Concurrency_4007(
			LCIANDiagram container) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Concurrency) {
				continue;
			}
			Concurrency link = (Concurrency) linkObject;
			if (ConcurrencyEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			LearningNode dst = link.getTarget();
			LearningNode src = link.getSource();
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.Concurrency_4007,
					ConcurrencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getContainedTypeModelFacetLinks_Aggregation_4008(
			LCIANDiagram container) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Aggregation) {
				continue;
			}
			Aggregation link = (Aggregation) linkObject;
			if (AggregationEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask dst = link.getTarget();
			CTTTask src = link.getSource();
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.Aggregation_4008,
					AggregationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getContainedTypeModelFacetLinks_Enabling_4009(
			LCIANDiagram container) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Enabling) {
				continue;
			}
			Enabling link = (Enabling) linkObject;
			if (EnablingEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask dst = link.getTarget();
			CTTTask src = link.getSource();
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.Enabling_4009,
					EnablingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getContainedTypeModelFacetLinks_Disabling_4010(
			LCIANDiagram container) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Disabling) {
				continue;
			}
			Disabling link = (Disabling) linkObject;
			if (DisablingEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask dst = link.getTarget();
			CTTTask src = link.getSource();
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.Disabling_4010,
					DisablingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getContainedTypeModelFacetLinks_EnablingWithInformationPassing_4011(
			LCIANDiagram container) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EnablingWithInformationPassing) {
				continue;
			}
			EnablingWithInformationPassing link = (EnablingWithInformationPassing) linkObject;
			if (EnablingWithInformationPassingEditPart.VISUAL_ID != LciatVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask dst = link.getTarget();
			CTTTask src = link.getSource();
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.EnablingWithInformationPassing_4011,
					EnablingWithInformationPassingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getContainedTypeModelFacetLinks_DisablingWithInformationPassing_4012(
			LCIANDiagram container) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DisablingWithInformationPassing) {
				continue;
			}
			DisablingWithInformationPassing link = (DisablingWithInformationPassing) linkObject;
			if (DisablingWithInformationPassingEditPart.VISUAL_ID != LciatVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask dst = link.getTarget();
			CTTTask src = link.getSource();
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.DisablingWithInformationPassing_4012,
					DisablingWithInformationPassingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getContainedTypeModelFacetLinks_IndependentConcurrency_4013(
			LCIANDiagram container) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof IndependentConcurrency) {
				continue;
			}
			IndependentConcurrency link = (IndependentConcurrency) linkObject;
			if (IndependentConcurrencyEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask dst = link.getTarget();
			CTTTask src = link.getSource();
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.IndependentConcurrency_4013,
					IndependentConcurrencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getContainedTypeModelFacetLinks_OrderIndependence_4014(
			LCIANDiagram container) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OrderIndependence) {
				continue;
			}
			OrderIndependence link = (OrderIndependence) linkObject;
			if (OrderIndependenceEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask dst = link.getTarget();
			CTTTask src = link.getSource();
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.OrderIndependence_4014,
					OrderIndependenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getContainedTypeModelFacetLinks_SuspendResume_4015(
			LCIANDiagram container) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SuspendResume) {
				continue;
			}
			SuspendResume link = (SuspendResume) linkObject;
			if (SuspendResumeEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask dst = link.getTarget();
			CTTTask src = link.getSource();
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.SuspendResume_4015,
					SuspendResumeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getContainedTypeModelFacetLinks_ConcurrencyWithInformationPassing_4016(
			LCIANDiagram container) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ConcurrencyWithInformationPassing) {
				continue;
			}
			ConcurrencyWithInformationPassing link = (ConcurrencyWithInformationPassing) linkObject;
			if (ConcurrencyWithInformationPassingEditPart.VISUAL_ID != LciatVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask dst = link.getTarget();
			CTTTask src = link.getSource();
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.ConcurrencyWithInformationPassing_4016,
					ConcurrencyWithInformationPassingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getContainedTypeModelFacetLinks_DeterministicChoice_4017(
			LCIANDiagram container) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DeterministicChoice) {
				continue;
			}
			DeterministicChoice link = (DeterministicChoice) linkObject;
			if (DeterministicChoiceEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask dst = link.getTarget();
			CTTTask src = link.getSource();
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.DeterministicChoice_4017,
					DeterministicChoiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getContainedTypeModelFacetLinks_UndeterministicChoice_4018(
			LCIANDiagram container) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof UndeterministicChoice) {
				continue;
			}
			UndeterministicChoice link = (UndeterministicChoice) linkObject;
			if (UndeterministicChoiceEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask dst = link.getTarget();
			CTTTask src = link.getSource();
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.UndeterministicChoice_4018,
					UndeterministicChoiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getContainedTypeModelFacetLinks_Traceability_4019(
			LCIANDiagram container) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Traceability) {
				continue;
			}
			Traceability link = (Traceability) linkObject;
			if (TraceabilityEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Tool dst = link.getToolelement();
			Awareness src = link.getAwarelement();
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.Traceability_4019,
					TraceabilityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LciatLinkDescriptor> getIncomingTypeModelFacetLinks_Inheritance_4001(SociogramNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != LciatPackage.eINSTANCE.getSociogramLink_Target()
					|| false == setting.getEObject() instanceof Inheritance) {
				continue;
			}
			Inheritance link = (Inheritance) setting.getEObject();
			if (InheritanceEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SociogramNode src = link.getSource();
			result.add(new LciatLinkDescriptor(src, target, link, LciatElementTypes.Inheritance_4001,
					InheritanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LciatLinkDescriptor> getIncomingTypeModelFacetLinks_Acting_4002(SociogramNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != LciatPackage.eINSTANCE.getSociogramLink_Target()
					|| false == setting.getEObject() instanceof Acting) {
				continue;
			}
			Acting link = (Acting) setting.getEObject();
			if (ActingEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SociogramNode src = link.getSource();
			result.add(new LciatLinkDescriptor(src, target, link, LciatElementTypes.Acting_4002,
					ActingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LciatLinkDescriptor> getIncomingTypeModelFacetLinks_Association_4003(SociogramNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != LciatPackage.eINSTANCE.getSociogramLink_Target()
					|| false == setting.getEObject() instanceof Association) {
				continue;
			}
			Association link = (Association) setting.getEObject();
			if (AssociationEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SociogramNode src = link.getSource();
			result.add(new LciatLinkDescriptor(src, target, link, LciatElementTypes.Association_4003,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LciatLinkDescriptor> getIncomingTypeModelFacetLinks_EnablingWOInformation_4004(
			LearningNode target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != LciatPackage.eINSTANCE.getLearningLink_Target()
					|| false == setting.getEObject() instanceof EnablingWOInformation) {
				continue;
			}
			EnablingWOInformation link = (EnablingWOInformation) setting.getEObject();
			if (EnablingWOInformationEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			LearningNode src = link.getSource();
			result.add(new LciatLinkDescriptor(src, target, link, LciatElementTypes.EnablingWOInformation_4004,
					EnablingWOInformationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LciatLinkDescriptor> getIncomingTypeModelFacetLinks_EnablingWInformation_4005(
			LearningNode target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != LciatPackage.eINSTANCE.getLearningLink_Target()
					|| false == setting.getEObject() instanceof EnablingWInformation) {
				continue;
			}
			EnablingWInformation link = (EnablingWInformation) setting.getEObject();
			if (EnablingWInformationEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			LearningNode src = link.getSource();
			result.add(new LciatLinkDescriptor(src, target, link, LciatElementTypes.EnablingWInformation_4005,
					EnablingWInformationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LciatLinkDescriptor> getIncomingTypeModelFacetLinks_Choice_4006(LearningNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != LciatPackage.eINSTANCE.getLearningLink_Target()
					|| false == setting.getEObject() instanceof Choice) {
				continue;
			}
			Choice link = (Choice) setting.getEObject();
			if (ChoiceEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			LearningNode src = link.getSource();
			result.add(new LciatLinkDescriptor(src, target, link, LciatElementTypes.Choice_4006,
					ChoiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LciatLinkDescriptor> getIncomingTypeModelFacetLinks_Concurrency_4007(LearningNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != LciatPackage.eINSTANCE.getLearningLink_Target()
					|| false == setting.getEObject() instanceof Concurrency) {
				continue;
			}
			Concurrency link = (Concurrency) setting.getEObject();
			if (ConcurrencyEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			LearningNode src = link.getSource();
			result.add(new LciatLinkDescriptor(src, target, link, LciatElementTypes.Concurrency_4007,
					ConcurrencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LciatLinkDescriptor> getIncomingTypeModelFacetLinks_Aggregation_4008(CTTTask target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != LciatPackage.eINSTANCE.getCTTLink_Target()
					|| false == setting.getEObject() instanceof Aggregation) {
				continue;
			}
			Aggregation link = (Aggregation) setting.getEObject();
			if (AggregationEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask src = link.getSource();
			result.add(new LciatLinkDescriptor(src, target, link, LciatElementTypes.Aggregation_4008,
					AggregationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LciatLinkDescriptor> getIncomingTypeModelFacetLinks_Enabling_4009(CTTTask target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != LciatPackage.eINSTANCE.getCTTLink_Target()
					|| false == setting.getEObject() instanceof Enabling) {
				continue;
			}
			Enabling link = (Enabling) setting.getEObject();
			if (EnablingEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask src = link.getSource();
			result.add(new LciatLinkDescriptor(src, target, link, LciatElementTypes.Enabling_4009,
					EnablingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LciatLinkDescriptor> getIncomingTypeModelFacetLinks_Disabling_4010(CTTTask target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != LciatPackage.eINSTANCE.getCTTLink_Target()
					|| false == setting.getEObject() instanceof Disabling) {
				continue;
			}
			Disabling link = (Disabling) setting.getEObject();
			if (DisablingEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask src = link.getSource();
			result.add(new LciatLinkDescriptor(src, target, link, LciatElementTypes.Disabling_4010,
					DisablingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LciatLinkDescriptor> getIncomingTypeModelFacetLinks_EnablingWithInformationPassing_4011(
			CTTTask target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != LciatPackage.eINSTANCE.getCTTLink_Target()
					|| false == setting.getEObject() instanceof EnablingWithInformationPassing) {
				continue;
			}
			EnablingWithInformationPassing link = (EnablingWithInformationPassing) setting.getEObject();
			if (EnablingWithInformationPassingEditPart.VISUAL_ID != LciatVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask src = link.getSource();
			result.add(new LciatLinkDescriptor(src, target, link, LciatElementTypes.EnablingWithInformationPassing_4011,
					EnablingWithInformationPassingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LciatLinkDescriptor> getIncomingTypeModelFacetLinks_DisablingWithInformationPassing_4012(
			CTTTask target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != LciatPackage.eINSTANCE.getCTTLink_Target()
					|| false == setting.getEObject() instanceof DisablingWithInformationPassing) {
				continue;
			}
			DisablingWithInformationPassing link = (DisablingWithInformationPassing) setting.getEObject();
			if (DisablingWithInformationPassingEditPart.VISUAL_ID != LciatVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask src = link.getSource();
			result.add(
					new LciatLinkDescriptor(src, target, link, LciatElementTypes.DisablingWithInformationPassing_4012,
							DisablingWithInformationPassingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LciatLinkDescriptor> getIncomingTypeModelFacetLinks_IndependentConcurrency_4013(
			CTTTask target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != LciatPackage.eINSTANCE.getCTTLink_Target()
					|| false == setting.getEObject() instanceof IndependentConcurrency) {
				continue;
			}
			IndependentConcurrency link = (IndependentConcurrency) setting.getEObject();
			if (IndependentConcurrencyEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask src = link.getSource();
			result.add(new LciatLinkDescriptor(src, target, link, LciatElementTypes.IndependentConcurrency_4013,
					IndependentConcurrencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LciatLinkDescriptor> getIncomingTypeModelFacetLinks_OrderIndependence_4014(CTTTask target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != LciatPackage.eINSTANCE.getCTTLink_Target()
					|| false == setting.getEObject() instanceof OrderIndependence) {
				continue;
			}
			OrderIndependence link = (OrderIndependence) setting.getEObject();
			if (OrderIndependenceEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask src = link.getSource();
			result.add(new LciatLinkDescriptor(src, target, link, LciatElementTypes.OrderIndependence_4014,
					OrderIndependenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LciatLinkDescriptor> getIncomingTypeModelFacetLinks_SuspendResume_4015(CTTTask target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != LciatPackage.eINSTANCE.getCTTLink_Target()
					|| false == setting.getEObject() instanceof SuspendResume) {
				continue;
			}
			SuspendResume link = (SuspendResume) setting.getEObject();
			if (SuspendResumeEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask src = link.getSource();
			result.add(new LciatLinkDescriptor(src, target, link, LciatElementTypes.SuspendResume_4015,
					SuspendResumeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LciatLinkDescriptor> getIncomingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4016(
			CTTTask target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != LciatPackage.eINSTANCE.getCTTLink_Target()
					|| false == setting.getEObject() instanceof ConcurrencyWithInformationPassing) {
				continue;
			}
			ConcurrencyWithInformationPassing link = (ConcurrencyWithInformationPassing) setting.getEObject();
			if (ConcurrencyWithInformationPassingEditPart.VISUAL_ID != LciatVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask src = link.getSource();
			result.add(
					new LciatLinkDescriptor(src, target, link, LciatElementTypes.ConcurrencyWithInformationPassing_4016,
							ConcurrencyWithInformationPassingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LciatLinkDescriptor> getIncomingTypeModelFacetLinks_DeterministicChoice_4017(
			CTTTask target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != LciatPackage.eINSTANCE.getCTTLink_Target()
					|| false == setting.getEObject() instanceof DeterministicChoice) {
				continue;
			}
			DeterministicChoice link = (DeterministicChoice) setting.getEObject();
			if (DeterministicChoiceEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask src = link.getSource();
			result.add(new LciatLinkDescriptor(src, target, link, LciatElementTypes.DeterministicChoice_4017,
					DeterministicChoiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LciatLinkDescriptor> getIncomingTypeModelFacetLinks_UndeterministicChoice_4018(
			CTTTask target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != LciatPackage.eINSTANCE.getCTTLink_Target()
					|| false == setting.getEObject() instanceof UndeterministicChoice) {
				continue;
			}
			UndeterministicChoice link = (UndeterministicChoice) setting.getEObject();
			if (UndeterministicChoiceEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask src = link.getSource();
			result.add(new LciatLinkDescriptor(src, target, link, LciatElementTypes.UndeterministicChoice_4018,
					UndeterministicChoiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<LciatLinkDescriptor> getIncomingTypeModelFacetLinks_Traceability_4019(Tool target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != LciatPackage.eINSTANCE.getTraceability_Toolelement()
					|| false == setting.getEObject() instanceof Traceability) {
				continue;
			}
			Traceability link = (Traceability) setting.getEObject();
			if (TraceabilityEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Awareness src = link.getAwarelement();
			result.add(new LciatLinkDescriptor(src, target, link, LciatElementTypes.Traceability_4019,
					TraceabilityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getOutgoingTypeModelFacetLinks_Inheritance_4001(
			SociogramNode source) {
		LCIANDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof LCIANDiagram) {
				container = (LCIANDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Inheritance) {
				continue;
			}
			Inheritance link = (Inheritance) linkObject;
			if (InheritanceEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SociogramNode dst = link.getTarget();
			SociogramNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.Inheritance_4001,
					InheritanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getOutgoingTypeModelFacetLinks_Acting_4002(SociogramNode source) {
		LCIANDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof LCIANDiagram) {
				container = (LCIANDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Acting) {
				continue;
			}
			Acting link = (Acting) linkObject;
			if (ActingEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SociogramNode dst = link.getTarget();
			SociogramNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(
					new LciatLinkDescriptor(src, dst, link, LciatElementTypes.Acting_4002, ActingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getOutgoingTypeModelFacetLinks_Association_4003(
			SociogramNode source) {
		LCIANDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof LCIANDiagram) {
				container = (LCIANDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SociogramNode dst = link.getTarget();
			SociogramNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.Association_4003,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getOutgoingTypeModelFacetLinks_EnablingWOInformation_4004(
			LearningNode source) {
		LCIANDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof LCIANDiagram) {
				container = (LCIANDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EnablingWOInformation) {
				continue;
			}
			EnablingWOInformation link = (EnablingWOInformation) linkObject;
			if (EnablingWOInformationEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			LearningNode dst = link.getTarget();
			LearningNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.EnablingWOInformation_4004,
					EnablingWOInformationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getOutgoingTypeModelFacetLinks_EnablingWInformation_4005(
			LearningNode source) {
		LCIANDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof LCIANDiagram) {
				container = (LCIANDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EnablingWInformation) {
				continue;
			}
			EnablingWInformation link = (EnablingWInformation) linkObject;
			if (EnablingWInformationEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			LearningNode dst = link.getTarget();
			LearningNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.EnablingWInformation_4005,
					EnablingWInformationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getOutgoingTypeModelFacetLinks_Choice_4006(LearningNode source) {
		LCIANDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof LCIANDiagram) {
				container = (LCIANDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Choice) {
				continue;
			}
			Choice link = (Choice) linkObject;
			if (ChoiceEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			LearningNode dst = link.getTarget();
			LearningNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(
					new LciatLinkDescriptor(src, dst, link, LciatElementTypes.Choice_4006, ChoiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getOutgoingTypeModelFacetLinks_Concurrency_4007(
			LearningNode source) {
		LCIANDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof LCIANDiagram) {
				container = (LCIANDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Concurrency) {
				continue;
			}
			Concurrency link = (Concurrency) linkObject;
			if (ConcurrencyEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			LearningNode dst = link.getTarget();
			LearningNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.Concurrency_4007,
					ConcurrencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getOutgoingTypeModelFacetLinks_Aggregation_4008(CTTTask source) {
		LCIANDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof LCIANDiagram) {
				container = (LCIANDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Aggregation) {
				continue;
			}
			Aggregation link = (Aggregation) linkObject;
			if (AggregationEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask dst = link.getTarget();
			CTTTask src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.Aggregation_4008,
					AggregationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getOutgoingTypeModelFacetLinks_Enabling_4009(CTTTask source) {
		LCIANDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof LCIANDiagram) {
				container = (LCIANDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Enabling) {
				continue;
			}
			Enabling link = (Enabling) linkObject;
			if (EnablingEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask dst = link.getTarget();
			CTTTask src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.Enabling_4009,
					EnablingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getOutgoingTypeModelFacetLinks_Disabling_4010(CTTTask source) {
		LCIANDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof LCIANDiagram) {
				container = (LCIANDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Disabling) {
				continue;
			}
			Disabling link = (Disabling) linkObject;
			if (DisablingEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask dst = link.getTarget();
			CTTTask src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.Disabling_4010,
					DisablingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getOutgoingTypeModelFacetLinks_EnablingWithInformationPassing_4011(
			CTTTask source) {
		LCIANDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof LCIANDiagram) {
				container = (LCIANDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EnablingWithInformationPassing) {
				continue;
			}
			EnablingWithInformationPassing link = (EnablingWithInformationPassing) linkObject;
			if (EnablingWithInformationPassingEditPart.VISUAL_ID != LciatVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask dst = link.getTarget();
			CTTTask src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.EnablingWithInformationPassing_4011,
					EnablingWithInformationPassingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getOutgoingTypeModelFacetLinks_DisablingWithInformationPassing_4012(
			CTTTask source) {
		LCIANDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof LCIANDiagram) {
				container = (LCIANDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DisablingWithInformationPassing) {
				continue;
			}
			DisablingWithInformationPassing link = (DisablingWithInformationPassing) linkObject;
			if (DisablingWithInformationPassingEditPart.VISUAL_ID != LciatVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask dst = link.getTarget();
			CTTTask src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.DisablingWithInformationPassing_4012,
					DisablingWithInformationPassingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getOutgoingTypeModelFacetLinks_IndependentConcurrency_4013(
			CTTTask source) {
		LCIANDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof LCIANDiagram) {
				container = (LCIANDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof IndependentConcurrency) {
				continue;
			}
			IndependentConcurrency link = (IndependentConcurrency) linkObject;
			if (IndependentConcurrencyEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask dst = link.getTarget();
			CTTTask src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.IndependentConcurrency_4013,
					IndependentConcurrencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getOutgoingTypeModelFacetLinks_OrderIndependence_4014(
			CTTTask source) {
		LCIANDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof LCIANDiagram) {
				container = (LCIANDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OrderIndependence) {
				continue;
			}
			OrderIndependence link = (OrderIndependence) linkObject;
			if (OrderIndependenceEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask dst = link.getTarget();
			CTTTask src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.OrderIndependence_4014,
					OrderIndependenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getOutgoingTypeModelFacetLinks_SuspendResume_4015(CTTTask source) {
		LCIANDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof LCIANDiagram) {
				container = (LCIANDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SuspendResume) {
				continue;
			}
			SuspendResume link = (SuspendResume) linkObject;
			if (SuspendResumeEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask dst = link.getTarget();
			CTTTask src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.SuspendResume_4015,
					SuspendResumeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getOutgoingTypeModelFacetLinks_ConcurrencyWithInformationPassing_4016(
			CTTTask source) {
		LCIANDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof LCIANDiagram) {
				container = (LCIANDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ConcurrencyWithInformationPassing) {
				continue;
			}
			ConcurrencyWithInformationPassing link = (ConcurrencyWithInformationPassing) linkObject;
			if (ConcurrencyWithInformationPassingEditPart.VISUAL_ID != LciatVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask dst = link.getTarget();
			CTTTask src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.ConcurrencyWithInformationPassing_4016,
					ConcurrencyWithInformationPassingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getOutgoingTypeModelFacetLinks_DeterministicChoice_4017(
			CTTTask source) {
		LCIANDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof LCIANDiagram) {
				container = (LCIANDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DeterministicChoice) {
				continue;
			}
			DeterministicChoice link = (DeterministicChoice) linkObject;
			if (DeterministicChoiceEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask dst = link.getTarget();
			CTTTask src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.DeterministicChoice_4017,
					DeterministicChoiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getOutgoingTypeModelFacetLinks_UndeterministicChoice_4018(
			CTTTask source) {
		LCIANDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof LCIANDiagram) {
				container = (LCIANDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof UndeterministicChoice) {
				continue;
			}
			UndeterministicChoice link = (UndeterministicChoice) linkObject;
			if (UndeterministicChoiceEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			CTTTask dst = link.getTarget();
			CTTTask src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.UndeterministicChoice_4018,
					UndeterministicChoiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<LciatLinkDescriptor> getOutgoingTypeModelFacetLinks_Traceability_4019(Awareness source) {
		LCIANDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof LCIANDiagram) {
				container = (LCIANDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<LciatLinkDescriptor> result = new LinkedList<LciatLinkDescriptor>();
		for (Iterator<?> links = container.getItsLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Traceability) {
				continue;
			}
			Traceability link = (Traceability) linkObject;
			if (TraceabilityEditPart.VISUAL_ID != LciatVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Tool dst = link.getToolelement();
			Awareness src = link.getAwarelement();
			if (src != source) {
				continue;
			}
			result.add(new LciatLinkDescriptor(src, dst, link, LciatElementTypes.Traceability_4019,
					TraceabilityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<LciatNodeDescriptor> getSemanticChildren(View view) {
			return LciatDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<LciatLinkDescriptor> getContainedLinks(View view) {
			return LciatDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<LciatLinkDescriptor> getIncomingLinks(View view) {
			return LciatDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<LciatLinkDescriptor> getOutgoingLinks(View view) {
			return LciatDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
