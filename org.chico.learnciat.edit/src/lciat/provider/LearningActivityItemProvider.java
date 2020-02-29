/**
 */
package lciat.provider;


import java.util.Collection;
import java.util.List;

import lciat.LciatFactory;
import lciat.LciatPackage;
import lciat.LearningActivity;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link lciat.LearningActivity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LearningActivityItemProvider extends LearningNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningActivityItemProvider(AdapterFactory adapterFactory) {
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
			addItsModalityPropertyDescriptor(object);
			addItsSubtypePropertyDescriptor(object);
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
				 getString("_UI_LearningActivity_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LearningActivity_name_feature", "_UI_LearningActivity_type"),
				 LciatPackage.Literals.LEARNING_ACTIVITY__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Its Modality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addItsModalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LearningActivity_itsModality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LearningActivity_itsModality_feature", "_UI_LearningActivity_type"),
				 LciatPackage.Literals.LEARNING_ACTIVITY__ITS_MODALITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Its Subtype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addItsSubtypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LearningActivity_itsSubtype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LearningActivity_itsSubtype_feature", "_UI_LearningActivity_type"),
				 LciatPackage.Literals.LEARNING_ACTIVITY__ITS_SUBTYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(LciatPackage.Literals.LEARNING_ACTIVITY__TOOLS);
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
	 * This returns LearningActivity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LearningActivity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LearningActivity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_LearningActivity_type") :
			getString("_UI_LearningActivity_type") + " " + label;
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

		switch (notification.getFeatureID(LearningActivity.class)) {
			case LciatPackage.LEARNING_ACTIVITY__NAME:
			case LciatPackage.LEARNING_ACTIVITY__ITS_MODALITY:
			case LciatPackage.LEARNING_ACTIVITY__ITS_SUBTYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LciatPackage.LEARNING_ACTIVITY__TOOLS:
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
				(LciatPackage.Literals.LEARNING_ACTIVITY__TOOLS,
				 LciatFactory.eINSTANCE.createTool()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_ACTIVITY__TOOLS,
				 LciatFactory.eINSTANCE.createGraphicalEditor()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_ACTIVITY__TOOLS,
				 LciatFactory.eINSTANCE.createTextEditor()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_ACTIVITY__TOOLS,
				 LciatFactory.eINSTANCE.createCodeEditor()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_ACTIVITY__TOOLS,
				 LciatFactory.eINSTANCE.createWebViewer()));
	}

}
