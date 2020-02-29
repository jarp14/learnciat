/**
 */
package lciat.provider;


import java.util.Collection;
import java.util.List;

import lciat.CTTDiagram;
import lciat.LciatFactory;
import lciat.LciatPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link lciat.CTTDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CTTDiagramItemProvider 
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
	public CTTDiagramItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addMolefCttNodesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CTTDiagram_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CTTDiagram_name_feature", "_UI_CTTDiagram_type"),
				 LciatPackage.Literals.CTT_DIAGRAM__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Molef Ctt Nodes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMolefCttNodesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CTTDiagram_molefCttNodes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CTTDiagram_molefCttNodes_feature", "_UI_CTTDiagram_type"),
				 LciatPackage.Literals.CTT_DIAGRAM__MOLEF_CTT_NODES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(LciatPackage.Literals.CTT_DIAGRAM__CTT_TASKS);
			childrenFeatures.add(LciatPackage.Literals.CTT_DIAGRAM__MF_CTT_NODES);
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
	 * This returns CTTDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CTTDiagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CTTDiagram)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CTTDiagram_type") :
			getString("_UI_CTTDiagram_type") + " " + label;
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

		switch (notification.getFeatureID(CTTDiagram.class)) {
			case LciatPackage.CTT_DIAGRAM__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LciatPackage.CTT_DIAGRAM__CTT_TASKS:
			case LciatPackage.CTT_DIAGRAM__MF_CTT_NODES:
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
				(LciatPackage.Literals.CTT_DIAGRAM__CTT_TASKS,
				 LciatFactory.eINSTANCE.createCTTTask()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.CTT_DIAGRAM__CTT_TASKS,
				 LciatFactory.eINSTANCE.createExclusiveEdition()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.CTT_DIAGRAM__CTT_TASKS,
				 LciatFactory.eINSTANCE.createCollaborativeVisualization()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.CTT_DIAGRAM__CTT_TASKS,
				 LciatFactory.eINSTANCE.createIndividualVisualization()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.CTT_DIAGRAM__CTT_TASKS,
				 LciatFactory.eINSTANCE.createUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.CTT_DIAGRAM__CTT_TASKS,
				 LciatFactory.eINSTANCE.createCTTAbstractTask()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.CTT_DIAGRAM__CTT_TASKS,
				 LciatFactory.eINSTANCE.createInteractiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.CTT_DIAGRAM__CTT_TASKS,
				 LciatFactory.eINSTANCE.createCTTCollaborativeTask()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.CTT_DIAGRAM__CTT_TASKS,
				 LciatFactory.eINSTANCE.createApplicationTask()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.CTT_DIAGRAM__MF_CTT_NODES,
				 LciatFactory.eINSTANCE.createMolefMultimediaNode()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.CTT_DIAGRAM__MF_CTT_NODES,
				 LciatFactory.eINSTANCE.createMolefMultimedia1()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.CTT_DIAGRAM__MF_CTT_NODES,
				 LciatFactory.eINSTANCE.createMolefMultimedia2()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.CTT_DIAGRAM__MF_CTT_NODES,
				 LciatFactory.eINSTANCE.createMolefMultimedia3()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.CTT_DIAGRAM__MF_CTT_NODES,
				 LciatFactory.eINSTANCE.createMolefMultimedia4()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.CTT_DIAGRAM__MF_CTT_NODES,
				 LciatFactory.eINSTANCE.createMolefMultimedia5()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.CTT_DIAGRAM__MF_CTT_NODES,
				 LciatFactory.eINSTANCE.createMolefMultimedia6()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.CTT_DIAGRAM__MF_CTT_NODES,
				 LciatFactory.eINSTANCE.createMolefMultimedia7()));
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
