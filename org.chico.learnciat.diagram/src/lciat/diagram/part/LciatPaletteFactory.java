
/*
 * 
 */
package lciat.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class LciatPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createSociogram1Group());
		paletteRoot.add(createLearningDesignDiagram2Group());
		paletteRoot.add(createCTTDiagram3Group());
		paletteRoot.add(createMoLEF4Group());
	}

	/**
	* Creates "Sociogram" palette tool group
	* @generated
	*/
	private PaletteContainer createSociogram1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Sociogram1Group_title);
		paletteContainer.setId("createSociogram1Group"); //$NON-NLS-1$
		paletteContainer.add(createSociogram1CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createRol3CreationTool());
		paletteContainer.add(createGroup4CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createActing6CreationTool());
		paletteContainer.add(createInheritance7CreationTool());
		paletteContainer.add(createAssociation8CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Learning-Design Diagram" palette tool group
	* @generated
	*/
	private PaletteContainer createLearningDesignDiagram2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.LearningDesignDiagram2Group_title);
		paletteContainer.setId("createLearningDesignDiagram2Group"); //$NON-NLS-1$
		paletteContainer.add(createLearningDiagram1CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createIndividualLearning3CreationTool());
		paletteContainer.add(createGroupLearning4CreationTool());
		paletteContainer.add(createAbstractLearning5CreationTool());
		paletteContainer.add(createDetailedAbstractLearning6CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createInitial8CreationTool());
		paletteContainer.add(createFinal9CreationTool());
		paletteContainer.add(createObject10CreationTool());
		paletteContainer.add(createTemporalCondition11CreationTool());
		paletteContainer.add(createNotification12CreationTool());
		paletteContainer.add(createCondition13CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createFacetoface15CreationTool());
		paletteContainer.add(createComputerSupported16CreationTool());
		paletteContainer.add(createOnline17CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createAssimilative19CreationTool());
		paletteContainer.add(createInformationHandling20CreationTool());
		paletteContainer.add(createAdaptive21CreationTool());
		paletteContainer.add(createCommunicative22CreationTool());
		paletteContainer.add(createProductive23CreationTool());
		paletteContainer.add(createExperiential24CreationTool());
		paletteContainer.add(createEvaluative25CreationTool());
		paletteContainer.add(createSupport26CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createTool28CreationTool());
		paletteContainer.add(createTextEditor29CreationTool());
		paletteContainer.add(createCodeEditor30CreationTool());
		paletteContainer.add(createGraphicalEditor31CreationTool());
		paletteContainer.add(createWebViewer32CreationTool());
		paletteContainer.add(createSessionPanel33CreationTool());
		paletteContainer.add(createTurnTakingPanel34CreationTool());
		paletteContainer.add(createChat35CreationTool());
		paletteContainer.add(createTelepointer36CreationTool());
		paletteContainer.add(createRadarView37CreationTool());
		paletteContainer.add(createProperties38CreationTool());
		paletteContainer.add(createConsole39CreationTool());
		paletteContainer.add(createProblems40CreationTool());
		paletteContainer.add(createTraceability41CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createEnablingwoInformation43CreationTool());
		paletteContainer.add(createEnablingwInformation44CreationTool());
		paletteContainer.add(createChoice45CreationTool());
		paletteContainer.add(createConcurrency46CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "CTT Diagram" palette tool group
	* @generated
	*/
	private PaletteContainer createCTTDiagram3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.CTTDiagram3Group_title);
		paletteContainer.setId("createCTTDiagram3Group"); //$NON-NLS-1$
		paletteContainer.add(createCTTDiagram1CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createAbstractTask3CreationTool());
		paletteContainer.add(createApplicationTask4CreationTool());
		paletteContainer.add(createCollaborativeTask5CreationTool());
		paletteContainer.add(createInteractiveTask6CreationTool());
		paletteContainer.add(createUserTask7CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createExclusiveEdition9CreationTool());
		paletteContainer.add(createCollaborativeVisualization10CreationTool());
		paletteContainer.add(createIndividualVisualization11CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createAggregation13CreationTool());
		paletteContainer.add(createConcurrencyWithInformationPassing14CreationTool());
		paletteContainer.add(createDeterministicChoice15CreationTool());
		paletteContainer.add(createDisabling16CreationTool());
		paletteContainer.add(createDisablingWithInformationPassing17CreationTool());
		paletteContainer.add(createEnabling18CreationTool());
		paletteContainer.add(createEnablingWithInformationPassing19CreationTool());
		paletteContainer.add(createIndependentConcurrency20CreationTool());
		paletteContainer.add(createOrderIndependence21CreationTool());
		paletteContainer.add(createSuspendResume22CreationTool());
		paletteContainer.add(createUndeterministicChoice23CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "MoLEF" palette tool group
	* @generated
	*/
	private PaletteContainer createMoLEF4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.MoLEF4Group_title);
		paletteContainer.setId("createMoLEF4Group"); //$NON-NLS-1$
		paletteContainer.add(createContent11CreationTool());
		paletteContainer.add(createContent22CreationTool());
		paletteContainer.add(createContent33CreationTool());
		paletteContainer.add(createContent44CreationTool());
		paletteContainer.add(createContent55CreationTool());
		paletteContainer.add(createContent66CreationTool());
		paletteContainer.add(createTaskandActivities17CreationTool());
		paletteContainer.add(createTaskandActivities28CreationTool());
		paletteContainer.add(createTaskandActivities39CreationTool());
		paletteContainer.add(createTaskandActivities410CreationTool());
		paletteContainer.add(createTaskandActivities511CreationTool());
		paletteContainer.add(createTaskandActivities612CreationTool());
		paletteContainer.add(createTaskandActivities713CreationTool());
		paletteContainer.add(createTaskandActivities814CreationTool());
		paletteContainer.add(createSocial115CreationTool());
		paletteContainer.add(createSocial216CreationTool());
		paletteContainer.add(createSocial317CreationTool());
		paletteContainer.add(createSocial418CreationTool());
		paletteContainer.add(createPersonalization119CreationTool());
		paletteContainer.add(createPersonalization220CreationTool());
		paletteContainer.add(createPersonalization321CreationTool());
		paletteContainer.add(createPersonalization422CreationTool());
		paletteContainer.add(createPersonalization523CreationTool());
		paletteContainer.add(createMultimedia124CreationTool());
		paletteContainer.add(createMultimedia225CreationTool());
		paletteContainer.add(createMultimedia326CreationTool());
		paletteContainer.add(createMultimedia427CreationTool());
		paletteContainer.add(createMultimedia528CreationTool());
		paletteContainer.add(createMultimedia629CreationTool());
		paletteContainer.add(createMultimedia730CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createSociogram1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Sociogram1CreationTool_title,
				Messages.Sociogram1CreationTool_desc, Collections.singletonList(LciatElementTypes.Sociogram_2001));
		entry.setId("createSociogram1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/Sociogram.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRol3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(LciatElementTypes.Rol_3001);
		types.add(LciatElementTypes.Rol_3027);
		types.add(LciatElementTypes.Rol_3047);
		types.add(LciatElementTypes.Rol_3062);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Rol3CreationTool_title,
				Messages.Rol3CreationTool_desc, types);
		entry.setId("createRol3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/Rol.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGroup4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(LciatElementTypes.Group_3002);
		types.add(LciatElementTypes.Group_3028);
		types.add(LciatElementTypes.Group_3048);
		types.add(LciatElementTypes.Group_3063);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Group4CreationTool_title,
				Messages.Group4CreationTool_desc, types);
		entry.setId("createGroup4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/Group.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createActing6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Acting6CreationTool_title,
				Messages.Acting6CreationTool_desc, Collections.singletonList(LciatElementTypes.Acting_4002));
		entry.setId("createActing6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/Acting.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInheritance7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Inheritance7CreationTool_title,
				Messages.Inheritance7CreationTool_desc, Collections.singletonList(LciatElementTypes.Inheritance_4001));
		entry.setId("createInheritance7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/Inheritance.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAssociation8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Association8CreationTool_title,
				Messages.Association8CreationTool_desc, Collections.singletonList(LciatElementTypes.Association_4003));
		entry.setId("createAssociation8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/Association.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLearningDiagram1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LearningDiagram1CreationTool_title,
				Messages.LearningDiagram1CreationTool_desc,
				Collections.singletonList(LciatElementTypes.LearningDiagram_2002));
		entry.setId("createLearningDiagram1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/LearningDesignDiagram.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIndividualLearning3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(LciatElementTypes.IndividualTask_3026);
		types.add(LciatElementTypes.IndividualTask_3077);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.IndividualLearning3CreationTool_title,
				Messages.IndividualLearning3CreationTool_desc, types);
		entry.setId("createIndividualLearning3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/IndividualLearningTask.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGroupLearning4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(LciatElementTypes.GroupTask_3046);
		types.add(LciatElementTypes.GroupTask_3078);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.GroupLearning4CreationTool_title,
				Messages.GroupLearning4CreationTool_desc, types);
		entry.setId("createGroupLearning4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/GroupLearningTask.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAbstractLearning5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(LciatElementTypes.AbstractTask_3061);
		types.add(LciatElementTypes.AbstractTask_3079);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AbstractLearning5CreationTool_title,
				Messages.AbstractLearning5CreationTool_desc, types);
		entry.setId("createAbstractLearning5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/AbstractLearningTask.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDetailedAbstractLearning6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(LciatElementTypes.DetailedAbstractTask_3076);
		types.add(LciatElementTypes.DetailedAbstractTask_3080);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DetailedAbstractLearning6CreationTool_title,
				Messages.DetailedAbstractLearning6CreationTool_desc, types);
		entry.setId("createDetailedAbstractLearning6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/AbstractLearningTask.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInitial8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(LciatElementTypes.Init_3089);
		types.add(LciatElementTypes.Init_3102);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Initial8CreationTool_title,
				Messages.Initial8CreationTool_desc, types);
		entry.setId("createInitial8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/Initial.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFinal9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(LciatElementTypes.End_3090);
		types.add(LciatElementTypes.End_3103);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Final9CreationTool_title,
				Messages.Final9CreationTool_desc, types);
		entry.setId("createFinal9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/Final.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createObject10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(LciatElementTypes.Object_3045);
		types.add(LciatElementTypes.Object_3060);
		types.add(LciatElementTypes.Object_3075);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Object10CreationTool_title,
				Messages.Object10CreationTool_desc, types);
		entry.setId("createObject10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/Object.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTemporalCondition11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(LciatElementTypes.TemporalCondition_3091);
		types.add(LciatElementTypes.TemporalCondition_3104);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TemporalCondition11CreationTool_title,
				Messages.TemporalCondition11CreationTool_desc, types);
		entry.setId("createTemporalCondition11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/TemporalCondition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNotification12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(LciatElementTypes.Notification_3092);
		types.add(LciatElementTypes.Notification_3105);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Notification12CreationTool_title,
				Messages.Notification12CreationTool_desc, types);
		entry.setId("createNotification12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/Notification.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCondition13CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(LciatElementTypes.Condition_3093);
		types.add(LciatElementTypes.Condition_3106);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Condition13CreationTool_title,
				Messages.Condition13CreationTool_desc, types);
		entry.setId("createCondition13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/Condition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFacetoface15CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(LciatElementTypes.FaceToFace_3041);
		types.add(LciatElementTypes.FaceToFace_3057);
		types.add(LciatElementTypes.FaceToFace_3072);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Facetoface15CreationTool_title,
				Messages.Facetoface15CreationTool_desc, types);
		entry.setId("createFacetoface15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/FaceToFace.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createComputerSupported16CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(LciatElementTypes.ComputerSupported_3042);
		types.add(LciatElementTypes.ComputerSupported_3058);
		types.add(LciatElementTypes.ComputerSupported_3073);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ComputerSupported16CreationTool_title,
				Messages.ComputerSupported16CreationTool_desc, types);
		entry.setId("createComputerSupported16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/ComputerSupported.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOnline17CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(LciatElementTypes.Online_3043);
		types.add(LciatElementTypes.Online_3059);
		types.add(LciatElementTypes.Online_3074);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Online17CreationTool_title,
				Messages.Online17CreationTool_desc, types);
		entry.setId("createOnline17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/Online.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAssimilative19CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(LciatElementTypes.Assimilative_3033);
		types.add(LciatElementTypes.Assimilative_3049);
		types.add(LciatElementTypes.Assimilative_3064);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Assimilative19CreationTool_title,
				Messages.Assimilative19CreationTool_desc, types);
		entry.setId("createAssimilative19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/Assimilative.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInformationHandling20CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(LciatElementTypes.InformationHandling_3034);
		types.add(LciatElementTypes.InformationHandling_3050);
		types.add(LciatElementTypes.InformationHandling_3065);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InformationHandling20CreationTool_title,
				Messages.InformationHandling20CreationTool_desc, types);
		entry.setId("createInformationHandling20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/InformationHandling.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAdaptive21CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(LciatElementTypes.Adaptive_3035);
		types.add(LciatElementTypes.Adaptive_3051);
		types.add(LciatElementTypes.Adaptive_3066);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Adaptive21CreationTool_title,
				Messages.Adaptive21CreationTool_desc, types);
		entry.setId("createAdaptive21CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/Adaptive.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCommunicative22CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(LciatElementTypes.Communicative_3036);
		types.add(LciatElementTypes.Communicative_3052);
		types.add(LciatElementTypes.Communicative_3067);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Communicative22CreationTool_title,
				Messages.Communicative22CreationTool_desc, types);
		entry.setId("createCommunicative22CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/Communicative.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createProductive23CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(LciatElementTypes.Productive_3037);
		types.add(LciatElementTypes.Productive_3053);
		types.add(LciatElementTypes.Productive_3068);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Productive23CreationTool_title,
				Messages.Productive23CreationTool_desc, types);
		entry.setId("createProductive23CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/Productive.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExperiential24CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(LciatElementTypes.Experiential_3038);
		types.add(LciatElementTypes.Experiential_3054);
		types.add(LciatElementTypes.Experiential_3069);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Experiential24CreationTool_title,
				Messages.Experiential24CreationTool_desc, types);
		entry.setId("createExperiential24CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/Experiential.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEvaluative25CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(LciatElementTypes.Evaluative_3039);
		types.add(LciatElementTypes.Evaluative_3055);
		types.add(LciatElementTypes.Evaluative_3070);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Evaluative25CreationTool_title,
				Messages.Evaluative25CreationTool_desc, types);
		entry.setId("createEvaluative25CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/Evaluative.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSupport26CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(LciatElementTypes.Support_3040);
		types.add(LciatElementTypes.Support_3056);
		types.add(LciatElementTypes.Support_3071);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Support26CreationTool_title,
				Messages.Support26CreationTool_desc, types);
		entry.setId("createSupport26CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/Support.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTool28CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Tool28CreationTool_title,
				Messages.Tool28CreationTool_desc, Collections.singletonList(LciatElementTypes.Tool_3044));
		entry.setId("createTool28CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/Tool.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTextEditor29CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TextEditor29CreationTool_title,
				Messages.TextEditor29CreationTool_desc, Collections.singletonList(LciatElementTypes.TextEditor_3030));
		entry.setId("createTextEditor29CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/TextEditor.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCodeEditor30CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CodeEditor30CreationTool_title,
				Messages.CodeEditor30CreationTool_desc, Collections.singletonList(LciatElementTypes.CodeEditor_3031));
		entry.setId("createCodeEditor30CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/CodeEditor.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGraphicalEditor31CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.GraphicalEditor31CreationTool_title,
				Messages.GraphicalEditor31CreationTool_desc,
				Collections.singletonList(LciatElementTypes.GraphicalEditor_3029));
		entry.setId("createGraphicalEditor31CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/GraphicalEditor.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createWebViewer32CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.WebViewer32CreationTool_title,
				Messages.WebViewer32CreationTool_desc, Collections.singletonList(LciatElementTypes.WebViewer_3032));
		entry.setId("createWebViewer32CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/WebViewer.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSessionPanel33CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(LciatElementTypes.SessionPanel_3081);
		types.add(LciatElementTypes.SessionPanel_3094);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SessionPanel33CreationTool_title,
				Messages.SessionPanel33CreationTool_desc, types);
		entry.setId("createSessionPanel33CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/SessionPanel.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTurnTakingPanel34CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(LciatElementTypes.TurnTakingTool_3083);
		types.add(LciatElementTypes.TurnTakingTool_3096);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TurnTakingPanel34CreationTool_title,
				Messages.TurnTakingPanel34CreationTool_desc, types);
		entry.setId("createTurnTakingPanel34CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/TurnTaking.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createChat35CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(LciatElementTypes.Chat_3082);
		types.add(LciatElementTypes.Chat_3095);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Chat35CreationTool_title,
				Messages.Chat35CreationTool_desc, types);
		entry.setId("createChat35CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/Chat.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTelepointer36CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(LciatElementTypes.Telepointer_3084);
		types.add(LciatElementTypes.Telepointer_3097);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Telepointer36CreationTool_title,
				Messages.Telepointer36CreationTool_desc, types);
		entry.setId("createTelepointer36CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/Telepointer.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRadarView37CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(LciatElementTypes.RadarView_3085);
		types.add(LciatElementTypes.RadarView_3098);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.RadarView37CreationTool_title,
				Messages.RadarView37CreationTool_desc, types);
		entry.setId("createRadarView37CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/RadarView.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createProperties38CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(LciatElementTypes.Properties_3086);
		types.add(LciatElementTypes.Properties_3099);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Properties38CreationTool_title,
				Messages.Properties38CreationTool_desc, types);
		entry.setId("createProperties38CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/Properties.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createConsole39CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(LciatElementTypes.Console_3087);
		types.add(LciatElementTypes.Console_3100);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Console39CreationTool_title,
				Messages.Console39CreationTool_desc, types);
		entry.setId("createConsole39CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/Console.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createProblems40CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(LciatElementTypes.Problems_3088);
		types.add(LciatElementTypes.Problems_3101);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Problems40CreationTool_title,
				Messages.Problems40CreationTool_desc, types);
		entry.setId("createProblems40CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/Problems.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTraceability41CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Traceability41CreationTool_title,
				Messages.Traceability41CreationTool_desc,
				Collections.singletonList(LciatElementTypes.Traceability_4019));
		entry.setId("createTraceability41CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/traceability.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEnablingwoInformation43CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.EnablingwoInformation43CreationTool_title,
				Messages.EnablingwoInformation43CreationTool_desc,
				Collections.singletonList(LciatElementTypes.EnablingWOInformation_4004));
		entry.setId("createEnablingwoInformation43CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/EnablingTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEnablingwInformation44CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.EnablingwInformation44CreationTool_title,
				Messages.EnablingwInformation44CreationTool_desc,
				Collections.singletonList(LciatElementTypes.EnablingWInformation_4005));
		entry.setId("createEnablingwInformation44CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin.findImageDescriptor(
				"/org.chico.learnciat.figures/images/EnablingWithInformationPassingTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createChoice45CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Choice45CreationTool_title,
				Messages.Choice45CreationTool_desc, Collections.singletonList(LciatElementTypes.Choice_4006));
		entry.setId("createChoice45CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/DeterministicChoiceTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createConcurrency46CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Concurrency46CreationTool_title,
				Messages.Concurrency46CreationTool_desc, Collections.singletonList(LciatElementTypes.Concurrency_4007));
		entry.setId("createConcurrency46CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/IndependentConcurrencyTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCTTDiagram1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CTTDiagram1CreationTool_title,
				Messages.CTTDiagram1CreationTool_desc, Collections.singletonList(LciatElementTypes.CTTDiagram_2003));
		entry.setId("createCTTDiagram1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/CTTDiagram.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAbstractTask3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AbstractTask3CreationTool_title,
				Messages.AbstractTask3CreationTool_desc,
				Collections.singletonList(LciatElementTypes.CTTAbstractTask_3118));
		entry.setId("createAbstractTask3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/AbstractTask.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createApplicationTask4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ApplicationTask4CreationTool_title,
				Messages.ApplicationTask4CreationTool_desc,
				Collections.singletonList(LciatElementTypes.ApplicationTask_3121));
		entry.setId("createApplicationTask4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/ApplicationTask.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCollaborativeTask5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CollaborativeTask5CreationTool_title,
				Messages.CollaborativeTask5CreationTool_desc,
				Collections.singletonList(LciatElementTypes.CTTCollaborativeTask_3120));
		entry.setId("createCollaborativeTask5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/CollaborativeTask.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInteractiveTask6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InteractiveTask6CreationTool_title,
				Messages.InteractiveTask6CreationTool_desc,
				Collections.singletonList(LciatElementTypes.InteractiveTask_3119));
		entry.setId("createInteractiveTask6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/InteractionTask.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUserTask7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.UserTask7CreationTool_title,
				Messages.UserTask7CreationTool_desc, Collections.singletonList(LciatElementTypes.UserTask_3117));
		entry.setId("createUserTask7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/UserTask.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExclusiveEdition9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ExclusiveEdition9CreationTool_title,
				Messages.ExclusiveEdition9CreationTool_desc,
				Collections.singletonList(LciatElementTypes.ExclusiveEdition_3114));
		entry.setId("createExclusiveEdition9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/ExclusiveEdition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCollaborativeVisualization10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CollaborativeVisualization10CreationTool_title,
				Messages.CollaborativeVisualization10CreationTool_desc,
				Collections.singletonList(LciatElementTypes.CollaborativeVisualization_3115));
		entry.setId("createCollaborativeVisualization10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/CollaborativeVisualization.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIndividualVisualization11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.IndividualVisualization11CreationTool_title,
				Messages.IndividualVisualization11CreationTool_desc,
				Collections.singletonList(LciatElementTypes.IndividualVisualization_3116));
		entry.setId("createIndividualVisualization11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/IndividualVisualization.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAggregation13CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Aggregation13CreationTool_title,
				Messages.Aggregation13CreationTool_desc, Collections.singletonList(LciatElementTypes.Aggregation_4008));
		entry.setId("createAggregation13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/AggregationTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createConcurrencyWithInformationPassing14CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.ConcurrencyWithInformationPassing14CreationTool_title,
				Messages.ConcurrencyWithInformationPassing14CreationTool_desc,
				Collections.singletonList(LciatElementTypes.ConcurrencyWithInformationPassing_4016));
		entry.setId("createConcurrencyWithInformationPassing14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin.findImageDescriptor(
				"/org.chico.learnciat.figures/images/ConcurrencyWithInformationPassingTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDeterministicChoice15CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.DeterministicChoice15CreationTool_title,
				Messages.DeterministicChoice15CreationTool_desc,
				Collections.singletonList(LciatElementTypes.DeterministicChoice_4017));
		entry.setId("createDeterministicChoice15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/DeterministicChoiceTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDisabling16CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Disabling16CreationTool_title,
				Messages.Disabling16CreationTool_desc, Collections.singletonList(LciatElementTypes.Disabling_4010));
		entry.setId("createDisabling16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/DisablingTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDisablingWithInformationPassing17CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.DisablingWithInformationPassing17CreationTool_title,
				Messages.DisablingWithInformationPassing17CreationTool_desc,
				Collections.singletonList(LciatElementTypes.DisablingWithInformationPassing_4012));
		entry.setId("createDisablingWithInformationPassing17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin.findImageDescriptor(
				"/org.chico.learnciat.figures/images/DisablingWithInformationPassingTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEnabling18CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Enabling18CreationTool_title,
				Messages.Enabling18CreationTool_desc, Collections.singletonList(LciatElementTypes.Enabling_4009));
		entry.setId("createEnabling18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/EnablingTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEnablingWithInformationPassing19CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.EnablingWithInformationPassing19CreationTool_title,
				Messages.EnablingWithInformationPassing19CreationTool_desc,
				Collections.singletonList(LciatElementTypes.EnablingWithInformationPassing_4011));
		entry.setId("createEnablingWithInformationPassing19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin.findImageDescriptor(
				"/org.chico.learnciat.figures/images/EnablingWithInformationPassingTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIndependentConcurrency20CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.IndependentConcurrency20CreationTool_title,
				Messages.IndependentConcurrency20CreationTool_desc,
				Collections.singletonList(LciatElementTypes.IndependentConcurrency_4013));
		entry.setId("createIndependentConcurrency20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/IndependentConcurrencyTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOrderIndependence21CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.OrderIndependence21CreationTool_title,
				Messages.OrderIndependence21CreationTool_desc,
				Collections.singletonList(LciatElementTypes.OrderIndependence_4014));
		entry.setId("createOrderIndependence21CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/OrderIndependenceTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSuspendResume22CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.SuspendResume22CreationTool_title,
				Messages.SuspendResume22CreationTool_desc,
				Collections.singletonList(LciatElementTypes.SuspendResume_4015));
		entry.setId("createSuspendResume22CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/SuspendResumeTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUndeterministicChoice23CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.UndeterministicChoice23CreationTool_title,
				Messages.UndeterministicChoice23CreationTool_desc,
				Collections.singletonList(LciatElementTypes.UndeterministicChoice_4018));
		entry.setId("createUndeterministicChoice23CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/UndeterministicChoiceTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContent11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Content11CreationTool_title,
				Messages.Content11CreationTool_desc, Collections.singletonList(LciatElementTypes.MolefContent1_3003));
		entry.setId("createContent11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/MolefContent1.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContent22CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Content22CreationTool_title,
				Messages.Content22CreationTool_desc, Collections.singletonList(LciatElementTypes.MolefContent2_3004));
		entry.setId("createContent22CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/MolefContent2.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContent33CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Content33CreationTool_title,
				Messages.Content33CreationTool_desc, Collections.singletonList(LciatElementTypes.MolefContent3_3005));
		entry.setId("createContent33CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/MolefContent3.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContent44CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Content44CreationTool_title,
				Messages.Content44CreationTool_desc, Collections.singletonList(LciatElementTypes.MolefContent4_3006));
		entry.setId("createContent44CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/MolefContent4.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContent55CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Content55CreationTool_title,
				Messages.Content55CreationTool_desc, Collections.singletonList(LciatElementTypes.MolefContent5_3007));
		entry.setId("createContent55CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/MolefContent5.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContent66CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Content66CreationTool_title,
				Messages.Content66CreationTool_desc, Collections.singletonList(LciatElementTypes.MolefContent6_3008));
		entry.setId("createContent66CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/MolefContent6.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTaskandActivities17CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TaskandActivities17CreationTool_title,
				Messages.TaskandActivities17CreationTool_desc,
				Collections.singletonList(LciatElementTypes.MolefTActivities1_3009));
		entry.setId("createTaskandActivities17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/MolefTActivities1.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTaskandActivities28CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TaskandActivities28CreationTool_title,
				Messages.TaskandActivities28CreationTool_desc,
				Collections.singletonList(LciatElementTypes.MolefTActivities2_3010));
		entry.setId("createTaskandActivities28CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/MolefTActivities2.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTaskandActivities39CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TaskandActivities39CreationTool_title,
				Messages.TaskandActivities39CreationTool_desc,
				Collections.singletonList(LciatElementTypes.MolefTActivities3_3011));
		entry.setId("createTaskandActivities39CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/MolefTActivities3.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTaskandActivities410CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TaskandActivities410CreationTool_title,
				Messages.TaskandActivities410CreationTool_desc,
				Collections.singletonList(LciatElementTypes.MolefTActivities4_3012));
		entry.setId("createTaskandActivities410CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/MolefTActivities4.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTaskandActivities511CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TaskandActivities511CreationTool_title,
				Messages.TaskandActivities511CreationTool_desc,
				Collections.singletonList(LciatElementTypes.MolefTActivities5_3013));
		entry.setId("createTaskandActivities511CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/MolefTActivities5.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTaskandActivities612CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TaskandActivities612CreationTool_title,
				Messages.TaskandActivities612CreationTool_desc,
				Collections.singletonList(LciatElementTypes.MolefTActivities6_3014));
		entry.setId("createTaskandActivities612CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/MolefTActivities6.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTaskandActivities713CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TaskandActivities713CreationTool_title,
				Messages.TaskandActivities713CreationTool_desc,
				Collections.singletonList(LciatElementTypes.MolefTActivities7_3015));
		entry.setId("createTaskandActivities713CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/MolefTActivities7.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTaskandActivities814CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TaskandActivities814CreationTool_title,
				Messages.TaskandActivities814CreationTool_desc,
				Collections.singletonList(LciatElementTypes.MolefTActivities8_3016));
		entry.setId("createTaskandActivities814CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/MolefTActivities8.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSocial115CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Social115CreationTool_title,
				Messages.Social115CreationTool_desc, Collections.singletonList(LciatElementTypes.MolefSocial1_3017));
		entry.setId("createSocial115CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/MolefSocial1.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSocial216CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Social216CreationTool_title,
				Messages.Social216CreationTool_desc, Collections.singletonList(LciatElementTypes.MolefSocial2_3018));
		entry.setId("createSocial216CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/MolefSocial2.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSocial317CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Social317CreationTool_title,
				Messages.Social317CreationTool_desc, Collections.singletonList(LciatElementTypes.MolefSocial3_3019));
		entry.setId("createSocial317CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/MolefSocial3.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSocial418CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Social418CreationTool_title,
				Messages.Social418CreationTool_desc, Collections.singletonList(LciatElementTypes.MolefSocial4_3020));
		entry.setId("createSocial418CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				LciatDiagramEditorPlugin.findImageDescriptor("/org.chico.learnciat.figures/images/MolefSocial4.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPersonalization119CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Personalization119CreationTool_title,
				Messages.Personalization119CreationTool_desc,
				Collections.singletonList(LciatElementTypes.MolefPersonalization1_3021));
		entry.setId("createPersonalization119CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/MolefPersonalization1.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPersonalization220CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Personalization220CreationTool_title,
				Messages.Personalization220CreationTool_desc,
				Collections.singletonList(LciatElementTypes.MolefPersonalization2_3022));
		entry.setId("createPersonalization220CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/MolefPersonalization2.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPersonalization321CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Personalization321CreationTool_title,
				Messages.Personalization321CreationTool_desc,
				Collections.singletonList(LciatElementTypes.MolefPersonalization3_3023));
		entry.setId("createPersonalization321CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/MolefPersonalization3.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPersonalization422CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Personalization422CreationTool_title,
				Messages.Personalization422CreationTool_desc,
				Collections.singletonList(LciatElementTypes.MolefPersonalization4_3024));
		entry.setId("createPersonalization422CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/MolefPersonalization4.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPersonalization523CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Personalization523CreationTool_title,
				Messages.Personalization523CreationTool_desc,
				Collections.singletonList(LciatElementTypes.MolefPersonalization5_3025));
		entry.setId("createPersonalization523CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/MolefPersonalization5.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMultimedia124CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Multimedia124CreationTool_title,
				Messages.Multimedia124CreationTool_desc,
				Collections.singletonList(LciatElementTypes.MolefMultimedia1_3107));
		entry.setId("createMultimedia124CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/MolefMultimedia1.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMultimedia225CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Multimedia225CreationTool_title,
				Messages.Multimedia225CreationTool_desc,
				Collections.singletonList(LciatElementTypes.MolefMultimedia2_3108));
		entry.setId("createMultimedia225CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/MolefMultimedia2.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMultimedia326CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Multimedia326CreationTool_title,
				Messages.Multimedia326CreationTool_desc,
				Collections.singletonList(LciatElementTypes.MolefMultimedia3_3109));
		entry.setId("createMultimedia326CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/MolefMultimedia3.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMultimedia427CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Multimedia427CreationTool_title,
				Messages.Multimedia427CreationTool_desc,
				Collections.singletonList(LciatElementTypes.MolefMultimedia4_3110));
		entry.setId("createMultimedia427CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/MolefMultimedia4.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMultimedia528CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Multimedia528CreationTool_title,
				Messages.Multimedia528CreationTool_desc,
				Collections.singletonList(LciatElementTypes.MolefMultimedia5_3111));
		entry.setId("createMultimedia528CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/MolefMultimedia5.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMultimedia629CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Multimedia629CreationTool_title,
				Messages.Multimedia629CreationTool_desc,
				Collections.singletonList(LciatElementTypes.MolefMultimedia6_3112));
		entry.setId("createMultimedia629CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/MolefMultimedia6.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMultimedia730CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Multimedia730CreationTool_title,
				Messages.Multimedia730CreationTool_desc,
				Collections.singletonList(LciatElementTypes.MolefMultimedia7_3113));
		entry.setId("createMultimedia730CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(LciatDiagramEditorPlugin
				.findImageDescriptor("/org.chico.learnciat.figures/images/MolefMultimedia7.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
