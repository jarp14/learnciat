/**
 */
package lciat.provider;


import java.util.Collection;
import java.util.List;

import lciat.GroupTask;
import lciat.LciatFactory;
import lciat.LciatPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link lciat.GroupTask} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GroupTaskItemProvider extends LearningActivityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupTaskItemProvider(AdapterFactory adapterFactory) {
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

			addEGL_ToolPropertyDescriptor(object);
			addEGL_TransformationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the EGL Tool feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEGL_ToolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GroupTask_EGL_Tool_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupTask_EGL_Tool_feature", "_UI_GroupTask_type"),
				 LciatPackage.Literals.GROUP_TASK__EGL_TOOL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the EGL Transformation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEGL_TransformationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GroupTask_EGL_Transformation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupTask_EGL_Transformation_feature", "_UI_GroupTask_type"),
				 LciatPackage.Literals.GROUP_TASK__EGL_TRANSFORMATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(LciatPackage.Literals.GROUP_TASK__TASK_ROLES);
			childrenFeatures.add(LciatPackage.Literals.GROUP_TASK__TASK_OBJECTS);
			childrenFeatures.add(LciatPackage.Literals.GROUP_TASK__SUBTYPE);
			childrenFeatures.add(LciatPackage.Literals.GROUP_TASK__MODALITY);
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
	 * This returns GroupTask.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GroupTask"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GroupTask)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GroupTask_type") :
			getString("_UI_GroupTask_type") + " " + label;
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

		switch (notification.getFeatureID(GroupTask.class)) {
			case LciatPackage.GROUP_TASK__EGL_TRANSFORMATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LciatPackage.GROUP_TASK__TASK_ROLES:
			case LciatPackage.GROUP_TASK__TASK_OBJECTS:
			case LciatPackage.GROUP_TASK__SUBTYPE:
			case LciatPackage.GROUP_TASK__MODALITY:
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
				(LciatPackage.Literals.GROUP_TASK__TASK_ROLES,
				 LciatFactory.eINSTANCE.createRol()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.GROUP_TASK__TASK_ROLES,
				 LciatFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.GROUP_TASK__TASK_OBJECTS,
				 LciatFactory.eINSTANCE.createObject()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.GROUP_TASK__SUBTYPE,
				 LciatFactory.eINSTANCE.createSubtype()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.GROUP_TASK__SUBTYPE,
				 LciatFactory.eINSTANCE.createAssimilative()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.GROUP_TASK__SUBTYPE,
				 LciatFactory.eINSTANCE.createInformationHandling()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.GROUP_TASK__SUBTYPE,
				 LciatFactory.eINSTANCE.createAdaptive()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.GROUP_TASK__SUBTYPE,
				 LciatFactory.eINSTANCE.createCommunicative()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.GROUP_TASK__SUBTYPE,
				 LciatFactory.eINSTANCE.createProductive()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.GROUP_TASK__SUBTYPE,
				 LciatFactory.eINSTANCE.createExperiential()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.GROUP_TASK__SUBTYPE,
				 LciatFactory.eINSTANCE.createEvaluative()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.GROUP_TASK__SUBTYPE,
				 LciatFactory.eINSTANCE.createSupport()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.GROUP_TASK__MODALITY,
				 LciatFactory.eINSTANCE.createModality()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.GROUP_TASK__MODALITY,
				 LciatFactory.eINSTANCE.createFaceToFace()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.GROUP_TASK__MODALITY,
				 LciatFactory.eINSTANCE.createComputerSupported()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.GROUP_TASK__MODALITY,
				 LciatFactory.eINSTANCE.createOnline()));
	}

}
