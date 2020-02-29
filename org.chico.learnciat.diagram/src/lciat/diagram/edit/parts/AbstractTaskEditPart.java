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

import lciat.diagram.edit.policies.AbstractTaskCanonicalEditPolicy;
import lciat.diagram.edit.policies.AbstractTaskItemSemanticEditPolicy;
import lciat.diagram.edit.policies.OpenDiagramEditPolicy;
import lciat.diagram.part.LciatVisualIDRegistry;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class AbstractTaskEditPart extends AbstractBorderedShapeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 3061;

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
	public AbstractTaskEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(LciatVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new AbstractTaskItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new AbstractTaskCanonicalEditPolicy());
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
		return primaryShape = new AbstractTaskFigure();
	}

	/**
	* @generated
	*/
	public AbstractTaskFigure getPrimaryShape() {
		return (AbstractTaskFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AbstractTaskNameEditPart) {
			((AbstractTaskNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureAbstractTaskLabelFigure());
			return true;
		}
		if (childEditPart instanceof AbstractTaskAbstractTaskTaskRolesCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getAbstractTaskTaskRolesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((AbstractTaskAbstractTaskTaskRolesCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof AbstractTaskAbstractTaskTaskObjectsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getAbstractTaskTaskObjectsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((AbstractTaskAbstractTaskTaskObjectsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof AbstractTaskAbstractTaskSubtypeCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getAbstractTaskSubtypeCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((AbstractTaskAbstractTaskSubtypeCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof AbstractTaskAbstractTaskModalityCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getAbstractTaskModalityCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((AbstractTaskAbstractTaskModalityCompartmentEditPart) childEditPart).getFigure());
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
		if (childEditPart instanceof AbstractTaskNameEditPart) {
			return true;
		}
		if (childEditPart instanceof AbstractTaskAbstractTaskTaskRolesCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getAbstractTaskTaskRolesCompartmentFigure();
			pane.remove(((AbstractTaskAbstractTaskTaskRolesCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof AbstractTaskAbstractTaskTaskObjectsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getAbstractTaskTaskObjectsCompartmentFigure();
			pane.remove(((AbstractTaskAbstractTaskTaskObjectsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof AbstractTaskAbstractTaskSubtypeCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getAbstractTaskSubtypeCompartmentFigure();
			pane.remove(((AbstractTaskAbstractTaskSubtypeCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof AbstractTaskAbstractTaskModalityCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getAbstractTaskModalityCompartmentFigure();
			pane.remove(((AbstractTaskAbstractTaskModalityCompartmentEditPart) childEditPart).getFigure());
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
		if (editPart instanceof AbstractTaskAbstractTaskTaskRolesCompartmentEditPart) {
			return getPrimaryShape().getAbstractTaskTaskRolesCompartmentFigure();
		}
		if (editPart instanceof AbstractTaskAbstractTaskTaskObjectsCompartmentEditPart) {
			return getPrimaryShape().getAbstractTaskTaskObjectsCompartmentFigure();
		}
		if (editPart instanceof AbstractTaskAbstractTaskSubtypeCompartmentEditPart) {
			return getPrimaryShape().getAbstractTaskSubtypeCompartmentFigure();
		}
		if (editPart instanceof AbstractTaskAbstractTaskModalityCompartmentEditPart) {
			return getPrimaryShape().getAbstractTaskModalityCompartmentFigure();
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
		return getChildBySemanticHint(LciatVisualIDRegistry.getType(AbstractTaskNameEditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == LciatElementTypes.Rol_3062) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskTaskRolesCompartmentEditPart.VISUAL_ID));
			}
			if (type == LciatElementTypes.Group_3063) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskTaskRolesCompartmentEditPart.VISUAL_ID));
			}
			if (type == LciatElementTypes.Object_3075) {
				return getChildBySemanticHint(LciatVisualIDRegistry
						.getType(AbstractTaskAbstractTaskTaskObjectsCompartmentEditPart.VISUAL_ID));
			}
			if (type == LciatElementTypes.Assimilative_3064) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskSubtypeCompartmentEditPart.VISUAL_ID));
			}
			if (type == LciatElementTypes.InformationHandling_3065) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskSubtypeCompartmentEditPart.VISUAL_ID));
			}
			if (type == LciatElementTypes.Adaptive_3066) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskSubtypeCompartmentEditPart.VISUAL_ID));
			}
			if (type == LciatElementTypes.Communicative_3067) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskSubtypeCompartmentEditPart.VISUAL_ID));
			}
			if (type == LciatElementTypes.Productive_3068) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskSubtypeCompartmentEditPart.VISUAL_ID));
			}
			if (type == LciatElementTypes.Experiential_3069) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskSubtypeCompartmentEditPart.VISUAL_ID));
			}
			if (type == LciatElementTypes.Evaluative_3070) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskSubtypeCompartmentEditPart.VISUAL_ID));
			}
			if (type == LciatElementTypes.Support_3071) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskSubtypeCompartmentEditPart.VISUAL_ID));
			}
			if (type == LciatElementTypes.FaceToFace_3072) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskModalityCompartmentEditPart.VISUAL_ID));
			}
			if (type == LciatElementTypes.ComputerSupported_3073) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskModalityCompartmentEditPart.VISUAL_ID));
			}
			if (type == LciatElementTypes.Online_3074) {
				return getChildBySemanticHint(
						LciatVisualIDRegistry.getType(AbstractTaskAbstractTaskModalityCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class AbstractTaskFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAbstractTaskLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fAbstractTaskTaskRolesCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fAbstractTaskTaskObjectsCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fAbstractTaskSubtypeCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fAbstractTaskModalityCompartmentFigure;

		/**
		 * @generated
		 */
		public AbstractTaskFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure abstractTaskFigure_Title0 = new RectangleFigure();

			abstractTaskFigure_Title0.setFill(false);
			abstractTaskFigure_Title0.setOutline(false);
			abstractTaskFigure_Title0.setMaximumSize(new Dimension(getMapMode().DPtoLP(1000), getMapMode().DPtoLP(25)));

			abstractTaskFigure_Title0.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(5)));

			this.add(abstractTaskFigure_Title0);

			BorderLayout layoutAbstractTaskFigure_Title0 = new BorderLayout();
			abstractTaskFigure_Title0.setLayoutManager(layoutAbstractTaskFigure_Title0);

			fFigureAbstractTaskLabelFigure = new WrappingLabel();

			fFigureAbstractTaskLabelFigure.setText("AbstractTask");

			abstractTaskFigure_Title0.add(fFigureAbstractTaskLabelFigure, BorderLayout.LEFT);

			fAbstractTaskModalityCompartmentFigure = new RectangleFigure();

			fAbstractTaskModalityCompartmentFigure.setOutline(false);

			abstractTaskFigure_Title0.add(fAbstractTaskModalityCompartmentFigure, BorderLayout.RIGHT);

			RectangleFigure abstractTaskFigure_Body0 = new RectangleFigure();

			abstractTaskFigure_Body0.setOutline(false);

			this.add(abstractTaskFigure_Body0);

			BorderLayout layoutAbstractTaskFigure_Body0 = new BorderLayout();
			abstractTaskFigure_Body0.setLayoutManager(layoutAbstractTaskFigure_Body0);

			fAbstractTaskTaskRolesCompartmentFigure = new RectangleFigure();

			abstractTaskFigure_Body0.add(fAbstractTaskTaskRolesCompartmentFigure, BorderLayout.LEFT);

			fAbstractTaskTaskObjectsCompartmentFigure = new RectangleFigure();

			abstractTaskFigure_Body0.add(fAbstractTaskTaskObjectsCompartmentFigure, BorderLayout.CENTER);

			RectangleFigure abstractTaskFigure_Subtype0 = new RectangleFigure();

			abstractTaskFigure_Subtype0.setFill(false);
			abstractTaskFigure_Subtype0.setOutline(false);
			abstractTaskFigure_Subtype0
					.setMaximumSize(new Dimension(getMapMode().DPtoLP(1000), getMapMode().DPtoLP(25)));

			abstractTaskFigure_Subtype0.setBorder(new MarginBorder(getMapMode().DPtoLP(0), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(3), getMapMode().DPtoLP(5)));

			this.add(abstractTaskFigure_Subtype0);

			BorderLayout layoutAbstractTaskFigure_Subtype0 = new BorderLayout();
			abstractTaskFigure_Subtype0.setLayoutManager(layoutAbstractTaskFigure_Subtype0);

			fAbstractTaskSubtypeCompartmentFigure = new RectangleFigure();

			fAbstractTaskSubtypeCompartmentFigure.setOutline(false);

			abstractTaskFigure_Subtype0.add(fAbstractTaskSubtypeCompartmentFigure, BorderLayout.LEFT);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAbstractTaskLabelFigure() {
			return fFigureAbstractTaskLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getAbstractTaskTaskRolesCompartmentFigure() {
			return fAbstractTaskTaskRolesCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getAbstractTaskTaskObjectsCompartmentFigure() {
			return fAbstractTaskTaskObjectsCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getAbstractTaskSubtypeCompartmentFigure() {
			return fAbstractTaskSubtypeCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getAbstractTaskModalityCompartmentFigure() {
			return fAbstractTaskModalityCompartmentFigure;
		}

	}

}
