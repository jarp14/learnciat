/**
 */
package lciat.impl;

import java.util.Collection;

import lciat.CTTDiagram;
import lciat.LCIANDiagram;
import lciat.LciatPackage;
import lciat.LearningDiagram;
import lciat.Link;
import lciat.Sociogram;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LCIAN Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lciat.impl.LCIANDiagramImpl#getItsSociograms <em>Its Sociograms</em>}</li>
 *   <li>{@link lciat.impl.LCIANDiagramImpl#getItsLearningDiagrams <em>Its Learning Diagrams</em>}</li>
 *   <li>{@link lciat.impl.LCIANDiagramImpl#getItsCttDiagrams <em>Its Ctt Diagrams</em>}</li>
 *   <li>{@link lciat.impl.LCIANDiagramImpl#getItsLinks <em>Its Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LCIANDiagramImpl extends EObjectImpl implements LCIANDiagram {
	/**
	 * The cached value of the '{@link #getItsSociograms() <em>Its Sociograms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsSociograms()
	 * @generated
	 * @ordered
	 */
	protected EList<Sociogram> itsSociograms;

	/**
	 * The cached value of the '{@link #getItsLearningDiagrams() <em>Its Learning Diagrams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsLearningDiagrams()
	 * @generated
	 * @ordered
	 */
	protected EList<LearningDiagram> itsLearningDiagrams;

	/**
	 * The cached value of the '{@link #getItsCttDiagrams() <em>Its Ctt Diagrams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsCttDiagrams()
	 * @generated
	 * @ordered
	 */
	protected EList<CTTDiagram> itsCttDiagrams;

	/**
	 * The cached value of the '{@link #getItsLinks() <em>Its Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> itsLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LCIANDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LciatPackage.Literals.LCIAN_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sociogram> getItsSociograms() {
		if (itsSociograms == null) {
			itsSociograms = new EObjectContainmentEList<Sociogram>(Sociogram.class, this, LciatPackage.LCIAN_DIAGRAM__ITS_SOCIOGRAMS);
		}
		return itsSociograms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LearningDiagram> getItsLearningDiagrams() {
		if (itsLearningDiagrams == null) {
			itsLearningDiagrams = new EObjectContainmentEList<LearningDiagram>(LearningDiagram.class, this, LciatPackage.LCIAN_DIAGRAM__ITS_LEARNING_DIAGRAMS);
		}
		return itsLearningDiagrams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CTTDiagram> getItsCttDiagrams() {
		if (itsCttDiagrams == null) {
			itsCttDiagrams = new EObjectContainmentEList<CTTDiagram>(CTTDiagram.class, this, LciatPackage.LCIAN_DIAGRAM__ITS_CTT_DIAGRAMS);
		}
		return itsCttDiagrams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getItsLinks() {
		if (itsLinks == null) {
			itsLinks = new EObjectContainmentEList<Link>(Link.class, this, LciatPackage.LCIAN_DIAGRAM__ITS_LINKS);
		}
		return itsLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LciatPackage.LCIAN_DIAGRAM__ITS_SOCIOGRAMS:
				return ((InternalEList<?>)getItsSociograms()).basicRemove(otherEnd, msgs);
			case LciatPackage.LCIAN_DIAGRAM__ITS_LEARNING_DIAGRAMS:
				return ((InternalEList<?>)getItsLearningDiagrams()).basicRemove(otherEnd, msgs);
			case LciatPackage.LCIAN_DIAGRAM__ITS_CTT_DIAGRAMS:
				return ((InternalEList<?>)getItsCttDiagrams()).basicRemove(otherEnd, msgs);
			case LciatPackage.LCIAN_DIAGRAM__ITS_LINKS:
				return ((InternalEList<?>)getItsLinks()).basicRemove(otherEnd, msgs);
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
			case LciatPackage.LCIAN_DIAGRAM__ITS_SOCIOGRAMS:
				return getItsSociograms();
			case LciatPackage.LCIAN_DIAGRAM__ITS_LEARNING_DIAGRAMS:
				return getItsLearningDiagrams();
			case LciatPackage.LCIAN_DIAGRAM__ITS_CTT_DIAGRAMS:
				return getItsCttDiagrams();
			case LciatPackage.LCIAN_DIAGRAM__ITS_LINKS:
				return getItsLinks();
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
			case LciatPackage.LCIAN_DIAGRAM__ITS_SOCIOGRAMS:
				getItsSociograms().clear();
				getItsSociograms().addAll((Collection<? extends Sociogram>)newValue);
				return;
			case LciatPackage.LCIAN_DIAGRAM__ITS_LEARNING_DIAGRAMS:
				getItsLearningDiagrams().clear();
				getItsLearningDiagrams().addAll((Collection<? extends LearningDiagram>)newValue);
				return;
			case LciatPackage.LCIAN_DIAGRAM__ITS_CTT_DIAGRAMS:
				getItsCttDiagrams().clear();
				getItsCttDiagrams().addAll((Collection<? extends CTTDiagram>)newValue);
				return;
			case LciatPackage.LCIAN_DIAGRAM__ITS_LINKS:
				getItsLinks().clear();
				getItsLinks().addAll((Collection<? extends Link>)newValue);
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
			case LciatPackage.LCIAN_DIAGRAM__ITS_SOCIOGRAMS:
				getItsSociograms().clear();
				return;
			case LciatPackage.LCIAN_DIAGRAM__ITS_LEARNING_DIAGRAMS:
				getItsLearningDiagrams().clear();
				return;
			case LciatPackage.LCIAN_DIAGRAM__ITS_CTT_DIAGRAMS:
				getItsCttDiagrams().clear();
				return;
			case LciatPackage.LCIAN_DIAGRAM__ITS_LINKS:
				getItsLinks().clear();
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
			case LciatPackage.LCIAN_DIAGRAM__ITS_SOCIOGRAMS:
				return itsSociograms != null && !itsSociograms.isEmpty();
			case LciatPackage.LCIAN_DIAGRAM__ITS_LEARNING_DIAGRAMS:
				return itsLearningDiagrams != null && !itsLearningDiagrams.isEmpty();
			case LciatPackage.LCIAN_DIAGRAM__ITS_CTT_DIAGRAMS:
				return itsCttDiagrams != null && !itsCttDiagrams.isEmpty();
			case LciatPackage.LCIAN_DIAGRAM__ITS_LINKS:
				return itsLinks != null && !itsLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LCIANDiagramImpl
