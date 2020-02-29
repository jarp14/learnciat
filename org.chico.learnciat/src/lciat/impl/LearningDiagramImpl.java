/**
 */
package lciat.impl;

import java.util.Collection;

import lciat.LciatPackage;
import lciat.LearningDiagram;
import lciat.LearningNode;
import lciat.MolefLearningNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Learning Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lciat.impl.LearningDiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link lciat.impl.LearningDiagramImpl#getMolefLearningNodes <em>Molef Learning Nodes</em>}</li>
 *   <li>{@link lciat.impl.LearningDiagramImpl#getLearningNodes <em>Learning Nodes</em>}</li>
 *   <li>{@link lciat.impl.LearningDiagramImpl#getMfLearningNodes <em>Mf Learning Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LearningDiagramImpl extends EObjectImpl implements LearningDiagram {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Learning-Design :: ";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMolefLearningNodes() <em>Molef Learning Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMolefLearningNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<MolefLearningNode> molefLearningNodes;

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
	 * The cached value of the '{@link #getMfLearningNodes() <em>Mf Learning Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMfLearningNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<MolefLearningNode> mfLearningNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LearningDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LciatPackage.Literals.LEARNING_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.LEARNING_DIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MolefLearningNode> getMolefLearningNodes() {
		if (molefLearningNodes == null) {
			molefLearningNodes = new EObjectResolvingEList<MolefLearningNode>(MolefLearningNode.class, this, LciatPackage.LEARNING_DIAGRAM__MOLEF_LEARNING_NODES);
		}
		return molefLearningNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LearningNode> getLearningNodes() {
		if (learningNodes == null) {
			learningNodes = new EObjectContainmentEList<LearningNode>(LearningNode.class, this, LciatPackage.LEARNING_DIAGRAM__LEARNING_NODES);
		}
		return learningNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MolefLearningNode> getMfLearningNodes() {
		if (mfLearningNodes == null) {
			mfLearningNodes = new EObjectContainmentEList<MolefLearningNode>(MolefLearningNode.class, this, LciatPackage.LEARNING_DIAGRAM__MF_LEARNING_NODES);
		}
		return mfLearningNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LciatPackage.LEARNING_DIAGRAM__LEARNING_NODES:
				return ((InternalEList<?>)getLearningNodes()).basicRemove(otherEnd, msgs);
			case LciatPackage.LEARNING_DIAGRAM__MF_LEARNING_NODES:
				return ((InternalEList<?>)getMfLearningNodes()).basicRemove(otherEnd, msgs);
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
			case LciatPackage.LEARNING_DIAGRAM__NAME:
				return getName();
			case LciatPackage.LEARNING_DIAGRAM__MOLEF_LEARNING_NODES:
				return getMolefLearningNodes();
			case LciatPackage.LEARNING_DIAGRAM__LEARNING_NODES:
				return getLearningNodes();
			case LciatPackage.LEARNING_DIAGRAM__MF_LEARNING_NODES:
				return getMfLearningNodes();
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
			case LciatPackage.LEARNING_DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case LciatPackage.LEARNING_DIAGRAM__MOLEF_LEARNING_NODES:
				getMolefLearningNodes().clear();
				getMolefLearningNodes().addAll((Collection<? extends MolefLearningNode>)newValue);
				return;
			case LciatPackage.LEARNING_DIAGRAM__LEARNING_NODES:
				getLearningNodes().clear();
				getLearningNodes().addAll((Collection<? extends LearningNode>)newValue);
				return;
			case LciatPackage.LEARNING_DIAGRAM__MF_LEARNING_NODES:
				getMfLearningNodes().clear();
				getMfLearningNodes().addAll((Collection<? extends MolefLearningNode>)newValue);
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
			case LciatPackage.LEARNING_DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LciatPackage.LEARNING_DIAGRAM__MOLEF_LEARNING_NODES:
				getMolefLearningNodes().clear();
				return;
			case LciatPackage.LEARNING_DIAGRAM__LEARNING_NODES:
				getLearningNodes().clear();
				return;
			case LciatPackage.LEARNING_DIAGRAM__MF_LEARNING_NODES:
				getMfLearningNodes().clear();
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
			case LciatPackage.LEARNING_DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LciatPackage.LEARNING_DIAGRAM__MOLEF_LEARNING_NODES:
				return molefLearningNodes != null && !molefLearningNodes.isEmpty();
			case LciatPackage.LEARNING_DIAGRAM__LEARNING_NODES:
				return learningNodes != null && !learningNodes.isEmpty();
			case LciatPackage.LEARNING_DIAGRAM__MF_LEARNING_NODES:
				return mfLearningNodes != null && !mfLearningNodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LearningDiagramImpl
