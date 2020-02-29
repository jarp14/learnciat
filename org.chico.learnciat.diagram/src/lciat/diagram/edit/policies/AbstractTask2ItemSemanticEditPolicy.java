/*
* 
*/
package lciat.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import lciat.diagram.edit.commands.ChoiceCreateCommand;
import lciat.diagram.edit.commands.ChoiceReorientCommand;
import lciat.diagram.edit.commands.CodeEditorCreateCommand;
import lciat.diagram.edit.commands.ConcurrencyCreateCommand;
import lciat.diagram.edit.commands.ConcurrencyReorientCommand;
import lciat.diagram.edit.commands.EnablingWInformationCreateCommand;
import lciat.diagram.edit.commands.EnablingWInformationReorientCommand;
import lciat.diagram.edit.commands.EnablingWOInformationCreateCommand;
import lciat.diagram.edit.commands.EnablingWOInformationReorientCommand;
import lciat.diagram.edit.commands.GraphicalEditorCreateCommand;
import lciat.diagram.edit.commands.TextEditorCreateCommand;
import lciat.diagram.edit.commands.ToolCreateCommand;
import lciat.diagram.edit.commands.WebViewerCreateCommand;
import lciat.diagram.edit.parts.AbstractTaskAbstractTaskModalityCompartment2EditPart;
import lciat.diagram.edit.parts.AbstractTaskAbstractTaskSubtypeCompartment2EditPart;
import lciat.diagram.edit.parts.AbstractTaskAbstractTaskTaskObjectsCompartment2EditPart;
import lciat.diagram.edit.parts.AbstractTaskAbstractTaskTaskRolesCompartment2EditPart;
import lciat.diagram.edit.parts.ActingEditPart;
import lciat.diagram.edit.parts.Adaptive3EditPart;
import lciat.diagram.edit.parts.Assimilative3EditPart;
import lciat.diagram.edit.parts.AssociationEditPart;
import lciat.diagram.edit.parts.ChoiceEditPart;
import lciat.diagram.edit.parts.CodeEditorEditPart;
import lciat.diagram.edit.parts.Communicative3EditPart;
import lciat.diagram.edit.parts.ComputerSupported3EditPart;
import lciat.diagram.edit.parts.ConcurrencyEditPart;
import lciat.diagram.edit.parts.EnablingWInformationEditPart;
import lciat.diagram.edit.parts.EnablingWOInformationEditPart;
import lciat.diagram.edit.parts.Evaluative3EditPart;
import lciat.diagram.edit.parts.Experiential3EditPart;
import lciat.diagram.edit.parts.FaceToFace3EditPart;
import lciat.diagram.edit.parts.GraphicalEditorEditPart;
import lciat.diagram.edit.parts.Group4EditPart;
import lciat.diagram.edit.parts.InformationHandling3EditPart;
import lciat.diagram.edit.parts.InheritanceEditPart;
import lciat.diagram.edit.parts.Object3EditPart;
import lciat.diagram.edit.parts.Online3EditPart;
import lciat.diagram.edit.parts.Productive3EditPart;
import lciat.diagram.edit.parts.Rol4EditPart;
import lciat.diagram.edit.parts.Support3EditPart;
import lciat.diagram.edit.parts.TextEditorEditPart;
import lciat.diagram.edit.parts.ToolEditPart;
import lciat.diagram.edit.parts.TraceabilityEditPart;
import lciat.diagram.edit.parts.WebViewerEditPart;
import lciat.diagram.part.LciatVisualIDRegistry;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class AbstractTask2ItemSemanticEditPolicy extends LciatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AbstractTask2ItemSemanticEditPolicy() {
		super(LciatElementTypes.AbstractTask_3079);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (LciatElementTypes.GraphicalEditor_3029 == req.getElementType()) {
			return getGEFWrapper(new GraphicalEditorCreateCommand(req));
		}
		if (LciatElementTypes.TextEditor_3030 == req.getElementType()) {
			return getGEFWrapper(new TextEditorCreateCommand(req));
		}
		if (LciatElementTypes.CodeEditor_3031 == req.getElementType()) {
			return getGEFWrapper(new CodeEditorCreateCommand(req));
		}
		if (LciatElementTypes.WebViewer_3032 == req.getElementType()) {
			return getGEFWrapper(new WebViewerCreateCommand(req));
		}
		if (LciatElementTypes.Tool_3044 == req.getElementType()) {
			return getGEFWrapper(new ToolCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (LciatVisualIDRegistry.getVisualID(incomingLink) == EnablingWOInformationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(incomingLink) == EnablingWInformationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(incomingLink) == ChoiceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(incomingLink) == ConcurrencyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (LciatVisualIDRegistry.getVisualID(outgoingLink) == EnablingWOInformationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(outgoingLink) == EnablingWInformationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(outgoingLink) == ChoiceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (LciatVisualIDRegistry.getVisualID(outgoingLink) == ConcurrencyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	* @generated
	*/
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (LciatVisualIDRegistry.getVisualID(node)) {
			case GraphicalEditorEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (LciatVisualIDRegistry.getVisualID(incomingLink) == TraceabilityEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(
						new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case TextEditorEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (LciatVisualIDRegistry.getVisualID(incomingLink) == TraceabilityEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(
						new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case CodeEditorEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (LciatVisualIDRegistry.getVisualID(incomingLink) == TraceabilityEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(
						new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case WebViewerEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (LciatVisualIDRegistry.getVisualID(incomingLink) == TraceabilityEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(
						new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case ToolEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (LciatVisualIDRegistry.getVisualID(incomingLink) == TraceabilityEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(
						new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case AbstractTaskAbstractTaskTaskRolesCompartment2EditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (LciatVisualIDRegistry.getVisualID(cnode)) {
					case Rol4EditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (LciatVisualIDRegistry.getVisualID(incomingLink) == InheritanceEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
								continue;
							}
							if (LciatVisualIDRegistry.getVisualID(incomingLink) == ActingEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
								continue;
							}
							if (LciatVisualIDRegistry.getVisualID(incomingLink) == AssociationEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
								continue;
							}
						}
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (LciatVisualIDRegistry.getVisualID(outgoingLink) == InheritanceEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
								continue;
							}
							if (LciatVisualIDRegistry.getVisualID(outgoingLink) == ActingEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
								continue;
							}
							if (LciatVisualIDRegistry.getVisualID(outgoingLink) == AssociationEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case Group4EditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (LciatVisualIDRegistry.getVisualID(incomingLink) == InheritanceEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
								continue;
							}
							if (LciatVisualIDRegistry.getVisualID(incomingLink) == ActingEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
								continue;
							}
							if (LciatVisualIDRegistry.getVisualID(incomingLink) == AssociationEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
								continue;
							}
						}
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (LciatVisualIDRegistry.getVisualID(outgoingLink) == InheritanceEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
								continue;
							}
							if (LciatVisualIDRegistry.getVisualID(outgoingLink) == ActingEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
								continue;
							}
							if (LciatVisualIDRegistry.getVisualID(outgoingLink) == AssociationEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			case AbstractTaskAbstractTaskTaskObjectsCompartment2EditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (LciatVisualIDRegistry.getVisualID(cnode)) {
					case Object3EditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			case AbstractTaskAbstractTaskSubtypeCompartment2EditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (LciatVisualIDRegistry.getVisualID(cnode)) {
					case Assimilative3EditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case InformationHandling3EditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case Adaptive3EditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case Communicative3EditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case Productive3EditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case Experiential3EditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case Evaluative3EditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case Support3EditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			case AbstractTaskAbstractTaskModalityCompartment2EditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (LciatVisualIDRegistry.getVisualID(cnode)) {
					case FaceToFace3EditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case ComputerSupported3EditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case Online3EditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (LciatElementTypes.EnablingWOInformation_4004 == req.getElementType()) {
			return getGEFWrapper(new EnablingWOInformationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.EnablingWInformation_4005 == req.getElementType()) {
			return getGEFWrapper(new EnablingWInformationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.Choice_4006 == req.getElementType()) {
			return getGEFWrapper(new ChoiceCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.Concurrency_4007 == req.getElementType()) {
			return getGEFWrapper(new ConcurrencyCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (LciatElementTypes.EnablingWOInformation_4004 == req.getElementType()) {
			return getGEFWrapper(new EnablingWOInformationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.EnablingWInformation_4005 == req.getElementType()) {
			return getGEFWrapper(new EnablingWInformationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.Choice_4006 == req.getElementType()) {
			return getGEFWrapper(new ChoiceCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (LciatElementTypes.Concurrency_4007 == req.getElementType()) {
			return getGEFWrapper(new ConcurrencyCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case EnablingWOInformationEditPart.VISUAL_ID:
			return getGEFWrapper(new EnablingWOInformationReorientCommand(req));
		case EnablingWInformationEditPart.VISUAL_ID:
			return getGEFWrapper(new EnablingWInformationReorientCommand(req));
		case ChoiceEditPart.VISUAL_ID:
			return getGEFWrapper(new ChoiceReorientCommand(req));
		case ConcurrencyEditPart.VISUAL_ID:
			return getGEFWrapper(new ConcurrencyReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
