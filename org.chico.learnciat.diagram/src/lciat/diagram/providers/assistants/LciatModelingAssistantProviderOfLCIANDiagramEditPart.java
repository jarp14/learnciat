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
public class LciatModelingAssistantProviderOfLCIANDiagramEditPart extends LciatModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(LciatElementTypes.Sociogram_2001);
		types.add(LciatElementTypes.LearningDiagram_2002);
		types.add(LciatElementTypes.CTTDiagram_2003);
		return types;
	}

}
