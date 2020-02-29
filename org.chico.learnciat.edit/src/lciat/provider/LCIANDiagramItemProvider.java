/**
 */
package lciat.provider;


import java.util.Collection;
import java.util.List;

import lciat.LCIANDiagram;
import lciat.LciatFactory;
import lciat.LciatPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link lciat.LCIANDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LCIANDiagramItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LCIANDiagramItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_SOCIOGRAMS);
			childrenFeatures.add(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_LEARNING_DIAGRAMS);
			childrenFeatures.add(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_CTT_DIAGRAMS);
			childrenFeatures.add(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_LINKS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns LCIANDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LCIANDiagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_LCIANDiagram_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(LCIANDiagram.class)) {
			case LciatPackage.LCIAN_DIAGRAM__ITS_SOCIOGRAMS:
			case LciatPackage.LCIAN_DIAGRAM__ITS_LEARNING_DIAGRAMS:
			case LciatPackage.LCIAN_DIAGRAM__ITS_CTT_DIAGRAMS:
			case LciatPackage.LCIAN_DIAGRAM__ITS_LINKS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_SOCIOGRAMS,
				 LciatFactory.eINSTANCE.createSociogram()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_LEARNING_DIAGRAMS,
				 LciatFactory.eINSTANCE.createLearningDiagram()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_CTT_DIAGRAMS,
				 LciatFactory.eINSTANCE.createCTTDiagram()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_LINKS,
				 LciatFactory.eINSTANCE.createSociogramLink()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_LINKS,
				 LciatFactory.eINSTANCE.createInheritance()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_LINKS,
				 LciatFactory.eINSTANCE.createActing()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_LINKS,
				 LciatFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_LINKS,
				 LciatFactory.eINSTANCE.createLearningLink()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_LINKS,
				 LciatFactory.eINSTANCE.createEnablingWOInformation()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_LINKS,
				 LciatFactory.eINSTANCE.createEnablingWInformation()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_LINKS,
				 LciatFactory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_LINKS,
				 LciatFactory.eINSTANCE.createConcurrency()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_LINKS,
				 LciatFactory.eINSTANCE.createTraceability()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_LINKS,
				 LciatFactory.eINSTANCE.createCTTLink()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_LINKS,
				 LciatFactory.eINSTANCE.createAggregation()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_LINKS,
				 LciatFactory.eINSTANCE.createEnabling()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_LINKS,
				 LciatFactory.eINSTANCE.createDisabling()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_LINKS,
				 LciatFactory.eINSTANCE.createEnablingWithInformationPassing()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_LINKS,
				 LciatFactory.eINSTANCE.createDisablingWithInformationPassing()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_LINKS,
				 LciatFactory.eINSTANCE.createIndependentConcurrency()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_LINKS,
				 LciatFactory.eINSTANCE.createOrderIndependence()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_LINKS,
				 LciatFactory.eINSTANCE.createSuspendResume()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_LINKS,
				 LciatFactory.eINSTANCE.createConcurrencyWithInformationPassing()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_LINKS,
				 LciatFactory.eINSTANCE.createDeterministicChoice()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LCIAN_DIAGRAM__ITS_LINKS,
				 LciatFactory.eINSTANCE.createUndeterministicChoice()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return LciatEditPlugin.INSTANCE;
	}

}
