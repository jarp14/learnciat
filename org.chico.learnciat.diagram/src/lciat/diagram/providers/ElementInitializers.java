/*
 * 
 */
package lciat.diagram.providers;

import lciat.diagram.part.LciatDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = LciatDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			LciatDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
