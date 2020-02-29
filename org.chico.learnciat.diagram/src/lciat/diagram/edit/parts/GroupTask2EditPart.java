/*
 * 
 */
package lciat.diagram.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

import lciat.diagram.edit.policies.GroupTask2CanonicalEditPolicy;
import lciat.diagram.edit.policies.GroupTask2ItemSemanticEditPolicy;
import lciat.diagram.edit.policies.OpenDiagramEditPolicy;
import lciat.diagram.part.LciatVisualIDRegistry;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class GroupTask2EditPart extends AbstractBorderedShapeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 3078;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public GroupTask2EditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(LciatVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new GroupTask2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new GroupTask2CanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (LciatVisualIDRegistry.getVisualID(childView)) {
				case GraphicalEditorEditPart.VISUAL_ID:
				case TextEditorEditPart.VISUAL_ID:
				case CodeEditorEditPart.VISUAL_ID:
				case WebViewerEditPart.VISUAL_ID:
				case ToolEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new GroupTaskFigure();
	}

	/**
	* @generated
	*/
	public GroupTaskFigure getPrimaryShape() {
		return (GroupTaskFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof GroupTaskName2EditPart) {
			((GroupTaskName2EditPart) childEditPart).setLabel(getPrimaryShape().getFigureGroupTaskLabelFigure());
			return true;
		}
		if (childEditPart instanceof GroupTaskGroupTaskTaskRolesCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getGroupTaskTaskRolesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((GroupTaskGroupTaskTaskRolesCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof GroupTaskGroupTaskTaskObjectsCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getGroupTaskTaskObjectsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((GroupTaskGroupTaskTaskObjectsCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof GroupTaskGroupTaskSubtypeCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getGroupTaskSubtypeCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((GroupTaskGroupTaskSubtypeCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof GroupTaskGroupTaskModalityCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getGroupTaskModalityCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((GroupTaskGroupTaskModalityCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof GraphicalEditorEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.NORTH);
			getBorderedFigure().getBorderItemContainer().add(((GraphicalEditorEditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		if (childEditPart instanceof TextEditorEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.NORTH);
			getBorderedFigure().getBorderItemContainer().add(((TextEditorEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof CodeEditorEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.NORTH);
			getBorderedFigure().getBorderItemContainer().add(((CodeEditorEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof WebViewerEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.NORTH);
			getBorderedFigure().getBorderItemContainer().add(((WebViewerEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof ToolEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.NORTH);
			getBorderedFigure().getBorderItemContainer().add(((ToolEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof GroupTaskName2EditPart) {
			return true;
		}
		if (childEditPart instanceof GroupTaskGroupTaskTaskRolesCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getGroupTaskTaskRolesCompartmentFigure();
			pane.remove(((GroupTaskGroupTaskTaskRolesCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof GroupTaskGroupTaskTaskObjectsCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getGroupTaskTaskObjectsCompartmentFigure();
			pane.remove(((GroupTaskGroupTaskTaskObjectsCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof GroupTaskGroupTaskSubtypeCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getGroupTaskSubtypeCompartmentFigure();
			pane.remove(((GroupTaskGroupTaskSubtypeCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof GroupTaskGroupTaskModalityCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getGroupTaskModalityCompartmentFigure();
			pane.remove(((GroupTaskGroupTaskModalityCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof GraphicalEditorEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(((GraphicalEditorEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof TextEditorEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(((TextEditorEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CodeEditorEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(((CodeEditorEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof WebViewerEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(((WebViewerEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ToolEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(((ToolEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof GroupTaskGroupTaskTaskRolesCompartment2EditPart) {
			return getPrimaryShape().getGroupTaskTaskRolesCompartmentFigure();
		}
		if (editPart instanceof GroupTaskGroupTaskTaskObjectsCompartment2EditPart) {
			return getPrimaryShape().getGroupTaskTaskObjectsCompartmentFigure();
		}
		if (editPart instanceof GroupTaskGroupTaskSubtypeCompartment2EditPart) {
			return getPrimaryShape().getGroupTaskSubtypeCompartmentFigure();
		}
		if (editPart instanceof GroupTaskGroupTaskModalityCompartment2EditPart) {
			return getPrimaryShape().getGroupTaskModalityCompartmentFigure();
		}
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createMainFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(LciatVisualIDRegistry.getType(GroupTaskName2EditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == LciatElementTypes.Rol_3047) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(GroupTaskGroupTaskTaskRolesCompartment2EditPart.VISUAL_ID));
			}
			if (type == LciatElementTypes.Group_3048) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(GroupTaskGroupTaskTaskRolesCompartment2EditPart.VISUAL_ID));
			}
			if (type == LciatElementTypes.Object_3060) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(GroupTaskGroupTaskTaskObjectsCompartment2EditPart.VISUAL_ID));
			}
			if (type == LciatElementTypes.Assimilative_3049) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(GroupTaskGroupTaskSubtypeCompartment2EditPart.VISUAL_ID));
			}
			if (type == LciatElementTypes.InformationHandling_3050) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(GroupTaskGroupTaskSubtypeCompartment2EditPart.VISUAL_ID));
			}
			if (type == LciatElementTypes.Adaptive_3051) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(GroupTaskGroupTaskSubtypeCompartment2EditPart.VISUAL_ID));
			}
			if (type == LciatElementTypes.Communicative_3052) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(GroupTaskGroupTaskSubtypeCompartment2EditPart.VISUAL_ID));
			}
			if (type == LciatElementTypes.Productive_3053) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(GroupTaskGroupTaskSubtypeCompartment2EditPart.VISUAL_ID));
			}
			if (type == LciatElementTypes.Experiential_3054) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(GroupTaskGroupTaskSubtypeCompartment2EditPart.VISUAL_ID));
			}
			if (type == LciatElementTypes.Evaluative_3055) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(GroupTaskGroupTaskSubtypeCompartment2EditPart.VISUAL_ID));
			}
			if (type == LciatElementTypes.Support_3056) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(GroupTaskGroupTaskSubtypeCompartment2EditPart.VISUAL_ID));
			}
			if (type == LciatElementTypes.FaceToFace_3057) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(GroupTaskGroupTaskModalityCompartment2EditPart.VISUAL_ID));
			}
			if (type == LciatElementTypes.ComputerSupported_3058) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(GroupTaskGroupTaskModalityCompartment2EditPart.VISUAL_ID));
			}
			if (type == LciatElementTypes.Online_3059) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(GroupTaskGroupTaskModalityCompartment2EditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class GroupTaskFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureGroupTaskLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fGroupTaskTaskRolesCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fGroupTaskTaskObjectsCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fGroupTaskSubtypeCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fGroupTaskModalityCompartmentFigure;

		/**
		 * @generated
		 */
		public GroupTaskFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure groupTaskFigure_Title0 = new RectangleFigure();

			groupTaskFigure_Title0.setFill(false);
			groupTaskFigure_Title0.setOutline(false);
			groupTaskFigure_Title0.setMaximumSize(new Dimension(getMapMode().DPtoLP(1000), getMapMode().DPtoLP(25)));

			groupTaskFigure_Title0.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(5)));

			this.add(groupTaskFigure_Title0);

			BorderLayout layoutGroupTaskFigure_Title0 = new BorderLayout();
			groupTaskFigure_Title0.setLayoutManager(layoutGroupTaskFigure_Title0);

			fFigureGroupTaskLabelFigure = new WrappingLabel();

			fFigureGroupTaskLabelFigure.setText("GroupTask");

			groupTaskFigure_Title0.add(fFigureGroupTaskLabelFigure, BorderLayout.LEFT);

			fGroupTaskModalityCompartmentFigure = new RectangleFigure();

			fGroupTaskModalityCompartmentFigure.setOutline(false);

			groupTaskFigure_Title0.add(fGroupTaskModalityCompartmentFigure, BorderLayout.RIGHT);

			RectangleFigure groupTaskFigure_Body0 = new RectangleFigure();

			groupTaskFigure_Body0.setOutline(false);

			this.add(groupTaskFigure_Body0);

			BorderLayout layoutGroupTaskFigure_Body0 = new BorderLayout();
			groupTaskFigure_Body0.setLayoutManager(layoutGroupTaskFigure_Body0);

			fGroupTaskTaskRolesCompartmentFigure = new RectangleFigure();

			groupTaskFigure_Body0.add(fGroupTaskTaskRolesCompartmentFigure, BorderLayout.LEFT);

			fGroupTaskTaskObjectsCompartmentFigure = new RectangleFigure();

			groupTaskFigure_Body0.add(fGroupTaskTaskObjectsCompartmentFigure, BorderLayout.CENTER);

			RectangleFigure groupTaskFigure_Subtype0 = new RectangleFigure();

			groupTaskFigure_Subtype0.setFill(false);
			groupTaskFigure_Subtype0.setOutline(false);
			groupTaskFigure_Subtype0.setMaximumSize(new Dimension(getMapMode().DPtoLP(1000), getMapMode().DPtoLP(25)));

			groupTaskFigure_Subtype0.setBorder(new MarginBorder(getMapMode().DPtoLP(0), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(3), getMapMode().DPtoLP(5)));

			this.add(groupTaskFigure_Subtype0);

			BorderLayout layoutGroupTaskFigure_Subtype0 = new BorderLayout();
			groupTaskFigure_Subtype0.setLayoutManager(layoutGroupTaskFigure_Subtype0);

			fGroupTaskSubtypeCompartmentFigure = new RectangleFigure();

			fGroupTaskSubtypeCompartmentFigure.setOutline(false);

			groupTaskFigure_Subtype0.add(fGroupTaskSubtypeCompartmentFigure, BorderLayout.LEFT);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureGroupTaskLabelFigure() {
			return fFigureGroupTaskLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getGroupTaskTaskRolesCompartmentFigure() {
			return fGroupTaskTaskRolesCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getGroupTaskTaskObjectsCompartmentFigure() {
			return fGroupTaskTaskObjectsCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getGroupTaskSubtypeCompartmentFigure() {
			return fGroupTaskSubtypeCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getGroupTaskModalityCompartmentFigure() {
			return fGroupTaskModalityCompartmentFigure;
		}

	}

}
