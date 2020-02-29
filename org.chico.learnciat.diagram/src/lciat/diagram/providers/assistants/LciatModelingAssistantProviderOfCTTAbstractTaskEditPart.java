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

import lciat.diagram.edit.parts.ApplicationTaskEditPart;
import lciat.diagram.edit.parts.CTTAbstractTaskEditPart;
import lciat.diagram.edit.parts.CTTCollaborativeTaskEditPart;
import lciat.diagram.edit.parts.CollaborativeVisualizationEditPart;
import lciat.diagram.edit.parts.ExclusiveEditionEditPart;
import lciat.diagram.edit.parts.IndividualVisualizationEditPart;
import lciat.diagram.edit.parts.InteractiveTaskEditPart;
import lciat.diagram.edit.parts.UserTaskEditPart;
import lciat.diagram.providers.LciatElementTypes;
import lciat.diagram.providers.LciatModelingAssistantProvider;

/**
 * @generated
 */
public class LciatModelingAssistantProviderOfCTTAbstractTaskEditPart extends LciatModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((CTTAbstractTaskEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(CTTAbstractTaskEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(11);
		types.add(LciatElementTypes.Aggregation_4008);
		types.add(LciatElementTypes.Enabling_4009);
		types.add(LciatElementTypes.Disabling_4010);
		types.add(LciatElementTypes.EnablingWithInformationPassing_4011);
		types.add(LciatElementTypes.DisablingWithInformationPassing_4012);
		types.add(LciatElementTypes.IndependentConcurrency_4013);
		types.add(LciatElementTypes.OrderIndependence_4014);
		types.add(LciatElementTypes.SuspendResume_4015);
		types.add(LciatElementTypes.ConcurrencyWithInformationPassing_4016);
		types.add(LciatElementTypes.DeterministicChoice_4017);
		types.add(LciatElementTypes.UndeterministicChoice_4018);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((CTTAbstractTaskEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(CTTAbstractTaskEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ExclusiveEditionEditPart) {
			types.add(LciatElementTypes.Aggregation_4008);
		}
		if (targetEditPart instanceof CollaborativeVisualizationEditPart) {
			types.add(LciatElementTypes.Aggregation_4008);
		}
		if (targetEditPart instanceof IndividualVisualizationEditPart) {
			types.add(LciatElementTypes.Aggregation_4008);
		}
		if (targetEditPart instanceof UserTaskEditPart) {
			types.add(LciatElementTypes.Aggregation_4008);
		}
		if (targetEditPart instanceof CTTAbstractTaskEditPart) {
			types.add(LciatElementTypes.Aggregation_4008);
		}
		if (targetEditPart instanceof InteractiveTaskEditPart) {
			types.add(LciatElementTypes.Aggregation_4008);
		}
		if (targetEditPart instanceof CTTCollaborativeTaskEditPart) {
			types.add(LciatElementTypes.Aggregation_4008);
		}
		if (targetEditPart instanceof ApplicationTaskEditPart) {
			types.add(LciatElementTypes.Aggregation_4008);
		}
		if (targetEditPart instanceof ExclusiveEditionEditPart) {
			types.add(LciatElementTypes.Enabling_4009);
		}
		if (targetEditPart instanceof CollaborativeVisualizationEditPart) {
			types.add(LciatElementTypes.Enabling_4009);
		}
		if (targetEditPart instanceof IndividualVisualizationEditPart) {
			types.add(LciatElementTypes.Enabling_4009);
		}
		if (targetEditPart instanceof UserTaskEditPart) {
			types.add(LciatElementTypes.Enabling_4009);
		}
		if (targetEditPart instanceof CTTAbstractTaskEditPart) {
			types.add(LciatElementTypes.Enabling_4009);
		}
		if (targetEditPart instanceof InteractiveTaskEditPart) {
			types.add(LciatElementTypes.Enabling_4009);
		}
		if (targetEditPart instanceof CTTCollaborativeTaskEditPart) {
			types.add(LciatElementTypes.Enabling_4009);
		}
		if (targetEditPart instanceof ApplicationTaskEditPart) {
			types.add(LciatElementTypes.Enabling_4009);
		}
		if (targetEditPart instanceof ExclusiveEditionEditPart) {
			types.add(LciatElementTypes.Disabling_4010);
		}
		if (targetEditPart instanceof CollaborativeVisualizationEditPart) {
			types.add(LciatElementTypes.Disabling_4010);
		}
		if (targetEditPart instanceof IndividualVisualizationEditPart) {
			types.add(LciatElementTypes.Disabling_4010);
		}
		if (targetEditPart instanceof UserTaskEditPart) {
			types.add(LciatElementTypes.Disabling_4010);
		}
		if (targetEditPart instanceof CTTAbstractTaskEditPart) {
			types.add(LciatElementTypes.Disabling_4010);
		}
		if (targetEditPart instanceof InteractiveTaskEditPart) {
			types.add(LciatElementTypes.Disabling_4010);
		}
		if (targetEditPart instanceof CTTCollaborativeTaskEditPart) {
			types.add(LciatElementTypes.Disabling_4010);
		}
		if (targetEditPart instanceof ApplicationTaskEditPart) {
			types.add(LciatElementTypes.Disabling_4010);
		}
		if (targetEditPart instanceof ExclusiveEditionEditPart) {
			types.add(LciatElementTypes.EnablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof CollaborativeVisualizationEditPart) {
			types.add(LciatElementTypes.EnablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof IndividualVisualizationEditPart) {
			types.add(LciatElementTypes.EnablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof UserTaskEditPart) {
			types.add(LciatElementTypes.EnablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof CTTAbstractTaskEditPart) {
			types.add(LciatElementTypes.EnablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof InteractiveTaskEditPart) {
			types.add(LciatElementTypes.EnablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof CTTCollaborativeTaskEditPart) {
			types.add(LciatElementTypes.EnablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof ApplicationTaskEditPart) {
			types.add(LciatElementTypes.EnablingWithInformationPassing_4011);
		}
		if (targetEditPart instanceof ExclusiveEditionEditPart) {
			types.add(LciatElementTypes.DisablingWithInformationPassing_4012);
		}
		if (targetEditPart instanceof CollaborativeVisualizationEditPart) {
			types.add(LciatElementTypes.DisablingWithInformationPassing_4012);
		}
		if (targetEditPart instanceof IndividualVisualizationEditPart) {
			types.add(LciatElementTypes.DisablingWithInformationPassing_4012);
		}
		if (targetEditPart instanceof UserTaskEditPart) {
			types.add(LciatElementTypes.DisablingWithInformationPassing_4012);
		}
		if (targetEditPart instanceof CTTAbstractTaskEditPart) {
			types.add(LciatElementTypes.DisablingWithInformationPassing_4012);
		}
		if (targetEditPart instanceof InteractiveTaskEditPart) {
			types.add(LciatElementTypes.DisablingWithInformationPassing_4012);
		}
		if (targetEditPart instanceof CTTCollaborativeTaskEditPart) {
			types.add(LciatElementTypes.DisablingWithInformationPassing_4012);
		}
		if (targetEditPart instanceof ApplicationTaskEditPart) {
			types.add(LciatElementTypes.DisablingWithInformationPassing_4012);
		}
		if (targetEditPart instanceof ExclusiveEditionEditPart) {
			types.add(LciatElementTypes.IndependentConcurrency_4013);
		}
		if (targetEditPart instanceof CollaborativeVisualizationEditPart) {
			types.add(LciatElementTypes.IndependentConcurrency_4013);
		}
		if (targetEditPart instanceof IndividualVisualizationEditPart) {
			types.add(LciatElementTypes.IndependentConcurrency_4013);
		}
		if (targetEditPart instanceof UserTaskEditPart) {
			types.add(LciatElementTypes.IndependentConcurrency_4013);
		}
		if (targetEditPart instanceof CTTAbstractTaskEditPart) {
			types.add(LciatElementTypes.IndependentConcurrency_4013);
		}
		if (targetEditPart instanceof InteractiveTaskEditPart) {
			types.add(LciatElementTypes.IndependentConcurrency_4013);
		}
		if (targetEditPart instanceof CTTCollaborativeTaskEditPart) {
			types.add(LciatElementTypes.IndependentConcurrency_4013);
		}
		if (targetEditPart instanceof ApplicationTaskEditPart) {
			types.add(LciatElementTypes.IndependentConcurrency_4013);
		}
		if (targetEditPart instanceof ExclusiveEditionEditPart) {
			types.add(LciatElementTypes.OrderIndependence_4014);
		}
		if (targetEditPart instanceof CollaborativeVisualizationEditPart) {
			types.add(LciatElementTypes.OrderIndependence_4014);
		}
		if (targetEditPart instanceof IndividualVisualizationEditPart) {
			types.add(LciatElementTypes.OrderIndependence_4014);
		}
		if (targetEditPart instanceof UserTaskEditPart) {
			types.add(LciatElementTypes.OrderIndependence_4014);
		}
		if (targetEditPart instanceof CTTAbstractTaskEditPart) {
			types.add(LciatElementTypes.OrderIndependence_4014);
		}
		if (targetEditPart instanceof InteractiveTaskEditPart) {
			types.add(LciatElementTypes.OrderIndependence_4014);
		}
		if (targetEditPart instanceof CTTCollaborativeTaskEditPart) {
			types.add(LciatElementTypes.OrderIndependence_4014);
		}
		if (targetEditPart instanceof ApplicationTaskEditPart) {
			types.add(LciatElementTypes.OrderIndependence_4014);
		}
		if (targetEditPart instanceof ExclusiveEditionEditPart) {
			types.add(LciatElementTypes.SuspendResume_4015);
		}
		if (targetEditPart instanceof CollaborativeVisualizationEditPart) {
			types.add(LciatElementTypes.SuspendResume_4015);
		}
		if (targetEditPart instanceof IndividualVisualizationEditPart) {
			types.add(LciatElementTypes.SuspendResume_4015);
		}
		if (targetEditPart instanceof UserTaskEditPart) {
			types.add(LciatElementTypes.SuspendResume_4015);
		}
		if (targetEditPart instanceof CTTAbstractTaskEditPart) {
			types.add(LciatElementTypes.SuspendResume_4015);
		}
		if (targetEditPart instanceof InteractiveTaskEditPart) {
			types.add(LciatElementTypes.SuspendResume_4015);
		}
		if (targetEditPart instanceof CTTCollaborativeTaskEditPart) {
			types.add(LciatElementTypes.SuspendResume_4015);
		}
		if (targetEditPart instanceof ApplicationTaskEditPart) {
			types.add(LciatElementTypes.SuspendResume_4015);
		}
		if (targetEditPart instanceof ExclusiveEditionEditPart) {
			types.add(LciatElementTypes.ConcurrencyWithInformationPassing_4016);
		}
		if (targetEditPart instanceof CollaborativeVisualizationEditPart) {
			types.add(LciatElementTypes.ConcurrencyWithInformationPassing_4016);
		}
		if (targetEditPart instanceof IndividualVisualizationEditPart) {
			types.add(LciatElementTypes.ConcurrencyWithInformationPassing_4016);
		}
		if (targetEditPart instanceof UserTaskEditPart) {
			types.add(LciatElementTypes.ConcurrencyWithInformationPassing_4016);
		}
		if (targetEditPart instanceof CTTAbstractTaskEditPart) {
			types.add(LciatElementTypes.ConcurrencyWithInformationPassing_4016);
		}
		if (targetEditPart instanceof InteractiveTaskEditPart) {
			types.add(LciatElementTypes.ConcurrencyWithInformationPassing_4016);
		}
		if (targetEditPart instanceof CTTCollaborativeTaskEditPart) {
			types.add(LciatElementTypes.ConcurrencyWithInformationPassing_4016);
		}
		if (targetEditPart instanceof ApplicationTaskEditPart) {
			types.add(LciatElementTypes.ConcurrencyWithInformationPassing_4016);
		}
		if (targetEditPart instanceof ExclusiveEditionEditPart) {
			types.add(LciatElementTypes.DeterministicChoice_4017);
		}
		if (targetEditPart instanceof CollaborativeVisualizationEditPart) {
			types.add(LciatElementTypes.DeterministicChoice_4017);
		}
		if (targetEditPart instanceof IndividualVisualizationEditPart) {
			types.add(LciatElementTypes.DeterministicChoice_4017);
		}
		if (targetEditPart instanceof UserTaskEditPart) {
			types.add(LciatElementTypes.DeterministicChoice_4017);
		}
		if (targetEditPart instanceof CTTAbstractTaskEditPart) {
			types.add(LciatElementTypes.DeterministicChoice_4017);
		}
		if (targetEditPart instanceof InteractiveTaskEditPart) {
			types.add(LciatElementTypes.DeterministicChoice_4017);
		}
		if (targetEditPart instanceof CTTCollaborativeTaskEditPart) {
			types.add(LciatElementTypes.DeterministicChoice_4017);
		}
		if (targetEditPart instanceof ApplicationTaskEditPart) {
			types.add(LciatElementTypes.DeterministicChoice_4017);
		}
		if (targetEditPart instanceof ExclusiveEditionEditPart) {
			types.add(LciatElementTypes.UndeterministicChoice_4018);
		}
		if (targetEditPart instanceof CollaborativeVisualizationEditPart) {
			types.add(LciatElementTypes.UndeterministicChoice_4018);
		}
		if (targetEditPart instanceof IndividualVisualizationEditPart) {
			types.add(LciatElementTypes.UndeterministicChoice_4018);
		}
		if (targetEditPart instanceof UserTaskEditPart) {
			types.add(LciatElementTypes.UndeterministicChoice_4018);
		}
		if (targetEditPart instanceof CTTAbstractTaskEditPart) {
			types.add(LciatElementTypes.UndeterministicChoice_4018);
		}
		if (targetEditPart instanceof InteractiveTaskEditPart) {
			types.add(LciatElementTypes.UndeterministicChoice_4018);
		}
		if (targetEditPart instanceof CTTCollaborativeTaskEditPart) {
			types.add(LciatElementTypes.UndeterministicChoice_4018);
		}
		if (targetEditPart instanceof ApplicationTaskEditPart) {
			types.add(LciatElementTypes.UndeterministicChoice_4018);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((CTTAbstractTaskEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(CTTAbstractTaskEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == LciatElementTypes.Aggregation_4008) {
			types.add(LciatElementTypes.ExclusiveEdition_3114);
			types.add(LciatElementTypes.CollaborativeVisualization_3115);
			types.add(LciatElementTypes.IndividualVisualization_3116);
			types.add(LciatElementTypes.UserTask_3117);
			types.add(LciatElementTypes.CTTAbstractTask_3118);
			types.add(LciatElementTypes.InteractiveTask_3119);
			types.add(LciatElementTypes.CTTCollaborativeTask_3120);
			types.add(LciatElementTypes.ApplicationTask_3121);
		} else if (relationshipType == LciatElementTypes.Enabling_4009) {
			types.add(LciatElementTypes.ExclusiveEdition_3114);
			types.add(LciatElementTypes.CollaborativeVisualization_3115);
			types.add(LciatElementTypes.IndividualVisualization_3116);
			types.add(LciatElementTypes.UserTask_3117);
			types.add(LciatElementTypes.CTTAbstractTask_3118);
			types.add(LciatElementTypes.InteractiveTask_3119);
			types.add(LciatElementTypes.CTTCollaborativeTask_3120);
			types.add(LciatElementTypes.ApplicationTask_3121);
		} else if (relationshipType == LciatElementTypes.Disabling_4010) {
			types.add(LciatElementTypes.ExclusiveEdition_3114);
			types.add(LciatElementTypes.CollaborativeVisualization_3115);
			types.add(LciatElementTypes.IndividualVisualization_3116);
			types.add(LciatElementTypes.UserTask_3117);
			types.add(LciatElementTypes.CTTAbstractTask_3118);
			types.add(LciatElementTypes.InteractiveTask_3119);
			types.add(LciatElementTypes.CTTCollaborativeTask_3120);
			types.add(LciatElementTypes.ApplicationTask_3121);
		} else if (relationshipType == LciatElementTypes.EnablingWithInformationPassing_4011) {
			types.add(LciatElementTypes.ExclusiveEdition_3114);
			types.add(LciatElementTypes.CollaborativeVisualization_3115);
			types.add(LciatElementTypes.IndividualVisualization_3116);
			types.add(LciatElementTypes.UserTask_3117);
			types.add(LciatElementTypes.CTTAbstractTask_3118);
			types.add(LciatElementTypes.InteractiveTask_3119);
			types.add(LciatElementTypes.CTTCollaborativeTask_3120);
			types.add(LciatElementTypes.ApplicationTask_3121);
		} else if (relationshipType == LciatElementTypes.DisablingWithInformationPassing_4012) {
			types.add(LciatElementTypes.ExclusiveEdition_3114);
			types.add(LciatElementTypes.CollaborativeVisualization_3115);
			types.add(LciatElementTypes.IndividualVisualization_3116);
			types.add(LciatElementTypes.UserTask_3117);
			types.add(LciatElementTypes.CTTAbstractTask_3118);
			types.add(LciatElementTypes.InteractiveTask_3119);
			types.add(LciatElementTypes.CTTCollaborativeTask_3120);
			types.add(LciatElementTypes.ApplicationTask_3121);
		} else if (relationshipType == LciatElementTypes.IndependentConcurrency_4013) {
			types.add(LciatElementTypes.ExclusiveEdition_3114);
			types.add(LciatElementTypes.CollaborativeVisualization_3115);
			types.add(LciatElementTypes.IndividualVisualization_3116);
			types.add(LciatElementTypes.UserTask_3117);
			types.add(LciatElementTypes.CTTAbstractTask_3118);
			types.add(LciatElementTypes.InteractiveTask_3119);
			types.add(LciatElementTypes.CTTCollaborativeTask_3120);
			types.add(LciatElementTypes.ApplicationTask_3121);
		} else if (relationshipType == LciatElementTypes.OrderIndependence_4014) {
			types.add(LciatElementTypes.ExclusiveEdition_3114);
			types.add(LciatElementTypes.CollaborativeVisualization_3115);
			types.add(LciatElementTypes.IndividualVisualization_3116);
			types.add(LciatElementTypes.UserTask_3117);
			types.add(LciatElementTypes.CTTAbstractTask_3118);
			types.add(LciatElementTypes.InteractiveTask_3119);
			types.add(LciatElementTypes.CTTCollaborativeTask_3120);
			types.add(LciatElementTypes.ApplicationTask_3121);
		} else if (relationshipType == LciatElementTypes.SuspendResume_4015) {
			types.add(LciatElementTypes.ExclusiveEdition_3114);
			types.add(LciatElementTypes.CollaborativeVisualization_3115);
			types.add(LciatElementTypes.IndividualVisualization_3116);
			types.add(LciatElementTypes.UserTask_3117);
			types.add(LciatElementTypes.CTTAbstractTask_3118);
			types.add(LciatElementTypes.InteractiveTask_3119);
			types.add(LciatElementTypes.CTTCollaborativeTask_3120);
			types.add(LciatElementTypes.ApplicationTask_3121);
		} else if (relationshipType == LciatElementTypes.ConcurrencyWithInformationPassing_4016) {
			types.add(LciatElementTypes.ExclusiveEdition_3114);
			types.add(LciatElementTypes.CollaborativeVisualization_3115);
			types.add(LciatElementTypes.IndividualVisualization_3116);
			types.add(LciatElementTypes.UserTask_3117);
			types.add(LciatElementTypes.CTTAbstractTask_3118);
			types.add(LciatElementTypes.InteractiveTask_3119);
			types.add(LciatElementTypes.CTTCollaborativeTask_3120);
			types.add(LciatElementTypes.ApplicationTask_3121);
		} else if (relationshipType == LciatElementTypes.DeterministicChoice_4017) {
			types.add(LciatElementTypes.ExclusiveEdition_3114);
			types.add(LciatElementTypes.CollaborativeVisualization_3115);
			types.add(LciatElementTypes.IndividualVisualization_3116);
			types.add(LciatElementTypes.UserTask_3117);
			types.add(LciatElementTypes.CTTAbstractTask_3118);
			types.add(LciatElementTypes.InteractiveTask_3119);
			types.add(LciatElementTypes.CTTCollaborativeTask_3120);
			types.add(LciatElementTypes.ApplicationTask_3121);
		} else if (relationshipType == LciatElementTypes.UndeterministicChoice_4018) {
			types.add(LciatElementTypes.ExclusiveEdition_3114);
			types.add(LciatElementTypes.CollaborativeVisualization_3115);
			types.add(LciatElementTypes.IndividualVisualization_3116);
			types.add(LciatElementTypes.UserTask_3117);
			types.add(LciatElementTypes.CTTAbstractTask_3118);
			types.add(LciatElementTypes.InteractiveTask_3119);
			types.add(LciatElementTypes.CTTCollaborativeTask_3120);
			types.add(LciatElementTypes.ApplicationTask_3121);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((CTTAbstractTaskEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(CTTAbstractTaskEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(11);
		types.add(LciatElementTypes.Aggregation_4008);
		types.add(LciatElementTypes.Enabling_4009);
		types.add(LciatElementTypes.Disabling_4010);
		types.add(LciatElementTypes.EnablingWithInformationPassing_4011);
		types.add(LciatElementTypes.DisablingWithInformationPassing_4012);
		types.add(LciatElementTypes.IndependentConcurrency_4013);
		types.add(LciatElementTypes.OrderIndependence_4014);
		types.add(LciatElementTypes.SuspendResume_4015);
		types.add(LciatElementTypes.ConcurrencyWithInformationPassing_4016);
		types.add(LciatElementTypes.DeterministicChoice_4017);
		types.add(LciatElementTypes.UndeterministicChoice_4018);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((CTTAbstractTaskEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(CTTAbstractTaskEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == LciatElementTypes.Aggregation_4008) {
			types.add(LciatElementTypes.ExclusiveEdition_3114);
			types.add(LciatElementTypes.CollaborativeVisualization_3115);
			types.add(LciatElementTypes.IndividualVisualization_3116);
			types.add(LciatElementTypes.UserTask_3117);
			types.add(LciatElementTypes.CTTAbstractTask_3118);
			types.add(LciatElementTypes.InteractiveTask_3119);
			types.add(LciatElementTypes.CTTCollaborativeTask_3120);
			types.add(LciatElementTypes.ApplicationTask_3121);
		} else if (relationshipType == LciatElementTypes.Enabling_4009) {
			types.add(LciatElementTypes.ExclusiveEdition_3114);
			types.add(LciatElementTypes.CollaborativeVisualization_3115);
			types.add(LciatElementTypes.IndividualVisualization_3116);
			types.add(LciatElementTypes.UserTask_3117);
			types.add(LciatElementTypes.CTTAbstractTask_3118);
			types.add(LciatElementTypes.InteractiveTask_3119);
			types.add(LciatElementTypes.CTTCollaborativeTask_3120);
			types.add(LciatElementTypes.ApplicationTask_3121);
		} else if (relationshipType == LciatElementTypes.Disabling_4010) {
			types.add(LciatElementTypes.ExclusiveEdition_3114);
			types.add(LciatElementTypes.CollaborativeVisualization_3115);
			types.add(LciatElementTypes.IndividualVisualization_3116);
			types.add(LciatElementTypes.UserTask_3117);
			types.add(LciatElementTypes.CTTAbstractTask_3118);
			types.add(LciatElementTypes.InteractiveTask_3119);
			types.add(LciatElementTypes.CTTCollaborativeTask_3120);
			types.add(LciatElementTypes.ApplicationTask_3121);
		} else if (relationshipType == LciatElementTypes.EnablingWithInformationPassing_4011) {
			types.add(LciatElementTypes.ExclusiveEdition_3114);
			types.add(LciatElementTypes.CollaborativeVisualization_3115);
			types.add(LciatElementTypes.IndividualVisualization_3116);
			types.add(LciatElementTypes.UserTask_3117);
			types.add(LciatElementTypes.CTTAbstractTask_3118);
			types.add(LciatElementTypes.InteractiveTask_3119);
			types.add(LciatElementTypes.CTTCollaborativeTask_3120);
			types.add(LciatElementTypes.ApplicationTask_3121);
		} else if (relationshipType == LciatElementTypes.DisablingWithInformationPassing_4012) {
			types.add(LciatElementTypes.ExclusiveEdition_3114);
			types.add(LciatElementTypes.CollaborativeVisualization_3115);
			types.add(LciatElementTypes.IndividualVisualization_3116);
			types.add(LciatElementTypes.UserTask_3117);
			types.add(LciatElementTypes.CTTAbstractTask_3118);
			types.add(LciatElementTypes.InteractiveTask_3119);
			types.add(LciatElementTypes.CTTCollaborativeTask_3120);
			types.add(LciatElementTypes.ApplicationTask_3121);
		} else if (relationshipType == LciatElementTypes.IndependentConcurrency_4013) {
			types.add(LciatElementTypes.ExclusiveEdition_3114);
			types.add(LciatElementTypes.CollaborativeVisualization_3115);
			types.add(LciatElementTypes.IndividualVisualization_3116);
			types.add(LciatElementTypes.UserTask_3117);
			types.add(LciatElementTypes.CTTAbstractTask_3118);
			types.add(LciatElementTypes.InteractiveTask_3119);
			types.add(LciatElementTypes.CTTCollaborativeTask_3120);
			types.add(LciatElementTypes.ApplicationTask_3121);
		} else if (relationshipType == LciatElementTypes.OrderIndependence_4014) {
			types.add(LciatElementTypes.ExclusiveEdition_3114);
			types.add(LciatElementTypes.CollaborativeVisualization_3115);
			types.add(LciatElementTypes.IndividualVisualization_3116);
			types.add(LciatElementTypes.UserTask_3117);
			types.add(LciatElementTypes.CTTAbstractTask_3118);
			types.add(LciatElementTypes.InteractiveTask_3119);
			types.add(LciatElementTypes.CTTCollaborativeTask_3120);
			types.add(LciatElementTypes.ApplicationTask_3121);
		} else if (relationshipType == LciatElementTypes.SuspendResume_4015) {
			types.add(LciatElementTypes.ExclusiveEdition_3114);
			types.add(LciatElementTypes.CollaborativeVisualization_3115);
			types.add(LciatElementTypes.IndividualVisualization_3116);
			types.add(LciatElementTypes.UserTask_3117);
			types.add(LciatElementTypes.CTTAbstractTask_3118);
			types.add(LciatElementTypes.InteractiveTask_3119);
			types.add(LciatElementTypes.CTTCollaborativeTask_3120);
			types.add(LciatElementTypes.ApplicationTask_3121);
		} else if (relationshipType == LciatElementTypes.ConcurrencyWithInformationPassing_4016) {
			types.add(LciatElementTypes.ExclusiveEdition_3114);
			types.add(LciatElementTypes.CollaborativeVisualization_3115);
			types.add(LciatElementTypes.IndividualVisualization_3116);
			types.add(LciatElementTypes.UserTask_3117);
			types.add(LciatElementTypes.CTTAbstractTask_3118);
			types.add(LciatElementTypes.InteractiveTask_3119);
			types.add(LciatElementTypes.CTTCollaborativeTask_3120);
			types.add(LciatElementTypes.ApplicationTask_3121);
		} else if (relationshipType == LciatElementTypes.DeterministicChoice_4017) {
			types.add(LciatElementTypes.ExclusiveEdition_3114);
			types.add(LciatElementTypes.CollaborativeVisualization_3115);
			types.add(LciatElementTypes.IndividualVisualization_3116);
			types.add(LciatElementTypes.UserTask_3117);
			types.add(LciatElementTypes.CTTAbstractTask_3118);
			types.add(LciatElementTypes.InteractiveTask_3119);
			types.add(LciatElementTypes.CTTCollaborativeTask_3120);
			types.add(LciatElementTypes.ApplicationTask_3121);
		} else if (relationshipType == LciatElementTypes.UndeterministicChoice_4018) {
			types.add(LciatElementTypes.ExclusiveEdition_3114);
			types.add(LciatElementTypes.CollaborativeVisualization_3115);
			types.add(LciatElementTypes.IndividualVisualization_3116);
			types.add(LciatElementTypes.UserTask_3117);
			types.add(LciatElementTypes.CTTAbstractTask_3118);
			types.add(LciatElementTypes.InteractiveTask_3119);
			types.add(LciatElementTypes.CTTCollaborativeTask_3120);
			types.add(LciatElementTypes.ApplicationTask_3121);
		}
		return types;
	}

}
