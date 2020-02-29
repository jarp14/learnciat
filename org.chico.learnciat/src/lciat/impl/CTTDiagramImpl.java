/**
 */
package lciat.impl;

import java.util.Collection;

import lciat.CTTDiagram;
import lciat.CTTTask;
import lciat.LciatPackage;
import lciat.MolefCttNode;

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
 * An implementation of the model object '<em><b>CTT Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lciat.impl.CTTDiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link lciat.impl.CTTDiagramImpl#getMolefCttNodes <em>Molef Ctt Nodes</em>}</li>
 *   <li>{@link lciat.impl.CTTDiagramImpl#getCttTasks <em>Ctt Tasks</em>}</li>
 *   <li>{@link lciat.impl.CTTDiagramImpl#getMfCttNodes <em>Mf Ctt Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CTTDiagramImpl extends EObjectImpl implements CTTDiagram {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "CTT :: ";

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
	 * The cached value of the '{@link #getMolefCttNodes() <em>Molef Ctt Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMolefCttNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<MolefCttNode> molefCttNodes;

	/**
	 * The cached value of the '{@link #getCttTasks() <em>Ctt Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCttTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<CTTTask> cttTasks;

	/**
	 * The cached value of the '{@link #getMfCttNodes() <em>Mf Ctt Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMfCttNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<MolefCttNode> mfCttNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CTTDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LciatPackage.Literals.CTT_DIAGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.CTT_DIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MolefCttNode> getMolefCttNodes() {
		if (molefCttNodes == null) {
			molefCttNodes = new EObjectResolvingEList<MolefCttNode>(MolefCttNode.class, this, LciatPackage.CTT_DIAGRAM__MOLEF_CTT_NODES);
		}
		return molefCttNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CTTTask> getCttTasks() {
		if (cttTasks == null) {
			cttTasks = new EObjectContainmentEList<CTTTask>(CTTTask.class, this, LciatPackage.CTT_DIAGRAM__CTT_TASKS);
		}
		return cttTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MolefCttNode> getMfCttNodes() {
		if (mfCttNodes == null) {
			mfCttNodes = new EObjectContainmentEList<MolefCttNode>(MolefCttNode.class, this, LciatPackage.CTT_DIAGRAM__MF_CTT_NODES);
		}
		return mfCttNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LciatPackage.CTT_DIAGRAM__CTT_TASKS:
				return ((InternalEList<?>)getCttTasks()).basicRemove(otherEnd, msgs);
			case LciatPackage.CTT_DIAGRAM__MF_CTT_NODES:
				return ((InternalEList<?>)getMfCttNodes()).basicRemove(otherEnd, msgs);
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
			case LciatPackage.CTT_DIAGRAM__NAME:
				return getName();
			case LciatPackage.CTT_DIAGRAM__MOLEF_CTT_NODES:
				return getMolefCttNodes();
			case LciatPackage.CTT_DIAGRAM__CTT_TASKS:
				return getCttTasks();
			case LciatPackage.CTT_DIAGRAM__MF_CTT_NODES:
				return getMfCttNodes();
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
			case LciatPackage.CTT_DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case LciatPackage.CTT_DIAGRAM__MOLEF_CTT_NODES:
				getMolefCttNodes().clear();
				getMolefCttNodes().addAll((Collection<? extends MolefCttNode>)newValue);
				return;
			case LciatPackage.CTT_DIAGRAM__CTT_TASKS:
				getCttTasks().clear();
				getCttTasks().addAll((Collection<? extends CTTTask>)newValue);
				return;
			case LciatPackage.CTT_DIAGRAM__MF_CTT_NODES:
				getMfCttNodes().clear();
				getMfCttNodes().addAll((Collection<? extends MolefCttNode>)newValue);
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
			case LciatPackage.CTT_DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LciatPackage.CTT_DIAGRAM__MOLEF_CTT_NODES:
				getMolefCttNodes().clear();
				return;
			case LciatPackage.CTT_DIAGRAM__CTT_TASKS:
				getCttTasks().clear();
				return;
			case LciatPackage.CTT_DIAGRAM__MF_CTT_NODES:
				getMfCttNodes().clear();
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
			case LciatPackage.CTT_DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LciatPackage.CTT_DIAGRAM__MOLEF_CTT_NODES:
				return molefCttNodes != null && !molefCttNodes.isEmpty();
			case LciatPackage.CTT_DIAGRAM__CTT_TASKS:
				return cttTasks != null && !cttTasks.isEmpty();
			case LciatPackage.CTT_DIAGRAM__MF_CTT_NODES:
				return mfCttNodes != null && !mfCttNodes.isEmpty();
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

} //CTTDiagramImpl
