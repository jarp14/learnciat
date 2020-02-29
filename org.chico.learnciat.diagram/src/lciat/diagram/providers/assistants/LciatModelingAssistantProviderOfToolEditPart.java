/*
 * 
 */
package lciat.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import lciat.diagram.edit.parts.ToolEditPart;
import lciat.diagram.providers.LciatElementTypes;
import lciat.diagram.providers.LciatModelingAssistantProvider;

/**
 * @generated
 */
public class LciatModelingAssistantProviderOfToolEditPart extends LciatModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ToolEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ToolEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(LciatElementTypes.Traceability_4019);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ToolEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ToolEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == LciatElementTypes.Traceability_4019) {
			types.add(LciatElementTypes.SessionPanel_3081);
			types.add(LciatElementTypes.Chat_3082);
			types.add(LciatElementTypes.TurnTakingTool_3083);
			types.add(LciatElementTypes.Telepointer_3084);
			types.add(LciatElementTypes.RadarView_3085);
			types.add(LciatElementTypes.Properties_3086);
			types.add(LciatElementTypes.Console_3087);
			types.add(LciatElementTypes.Problems_3088);
			types.add(LciatElementTypes.SessionPanel_3094);
			types.add(LciatElementTypes.Chat_3095);
			types.add(LciatElementTypes.TurnTakingTool_3096);
			types.add(LciatElementTypes.Telepointer_3097);
			types.add(LciatElementTypes.RadarView_3098);
			types.add(LciatElementTypes.Properties_3099);
			types.add(LciatElementTypes.Console_3100);
			types.add(LciatElementTypes.Problems_3101);
		}
		return types;
	}

}
