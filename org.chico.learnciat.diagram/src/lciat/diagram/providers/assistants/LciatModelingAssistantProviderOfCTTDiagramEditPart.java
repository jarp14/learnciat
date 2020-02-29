/*
 * 
 */
package lciat.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import lciat.diagram.providers.LciatElementTypes;
import lciat.diagram.providers.LciatModelingAssistantProvider;

/**
 * @generated
 */
public class LciatModelingAssistantProviderOfCTTDiagramEditPart extends LciatModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(7);
		types.add(LciatElementTypes.MolefMultimedia1_3107);
		types.add(LciatElementTypes.MolefMultimedia2_3108);
		types.add(LciatElementTypes.MolefMultimedia3_3109);
		types.add(LciatElementTypes.MolefMultimedia4_3110);
		types.add(LciatElementTypes.MolefMultimedia5_3111);
		types.add(LciatElementTypes.MolefMultimedia6_3112);
		types.add(LciatElementTypes.MolefMultimedia7_3113);
		return types;
	}

}
