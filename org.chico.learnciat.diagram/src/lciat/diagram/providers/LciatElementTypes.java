/*
 * 
 */
package lciat.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import lciat.LciatPackage;
import lciat.diagram.edit.parts.*;
import lciat.diagram.part.LciatDiagramEditorPlugin;

/**
 * @generated
 */
public class LciatElementTypes {

	/**
	* @generated
	*/
	private LciatElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			LciatDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType LCIANDiagram_1000 = getElementType(
			"org.chico.learnciat.diagram.LCIANDiagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Sociogram_2001 = getElementType("org.chico.learnciat.diagram.Sociogram_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LearningDiagram_2002 = getElementType(
			"org.chico.learnciat.diagram.LearningDiagram_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CTTDiagram_2003 = getElementType("org.chico.learnciat.diagram.CTTDiagram_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Rol_3001 = getElementType("org.chico.learnciat.diagram.Rol_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Group_3002 = getElementType("org.chico.learnciat.diagram.Group_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefContent1_3003 = getElementType(
			"org.chico.learnciat.diagram.MolefContent1_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefContent2_3004 = getElementType(
			"org.chico.learnciat.diagram.MolefContent2_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefContent3_3005 = getElementType(
			"org.chico.learnciat.diagram.MolefContent3_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefContent4_3006 = getElementType(
			"org.chico.learnciat.diagram.MolefContent4_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefContent5_3007 = getElementType(
			"org.chico.learnciat.diagram.MolefContent5_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefContent6_3008 = getElementType(
			"org.chico.learnciat.diagram.MolefContent6_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefTActivities1_3009 = getElementType(
			"org.chico.learnciat.diagram.MolefTActivities1_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefTActivities2_3010 = getElementType(
			"org.chico.learnciat.diagram.MolefTActivities2_3010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefTActivities3_3011 = getElementType(
			"org.chico.learnciat.diagram.MolefTActivities3_3011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefTActivities4_3012 = getElementType(
			"org.chico.learnciat.diagram.MolefTActivities4_3012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefTActivities5_3013 = getElementType(
			"org.chico.learnciat.diagram.MolefTActivities5_3013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefTActivities6_3014 = getElementType(
			"org.chico.learnciat.diagram.MolefTActivities6_3014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefTActivities7_3015 = getElementType(
			"org.chico.learnciat.diagram.MolefTActivities7_3015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefTActivities8_3016 = getElementType(
			"org.chico.learnciat.diagram.MolefTActivities8_3016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefSocial1_3017 = getElementType(
			"org.chico.learnciat.diagram.MolefSocial1_3017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefSocial2_3018 = getElementType(
			"org.chico.learnciat.diagram.MolefSocial2_3018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefSocial3_3019 = getElementType(
			"org.chico.learnciat.diagram.MolefSocial3_3019"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefSocial4_3020 = getElementType(
			"org.chico.learnciat.diagram.MolefSocial4_3020"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefPersonalization1_3021 = getElementType(
			"org.chico.learnciat.diagram.MolefPersonalization1_3021"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefPersonalization2_3022 = getElementType(
			"org.chico.learnciat.diagram.MolefPersonalization2_3022"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefPersonalization3_3023 = getElementType(
			"org.chico.learnciat.diagram.MolefPersonalization3_3023"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefPersonalization4_3024 = getElementType(
			"org.chico.learnciat.diagram.MolefPersonalization4_3024"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefPersonalization5_3025 = getElementType(
			"org.chico.learnciat.diagram.MolefPersonalization5_3025"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IndividualTask_3026 = getElementType(
			"org.chico.learnciat.diagram.IndividualTask_3026"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Rol_3027 = getElementType("org.chico.learnciat.diagram.Rol_3027"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Group_3028 = getElementType("org.chico.learnciat.diagram.Group_3028"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GraphicalEditor_3029 = getElementType(
			"org.chico.learnciat.diagram.GraphicalEditor_3029"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TextEditor_3030 = getElementType("org.chico.learnciat.diagram.TextEditor_3030"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CodeEditor_3031 = getElementType("org.chico.learnciat.diagram.CodeEditor_3031"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType WebViewer_3032 = getElementType("org.chico.learnciat.diagram.WebViewer_3032"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Assimilative_3033 = getElementType(
			"org.chico.learnciat.diagram.Assimilative_3033"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InformationHandling_3034 = getElementType(
			"org.chico.learnciat.diagram.InformationHandling_3034"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Adaptive_3035 = getElementType("org.chico.learnciat.diagram.Adaptive_3035"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Communicative_3036 = getElementType(
			"org.chico.learnciat.diagram.Communicative_3036"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Productive_3037 = getElementType("org.chico.learnciat.diagram.Productive_3037"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Experiential_3038 = getElementType(
			"org.chico.learnciat.diagram.Experiential_3038"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Evaluative_3039 = getElementType("org.chico.learnciat.diagram.Evaluative_3039"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Support_3040 = getElementType("org.chico.learnciat.diagram.Support_3040"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FaceToFace_3041 = getElementType("org.chico.learnciat.diagram.FaceToFace_3041"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComputerSupported_3042 = getElementType(
			"org.chico.learnciat.diagram.ComputerSupported_3042"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Online_3043 = getElementType("org.chico.learnciat.diagram.Online_3043"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Tool_3044 = getElementType("org.chico.learnciat.diagram.Tool_3044"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Object_3045 = getElementType("org.chico.learnciat.diagram.Object_3045"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GroupTask_3046 = getElementType("org.chico.learnciat.diagram.GroupTask_3046"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Rol_3047 = getElementType("org.chico.learnciat.diagram.Rol_3047"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Group_3048 = getElementType("org.chico.learnciat.diagram.Group_3048"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Assimilative_3049 = getElementType(
			"org.chico.learnciat.diagram.Assimilative_3049"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InformationHandling_3050 = getElementType(
			"org.chico.learnciat.diagram.InformationHandling_3050"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Adaptive_3051 = getElementType("org.chico.learnciat.diagram.Adaptive_3051"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Communicative_3052 = getElementType(
			"org.chico.learnciat.diagram.Communicative_3052"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Productive_3053 = getElementType("org.chico.learnciat.diagram.Productive_3053"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Experiential_3054 = getElementType(
			"org.chico.learnciat.diagram.Experiential_3054"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Evaluative_3055 = getElementType("org.chico.learnciat.diagram.Evaluative_3055"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Support_3056 = getElementType("org.chico.learnciat.diagram.Support_3056"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FaceToFace_3057 = getElementType("org.chico.learnciat.diagram.FaceToFace_3057"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComputerSupported_3058 = getElementType(
			"org.chico.learnciat.diagram.ComputerSupported_3058"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Online_3059 = getElementType("org.chico.learnciat.diagram.Online_3059"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Object_3060 = getElementType("org.chico.learnciat.diagram.Object_3060"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AbstractTask_3061 = getElementType(
			"org.chico.learnciat.diagram.AbstractTask_3061"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Rol_3062 = getElementType("org.chico.learnciat.diagram.Rol_3062"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Group_3063 = getElementType("org.chico.learnciat.diagram.Group_3063"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Assimilative_3064 = getElementType(
			"org.chico.learnciat.diagram.Assimilative_3064"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InformationHandling_3065 = getElementType(
			"org.chico.learnciat.diagram.InformationHandling_3065"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Adaptive_3066 = getElementType("org.chico.learnciat.diagram.Adaptive_3066"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Communicative_3067 = getElementType(
			"org.chico.learnciat.diagram.Communicative_3067"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Productive_3068 = getElementType("org.chico.learnciat.diagram.Productive_3068"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Experiential_3069 = getElementType(
			"org.chico.learnciat.diagram.Experiential_3069"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Evaluative_3070 = getElementType("org.chico.learnciat.diagram.Evaluative_3070"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Support_3071 = getElementType("org.chico.learnciat.diagram.Support_3071"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FaceToFace_3072 = getElementType("org.chico.learnciat.diagram.FaceToFace_3072"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComputerSupported_3073 = getElementType(
			"org.chico.learnciat.diagram.ComputerSupported_3073"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Online_3074 = getElementType("org.chico.learnciat.diagram.Online_3074"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Object_3075 = getElementType("org.chico.learnciat.diagram.Object_3075"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DetailedAbstractTask_3076 = getElementType(
			"org.chico.learnciat.diagram.DetailedAbstractTask_3076"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IndividualTask_3077 = getElementType(
			"org.chico.learnciat.diagram.IndividualTask_3077"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GroupTask_3078 = getElementType("org.chico.learnciat.diagram.GroupTask_3078"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AbstractTask_3079 = getElementType(
			"org.chico.learnciat.diagram.AbstractTask_3079"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DetailedAbstractTask_3080 = getElementType(
			"org.chico.learnciat.diagram.DetailedAbstractTask_3080"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SessionPanel_3081 = getElementType(
			"org.chico.learnciat.diagram.SessionPanel_3081"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Chat_3082 = getElementType("org.chico.learnciat.diagram.Chat_3082"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TurnTakingTool_3083 = getElementType(
			"org.chico.learnciat.diagram.TurnTakingTool_3083"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Telepointer_3084 = getElementType("org.chico.learnciat.diagram.Telepointer_3084"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RadarView_3085 = getElementType("org.chico.learnciat.diagram.RadarView_3085"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Properties_3086 = getElementType("org.chico.learnciat.diagram.Properties_3086"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Console_3087 = getElementType("org.chico.learnciat.diagram.Console_3087"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Problems_3088 = getElementType("org.chico.learnciat.diagram.Problems_3088"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Init_3089 = getElementType("org.chico.learnciat.diagram.Init_3089"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType End_3090 = getElementType("org.chico.learnciat.diagram.End_3090"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TemporalCondition_3091 = getElementType(
			"org.chico.learnciat.diagram.TemporalCondition_3091"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Notification_3092 = getElementType(
			"org.chico.learnciat.diagram.Notification_3092"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Condition_3093 = getElementType("org.chico.learnciat.diagram.Condition_3093"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SessionPanel_3094 = getElementType(
			"org.chico.learnciat.diagram.SessionPanel_3094"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Chat_3095 = getElementType("org.chico.learnciat.diagram.Chat_3095"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TurnTakingTool_3096 = getElementType(
			"org.chico.learnciat.diagram.TurnTakingTool_3096"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Telepointer_3097 = getElementType("org.chico.learnciat.diagram.Telepointer_3097"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RadarView_3098 = getElementType("org.chico.learnciat.diagram.RadarView_3098"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Properties_3099 = getElementType("org.chico.learnciat.diagram.Properties_3099"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Console_3100 = getElementType("org.chico.learnciat.diagram.Console_3100"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Problems_3101 = getElementType("org.chico.learnciat.diagram.Problems_3101"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Init_3102 = getElementType("org.chico.learnciat.diagram.Init_3102"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType End_3103 = getElementType("org.chico.learnciat.diagram.End_3103"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TemporalCondition_3104 = getElementType(
			"org.chico.learnciat.diagram.TemporalCondition_3104"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Notification_3105 = getElementType(
			"org.chico.learnciat.diagram.Notification_3105"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Condition_3106 = getElementType("org.chico.learnciat.diagram.Condition_3106"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefMultimedia1_3107 = getElementType(
			"org.chico.learnciat.diagram.MolefMultimedia1_3107"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefMultimedia2_3108 = getElementType(
			"org.chico.learnciat.diagram.MolefMultimedia2_3108"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefMultimedia3_3109 = getElementType(
			"org.chico.learnciat.diagram.MolefMultimedia3_3109"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefMultimedia4_3110 = getElementType(
			"org.chico.learnciat.diagram.MolefMultimedia4_3110"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefMultimedia5_3111 = getElementType(
			"org.chico.learnciat.diagram.MolefMultimedia5_3111"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefMultimedia6_3112 = getElementType(
			"org.chico.learnciat.diagram.MolefMultimedia6_3112"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MolefMultimedia7_3113 = getElementType(
			"org.chico.learnciat.diagram.MolefMultimedia7_3113"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ExclusiveEdition_3114 = getElementType(
			"org.chico.learnciat.diagram.ExclusiveEdition_3114"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CollaborativeVisualization_3115 = getElementType(
			"org.chico.learnciat.diagram.CollaborativeVisualization_3115"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IndividualVisualization_3116 = getElementType(
			"org.chico.learnciat.diagram.IndividualVisualization_3116"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType UserTask_3117 = getElementType("org.chico.learnciat.diagram.UserTask_3117"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CTTAbstractTask_3118 = getElementType(
			"org.chico.learnciat.diagram.CTTAbstractTask_3118"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InteractiveTask_3119 = getElementType(
			"org.chico.learnciat.diagram.InteractiveTask_3119"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CTTCollaborativeTask_3120 = getElementType(
			"org.chico.learnciat.diagram.CTTCollaborativeTask_3120"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ApplicationTask_3121 = getElementType(
			"org.chico.learnciat.diagram.ApplicationTask_3121"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Inheritance_4001 = getElementType("org.chico.learnciat.diagram.Inheritance_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Acting_4002 = getElementType("org.chico.learnciat.diagram.Acting_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Association_4003 = getElementType("org.chico.learnciat.diagram.Association_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EnablingWOInformation_4004 = getElementType(
			"org.chico.learnciat.diagram.EnablingWOInformation_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EnablingWInformation_4005 = getElementType(
			"org.chico.learnciat.diagram.EnablingWInformation_4005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Choice_4006 = getElementType("org.chico.learnciat.diagram.Choice_4006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Concurrency_4007 = getElementType("org.chico.learnciat.diagram.Concurrency_4007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Aggregation_4008 = getElementType("org.chico.learnciat.diagram.Aggregation_4008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Enabling_4009 = getElementType("org.chico.learnciat.diagram.Enabling_4009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Disabling_4010 = getElementType("org.chico.learnciat.diagram.Disabling_4010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EnablingWithInformationPassing_4011 = getElementType(
			"org.chico.learnciat.diagram.EnablingWithInformationPassing_4011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DisablingWithInformationPassing_4012 = getElementType(
			"org.chico.learnciat.diagram.DisablingWithInformationPassing_4012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IndependentConcurrency_4013 = getElementType(
			"org.chico.learnciat.diagram.IndependentConcurrency_4013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OrderIndependence_4014 = getElementType(
			"org.chico.learnciat.diagram.OrderIndependence_4014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SuspendResume_4015 = getElementType(
			"org.chico.learnciat.diagram.SuspendResume_4015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ConcurrencyWithInformationPassing_4016 = getElementType(
			"org.chico.learnciat.diagram.ConcurrencyWithInformationPassing_4016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DeterministicChoice_4017 = getElementType(
			"org.chico.learnciat.diagram.DeterministicChoice_4017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType UndeterministicChoice_4018 = getElementType(
			"org.chico.learnciat.diagram.UndeterministicChoice_4018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Traceability_4019 = getElementType(
			"org.chico.learnciat.diagram.Traceability_4019"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(LCIANDiagram_1000, LciatPackage.eINSTANCE.getLCIANDiagram());

			elements.put(Sociogram_2001, LciatPackage.eINSTANCE.getSociogram());

			elements.put(LearningDiagram_2002, LciatPackage.eINSTANCE.getLearningDiagram());

			elements.put(CTTDiagram_2003, LciatPackage.eINSTANCE.getCTTDiagram());

			elements.put(Rol_3001, LciatPackage.eINSTANCE.getRol());

			elements.put(Group_3002, LciatPackage.eINSTANCE.getGroup());

			elements.put(MolefContent1_3003, LciatPackage.eINSTANCE.getMolefContent1());

			elements.put(MolefContent2_3004, LciatPackage.eINSTANCE.getMolefContent2());

			elements.put(MolefContent3_3005, LciatPackage.eINSTANCE.getMolefContent3());

			elements.put(MolefContent4_3006, LciatPackage.eINSTANCE.getMolefContent4());

			elements.put(MolefContent5_3007, LciatPackage.eINSTANCE.getMolefContent5());

			elements.put(MolefContent6_3008, LciatPackage.eINSTANCE.getMolefContent6());

			elements.put(MolefTActivities1_3009, LciatPackage.eINSTANCE.getMolefTActivities1());

			elements.put(MolefTActivities2_3010, LciatPackage.eINSTANCE.getMolefTActivities2());

			elements.put(MolefTActivities3_3011, LciatPackage.eINSTANCE.getMolefTActivities3());

			elements.put(MolefTActivities4_3012, LciatPackage.eINSTANCE.getMolefTActivities4());

			elements.put(MolefTActivities5_3013, LciatPackage.eINSTANCE.getMolefTActivities5());

			elements.put(MolefTActivities6_3014, LciatPackage.eINSTANCE.getMolefTActivities6());

			elements.put(MolefTActivities7_3015, LciatPackage.eINSTANCE.getMolefTActivities7());

			elements.put(MolefTActivities8_3016, LciatPackage.eINSTANCE.getMolefTActivities8());

			elements.put(MolefSocial1_3017, LciatPackage.eINSTANCE.getMolefSocial1());

			elements.put(MolefSocial2_3018, LciatPackage.eINSTANCE.getMolefSocial2());

			elements.put(MolefSocial3_3019, LciatPackage.eINSTANCE.getMolefSocial3());

			elements.put(MolefSocial4_3020, LciatPackage.eINSTANCE.getMolefSocial4());

			elements.put(MolefPersonalization1_3021, LciatPackage.eINSTANCE.getMolefPersonalization1());

			elements.put(MolefPersonalization2_3022, LciatPackage.eINSTANCE.getMolefPersonalization2());

			elements.put(MolefPersonalization3_3023, LciatPackage.eINSTANCE.getMolefPersonalization3());

			elements.put(MolefPersonalization4_3024, LciatPackage.eINSTANCE.getMolefPersonalization4());

			elements.put(MolefPersonalization5_3025, LciatPackage.eINSTANCE.getMolefPersonalization5());

			elements.put(IndividualTask_3026, LciatPackage.eINSTANCE.getIndividualTask());

			elements.put(Rol_3027, LciatPackage.eINSTANCE.getRol());

			elements.put(Group_3028, LciatPackage.eINSTANCE.getGroup());

			elements.put(GraphicalEditor_3029, LciatPackage.eINSTANCE.getGraphicalEditor());

			elements.put(TextEditor_3030, LciatPackage.eINSTANCE.getTextEditor());

			elements.put(CodeEditor_3031, LciatPackage.eINSTANCE.getCodeEditor());

			elements.put(WebViewer_3032, LciatPackage.eINSTANCE.getWebViewer());

			elements.put(Assimilative_3033, LciatPackage.eINSTANCE.getAssimilative());

			elements.put(InformationHandling_3034, LciatPackage.eINSTANCE.getInformationHandling());

			elements.put(Adaptive_3035, LciatPackage.eINSTANCE.getAdaptive());

			elements.put(Communicative_3036, LciatPackage.eINSTANCE.getCommunicative());

			elements.put(Productive_3037, LciatPackage.eINSTANCE.getProductive());

			elements.put(Experiential_3038, LciatPackage.eINSTANCE.getExperiential());

			elements.put(Evaluative_3039, LciatPackage.eINSTANCE.getEvaluative());

			elements.put(Support_3040, LciatPackage.eINSTANCE.getSupport());

			elements.put(FaceToFace_3041, LciatPackage.eINSTANCE.getFaceToFace());

			elements.put(ComputerSupported_3042, LciatPackage.eINSTANCE.getComputerSupported());

			elements.put(Online_3043, LciatPackage.eINSTANCE.getOnline());

			elements.put(Tool_3044, LciatPackage.eINSTANCE.getTool());

			elements.put(Object_3045, LciatPackage.eINSTANCE.getObject());

			elements.put(GroupTask_3046, LciatPackage.eINSTANCE.getGroupTask());

			elements.put(Rol_3047, LciatPackage.eINSTANCE.getRol());

			elements.put(Group_3048, LciatPackage.eINSTANCE.getGroup());

			elements.put(Assimilative_3049, LciatPackage.eINSTANCE.getAssimilative());

			elements.put(InformationHandling_3050, LciatPackage.eINSTANCE.getInformationHandling());

			elements.put(Adaptive_3051, LciatPackage.eINSTANCE.getAdaptive());

			elements.put(Communicative_3052, LciatPackage.eINSTANCE.getCommunicative());

			elements.put(Productive_3053, LciatPackage.eINSTANCE.getProductive());

			elements.put(Experiential_3054, LciatPackage.eINSTANCE.getExperiential());

			elements.put(Evaluative_3055, LciatPackage.eINSTANCE.getEvaluative());

			elements.put(Support_3056, LciatPackage.eINSTANCE.getSupport());

			elements.put(FaceToFace_3057, LciatPackage.eINSTANCE.getFaceToFace());

			elements.put(ComputerSupported_3058, LciatPackage.eINSTANCE.getComputerSupported());

			elements.put(Online_3059, LciatPackage.eINSTANCE.getOnline());

			elements.put(Object_3060, LciatPackage.eINSTANCE.getObject());

			elements.put(AbstractTask_3061, LciatPackage.eINSTANCE.getAbstractTask());

			elements.put(Rol_3062, LciatPackage.eINSTANCE.getRol());

			elements.put(Group_3063, LciatPackage.eINSTANCE.getGroup());

			elements.put(Assimilative_3064, LciatPackage.eINSTANCE.getAssimilative());

			elements.put(InformationHandling_3065, LciatPackage.eINSTANCE.getInformationHandling());

			elements.put(Adaptive_3066, LciatPackage.eINSTANCE.getAdaptive());

			elements.put(Communicative_3067, LciatPackage.eINSTANCE.getCommunicative());

			elements.put(Productive_3068, LciatPackage.eINSTANCE.getProductive());

			elements.put(Experiential_3069, LciatPackage.eINSTANCE.getExperiential());

			elements.put(Evaluative_3070, LciatPackage.eINSTANCE.getEvaluative());

			elements.put(Support_3071, LciatPackage.eINSTANCE.getSupport());

			elements.put(FaceToFace_3072, LciatPackage.eINSTANCE.getFaceToFace());

			elements.put(ComputerSupported_3073, LciatPackage.eINSTANCE.getComputerSupported());

			elements.put(Online_3074, LciatPackage.eINSTANCE.getOnline());

			elements.put(Object_3075, LciatPackage.eINSTANCE.getObject());

			elements.put(DetailedAbstractTask_3076, LciatPackage.eINSTANCE.getDetailedAbstractTask());

			elements.put(IndividualTask_3077, LciatPackage.eINSTANCE.getIndividualTask());

			elements.put(GroupTask_3078, LciatPackage.eINSTANCE.getGroupTask());

			elements.put(AbstractTask_3079, LciatPackage.eINSTANCE.getAbstractTask());

			elements.put(DetailedAbstractTask_3080, LciatPackage.eINSTANCE.getDetailedAbstractTask());

			elements.put(SessionPanel_3081, LciatPackage.eINSTANCE.getSessionPanel());

			elements.put(Chat_3082, LciatPackage.eINSTANCE.getChat());

			elements.put(TurnTakingTool_3083, LciatPackage.eINSTANCE.getTurnTakingTool());

			elements.put(Telepointer_3084, LciatPackage.eINSTANCE.getTelepointer());

			elements.put(RadarView_3085, LciatPackage.eINSTANCE.getRadarView());

			elements.put(Properties_3086, LciatPackage.eINSTANCE.getProperties());

			elements.put(Console_3087, LciatPackage.eINSTANCE.getConsole());

			elements.put(Problems_3088, LciatPackage.eINSTANCE.getProblems());

			elements.put(Init_3089, LciatPackage.eINSTANCE.getInit());

			elements.put(End_3090, LciatPackage.eINSTANCE.getEnd());

			elements.put(TemporalCondition_3091, LciatPackage.eINSTANCE.getTemporalCondition());

			elements.put(Notification_3092, LciatPackage.eINSTANCE.getNotification());

			elements.put(Condition_3093, LciatPackage.eINSTANCE.getCondition());

			elements.put(SessionPanel_3094, LciatPackage.eINSTANCE.getSessionPanel());

			elements.put(Chat_3095, LciatPackage.eINSTANCE.getChat());

			elements.put(TurnTakingTool_3096, LciatPackage.eINSTANCE.getTurnTakingTool());

			elements.put(Telepointer_3097, LciatPackage.eINSTANCE.getTelepointer());

			elements.put(RadarView_3098, LciatPackage.eINSTANCE.getRadarView());

			elements.put(Properties_3099, LciatPackage.eINSTANCE.getProperties());

			elements.put(Console_3100, LciatPackage.eINSTANCE.getConsole());

			elements.put(Problems_3101, LciatPackage.eINSTANCE.getProblems());

			elements.put(Init_3102, LciatPackage.eINSTANCE.getInit());

			elements.put(End_3103, LciatPackage.eINSTANCE.getEnd());

			elements.put(TemporalCondition_3104, LciatPackage.eINSTANCE.getTemporalCondition());

			elements.put(Notification_3105, LciatPackage.eINSTANCE.getNotification());

			elements.put(Condition_3106, LciatPackage.eINSTANCE.getCondition());

			elements.put(MolefMultimedia1_3107, LciatPackage.eINSTANCE.getMolefMultimedia1());

			elements.put(MolefMultimedia2_3108, LciatPackage.eINSTANCE.getMolefMultimedia2());

			elements.put(MolefMultimedia3_3109, LciatPackage.eINSTANCE.getMolefMultimedia3());

			elements.put(MolefMultimedia4_3110, LciatPackage.eINSTANCE.getMolefMultimedia4());

			elements.put(MolefMultimedia5_3111, LciatPackage.eINSTANCE.getMolefMultimedia5());

			elements.put(MolefMultimedia6_3112, LciatPackage.eINSTANCE.getMolefMultimedia6());

			elements.put(MolefMultimedia7_3113, LciatPackage.eINSTANCE.getMolefMultimedia7());

			elements.put(ExclusiveEdition_3114, LciatPackage.eINSTANCE.getExclusiveEdition());

			elements.put(CollaborativeVisualization_3115, LciatPackage.eINSTANCE.getCollaborativeVisualization());

			elements.put(IndividualVisualization_3116, LciatPackage.eINSTANCE.getIndividualVisualization());

			elements.put(UserTask_3117, LciatPackage.eINSTANCE.getUserTask());

			elements.put(CTTAbstractTask_3118, LciatPackage.eINSTANCE.getCTTAbstractTask());

			elements.put(InteractiveTask_3119, LciatPackage.eINSTANCE.getInteractiveTask());

			elements.put(CTTCollaborativeTask_3120, LciatPackage.eINSTANCE.getCTTCollaborativeTask());

			elements.put(ApplicationTask_3121, LciatPackage.eINSTANCE.getApplicationTask());

			elements.put(Inheritance_4001, LciatPackage.eINSTANCE.getInheritance());

			elements.put(Acting_4002, LciatPackage.eINSTANCE.getActing());

			elements.put(Association_4003, LciatPackage.eINSTANCE.getAssociation());

			elements.put(EnablingWOInformation_4004, LciatPackage.eINSTANCE.getEnablingWOInformation());

			elements.put(EnablingWInformation_4005, LciatPackage.eINSTANCE.getEnablingWInformation());

			elements.put(Choice_4006, LciatPackage.eINSTANCE.getChoice());

			elements.put(Concurrency_4007, LciatPackage.eINSTANCE.getConcurrency());

			elements.put(Aggregation_4008, LciatPackage.eINSTANCE.getAggregation());

			elements.put(Enabling_4009, LciatPackage.eINSTANCE.getEnabling());

			elements.put(Disabling_4010, LciatPackage.eINSTANCE.getDisabling());

			elements.put(EnablingWithInformationPassing_4011,
					LciatPackage.eINSTANCE.getEnablingWithInformationPassing());

			elements.put(DisablingWithInformationPassing_4012,
					LciatPackage.eINSTANCE.getDisablingWithInformationPassing());

			elements.put(IndependentConcurrency_4013, LciatPackage.eINSTANCE.getIndependentConcurrency());

			elements.put(OrderIndependence_4014, LciatPackage.eINSTANCE.getOrderIndependence());

			elements.put(SuspendResume_4015, LciatPackage.eINSTANCE.getSuspendResume());

			elements.put(ConcurrencyWithInformationPassing_4016,
					LciatPackage.eINSTANCE.getConcurrencyWithInformationPassing());

			elements.put(DeterministicChoice_4017, LciatPackage.eINSTANCE.getDeterministicChoice());

			elements.put(UndeterministicChoice_4018, LciatPackage.eINSTANCE.getUndeterministicChoice());

			elements.put(Traceability_4019, LciatPackage.eINSTANCE.getTraceability());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(LCIANDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(Sociogram_2001);
			KNOWN_ELEMENT_TYPES.add(LearningDiagram_2002);
			KNOWN_ELEMENT_TYPES.add(CTTDiagram_2003);
			KNOWN_ELEMENT_TYPES.add(Rol_3001);
			KNOWN_ELEMENT_TYPES.add(Group_3002);
			KNOWN_ELEMENT_TYPES.add(MolefContent1_3003);
			KNOWN_ELEMENT_TYPES.add(MolefContent2_3004);
			KNOWN_ELEMENT_TYPES.add(MolefContent3_3005);
			KNOWN_ELEMENT_TYPES.add(MolefContent4_3006);
			KNOWN_ELEMENT_TYPES.add(MolefContent5_3007);
			KNOWN_ELEMENT_TYPES.add(MolefContent6_3008);
			KNOWN_ELEMENT_TYPES.add(MolefTActivities1_3009);
			KNOWN_ELEMENT_TYPES.add(MolefTActivities2_3010);
			KNOWN_ELEMENT_TYPES.add(MolefTActivities3_3011);
			KNOWN_ELEMENT_TYPES.add(MolefTActivities4_3012);
			KNOWN_ELEMENT_TYPES.add(MolefTActivities5_3013);
			KNOWN_ELEMENT_TYPES.add(MolefTActivities6_3014);
			KNOWN_ELEMENT_TYPES.add(MolefTActivities7_3015);
			KNOWN_ELEMENT_TYPES.add(MolefTActivities8_3016);
			KNOWN_ELEMENT_TYPES.add(MolefSocial1_3017);
			KNOWN_ELEMENT_TYPES.add(MolefSocial2_3018);
			KNOWN_ELEMENT_TYPES.add(MolefSocial3_3019);
			KNOWN_ELEMENT_TYPES.add(MolefSocial4_3020);
			KNOWN_ELEMENT_TYPES.add(MolefPersonalization1_3021);
			KNOWN_ELEMENT_TYPES.add(MolefPersonalization2_3022);
			KNOWN_ELEMENT_TYPES.add(MolefPersonalization3_3023);
			KNOWN_ELEMENT_TYPES.add(MolefPersonalization4_3024);
			KNOWN_ELEMENT_TYPES.add(MolefPersonalization5_3025);
			KNOWN_ELEMENT_TYPES.add(IndividualTask_3026);
			KNOWN_ELEMENT_TYPES.add(Rol_3027);
			KNOWN_ELEMENT_TYPES.add(Group_3028);
			KNOWN_ELEMENT_TYPES.add(GraphicalEditor_3029);
			KNOWN_ELEMENT_TYPES.add(TextEditor_3030);
			KNOWN_ELEMENT_TYPES.add(CodeEditor_3031);
			KNOWN_ELEMENT_TYPES.add(WebViewer_3032);
			KNOWN_ELEMENT_TYPES.add(Assimilative_3033);
			KNOWN_ELEMENT_TYPES.add(InformationHandling_3034);
			KNOWN_ELEMENT_TYPES.add(Adaptive_3035);
			KNOWN_ELEMENT_TYPES.add(Communicative_3036);
			KNOWN_ELEMENT_TYPES.add(Productive_3037);
			KNOWN_ELEMENT_TYPES.add(Experiential_3038);
			KNOWN_ELEMENT_TYPES.add(Evaluative_3039);
			KNOWN_ELEMENT_TYPES.add(Support_3040);
			KNOWN_ELEMENT_TYPES.add(FaceToFace_3041);
			KNOWN_ELEMENT_TYPES.add(ComputerSupported_3042);
			KNOWN_ELEMENT_TYPES.add(Online_3043);
			KNOWN_ELEMENT_TYPES.add(Tool_3044);
			KNOWN_ELEMENT_TYPES.add(Object_3045);
			KNOWN_ELEMENT_TYPES.add(GroupTask_3046);
			KNOWN_ELEMENT_TYPES.add(Rol_3047);
			KNOWN_ELEMENT_TYPES.add(Group_3048);
			KNOWN_ELEMENT_TYPES.add(Assimilative_3049);
			KNOWN_ELEMENT_TYPES.add(InformationHandling_3050);
			KNOWN_ELEMENT_TYPES.add(Adaptive_3051);
			KNOWN_ELEMENT_TYPES.add(Communicative_3052);
			KNOWN_ELEMENT_TYPES.add(Productive_3053);
			KNOWN_ELEMENT_TYPES.add(Experiential_3054);
			KNOWN_ELEMENT_TYPES.add(Evaluative_3055);
			KNOWN_ELEMENT_TYPES.add(Support_3056);
			KNOWN_ELEMENT_TYPES.add(FaceToFace_3057);
			KNOWN_ELEMENT_TYPES.add(ComputerSupported_3058);
			KNOWN_ELEMENT_TYPES.add(Online_3059);
			KNOWN_ELEMENT_TYPES.add(Object_3060);
			KNOWN_ELEMENT_TYPES.add(AbstractTask_3061);
			KNOWN_ELEMENT_TYPES.add(Rol_3062);
			KNOWN_ELEMENT_TYPES.add(Group_3063);
			KNOWN_ELEMENT_TYPES.add(Assimilative_3064);
			KNOWN_ELEMENT_TYPES.add(InformationHandling_3065);
			KNOWN_ELEMENT_TYPES.add(Adaptive_3066);
			KNOWN_ELEMENT_TYPES.add(Communicative_3067);
			KNOWN_ELEMENT_TYPES.add(Productive_3068);
			KNOWN_ELEMENT_TYPES.add(Experiential_3069);
			KNOWN_ELEMENT_TYPES.add(Evaluative_3070);
			KNOWN_ELEMENT_TYPES.add(Support_3071);
			KNOWN_ELEMENT_TYPES.add(FaceToFace_3072);
			KNOWN_ELEMENT_TYPES.add(ComputerSupported_3073);
			KNOWN_ELEMENT_TYPES.add(Online_3074);
			KNOWN_ELEMENT_TYPES.add(Object_3075);
			KNOWN_ELEMENT_TYPES.add(DetailedAbstractTask_3076);
			KNOWN_ELEMENT_TYPES.add(IndividualTask_3077);
			KNOWN_ELEMENT_TYPES.add(GroupTask_3078);
			KNOWN_ELEMENT_TYPES.add(AbstractTask_3079);
			KNOWN_ELEMENT_TYPES.add(DetailedAbstractTask_3080);
			KNOWN_ELEMENT_TYPES.add(SessionPanel_3081);
			KNOWN_ELEMENT_TYPES.add(Chat_3082);
			KNOWN_ELEMENT_TYPES.add(TurnTakingTool_3083);
			KNOWN_ELEMENT_TYPES.add(Telepointer_3084);
			KNOWN_ELEMENT_TYPES.add(RadarView_3085);
			KNOWN_ELEMENT_TYPES.add(Properties_3086);
			KNOWN_ELEMENT_TYPES.add(Console_3087);
			KNOWN_ELEMENT_TYPES.add(Problems_3088);
			KNOWN_ELEMENT_TYPES.add(Init_3089);
			KNOWN_ELEMENT_TYPES.add(End_3090);
			KNOWN_ELEMENT_TYPES.add(TemporalCondition_3091);
			KNOWN_ELEMENT_TYPES.add(Notification_3092);
			KNOWN_ELEMENT_TYPES.add(Condition_3093);
			KNOWN_ELEMENT_TYPES.add(SessionPanel_3094);
			KNOWN_ELEMENT_TYPES.add(Chat_3095);
			KNOWN_ELEMENT_TYPES.add(TurnTakingTool_3096);
			KNOWN_ELEMENT_TYPES.add(Telepointer_3097);
			KNOWN_ELEMENT_TYPES.add(RadarView_3098);
			KNOWN_ELEMENT_TYPES.add(Properties_3099);
			KNOWN_ELEMENT_TYPES.add(Console_3100);
			KNOWN_ELEMENT_TYPES.add(Problems_3101);
			KNOWN_ELEMENT_TYPES.add(Init_3102);
			KNOWN_ELEMENT_TYPES.add(End_3103);
			KNOWN_ELEMENT_TYPES.add(TemporalCondition_3104);
			KNOWN_ELEMENT_TYPES.add(Notification_3105);
			KNOWN_ELEMENT_TYPES.add(Condition_3106);
			KNOWN_ELEMENT_TYPES.add(MolefMultimedia1_3107);
			KNOWN_ELEMENT_TYPES.add(MolefMultimedia2_3108);
			KNOWN_ELEMENT_TYPES.add(MolefMultimedia3_3109);
			KNOWN_ELEMENT_TYPES.add(MolefMultimedia4_3110);
			KNOWN_ELEMENT_TYPES.add(MolefMultimedia5_3111);
			KNOWN_ELEMENT_TYPES.add(MolefMultimedia6_3112);
			KNOWN_ELEMENT_TYPES.add(MolefMultimedia7_3113);
			KNOWN_ELEMENT_TYPES.add(ExclusiveEdition_3114);
			KNOWN_ELEMENT_TYPES.add(CollaborativeVisualization_3115);
			KNOWN_ELEMENT_TYPES.add(IndividualVisualization_3116);
			KNOWN_ELEMENT_TYPES.add(UserTask_3117);
			KNOWN_ELEMENT_TYPES.add(CTTAbstractTask_3118);
			KNOWN_ELEMENT_TYPES.add(InteractiveTask_3119);
			KNOWN_ELEMENT_TYPES.add(CTTCollaborativeTask_3120);
			KNOWN_ELEMENT_TYPES.add(ApplicationTask_3121);
			KNOWN_ELEMENT_TYPES.add(Inheritance_4001);
			KNOWN_ELEMENT_TYPES.add(Acting_4002);
			KNOWN_ELEMENT_TYPES.add(Association_4003);
			KNOWN_ELEMENT_TYPES.add(EnablingWOInformation_4004);
			KNOWN_ELEMENT_TYPES.add(EnablingWInformation_4005);
			KNOWN_ELEMENT_TYPES.add(Choice_4006);
			KNOWN_ELEMENT_TYPES.add(Concurrency_4007);
			KNOWN_ELEMENT_TYPES.add(Aggregation_4008);
			KNOWN_ELEMENT_TYPES.add(Enabling_4009);
			KNOWN_ELEMENT_TYPES.add(Disabling_4010);
			KNOWN_ELEMENT_TYPES.add(EnablingWithInformationPassing_4011);
			KNOWN_ELEMENT_TYPES.add(DisablingWithInformationPassing_4012);
			KNOWN_ELEMENT_TYPES.add(IndependentConcurrency_4013);
			KNOWN_ELEMENT_TYPES.add(OrderIndependence_4014);
			KNOWN_ELEMENT_TYPES.add(SuspendResume_4015);
			KNOWN_ELEMENT_TYPES.add(ConcurrencyWithInformationPassing_4016);
			KNOWN_ELEMENT_TYPES.add(DeterministicChoice_4017);
			KNOWN_ELEMENT_TYPES.add(UndeterministicChoice_4018);
			KNOWN_ELEMENT_TYPES.add(Traceability_4019);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case LCIANDiagramEditPart.VISUAL_ID:
			return LCIANDiagram_1000;
		case SociogramEditPart.VISUAL_ID:
			return Sociogram_2001;
		case LearningDiagramEditPart.VISUAL_ID:
			return LearningDiagram_2002;
		case CTTDiagramEditPart.VISUAL_ID:
			return CTTDiagram_2003;
		case RolEditPart.VISUAL_ID:
			return Rol_3001;
		case GroupEditPart.VISUAL_ID:
			return Group_3002;
		case MolefContent1EditPart.VISUAL_ID:
			return MolefContent1_3003;
		case MolefContent2EditPart.VISUAL_ID:
			return MolefContent2_3004;
		case MolefContent3EditPart.VISUAL_ID:
			return MolefContent3_3005;
		case MolefContent4EditPart.VISUAL_ID:
			return MolefContent4_3006;
		case MolefContent5EditPart.VISUAL_ID:
			return MolefContent5_3007;
		case MolefContent6EditPart.VISUAL_ID:
			return MolefContent6_3008;
		case MolefTActivities1EditPart.VISUAL_ID:
			return MolefTActivities1_3009;
		case MolefTActivities2EditPart.VISUAL_ID:
			return MolefTActivities2_3010;
		case MolefTActivities3EditPart.VISUAL_ID:
			return MolefTActivities3_3011;
		case MolefTActivities4EditPart.VISUAL_ID:
			return MolefTActivities4_3012;
		case MolefTActivities5EditPart.VISUAL_ID:
			return MolefTActivities5_3013;
		case MolefTActivities6EditPart.VISUAL_ID:
			return MolefTActivities6_3014;
		case MolefTActivities7EditPart.VISUAL_ID:
			return MolefTActivities7_3015;
		case MolefTActivities8EditPart.VISUAL_ID:
			return MolefTActivities8_3016;
		case MolefSocial1EditPart.VISUAL_ID:
			return MolefSocial1_3017;
		case MolefSocial2EditPart.VISUAL_ID:
			return MolefSocial2_3018;
		case MolefSocial3EditPart.VISUAL_ID:
			return MolefSocial3_3019;
		case MolefSocial4EditPart.VISUAL_ID:
			return MolefSocial4_3020;
		case MolefPersonalization1EditPart.VISUAL_ID:
			return MolefPersonalization1_3021;
		case MolefPersonalization2EditPart.VISUAL_ID:
			return MolefPersonalization2_3022;
		case MolefPersonalization3EditPart.VISUAL_ID:
			return MolefPersonalization3_3023;
		case MolefPersonalization4EditPart.VISUAL_ID:
			return MolefPersonalization4_3024;
		case MolefPersonalization5EditPart.VISUAL_ID:
			return MolefPersonalization5_3025;
		case IndividualTaskEditPart.VISUAL_ID:
			return IndividualTask_3026;
		case Rol2EditPart.VISUAL_ID:
			return Rol_3027;
		case Group2EditPart.VISUAL_ID:
			return Group_3028;
		case GraphicalEditorEditPart.VISUAL_ID:
			return GraphicalEditor_3029;
		case TextEditorEditPart.VISUAL_ID:
			return TextEditor_3030;
		case CodeEditorEditPart.VISUAL_ID:
			return CodeEditor_3031;
		case WebViewerEditPart.VISUAL_ID:
			return WebViewer_3032;
		case AssimilativeEditPart.VISUAL_ID:
			return Assimilative_3033;
		case InformationHandlingEditPart.VISUAL_ID:
			return InformationHandling_3034;
		case AdaptiveEditPart.VISUAL_ID:
			return Adaptive_3035;
		case CommunicativeEditPart.VISUAL_ID:
			return Communicative_3036;
		case ProductiveEditPart.VISUAL_ID:
			return Productive_3037;
		case ExperientialEditPart.VISUAL_ID:
			return Experiential_3038;
		case EvaluativeEditPart.VISUAL_ID:
			return Evaluative_3039;
		case SupportEditPart.VISUAL_ID:
			return Support_3040;
		case FaceToFaceEditPart.VISUAL_ID:
			return FaceToFace_3041;
		case ComputerSupportedEditPart.VISUAL_ID:
			return ComputerSupported_3042;
		case OnlineEditPart.VISUAL_ID:
			return Online_3043;
		case ToolEditPart.VISUAL_ID:
			return Tool_3044;
		case ObjectEditPart.VISUAL_ID:
			return Object_3045;
		case GroupTaskEditPart.VISUAL_ID:
			return GroupTask_3046;
		case Rol3EditPart.VISUAL_ID:
			return Rol_3047;
		case Group3EditPart.VISUAL_ID:
			return Group_3048;
		case Assimilative2EditPart.VISUAL_ID:
			return Assimilative_3049;
		case InformationHandling2EditPart.VISUAL_ID:
			return InformationHandling_3050;
		case Adaptive2EditPart.VISUAL_ID:
			return Adaptive_3051;
		case Communicative2EditPart.VISUAL_ID:
			return Communicative_3052;
		case Productive2EditPart.VISUAL_ID:
			return Productive_3053;
		case Experiential2EditPart.VISUAL_ID:
			return Experiential_3054;
		case Evaluative2EditPart.VISUAL_ID:
			return Evaluative_3055;
		case Support2EditPart.VISUAL_ID:
			return Support_3056;
		case FaceToFace2EditPart.VISUAL_ID:
			return FaceToFace_3057;
		case ComputerSupported2EditPart.VISUAL_ID:
			return ComputerSupported_3058;
		case Online2EditPart.VISUAL_ID:
			return Online_3059;
		case Object2EditPart.VISUAL_ID:
			return Object_3060;
		case AbstractTaskEditPart.VISUAL_ID:
			return AbstractTask_3061;
		case Rol4EditPart.VISUAL_ID:
			return Rol_3062;
		case Group4EditPart.VISUAL_ID:
			return Group_3063;
		case Assimilative3EditPart.VISUAL_ID:
			return Assimilative_3064;
		case InformationHandling3EditPart.VISUAL_ID:
			return InformationHandling_3065;
		case Adaptive3EditPart.VISUAL_ID:
			return Adaptive_3066;
		case Communicative3EditPart.VISUAL_ID:
			return Communicative_3067;
		case Productive3EditPart.VISUAL_ID:
			return Productive_3068;
		case Experiential3EditPart.VISUAL_ID:
			return Experiential_3069;
		case Evaluative3EditPart.VISUAL_ID:
			return Evaluative_3070;
		case Support3EditPart.VISUAL_ID:
			return Support_3071;
		case FaceToFace3EditPart.VISUAL_ID:
			return FaceToFace_3072;
		case ComputerSupported3EditPart.VISUAL_ID:
			return ComputerSupported_3073;
		case Online3EditPart.VISUAL_ID:
			return Online_3074;
		case Object3EditPart.VISUAL_ID:
			return Object_3075;
		case DetailedAbstractTaskEditPart.VISUAL_ID:
			return DetailedAbstractTask_3076;
		case IndividualTask2EditPart.VISUAL_ID:
			return IndividualTask_3077;
		case GroupTask2EditPart.VISUAL_ID:
			return GroupTask_3078;
		case AbstractTask2EditPart.VISUAL_ID:
			return AbstractTask_3079;
		case DetailedAbstractTask2EditPart.VISUAL_ID:
			return DetailedAbstractTask_3080;
		case SessionPanelEditPart.VISUAL_ID:
			return SessionPanel_3081;
		case ChatEditPart.VISUAL_ID:
			return Chat_3082;
		case TurnTakingToolEditPart.VISUAL_ID:
			return TurnTakingTool_3083;
		case TelepointerEditPart.VISUAL_ID:
			return Telepointer_3084;
		case RadarViewEditPart.VISUAL_ID:
			return RadarView_3085;
		case PropertiesEditPart.VISUAL_ID:
			return Properties_3086;
		case ConsoleEditPart.VISUAL_ID:
			return Console_3087;
		case ProblemsEditPart.VISUAL_ID:
			return Problems_3088;
		case InitEditPart.VISUAL_ID:
			return Init_3089;
		case EndEditPart.VISUAL_ID:
			return End_3090;
		case TemporalConditionEditPart.VISUAL_ID:
			return TemporalCondition_3091;
		case NotificationEditPart.VISUAL_ID:
			return Notification_3092;
		case ConditionEditPart.VISUAL_ID:
			return Condition_3093;
		case SessionPanel2EditPart.VISUAL_ID:
			return SessionPanel_3094;
		case Chat2EditPart.VISUAL_ID:
			return Chat_3095;
		case TurnTakingTool2EditPart.VISUAL_ID:
			return TurnTakingTool_3096;
		case Telepointer2EditPart.VISUAL_ID:
			return Telepointer_3097;
		case RadarView2EditPart.VISUAL_ID:
			return RadarView_3098;
		case Properties2EditPart.VISUAL_ID:
			return Properties_3099;
		case Console2EditPart.VISUAL_ID:
			return Console_3100;
		case Problems2EditPart.VISUAL_ID:
			return Problems_3101;
		case Init2EditPart.VISUAL_ID:
			return Init_3102;
		case End2EditPart.VISUAL_ID:
			return End_3103;
		case TemporalCondition2EditPart.VISUAL_ID:
			return TemporalCondition_3104;
		case Notification2EditPart.VISUAL_ID:
			return Notification_3105;
		case Condition2EditPart.VISUAL_ID:
			return Condition_3106;
		case MolefMultimedia1EditPart.VISUAL_ID:
			return MolefMultimedia1_3107;
		case MolefMultimedia2EditPart.VISUAL_ID:
			return MolefMultimedia2_3108;
		case MolefMultimedia3EditPart.VISUAL_ID:
			return MolefMultimedia3_3109;
		case MolefMultimedia4EditPart.VISUAL_ID:
			return MolefMultimedia4_3110;
		case MolefMultimedia5EditPart.VISUAL_ID:
			return MolefMultimedia5_3111;
		case MolefMultimedia6EditPart.VISUAL_ID:
			return MolefMultimedia6_3112;
		case MolefMultimedia7EditPart.VISUAL_ID:
			return MolefMultimedia7_3113;
		case ExclusiveEditionEditPart.VISUAL_ID:
			return ExclusiveEdition_3114;
		case CollaborativeVisualizationEditPart.VISUAL_ID:
			return CollaborativeVisualization_3115;
		case IndividualVisualizationEditPart.VISUAL_ID:
			return IndividualVisualization_3116;
		case UserTaskEditPart.VISUAL_ID:
			return UserTask_3117;
		case CTTAbstractTaskEditPart.VISUAL_ID:
			return CTTAbstractTask_3118;
		case InteractiveTaskEditPart.VISUAL_ID:
			return InteractiveTask_3119;
		case CTTCollaborativeTaskEditPart.VISUAL_ID:
			return CTTCollaborativeTask_3120;
		case ApplicationTaskEditPart.VISUAL_ID:
			return ApplicationTask_3121;
		case InheritanceEditPart.VISUAL_ID:
			return Inheritance_4001;
		case ActingEditPart.VISUAL_ID:
			return Acting_4002;
		case AssociationEditPart.VISUAL_ID:
			return Association_4003;
		case EnablingWOInformationEditPart.VISUAL_ID:
			return EnablingWOInformation_4004;
		case EnablingWInformationEditPart.VISUAL_ID:
			return EnablingWInformation_4005;
		case ChoiceEditPart.VISUAL_ID:
			return Choice_4006;
		case ConcurrencyEditPart.VISUAL_ID:
			return Concurrency_4007;
		case AggregationEditPart.VISUAL_ID:
			return Aggregation_4008;
		case EnablingEditPart.VISUAL_ID:
			return Enabling_4009;
		case DisablingEditPart.VISUAL_ID:
			return Disabling_4010;
		case EnablingWithInformationPassingEditPart.VISUAL_ID:
			return EnablingWithInformationPassing_4011;
		case DisablingWithInformationPassingEditPart.VISUAL_ID:
			return DisablingWithInformationPassing_4012;
		case IndependentConcurrencyEditPart.VISUAL_ID:
			return IndependentConcurrency_4013;
		case OrderIndependenceEditPart.VISUAL_ID:
			return OrderIndependence_4014;
		case SuspendResumeEditPart.VISUAL_ID:
			return SuspendResume_4015;
		case ConcurrencyWithInformationPassingEditPart.VISUAL_ID:
			return ConcurrencyWithInformationPassing_4016;
		case DeterministicChoiceEditPart.VISUAL_ID:
			return DeterministicChoice_4017;
		case UndeterministicChoiceEditPart.VISUAL_ID:
			return UndeterministicChoice_4018;
		case TraceabilityEditPart.VISUAL_ID:
			return Traceability_4019;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return lciat.diagram.providers.LciatElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return lciat.diagram.providers.LciatElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return lciat.diagram.providers.LciatElementTypes.getElement(elementTypeAdapter);
		}
	};

}
