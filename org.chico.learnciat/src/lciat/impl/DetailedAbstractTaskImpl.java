/**
 */
package lciat.impl;

import java.util.Collection;

import lciat.DetailedAbstractTask;
import lciat.LciatPackage;
import lciat.LearningNode;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Detailed Abstract Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lciat.impl.DetailedAbstractTaskImpl#getLearningNodes <em>Learning Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DetailedAbstractTaskImpl extends LearningActivityImpl implements DetailedAbstractTask {
	/**
	 * The cached value of the '{@link #getLearningNodes() <em>Learning Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearningNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<LearningNode> learningNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetailedAbstractTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LciatPackage.Literals.DETAILED_ABSTRACT_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LearningNode> getLearningNodes() {
		if (learningNodes == null) {
			learningNodes = new EObjectContainmentEList<LearningNode>(LearningNode.class, this, LciatPackage.DETAILED_ABSTRACT_TASK__LEARNING_NODES);
		}
		return learningNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LciatPackage.DETAILED_ABSTRACT_TASK__LEARNING_NODES:
				return ((InternalEList<?>)getLearningNodes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LciatPackage.DETAILED_ABSTRACT_TASK__LEARNING_NODES:
				return getLearningNodes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LciatPackage.DETAILED_ABSTRACT_TASK__LEARNING_NODES:
				getLearningNodes().clear();
				getLearningNodes().addAll((Collection<? extends LearningNode>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LciatPackage.DETAILED_ABSTRACT_TASK__LEARNING_NODES:
				getLearningNodes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LciatPackage.DETAILED_ABSTRACT_TASK__LEARNING_NODES:
				return learningNodes != null && !learningNodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DetailedAbstractTaskImpl
