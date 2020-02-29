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
public class LciatModelingAssistantProviderOfSociogramEditPart extends LciatModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(LciatElementTypes.MolefContent1_3003);
		types.add(LciatElementTypes.MolefContent2_3004);
		types.add(LciatElementTypes.MolefContent3_3005);
		types.add(LciatElementTypes.MolefContent4_3006);
		types.add(LciatElementTypes.MolefContent5_3007);
		types.add(LciatElementTypes.MolefContent6_3008);
		return types;
	}

}
