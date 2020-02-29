/*
* 
*/
package lciat.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import lciat.diagram.part.LciatVisualIDRegistry;

/**
 * @generated
 */
public class LciatNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7034;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7033;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof LciatNavigatorItem) {
			LciatNavigatorItem item = (LciatNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return LciatVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
