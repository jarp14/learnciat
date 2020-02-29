/*
 * 
 */
package lciat.diagram.edit.policies;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase;

import lciat.Acting;
import lciat.Aggregation;
import lciat.Association;
import lciat.Awareness;
import lciat.CTTTask;
import lciat.Choice;
import lciat.Concurrency;
import lciat.ConcurrencyWithInformationPassing;
import lciat.DeterministicChoice;
import lciat.Disabling;
import lciat.DisablingWithInformationPassing;
import lciat.Enabling;
import lciat.EnablingWInformation;
import lciat.EnablingWOInformation;
import lciat.EnablingWithInformationPassing;
import lciat.IndependentConcurrency;
import lciat.Inheritance;
import lciat.LCIANDiagram;
import lciat.LciatPackage;
import lciat.LearningNode;
import lciat.OrderIndependence;
import lciat.SociogramNode;
import lciat.SuspendResume;
import lciat.Tool;
import lciat.Traceability;
import lciat.UndeterministicChoice;
import lciat.diagram.expressions.LciatOCLFactory;
import lciat.diagram.part.LciatDiagramEditorPlugin;
import lciat.diagram.part.LciatVisualIDRegistry;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class LciatBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	* Extended request data key to hold editpart visual id.
	* @generated
	*/
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	* @generated
	*/
	private final IElementType myElementType;

	/**
	* @generated
	*/
	protected LciatBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	* Extended request data key to hold editpart visual id.
	* Add visual id of edited editpart to extended data of the request
	* so command switch can decide what kind of diagram element is being edited.
	* It is done in those cases when it's not possible to deduce diagram
	* element kind from domain element.
	* 
	* @generated
	*/
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart().getModel();
			if (view instanceof View) {
				Integer id = new Integer(LciatVisualIDRegistry.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	* Returns visual id from request parameters.
	* @generated
	*/
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	* @generated
	*/
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest, semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	* @generated
	*/
	protected Command addDeleteViewCommand(Command mainCommand, DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand.chain(deleteViewCommand);
	}

	/**
	* @generated
	*/
	private Command getEditHelperCommand(IEditCommandRequest request, Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy
					? ((ICommandProxy) editPolicyCommand).getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, null);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(), command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	* @generated
	*/
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = LciatElementTypes.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType : myElementType;
	}

	/**
	* @generated
	*/
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	* @generated
	*/
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	* @generated
	*/
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	* @generated
	*/
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	* Returns editing domain from the host edit part.
	* @generated
	*/
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	* Clean all shortcuts to the host element from the same diagram
	* @generated
	*/
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() //$NON-NLS-1$
					|| nextView.getElement() != view.getElement()) {
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	* @generated
	*/
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = LciatDiagramEditorPlugin.getInstance().getLinkConstraints();
		if (cached == null) {
			LciatDiagramEditorPlugin.getInstance().setLinkConstraints(cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		* @generated
		*/
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateInheritance_4001(LCIANDiagram container, SociogramNode source, SociogramNode target) {
			return canExistInheritance_4001(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateActing_4002(LCIANDiagram container, SociogramNode source, SociogramNode target) {
			return canExistActing_4002(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAssociation_4003(LCIANDiagram container, SociogramNode source, SociogramNode target) {
			return canExistAssociation_4003(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateEnablingWOInformation_4004(LCIANDiagram container, LearningNode source,
				LearningNode target) {
			return canExistEnablingWOInformation_4004(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateEnablingWInformation_4005(LCIANDiagram container, LearningNode source,
				LearningNode target) {
			return canExistEnablingWInformation_4005(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateChoice_4006(LCIANDiagram container, LearningNode source, LearningNode target) {
			return canExistChoice_4006(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConcurrency_4007(LCIANDiagram container, LearningNode source, LearningNode target) {
			return canExistConcurrency_4007(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAggregation_4008(LCIANDiagram container, CTTTask source, CTTTask target) {
			return canExistAggregation_4008(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateEnabling_4009(LCIANDiagram container, CTTTask source, CTTTask target) {
			return canExistEnabling_4009(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateDisabling_4010(LCIANDiagram container, CTTTask source, CTTTask target) {
			return canExistDisabling_4010(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateEnablingWithInformationPassing_4011(LCIANDiagram container, CTTTask source,
				CTTTask target) {
			return canExistEnablingWithInformationPassing_4011(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateDisablingWithInformationPassing_4012(LCIANDiagram container, CTTTask source,
				CTTTask target) {
			return canExistDisablingWithInformationPassing_4012(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateIndependentConcurrency_4013(LCIANDiagram container, CTTTask source, CTTTask target) {
			return canExistIndependentConcurrency_4013(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateOrderIndependence_4014(LCIANDiagram container, CTTTask source, CTTTask target) {
			return canExistOrderIndependence_4014(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSuspendResume_4015(LCIANDiagram container, CTTTask source, CTTTask target) {
			return canExistSuspendResume_4015(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConcurrencyWithInformationPassing_4016(LCIANDiagram container, CTTTask source,
				CTTTask target) {
			return canExistConcurrencyWithInformationPassing_4016(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateDeterministicChoice_4017(LCIANDiagram container, CTTTask source, CTTTask target) {
			return canExistDeterministicChoice_4017(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateUndeterministicChoice_4018(LCIANDiagram container, CTTTask source, CTTTask target) {
			return canExistUndeterministicChoice_4018(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateTraceability_4019(LCIANDiagram container, Awareness source, Tool target) {
			return canExistTraceability_4019(container, null, source, target);
		}

		/**
		* @generated
		*/
		public boolean canExistInheritance_4001(LCIANDiagram container, Inheritance linkInstance, SociogramNode source,
				SociogramNode target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getSociogramNode());
					Object sourceVal = LciatOCLFactory.getExpression(0, LciatPackage.eINSTANCE.getSociogramNode(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getSociogramNode());
					Object targetVal = LciatOCLFactory.getExpression(1, LciatPackage.eINSTANCE.getSociogramNode(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				LciatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistActing_4002(LCIANDiagram container, Acting linkInstance, SociogramNode source,
				SociogramNode target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getSociogramNode());
					Object sourceVal = LciatOCLFactory.getExpression(2, LciatPackage.eINSTANCE.getSociogramNode(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getSociogramNode());
					Object targetVal = LciatOCLFactory.getExpression(3, LciatPackage.eINSTANCE.getSociogramNode(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				LciatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistAssociation_4003(LCIANDiagram container, Association linkInstance, SociogramNode source,
				SociogramNode target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getSociogramNode());
					Object sourceVal = LciatOCLFactory.getExpression(4, LciatPackage.eINSTANCE.getSociogramNode(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getSociogramNode());
					Object targetVal = LciatOCLFactory.getExpression(5, LciatPackage.eINSTANCE.getSociogramNode(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				LciatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistEnablingWOInformation_4004(LCIANDiagram container, EnablingWOInformation linkInstance,
				LearningNode source, LearningNode target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getLearningNode());
					Object sourceVal = LciatOCLFactory.getExpression(6, LciatPackage.eINSTANCE.getLearningNode(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getLearningNode());
					Object targetVal = LciatOCLFactory.getExpression(7, LciatPackage.eINSTANCE.getLearningNode(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				LciatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistEnablingWInformation_4005(LCIANDiagram container, EnablingWInformation linkInstance,
				LearningNode source, LearningNode target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getLearningNode());
					Object sourceVal = LciatOCLFactory.getExpression(8, LciatPackage.eINSTANCE.getLearningNode(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getLearningNode());
					Object targetVal = LciatOCLFactory.getExpression(9, LciatPackage.eINSTANCE.getLearningNode(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				LciatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistChoice_4006(LCIANDiagram container, Choice linkInstance, LearningNode source,
				LearningNode target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getLearningNode());
					Object sourceVal = LciatOCLFactory.getExpression(10, LciatPackage.eINSTANCE.getLearningNode(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getLearningNode());
					Object targetVal = LciatOCLFactory.getExpression(11, LciatPackage.eINSTANCE.getLearningNode(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				LciatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistConcurrency_4007(LCIANDiagram container, Concurrency linkInstance, LearningNode source,
				LearningNode target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getLearningNode());
					Object sourceVal = LciatOCLFactory.getExpression(12, LciatPackage.eINSTANCE.getLearningNode(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getLearningNode());
					Object targetVal = LciatOCLFactory.getExpression(13, LciatPackage.eINSTANCE.getLearningNode(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				LciatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistAggregation_4008(LCIANDiagram container, Aggregation linkInstance, CTTTask source,
				CTTTask target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getCTTTask());
					Object sourceVal = LciatOCLFactory.getExpression(14, LciatPackage.eINSTANCE.getCTTTask(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getCTTTask());
					Object targetVal = LciatOCLFactory.getExpression(15, LciatPackage.eINSTANCE.getCTTTask(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				LciatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistEnabling_4009(LCIANDiagram container, Enabling linkInstance, CTTTask source,
				CTTTask target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getCTTTask());
					Object sourceVal = LciatOCLFactory.getExpression(16, LciatPackage.eINSTANCE.getCTTTask(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getCTTTask());
					Object targetVal = LciatOCLFactory.getExpression(17, LciatPackage.eINSTANCE.getCTTTask(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				LciatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistDisabling_4010(LCIANDiagram container, Disabling linkInstance, CTTTask source,
				CTTTask target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getCTTTask());
					Object sourceVal = LciatOCLFactory.getExpression(18, LciatPackage.eINSTANCE.getCTTTask(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getCTTTask());
					Object targetVal = LciatOCLFactory.getExpression(19, LciatPackage.eINSTANCE.getCTTTask(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				LciatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistEnablingWithInformationPassing_4011(LCIANDiagram container,
				EnablingWithInformationPassing linkInstance, CTTTask source, CTTTask target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getCTTTask());
					Object sourceVal = LciatOCLFactory.getExpression(20, LciatPackage.eINSTANCE.getCTTTask(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getCTTTask());
					Object targetVal = LciatOCLFactory.getExpression(21, LciatPackage.eINSTANCE.getCTTTask(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				LciatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistDisablingWithInformationPassing_4012(LCIANDiagram container,
				DisablingWithInformationPassing linkInstance, CTTTask source, CTTTask target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getCTTTask());
					Object sourceVal = LciatOCLFactory.getExpression(22, LciatPackage.eINSTANCE.getCTTTask(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getCTTTask());
					Object targetVal = LciatOCLFactory.getExpression(23, LciatPackage.eINSTANCE.getCTTTask(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				LciatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistIndependentConcurrency_4013(LCIANDiagram container, IndependentConcurrency linkInstance,
				CTTTask source, CTTTask target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getCTTTask());
					Object sourceVal = LciatOCLFactory.getExpression(24, LciatPackage.eINSTANCE.getCTTTask(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getCTTTask());
					Object targetVal = LciatOCLFactory.getExpression(25, LciatPackage.eINSTANCE.getCTTTask(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				LciatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistOrderIndependence_4014(LCIANDiagram container, OrderIndependence linkInstance,
				CTTTask source, CTTTask target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getCTTTask());
					Object sourceVal = LciatOCLFactory.getExpression(26, LciatPackage.eINSTANCE.getCTTTask(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getCTTTask());
					Object targetVal = LciatOCLFactory.getExpression(27, LciatPackage.eINSTANCE.getCTTTask(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				LciatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistSuspendResume_4015(LCIANDiagram container, SuspendResume linkInstance, CTTTask source,
				CTTTask target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getCTTTask());
					Object sourceVal = LciatOCLFactory.getExpression(28, LciatPackage.eINSTANCE.getCTTTask(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getCTTTask());
					Object targetVal = LciatOCLFactory.getExpression(29, LciatPackage.eINSTANCE.getCTTTask(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				LciatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistConcurrencyWithInformationPassing_4016(LCIANDiagram container,
				ConcurrencyWithInformationPassing linkInstance, CTTTask source, CTTTask target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getCTTTask());
					Object sourceVal = LciatOCLFactory.getExpression(30, LciatPackage.eINSTANCE.getCTTTask(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getCTTTask());
					Object targetVal = LciatOCLFactory.getExpression(31, LciatPackage.eINSTANCE.getCTTTask(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				LciatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistDeterministicChoice_4017(LCIANDiagram container, DeterministicChoice linkInstance,
				CTTTask source, CTTTask target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getCTTTask());
					Object sourceVal = LciatOCLFactory.getExpression(32, LciatPackage.eINSTANCE.getCTTTask(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getCTTTask());
					Object targetVal = LciatOCLFactory.getExpression(33, LciatPackage.eINSTANCE.getCTTTask(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				LciatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistUndeterministicChoice_4018(LCIANDiagram container, UndeterministicChoice linkInstance,
				CTTTask source, CTTTask target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getCTTTask());
					Object sourceVal = LciatOCLFactory.getExpression(34, LciatPackage.eINSTANCE.getCTTTask(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getCTTTask());
					Object targetVal = LciatOCLFactory.getExpression(35, LciatPackage.eINSTANCE.getCTTTask(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				LciatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public boolean canExistTraceability_4019(LCIANDiagram container, Traceability linkInstance, Awareness source,
				Tool target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getTool());
					Object sourceVal = LciatOCLFactory.getExpression(36, LciatPackage.eINSTANCE.getAwareness(), env)
							.evaluate(source, Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections.<String, EClassifier>singletonMap("oppositeEnd", //$NON-NLS-1$
							LciatPackage.eINSTANCE.getAwareness());
					Object targetVal = LciatOCLFactory.getExpression(37, LciatPackage.eINSTANCE.getTool(), env)
							.evaluate(target, Collections.singletonMap("oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				LciatDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}
	}

}
