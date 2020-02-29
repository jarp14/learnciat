/**
 */
package lciat.impl;

import lciat.CodeEditor;
import lciat.Console;
import lciat.LciatPackage;
import lciat.Problems;
import lciat.RadarView;
import lciat.TurnTakingTool;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Editor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lciat.impl.CodeEditorImpl#getName <em>Name</em>}</li>
 *   <li>{@link lciat.impl.CodeEditorImpl#getTurnTakingTool <em>Turn Taking Tool</em>}</li>
 *   <li>{@link lciat.impl.CodeEditorImpl#getRadarView <em>Radar View</em>}</li>
 *   <li>{@link lciat.impl.CodeEditorImpl#getConsole <em>Console</em>}</li>
 *   <li>{@link lciat.impl.CodeEditorImpl#getProblems <em>Problems</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeEditorImpl extends ToolImpl implements CodeEditor {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Code Editor";

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
	 * The cached value of the '{@link #getTurnTakingTool() <em>Turn Taking Tool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurnTakingTool()
	 * @generated
	 * @ordered
	 */
	protected TurnTakingTool turnTakingTool;

	/**
	 * The cached value of the '{@link #getRadarView() <em>Radar View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadarView()
	 * @generated
	 * @ordered
	 */
	protected RadarView radarView;

	/**
	 * The cached value of the '{@link #getConsole() <em>Console</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsole()
	 * @generated
	 * @ordered
	 */
	protected Console console;

	/**
	 * The cached value of the '{@link #getProblems() <em>Problems</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblems()
	 * @generated
	 * @ordered
	 */
	protected Problems problems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeEditorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LciatPackage.Literals.CODE_EDITOR;
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
	public TurnTakingTool getTurnTakingTool() {
		if (turnTakingTool != null && turnTakingTool.eIsProxy()) {
			InternalEObject oldTurnTakingTool = (InternalEObject)turnTakingTool;
			turnTakingTool = (TurnTakingTool)eResolveProxy(oldTurnTakingTool);
			if (turnTakingTool != oldTurnTakingTool) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LciatPackage.CODE_EDITOR__TURN_TAKING_TOOL, oldTurnTakingTool, turnTakingTool));
			}
		}
		return turnTakingTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnTakingTool basicGetTurnTakingTool() {
		return turnTakingTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTurnTakingTool(TurnTakingTool newTurnTakingTool) {
		TurnTakingTool oldTurnTakingTool = turnTakingTool;
		turnTakingTool = newTurnTakingTool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.CODE_EDITOR__TURN_TAKING_TOOL, oldTurnTakingTool, turnTakingTool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadarView getRadarView() {
		if (radarView != null && radarView.eIsProxy()) {
			InternalEObject oldRadarView = (InternalEObject)radarView;
			radarView = (RadarView)eResolveProxy(oldRadarView);
			if (radarView != oldRadarView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LciatPackage.CODE_EDITOR__RADAR_VIEW, oldRadarView, radarView));
			}
		}
		return radarView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadarView basicGetRadarView() {
		return radarView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadarView(RadarView newRadarView) {
		RadarView oldRadarView = radarView;
		radarView = newRadarView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.CODE_EDITOR__RADAR_VIEW, oldRadarView, radarView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Console getConsole() {
		if (console != null && console.eIsProxy()) {
			InternalEObject oldConsole = (InternalEObject)console;
			console = (Console)eResolveProxy(oldConsole);
			if (console != oldConsole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LciatPackage.CODE_EDITOR__CONSOLE, oldConsole, console));
			}
		}
		return console;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Console basicGetConsole() {
		return console;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsole(Console newConsole) {
		Console oldConsole = console;
		console = newConsole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.CODE_EDITOR__CONSOLE, oldConsole, console));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Problems getProblems() {
		if (problems != null && problems.eIsProxy()) {
			InternalEObject oldProblems = (InternalEObject)problems;
			problems = (Problems)eResolveProxy(oldProblems);
			if (problems != oldProblems) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LciatPackage.CODE_EDITOR__PROBLEMS, oldProblems, problems));
			}
		}
		return problems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Problems basicGetProblems() {
		return problems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblems(Problems newProblems) {
		Problems oldProblems = problems;
		problems = newProblems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.CODE_EDITOR__PROBLEMS, oldProblems, problems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LciatPackage.CODE_EDITOR__NAME:
				return getName();
			case LciatPackage.CODE_EDITOR__TURN_TAKING_TOOL:
				if (resolve) return getTurnTakingTool();
				return basicGetTurnTakingTool();
			case LciatPackage.CODE_EDITOR__RADAR_VIEW:
				if (resolve) return getRadarView();
				return basicGetRadarView();
			case LciatPackage.CODE_EDITOR__CONSOLE:
				if (resolve) return getConsole();
				return basicGetConsole();
			case LciatPackage.CODE_EDITOR__PROBLEMS:
				if (resolve) return getProblems();
				return basicGetProblems();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LciatPackage.CODE_EDITOR__TURN_TAKING_TOOL:
				setTurnTakingTool((TurnTakingTool)newValue);
				return;
			case LciatPackage.CODE_EDITOR__RADAR_VIEW:
				setRadarView((RadarView)newValue);
				return;
			case LciatPackage.CODE_EDITOR__CONSOLE:
				setConsole((Console)newValue);
				return;
			case LciatPackage.CODE_EDITOR__PROBLEMS:
				setProblems((Problems)newValue);
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
			case LciatPackage.CODE_EDITOR__TURN_TAKING_TOOL:
				setTurnTakingTool((TurnTakingTool)null);
				return;
			case LciatPackage.CODE_EDITOR__RADAR_VIEW:
				setRadarView((RadarView)null);
				return;
			case LciatPackage.CODE_EDITOR__CONSOLE:
				setConsole((Console)null);
				return;
			case LciatPackage.CODE_EDITOR__PROBLEMS:
				setProblems((Problems)null);
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
			case LciatPackage.CODE_EDITOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LciatPackage.CODE_EDITOR__TURN_TAKING_TOOL:
				return turnTakingTool != null;
			case LciatPackage.CODE_EDITOR__RADAR_VIEW:
				return radarView != null;
			case LciatPackage.CODE_EDITOR__CONSOLE:
				return console != null;
			case LciatPackage.CODE_EDITOR__PROBLEMS:
				return problems != null;
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

} //CodeEditorImpl
