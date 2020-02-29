/*
 * 
 */
package lciat.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import lciat.diagram.edit.parts.LCIANDiagramEditPart;
import lciat.diagram.edit.parts.LciatEditPartFactory;
import lciat.diagram.part.LciatVisualIDRegistry;

/**
 * @generated
 */
public class LciatEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public LciatEditPartProvider() {
		super(new LciatEditPartFactory(), LciatVisualIDRegistry.TYPED_INSTANCE, LCIANDiagramEditPart.MODEL_ID);
	}

}
