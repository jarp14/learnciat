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
public class LciatModelingAssistantProviderOfLearningDiagramEditPart extends LciatModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(17);
		types.add(LciatElementTypes.MolefTActivities1_3009);
		types.add(LciatElementTypes.MolefTActivities2_3010);
		types.add(LciatElementTypes.MolefTActivities3_3011);
		types.add(LciatElementTypes.MolefTActivities4_3012);
		types.add(LciatElementTypes.MolefTActivities5_3013);
		types.add(LciatElementTypes.MolefTActivities6_3014);
		types.add(LciatElementTypes.MolefTActivities7_3015);
		types.add(LciatElementTypes.MolefTActivities8_3016);
		types.add(LciatElementTypes.MolefSocial1_3017);
		types.add(LciatElementTypes.MolefSocial2_3018);
		types.add(LciatElementTypes.MolefSocial3_3019);
		types.add(LciatElementTypes.MolefSocial4_3020);
		types.add(LciatElementTypes.MolefPersonalization1_3021);
		types.add(LciatElementTypes.MolefPersonalization2_3022);
		types.add(LciatElementTypes.MolefPersonalization3_3023);
		types.add(LciatElementTypes.MolefPersonalization4_3024);
		types.add(LciatElementTypes.MolefPersonalization5_3025);
		return types;
	}

}
