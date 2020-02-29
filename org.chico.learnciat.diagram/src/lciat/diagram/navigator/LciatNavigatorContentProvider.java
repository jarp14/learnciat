/*
* 
*/
package lciat.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import lciat.diagram.edit.parts.*;
import lciat.diagram.part.LciatVisualIDRegistry;
import lciat.diagram.part.Messages;

/**
 * @generated
 */
public class LciatNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public LciatNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<LciatNavigatorItem> result = new ArrayList<LciatNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(
					createNavigatorItems(selectViewsByType(topViews, LCIANDiagramEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof LciatNavigatorGroup) {
			LciatNavigatorGroup group = (LciatNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof LciatNavigatorItem) {
			LciatNavigatorItem navigatorItem = (LciatNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (LciatVisualIDRegistry.getVisualID(view)) {

		case LCIANDiagramEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			LciatNavigatorGroup links = new LciatNavigatorGroup(Messages.NavigatorGroupName_LCIANDiagram_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SociogramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(LearningDiagramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTDiagramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InheritanceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ActingEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWithInformationPassingEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingWithInformationPassingEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndependentConcurrencyEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(OrderIndependenceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SuspendResumeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyWithInformationPassingEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DeterministicChoiceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UndeterministicChoiceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TraceabilityEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case SociogramEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SociogramSociogramItsSociogramNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(RolEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SociogramSociogramItsSociogramNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(GroupEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SociogramSociogramMfContentNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefContent1EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SociogramSociogramMfContentNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefContent2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SociogramSociogramMfContentNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefContent3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SociogramSociogramMfContentNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefContent4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SociogramSociogramMfContentNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefContent5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SociogramSociogramMfContentNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefContent6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case LearningDiagramEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefTActivities1EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefTActivities2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefTActivities3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefTActivities4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefTActivities5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefTActivities6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefTActivities7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefTActivities8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefSocial1EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefSocial2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefSocial3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefSocial4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefPersonalization1EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefPersonalization2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefPersonalization3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefPersonalization4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramMfLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefPersonalization5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(IndividualTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(GroupTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(AbstractTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(DetailedAbstractTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(SessionPanel2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(Chat2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(TurnTakingTool2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Telepointer2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(RadarView2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Properties2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Console2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Problems2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(Init2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(End2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(TemporalCondition2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Notification2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(LearningDiagramLearningDiagramLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Condition2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case CTTDiagramEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTDiagramCTTDiagramMfCttNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefMultimedia1EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTDiagramCTTDiagramMfCttNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefMultimedia2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTDiagramCTTDiagramMfCttNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefMultimedia3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTDiagramCTTDiagramMfCttNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefMultimedia4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTDiagramCTTDiagramMfCttNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefMultimedia5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTDiagramCTTDiagramMfCttNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefMultimedia6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTDiagramCTTDiagramMfCttNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(MolefMultimedia7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTDiagramCTTDiagramCttTasksCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(ExclusiveEditionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTDiagramCTTDiagramCttTasksCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(CollaborativeVisualizationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTDiagramCTTDiagramCttTasksCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(IndividualVisualizationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTDiagramCTTDiagramCttTasksCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(UserTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTDiagramCTTDiagramCttTasksCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(CTTAbstractTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTDiagramCTTDiagramCttTasksCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(InteractiveTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTDiagramCTTDiagramCttTasksCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(CTTCollaborativeTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTDiagramCTTDiagramCttTasksCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(ApplicationTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case RolEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Rol_3001_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Rol_3001_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InheritanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InheritanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ActingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ActingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case GroupEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Group_3002_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Group_3002_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InheritanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InheritanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ActingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ActingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case IndividualTaskEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_IndividualTask_3026_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_IndividualTask_3026_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskIndividualTaskTaskRolesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(Rol2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskIndividualTaskTaskRolesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(Group2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GraphicalEditorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TextEditorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CodeEditorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(WebViewerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskIndividualTaskSubtypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(AssimilativeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskIndividualTaskSubtypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(InformationHandlingEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskIndividualTaskSubtypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(AdaptiveEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskIndividualTaskSubtypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(CommunicativeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskIndividualTaskSubtypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(ProductiveEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskIndividualTaskSubtypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(ExperientialEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskIndividualTaskSubtypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(EvaluativeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskIndividualTaskSubtypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(SupportEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskIndividualTaskModalityCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(FaceToFaceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskIndividualTaskModalityCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(ComputerSupportedEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskIndividualTaskModalityCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(OnlineEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ToolEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(IndividualTaskIndividualTaskTaskObjectsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(ObjectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Rol2EditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Rol_3027_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Rol_3027_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InheritanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InheritanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ActingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ActingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Group2EditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Group_3028_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Group_3028_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InheritanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InheritanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ActingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ActingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case GraphicalEditorEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_GraphicalEditor_3029_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TraceabilityEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case TextEditorEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_TextEditor_3030_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TraceabilityEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case CodeEditorEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_CodeEditor_3031_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TraceabilityEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case WebViewerEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_WebViewer_3032_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TraceabilityEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ToolEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Tool_3044_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TraceabilityEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case GroupTaskEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_GroupTask_3046_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_GroupTask_3046_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskTaskRolesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(Rol3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskTaskRolesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(Group3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GraphicalEditorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TextEditorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CodeEditorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(WebViewerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskSubtypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Assimilative2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskSubtypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(InformationHandling2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskSubtypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Adaptive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskSubtypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Communicative2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskSubtypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Productive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskSubtypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Experiential2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskSubtypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Evaluative2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskSubtypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Support2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskModalityCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(FaceToFace2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskModalityCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(ComputerSupported2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskModalityCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Online2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ToolEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskTaskObjectsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Object2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Rol3EditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Rol_3047_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Rol_3047_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InheritanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InheritanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ActingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ActingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Group3EditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Group_3048_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Group_3048_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InheritanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InheritanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ActingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ActingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AbstractTaskEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_AbstractTask_3061_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_AbstractTask_3061_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskTaskRolesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(Rol4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskTaskRolesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(Group4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GraphicalEditorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TextEditorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CodeEditorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(WebViewerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskSubtypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Assimilative3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskSubtypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(InformationHandling3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskSubtypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Adaptive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskSubtypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Communicative3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskSubtypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Productive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskSubtypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Experiential3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskSubtypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Evaluative3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskSubtypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Support3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskModalityCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(FaceToFace3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskModalityCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(ComputerSupported3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskModalityCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Online3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ToolEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskTaskObjectsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Object3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Rol4EditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Rol_3062_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Rol_3062_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InheritanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InheritanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ActingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ActingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Group4EditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Group_3063_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Group_3063_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InheritanceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InheritanceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ActingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ActingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DetailedAbstractTaskEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_DetailedAbstractTask_3076_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_DetailedAbstractTask_3076_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(IndividualTask2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(GroupTask2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(AbstractTask2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(DetailedAbstractTask2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(SessionPanelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(ChatEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(TurnTakingToolEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(TelepointerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(RadarViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(PropertiesEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(ConsoleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(ProblemsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GraphicalEditorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TextEditorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CodeEditorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(WebViewerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(InitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(EndEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(TemporalConditionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(NotificationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(ConditionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ToolEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case IndividualTask2EditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_IndividualTask_3077_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_IndividualTask_3077_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskIndividualTaskTaskRolesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(Rol2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskIndividualTaskTaskRolesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(Group2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GraphicalEditorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TextEditorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CodeEditorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(WebViewerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskIndividualTaskSubtypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(AssimilativeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskIndividualTaskSubtypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(InformationHandlingEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskIndividualTaskSubtypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(AdaptiveEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskIndividualTaskSubtypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(CommunicativeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskIndividualTaskSubtypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(ProductiveEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskIndividualTaskSubtypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(ExperientialEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskIndividualTaskSubtypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(EvaluativeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskIndividualTaskSubtypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(SupportEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskIndividualTaskModalityCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(FaceToFaceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskIndividualTaskModalityCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(ComputerSupportedEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskIndividualTaskModalityCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(OnlineEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ToolEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(IndividualTaskIndividualTaskTaskObjectsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(ObjectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case GroupTask2EditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_GroupTask_3078_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_GroupTask_3078_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskTaskRolesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(Rol3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskTaskRolesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(Group3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GraphicalEditorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TextEditorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CodeEditorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(WebViewerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskSubtypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Assimilative2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskSubtypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(InformationHandling2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskSubtypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Adaptive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskSubtypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Communicative2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskSubtypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Productive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskSubtypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Experiential2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskSubtypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Evaluative2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskSubtypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Support2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskModalityCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(FaceToFace2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskModalityCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(ComputerSupported2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskModalityCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Online2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ToolEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskGroupTaskTaskObjectsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Object2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AbstractTask2EditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_AbstractTask_3079_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_AbstractTask_3079_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskTaskRolesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(Rol4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskTaskRolesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(Group4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GraphicalEditorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TextEditorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CodeEditorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(WebViewerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskSubtypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Assimilative3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskSubtypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(InformationHandling3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskSubtypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Adaptive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskSubtypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Communicative3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskSubtypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Productive3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskSubtypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Experiential3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskSubtypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Evaluative3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskSubtypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Support3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskModalityCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(FaceToFace3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskModalityCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(ComputerSupported3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskModalityCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Online3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ToolEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskTaskObjectsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(Object3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DetailedAbstractTask2EditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_DetailedAbstractTask_3080_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_DetailedAbstractTask_3080_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(IndividualTask2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(GroupTask2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(AbstractTask2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(DetailedAbstractTask2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(SessionPanelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(ChatEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(TurnTakingToolEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(TelepointerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(RadarViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(PropertiesEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(ConsoleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(ProblemsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GraphicalEditorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TextEditorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CodeEditorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(WebViewerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(InitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, LciatVisualIDRegistry.getType(EndEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(TemporalConditionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(NotificationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), LciatVisualIDRegistry
					.getType(DetailedAbstractTaskDetailedAbstractTaskLearningNodesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					LciatVisualIDRegistry.getType(ConditionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ToolEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SessionPanelEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_SessionPanel_3081_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_SessionPanel_3081_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TraceabilityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ChatEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Chat_3082_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Chat_3082_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TraceabilityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TurnTakingToolEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_TurnTakingTool_3083_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_TurnTakingTool_3083_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TraceabilityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TelepointerEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Telepointer_3084_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Telepointer_3084_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TraceabilityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RadarViewEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_RadarView_3085_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_RadarView_3085_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TraceabilityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PropertiesEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Properties_3086_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Properties_3086_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TraceabilityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ConsoleEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Console_3087_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Console_3087_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TraceabilityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ProblemsEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Problems_3088_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Problems_3088_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TraceabilityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case InitEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Init_3089_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Init_3089_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EndEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_End_3090_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_End_3090_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TemporalConditionEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_TemporalCondition_3091_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_TemporalCondition_3091_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case NotificationEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Notification_3092_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Notification_3092_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ConditionEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Condition_3093_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Condition_3093_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SessionPanel2EditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_SessionPanel_3094_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_SessionPanel_3094_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TraceabilityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Chat2EditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Chat_3095_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Chat_3095_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TraceabilityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TurnTakingTool2EditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_TurnTakingTool_3096_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_TurnTakingTool_3096_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TraceabilityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Telepointer2EditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Telepointer_3097_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Telepointer_3097_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TraceabilityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RadarView2EditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_RadarView_3098_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_RadarView_3098_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TraceabilityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Properties2EditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Properties_3099_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Properties_3099_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TraceabilityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Console2EditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Console_3100_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Console_3100_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TraceabilityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Problems2EditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Problems_3101_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Problems_3101_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TraceabilityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Init2EditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Init_3102_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Init_3102_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case End2EditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_End_3103_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_End_3103_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TemporalCondition2EditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_TemporalCondition_3104_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_TemporalCondition_3104_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Notification2EditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Notification_3105_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Notification_3105_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Condition2EditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Condition_3106_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_Condition_3106_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWOInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWInformationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ExclusiveEditionEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_ExclusiveEdition_3114_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_ExclusiveEdition_3114_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWithInformationPassingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWithInformationPassingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingWithInformationPassingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingWithInformationPassingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndependentConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndependentConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(OrderIndependenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(OrderIndependenceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SuspendResumeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SuspendResumeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyWithInformationPassingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyWithInformationPassingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DeterministicChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DeterministicChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UndeterministicChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UndeterministicChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CollaborativeVisualizationEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_CollaborativeVisualization_3115_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_CollaborativeVisualization_3115_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWithInformationPassingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWithInformationPassingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingWithInformationPassingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingWithInformationPassingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndependentConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndependentConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(OrderIndependenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(OrderIndependenceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SuspendResumeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SuspendResumeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyWithInformationPassingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyWithInformationPassingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DeterministicChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DeterministicChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UndeterministicChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UndeterministicChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case IndividualVisualizationEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_IndividualVisualization_3116_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_IndividualVisualization_3116_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWithInformationPassingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWithInformationPassingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingWithInformationPassingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingWithInformationPassingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndependentConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndependentConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(OrderIndependenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(OrderIndependenceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SuspendResumeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SuspendResumeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyWithInformationPassingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyWithInformationPassingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DeterministicChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DeterministicChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UndeterministicChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UndeterministicChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case UserTaskEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_UserTask_3117_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_UserTask_3117_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWithInformationPassingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWithInformationPassingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingWithInformationPassingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingWithInformationPassingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndependentConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndependentConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(OrderIndependenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(OrderIndependenceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SuspendResumeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SuspendResumeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyWithInformationPassingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyWithInformationPassingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DeterministicChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DeterministicChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UndeterministicChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UndeterministicChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CTTAbstractTaskEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_CTTAbstractTask_3118_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_CTTAbstractTask_3118_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWithInformationPassingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWithInformationPassingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingWithInformationPassingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingWithInformationPassingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndependentConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndependentConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(OrderIndependenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(OrderIndependenceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SuspendResumeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SuspendResumeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyWithInformationPassingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyWithInformationPassingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DeterministicChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DeterministicChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UndeterministicChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UndeterministicChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case InteractiveTaskEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_InteractiveTask_3119_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_InteractiveTask_3119_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWithInformationPassingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWithInformationPassingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingWithInformationPassingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingWithInformationPassingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndependentConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndependentConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(OrderIndependenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(OrderIndependenceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SuspendResumeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SuspendResumeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyWithInformationPassingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyWithInformationPassingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DeterministicChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DeterministicChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UndeterministicChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UndeterministicChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CTTCollaborativeTaskEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_CTTCollaborativeTask_3120_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_CTTCollaborativeTask_3120_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWithInformationPassingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWithInformationPassingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingWithInformationPassingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingWithInformationPassingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndependentConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndependentConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(OrderIndependenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(OrderIndependenceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SuspendResumeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SuspendResumeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyWithInformationPassingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyWithInformationPassingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DeterministicChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DeterministicChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UndeterministicChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UndeterministicChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ApplicationTaskEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Node sv = (Node) view;
			LciatNavigatorGroup incominglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_ApplicationTask_3121_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup outgoinglinks = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_ApplicationTask_3121_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWithInformationPassingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EnablingWithInformationPassingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingWithInformationPassingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DisablingWithInformationPassingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndependentConcurrencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndependentConcurrencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(OrderIndependenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(OrderIndependenceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SuspendResumeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SuspendResumeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyWithInformationPassingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConcurrencyWithInformationPassingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DeterministicChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DeterministicChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UndeterministicChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UndeterministicChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case InheritanceEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			LciatNavigatorGroup target = new LciatNavigatorGroup(Messages.NavigatorGroupName_Inheritance_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup source = new LciatNavigatorGroup(Messages.NavigatorGroupName_Inheritance_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(RolEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Rol2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Group2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Rol3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Group3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Rol4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Group4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(RolEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Rol2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Group2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Rol3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Group3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Rol4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Group4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ActingEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			LciatNavigatorGroup target = new LciatNavigatorGroup(Messages.NavigatorGroupName_Acting_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup source = new LciatNavigatorGroup(Messages.NavigatorGroupName_Acting_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(RolEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Rol2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Group2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Rol3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Group3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Rol4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Group4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(RolEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Rol2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Group2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Rol3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Group3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Rol4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Group4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AssociationEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			LciatNavigatorGroup target = new LciatNavigatorGroup(Messages.NavigatorGroupName_Association_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup source = new LciatNavigatorGroup(Messages.NavigatorGroupName_Association_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(RolEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Rol2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Group2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Rol3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Group3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Rol4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Group4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(RolEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Rol2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Group2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Rol3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Group3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Rol4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Group4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case EnablingWOInformationEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			LciatNavigatorGroup target = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_EnablingWOInformation_4004_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup source = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_EnablingWOInformation_4004_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DetailedAbstractTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTask2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTask2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTask2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DetailedAbstractTask2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SessionPanelEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChatEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TurnTakingToolEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TelepointerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(RadarViewEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(PropertiesEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConsoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ProblemsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InitEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EndEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TemporalConditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(NotificationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SessionPanel2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Chat2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TurnTakingTool2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Telepointer2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(RadarView2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Properties2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Console2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Problems2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Init2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(End2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TemporalCondition2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Notification2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Condition2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DetailedAbstractTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTask2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTask2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTask2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DetailedAbstractTask2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SessionPanelEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChatEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TurnTakingToolEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TelepointerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(RadarViewEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(PropertiesEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConsoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ProblemsEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InitEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EndEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TemporalConditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(NotificationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SessionPanel2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Chat2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TurnTakingTool2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Telepointer2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(RadarView2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Properties2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Console2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Problems2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Init2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(End2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TemporalCondition2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Notification2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Condition2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case EnablingWInformationEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			LciatNavigatorGroup target = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_EnablingWInformation_4005_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup source = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_EnablingWInformation_4005_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DetailedAbstractTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTask2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTask2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTask2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DetailedAbstractTask2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SessionPanelEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChatEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TurnTakingToolEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TelepointerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(RadarViewEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(PropertiesEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConsoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ProblemsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InitEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EndEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TemporalConditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(NotificationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SessionPanel2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Chat2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TurnTakingTool2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Telepointer2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(RadarView2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Properties2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Console2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Problems2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Init2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(End2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TemporalCondition2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Notification2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Condition2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DetailedAbstractTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTask2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTask2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTask2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DetailedAbstractTask2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SessionPanelEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChatEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TurnTakingToolEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TelepointerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(RadarViewEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(PropertiesEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConsoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ProblemsEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InitEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EndEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TemporalConditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(NotificationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SessionPanel2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Chat2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TurnTakingTool2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Telepointer2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(RadarView2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Properties2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Console2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Problems2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Init2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(End2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TemporalCondition2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Notification2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Condition2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ChoiceEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			LciatNavigatorGroup target = new LciatNavigatorGroup(Messages.NavigatorGroupName_Choice_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup source = new LciatNavigatorGroup(Messages.NavigatorGroupName_Choice_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DetailedAbstractTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTask2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTask2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTask2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DetailedAbstractTask2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SessionPanelEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChatEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TurnTakingToolEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TelepointerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(RadarViewEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(PropertiesEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConsoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ProblemsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InitEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EndEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TemporalConditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(NotificationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SessionPanel2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Chat2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TurnTakingTool2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Telepointer2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(RadarView2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Properties2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Console2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Problems2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Init2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(End2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TemporalCondition2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Notification2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Condition2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DetailedAbstractTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTask2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTask2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTask2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DetailedAbstractTask2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SessionPanelEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChatEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TurnTakingToolEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TelepointerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(RadarViewEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(PropertiesEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConsoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ProblemsEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InitEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EndEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TemporalConditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(NotificationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SessionPanel2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Chat2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TurnTakingTool2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Telepointer2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(RadarView2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Properties2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Console2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Problems2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Init2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(End2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TemporalCondition2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Notification2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Condition2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ConcurrencyEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			LciatNavigatorGroup target = new LciatNavigatorGroup(Messages.NavigatorGroupName_Concurrency_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup source = new LciatNavigatorGroup(Messages.NavigatorGroupName_Concurrency_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DetailedAbstractTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTask2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTask2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTask2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DetailedAbstractTask2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SessionPanelEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChatEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TurnTakingToolEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TelepointerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(RadarViewEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(PropertiesEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConsoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ProblemsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InitEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EndEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TemporalConditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(NotificationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SessionPanel2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Chat2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TurnTakingTool2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Telepointer2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(RadarView2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Properties2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Console2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Problems2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Init2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(End2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TemporalCondition2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Notification2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Condition2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DetailedAbstractTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualTask2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GroupTask2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(AbstractTask2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(DetailedAbstractTask2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SessionPanelEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChatEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TurnTakingToolEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TelepointerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(RadarViewEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(PropertiesEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConsoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ProblemsEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InitEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(EndEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TemporalConditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(NotificationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SessionPanel2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Chat2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TurnTakingTool2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Telepointer2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(RadarView2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Properties2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Console2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Problems2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Init2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(End2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TemporalCondition2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Notification2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Condition2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AggregationEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			LciatNavigatorGroup target = new LciatNavigatorGroup(Messages.NavigatorGroupName_Aggregation_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup source = new LciatNavigatorGroup(Messages.NavigatorGroupName_Aggregation_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ExclusiveEditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CollaborativeVisualizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualVisualizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UserTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTAbstractTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InteractiveTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTCollaborativeTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ApplicationTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ExclusiveEditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CollaborativeVisualizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualVisualizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UserTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTAbstractTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InteractiveTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTCollaborativeTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ApplicationTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case EnablingEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			LciatNavigatorGroup target = new LciatNavigatorGroup(Messages.NavigatorGroupName_Enabling_4009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup source = new LciatNavigatorGroup(Messages.NavigatorGroupName_Enabling_4009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ExclusiveEditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CollaborativeVisualizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualVisualizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UserTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTAbstractTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InteractiveTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTCollaborativeTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ApplicationTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ExclusiveEditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CollaborativeVisualizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualVisualizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UserTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTAbstractTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InteractiveTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTCollaborativeTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ApplicationTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case DisablingEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			LciatNavigatorGroup target = new LciatNavigatorGroup(Messages.NavigatorGroupName_Disabling_4010_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup source = new LciatNavigatorGroup(Messages.NavigatorGroupName_Disabling_4010_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ExclusiveEditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CollaborativeVisualizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualVisualizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UserTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTAbstractTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InteractiveTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTCollaborativeTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ApplicationTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ExclusiveEditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CollaborativeVisualizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualVisualizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UserTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTAbstractTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InteractiveTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTCollaborativeTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ApplicationTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case EnablingWithInformationPassingEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			LciatNavigatorGroup target = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_EnablingWithInformationPassing_4011_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup source = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_EnablingWithInformationPassing_4011_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ExclusiveEditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CollaborativeVisualizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualVisualizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UserTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTAbstractTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InteractiveTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTCollaborativeTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ApplicationTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ExclusiveEditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CollaborativeVisualizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualVisualizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UserTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTAbstractTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InteractiveTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTCollaborativeTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ApplicationTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case DisablingWithInformationPassingEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			LciatNavigatorGroup target = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_DisablingWithInformationPassing_4012_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup source = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_DisablingWithInformationPassing_4012_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ExclusiveEditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CollaborativeVisualizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualVisualizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UserTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTAbstractTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InteractiveTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTCollaborativeTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ApplicationTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ExclusiveEditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CollaborativeVisualizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualVisualizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UserTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTAbstractTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InteractiveTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTCollaborativeTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ApplicationTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case IndependentConcurrencyEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			LciatNavigatorGroup target = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_IndependentConcurrency_4013_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup source = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_IndependentConcurrency_4013_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ExclusiveEditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CollaborativeVisualizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualVisualizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UserTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTAbstractTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InteractiveTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTCollaborativeTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ApplicationTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ExclusiveEditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CollaborativeVisualizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualVisualizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UserTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTAbstractTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InteractiveTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTCollaborativeTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ApplicationTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case OrderIndependenceEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			LciatNavigatorGroup target = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_OrderIndependence_4014_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup source = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_OrderIndependence_4014_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ExclusiveEditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CollaborativeVisualizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualVisualizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UserTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTAbstractTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InteractiveTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTCollaborativeTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ApplicationTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ExclusiveEditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CollaborativeVisualizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualVisualizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UserTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTAbstractTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InteractiveTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTCollaborativeTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ApplicationTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case SuspendResumeEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			LciatNavigatorGroup target = new LciatNavigatorGroup(Messages.NavigatorGroupName_SuspendResume_4015_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup source = new LciatNavigatorGroup(Messages.NavigatorGroupName_SuspendResume_4015_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ExclusiveEditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CollaborativeVisualizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualVisualizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UserTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTAbstractTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InteractiveTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTCollaborativeTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ApplicationTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ExclusiveEditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CollaborativeVisualizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualVisualizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UserTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTAbstractTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InteractiveTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTCollaborativeTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ApplicationTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ConcurrencyWithInformationPassingEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			LciatNavigatorGroup target = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_ConcurrencyWithInformationPassing_4016_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup source = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_ConcurrencyWithInformationPassing_4016_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ExclusiveEditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CollaborativeVisualizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualVisualizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UserTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTAbstractTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InteractiveTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTCollaborativeTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ApplicationTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ExclusiveEditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CollaborativeVisualizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualVisualizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UserTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTAbstractTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InteractiveTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTCollaborativeTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ApplicationTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case DeterministicChoiceEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			LciatNavigatorGroup target = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_DeterministicChoice_4017_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup source = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_DeterministicChoice_4017_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ExclusiveEditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CollaborativeVisualizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualVisualizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UserTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTAbstractTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InteractiveTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTCollaborativeTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ApplicationTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ExclusiveEditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CollaborativeVisualizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualVisualizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UserTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTAbstractTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InteractiveTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTCollaborativeTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ApplicationTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case UndeterministicChoiceEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			LciatNavigatorGroup target = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_UndeterministicChoice_4018_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			LciatNavigatorGroup source = new LciatNavigatorGroup(
					Messages.NavigatorGroupName_UndeterministicChoice_4018_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ExclusiveEditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CollaborativeVisualizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualVisualizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UserTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTAbstractTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InteractiveTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTCollaborativeTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ApplicationTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ExclusiveEditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CollaborativeVisualizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(IndividualVisualizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(UserTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTAbstractTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(InteractiveTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CTTCollaborativeTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ApplicationTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case TraceabilityEditPart.VISUAL_ID: {
			LinkedList<LciatAbstractNavigatorItem> result = new LinkedList<LciatAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			LciatNavigatorGroup target = new LciatNavigatorGroup(Messages.NavigatorGroupName_Traceability_4019_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			LciatNavigatorGroup source = new LciatNavigatorGroup(Messages.NavigatorGroupName_Traceability_4019_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(GraphicalEditorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TextEditorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(CodeEditorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(WebViewerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ToolEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SessionPanelEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ChatEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TurnTakingToolEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TelepointerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(RadarViewEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(PropertiesEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ConsoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(ProblemsEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(SessionPanel2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Chat2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(TurnTakingTool2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Telepointer2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(RadarView2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Properties2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Console2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					LciatVisualIDRegistry.getType(Problems2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return LCIANDiagramEditPart.MODEL_ID.equals(LciatVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<LciatNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<LciatNavigatorItem> result = new ArrayList<LciatNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new LciatNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<LciatNavigatorItem> getForeignShortcuts(Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof LciatAbstractNavigatorItem) {
			LciatAbstractNavigatorItem abstractNavigatorItem = (LciatAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
