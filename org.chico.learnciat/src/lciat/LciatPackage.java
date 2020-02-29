/**
 */
package lciat;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see lciat.LciatFactory
 * @model kind="package"
 * @generated
 */
public interface LciatPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lciat";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "lciat";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lciat";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LciatPackage eINSTANCE = lciat.impl.LciatPackageImpl.init();

	/**
	 * The meta object id for the '{@link lciat.impl.LCIANDiagramImpl <em>LCIAN Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.LCIANDiagramImpl
	 * @see lciat.impl.LciatPackageImpl#getLCIANDiagram()
	 * @generated
	 */
	int LCIAN_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Its Sociograms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCIAN_DIAGRAM__ITS_SOCIOGRAMS = 0;

	/**
	 * The feature id for the '<em><b>Its Learning Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCIAN_DIAGRAM__ITS_LEARNING_DIAGRAMS = 1;

	/**
	 * The feature id for the '<em><b>Its Ctt Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCIAN_DIAGRAM__ITS_CTT_DIAGRAMS = 2;

	/**
	 * The feature id for the '<em><b>Its Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCIAN_DIAGRAM__ITS_LINKS = 3;

	/**
	 * The number of structural features of the '<em>LCIAN Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCIAN_DIAGRAM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link lciat.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.LinkImpl
	 * @see lciat.impl.LciatPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link lciat.impl.SociogramImpl <em>Sociogram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.SociogramImpl
	 * @see lciat.impl.LciatPackageImpl#getSociogram()
	 * @generated
	 */
	int SOCIOGRAM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIOGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Its Sociogram Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIOGRAM__ITS_SOCIOGRAM_NODES = 1;

	/**
	 * The feature id for the '<em><b>Mf Content Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIOGRAM__MF_CONTENT_NODES = 2;

	/**
	 * The number of structural features of the '<em>Sociogram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIOGRAM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link lciat.impl.SociogramNodeImpl <em>Sociogram Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.SociogramNodeImpl
	 * @see lciat.impl.LciatPackageImpl#getSociogramNode()
	 * @generated
	 */
	int SOCIOGRAM_NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIOGRAM_NODE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Sociogram Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIOGRAM_NODE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link lciat.impl.RolImpl <em>Rol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.RolImpl
	 * @see lciat.impl.LciatPackageImpl#getRol()
	 * @generated
	 */
	int ROL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__NAME = SOCIOGRAM_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Its Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__ITS_GROUP = SOCIOGRAM_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__SUPERTYPE = SOCIOGRAM_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__SUBTYPE = SOCIOGRAM_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_FEATURE_COUNT = SOCIOGRAM_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link lciat.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.GroupImpl
	 * @see lciat.impl.LciatPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = SOCIOGRAM_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONTAINS = SOCIOGRAM_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = SOCIOGRAM_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.SociogramLinkImpl <em>Sociogram Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.SociogramLinkImpl
	 * @see lciat.impl.LciatPackageImpl#getSociogramLink()
	 * @generated
	 */
	int SOCIOGRAM_LINK = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIOGRAM_LINK__SOURCE = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIOGRAM_LINK__TARGET = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sociogram Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIOGRAM_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lciat.impl.InheritanceImpl <em>Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.InheritanceImpl
	 * @see lciat.impl.LciatPackageImpl#getInheritance()
	 * @generated
	 */
	int INHERITANCE = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__SOURCE = SOCIOGRAM_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__TARGET = SOCIOGRAM_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__CONDITION = SOCIOGRAM_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_FEATURE_COUNT = SOCIOGRAM_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.ActingImpl <em>Acting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.ActingImpl
	 * @see lciat.impl.LciatPackageImpl#getActing()
	 * @generated
	 */
	int ACTING = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTING__SOURCE = SOCIOGRAM_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTING__TARGET = SOCIOGRAM_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTING__NAME = SOCIOGRAM_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTING__N = SOCIOGRAM_LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTING__M = SOCIOGRAM_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Acting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTING_FEATURE_COUNT = SOCIOGRAM_LINK_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link lciat.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.AssociationImpl
	 * @see lciat.impl.LciatPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = SOCIOGRAM_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = SOCIOGRAM_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = SOCIOGRAM_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__N = SOCIOGRAM_LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__M = SOCIOGRAM_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = SOCIOGRAM_LINK_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link lciat.impl.LearningDiagramImpl <em>Learning Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.LearningDiagramImpl
	 * @see lciat.impl.LciatPackageImpl#getLearningDiagram()
	 * @generated
	 */
	int LEARNING_DIAGRAM = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_DIAGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Molef Learning Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_DIAGRAM__MOLEF_LEARNING_NODES = 1;

	/**
	 * The feature id for the '<em><b>Learning Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_DIAGRAM__LEARNING_NODES = 2;

	/**
	 * The feature id for the '<em><b>Mf Learning Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_DIAGRAM__MF_LEARNING_NODES = 3;

	/**
	 * The number of structural features of the '<em>Learning Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_DIAGRAM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link lciat.impl.LearningNodeImpl <em>Learning Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.LearningNodeImpl
	 * @see lciat.impl.LciatPackageImpl#getLearningNode()
	 * @generated
	 */
	int LEARNING_NODE = 11;

	/**
	 * The number of structural features of the '<em>Learning Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_NODE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link lciat.impl.InitImpl <em>Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.InitImpl
	 * @see lciat.impl.LciatPackageImpl#getInit()
	 * @generated
	 */
	int INIT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT__NAME = LEARNING_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_FEATURE_COUNT = LEARNING_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.EndImpl
	 * @see lciat.impl.LciatPackageImpl#getEnd()
	 * @generated
	 */
	int END = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__NAME = LEARNING_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = LEARNING_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.LearningActivityImpl <em>Learning Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.LearningActivityImpl
	 * @see lciat.impl.LciatPackageImpl#getLearningActivity()
	 * @generated
	 */
	int LEARNING_ACTIVITY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_ACTIVITY__NAME = LEARNING_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Its Modality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_ACTIVITY__ITS_MODALITY = LEARNING_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Its Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_ACTIVITY__ITS_SUBTYPE = LEARNING_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_ACTIVITY__TOOLS = LEARNING_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Learning Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_ACTIVITY_FEATURE_COUNT = LEARNING_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link lciat.impl.LeftSideLearningNodeImpl <em>Left Side Learning Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.LeftSideLearningNodeImpl
	 * @see lciat.impl.LciatPackageImpl#getLeftSideLearningNode()
	 * @generated
	 */
	int LEFT_SIDE_LEARNING_NODE = 15;

	/**
	 * The number of structural features of the '<em>Left Side Learning Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SIDE_LEARNING_NODE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link lciat.impl.IndividualTaskImpl <em>Individual Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.IndividualTaskImpl
	 * @see lciat.impl.LciatPackageImpl#getIndividualTask()
	 * @generated
	 */
	int INDIVIDUAL_TASK = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_TASK__NAME = LEARNING_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Its Modality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_TASK__ITS_MODALITY = LEARNING_ACTIVITY__ITS_MODALITY;

	/**
	 * The feature id for the '<em><b>Its Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_TASK__ITS_SUBTYPE = LEARNING_ACTIVITY__ITS_SUBTYPE;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_TASK__TOOLS = LEARNING_ACTIVITY__TOOLS;

	/**
	 * The feature id for the '<em><b>Task Roles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_TASK__TASK_ROLES = LEARNING_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Task Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_TASK__TASK_OBJECTS = LEARNING_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_TASK__SUBTYPE = LEARNING_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_TASK__MODALITY = LEARNING_ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Individual Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_TASK_FEATURE_COUNT = LEARNING_ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link lciat.impl.GroupTaskImpl <em>Group Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.GroupTaskImpl
	 * @see lciat.impl.LciatPackageImpl#getGroupTask()
	 * @generated
	 */
	int GROUP_TASK = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TASK__NAME = LEARNING_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Its Modality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TASK__ITS_MODALITY = LEARNING_ACTIVITY__ITS_MODALITY;

	/**
	 * The feature id for the '<em><b>Its Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TASK__ITS_SUBTYPE = LEARNING_ACTIVITY__ITS_SUBTYPE;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TASK__TOOLS = LEARNING_ACTIVITY__TOOLS;

	/**
	 * The feature id for the '<em><b>Task Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TASK__TASK_ROLES = LEARNING_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Task Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TASK__TASK_OBJECTS = LEARNING_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TASK__SUBTYPE = LEARNING_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TASK__MODALITY = LEARNING_ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EGL Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TASK__EGL_TOOL = LEARNING_ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EGL Transformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TASK__EGL_TRANSFORMATION = LEARNING_ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Group Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TASK_FEATURE_COUNT = LEARNING_ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link lciat.impl.AbstractTaskImpl <em>Abstract Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.AbstractTaskImpl
	 * @see lciat.impl.LciatPackageImpl#getAbstractTask()
	 * @generated
	 */
	int ABSTRACT_TASK = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK__NAME = LEARNING_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Its Modality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK__ITS_MODALITY = LEARNING_ACTIVITY__ITS_MODALITY;

	/**
	 * The feature id for the '<em><b>Its Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK__ITS_SUBTYPE = LEARNING_ACTIVITY__ITS_SUBTYPE;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK__TOOLS = LEARNING_ACTIVITY__TOOLS;

	/**
	 * The feature id for the '<em><b>Task Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK__TASK_ROLES = LEARNING_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Task Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK__TASK_OBJECTS = LEARNING_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK__SUBTYPE = LEARNING_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK__MODALITY = LEARNING_ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK_FEATURE_COUNT = LEARNING_ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link lciat.impl.DetailedAbstractTaskImpl <em>Detailed Abstract Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.DetailedAbstractTaskImpl
	 * @see lciat.impl.LciatPackageImpl#getDetailedAbstractTask()
	 * @generated
	 */
	int DETAILED_ABSTRACT_TASK = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_ABSTRACT_TASK__NAME = LEARNING_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Its Modality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_ABSTRACT_TASK__ITS_MODALITY = LEARNING_ACTIVITY__ITS_MODALITY;

	/**
	 * The feature id for the '<em><b>Its Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_ABSTRACT_TASK__ITS_SUBTYPE = LEARNING_ACTIVITY__ITS_SUBTYPE;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_ABSTRACT_TASK__TOOLS = LEARNING_ACTIVITY__TOOLS;

	/**
	 * The feature id for the '<em><b>Learning Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_ABSTRACT_TASK__LEARNING_NODES = LEARNING_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Detailed Abstract Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_ABSTRACT_TASK_FEATURE_COUNT = LEARNING_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.ObjectImpl
	 * @see lciat.impl.LciatPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__MODIFIER = 2;

	/**
	 * The feature id for the '<em><b>Modified By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__MODIFIED_BY = 3;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link lciat.impl.TemporalConditionImpl <em>Temporal Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.TemporalConditionImpl
	 * @see lciat.impl.LciatPackageImpl#getTemporalCondition()
	 * @generated
	 */
	int TEMPORAL_CONDITION = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONDITION__NAME = LEARNING_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Temporal Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONDITION_FEATURE_COUNT = LEARNING_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.NotificationImpl <em>Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.NotificationImpl
	 * @see lciat.impl.LciatPackageImpl#getNotification()
	 * @generated
	 */
	int NOTIFICATION = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__NAME = LEARNING_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_FEATURE_COUNT = LEARNING_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.ConditionImpl
	 * @see lciat.impl.LciatPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = LEARNING_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = LEARNING_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.SubtypeImpl <em>Subtype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.SubtypeImpl
	 * @see lciat.impl.LciatPackageImpl#getSubtype()
	 * @generated
	 */
	int SUBTYPE = 24;

	/**
	 * The number of structural features of the '<em>Subtype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link lciat.impl.AssimilativeImpl <em>Assimilative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.AssimilativeImpl
	 * @see lciat.impl.LciatPackageImpl#getAssimilative()
	 * @generated
	 */
	int ASSIMILATIVE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIMILATIVE__NAME = SUBTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assimilative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIMILATIVE_FEATURE_COUNT = SUBTYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.InformationHandlingImpl <em>Information Handling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.InformationHandlingImpl
	 * @see lciat.impl.LciatPackageImpl#getInformationHandling()
	 * @generated
	 */
	int INFORMATION_HANDLING = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_HANDLING__NAME = SUBTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Information Handling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_HANDLING_FEATURE_COUNT = SUBTYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.AdaptiveImpl <em>Adaptive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.AdaptiveImpl
	 * @see lciat.impl.LciatPackageImpl#getAdaptive()
	 * @generated
	 */
	int ADAPTIVE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTIVE__NAME = SUBTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adaptive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTIVE_FEATURE_COUNT = SUBTYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.CommunicativeImpl <em>Communicative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.CommunicativeImpl
	 * @see lciat.impl.LciatPackageImpl#getCommunicative()
	 * @generated
	 */
	int COMMUNICATIVE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE__NAME = SUBTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Communicative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_FEATURE_COUNT = SUBTYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.ProductiveImpl <em>Productive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.ProductiveImpl
	 * @see lciat.impl.LciatPackageImpl#getProductive()
	 * @generated
	 */
	int PRODUCTIVE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTIVE__NAME = SUBTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Productive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTIVE_FEATURE_COUNT = SUBTYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.ExperientialImpl <em>Experiential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.ExperientialImpl
	 * @see lciat.impl.LciatPackageImpl#getExperiential()
	 * @generated
	 */
	int EXPERIENTIAL = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENTIAL__NAME = SUBTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Experiential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENTIAL_FEATURE_COUNT = SUBTYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.EvaluativeImpl <em>Evaluative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.EvaluativeImpl
	 * @see lciat.impl.LciatPackageImpl#getEvaluative()
	 * @generated
	 */
	int EVALUATIVE = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATIVE__NAME = SUBTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evaluative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATIVE_FEATURE_COUNT = SUBTYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.SupportImpl <em>Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.SupportImpl
	 * @see lciat.impl.LciatPackageImpl#getSupport()
	 * @generated
	 */
	int SUPPORT = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT__NAME = SUBTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_FEATURE_COUNT = SUBTYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.ModalityImpl <em>Modality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.ModalityImpl
	 * @see lciat.impl.LciatPackageImpl#getModality()
	 * @generated
	 */
	int MODALITY = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Modality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link lciat.impl.FaceToFaceImpl <em>Face To Face</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.FaceToFaceImpl
	 * @see lciat.impl.LciatPackageImpl#getFaceToFace()
	 * @generated
	 */
	int FACE_TO_FACE = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE_TO_FACE__NAME = MODALITY__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE_TO_FACE__KIND = MODALITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Face To Face</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE_TO_FACE_FEATURE_COUNT = MODALITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.ComputerSupportedImpl <em>Computer Supported</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.ComputerSupportedImpl
	 * @see lciat.impl.LciatPackageImpl#getComputerSupported()
	 * @generated
	 */
	int COMPUTER_SUPPORTED = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_SUPPORTED__NAME = MODALITY__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_SUPPORTED__KIND = MODALITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Computer Supported</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_SUPPORTED_FEATURE_COUNT = MODALITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.OnlineImpl <em>Online</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.OnlineImpl
	 * @see lciat.impl.LciatPackageImpl#getOnline()
	 * @generated
	 */
	int ONLINE = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE__NAME = MODALITY__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE__KIND = MODALITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Online</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_FEATURE_COUNT = MODALITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.LearningLinkImpl <em>Learning Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.LearningLinkImpl
	 * @see lciat.impl.LciatPackageImpl#getLearningLink()
	 * @generated
	 */
	int LEARNING_LINK = 37;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_LINK__SOURCE = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_LINK__TARGET = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Learning Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lciat.impl.EnablingWOInformationImpl <em>Enabling WO Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.EnablingWOInformationImpl
	 * @see lciat.impl.LciatPackageImpl#getEnablingWOInformation()
	 * @generated
	 */
	int ENABLING_WO_INFORMATION = 38;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING_WO_INFORMATION__SOURCE = LEARNING_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING_WO_INFORMATION__TARGET = LEARNING_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>ELabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING_WO_INFORMATION__ELABEL = LEARNING_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enabling WO Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING_WO_INFORMATION_FEATURE_COUNT = LEARNING_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.EnablingWInformationImpl <em>Enabling WInformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.EnablingWInformationImpl
	 * @see lciat.impl.LciatPackageImpl#getEnablingWInformation()
	 * @generated
	 */
	int ENABLING_WINFORMATION = 39;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING_WINFORMATION__SOURCE = LEARNING_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING_WINFORMATION__TARGET = LEARNING_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Ew Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING_WINFORMATION__EW_LABEL = LEARNING_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enabling WInformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING_WINFORMATION_FEATURE_COUNT = LEARNING_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.ChoiceImpl
	 * @see lciat.impl.LciatPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 40;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__SOURCE = LEARNING_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__TARGET = LEARNING_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Dt Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__DT_LABEL = LEARNING_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = LEARNING_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.ConcurrencyImpl <em>Concurrency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.ConcurrencyImpl
	 * @see lciat.impl.LciatPackageImpl#getConcurrency()
	 * @generated
	 */
	int CONCURRENCY = 41;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY__SOURCE = LEARNING_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY__TARGET = LEARNING_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Ic Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY__IC_LABEL = LEARNING_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concurrency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_FEATURE_COUNT = LEARNING_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.ToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.ToolImpl
	 * @see lciat.impl.LciatPackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 42;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__KIND = 0;

	/**
	 * The feature id for the '<em><b>Chat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__CHAT = 1;

	/**
	 * The feature id for the '<em><b>Session Panel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__SESSION_PANEL = 2;

	/**
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link lciat.impl.GraphicalEditorImpl <em>Graphical Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.GraphicalEditorImpl
	 * @see lciat.impl.LciatPackageImpl#getGraphicalEditor()
	 * @generated
	 */
	int GRAPHICAL_EDITOR = 43;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_EDITOR__KIND = TOOL__KIND;

	/**
	 * The feature id for the '<em><b>Chat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_EDITOR__CHAT = TOOL__CHAT;

	/**
	 * The feature id for the '<em><b>Session Panel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_EDITOR__SESSION_PANEL = TOOL__SESSION_PANEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_EDITOR__NAME = TOOL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Turn Taking Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_EDITOR__TURN_TAKING_TOOL = TOOL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Telepointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_EDITOR__TELEPOINTER = TOOL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Radar View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_EDITOR__RADAR_VIEW = TOOL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_EDITOR__PROPERTIES = TOOL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Problems</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_EDITOR__PROBLEMS = TOOL_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Graphical Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_EDITOR_FEATURE_COUNT = TOOL_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link lciat.impl.TextEditorImpl <em>Text Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.TextEditorImpl
	 * @see lciat.impl.LciatPackageImpl#getTextEditor()
	 * @generated
	 */
	int TEXT_EDITOR = 44;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EDITOR__KIND = TOOL__KIND;

	/**
	 * The feature id for the '<em><b>Chat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EDITOR__CHAT = TOOL__CHAT;

	/**
	 * The feature id for the '<em><b>Session Panel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EDITOR__SESSION_PANEL = TOOL__SESSION_PANEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EDITOR__NAME = TOOL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Turn Taking Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EDITOR__TURN_TAKING_TOOL = TOOL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Radar View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EDITOR__RADAR_VIEW = TOOL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Console</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EDITOR__CONSOLE = TOOL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Problems</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EDITOR__PROBLEMS = TOOL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Text Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EDITOR_FEATURE_COUNT = TOOL_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link lciat.impl.CodeEditorImpl <em>Code Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.CodeEditorImpl
	 * @see lciat.impl.LciatPackageImpl#getCodeEditor()
	 * @generated
	 */
	int CODE_EDITOR = 45;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EDITOR__KIND = TOOL__KIND;

	/**
	 * The feature id for the '<em><b>Chat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EDITOR__CHAT = TOOL__CHAT;

	/**
	 * The feature id for the '<em><b>Session Panel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EDITOR__SESSION_PANEL = TOOL__SESSION_PANEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EDITOR__NAME = TOOL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Turn Taking Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EDITOR__TURN_TAKING_TOOL = TOOL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Radar View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EDITOR__RADAR_VIEW = TOOL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Console</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EDITOR__CONSOLE = TOOL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Problems</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EDITOR__PROBLEMS = TOOL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Code Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EDITOR_FEATURE_COUNT = TOOL_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link lciat.impl.WebViewerImpl <em>Web Viewer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.WebViewerImpl
	 * @see lciat.impl.LciatPackageImpl#getWebViewer()
	 * @generated
	 */
	int WEB_VIEWER = 46;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_VIEWER__KIND = TOOL__KIND;

	/**
	 * The feature id for the '<em><b>Chat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_VIEWER__CHAT = TOOL__CHAT;

	/**
	 * The feature id for the '<em><b>Session Panel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_VIEWER__SESSION_PANEL = TOOL__SESSION_PANEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_VIEWER__NAME = TOOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Web Viewer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_VIEWER_FEATURE_COUNT = TOOL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.AwarenessImpl <em>Awareness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.AwarenessImpl
	 * @see lciat.impl.LciatPackageImpl#getAwareness()
	 * @generated
	 */
	int AWARENESS = 47;

	/**
	 * The number of structural features of the '<em>Awareness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARENESS_FEATURE_COUNT = LEARNING_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lciat.impl.SessionPanelImpl <em>Session Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.SessionPanelImpl
	 * @see lciat.impl.LciatPackageImpl#getSessionPanel()
	 * @generated
	 */
	int SESSION_PANEL = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_PANEL__NAME = AWARENESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_PANEL__POSITION = AWARENESS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_PANEL__LANGUAGE = AWARENESS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_PANEL__SIZE = AWARENESS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Session Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_PANEL_FEATURE_COUNT = AWARENESS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link lciat.impl.ChatImpl <em>Chat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.ChatImpl
	 * @see lciat.impl.LciatPackageImpl#getChat()
	 * @generated
	 */
	int CHAT = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT__NAME = AWARENESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Structured</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT__IS_STRUCTURED = AWARENESS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT__POSITION = AWARENESS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT__LANGUAGE = AWARENESS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT__SIZE = AWARENESS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Chat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT_FEATURE_COUNT = AWARENESS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link lciat.impl.TurnTakingToolImpl <em>Turn Taking Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.TurnTakingToolImpl
	 * @see lciat.impl.LciatPackageImpl#getTurnTakingTool()
	 * @generated
	 */
	int TURN_TAKING_TOOL = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_TAKING_TOOL__NAME = AWARENESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_TAKING_TOOL__POSITION = AWARENESS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_TAKING_TOOL__LANGUAGE = AWARENESS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_TAKING_TOOL__SIZE = AWARENESS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Turn Taking Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_TAKING_TOOL_FEATURE_COUNT = AWARENESS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link lciat.impl.TelepointerImpl <em>Telepointer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.TelepointerImpl
	 * @see lciat.impl.LciatPackageImpl#getTelepointer()
	 * @generated
	 */
	int TELEPOINTER = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPOINTER__NAME = AWARENESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Telepointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPOINTER_FEATURE_COUNT = AWARENESS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.RadarViewImpl <em>Radar View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.RadarViewImpl
	 * @see lciat.impl.LciatPackageImpl#getRadarView()
	 * @generated
	 */
	int RADAR_VIEW = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADAR_VIEW__NAME = AWARENESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADAR_VIEW__POSITION = AWARENESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Radar View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADAR_VIEW_FEATURE_COUNT = AWARENESS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lciat.impl.PropertiesImpl <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.PropertiesImpl
	 * @see lciat.impl.LciatPackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__NAME = AWARENESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__POSITION = AWARENESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_FEATURE_COUNT = AWARENESS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lciat.impl.ConsoleImpl <em>Console</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.ConsoleImpl
	 * @see lciat.impl.LciatPackageImpl#getConsole()
	 * @generated
	 */
	int CONSOLE = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLE__NAME = AWARENESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLE__POSITION = AWARENESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Console</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLE_FEATURE_COUNT = AWARENESS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lciat.impl.ProblemsImpl <em>Problems</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.ProblemsImpl
	 * @see lciat.impl.LciatPackageImpl#getProblems()
	 * @generated
	 */
	int PROBLEMS = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEMS__NAME = AWARENESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEMS__POSITION = AWARENESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Problems</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEMS_FEATURE_COUNT = AWARENESS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lciat.impl.TraceabilityImpl <em>Traceability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.TraceabilityImpl
	 * @see lciat.impl.LciatPackageImpl#getTraceability()
	 * @generated
	 */
	int TRACEABILITY = 56;

	/**
	 * The feature id for the '<em><b>Awarelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY__AWARELEMENT = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Toolelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY__TOOLELEMENT = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traceability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lciat.impl.CTTDiagramImpl <em>CTT Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.CTTDiagramImpl
	 * @see lciat.impl.LciatPackageImpl#getCTTDiagram()
	 * @generated
	 */
	int CTT_DIAGRAM = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_DIAGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Molef Ctt Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_DIAGRAM__MOLEF_CTT_NODES = 1;

	/**
	 * The feature id for the '<em><b>Ctt Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_DIAGRAM__CTT_TASKS = 2;

	/**
	 * The feature id for the '<em><b>Mf Ctt Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_DIAGRAM__MF_CTT_NODES = 3;

	/**
	 * The number of structural features of the '<em>CTT Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_DIAGRAM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link lciat.impl.CTTTaskImpl <em>CTT Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.CTTTaskImpl
	 * @see lciat.impl.LciatPackageImpl#getCTTTask()
	 * @generated
	 */
	int CTT_TASK = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_TASK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ctt Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_TASK__CTT_LINKS = 1;

	/**
	 * The number of structural features of the '<em>CTT Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_TASK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link lciat.impl.ExclusiveEditionImpl <em>Exclusive Edition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.ExclusiveEditionImpl
	 * @see lciat.impl.LciatPackageImpl#getExclusiveEdition()
	 * @generated
	 */
	int EXCLUSIVE_EDITION = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_EDITION__NAME = CTT_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Ctt Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_EDITION__CTT_LINKS = CTT_TASK__CTT_LINKS;

	/**
	 * The number of structural features of the '<em>Exclusive Edition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_EDITION_FEATURE_COUNT = CTT_TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lciat.impl.CollaborativeVisualizationImpl <em>Collaborative Visualization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.CollaborativeVisualizationImpl
	 * @see lciat.impl.LciatPackageImpl#getCollaborativeVisualization()
	 * @generated
	 */
	int COLLABORATIVE_VISUALIZATION = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_VISUALIZATION__NAME = CTT_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Ctt Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_VISUALIZATION__CTT_LINKS = CTT_TASK__CTT_LINKS;

	/**
	 * The number of structural features of the '<em>Collaborative Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_VISUALIZATION_FEATURE_COUNT = CTT_TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lciat.impl.IndividualVisualizationImpl <em>Individual Visualization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.IndividualVisualizationImpl
	 * @see lciat.impl.LciatPackageImpl#getIndividualVisualization()
	 * @generated
	 */
	int INDIVIDUAL_VISUALIZATION = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_VISUALIZATION__NAME = CTT_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Ctt Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_VISUALIZATION__CTT_LINKS = CTT_TASK__CTT_LINKS;

	/**
	 * The number of structural features of the '<em>Individual Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_VISUALIZATION_FEATURE_COUNT = CTT_TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lciat.impl.UserTaskImpl <em>User Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.UserTaskImpl
	 * @see lciat.impl.LciatPackageImpl#getUserTask()
	 * @generated
	 */
	int USER_TASK = 62;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__NAME = CTT_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Ctt Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__CTT_LINKS = CTT_TASK__CTT_LINKS;

	/**
	 * The number of structural features of the '<em>User Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_FEATURE_COUNT = CTT_TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lciat.impl.CTTAbstractTaskImpl <em>CTT Abstract Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.CTTAbstractTaskImpl
	 * @see lciat.impl.LciatPackageImpl#getCTTAbstractTask()
	 * @generated
	 */
	int CTT_ABSTRACT_TASK = 63;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_ABSTRACT_TASK__NAME = CTT_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Ctt Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_ABSTRACT_TASK__CTT_LINKS = CTT_TASK__CTT_LINKS;

	/**
	 * The number of structural features of the '<em>CTT Abstract Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_ABSTRACT_TASK_FEATURE_COUNT = CTT_TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lciat.impl.InteractiveTaskImpl <em>Interactive Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.InteractiveTaskImpl
	 * @see lciat.impl.LciatPackageImpl#getInteractiveTask()
	 * @generated
	 */
	int INTERACTIVE_TASK = 64;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVE_TASK__NAME = CTT_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Ctt Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVE_TASK__CTT_LINKS = CTT_TASK__CTT_LINKS;

	/**
	 * The number of structural features of the '<em>Interactive Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIVE_TASK_FEATURE_COUNT = CTT_TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lciat.impl.CTTCollaborativeTaskImpl <em>CTT Collaborative Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.CTTCollaborativeTaskImpl
	 * @see lciat.impl.LciatPackageImpl#getCTTCollaborativeTask()
	 * @generated
	 */
	int CTT_COLLABORATIVE_TASK = 65;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_COLLABORATIVE_TASK__NAME = CTT_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Ctt Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_COLLABORATIVE_TASK__CTT_LINKS = CTT_TASK__CTT_LINKS;

	/**
	 * The number of structural features of the '<em>CTT Collaborative Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_COLLABORATIVE_TASK_FEATURE_COUNT = CTT_TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lciat.impl.ApplicationTaskImpl <em>Application Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.ApplicationTaskImpl
	 * @see lciat.impl.LciatPackageImpl#getApplicationTask()
	 * @generated
	 */
	int APPLICATION_TASK = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TASK__NAME = CTT_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Ctt Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TASK__CTT_LINKS = CTT_TASK__CTT_LINKS;

	/**
	 * The number of structural features of the '<em>Application Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TASK_FEATURE_COUNT = CTT_TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lciat.impl.CTTLinkImpl <em>CTT Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.CTTLinkImpl
	 * @see lciat.impl.LciatPackageImpl#getCTTLink()
	 * @generated
	 */
	int CTT_LINK = 67;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_LINK__SOURCE = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_LINK__TARGET = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CTT Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTT_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lciat.impl.AggregationImpl <em>Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.AggregationImpl
	 * @see lciat.impl.LciatPackageImpl#getAggregation()
	 * @generated
	 */
	int AGGREGATION = 68;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__SOURCE = CTT_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__TARGET = CTT_LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FEATURE_COUNT = CTT_LINK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lciat.impl.EnablingImpl <em>Enabling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.EnablingImpl
	 * @see lciat.impl.LciatPackageImpl#getEnabling()
	 * @generated
	 */
	int ENABLING = 69;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING__SOURCE = CTT_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING__TARGET = CTT_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>ELabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING__ELABEL = CTT_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enabling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING_FEATURE_COUNT = CTT_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.DisablingImpl <em>Disabling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.DisablingImpl
	 * @see lciat.impl.LciatPackageImpl#getDisabling()
	 * @generated
	 */
	int DISABLING = 70;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLING__SOURCE = CTT_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLING__TARGET = CTT_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>DLabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLING__DLABEL = CTT_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Disabling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLING_FEATURE_COUNT = CTT_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.EnablingWithInformationPassingImpl <em>Enabling With Information Passing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.EnablingWithInformationPassingImpl
	 * @see lciat.impl.LciatPackageImpl#getEnablingWithInformationPassing()
	 * @generated
	 */
	int ENABLING_WITH_INFORMATION_PASSING = 71;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING_WITH_INFORMATION_PASSING__SOURCE = CTT_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING_WITH_INFORMATION_PASSING__TARGET = CTT_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Ew Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING_WITH_INFORMATION_PASSING__EW_LABEL = CTT_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enabling With Information Passing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING_WITH_INFORMATION_PASSING_FEATURE_COUNT = CTT_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.DisablingWithInformationPassingImpl <em>Disabling With Information Passing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.DisablingWithInformationPassingImpl
	 * @see lciat.impl.LciatPackageImpl#getDisablingWithInformationPassing()
	 * @generated
	 */
	int DISABLING_WITH_INFORMATION_PASSING = 72;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLING_WITH_INFORMATION_PASSING__SOURCE = CTT_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLING_WITH_INFORMATION_PASSING__TARGET = CTT_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Dw Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLING_WITH_INFORMATION_PASSING__DW_LABEL = CTT_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Disabling With Information Passing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLING_WITH_INFORMATION_PASSING_FEATURE_COUNT = CTT_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.IndependentConcurrencyImpl <em>Independent Concurrency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.IndependentConcurrencyImpl
	 * @see lciat.impl.LciatPackageImpl#getIndependentConcurrency()
	 * @generated
	 */
	int INDEPENDENT_CONCURRENCY = 73;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEPENDENT_CONCURRENCY__SOURCE = CTT_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEPENDENT_CONCURRENCY__TARGET = CTT_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Ic Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEPENDENT_CONCURRENCY__IC_LABEL = CTT_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Independent Concurrency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEPENDENT_CONCURRENCY_FEATURE_COUNT = CTT_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.OrderIndependenceImpl <em>Order Independence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.OrderIndependenceImpl
	 * @see lciat.impl.LciatPackageImpl#getOrderIndependence()
	 * @generated
	 */
	int ORDER_INDEPENDENCE = 74;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_INDEPENDENCE__SOURCE = CTT_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_INDEPENDENCE__TARGET = CTT_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Oi Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_INDEPENDENCE__OI_LABEL = CTT_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Order Independence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_INDEPENDENCE_FEATURE_COUNT = CTT_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.SuspendResumeImpl <em>Suspend Resume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.SuspendResumeImpl
	 * @see lciat.impl.LciatPackageImpl#getSuspendResume()
	 * @generated
	 */
	int SUSPEND_RESUME = 75;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_RESUME__SOURCE = CTT_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_RESUME__TARGET = CTT_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Sr Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_RESUME__SR_LABEL = CTT_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Suspend Resume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_RESUME_FEATURE_COUNT = CTT_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.ConcurrencyWithInformationPassingImpl <em>Concurrency With Information Passing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.ConcurrencyWithInformationPassingImpl
	 * @see lciat.impl.LciatPackageImpl#getConcurrencyWithInformationPassing()
	 * @generated
	 */
	int CONCURRENCY_WITH_INFORMATION_PASSING = 76;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_WITH_INFORMATION_PASSING__SOURCE = CTT_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_WITH_INFORMATION_PASSING__TARGET = CTT_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>CLabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_WITH_INFORMATION_PASSING__CLABEL = CTT_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concurrency With Information Passing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_WITH_INFORMATION_PASSING_FEATURE_COUNT = CTT_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.DeterministicChoiceImpl <em>Deterministic Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.DeterministicChoiceImpl
	 * @see lciat.impl.LciatPackageImpl#getDeterministicChoice()
	 * @generated
	 */
	int DETERMINISTIC_CHOICE = 77;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_CHOICE__SOURCE = CTT_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_CHOICE__TARGET = CTT_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Dt Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_CHOICE__DT_LABEL = CTT_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deterministic Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_CHOICE_FEATURE_COUNT = CTT_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.UndeterministicChoiceImpl <em>Undeterministic Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.UndeterministicChoiceImpl
	 * @see lciat.impl.LciatPackageImpl#getUndeterministicChoice()
	 * @generated
	 */
	int UNDETERMINISTIC_CHOICE = 78;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDETERMINISTIC_CHOICE__SOURCE = CTT_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDETERMINISTIC_CHOICE__TARGET = CTT_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Uc Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDETERMINISTIC_CHOICE__UC_LABEL = CTT_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Undeterministic Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDETERMINISTIC_CHOICE_FEATURE_COUNT = CTT_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefNodeImpl <em>Molef Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefNodeImpl
	 * @see lciat.impl.LciatPackageImpl#getMolefNode()
	 * @generated
	 */
	int MOLEF_NODE = 79;

	/**
	 * The number of structural features of the '<em>Molef Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_NODE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefContentNodeImpl <em>Molef Content Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefContentNodeImpl
	 * @see lciat.impl.LciatPackageImpl#getMolefContentNode()
	 * @generated
	 */
	int MOLEF_CONTENT_NODE = 80;

	/**
	 * The number of structural features of the '<em>Molef Content Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_CONTENT_NODE_FEATURE_COUNT = MOLEF_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefLearningNodeImpl <em>Molef Learning Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefLearningNodeImpl
	 * @see lciat.impl.LciatPackageImpl#getMolefLearningNode()
	 * @generated
	 */
	int MOLEF_LEARNING_NODE = 81;

	/**
	 * The number of structural features of the '<em>Molef Learning Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_LEARNING_NODE_FEATURE_COUNT = MOLEF_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefCttNodeImpl <em>Molef Ctt Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefCttNodeImpl
	 * @see lciat.impl.LciatPackageImpl#getMolefCttNode()
	 * @generated
	 */
	int MOLEF_CTT_NODE = 82;

	/**
	 * The number of structural features of the '<em>Molef Ctt Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_CTT_NODE_FEATURE_COUNT = MOLEF_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefContent1Impl <em>Molef Content1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefContent1Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefContent1()
	 * @generated
	 */
	int MOLEF_CONTENT1 = 83;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_CONTENT1__CHARACTERISTIC = MOLEF_CONTENT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef Content1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_CONTENT1_FEATURE_COUNT = MOLEF_CONTENT_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefContent2Impl <em>Molef Content2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefContent2Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefContent2()
	 * @generated
	 */
	int MOLEF_CONTENT2 = 84;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_CONTENT2__CHARACTERISTIC = MOLEF_CONTENT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef Content2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_CONTENT2_FEATURE_COUNT = MOLEF_CONTENT_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefContent3Impl <em>Molef Content3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefContent3Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefContent3()
	 * @generated
	 */
	int MOLEF_CONTENT3 = 85;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_CONTENT3__CHARACTERISTIC = MOLEF_CONTENT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef Content3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_CONTENT3_FEATURE_COUNT = MOLEF_CONTENT_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefContent4Impl <em>Molef Content4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefContent4Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefContent4()
	 * @generated
	 */
	int MOLEF_CONTENT4 = 86;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_CONTENT4__CHARACTERISTIC = MOLEF_CONTENT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef Content4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_CONTENT4_FEATURE_COUNT = MOLEF_CONTENT_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefContent5Impl <em>Molef Content5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefContent5Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefContent5()
	 * @generated
	 */
	int MOLEF_CONTENT5 = 87;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_CONTENT5__CHARACTERISTIC = MOLEF_CONTENT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef Content5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_CONTENT5_FEATURE_COUNT = MOLEF_CONTENT_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefContent6Impl <em>Molef Content6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefContent6Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefContent6()
	 * @generated
	 */
	int MOLEF_CONTENT6 = 88;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_CONTENT6__CHARACTERISTIC = MOLEF_CONTENT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef Content6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_CONTENT6_FEATURE_COUNT = MOLEF_CONTENT_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefTaskAndActivitiesNodeImpl <em>Molef Task And Activities Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefTaskAndActivitiesNodeImpl
	 * @see lciat.impl.LciatPackageImpl#getMolefTaskAndActivitiesNode()
	 * @generated
	 */
	int MOLEF_TASK_AND_ACTIVITIES_NODE = 89;

	/**
	 * The number of structural features of the '<em>Molef Task And Activities Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_TASK_AND_ACTIVITIES_NODE_FEATURE_COUNT = MOLEF_LEARNING_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefTActivities1Impl <em>Molef TActivities1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefTActivities1Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefTActivities1()
	 * @generated
	 */
	int MOLEF_TACTIVITIES1 = 90;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_TACTIVITIES1__CHARACTERISTIC = MOLEF_TASK_AND_ACTIVITIES_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef TActivities1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_TACTIVITIES1_FEATURE_COUNT = MOLEF_TASK_AND_ACTIVITIES_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefTActivities2Impl <em>Molef TActivities2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefTActivities2Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefTActivities2()
	 * @generated
	 */
	int MOLEF_TACTIVITIES2 = 91;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_TACTIVITIES2__CHARACTERISTIC = MOLEF_TASK_AND_ACTIVITIES_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef TActivities2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_TACTIVITIES2_FEATURE_COUNT = MOLEF_TASK_AND_ACTIVITIES_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefTActivities3Impl <em>Molef TActivities3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefTActivities3Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefTActivities3()
	 * @generated
	 */
	int MOLEF_TACTIVITIES3 = 92;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_TACTIVITIES3__CHARACTERISTIC = MOLEF_TASK_AND_ACTIVITIES_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef TActivities3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_TACTIVITIES3_FEATURE_COUNT = MOLEF_TASK_AND_ACTIVITIES_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefTActivities4Impl <em>Molef TActivities4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefTActivities4Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefTActivities4()
	 * @generated
	 */
	int MOLEF_TACTIVITIES4 = 93;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_TACTIVITIES4__CHARACTERISTIC = MOLEF_TASK_AND_ACTIVITIES_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef TActivities4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_TACTIVITIES4_FEATURE_COUNT = MOLEF_TASK_AND_ACTIVITIES_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefTActivities5Impl <em>Molef TActivities5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefTActivities5Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefTActivities5()
	 * @generated
	 */
	int MOLEF_TACTIVITIES5 = 94;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_TACTIVITIES5__CHARACTERISTIC = MOLEF_TASK_AND_ACTIVITIES_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef TActivities5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_TACTIVITIES5_FEATURE_COUNT = MOLEF_TASK_AND_ACTIVITIES_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefTActivities6Impl <em>Molef TActivities6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefTActivities6Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefTActivities6()
	 * @generated
	 */
	int MOLEF_TACTIVITIES6 = 95;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_TACTIVITIES6__CHARACTERISTIC = MOLEF_TASK_AND_ACTIVITIES_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef TActivities6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_TACTIVITIES6_FEATURE_COUNT = MOLEF_TASK_AND_ACTIVITIES_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefTActivities7Impl <em>Molef TActivities7</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefTActivities7Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefTActivities7()
	 * @generated
	 */
	int MOLEF_TACTIVITIES7 = 96;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_TACTIVITIES7__CHARACTERISTIC = MOLEF_TASK_AND_ACTIVITIES_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef TActivities7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_TACTIVITIES7_FEATURE_COUNT = MOLEF_TASK_AND_ACTIVITIES_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefTActivities8Impl <em>Molef TActivities8</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefTActivities8Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefTActivities8()
	 * @generated
	 */
	int MOLEF_TACTIVITIES8 = 97;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_TACTIVITIES8__CHARACTERISTIC = MOLEF_TASK_AND_ACTIVITIES_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef TActivities8</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_TACTIVITIES8_FEATURE_COUNT = MOLEF_TASK_AND_ACTIVITIES_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefSocialNodeImpl <em>Molef Social Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefSocialNodeImpl
	 * @see lciat.impl.LciatPackageImpl#getMolefSocialNode()
	 * @generated
	 */
	int MOLEF_SOCIAL_NODE = 98;

	/**
	 * The number of structural features of the '<em>Molef Social Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_SOCIAL_NODE_FEATURE_COUNT = MOLEF_LEARNING_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefSocial1Impl <em>Molef Social1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefSocial1Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefSocial1()
	 * @generated
	 */
	int MOLEF_SOCIAL1 = 99;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_SOCIAL1__CHARACTERISTIC = MOLEF_SOCIAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef Social1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_SOCIAL1_FEATURE_COUNT = MOLEF_SOCIAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefSocial2Impl <em>Molef Social2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefSocial2Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefSocial2()
	 * @generated
	 */
	int MOLEF_SOCIAL2 = 100;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_SOCIAL2__CHARACTERISTIC = MOLEF_SOCIAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef Social2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_SOCIAL2_FEATURE_COUNT = MOLEF_SOCIAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefSocial3Impl <em>Molef Social3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefSocial3Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefSocial3()
	 * @generated
	 */
	int MOLEF_SOCIAL3 = 101;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_SOCIAL3__CHARACTERISTIC = MOLEF_SOCIAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef Social3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_SOCIAL3_FEATURE_COUNT = MOLEF_SOCIAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefSocial4Impl <em>Molef Social4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefSocial4Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefSocial4()
	 * @generated
	 */
	int MOLEF_SOCIAL4 = 102;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_SOCIAL4__CHARACTERISTIC = MOLEF_SOCIAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef Social4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_SOCIAL4_FEATURE_COUNT = MOLEF_SOCIAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefPersonalizationNodeImpl <em>Molef Personalization Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefPersonalizationNodeImpl
	 * @see lciat.impl.LciatPackageImpl#getMolefPersonalizationNode()
	 * @generated
	 */
	int MOLEF_PERSONALIZATION_NODE = 103;

	/**
	 * The number of structural features of the '<em>Molef Personalization Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_PERSONALIZATION_NODE_FEATURE_COUNT = MOLEF_LEARNING_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefPersonalization1Impl <em>Molef Personalization1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefPersonalization1Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefPersonalization1()
	 * @generated
	 */
	int MOLEF_PERSONALIZATION1 = 104;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_PERSONALIZATION1__CHARACTERISTIC = MOLEF_PERSONALIZATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef Personalization1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_PERSONALIZATION1_FEATURE_COUNT = MOLEF_PERSONALIZATION_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefPersonalization2Impl <em>Molef Personalization2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefPersonalization2Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefPersonalization2()
	 * @generated
	 */
	int MOLEF_PERSONALIZATION2 = 105;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_PERSONALIZATION2__CHARACTERISTIC = MOLEF_PERSONALIZATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef Personalization2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_PERSONALIZATION2_FEATURE_COUNT = MOLEF_PERSONALIZATION_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefPersonalization3Impl <em>Molef Personalization3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefPersonalization3Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefPersonalization3()
	 * @generated
	 */
	int MOLEF_PERSONALIZATION3 = 106;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_PERSONALIZATION3__CHARACTERISTIC = MOLEF_PERSONALIZATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef Personalization3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_PERSONALIZATION3_FEATURE_COUNT = MOLEF_PERSONALIZATION_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefPersonalization4Impl <em>Molef Personalization4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefPersonalization4Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefPersonalization4()
	 * @generated
	 */
	int MOLEF_PERSONALIZATION4 = 107;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_PERSONALIZATION4__CHARACTERISTIC = MOLEF_PERSONALIZATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef Personalization4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_PERSONALIZATION4_FEATURE_COUNT = MOLEF_PERSONALIZATION_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefPersonalization5Impl <em>Molef Personalization5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefPersonalization5Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefPersonalization5()
	 * @generated
	 */
	int MOLEF_PERSONALIZATION5 = 108;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_PERSONALIZATION5__CHARACTERISTIC = MOLEF_PERSONALIZATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef Personalization5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_PERSONALIZATION5_FEATURE_COUNT = MOLEF_PERSONALIZATION_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefMultimediaNodeImpl <em>Molef Multimedia Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefMultimediaNodeImpl
	 * @see lciat.impl.LciatPackageImpl#getMolefMultimediaNode()
	 * @generated
	 */
	int MOLEF_MULTIMEDIA_NODE = 109;

	/**
	 * The number of structural features of the '<em>Molef Multimedia Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_MULTIMEDIA_NODE_FEATURE_COUNT = MOLEF_CTT_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefMultimedia1Impl <em>Molef Multimedia1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefMultimedia1Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefMultimedia1()
	 * @generated
	 */
	int MOLEF_MULTIMEDIA1 = 110;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_MULTIMEDIA1__CHARACTERISTIC = MOLEF_MULTIMEDIA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef Multimedia1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_MULTIMEDIA1_FEATURE_COUNT = MOLEF_MULTIMEDIA_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefMultimedia2Impl <em>Molef Multimedia2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefMultimedia2Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefMultimedia2()
	 * @generated
	 */
	int MOLEF_MULTIMEDIA2 = 111;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_MULTIMEDIA2__CHARACTERISTIC = MOLEF_MULTIMEDIA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef Multimedia2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_MULTIMEDIA2_FEATURE_COUNT = MOLEF_MULTIMEDIA_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefMultimedia3Impl <em>Molef Multimedia3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefMultimedia3Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefMultimedia3()
	 * @generated
	 */
	int MOLEF_MULTIMEDIA3 = 112;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_MULTIMEDIA3__CHARACTERISTIC = MOLEF_MULTIMEDIA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef Multimedia3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_MULTIMEDIA3_FEATURE_COUNT = MOLEF_MULTIMEDIA_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefMultimedia4Impl <em>Molef Multimedia4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefMultimedia4Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefMultimedia4()
	 * @generated
	 */
	int MOLEF_MULTIMEDIA4 = 113;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_MULTIMEDIA4__CHARACTERISTIC = MOLEF_MULTIMEDIA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef Multimedia4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_MULTIMEDIA4_FEATURE_COUNT = MOLEF_MULTIMEDIA_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefMultimedia5Impl <em>Molef Multimedia5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefMultimedia5Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefMultimedia5()
	 * @generated
	 */
	int MOLEF_MULTIMEDIA5 = 114;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_MULTIMEDIA5__CHARACTERISTIC = MOLEF_MULTIMEDIA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef Multimedia5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_MULTIMEDIA5_FEATURE_COUNT = MOLEF_MULTIMEDIA_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefMultimedia6Impl <em>Molef Multimedia6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefMultimedia6Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefMultimedia6()
	 * @generated
	 */
	int MOLEF_MULTIMEDIA6 = 115;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_MULTIMEDIA6__CHARACTERISTIC = MOLEF_MULTIMEDIA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef Multimedia6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_MULTIMEDIA6_FEATURE_COUNT = MOLEF_MULTIMEDIA_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.impl.MolefMultimedia7Impl <em>Molef Multimedia7</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.impl.MolefMultimedia7Impl
	 * @see lciat.impl.LciatPackageImpl#getMolefMultimedia7()
	 * @generated
	 */
	int MOLEF_MULTIMEDIA7 = 116;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_MULTIMEDIA7__CHARACTERISTIC = MOLEF_MULTIMEDIA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Molef Multimedia7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLEF_MULTIMEDIA7_FEATURE_COUNT = MOLEF_MULTIMEDIA_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lciat.Subtypes <em>Subtypes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.Subtypes
	 * @see lciat.impl.LciatPackageImpl#getSubtypes()
	 * @generated
	 */
	int SUBTYPES = 117;

	/**
	 * The meta object id for the '{@link lciat.Modalities <em>Modalities</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.Modalities
	 * @see lciat.impl.LciatPackageImpl#getModalities()
	 * @generated
	 */
	int MODALITIES = 118;

	/**
	 * The meta object id for the '{@link lciat.Position <em>Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.Position
	 * @see lciat.impl.LciatPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 119;

	/**
	 * The meta object id for the '{@link lciat.Language <em>Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.Language
	 * @see lciat.impl.LciatPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 120;

	/**
	 * The meta object id for the '{@link lciat.Size <em>Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lciat.Size
	 * @see lciat.impl.LciatPackageImpl#getSize()
	 * @generated
	 */
	int SIZE = 121;


	/**
	 * Returns the meta object for class '{@link lciat.LCIANDiagram <em>LCIAN Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LCIAN Diagram</em>'.
	 * @see lciat.LCIANDiagram
	 * @generated
	 */
	EClass getLCIANDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link lciat.LCIANDiagram#getItsSociograms <em>Its Sociograms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Sociograms</em>'.
	 * @see lciat.LCIANDiagram#getItsSociograms()
	 * @see #getLCIANDiagram()
	 * @generated
	 */
	EReference getLCIANDiagram_ItsSociograms();

	/**
	 * Returns the meta object for the containment reference list '{@link lciat.LCIANDiagram#getItsLearningDiagrams <em>Its Learning Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Learning Diagrams</em>'.
	 * @see lciat.LCIANDiagram#getItsLearningDiagrams()
	 * @see #getLCIANDiagram()
	 * @generated
	 */
	EReference getLCIANDiagram_ItsLearningDiagrams();

	/**
	 * Returns the meta object for the containment reference list '{@link lciat.LCIANDiagram#getItsCttDiagrams <em>Its Ctt Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Ctt Diagrams</em>'.
	 * @see lciat.LCIANDiagram#getItsCttDiagrams()
	 * @see #getLCIANDiagram()
	 * @generated
	 */
	EReference getLCIANDiagram_ItsCttDiagrams();

	/**
	 * Returns the meta object for the containment reference list '{@link lciat.LCIANDiagram#getItsLinks <em>Its Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Links</em>'.
	 * @see lciat.LCIANDiagram#getItsLinks()
	 * @see #getLCIANDiagram()
	 * @generated
	 */
	EReference getLCIANDiagram_ItsLinks();

	/**
	 * Returns the meta object for class '{@link lciat.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see lciat.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for class '{@link lciat.Sociogram <em>Sociogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sociogram</em>'.
	 * @see lciat.Sociogram
	 * @generated
	 */
	EClass getSociogram();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Sociogram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.Sociogram#getName()
	 * @see #getSociogram()
	 * @generated
	 */
	EAttribute getSociogram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link lciat.Sociogram#getItsSociogramNodes <em>Its Sociogram Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Sociogram Nodes</em>'.
	 * @see lciat.Sociogram#getItsSociogramNodes()
	 * @see #getSociogram()
	 * @generated
	 */
	EReference getSociogram_ItsSociogramNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link lciat.Sociogram#getMfContentNodes <em>Mf Content Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mf Content Nodes</em>'.
	 * @see lciat.Sociogram#getMfContentNodes()
	 * @see #getSociogram()
	 * @generated
	 */
	EReference getSociogram_MfContentNodes();

	/**
	 * Returns the meta object for class '{@link lciat.SociogramNode <em>Sociogram Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sociogram Node</em>'.
	 * @see lciat.SociogramNode
	 * @generated
	 */
	EClass getSociogramNode();

	/**
	 * Returns the meta object for the attribute '{@link lciat.SociogramNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.SociogramNode#getName()
	 * @see #getSociogramNode()
	 * @generated
	 */
	EAttribute getSociogramNode_Name();

	/**
	 * Returns the meta object for class '{@link lciat.Rol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rol</em>'.
	 * @see lciat.Rol
	 * @generated
	 */
	EClass getRol();

	/**
	 * Returns the meta object for the reference list '{@link lciat.Rol#getItsGroup <em>Its Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Its Group</em>'.
	 * @see lciat.Rol#getItsGroup()
	 * @see #getRol()
	 * @generated
	 */
	EReference getRol_ItsGroup();

	/**
	 * Returns the meta object for the reference list '{@link lciat.Rol#getSupertype <em>Supertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supertype</em>'.
	 * @see lciat.Rol#getSupertype()
	 * @see #getRol()
	 * @generated
	 */
	EReference getRol_Supertype();

	/**
	 * Returns the meta object for the reference list '{@link lciat.Rol#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subtype</em>'.
	 * @see lciat.Rol#getSubtype()
	 * @see #getRol()
	 * @generated
	 */
	EReference getRol_Subtype();

	/**
	 * Returns the meta object for class '{@link lciat.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see lciat.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the reference list '{@link lciat.Group#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains</em>'.
	 * @see lciat.Group#getContains()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Contains();

	/**
	 * Returns the meta object for class '{@link lciat.SociogramLink <em>Sociogram Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sociogram Link</em>'.
	 * @see lciat.SociogramLink
	 * @generated
	 */
	EClass getSociogramLink();

	/**
	 * Returns the meta object for the reference '{@link lciat.SociogramLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see lciat.SociogramLink#getSource()
	 * @see #getSociogramLink()
	 * @generated
	 */
	EReference getSociogramLink_Source();

	/**
	 * Returns the meta object for the reference '{@link lciat.SociogramLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see lciat.SociogramLink#getTarget()
	 * @see #getSociogramLink()
	 * @generated
	 */
	EReference getSociogramLink_Target();

	/**
	 * Returns the meta object for class '{@link lciat.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance</em>'.
	 * @see lciat.Inheritance
	 * @generated
	 */
	EClass getInheritance();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Inheritance#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see lciat.Inheritance#getCondition()
	 * @see #getInheritance()
	 * @generated
	 */
	EAttribute getInheritance_Condition();

	/**
	 * Returns the meta object for class '{@link lciat.Acting <em>Acting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acting</em>'.
	 * @see lciat.Acting
	 * @generated
	 */
	EClass getActing();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Acting#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.Acting#getName()
	 * @see #getActing()
	 * @generated
	 */
	EAttribute getActing_Name();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Acting#getN <em>N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>N</em>'.
	 * @see lciat.Acting#getN()
	 * @see #getActing()
	 * @generated
	 */
	EAttribute getActing_N();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Acting#getM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M</em>'.
	 * @see lciat.Acting#getM()
	 * @see #getActing()
	 * @generated
	 */
	EAttribute getActing_M();

	/**
	 * Returns the meta object for class '{@link lciat.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see lciat.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Association#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.Association#getName()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Name();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Association#getN <em>N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>N</em>'.
	 * @see lciat.Association#getN()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_N();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Association#getM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M</em>'.
	 * @see lciat.Association#getM()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_M();

	/**
	 * Returns the meta object for class '{@link lciat.LearningDiagram <em>Learning Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Learning Diagram</em>'.
	 * @see lciat.LearningDiagram
	 * @generated
	 */
	EClass getLearningDiagram();

	/**
	 * Returns the meta object for the attribute '{@link lciat.LearningDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.LearningDiagram#getName()
	 * @see #getLearningDiagram()
	 * @generated
	 */
	EAttribute getLearningDiagram_Name();

	/**
	 * Returns the meta object for the reference list '{@link lciat.LearningDiagram#getMolefLearningNodes <em>Molef Learning Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Molef Learning Nodes</em>'.
	 * @see lciat.LearningDiagram#getMolefLearningNodes()
	 * @see #getLearningDiagram()
	 * @generated
	 */
	EReference getLearningDiagram_MolefLearningNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link lciat.LearningDiagram#getLearningNodes <em>Learning Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Learning Nodes</em>'.
	 * @see lciat.LearningDiagram#getLearningNodes()
	 * @see #getLearningDiagram()
	 * @generated
	 */
	EReference getLearningDiagram_LearningNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link lciat.LearningDiagram#getMfLearningNodes <em>Mf Learning Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mf Learning Nodes</em>'.
	 * @see lciat.LearningDiagram#getMfLearningNodes()
	 * @see #getLearningDiagram()
	 * @generated
	 */
	EReference getLearningDiagram_MfLearningNodes();

	/**
	 * Returns the meta object for class '{@link lciat.LearningNode <em>Learning Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Learning Node</em>'.
	 * @see lciat.LearningNode
	 * @generated
	 */
	EClass getLearningNode();

	/**
	 * Returns the meta object for class '{@link lciat.Init <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init</em>'.
	 * @see lciat.Init
	 * @generated
	 */
	EClass getInit();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Init#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.Init#getName()
	 * @see #getInit()
	 * @generated
	 */
	EAttribute getInit_Name();

	/**
	 * Returns the meta object for class '{@link lciat.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see lciat.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for the attribute '{@link lciat.End#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.End#getName()
	 * @see #getEnd()
	 * @generated
	 */
	EAttribute getEnd_Name();

	/**
	 * Returns the meta object for class '{@link lciat.LearningActivity <em>Learning Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Learning Activity</em>'.
	 * @see lciat.LearningActivity
	 * @generated
	 */
	EClass getLearningActivity();

	/**
	 * Returns the meta object for the attribute '{@link lciat.LearningActivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.LearningActivity#getName()
	 * @see #getLearningActivity()
	 * @generated
	 */
	EAttribute getLearningActivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link lciat.LearningActivity#getItsModality <em>Its Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Its Modality</em>'.
	 * @see lciat.LearningActivity#getItsModality()
	 * @see #getLearningActivity()
	 * @generated
	 */
	EAttribute getLearningActivity_ItsModality();

	/**
	 * Returns the meta object for the attribute '{@link lciat.LearningActivity#getItsSubtype <em>Its Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Its Subtype</em>'.
	 * @see lciat.LearningActivity#getItsSubtype()
	 * @see #getLearningActivity()
	 * @generated
	 */
	EAttribute getLearningActivity_ItsSubtype();

	/**
	 * Returns the meta object for the containment reference list '{@link lciat.LearningActivity#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tools</em>'.
	 * @see lciat.LearningActivity#getTools()
	 * @see #getLearningActivity()
	 * @generated
	 */
	EReference getLearningActivity_Tools();

	/**
	 * Returns the meta object for class '{@link lciat.LeftSideLearningNode <em>Left Side Learning Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Side Learning Node</em>'.
	 * @see lciat.LeftSideLearningNode
	 * @generated
	 */
	EClass getLeftSideLearningNode();

	/**
	 * Returns the meta object for class '{@link lciat.IndividualTask <em>Individual Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Task</em>'.
	 * @see lciat.IndividualTask
	 * @generated
	 */
	EClass getIndividualTask();

	/**
	 * Returns the meta object for the containment reference '{@link lciat.IndividualTask#getTaskRoles <em>Task Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task Roles</em>'.
	 * @see lciat.IndividualTask#getTaskRoles()
	 * @see #getIndividualTask()
	 * @generated
	 */
	EReference getIndividualTask_TaskRoles();

	/**
	 * Returns the meta object for the containment reference list '{@link lciat.IndividualTask#getTaskObjects <em>Task Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Objects</em>'.
	 * @see lciat.IndividualTask#getTaskObjects()
	 * @see #getIndividualTask()
	 * @generated
	 */
	EReference getIndividualTask_TaskObjects();

	/**
	 * Returns the meta object for the containment reference '{@link lciat.IndividualTask#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtype</em>'.
	 * @see lciat.IndividualTask#getSubtype()
	 * @see #getIndividualTask()
	 * @generated
	 */
	EReference getIndividualTask_Subtype();

	/**
	 * Returns the meta object for the containment reference '{@link lciat.IndividualTask#getModality <em>Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modality</em>'.
	 * @see lciat.IndividualTask#getModality()
	 * @see #getIndividualTask()
	 * @generated
	 */
	EReference getIndividualTask_Modality();

	/**
	 * Returns the meta object for class '{@link lciat.GroupTask <em>Group Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Task</em>'.
	 * @see lciat.GroupTask
	 * @generated
	 */
	EClass getGroupTask();

	/**
	 * Returns the meta object for the containment reference list '{@link lciat.GroupTask#getTaskRoles <em>Task Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Roles</em>'.
	 * @see lciat.GroupTask#getTaskRoles()
	 * @see #getGroupTask()
	 * @generated
	 */
	EReference getGroupTask_TaskRoles();

	/**
	 * Returns the meta object for the containment reference list '{@link lciat.GroupTask#getTaskObjects <em>Task Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Objects</em>'.
	 * @see lciat.GroupTask#getTaskObjects()
	 * @see #getGroupTask()
	 * @generated
	 */
	EReference getGroupTask_TaskObjects();

	/**
	 * Returns the meta object for the containment reference '{@link lciat.GroupTask#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtype</em>'.
	 * @see lciat.GroupTask#getSubtype()
	 * @see #getGroupTask()
	 * @generated
	 */
	EReference getGroupTask_Subtype();

	/**
	 * Returns the meta object for the containment reference '{@link lciat.GroupTask#getModality <em>Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modality</em>'.
	 * @see lciat.GroupTask#getModality()
	 * @see #getGroupTask()
	 * @generated
	 */
	EReference getGroupTask_Modality();

	/**
	 * Returns the meta object for the reference '{@link lciat.GroupTask#getEGL_Tool <em>EGL Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EGL Tool</em>'.
	 * @see lciat.GroupTask#getEGL_Tool()
	 * @see #getGroupTask()
	 * @generated
	 */
	EReference getGroupTask_EGL_Tool();

	/**
	 * Returns the meta object for the attribute '{@link lciat.GroupTask#isEGL_Transformation <em>EGL Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EGL Transformation</em>'.
	 * @see lciat.GroupTask#isEGL_Transformation()
	 * @see #getGroupTask()
	 * @generated
	 */
	EAttribute getGroupTask_EGL_Transformation();

	/**
	 * Returns the meta object for class '{@link lciat.AbstractTask <em>Abstract Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Task</em>'.
	 * @see lciat.AbstractTask
	 * @generated
	 */
	EClass getAbstractTask();

	/**
	 * Returns the meta object for the containment reference list '{@link lciat.AbstractTask#getTaskRoles <em>Task Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Roles</em>'.
	 * @see lciat.AbstractTask#getTaskRoles()
	 * @see #getAbstractTask()
	 * @generated
	 */
	EReference getAbstractTask_TaskRoles();

	/**
	 * Returns the meta object for the containment reference list '{@link lciat.AbstractTask#getTaskObjects <em>Task Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Objects</em>'.
	 * @see lciat.AbstractTask#getTaskObjects()
	 * @see #getAbstractTask()
	 * @generated
	 */
	EReference getAbstractTask_TaskObjects();

	/**
	 * Returns the meta object for the containment reference '{@link lciat.AbstractTask#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtype</em>'.
	 * @see lciat.AbstractTask#getSubtype()
	 * @see #getAbstractTask()
	 * @generated
	 */
	EReference getAbstractTask_Subtype();

	/**
	 * Returns the meta object for the containment reference '{@link lciat.AbstractTask#getModality <em>Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modality</em>'.
	 * @see lciat.AbstractTask#getModality()
	 * @see #getAbstractTask()
	 * @generated
	 */
	EReference getAbstractTask_Modality();

	/**
	 * Returns the meta object for class '{@link lciat.DetailedAbstractTask <em>Detailed Abstract Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detailed Abstract Task</em>'.
	 * @see lciat.DetailedAbstractTask
	 * @generated
	 */
	EClass getDetailedAbstractTask();

	/**
	 * Returns the meta object for the containment reference list '{@link lciat.DetailedAbstractTask#getLearningNodes <em>Learning Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Learning Nodes</em>'.
	 * @see lciat.DetailedAbstractTask#getLearningNodes()
	 * @see #getDetailedAbstractTask()
	 * @generated
	 */
	EReference getDetailedAbstractTask_LearningNodes();

	/**
	 * Returns the meta object for class '{@link lciat.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see lciat.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Object#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.Object#getName()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Name();

	/**
	 * Returns the meta object for the reference '{@link lciat.Object#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see lciat.Object#getObject()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Object();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Object#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modifier</em>'.
	 * @see lciat.Object#getModifier()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Modifier();

	/**
	 * Returns the meta object for the reference '{@link lciat.Object#getModifiedBy <em>Modified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modified By</em>'.
	 * @see lciat.Object#getModifiedBy()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_ModifiedBy();

	/**
	 * Returns the meta object for class '{@link lciat.TemporalCondition <em>Temporal Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Condition</em>'.
	 * @see lciat.TemporalCondition
	 * @generated
	 */
	EClass getTemporalCondition();

	/**
	 * Returns the meta object for the attribute '{@link lciat.TemporalCondition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.TemporalCondition#getName()
	 * @see #getTemporalCondition()
	 * @generated
	 */
	EAttribute getTemporalCondition_Name();

	/**
	 * Returns the meta object for class '{@link lciat.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification</em>'.
	 * @see lciat.Notification
	 * @generated
	 */
	EClass getNotification();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Notification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.Notification#getName()
	 * @see #getNotification()
	 * @generated
	 */
	EAttribute getNotification_Name();

	/**
	 * Returns the meta object for class '{@link lciat.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see lciat.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Condition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.Condition#getName()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Name();

	/**
	 * Returns the meta object for class '{@link lciat.Subtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtype</em>'.
	 * @see lciat.Subtype
	 * @generated
	 */
	EClass getSubtype();

	/**
	 * Returns the meta object for class '{@link lciat.Assimilative <em>Assimilative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assimilative</em>'.
	 * @see lciat.Assimilative
	 * @generated
	 */
	EClass getAssimilative();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Assimilative#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.Assimilative#getName()
	 * @see #getAssimilative()
	 * @generated
	 */
	EAttribute getAssimilative_Name();

	/**
	 * Returns the meta object for class '{@link lciat.InformationHandling <em>Information Handling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Handling</em>'.
	 * @see lciat.InformationHandling
	 * @generated
	 */
	EClass getInformationHandling();

	/**
	 * Returns the meta object for the attribute '{@link lciat.InformationHandling#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.InformationHandling#getName()
	 * @see #getInformationHandling()
	 * @generated
	 */
	EAttribute getInformationHandling_Name();

	/**
	 * Returns the meta object for class '{@link lciat.Adaptive <em>Adaptive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptive</em>'.
	 * @see lciat.Adaptive
	 * @generated
	 */
	EClass getAdaptive();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Adaptive#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.Adaptive#getName()
	 * @see #getAdaptive()
	 * @generated
	 */
	EAttribute getAdaptive_Name();

	/**
	 * Returns the meta object for class '{@link lciat.Communicative <em>Communicative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communicative</em>'.
	 * @see lciat.Communicative
	 * @generated
	 */
	EClass getCommunicative();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Communicative#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.Communicative#getName()
	 * @see #getCommunicative()
	 * @generated
	 */
	EAttribute getCommunicative_Name();

	/**
	 * Returns the meta object for class '{@link lciat.Productive <em>Productive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Productive</em>'.
	 * @see lciat.Productive
	 * @generated
	 */
	EClass getProductive();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Productive#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.Productive#getName()
	 * @see #getProductive()
	 * @generated
	 */
	EAttribute getProductive_Name();

	/**
	 * Returns the meta object for class '{@link lciat.Experiential <em>Experiential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiential</em>'.
	 * @see lciat.Experiential
	 * @generated
	 */
	EClass getExperiential();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Experiential#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.Experiential#getName()
	 * @see #getExperiential()
	 * @generated
	 */
	EAttribute getExperiential_Name();

	/**
	 * Returns the meta object for class '{@link lciat.Evaluative <em>Evaluative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluative</em>'.
	 * @see lciat.Evaluative
	 * @generated
	 */
	EClass getEvaluative();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Evaluative#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.Evaluative#getName()
	 * @see #getEvaluative()
	 * @generated
	 */
	EAttribute getEvaluative_Name();

	/**
	 * Returns the meta object for class '{@link lciat.Support <em>Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Support</em>'.
	 * @see lciat.Support
	 * @generated
	 */
	EClass getSupport();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Support#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.Support#getName()
	 * @see #getSupport()
	 * @generated
	 */
	EAttribute getSupport_Name();

	/**
	 * Returns the meta object for class '{@link lciat.Modality <em>Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modality</em>'.
	 * @see lciat.Modality
	 * @generated
	 */
	EClass getModality();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Modality#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.Modality#getName()
	 * @see #getModality()
	 * @generated
	 */
	EAttribute getModality_Name();

	/**
	 * Returns the meta object for class '{@link lciat.FaceToFace <em>Face To Face</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Face To Face</em>'.
	 * @see lciat.FaceToFace
	 * @generated
	 */
	EClass getFaceToFace();

	/**
	 * Returns the meta object for the attribute '{@link lciat.FaceToFace#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see lciat.FaceToFace#getKind()
	 * @see #getFaceToFace()
	 * @generated
	 */
	EAttribute getFaceToFace_Kind();

	/**
	 * Returns the meta object for class '{@link lciat.ComputerSupported <em>Computer Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computer Supported</em>'.
	 * @see lciat.ComputerSupported
	 * @generated
	 */
	EClass getComputerSupported();

	/**
	 * Returns the meta object for the attribute '{@link lciat.ComputerSupported#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see lciat.ComputerSupported#getKind()
	 * @see #getComputerSupported()
	 * @generated
	 */
	EAttribute getComputerSupported_Kind();

	/**
	 * Returns the meta object for class '{@link lciat.Online <em>Online</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Online</em>'.
	 * @see lciat.Online
	 * @generated
	 */
	EClass getOnline();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Online#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see lciat.Online#getKind()
	 * @see #getOnline()
	 * @generated
	 */
	EAttribute getOnline_Kind();

	/**
	 * Returns the meta object for class '{@link lciat.LearningLink <em>Learning Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Learning Link</em>'.
	 * @see lciat.LearningLink
	 * @generated
	 */
	EClass getLearningLink();

	/**
	 * Returns the meta object for the reference '{@link lciat.LearningLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see lciat.LearningLink#getSource()
	 * @see #getLearningLink()
	 * @generated
	 */
	EReference getLearningLink_Source();

	/**
	 * Returns the meta object for the reference '{@link lciat.LearningLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see lciat.LearningLink#getTarget()
	 * @see #getLearningLink()
	 * @generated
	 */
	EReference getLearningLink_Target();

	/**
	 * Returns the meta object for class '{@link lciat.EnablingWOInformation <em>Enabling WO Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enabling WO Information</em>'.
	 * @see lciat.EnablingWOInformation
	 * @generated
	 */
	EClass getEnablingWOInformation();

	/**
	 * Returns the meta object for the attribute '{@link lciat.EnablingWOInformation#getELabel <em>ELabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ELabel</em>'.
	 * @see lciat.EnablingWOInformation#getELabel()
	 * @see #getEnablingWOInformation()
	 * @generated
	 */
	EAttribute getEnablingWOInformation_ELabel();

	/**
	 * Returns the meta object for class '{@link lciat.EnablingWInformation <em>Enabling WInformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enabling WInformation</em>'.
	 * @see lciat.EnablingWInformation
	 * @generated
	 */
	EClass getEnablingWInformation();

	/**
	 * Returns the meta object for the attribute '{@link lciat.EnablingWInformation#getEwLabel <em>Ew Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ew Label</em>'.
	 * @see lciat.EnablingWInformation#getEwLabel()
	 * @see #getEnablingWInformation()
	 * @generated
	 */
	EAttribute getEnablingWInformation_EwLabel();

	/**
	 * Returns the meta object for class '{@link lciat.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see lciat.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Choice#getDtLabel <em>Dt Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dt Label</em>'.
	 * @see lciat.Choice#getDtLabel()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_DtLabel();

	/**
	 * Returns the meta object for class '{@link lciat.Concurrency <em>Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concurrency</em>'.
	 * @see lciat.Concurrency
	 * @generated
	 */
	EClass getConcurrency();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Concurrency#getIcLabel <em>Ic Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ic Label</em>'.
	 * @see lciat.Concurrency#getIcLabel()
	 * @see #getConcurrency()
	 * @generated
	 */
	EAttribute getConcurrency_IcLabel();

	/**
	 * Returns the meta object for class '{@link lciat.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool</em>'.
	 * @see lciat.Tool
	 * @generated
	 */
	EClass getTool();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Tool#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see lciat.Tool#getKind()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Kind();

	/**
	 * Returns the meta object for the reference '{@link lciat.Tool#getChat <em>Chat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chat</em>'.
	 * @see lciat.Tool#getChat()
	 * @see #getTool()
	 * @generated
	 */
	EReference getTool_Chat();

	/**
	 * Returns the meta object for the reference '{@link lciat.Tool#getSessionPanel <em>Session Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Session Panel</em>'.
	 * @see lciat.Tool#getSessionPanel()
	 * @see #getTool()
	 * @generated
	 */
	EReference getTool_SessionPanel();

	/**
	 * Returns the meta object for class '{@link lciat.GraphicalEditor <em>Graphical Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphical Editor</em>'.
	 * @see lciat.GraphicalEditor
	 * @generated
	 */
	EClass getGraphicalEditor();

	/**
	 * Returns the meta object for the attribute '{@link lciat.GraphicalEditor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.GraphicalEditor#getName()
	 * @see #getGraphicalEditor()
	 * @generated
	 */
	EAttribute getGraphicalEditor_Name();

	/**
	 * Returns the meta object for the reference '{@link lciat.GraphicalEditor#getTurnTakingTool <em>Turn Taking Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Turn Taking Tool</em>'.
	 * @see lciat.GraphicalEditor#getTurnTakingTool()
	 * @see #getGraphicalEditor()
	 * @generated
	 */
	EReference getGraphicalEditor_TurnTakingTool();

	/**
	 * Returns the meta object for the reference '{@link lciat.GraphicalEditor#getTelepointer <em>Telepointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Telepointer</em>'.
	 * @see lciat.GraphicalEditor#getTelepointer()
	 * @see #getGraphicalEditor()
	 * @generated
	 */
	EReference getGraphicalEditor_Telepointer();

	/**
	 * Returns the meta object for the reference '{@link lciat.GraphicalEditor#getRadarView <em>Radar View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Radar View</em>'.
	 * @see lciat.GraphicalEditor#getRadarView()
	 * @see #getGraphicalEditor()
	 * @generated
	 */
	EReference getGraphicalEditor_RadarView();

	/**
	 * Returns the meta object for the reference '{@link lciat.GraphicalEditor#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Properties</em>'.
	 * @see lciat.GraphicalEditor#getProperties()
	 * @see #getGraphicalEditor()
	 * @generated
	 */
	EReference getGraphicalEditor_Properties();

	/**
	 * Returns the meta object for the reference '{@link lciat.GraphicalEditor#getProblems <em>Problems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Problems</em>'.
	 * @see lciat.GraphicalEditor#getProblems()
	 * @see #getGraphicalEditor()
	 * @generated
	 */
	EReference getGraphicalEditor_Problems();

	/**
	 * Returns the meta object for class '{@link lciat.TextEditor <em>Text Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Editor</em>'.
	 * @see lciat.TextEditor
	 * @generated
	 */
	EClass getTextEditor();

	/**
	 * Returns the meta object for the attribute '{@link lciat.TextEditor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.TextEditor#getName()
	 * @see #getTextEditor()
	 * @generated
	 */
	EAttribute getTextEditor_Name();

	/**
	 * Returns the meta object for the reference '{@link lciat.TextEditor#getTurnTakingTool <em>Turn Taking Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Turn Taking Tool</em>'.
	 * @see lciat.TextEditor#getTurnTakingTool()
	 * @see #getTextEditor()
	 * @generated
	 */
	EReference getTextEditor_TurnTakingTool();

	/**
	 * Returns the meta object for the reference '{@link lciat.TextEditor#getRadarView <em>Radar View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Radar View</em>'.
	 * @see lciat.TextEditor#getRadarView()
	 * @see #getTextEditor()
	 * @generated
	 */
	EReference getTextEditor_RadarView();

	/**
	 * Returns the meta object for the reference '{@link lciat.TextEditor#getConsole <em>Console</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Console</em>'.
	 * @see lciat.TextEditor#getConsole()
	 * @see #getTextEditor()
	 * @generated
	 */
	EReference getTextEditor_Console();

	/**
	 * Returns the meta object for the reference '{@link lciat.TextEditor#getProblems <em>Problems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Problems</em>'.
	 * @see lciat.TextEditor#getProblems()
	 * @see #getTextEditor()
	 * @generated
	 */
	EReference getTextEditor_Problems();

	/**
	 * Returns the meta object for class '{@link lciat.CodeEditor <em>Code Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Editor</em>'.
	 * @see lciat.CodeEditor
	 * @generated
	 */
	EClass getCodeEditor();

	/**
	 * Returns the meta object for the attribute '{@link lciat.CodeEditor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.CodeEditor#getName()
	 * @see #getCodeEditor()
	 * @generated
	 */
	EAttribute getCodeEditor_Name();

	/**
	 * Returns the meta object for the reference '{@link lciat.CodeEditor#getTurnTakingTool <em>Turn Taking Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Turn Taking Tool</em>'.
	 * @see lciat.CodeEditor#getTurnTakingTool()
	 * @see #getCodeEditor()
	 * @generated
	 */
	EReference getCodeEditor_TurnTakingTool();

	/**
	 * Returns the meta object for the reference '{@link lciat.CodeEditor#getRadarView <em>Radar View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Radar View</em>'.
	 * @see lciat.CodeEditor#getRadarView()
	 * @see #getCodeEditor()
	 * @generated
	 */
	EReference getCodeEditor_RadarView();

	/**
	 * Returns the meta object for the reference '{@link lciat.CodeEditor#getConsole <em>Console</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Console</em>'.
	 * @see lciat.CodeEditor#getConsole()
	 * @see #getCodeEditor()
	 * @generated
	 */
	EReference getCodeEditor_Console();

	/**
	 * Returns the meta object for the reference '{@link lciat.CodeEditor#getProblems <em>Problems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Problems</em>'.
	 * @see lciat.CodeEditor#getProblems()
	 * @see #getCodeEditor()
	 * @generated
	 */
	EReference getCodeEditor_Problems();

	/**
	 * Returns the meta object for class '{@link lciat.WebViewer <em>Web Viewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Viewer</em>'.
	 * @see lciat.WebViewer
	 * @generated
	 */
	EClass getWebViewer();

	/**
	 * Returns the meta object for the attribute '{@link lciat.WebViewer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.WebViewer#getName()
	 * @see #getWebViewer()
	 * @generated
	 */
	EAttribute getWebViewer_Name();

	/**
	 * Returns the meta object for class '{@link lciat.Awareness <em>Awareness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Awareness</em>'.
	 * @see lciat.Awareness
	 * @generated
	 */
	EClass getAwareness();

	/**
	 * Returns the meta object for class '{@link lciat.SessionPanel <em>Session Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session Panel</em>'.
	 * @see lciat.SessionPanel
	 * @generated
	 */
	EClass getSessionPanel();

	/**
	 * Returns the meta object for the attribute '{@link lciat.SessionPanel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.SessionPanel#getName()
	 * @see #getSessionPanel()
	 * @generated
	 */
	EAttribute getSessionPanel_Name();

	/**
	 * Returns the meta object for the attribute '{@link lciat.SessionPanel#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see lciat.SessionPanel#getPosition()
	 * @see #getSessionPanel()
	 * @generated
	 */
	EAttribute getSessionPanel_Position();

	/**
	 * Returns the meta object for the attribute '{@link lciat.SessionPanel#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see lciat.SessionPanel#getLanguage()
	 * @see #getSessionPanel()
	 * @generated
	 */
	EAttribute getSessionPanel_Language();

	/**
	 * Returns the meta object for the attribute '{@link lciat.SessionPanel#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see lciat.SessionPanel#getSize()
	 * @see #getSessionPanel()
	 * @generated
	 */
	EAttribute getSessionPanel_Size();

	/**
	 * Returns the meta object for class '{@link lciat.Chat <em>Chat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chat</em>'.
	 * @see lciat.Chat
	 * @generated
	 */
	EClass getChat();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Chat#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.Chat#getName()
	 * @see #getChat()
	 * @generated
	 */
	EAttribute getChat_Name();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Chat#isIsStructured <em>Is Structured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Structured</em>'.
	 * @see lciat.Chat#isIsStructured()
	 * @see #getChat()
	 * @generated
	 */
	EAttribute getChat_IsStructured();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Chat#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see lciat.Chat#getPosition()
	 * @see #getChat()
	 * @generated
	 */
	EAttribute getChat_Position();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Chat#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see lciat.Chat#getLanguage()
	 * @see #getChat()
	 * @generated
	 */
	EAttribute getChat_Language();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Chat#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see lciat.Chat#getSize()
	 * @see #getChat()
	 * @generated
	 */
	EAttribute getChat_Size();

	/**
	 * Returns the meta object for class '{@link lciat.TurnTakingTool <em>Turn Taking Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Taking Tool</em>'.
	 * @see lciat.TurnTakingTool
	 * @generated
	 */
	EClass getTurnTakingTool();

	/**
	 * Returns the meta object for the attribute '{@link lciat.TurnTakingTool#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.TurnTakingTool#getName()
	 * @see #getTurnTakingTool()
	 * @generated
	 */
	EAttribute getTurnTakingTool_Name();

	/**
	 * Returns the meta object for the attribute '{@link lciat.TurnTakingTool#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see lciat.TurnTakingTool#getPosition()
	 * @see #getTurnTakingTool()
	 * @generated
	 */
	EAttribute getTurnTakingTool_Position();

	/**
	 * Returns the meta object for the attribute '{@link lciat.TurnTakingTool#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see lciat.TurnTakingTool#getLanguage()
	 * @see #getTurnTakingTool()
	 * @generated
	 */
	EAttribute getTurnTakingTool_Language();

	/**
	 * Returns the meta object for the attribute '{@link lciat.TurnTakingTool#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see lciat.TurnTakingTool#getSize()
	 * @see #getTurnTakingTool()
	 * @generated
	 */
	EAttribute getTurnTakingTool_Size();

	/**
	 * Returns the meta object for class '{@link lciat.Telepointer <em>Telepointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Telepointer</em>'.
	 * @see lciat.Telepointer
	 * @generated
	 */
	EClass getTelepointer();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Telepointer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.Telepointer#getName()
	 * @see #getTelepointer()
	 * @generated
	 */
	EAttribute getTelepointer_Name();

	/**
	 * Returns the meta object for class '{@link lciat.RadarView <em>Radar View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radar View</em>'.
	 * @see lciat.RadarView
	 * @generated
	 */
	EClass getRadarView();

	/**
	 * Returns the meta object for the attribute '{@link lciat.RadarView#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.RadarView#getName()
	 * @see #getRadarView()
	 * @generated
	 */
	EAttribute getRadarView_Name();

	/**
	 * Returns the meta object for the attribute '{@link lciat.RadarView#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see lciat.RadarView#getPosition()
	 * @see #getRadarView()
	 * @generated
	 */
	EAttribute getRadarView_Position();

	/**
	 * Returns the meta object for class '{@link lciat.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see lciat.Properties
	 * @generated
	 */
	EClass getProperties();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Properties#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.Properties#getName()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Name();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Properties#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see lciat.Properties#getPosition()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Position();

	/**
	 * Returns the meta object for class '{@link lciat.Console <em>Console</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Console</em>'.
	 * @see lciat.Console
	 * @generated
	 */
	EClass getConsole();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Console#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.Console#getName()
	 * @see #getConsole()
	 * @generated
	 */
	EAttribute getConsole_Name();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Console#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see lciat.Console#getPosition()
	 * @see #getConsole()
	 * @generated
	 */
	EAttribute getConsole_Position();

	/**
	 * Returns the meta object for class '{@link lciat.Problems <em>Problems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problems</em>'.
	 * @see lciat.Problems
	 * @generated
	 */
	EClass getProblems();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Problems#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.Problems#getName()
	 * @see #getProblems()
	 * @generated
	 */
	EAttribute getProblems_Name();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Problems#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see lciat.Problems#getPosition()
	 * @see #getProblems()
	 * @generated
	 */
	EAttribute getProblems_Position();

	/**
	 * Returns the meta object for class '{@link lciat.Traceability <em>Traceability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traceability</em>'.
	 * @see lciat.Traceability
	 * @generated
	 */
	EClass getTraceability();

	/**
	 * Returns the meta object for the reference '{@link lciat.Traceability#getAwarelement <em>Awarelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Awarelement</em>'.
	 * @see lciat.Traceability#getAwarelement()
	 * @see #getTraceability()
	 * @generated
	 */
	EReference getTraceability_Awarelement();

	/**
	 * Returns the meta object for the reference '{@link lciat.Traceability#getToolelement <em>Toolelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Toolelement</em>'.
	 * @see lciat.Traceability#getToolelement()
	 * @see #getTraceability()
	 * @generated
	 */
	EReference getTraceability_Toolelement();

	/**
	 * Returns the meta object for class '{@link lciat.CTTDiagram <em>CTT Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CTT Diagram</em>'.
	 * @see lciat.CTTDiagram
	 * @generated
	 */
	EClass getCTTDiagram();

	/**
	 * Returns the meta object for the attribute '{@link lciat.CTTDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.CTTDiagram#getName()
	 * @see #getCTTDiagram()
	 * @generated
	 */
	EAttribute getCTTDiagram_Name();

	/**
	 * Returns the meta object for the reference list '{@link lciat.CTTDiagram#getMolefCttNodes <em>Molef Ctt Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Molef Ctt Nodes</em>'.
	 * @see lciat.CTTDiagram#getMolefCttNodes()
	 * @see #getCTTDiagram()
	 * @generated
	 */
	EReference getCTTDiagram_MolefCttNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link lciat.CTTDiagram#getCttTasks <em>Ctt Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ctt Tasks</em>'.
	 * @see lciat.CTTDiagram#getCttTasks()
	 * @see #getCTTDiagram()
	 * @generated
	 */
	EReference getCTTDiagram_CttTasks();

	/**
	 * Returns the meta object for the containment reference list '{@link lciat.CTTDiagram#getMfCttNodes <em>Mf Ctt Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mf Ctt Nodes</em>'.
	 * @see lciat.CTTDiagram#getMfCttNodes()
	 * @see #getCTTDiagram()
	 * @generated
	 */
	EReference getCTTDiagram_MfCttNodes();

	/**
	 * Returns the meta object for class '{@link lciat.CTTTask <em>CTT Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CTT Task</em>'.
	 * @see lciat.CTTTask
	 * @generated
	 */
	EClass getCTTTask();

	/**
	 * Returns the meta object for the attribute '{@link lciat.CTTTask#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lciat.CTTTask#getName()
	 * @see #getCTTTask()
	 * @generated
	 */
	EAttribute getCTTTask_Name();

	/**
	 * Returns the meta object for the reference list '{@link lciat.CTTTask#getCttLinks <em>Ctt Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ctt Links</em>'.
	 * @see lciat.CTTTask#getCttLinks()
	 * @see #getCTTTask()
	 * @generated
	 */
	EReference getCTTTask_CttLinks();

	/**
	 * Returns the meta object for class '{@link lciat.ExclusiveEdition <em>Exclusive Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive Edition</em>'.
	 * @see lciat.ExclusiveEdition
	 * @generated
	 */
	EClass getExclusiveEdition();

	/**
	 * Returns the meta object for class '{@link lciat.CollaborativeVisualization <em>Collaborative Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaborative Visualization</em>'.
	 * @see lciat.CollaborativeVisualization
	 * @generated
	 */
	EClass getCollaborativeVisualization();

	/**
	 * Returns the meta object for class '{@link lciat.IndividualVisualization <em>Individual Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Visualization</em>'.
	 * @see lciat.IndividualVisualization
	 * @generated
	 */
	EClass getIndividualVisualization();

	/**
	 * Returns the meta object for class '{@link lciat.UserTask <em>User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Task</em>'.
	 * @see lciat.UserTask
	 * @generated
	 */
	EClass getUserTask();

	/**
	 * Returns the meta object for class '{@link lciat.CTTAbstractTask <em>CTT Abstract Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CTT Abstract Task</em>'.
	 * @see lciat.CTTAbstractTask
	 * @generated
	 */
	EClass getCTTAbstractTask();

	/**
	 * Returns the meta object for class '{@link lciat.InteractiveTask <em>Interactive Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interactive Task</em>'.
	 * @see lciat.InteractiveTask
	 * @generated
	 */
	EClass getInteractiveTask();

	/**
	 * Returns the meta object for class '{@link lciat.CTTCollaborativeTask <em>CTT Collaborative Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CTT Collaborative Task</em>'.
	 * @see lciat.CTTCollaborativeTask
	 * @generated
	 */
	EClass getCTTCollaborativeTask();

	/**
	 * Returns the meta object for class '{@link lciat.ApplicationTask <em>Application Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Task</em>'.
	 * @see lciat.ApplicationTask
	 * @generated
	 */
	EClass getApplicationTask();

	/**
	 * Returns the meta object for class '{@link lciat.CTTLink <em>CTT Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CTT Link</em>'.
	 * @see lciat.CTTLink
	 * @generated
	 */
	EClass getCTTLink();

	/**
	 * Returns the meta object for the reference '{@link lciat.CTTLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see lciat.CTTLink#getSource()
	 * @see #getCTTLink()
	 * @generated
	 */
	EReference getCTTLink_Source();

	/**
	 * Returns the meta object for the reference '{@link lciat.CTTLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see lciat.CTTLink#getTarget()
	 * @see #getCTTLink()
	 * @generated
	 */
	EReference getCTTLink_Target();

	/**
	 * Returns the meta object for class '{@link lciat.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation</em>'.
	 * @see lciat.Aggregation
	 * @generated
	 */
	EClass getAggregation();

	/**
	 * Returns the meta object for class '{@link lciat.Enabling <em>Enabling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enabling</em>'.
	 * @see lciat.Enabling
	 * @generated
	 */
	EClass getEnabling();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Enabling#getELabel <em>ELabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ELabel</em>'.
	 * @see lciat.Enabling#getELabel()
	 * @see #getEnabling()
	 * @generated
	 */
	EAttribute getEnabling_ELabel();

	/**
	 * Returns the meta object for class '{@link lciat.Disabling <em>Disabling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disabling</em>'.
	 * @see lciat.Disabling
	 * @generated
	 */
	EClass getDisabling();

	/**
	 * Returns the meta object for the attribute '{@link lciat.Disabling#getDLabel <em>DLabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DLabel</em>'.
	 * @see lciat.Disabling#getDLabel()
	 * @see #getDisabling()
	 * @generated
	 */
	EAttribute getDisabling_DLabel();

	/**
	 * Returns the meta object for class '{@link lciat.EnablingWithInformationPassing <em>Enabling With Information Passing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enabling With Information Passing</em>'.
	 * @see lciat.EnablingWithInformationPassing
	 * @generated
	 */
	EClass getEnablingWithInformationPassing();

	/**
	 * Returns the meta object for the attribute '{@link lciat.EnablingWithInformationPassing#getEwLabel <em>Ew Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ew Label</em>'.
	 * @see lciat.EnablingWithInformationPassing#getEwLabel()
	 * @see #getEnablingWithInformationPassing()
	 * @generated
	 */
	EAttribute getEnablingWithInformationPassing_EwLabel();

	/**
	 * Returns the meta object for class '{@link lciat.DisablingWithInformationPassing <em>Disabling With Information Passing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disabling With Information Passing</em>'.
	 * @see lciat.DisablingWithInformationPassing
	 * @generated
	 */
	EClass getDisablingWithInformationPassing();

	/**
	 * Returns the meta object for the attribute '{@link lciat.DisablingWithInformationPassing#getDwLabel <em>Dw Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dw Label</em>'.
	 * @see lciat.DisablingWithInformationPassing#getDwLabel()
	 * @see #getDisablingWithInformationPassing()
	 * @generated
	 */
	EAttribute getDisablingWithInformationPassing_DwLabel();

	/**
	 * Returns the meta object for class '{@link lciat.IndependentConcurrency <em>Independent Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Independent Concurrency</em>'.
	 * @see lciat.IndependentConcurrency
	 * @generated
	 */
	EClass getIndependentConcurrency();

	/**
	 * Returns the meta object for the attribute '{@link lciat.IndependentConcurrency#getIcLabel <em>Ic Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ic Label</em>'.
	 * @see lciat.IndependentConcurrency#getIcLabel()
	 * @see #getIndependentConcurrency()
	 * @generated
	 */
	EAttribute getIndependentConcurrency_IcLabel();

	/**
	 * Returns the meta object for class '{@link lciat.OrderIndependence <em>Order Independence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Independence</em>'.
	 * @see lciat.OrderIndependence
	 * @generated
	 */
	EClass getOrderIndependence();

	/**
	 * Returns the meta object for the attribute '{@link lciat.OrderIndependence#getOiLabel <em>Oi Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oi Label</em>'.
	 * @see lciat.OrderIndependence#getOiLabel()
	 * @see #getOrderIndependence()
	 * @generated
	 */
	EAttribute getOrderIndependence_OiLabel();

	/**
	 * Returns the meta object for class '{@link lciat.SuspendResume <em>Suspend Resume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suspend Resume</em>'.
	 * @see lciat.SuspendResume
	 * @generated
	 */
	EClass getSuspendResume();

	/**
	 * Returns the meta object for the attribute '{@link lciat.SuspendResume#getSrLabel <em>Sr Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sr Label</em>'.
	 * @see lciat.SuspendResume#getSrLabel()
	 * @see #getSuspendResume()
	 * @generated
	 */
	EAttribute getSuspendResume_SrLabel();

	/**
	 * Returns the meta object for class '{@link lciat.ConcurrencyWithInformationPassing <em>Concurrency With Information Passing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concurrency With Information Passing</em>'.
	 * @see lciat.ConcurrencyWithInformationPassing
	 * @generated
	 */
	EClass getConcurrencyWithInformationPassing();

	/**
	 * Returns the meta object for the attribute '{@link lciat.ConcurrencyWithInformationPassing#getCLabel <em>CLabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CLabel</em>'.
	 * @see lciat.ConcurrencyWithInformationPassing#getCLabel()
	 * @see #getConcurrencyWithInformationPassing()
	 * @generated
	 */
	EAttribute getConcurrencyWithInformationPassing_CLabel();

	/**
	 * Returns the meta object for class '{@link lciat.DeterministicChoice <em>Deterministic Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deterministic Choice</em>'.
	 * @see lciat.DeterministicChoice
	 * @generated
	 */
	EClass getDeterministicChoice();

	/**
	 * Returns the meta object for the attribute '{@link lciat.DeterministicChoice#getDtLabel <em>Dt Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dt Label</em>'.
	 * @see lciat.DeterministicChoice#getDtLabel()
	 * @see #getDeterministicChoice()
	 * @generated
	 */
	EAttribute getDeterministicChoice_DtLabel();

	/**
	 * Returns the meta object for class '{@link lciat.UndeterministicChoice <em>Undeterministic Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Undeterministic Choice</em>'.
	 * @see lciat.UndeterministicChoice
	 * @generated
	 */
	EClass getUndeterministicChoice();

	/**
	 * Returns the meta object for the attribute '{@link lciat.UndeterministicChoice#getUcLabel <em>Uc Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uc Label</em>'.
	 * @see lciat.UndeterministicChoice#getUcLabel()
	 * @see #getUndeterministicChoice()
	 * @generated
	 */
	EAttribute getUndeterministicChoice_UcLabel();

	/**
	 * Returns the meta object for class '{@link lciat.MolefNode <em>Molef Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Node</em>'.
	 * @see lciat.MolefNode
	 * @generated
	 */
	EClass getMolefNode();

	/**
	 * Returns the meta object for class '{@link lciat.MolefContentNode <em>Molef Content Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Content Node</em>'.
	 * @see lciat.MolefContentNode
	 * @generated
	 */
	EClass getMolefContentNode();

	/**
	 * Returns the meta object for class '{@link lciat.MolefLearningNode <em>Molef Learning Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Learning Node</em>'.
	 * @see lciat.MolefLearningNode
	 * @generated
	 */
	EClass getMolefLearningNode();

	/**
	 * Returns the meta object for class '{@link lciat.MolefCttNode <em>Molef Ctt Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Ctt Node</em>'.
	 * @see lciat.MolefCttNode
	 * @generated
	 */
	EClass getMolefCttNode();

	/**
	 * Returns the meta object for class '{@link lciat.MolefContent1 <em>Molef Content1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Content1</em>'.
	 * @see lciat.MolefContent1
	 * @generated
	 */
	EClass getMolefContent1();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefContent1#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefContent1#getCharacteristic()
	 * @see #getMolefContent1()
	 * @generated
	 */
	EAttribute getMolefContent1_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefContent2 <em>Molef Content2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Content2</em>'.
	 * @see lciat.MolefContent2
	 * @generated
	 */
	EClass getMolefContent2();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefContent2#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefContent2#getCharacteristic()
	 * @see #getMolefContent2()
	 * @generated
	 */
	EAttribute getMolefContent2_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefContent3 <em>Molef Content3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Content3</em>'.
	 * @see lciat.MolefContent3
	 * @generated
	 */
	EClass getMolefContent3();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefContent3#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefContent3#getCharacteristic()
	 * @see #getMolefContent3()
	 * @generated
	 */
	EAttribute getMolefContent3_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefContent4 <em>Molef Content4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Content4</em>'.
	 * @see lciat.MolefContent4
	 * @generated
	 */
	EClass getMolefContent4();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefContent4#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefContent4#getCharacteristic()
	 * @see #getMolefContent4()
	 * @generated
	 */
	EAttribute getMolefContent4_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefContent5 <em>Molef Content5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Content5</em>'.
	 * @see lciat.MolefContent5
	 * @generated
	 */
	EClass getMolefContent5();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefContent5#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefContent5#getCharacteristic()
	 * @see #getMolefContent5()
	 * @generated
	 */
	EAttribute getMolefContent5_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefContent6 <em>Molef Content6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Content6</em>'.
	 * @see lciat.MolefContent6
	 * @generated
	 */
	EClass getMolefContent6();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefContent6#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefContent6#getCharacteristic()
	 * @see #getMolefContent6()
	 * @generated
	 */
	EAttribute getMolefContent6_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefTaskAndActivitiesNode <em>Molef Task And Activities Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Task And Activities Node</em>'.
	 * @see lciat.MolefTaskAndActivitiesNode
	 * @generated
	 */
	EClass getMolefTaskAndActivitiesNode();

	/**
	 * Returns the meta object for class '{@link lciat.MolefTActivities1 <em>Molef TActivities1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef TActivities1</em>'.
	 * @see lciat.MolefTActivities1
	 * @generated
	 */
	EClass getMolefTActivities1();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefTActivities1#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefTActivities1#getCharacteristic()
	 * @see #getMolefTActivities1()
	 * @generated
	 */
	EAttribute getMolefTActivities1_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefTActivities2 <em>Molef TActivities2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef TActivities2</em>'.
	 * @see lciat.MolefTActivities2
	 * @generated
	 */
	EClass getMolefTActivities2();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefTActivities2#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefTActivities2#getCharacteristic()
	 * @see #getMolefTActivities2()
	 * @generated
	 */
	EAttribute getMolefTActivities2_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefTActivities3 <em>Molef TActivities3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef TActivities3</em>'.
	 * @see lciat.MolefTActivities3
	 * @generated
	 */
	EClass getMolefTActivities3();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefTActivities3#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefTActivities3#getCharacteristic()
	 * @see #getMolefTActivities3()
	 * @generated
	 */
	EAttribute getMolefTActivities3_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefTActivities4 <em>Molef TActivities4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef TActivities4</em>'.
	 * @see lciat.MolefTActivities4
	 * @generated
	 */
	EClass getMolefTActivities4();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefTActivities4#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefTActivities4#getCharacteristic()
	 * @see #getMolefTActivities4()
	 * @generated
	 */
	EAttribute getMolefTActivities4_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefTActivities5 <em>Molef TActivities5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef TActivities5</em>'.
	 * @see lciat.MolefTActivities5
	 * @generated
	 */
	EClass getMolefTActivities5();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefTActivities5#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefTActivities5#getCharacteristic()
	 * @see #getMolefTActivities5()
	 * @generated
	 */
	EAttribute getMolefTActivities5_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefTActivities6 <em>Molef TActivities6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef TActivities6</em>'.
	 * @see lciat.MolefTActivities6
	 * @generated
	 */
	EClass getMolefTActivities6();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefTActivities6#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefTActivities6#getCharacteristic()
	 * @see #getMolefTActivities6()
	 * @generated
	 */
	EAttribute getMolefTActivities6_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefTActivities7 <em>Molef TActivities7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef TActivities7</em>'.
	 * @see lciat.MolefTActivities7
	 * @generated
	 */
	EClass getMolefTActivities7();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefTActivities7#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefTActivities7#getCharacteristic()
	 * @see #getMolefTActivities7()
	 * @generated
	 */
	EAttribute getMolefTActivities7_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefTActivities8 <em>Molef TActivities8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef TActivities8</em>'.
	 * @see lciat.MolefTActivities8
	 * @generated
	 */
	EClass getMolefTActivities8();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefTActivities8#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefTActivities8#getCharacteristic()
	 * @see #getMolefTActivities8()
	 * @generated
	 */
	EAttribute getMolefTActivities8_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefSocialNode <em>Molef Social Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Social Node</em>'.
	 * @see lciat.MolefSocialNode
	 * @generated
	 */
	EClass getMolefSocialNode();

	/**
	 * Returns the meta object for class '{@link lciat.MolefSocial1 <em>Molef Social1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Social1</em>'.
	 * @see lciat.MolefSocial1
	 * @generated
	 */
	EClass getMolefSocial1();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefSocial1#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefSocial1#getCharacteristic()
	 * @see #getMolefSocial1()
	 * @generated
	 */
	EAttribute getMolefSocial1_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefSocial2 <em>Molef Social2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Social2</em>'.
	 * @see lciat.MolefSocial2
	 * @generated
	 */
	EClass getMolefSocial2();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefSocial2#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefSocial2#getCharacteristic()
	 * @see #getMolefSocial2()
	 * @generated
	 */
	EAttribute getMolefSocial2_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefSocial3 <em>Molef Social3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Social3</em>'.
	 * @see lciat.MolefSocial3
	 * @generated
	 */
	EClass getMolefSocial3();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefSocial3#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefSocial3#getCharacteristic()
	 * @see #getMolefSocial3()
	 * @generated
	 */
	EAttribute getMolefSocial3_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefSocial4 <em>Molef Social4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Social4</em>'.
	 * @see lciat.MolefSocial4
	 * @generated
	 */
	EClass getMolefSocial4();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefSocial4#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefSocial4#getCharacteristic()
	 * @see #getMolefSocial4()
	 * @generated
	 */
	EAttribute getMolefSocial4_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefPersonalizationNode <em>Molef Personalization Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Personalization Node</em>'.
	 * @see lciat.MolefPersonalizationNode
	 * @generated
	 */
	EClass getMolefPersonalizationNode();

	/**
	 * Returns the meta object for class '{@link lciat.MolefPersonalization1 <em>Molef Personalization1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Personalization1</em>'.
	 * @see lciat.MolefPersonalization1
	 * @generated
	 */
	EClass getMolefPersonalization1();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefPersonalization1#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefPersonalization1#getCharacteristic()
	 * @see #getMolefPersonalization1()
	 * @generated
	 */
	EAttribute getMolefPersonalization1_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefPersonalization2 <em>Molef Personalization2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Personalization2</em>'.
	 * @see lciat.MolefPersonalization2
	 * @generated
	 */
	EClass getMolefPersonalization2();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefPersonalization2#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefPersonalization2#getCharacteristic()
	 * @see #getMolefPersonalization2()
	 * @generated
	 */
	EAttribute getMolefPersonalization2_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefPersonalization3 <em>Molef Personalization3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Personalization3</em>'.
	 * @see lciat.MolefPersonalization3
	 * @generated
	 */
	EClass getMolefPersonalization3();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefPersonalization3#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefPersonalization3#getCharacteristic()
	 * @see #getMolefPersonalization3()
	 * @generated
	 */
	EAttribute getMolefPersonalization3_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefPersonalization4 <em>Molef Personalization4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Personalization4</em>'.
	 * @see lciat.MolefPersonalization4
	 * @generated
	 */
	EClass getMolefPersonalization4();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefPersonalization4#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefPersonalization4#getCharacteristic()
	 * @see #getMolefPersonalization4()
	 * @generated
	 */
	EAttribute getMolefPersonalization4_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefPersonalization5 <em>Molef Personalization5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Personalization5</em>'.
	 * @see lciat.MolefPersonalization5
	 * @generated
	 */
	EClass getMolefPersonalization5();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefPersonalization5#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefPersonalization5#getCharacteristic()
	 * @see #getMolefPersonalization5()
	 * @generated
	 */
	EAttribute getMolefPersonalization5_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefMultimediaNode <em>Molef Multimedia Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Multimedia Node</em>'.
	 * @see lciat.MolefMultimediaNode
	 * @generated
	 */
	EClass getMolefMultimediaNode();

	/**
	 * Returns the meta object for class '{@link lciat.MolefMultimedia1 <em>Molef Multimedia1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Multimedia1</em>'.
	 * @see lciat.MolefMultimedia1
	 * @generated
	 */
	EClass getMolefMultimedia1();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefMultimedia1#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefMultimedia1#getCharacteristic()
	 * @see #getMolefMultimedia1()
	 * @generated
	 */
	EAttribute getMolefMultimedia1_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefMultimedia2 <em>Molef Multimedia2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Multimedia2</em>'.
	 * @see lciat.MolefMultimedia2
	 * @generated
	 */
	EClass getMolefMultimedia2();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefMultimedia2#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefMultimedia2#getCharacteristic()
	 * @see #getMolefMultimedia2()
	 * @generated
	 */
	EAttribute getMolefMultimedia2_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefMultimedia3 <em>Molef Multimedia3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Multimedia3</em>'.
	 * @see lciat.MolefMultimedia3
	 * @generated
	 */
	EClass getMolefMultimedia3();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefMultimedia3#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefMultimedia3#getCharacteristic()
	 * @see #getMolefMultimedia3()
	 * @generated
	 */
	EAttribute getMolefMultimedia3_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefMultimedia4 <em>Molef Multimedia4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Multimedia4</em>'.
	 * @see lciat.MolefMultimedia4
	 * @generated
	 */
	EClass getMolefMultimedia4();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefMultimedia4#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefMultimedia4#getCharacteristic()
	 * @see #getMolefMultimedia4()
	 * @generated
	 */
	EAttribute getMolefMultimedia4_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefMultimedia5 <em>Molef Multimedia5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Multimedia5</em>'.
	 * @see lciat.MolefMultimedia5
	 * @generated
	 */
	EClass getMolefMultimedia5();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefMultimedia5#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefMultimedia5#getCharacteristic()
	 * @see #getMolefMultimedia5()
	 * @generated
	 */
	EAttribute getMolefMultimedia5_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefMultimedia6 <em>Molef Multimedia6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Multimedia6</em>'.
	 * @see lciat.MolefMultimedia6
	 * @generated
	 */
	EClass getMolefMultimedia6();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefMultimedia6#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefMultimedia6#getCharacteristic()
	 * @see #getMolefMultimedia6()
	 * @generated
	 */
	EAttribute getMolefMultimedia6_Characteristic();

	/**
	 * Returns the meta object for class '{@link lciat.MolefMultimedia7 <em>Molef Multimedia7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molef Multimedia7</em>'.
	 * @see lciat.MolefMultimedia7
	 * @generated
	 */
	EClass getMolefMultimedia7();

	/**
	 * Returns the meta object for the attribute '{@link lciat.MolefMultimedia7#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see lciat.MolefMultimedia7#getCharacteristic()
	 * @see #getMolefMultimedia7()
	 * @generated
	 */
	EAttribute getMolefMultimedia7_Characteristic();

	/**
	 * Returns the meta object for enum '{@link lciat.Subtypes <em>Subtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Subtypes</em>'.
	 * @see lciat.Subtypes
	 * @generated
	 */
	EEnum getSubtypes();

	/**
	 * Returns the meta object for enum '{@link lciat.Modalities <em>Modalities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modalities</em>'.
	 * @see lciat.Modalities
	 * @generated
	 */
	EEnum getModalities();

	/**
	 * Returns the meta object for enum '{@link lciat.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position</em>'.
	 * @see lciat.Position
	 * @generated
	 */
	EEnum getPosition();

	/**
	 * Returns the meta object for enum '{@link lciat.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language</em>'.
	 * @see lciat.Language
	 * @generated
	 */
	EEnum getLanguage();

	/**
	 * Returns the meta object for enum '{@link lciat.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Size</em>'.
	 * @see lciat.Size
	 * @generated
	 */
	EEnum getSize();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LciatFactory getLciatFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link lciat.impl.LCIANDiagramImpl <em>LCIAN Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.LCIANDiagramImpl
		 * @see lciat.impl.LciatPackageImpl#getLCIANDiagram()
		 * @generated
		 */
		EClass LCIAN_DIAGRAM = eINSTANCE.getLCIANDiagram();

		/**
		 * The meta object literal for the '<em><b>Its Sociograms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LCIAN_DIAGRAM__ITS_SOCIOGRAMS = eINSTANCE.getLCIANDiagram_ItsSociograms();

		/**
		 * The meta object literal for the '<em><b>Its Learning Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LCIAN_DIAGRAM__ITS_LEARNING_DIAGRAMS = eINSTANCE.getLCIANDiagram_ItsLearningDiagrams();

		/**
		 * The meta object literal for the '<em><b>Its Ctt Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LCIAN_DIAGRAM__ITS_CTT_DIAGRAMS = eINSTANCE.getLCIANDiagram_ItsCttDiagrams();

		/**
		 * The meta object literal for the '<em><b>Its Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LCIAN_DIAGRAM__ITS_LINKS = eINSTANCE.getLCIANDiagram_ItsLinks();

		/**
		 * The meta object literal for the '{@link lciat.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.LinkImpl
		 * @see lciat.impl.LciatPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '{@link lciat.impl.SociogramImpl <em>Sociogram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.SociogramImpl
		 * @see lciat.impl.LciatPackageImpl#getSociogram()
		 * @generated
		 */
		EClass SOCIOGRAM = eINSTANCE.getSociogram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCIOGRAM__NAME = eINSTANCE.getSociogram_Name();

		/**
		 * The meta object literal for the '<em><b>Its Sociogram Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIOGRAM__ITS_SOCIOGRAM_NODES = eINSTANCE.getSociogram_ItsSociogramNodes();

		/**
		 * The meta object literal for the '<em><b>Mf Content Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIOGRAM__MF_CONTENT_NODES = eINSTANCE.getSociogram_MfContentNodes();

		/**
		 * The meta object literal for the '{@link lciat.impl.SociogramNodeImpl <em>Sociogram Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.SociogramNodeImpl
		 * @see lciat.impl.LciatPackageImpl#getSociogramNode()
		 * @generated
		 */
		EClass SOCIOGRAM_NODE = eINSTANCE.getSociogramNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCIOGRAM_NODE__NAME = eINSTANCE.getSociogramNode_Name();

		/**
		 * The meta object literal for the '{@link lciat.impl.RolImpl <em>Rol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.RolImpl
		 * @see lciat.impl.LciatPackageImpl#getRol()
		 * @generated
		 */
		EClass ROL = eINSTANCE.getRol();

		/**
		 * The meta object literal for the '<em><b>Its Group</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROL__ITS_GROUP = eINSTANCE.getRol_ItsGroup();

		/**
		 * The meta object literal for the '<em><b>Supertype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROL__SUPERTYPE = eINSTANCE.getRol_Supertype();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROL__SUBTYPE = eINSTANCE.getRol_Subtype();

		/**
		 * The meta object literal for the '{@link lciat.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.GroupImpl
		 * @see lciat.impl.LciatPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__CONTAINS = eINSTANCE.getGroup_Contains();

		/**
		 * The meta object literal for the '{@link lciat.impl.SociogramLinkImpl <em>Sociogram Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.SociogramLinkImpl
		 * @see lciat.impl.LciatPackageImpl#getSociogramLink()
		 * @generated
		 */
		EClass SOCIOGRAM_LINK = eINSTANCE.getSociogramLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIOGRAM_LINK__SOURCE = eINSTANCE.getSociogramLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIOGRAM_LINK__TARGET = eINSTANCE.getSociogramLink_Target();

		/**
		 * The meta object literal for the '{@link lciat.impl.InheritanceImpl <em>Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.InheritanceImpl
		 * @see lciat.impl.LciatPackageImpl#getInheritance()
		 * @generated
		 */
		EClass INHERITANCE = eINSTANCE.getInheritance();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERITANCE__CONDITION = eINSTANCE.getInheritance_Condition();

		/**
		 * The meta object literal for the '{@link lciat.impl.ActingImpl <em>Acting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.ActingImpl
		 * @see lciat.impl.LciatPackageImpl#getActing()
		 * @generated
		 */
		EClass ACTING = eINSTANCE.getActing();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTING__NAME = eINSTANCE.getActing_Name();

		/**
		 * The meta object literal for the '<em><b>N</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTING__N = eINSTANCE.getActing_N();

		/**
		 * The meta object literal for the '<em><b>M</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTING__M = eINSTANCE.getActing_M();

		/**
		 * The meta object literal for the '{@link lciat.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.AssociationImpl
		 * @see lciat.impl.LciatPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__NAME = eINSTANCE.getAssociation_Name();

		/**
		 * The meta object literal for the '<em><b>N</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__N = eINSTANCE.getAssociation_N();

		/**
		 * The meta object literal for the '<em><b>M</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__M = eINSTANCE.getAssociation_M();

		/**
		 * The meta object literal for the '{@link lciat.impl.LearningDiagramImpl <em>Learning Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.LearningDiagramImpl
		 * @see lciat.impl.LciatPackageImpl#getLearningDiagram()
		 * @generated
		 */
		EClass LEARNING_DIAGRAM = eINSTANCE.getLearningDiagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEARNING_DIAGRAM__NAME = eINSTANCE.getLearningDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Molef Learning Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_DIAGRAM__MOLEF_LEARNING_NODES = eINSTANCE.getLearningDiagram_MolefLearningNodes();

		/**
		 * The meta object literal for the '<em><b>Learning Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_DIAGRAM__LEARNING_NODES = eINSTANCE.getLearningDiagram_LearningNodes();

		/**
		 * The meta object literal for the '<em><b>Mf Learning Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_DIAGRAM__MF_LEARNING_NODES = eINSTANCE.getLearningDiagram_MfLearningNodes();

		/**
		 * The meta object literal for the '{@link lciat.impl.LearningNodeImpl <em>Learning Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.LearningNodeImpl
		 * @see lciat.impl.LciatPackageImpl#getLearningNode()
		 * @generated
		 */
		EClass LEARNING_NODE = eINSTANCE.getLearningNode();

		/**
		 * The meta object literal for the '{@link lciat.impl.InitImpl <em>Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.InitImpl
		 * @see lciat.impl.LciatPackageImpl#getInit()
		 * @generated
		 */
		EClass INIT = eINSTANCE.getInit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INIT__NAME = eINSTANCE.getInit_Name();

		/**
		 * The meta object literal for the '{@link lciat.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.EndImpl
		 * @see lciat.impl.LciatPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END__NAME = eINSTANCE.getEnd_Name();

		/**
		 * The meta object literal for the '{@link lciat.impl.LearningActivityImpl <em>Learning Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.LearningActivityImpl
		 * @see lciat.impl.LciatPackageImpl#getLearningActivity()
		 * @generated
		 */
		EClass LEARNING_ACTIVITY = eINSTANCE.getLearningActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEARNING_ACTIVITY__NAME = eINSTANCE.getLearningActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Its Modality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEARNING_ACTIVITY__ITS_MODALITY = eINSTANCE.getLearningActivity_ItsModality();

		/**
		 * The meta object literal for the '<em><b>Its Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEARNING_ACTIVITY__ITS_SUBTYPE = eINSTANCE.getLearningActivity_ItsSubtype();

		/**
		 * The meta object literal for the '<em><b>Tools</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_ACTIVITY__TOOLS = eINSTANCE.getLearningActivity_Tools();

		/**
		 * The meta object literal for the '{@link lciat.impl.LeftSideLearningNodeImpl <em>Left Side Learning Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.LeftSideLearningNodeImpl
		 * @see lciat.impl.LciatPackageImpl#getLeftSideLearningNode()
		 * @generated
		 */
		EClass LEFT_SIDE_LEARNING_NODE = eINSTANCE.getLeftSideLearningNode();

		/**
		 * The meta object literal for the '{@link lciat.impl.IndividualTaskImpl <em>Individual Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.IndividualTaskImpl
		 * @see lciat.impl.LciatPackageImpl#getIndividualTask()
		 * @generated
		 */
		EClass INDIVIDUAL_TASK = eINSTANCE.getIndividualTask();

		/**
		 * The meta object literal for the '<em><b>Task Roles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_TASK__TASK_ROLES = eINSTANCE.getIndividualTask_TaskRoles();

		/**
		 * The meta object literal for the '<em><b>Task Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_TASK__TASK_OBJECTS = eINSTANCE.getIndividualTask_TaskObjects();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_TASK__SUBTYPE = eINSTANCE.getIndividualTask_Subtype();

		/**
		 * The meta object literal for the '<em><b>Modality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_TASK__MODALITY = eINSTANCE.getIndividualTask_Modality();

		/**
		 * The meta object literal for the '{@link lciat.impl.GroupTaskImpl <em>Group Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.GroupTaskImpl
		 * @see lciat.impl.LciatPackageImpl#getGroupTask()
		 * @generated
		 */
		EClass GROUP_TASK = eINSTANCE.getGroupTask();

		/**
		 * The meta object literal for the '<em><b>Task Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_TASK__TASK_ROLES = eINSTANCE.getGroupTask_TaskRoles();

		/**
		 * The meta object literal for the '<em><b>Task Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_TASK__TASK_OBJECTS = eINSTANCE.getGroupTask_TaskObjects();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_TASK__SUBTYPE = eINSTANCE.getGroupTask_Subtype();

		/**
		 * The meta object literal for the '<em><b>Modality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_TASK__MODALITY = eINSTANCE.getGroupTask_Modality();

		/**
		 * The meta object literal for the '<em><b>EGL Tool</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_TASK__EGL_TOOL = eINSTANCE.getGroupTask_EGL_Tool();

		/**
		 * The meta object literal for the '<em><b>EGL Transformation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_TASK__EGL_TRANSFORMATION = eINSTANCE.getGroupTask_EGL_Transformation();

		/**
		 * The meta object literal for the '{@link lciat.impl.AbstractTaskImpl <em>Abstract Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.AbstractTaskImpl
		 * @see lciat.impl.LciatPackageImpl#getAbstractTask()
		 * @generated
		 */
		EClass ABSTRACT_TASK = eINSTANCE.getAbstractTask();

		/**
		 * The meta object literal for the '<em><b>Task Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TASK__TASK_ROLES = eINSTANCE.getAbstractTask_TaskRoles();

		/**
		 * The meta object literal for the '<em><b>Task Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TASK__TASK_OBJECTS = eINSTANCE.getAbstractTask_TaskObjects();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TASK__SUBTYPE = eINSTANCE.getAbstractTask_Subtype();

		/**
		 * The meta object literal for the '<em><b>Modality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TASK__MODALITY = eINSTANCE.getAbstractTask_Modality();

		/**
		 * The meta object literal for the '{@link lciat.impl.DetailedAbstractTaskImpl <em>Detailed Abstract Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.DetailedAbstractTaskImpl
		 * @see lciat.impl.LciatPackageImpl#getDetailedAbstractTask()
		 * @generated
		 */
		EClass DETAILED_ABSTRACT_TASK = eINSTANCE.getDetailedAbstractTask();

		/**
		 * The meta object literal for the '<em><b>Learning Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DETAILED_ABSTRACT_TASK__LEARNING_NODES = eINSTANCE.getDetailedAbstractTask_LearningNodes();

		/**
		 * The meta object literal for the '{@link lciat.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.ObjectImpl
		 * @see lciat.impl.LciatPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__NAME = eINSTANCE.getObject_Name();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__OBJECT = eINSTANCE.getObject_Object();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__MODIFIER = eINSTANCE.getObject_Modifier();

		/**
		 * The meta object literal for the '<em><b>Modified By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__MODIFIED_BY = eINSTANCE.getObject_ModifiedBy();

		/**
		 * The meta object literal for the '{@link lciat.impl.TemporalConditionImpl <em>Temporal Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.TemporalConditionImpl
		 * @see lciat.impl.LciatPackageImpl#getTemporalCondition()
		 * @generated
		 */
		EClass TEMPORAL_CONDITION = eINSTANCE.getTemporalCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_CONDITION__NAME = eINSTANCE.getTemporalCondition_Name();

		/**
		 * The meta object literal for the '{@link lciat.impl.NotificationImpl <em>Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.NotificationImpl
		 * @see lciat.impl.LciatPackageImpl#getNotification()
		 * @generated
		 */
		EClass NOTIFICATION = eINSTANCE.getNotification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION__NAME = eINSTANCE.getNotification_Name();

		/**
		 * The meta object literal for the '{@link lciat.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.ConditionImpl
		 * @see lciat.impl.LciatPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NAME = eINSTANCE.getCondition_Name();

		/**
		 * The meta object literal for the '{@link lciat.impl.SubtypeImpl <em>Subtype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.SubtypeImpl
		 * @see lciat.impl.LciatPackageImpl#getSubtype()
		 * @generated
		 */
		EClass SUBTYPE = eINSTANCE.getSubtype();

		/**
		 * The meta object literal for the '{@link lciat.impl.AssimilativeImpl <em>Assimilative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.AssimilativeImpl
		 * @see lciat.impl.LciatPackageImpl#getAssimilative()
		 * @generated
		 */
		EClass ASSIMILATIVE = eINSTANCE.getAssimilative();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIMILATIVE__NAME = eINSTANCE.getAssimilative_Name();

		/**
		 * The meta object literal for the '{@link lciat.impl.InformationHandlingImpl <em>Information Handling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.InformationHandlingImpl
		 * @see lciat.impl.LciatPackageImpl#getInformationHandling()
		 * @generated
		 */
		EClass INFORMATION_HANDLING = eINSTANCE.getInformationHandling();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_HANDLING__NAME = eINSTANCE.getInformationHandling_Name();

		/**
		 * The meta object literal for the '{@link lciat.impl.AdaptiveImpl <em>Adaptive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.AdaptiveImpl
		 * @see lciat.impl.LciatPackageImpl#getAdaptive()
		 * @generated
		 */
		EClass ADAPTIVE = eINSTANCE.getAdaptive();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTIVE__NAME = eINSTANCE.getAdaptive_Name();

		/**
		 * The meta object literal for the '{@link lciat.impl.CommunicativeImpl <em>Communicative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.CommunicativeImpl
		 * @see lciat.impl.LciatPackageImpl#getCommunicative()
		 * @generated
		 */
		EClass COMMUNICATIVE = eINSTANCE.getCommunicative();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATIVE__NAME = eINSTANCE.getCommunicative_Name();

		/**
		 * The meta object literal for the '{@link lciat.impl.ProductiveImpl <em>Productive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.ProductiveImpl
		 * @see lciat.impl.LciatPackageImpl#getProductive()
		 * @generated
		 */
		EClass PRODUCTIVE = eINSTANCE.getProductive();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTIVE__NAME = eINSTANCE.getProductive_Name();

		/**
		 * The meta object literal for the '{@link lciat.impl.ExperientialImpl <em>Experiential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.ExperientialImpl
		 * @see lciat.impl.LciatPackageImpl#getExperiential()
		 * @generated
		 */
		EClass EXPERIENTIAL = eINSTANCE.getExperiential();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIENTIAL__NAME = eINSTANCE.getExperiential_Name();

		/**
		 * The meta object literal for the '{@link lciat.impl.EvaluativeImpl <em>Evaluative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.EvaluativeImpl
		 * @see lciat.impl.LciatPackageImpl#getEvaluative()
		 * @generated
		 */
		EClass EVALUATIVE = eINSTANCE.getEvaluative();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATIVE__NAME = eINSTANCE.getEvaluative_Name();

		/**
		 * The meta object literal for the '{@link lciat.impl.SupportImpl <em>Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.SupportImpl
		 * @see lciat.impl.LciatPackageImpl#getSupport()
		 * @generated
		 */
		EClass SUPPORT = eINSTANCE.getSupport();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORT__NAME = eINSTANCE.getSupport_Name();

		/**
		 * The meta object literal for the '{@link lciat.impl.ModalityImpl <em>Modality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.ModalityImpl
		 * @see lciat.impl.LciatPackageImpl#getModality()
		 * @generated
		 */
		EClass MODALITY = eINSTANCE.getModality();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODALITY__NAME = eINSTANCE.getModality_Name();

		/**
		 * The meta object literal for the '{@link lciat.impl.FaceToFaceImpl <em>Face To Face</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.FaceToFaceImpl
		 * @see lciat.impl.LciatPackageImpl#getFaceToFace()
		 * @generated
		 */
		EClass FACE_TO_FACE = eINSTANCE.getFaceToFace();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACE_TO_FACE__KIND = eINSTANCE.getFaceToFace_Kind();

		/**
		 * The meta object literal for the '{@link lciat.impl.ComputerSupportedImpl <em>Computer Supported</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.ComputerSupportedImpl
		 * @see lciat.impl.LciatPackageImpl#getComputerSupported()
		 * @generated
		 */
		EClass COMPUTER_SUPPORTED = eINSTANCE.getComputerSupported();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTER_SUPPORTED__KIND = eINSTANCE.getComputerSupported_Kind();

		/**
		 * The meta object literal for the '{@link lciat.impl.OnlineImpl <em>Online</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.OnlineImpl
		 * @see lciat.impl.LciatPackageImpl#getOnline()
		 * @generated
		 */
		EClass ONLINE = eINSTANCE.getOnline();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE__KIND = eINSTANCE.getOnline_Kind();

		/**
		 * The meta object literal for the '{@link lciat.impl.LearningLinkImpl <em>Learning Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.LearningLinkImpl
		 * @see lciat.impl.LciatPackageImpl#getLearningLink()
		 * @generated
		 */
		EClass LEARNING_LINK = eINSTANCE.getLearningLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_LINK__SOURCE = eINSTANCE.getLearningLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_LINK__TARGET = eINSTANCE.getLearningLink_Target();

		/**
		 * The meta object literal for the '{@link lciat.impl.EnablingWOInformationImpl <em>Enabling WO Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.EnablingWOInformationImpl
		 * @see lciat.impl.LciatPackageImpl#getEnablingWOInformation()
		 * @generated
		 */
		EClass ENABLING_WO_INFORMATION = eINSTANCE.getEnablingWOInformation();

		/**
		 * The meta object literal for the '<em><b>ELabel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLING_WO_INFORMATION__ELABEL = eINSTANCE.getEnablingWOInformation_ELabel();

		/**
		 * The meta object literal for the '{@link lciat.impl.EnablingWInformationImpl <em>Enabling WInformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.EnablingWInformationImpl
		 * @see lciat.impl.LciatPackageImpl#getEnablingWInformation()
		 * @generated
		 */
		EClass ENABLING_WINFORMATION = eINSTANCE.getEnablingWInformation();

		/**
		 * The meta object literal for the '<em><b>Ew Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLING_WINFORMATION__EW_LABEL = eINSTANCE.getEnablingWInformation_EwLabel();

		/**
		 * The meta object literal for the '{@link lciat.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.ChoiceImpl
		 * @see lciat.impl.LciatPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '<em><b>Dt Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__DT_LABEL = eINSTANCE.getChoice_DtLabel();

		/**
		 * The meta object literal for the '{@link lciat.impl.ConcurrencyImpl <em>Concurrency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.ConcurrencyImpl
		 * @see lciat.impl.LciatPackageImpl#getConcurrency()
		 * @generated
		 */
		EClass CONCURRENCY = eINSTANCE.getConcurrency();

		/**
		 * The meta object literal for the '<em><b>Ic Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCURRENCY__IC_LABEL = eINSTANCE.getConcurrency_IcLabel();

		/**
		 * The meta object literal for the '{@link lciat.impl.ToolImpl <em>Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.ToolImpl
		 * @see lciat.impl.LciatPackageImpl#getTool()
		 * @generated
		 */
		EClass TOOL = eINSTANCE.getTool();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__KIND = eINSTANCE.getTool_Kind();

		/**
		 * The meta object literal for the '<em><b>Chat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL__CHAT = eINSTANCE.getTool_Chat();

		/**
		 * The meta object literal for the '<em><b>Session Panel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL__SESSION_PANEL = eINSTANCE.getTool_SessionPanel();

		/**
		 * The meta object literal for the '{@link lciat.impl.GraphicalEditorImpl <em>Graphical Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.GraphicalEditorImpl
		 * @see lciat.impl.LciatPackageImpl#getGraphicalEditor()
		 * @generated
		 */
		EClass GRAPHICAL_EDITOR = eINSTANCE.getGraphicalEditor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICAL_EDITOR__NAME = eINSTANCE.getGraphicalEditor_Name();

		/**
		 * The meta object literal for the '<em><b>Turn Taking Tool</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHICAL_EDITOR__TURN_TAKING_TOOL = eINSTANCE.getGraphicalEditor_TurnTakingTool();

		/**
		 * The meta object literal for the '<em><b>Telepointer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHICAL_EDITOR__TELEPOINTER = eINSTANCE.getGraphicalEditor_Telepointer();

		/**
		 * The meta object literal for the '<em><b>Radar View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHICAL_EDITOR__RADAR_VIEW = eINSTANCE.getGraphicalEditor_RadarView();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHICAL_EDITOR__PROPERTIES = eINSTANCE.getGraphicalEditor_Properties();

		/**
		 * The meta object literal for the '<em><b>Problems</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHICAL_EDITOR__PROBLEMS = eINSTANCE.getGraphicalEditor_Problems();

		/**
		 * The meta object literal for the '{@link lciat.impl.TextEditorImpl <em>Text Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.TextEditorImpl
		 * @see lciat.impl.LciatPackageImpl#getTextEditor()
		 * @generated
		 */
		EClass TEXT_EDITOR = eINSTANCE.getTextEditor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_EDITOR__NAME = eINSTANCE.getTextEditor_Name();

		/**
		 * The meta object literal for the '<em><b>Turn Taking Tool</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_EDITOR__TURN_TAKING_TOOL = eINSTANCE.getTextEditor_TurnTakingTool();

		/**
		 * The meta object literal for the '<em><b>Radar View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_EDITOR__RADAR_VIEW = eINSTANCE.getTextEditor_RadarView();

		/**
		 * The meta object literal for the '<em><b>Console</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_EDITOR__CONSOLE = eINSTANCE.getTextEditor_Console();

		/**
		 * The meta object literal for the '<em><b>Problems</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_EDITOR__PROBLEMS = eINSTANCE.getTextEditor_Problems();

		/**
		 * The meta object literal for the '{@link lciat.impl.CodeEditorImpl <em>Code Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.CodeEditorImpl
		 * @see lciat.impl.LciatPackageImpl#getCodeEditor()
		 * @generated
		 */
		EClass CODE_EDITOR = eINSTANCE.getCodeEditor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_EDITOR__NAME = eINSTANCE.getCodeEditor_Name();

		/**
		 * The meta object literal for the '<em><b>Turn Taking Tool</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_EDITOR__TURN_TAKING_TOOL = eINSTANCE.getCodeEditor_TurnTakingTool();

		/**
		 * The meta object literal for the '<em><b>Radar View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_EDITOR__RADAR_VIEW = eINSTANCE.getCodeEditor_RadarView();

		/**
		 * The meta object literal for the '<em><b>Console</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_EDITOR__CONSOLE = eINSTANCE.getCodeEditor_Console();

		/**
		 * The meta object literal for the '<em><b>Problems</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_EDITOR__PROBLEMS = eINSTANCE.getCodeEditor_Problems();

		/**
		 * The meta object literal for the '{@link lciat.impl.WebViewerImpl <em>Web Viewer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.WebViewerImpl
		 * @see lciat.impl.LciatPackageImpl#getWebViewer()
		 * @generated
		 */
		EClass WEB_VIEWER = eINSTANCE.getWebViewer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_VIEWER__NAME = eINSTANCE.getWebViewer_Name();

		/**
		 * The meta object literal for the '{@link lciat.impl.AwarenessImpl <em>Awareness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.AwarenessImpl
		 * @see lciat.impl.LciatPackageImpl#getAwareness()
		 * @generated
		 */
		EClass AWARENESS = eINSTANCE.getAwareness();

		/**
		 * The meta object literal for the '{@link lciat.impl.SessionPanelImpl <em>Session Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.SessionPanelImpl
		 * @see lciat.impl.LciatPackageImpl#getSessionPanel()
		 * @generated
		 */
		EClass SESSION_PANEL = eINSTANCE.getSessionPanel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_PANEL__NAME = eINSTANCE.getSessionPanel_Name();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_PANEL__POSITION = eINSTANCE.getSessionPanel_Position();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_PANEL__LANGUAGE = eINSTANCE.getSessionPanel_Language();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_PANEL__SIZE = eINSTANCE.getSessionPanel_Size();

		/**
		 * The meta object literal for the '{@link lciat.impl.ChatImpl <em>Chat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.ChatImpl
		 * @see lciat.impl.LciatPackageImpl#getChat()
		 * @generated
		 */
		EClass CHAT = eINSTANCE.getChat();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAT__NAME = eINSTANCE.getChat_Name();

		/**
		 * The meta object literal for the '<em><b>Is Structured</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAT__IS_STRUCTURED = eINSTANCE.getChat_IsStructured();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAT__POSITION = eINSTANCE.getChat_Position();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAT__LANGUAGE = eINSTANCE.getChat_Language();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAT__SIZE = eINSTANCE.getChat_Size();

		/**
		 * The meta object literal for the '{@link lciat.impl.TurnTakingToolImpl <em>Turn Taking Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.TurnTakingToolImpl
		 * @see lciat.impl.LciatPackageImpl#getTurnTakingTool()
		 * @generated
		 */
		EClass TURN_TAKING_TOOL = eINSTANCE.getTurnTakingTool();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN_TAKING_TOOL__NAME = eINSTANCE.getTurnTakingTool_Name();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN_TAKING_TOOL__POSITION = eINSTANCE.getTurnTakingTool_Position();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN_TAKING_TOOL__LANGUAGE = eINSTANCE.getTurnTakingTool_Language();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN_TAKING_TOOL__SIZE = eINSTANCE.getTurnTakingTool_Size();

		/**
		 * The meta object literal for the '{@link lciat.impl.TelepointerImpl <em>Telepointer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.TelepointerImpl
		 * @see lciat.impl.LciatPackageImpl#getTelepointer()
		 * @generated
		 */
		EClass TELEPOINTER = eINSTANCE.getTelepointer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEPOINTER__NAME = eINSTANCE.getTelepointer_Name();

		/**
		 * The meta object literal for the '{@link lciat.impl.RadarViewImpl <em>Radar View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.RadarViewImpl
		 * @see lciat.impl.LciatPackageImpl#getRadarView()
		 * @generated
		 */
		EClass RADAR_VIEW = eINSTANCE.getRadarView();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADAR_VIEW__NAME = eINSTANCE.getRadarView_Name();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADAR_VIEW__POSITION = eINSTANCE.getRadarView_Position();

		/**
		 * The meta object literal for the '{@link lciat.impl.PropertiesImpl <em>Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.PropertiesImpl
		 * @see lciat.impl.LciatPackageImpl#getProperties()
		 * @generated
		 */
		EClass PROPERTIES = eINSTANCE.getProperties();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__NAME = eINSTANCE.getProperties_Name();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__POSITION = eINSTANCE.getProperties_Position();

		/**
		 * The meta object literal for the '{@link lciat.impl.ConsoleImpl <em>Console</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.ConsoleImpl
		 * @see lciat.impl.LciatPackageImpl#getConsole()
		 * @generated
		 */
		EClass CONSOLE = eINSTANCE.getConsole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSOLE__NAME = eINSTANCE.getConsole_Name();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSOLE__POSITION = eINSTANCE.getConsole_Position();

		/**
		 * The meta object literal for the '{@link lciat.impl.ProblemsImpl <em>Problems</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.ProblemsImpl
		 * @see lciat.impl.LciatPackageImpl#getProblems()
		 * @generated
		 */
		EClass PROBLEMS = eINSTANCE.getProblems();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEMS__NAME = eINSTANCE.getProblems_Name();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEMS__POSITION = eINSTANCE.getProblems_Position();

		/**
		 * The meta object literal for the '{@link lciat.impl.TraceabilityImpl <em>Traceability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.TraceabilityImpl
		 * @see lciat.impl.LciatPackageImpl#getTraceability()
		 * @generated
		 */
		EClass TRACEABILITY = eINSTANCE.getTraceability();

		/**
		 * The meta object literal for the '<em><b>Awarelement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABILITY__AWARELEMENT = eINSTANCE.getTraceability_Awarelement();

		/**
		 * The meta object literal for the '<em><b>Toolelement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABILITY__TOOLELEMENT = eINSTANCE.getTraceability_Toolelement();

		/**
		 * The meta object literal for the '{@link lciat.impl.CTTDiagramImpl <em>CTT Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.CTTDiagramImpl
		 * @see lciat.impl.LciatPackageImpl#getCTTDiagram()
		 * @generated
		 */
		EClass CTT_DIAGRAM = eINSTANCE.getCTTDiagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTT_DIAGRAM__NAME = eINSTANCE.getCTTDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Molef Ctt Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTT_DIAGRAM__MOLEF_CTT_NODES = eINSTANCE.getCTTDiagram_MolefCttNodes();

		/**
		 * The meta object literal for the '<em><b>Ctt Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTT_DIAGRAM__CTT_TASKS = eINSTANCE.getCTTDiagram_CttTasks();

		/**
		 * The meta object literal for the '<em><b>Mf Ctt Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTT_DIAGRAM__MF_CTT_NODES = eINSTANCE.getCTTDiagram_MfCttNodes();

		/**
		 * The meta object literal for the '{@link lciat.impl.CTTTaskImpl <em>CTT Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.CTTTaskImpl
		 * @see lciat.impl.LciatPackageImpl#getCTTTask()
		 * @generated
		 */
		EClass CTT_TASK = eINSTANCE.getCTTTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTT_TASK__NAME = eINSTANCE.getCTTTask_Name();

		/**
		 * The meta object literal for the '<em><b>Ctt Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTT_TASK__CTT_LINKS = eINSTANCE.getCTTTask_CttLinks();

		/**
		 * The meta object literal for the '{@link lciat.impl.ExclusiveEditionImpl <em>Exclusive Edition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.ExclusiveEditionImpl
		 * @see lciat.impl.LciatPackageImpl#getExclusiveEdition()
		 * @generated
		 */
		EClass EXCLUSIVE_EDITION = eINSTANCE.getExclusiveEdition();

		/**
		 * The meta object literal for the '{@link lciat.impl.CollaborativeVisualizationImpl <em>Collaborative Visualization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.CollaborativeVisualizationImpl
		 * @see lciat.impl.LciatPackageImpl#getCollaborativeVisualization()
		 * @generated
		 */
		EClass COLLABORATIVE_VISUALIZATION = eINSTANCE.getCollaborativeVisualization();

		/**
		 * The meta object literal for the '{@link lciat.impl.IndividualVisualizationImpl <em>Individual Visualization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.IndividualVisualizationImpl
		 * @see lciat.impl.LciatPackageImpl#getIndividualVisualization()
		 * @generated
		 */
		EClass INDIVIDUAL_VISUALIZATION = eINSTANCE.getIndividualVisualization();

		/**
		 * The meta object literal for the '{@link lciat.impl.UserTaskImpl <em>User Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.UserTaskImpl
		 * @see lciat.impl.LciatPackageImpl#getUserTask()
		 * @generated
		 */
		EClass USER_TASK = eINSTANCE.getUserTask();

		/**
		 * The meta object literal for the '{@link lciat.impl.CTTAbstractTaskImpl <em>CTT Abstract Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.CTTAbstractTaskImpl
		 * @see lciat.impl.LciatPackageImpl#getCTTAbstractTask()
		 * @generated
		 */
		EClass CTT_ABSTRACT_TASK = eINSTANCE.getCTTAbstractTask();

		/**
		 * The meta object literal for the '{@link lciat.impl.InteractiveTaskImpl <em>Interactive Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.InteractiveTaskImpl
		 * @see lciat.impl.LciatPackageImpl#getInteractiveTask()
		 * @generated
		 */
		EClass INTERACTIVE_TASK = eINSTANCE.getInteractiveTask();

		/**
		 * The meta object literal for the '{@link lciat.impl.CTTCollaborativeTaskImpl <em>CTT Collaborative Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.CTTCollaborativeTaskImpl
		 * @see lciat.impl.LciatPackageImpl#getCTTCollaborativeTask()
		 * @generated
		 */
		EClass CTT_COLLABORATIVE_TASK = eINSTANCE.getCTTCollaborativeTask();

		/**
		 * The meta object literal for the '{@link lciat.impl.ApplicationTaskImpl <em>Application Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.ApplicationTaskImpl
		 * @see lciat.impl.LciatPackageImpl#getApplicationTask()
		 * @generated
		 */
		EClass APPLICATION_TASK = eINSTANCE.getApplicationTask();

		/**
		 * The meta object literal for the '{@link lciat.impl.CTTLinkImpl <em>CTT Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.CTTLinkImpl
		 * @see lciat.impl.LciatPackageImpl#getCTTLink()
		 * @generated
		 */
		EClass CTT_LINK = eINSTANCE.getCTTLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTT_LINK__SOURCE = eINSTANCE.getCTTLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTT_LINK__TARGET = eINSTANCE.getCTTLink_Target();

		/**
		 * The meta object literal for the '{@link lciat.impl.AggregationImpl <em>Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.AggregationImpl
		 * @see lciat.impl.LciatPackageImpl#getAggregation()
		 * @generated
		 */
		EClass AGGREGATION = eINSTANCE.getAggregation();

		/**
		 * The meta object literal for the '{@link lciat.impl.EnablingImpl <em>Enabling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.EnablingImpl
		 * @see lciat.impl.LciatPackageImpl#getEnabling()
		 * @generated
		 */
		EClass ENABLING = eINSTANCE.getEnabling();

		/**
		 * The meta object literal for the '<em><b>ELabel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLING__ELABEL = eINSTANCE.getEnabling_ELabel();

		/**
		 * The meta object literal for the '{@link lciat.impl.DisablingImpl <em>Disabling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.DisablingImpl
		 * @see lciat.impl.LciatPackageImpl#getDisabling()
		 * @generated
		 */
		EClass DISABLING = eINSTANCE.getDisabling();

		/**
		 * The meta object literal for the '<em><b>DLabel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISABLING__DLABEL = eINSTANCE.getDisabling_DLabel();

		/**
		 * The meta object literal for the '{@link lciat.impl.EnablingWithInformationPassingImpl <em>Enabling With Information Passing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.EnablingWithInformationPassingImpl
		 * @see lciat.impl.LciatPackageImpl#getEnablingWithInformationPassing()
		 * @generated
		 */
		EClass ENABLING_WITH_INFORMATION_PASSING = eINSTANCE.getEnablingWithInformationPassing();

		/**
		 * The meta object literal for the '<em><b>Ew Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLING_WITH_INFORMATION_PASSING__EW_LABEL = eINSTANCE.getEnablingWithInformationPassing_EwLabel();

		/**
		 * The meta object literal for the '{@link lciat.impl.DisablingWithInformationPassingImpl <em>Disabling With Information Passing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.DisablingWithInformationPassingImpl
		 * @see lciat.impl.LciatPackageImpl#getDisablingWithInformationPassing()
		 * @generated
		 */
		EClass DISABLING_WITH_INFORMATION_PASSING = eINSTANCE.getDisablingWithInformationPassing();

		/**
		 * The meta object literal for the '<em><b>Dw Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISABLING_WITH_INFORMATION_PASSING__DW_LABEL = eINSTANCE.getDisablingWithInformationPassing_DwLabel();

		/**
		 * The meta object literal for the '{@link lciat.impl.IndependentConcurrencyImpl <em>Independent Concurrency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.IndependentConcurrencyImpl
		 * @see lciat.impl.LciatPackageImpl#getIndependentConcurrency()
		 * @generated
		 */
		EClass INDEPENDENT_CONCURRENCY = eINSTANCE.getIndependentConcurrency();

		/**
		 * The meta object literal for the '<em><b>Ic Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEPENDENT_CONCURRENCY__IC_LABEL = eINSTANCE.getIndependentConcurrency_IcLabel();

		/**
		 * The meta object literal for the '{@link lciat.impl.OrderIndependenceImpl <em>Order Independence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.OrderIndependenceImpl
		 * @see lciat.impl.LciatPackageImpl#getOrderIndependence()
		 * @generated
		 */
		EClass ORDER_INDEPENDENCE = eINSTANCE.getOrderIndependence();

		/**
		 * The meta object literal for the '<em><b>Oi Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_INDEPENDENCE__OI_LABEL = eINSTANCE.getOrderIndependence_OiLabel();

		/**
		 * The meta object literal for the '{@link lciat.impl.SuspendResumeImpl <em>Suspend Resume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.SuspendResumeImpl
		 * @see lciat.impl.LciatPackageImpl#getSuspendResume()
		 * @generated
		 */
		EClass SUSPEND_RESUME = eINSTANCE.getSuspendResume();

		/**
		 * The meta object literal for the '<em><b>Sr Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUSPEND_RESUME__SR_LABEL = eINSTANCE.getSuspendResume_SrLabel();

		/**
		 * The meta object literal for the '{@link lciat.impl.ConcurrencyWithInformationPassingImpl <em>Concurrency With Information Passing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.ConcurrencyWithInformationPassingImpl
		 * @see lciat.impl.LciatPackageImpl#getConcurrencyWithInformationPassing()
		 * @generated
		 */
		EClass CONCURRENCY_WITH_INFORMATION_PASSING = eINSTANCE.getConcurrencyWithInformationPassing();

		/**
		 * The meta object literal for the '<em><b>CLabel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCURRENCY_WITH_INFORMATION_PASSING__CLABEL = eINSTANCE.getConcurrencyWithInformationPassing_CLabel();

		/**
		 * The meta object literal for the '{@link lciat.impl.DeterministicChoiceImpl <em>Deterministic Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.DeterministicChoiceImpl
		 * @see lciat.impl.LciatPackageImpl#getDeterministicChoice()
		 * @generated
		 */
		EClass DETERMINISTIC_CHOICE = eINSTANCE.getDeterministicChoice();

		/**
		 * The meta object literal for the '<em><b>Dt Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETERMINISTIC_CHOICE__DT_LABEL = eINSTANCE.getDeterministicChoice_DtLabel();

		/**
		 * The meta object literal for the '{@link lciat.impl.UndeterministicChoiceImpl <em>Undeterministic Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.UndeterministicChoiceImpl
		 * @see lciat.impl.LciatPackageImpl#getUndeterministicChoice()
		 * @generated
		 */
		EClass UNDETERMINISTIC_CHOICE = eINSTANCE.getUndeterministicChoice();

		/**
		 * The meta object literal for the '<em><b>Uc Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNDETERMINISTIC_CHOICE__UC_LABEL = eINSTANCE.getUndeterministicChoice_UcLabel();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefNodeImpl <em>Molef Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefNodeImpl
		 * @see lciat.impl.LciatPackageImpl#getMolefNode()
		 * @generated
		 */
		EClass MOLEF_NODE = eINSTANCE.getMolefNode();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefContentNodeImpl <em>Molef Content Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefContentNodeImpl
		 * @see lciat.impl.LciatPackageImpl#getMolefContentNode()
		 * @generated
		 */
		EClass MOLEF_CONTENT_NODE = eINSTANCE.getMolefContentNode();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefLearningNodeImpl <em>Molef Learning Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefLearningNodeImpl
		 * @see lciat.impl.LciatPackageImpl#getMolefLearningNode()
		 * @generated
		 */
		EClass MOLEF_LEARNING_NODE = eINSTANCE.getMolefLearningNode();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefCttNodeImpl <em>Molef Ctt Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefCttNodeImpl
		 * @see lciat.impl.LciatPackageImpl#getMolefCttNode()
		 * @generated
		 */
		EClass MOLEF_CTT_NODE = eINSTANCE.getMolefCttNode();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefContent1Impl <em>Molef Content1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefContent1Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefContent1()
		 * @generated
		 */
		EClass MOLEF_CONTENT1 = eINSTANCE.getMolefContent1();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_CONTENT1__CHARACTERISTIC = eINSTANCE.getMolefContent1_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefContent2Impl <em>Molef Content2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefContent2Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefContent2()
		 * @generated
		 */
		EClass MOLEF_CONTENT2 = eINSTANCE.getMolefContent2();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_CONTENT2__CHARACTERISTIC = eINSTANCE.getMolefContent2_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefContent3Impl <em>Molef Content3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefContent3Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefContent3()
		 * @generated
		 */
		EClass MOLEF_CONTENT3 = eINSTANCE.getMolefContent3();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_CONTENT3__CHARACTERISTIC = eINSTANCE.getMolefContent3_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefContent4Impl <em>Molef Content4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefContent4Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefContent4()
		 * @generated
		 */
		EClass MOLEF_CONTENT4 = eINSTANCE.getMolefContent4();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_CONTENT4__CHARACTERISTIC = eINSTANCE.getMolefContent4_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefContent5Impl <em>Molef Content5</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefContent5Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefContent5()
		 * @generated
		 */
		EClass MOLEF_CONTENT5 = eINSTANCE.getMolefContent5();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_CONTENT5__CHARACTERISTIC = eINSTANCE.getMolefContent5_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefContent6Impl <em>Molef Content6</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefContent6Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefContent6()
		 * @generated
		 */
		EClass MOLEF_CONTENT6 = eINSTANCE.getMolefContent6();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_CONTENT6__CHARACTERISTIC = eINSTANCE.getMolefContent6_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefTaskAndActivitiesNodeImpl <em>Molef Task And Activities Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefTaskAndActivitiesNodeImpl
		 * @see lciat.impl.LciatPackageImpl#getMolefTaskAndActivitiesNode()
		 * @generated
		 */
		EClass MOLEF_TASK_AND_ACTIVITIES_NODE = eINSTANCE.getMolefTaskAndActivitiesNode();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefTActivities1Impl <em>Molef TActivities1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefTActivities1Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefTActivities1()
		 * @generated
		 */
		EClass MOLEF_TACTIVITIES1 = eINSTANCE.getMolefTActivities1();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_TACTIVITIES1__CHARACTERISTIC = eINSTANCE.getMolefTActivities1_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefTActivities2Impl <em>Molef TActivities2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefTActivities2Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefTActivities2()
		 * @generated
		 */
		EClass MOLEF_TACTIVITIES2 = eINSTANCE.getMolefTActivities2();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_TACTIVITIES2__CHARACTERISTIC = eINSTANCE.getMolefTActivities2_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefTActivities3Impl <em>Molef TActivities3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefTActivities3Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefTActivities3()
		 * @generated
		 */
		EClass MOLEF_TACTIVITIES3 = eINSTANCE.getMolefTActivities3();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_TACTIVITIES3__CHARACTERISTIC = eINSTANCE.getMolefTActivities3_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefTActivities4Impl <em>Molef TActivities4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefTActivities4Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefTActivities4()
		 * @generated
		 */
		EClass MOLEF_TACTIVITIES4 = eINSTANCE.getMolefTActivities4();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_TACTIVITIES4__CHARACTERISTIC = eINSTANCE.getMolefTActivities4_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefTActivities5Impl <em>Molef TActivities5</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefTActivities5Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefTActivities5()
		 * @generated
		 */
		EClass MOLEF_TACTIVITIES5 = eINSTANCE.getMolefTActivities5();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_TACTIVITIES5__CHARACTERISTIC = eINSTANCE.getMolefTActivities5_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefTActivities6Impl <em>Molef TActivities6</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefTActivities6Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefTActivities6()
		 * @generated
		 */
		EClass MOLEF_TACTIVITIES6 = eINSTANCE.getMolefTActivities6();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_TACTIVITIES6__CHARACTERISTIC = eINSTANCE.getMolefTActivities6_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefTActivities7Impl <em>Molef TActivities7</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefTActivities7Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefTActivities7()
		 * @generated
		 */
		EClass MOLEF_TACTIVITIES7 = eINSTANCE.getMolefTActivities7();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_TACTIVITIES7__CHARACTERISTIC = eINSTANCE.getMolefTActivities7_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefTActivities8Impl <em>Molef TActivities8</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefTActivities8Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefTActivities8()
		 * @generated
		 */
		EClass MOLEF_TACTIVITIES8 = eINSTANCE.getMolefTActivities8();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_TACTIVITIES8__CHARACTERISTIC = eINSTANCE.getMolefTActivities8_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefSocialNodeImpl <em>Molef Social Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefSocialNodeImpl
		 * @see lciat.impl.LciatPackageImpl#getMolefSocialNode()
		 * @generated
		 */
		EClass MOLEF_SOCIAL_NODE = eINSTANCE.getMolefSocialNode();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefSocial1Impl <em>Molef Social1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefSocial1Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefSocial1()
		 * @generated
		 */
		EClass MOLEF_SOCIAL1 = eINSTANCE.getMolefSocial1();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_SOCIAL1__CHARACTERISTIC = eINSTANCE.getMolefSocial1_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefSocial2Impl <em>Molef Social2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefSocial2Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefSocial2()
		 * @generated
		 */
		EClass MOLEF_SOCIAL2 = eINSTANCE.getMolefSocial2();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_SOCIAL2__CHARACTERISTIC = eINSTANCE.getMolefSocial2_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefSocial3Impl <em>Molef Social3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefSocial3Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefSocial3()
		 * @generated
		 */
		EClass MOLEF_SOCIAL3 = eINSTANCE.getMolefSocial3();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_SOCIAL3__CHARACTERISTIC = eINSTANCE.getMolefSocial3_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefSocial4Impl <em>Molef Social4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefSocial4Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefSocial4()
		 * @generated
		 */
		EClass MOLEF_SOCIAL4 = eINSTANCE.getMolefSocial4();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_SOCIAL4__CHARACTERISTIC = eINSTANCE.getMolefSocial4_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefPersonalizationNodeImpl <em>Molef Personalization Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefPersonalizationNodeImpl
		 * @see lciat.impl.LciatPackageImpl#getMolefPersonalizationNode()
		 * @generated
		 */
		EClass MOLEF_PERSONALIZATION_NODE = eINSTANCE.getMolefPersonalizationNode();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefPersonalization1Impl <em>Molef Personalization1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefPersonalization1Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefPersonalization1()
		 * @generated
		 */
		EClass MOLEF_PERSONALIZATION1 = eINSTANCE.getMolefPersonalization1();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_PERSONALIZATION1__CHARACTERISTIC = eINSTANCE.getMolefPersonalization1_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefPersonalization2Impl <em>Molef Personalization2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefPersonalization2Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefPersonalization2()
		 * @generated
		 */
		EClass MOLEF_PERSONALIZATION2 = eINSTANCE.getMolefPersonalization2();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_PERSONALIZATION2__CHARACTERISTIC = eINSTANCE.getMolefPersonalization2_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefPersonalization3Impl <em>Molef Personalization3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefPersonalization3Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefPersonalization3()
		 * @generated
		 */
		EClass MOLEF_PERSONALIZATION3 = eINSTANCE.getMolefPersonalization3();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_PERSONALIZATION3__CHARACTERISTIC = eINSTANCE.getMolefPersonalization3_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefPersonalization4Impl <em>Molef Personalization4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefPersonalization4Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefPersonalization4()
		 * @generated
		 */
		EClass MOLEF_PERSONALIZATION4 = eINSTANCE.getMolefPersonalization4();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_PERSONALIZATION4__CHARACTERISTIC = eINSTANCE.getMolefPersonalization4_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefPersonalization5Impl <em>Molef Personalization5</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefPersonalization5Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefPersonalization5()
		 * @generated
		 */
		EClass MOLEF_PERSONALIZATION5 = eINSTANCE.getMolefPersonalization5();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_PERSONALIZATION5__CHARACTERISTIC = eINSTANCE.getMolefPersonalization5_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefMultimediaNodeImpl <em>Molef Multimedia Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefMultimediaNodeImpl
		 * @see lciat.impl.LciatPackageImpl#getMolefMultimediaNode()
		 * @generated
		 */
		EClass MOLEF_MULTIMEDIA_NODE = eINSTANCE.getMolefMultimediaNode();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefMultimedia1Impl <em>Molef Multimedia1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefMultimedia1Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefMultimedia1()
		 * @generated
		 */
		EClass MOLEF_MULTIMEDIA1 = eINSTANCE.getMolefMultimedia1();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_MULTIMEDIA1__CHARACTERISTIC = eINSTANCE.getMolefMultimedia1_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefMultimedia2Impl <em>Molef Multimedia2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefMultimedia2Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefMultimedia2()
		 * @generated
		 */
		EClass MOLEF_MULTIMEDIA2 = eINSTANCE.getMolefMultimedia2();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_MULTIMEDIA2__CHARACTERISTIC = eINSTANCE.getMolefMultimedia2_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefMultimedia3Impl <em>Molef Multimedia3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefMultimedia3Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefMultimedia3()
		 * @generated
		 */
		EClass MOLEF_MULTIMEDIA3 = eINSTANCE.getMolefMultimedia3();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_MULTIMEDIA3__CHARACTERISTIC = eINSTANCE.getMolefMultimedia3_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefMultimedia4Impl <em>Molef Multimedia4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefMultimedia4Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefMultimedia4()
		 * @generated
		 */
		EClass MOLEF_MULTIMEDIA4 = eINSTANCE.getMolefMultimedia4();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_MULTIMEDIA4__CHARACTERISTIC = eINSTANCE.getMolefMultimedia4_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefMultimedia5Impl <em>Molef Multimedia5</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefMultimedia5Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefMultimedia5()
		 * @generated
		 */
		EClass MOLEF_MULTIMEDIA5 = eINSTANCE.getMolefMultimedia5();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_MULTIMEDIA5__CHARACTERISTIC = eINSTANCE.getMolefMultimedia5_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefMultimedia6Impl <em>Molef Multimedia6</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefMultimedia6Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefMultimedia6()
		 * @generated
		 */
		EClass MOLEF_MULTIMEDIA6 = eINSTANCE.getMolefMultimedia6();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_MULTIMEDIA6__CHARACTERISTIC = eINSTANCE.getMolefMultimedia6_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.impl.MolefMultimedia7Impl <em>Molef Multimedia7</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.impl.MolefMultimedia7Impl
		 * @see lciat.impl.LciatPackageImpl#getMolefMultimedia7()
		 * @generated
		 */
		EClass MOLEF_MULTIMEDIA7 = eINSTANCE.getMolefMultimedia7();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLEF_MULTIMEDIA7__CHARACTERISTIC = eINSTANCE.getMolefMultimedia7_Characteristic();

		/**
		 * The meta object literal for the '{@link lciat.Subtypes <em>Subtypes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.Subtypes
		 * @see lciat.impl.LciatPackageImpl#getSubtypes()
		 * @generated
		 */
		EEnum SUBTYPES = eINSTANCE.getSubtypes();

		/**
		 * The meta object literal for the '{@link lciat.Modalities <em>Modalities</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.Modalities
		 * @see lciat.impl.LciatPackageImpl#getModalities()
		 * @generated
		 */
		EEnum MODALITIES = eINSTANCE.getModalities();

		/**
		 * The meta object literal for the '{@link lciat.Position <em>Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.Position
		 * @see lciat.impl.LciatPackageImpl#getPosition()
		 * @generated
		 */
		EEnum POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '{@link lciat.Language <em>Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.Language
		 * @see lciat.impl.LciatPackageImpl#getLanguage()
		 * @generated
		 */
		EEnum LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '{@link lciat.Size <em>Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lciat.Size
		 * @see lciat.impl.LciatPackageImpl#getSize()
		 * @generated
		 */
		EEnum SIZE = eINSTANCE.getSize();

	}

} //LciatPackage
