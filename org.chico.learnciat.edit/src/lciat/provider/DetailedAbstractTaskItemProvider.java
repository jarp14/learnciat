/**
 */
package lciat.provider;


import java.util.Collection;
import java.util.List;

import lciat.DetailedAbstractTask;
import lciat.LciatFactory;
import lciat.LciatPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link lciat.DetailedAbstractTask} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DetailedAbstractTaskItemProvider extends LearningActivityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetailedAbstractTaskItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(LciatPackage.Literals.DETAILED_ABSTRACT_TASK__LEARNING_NODES);
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
	 * This returns DetailedAbstractTask.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DetailedAbstractTask"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DetailedAbstractTask)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DetailedAbstractTask_type") :
			getString("_UI_DetailedAbstractTask_type") + " " + label;
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

		switch (notification.getFeatureID(DetailedAbstractTask.class)) {
			case LciatPackage.DETAILED_ABSTRACT_TASK__LEARNING_NODES:
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
				(LciatPackage.Literals.DETAILED_ABSTRACT_TASK__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createLearningNode()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.DETAILED_ABSTRACT_TASK__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createInit()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.DETAILED_ABSTRACT_TASK__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createEnd()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.DETAILED_ABSTRACT_TASK__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createLearningActivity()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.DETAILED_ABSTRACT_TASK__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createIndividualTask()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.DETAILED_ABSTRACT_TASK__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createGroupTask()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.DETAILED_ABSTRACT_TASK__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createAbstractTask()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.DETAILED_ABSTRACT_TASK__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createDetailedAbstractTask()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.DETAILED_ABSTRACT_TASK__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createTemporalCondition()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.DETAILED_ABSTRACT_TASK__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createNotification()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.DETAILED_ABSTRACT_TASK__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.DETAILED_ABSTRACT_TASK__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createSessionPanel()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.DETAILED_ABSTRACT_TASK__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createChat()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.DETAILED_ABSTRACT_TASK__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createTurnTakingTool()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.DETAILED_ABSTRACT_TASK__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createTelepointer()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.DETAILED_ABSTRACT_TASK__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createRadarView()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.DETAILED_ABSTRACT_TASK__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createProperties()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.DETAILED_ABSTRACT_TASK__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createConsole()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.DETAILED_ABSTRACT_TASK__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createProblems()));
	}

}
