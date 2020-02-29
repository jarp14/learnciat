/**
 */
package lciat.provider;


import java.util.Collection;
import java.util.List;

import lciat.LciatFactory;
import lciat.LciatPackage;
import lciat.LearningDiagram;

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
 * This is the item provider adapter for a {@link lciat.LearningDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LearningDiagramItemProvider 
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
	public LearningDiagramItemProvider(AdapterFactory adapterFactory) {
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
			addMolefLearningNodesPropertyDescriptor(object);
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
				 getString("_UI_LearningDiagram_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LearningDiagram_name_feature", "_UI_LearningDiagram_type"),
				 LciatPackage.Literals.LEARNING_DIAGRAM__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Molef Learning Nodes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMolefLearningNodesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LearningDiagram_molefLearningNodes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LearningDiagram_molefLearningNodes_feature", "_UI_LearningDiagram_type"),
				 LciatPackage.Literals.LEARNING_DIAGRAM__MOLEF_LEARNING_NODES,
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
			childrenFeatures.add(LciatPackage.Literals.LEARNING_DIAGRAM__LEARNING_NODES);
			childrenFeatures.add(LciatPackage.Literals.LEARNING_DIAGRAM__MF_LEARNING_NODES);
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
	 * This returns LearningDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LearningDiagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LearningDiagram)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_LearningDiagram_type") :
			getString("_UI_LearningDiagram_type") + " " + label;
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

		switch (notification.getFeatureID(LearningDiagram.class)) {
			case LciatPackage.LEARNING_DIAGRAM__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LciatPackage.LEARNING_DIAGRAM__LEARNING_NODES:
			case LciatPackage.LEARNING_DIAGRAM__MF_LEARNING_NODES:
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
				(LciatPackage.Literals.LEARNING_DIAGRAM__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createLearningNode()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createInit()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createEnd()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createLearningActivity()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createIndividualTask()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createGroupTask()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createAbstractTask()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createDetailedAbstractTask()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createTemporalCondition()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createNotification()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createSessionPanel()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createChat()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createTurnTakingTool()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createTelepointer()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createRadarView()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createProperties()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createConsole()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__LEARNING_NODES,
				 LciatFactory.eINSTANCE.createProblems()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__MF_LEARNING_NODES,
				 LciatFactory.eINSTANCE.createMolefTaskAndActivitiesNode()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__MF_LEARNING_NODES,
				 LciatFactory.eINSTANCE.createMolefTActivities1()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__MF_LEARNING_NODES,
				 LciatFactory.eINSTANCE.createMolefTActivities2()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__MF_LEARNING_NODES,
				 LciatFactory.eINSTANCE.createMolefTActivities3()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__MF_LEARNING_NODES,
				 LciatFactory.eINSTANCE.createMolefTActivities4()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__MF_LEARNING_NODES,
				 LciatFactory.eINSTANCE.createMolefTActivities5()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__MF_LEARNING_NODES,
				 LciatFactory.eINSTANCE.createMolefTActivities6()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__MF_LEARNING_NODES,
				 LciatFactory.eINSTANCE.createMolefTActivities7()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__MF_LEARNING_NODES,
				 LciatFactory.eINSTANCE.createMolefTActivities8()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__MF_LEARNING_NODES,
				 LciatFactory.eINSTANCE.createMolefSocialNode()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__MF_LEARNING_NODES,
				 LciatFactory.eINSTANCE.createMolefSocial1()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__MF_LEARNING_NODES,
				 LciatFactory.eINSTANCE.createMolefSocial2()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__MF_LEARNING_NODES,
				 LciatFactory.eINSTANCE.createMolefSocial3()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__MF_LEARNING_NODES,
				 LciatFactory.eINSTANCE.createMolefSocial4()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__MF_LEARNING_NODES,
				 LciatFactory.eINSTANCE.createMolefPersonalizationNode()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__MF_LEARNING_NODES,
				 LciatFactory.eINSTANCE.createMolefPersonalization1()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__MF_LEARNING_NODES,
				 LciatFactory.eINSTANCE.createMolefPersonalization2()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__MF_LEARNING_NODES,
				 LciatFactory.eINSTANCE.createMolefPersonalization3()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__MF_LEARNING_NODES,
				 LciatFactory.eINSTANCE.createMolefPersonalization4()));

		newChildDescriptors.add
			(createChildParameter
				(LciatPackage.Literals.LEARNING_DIAGRAM__MF_LEARNING_NODES,
				 LciatFactory.eINSTANCE.createMolefPersonalization5()));
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
