/*
 * 
 */
package lciat.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import lciat.LciatPackage;
import lciat.diagram.edit.parts.*;
import lciat.diagram.parsers.MessageFormatParser;
import lciat.diagram.part.LciatVisualIDRegistry;

/**
 * @generated
 */
public class LciatParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser sociogramName_5009Parser;

	/**
	* @generated
	*/
	private IParser getSociogramName_5009Parser() {
		if (sociogramName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getSociogram_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sociogramName_5009Parser = parser;
		}
		return sociogramName_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser learningDiagramName_5108Parser;

	/**
	* @generated
	*/
	private IParser getLearningDiagramName_5108Parser() {
		if (learningDiagramName_5108Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getLearningDiagram_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			learningDiagramName_5108Parser = parser;
		}
		return learningDiagramName_5108Parser;
	}

	/**
	* @generated
	*/
	private IParser cTTDiagramName_5124Parser;

	/**
	* @generated
	*/
	private IParser getCTTDiagramName_5124Parser() {
		if (cTTDiagramName_5124Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getCTTDiagram_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cTTDiagramName_5124Parser = parser;
		}
		return cTTDiagramName_5124Parser;
	}

	/**
	* @generated
	*/
	private IParser rolName_5001Parser;

	/**
	* @generated
	*/
	private IParser getRolName_5001Parser() {
		if (rolName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			rolName_5001Parser = parser;
		}
		return rolName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser groupName_5002Parser;

	/**
	* @generated
	*/
	private IParser getGroupName_5002Parser() {
		if (groupName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5002Parser = parser;
		}
		return groupName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser molefContent1Characteristic_5003Parser;

	/**
	* @generated
	*/
	private IParser getMolefContent1Characteristic_5003Parser() {
		if (molefContent1Characteristic_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getMolefContent1_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefContent1Characteristic_5003Parser = parser;
		}
		return molefContent1Characteristic_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser molefContent2Characteristic_5004Parser;

	/**
	* @generated
	*/
	private IParser getMolefContent2Characteristic_5004Parser() {
		if (molefContent2Characteristic_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getMolefContent2_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefContent2Characteristic_5004Parser = parser;
		}
		return molefContent2Characteristic_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser molefContent3Characteristic_5005Parser;

	/**
	* @generated
	*/
	private IParser getMolefContent3Characteristic_5005Parser() {
		if (molefContent3Characteristic_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getMolefContent3_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefContent3Characteristic_5005Parser = parser;
		}
		return molefContent3Characteristic_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser molefContent4Characteristic_5006Parser;

	/**
	* @generated
	*/
	private IParser getMolefContent4Characteristic_5006Parser() {
		if (molefContent4Characteristic_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getMolefContent4_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefContent4Characteristic_5006Parser = parser;
		}
		return molefContent4Characteristic_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser molefContent5Characteristic_5007Parser;

	/**
	* @generated
	*/
	private IParser getMolefContent5Characteristic_5007Parser() {
		if (molefContent5Characteristic_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getMolefContent5_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefContent5Characteristic_5007Parser = parser;
		}
		return molefContent5Characteristic_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser molefContent6Characteristic_5008Parser;

	/**
	* @generated
	*/
	private IParser getMolefContent6Characteristic_5008Parser() {
		if (molefContent6Characteristic_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getMolefContent6_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefContent6Characteristic_5008Parser = parser;
		}
		return molefContent6Characteristic_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser molefTActivities1Characteristic_5010Parser;

	/**
	* @generated
	*/
	private IParser getMolefTActivities1Characteristic_5010Parser() {
		if (molefTActivities1Characteristic_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getMolefTActivities1_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefTActivities1Characteristic_5010Parser = parser;
		}
		return molefTActivities1Characteristic_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser molefTActivities2Characteristic_5011Parser;

	/**
	* @generated
	*/
	private IParser getMolefTActivities2Characteristic_5011Parser() {
		if (molefTActivities2Characteristic_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getMolefTActivities2_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefTActivities2Characteristic_5011Parser = parser;
		}
		return molefTActivities2Characteristic_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser molefTActivities3Characteristic_5012Parser;

	/**
	* @generated
	*/
	private IParser getMolefTActivities3Characteristic_5012Parser() {
		if (molefTActivities3Characteristic_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getMolefTActivities3_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefTActivities3Characteristic_5012Parser = parser;
		}
		return molefTActivities3Characteristic_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser molefTActivities4Characteristic_5013Parser;

	/**
	* @generated
	*/
	private IParser getMolefTActivities4Characteristic_5013Parser() {
		if (molefTActivities4Characteristic_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getMolefTActivities4_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefTActivities4Characteristic_5013Parser = parser;
		}
		return molefTActivities4Characteristic_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser molefTActivities5Characteristic_5014Parser;

	/**
	* @generated
	*/
	private IParser getMolefTActivities5Characteristic_5014Parser() {
		if (molefTActivities5Characteristic_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getMolefTActivities5_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefTActivities5Characteristic_5014Parser = parser;
		}
		return molefTActivities5Characteristic_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser molefTActivities6Characteristic_5015Parser;

	/**
	* @generated
	*/
	private IParser getMolefTActivities6Characteristic_5015Parser() {
		if (molefTActivities6Characteristic_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getMolefTActivities6_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefTActivities6Characteristic_5015Parser = parser;
		}
		return molefTActivities6Characteristic_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser molefTActivities7Characteristic_5016Parser;

	/**
	* @generated
	*/
	private IParser getMolefTActivities7Characteristic_5016Parser() {
		if (molefTActivities7Characteristic_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getMolefTActivities7_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefTActivities7Characteristic_5016Parser = parser;
		}
		return molefTActivities7Characteristic_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser molefTActivities8Characteristic_5017Parser;

	/**
	* @generated
	*/
	private IParser getMolefTActivities8Characteristic_5017Parser() {
		if (molefTActivities8Characteristic_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getMolefTActivities8_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefTActivities8Characteristic_5017Parser = parser;
		}
		return molefTActivities8Characteristic_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser molefSocial1Characteristic_5018Parser;

	/**
	* @generated
	*/
	private IParser getMolefSocial1Characteristic_5018Parser() {
		if (molefSocial1Characteristic_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getMolefSocial1_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefSocial1Characteristic_5018Parser = parser;
		}
		return molefSocial1Characteristic_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser molefSocial2Characteristic_5019Parser;

	/**
	* @generated
	*/
	private IParser getMolefSocial2Characteristic_5019Parser() {
		if (molefSocial2Characteristic_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getMolefSocial2_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefSocial2Characteristic_5019Parser = parser;
		}
		return molefSocial2Characteristic_5019Parser;
	}

	/**
	* @generated
	*/
	private IParser molefSocial3Characteristic_5020Parser;

	/**
	* @generated
	*/
	private IParser getMolefSocial3Characteristic_5020Parser() {
		if (molefSocial3Characteristic_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getMolefSocial3_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefSocial3Characteristic_5020Parser = parser;
		}
		return molefSocial3Characteristic_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser molefSocial4Characteristic_5021Parser;

	/**
	* @generated
	*/
	private IParser getMolefSocial4Characteristic_5021Parser() {
		if (molefSocial4Characteristic_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getMolefSocial4_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefSocial4Characteristic_5021Parser = parser;
		}
		return molefSocial4Characteristic_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser molefPersonalization1Characteristic_5022Parser;

	/**
	* @generated
	*/
	private IParser getMolefPersonalization1Characteristic_5022Parser() {
		if (molefPersonalization1Characteristic_5022Parser == null) {
			EAttribute[] features = new EAttribute[] {
					LciatPackage.eINSTANCE.getMolefPersonalization1_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefPersonalization1Characteristic_5022Parser = parser;
		}
		return molefPersonalization1Characteristic_5022Parser;
	}

	/**
	* @generated
	*/
	private IParser molefPersonalization2Characteristic_5023Parser;

	/**
	* @generated
	*/
	private IParser getMolefPersonalization2Characteristic_5023Parser() {
		if (molefPersonalization2Characteristic_5023Parser == null) {
			EAttribute[] features = new EAttribute[] {
					LciatPackage.eINSTANCE.getMolefPersonalization2_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefPersonalization2Characteristic_5023Parser = parser;
		}
		return molefPersonalization2Characteristic_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser molefPersonalization3Characteristic_5024Parser;

	/**
	* @generated
	*/
	private IParser getMolefPersonalization3Characteristic_5024Parser() {
		if (molefPersonalization3Characteristic_5024Parser == null) {
			EAttribute[] features = new EAttribute[] {
					LciatPackage.eINSTANCE.getMolefPersonalization3_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefPersonalization3Characteristic_5024Parser = parser;
		}
		return molefPersonalization3Characteristic_5024Parser;
	}

	/**
	* @generated
	*/
	private IParser molefPersonalization4Characteristic_5025Parser;

	/**
	* @generated
	*/
	private IParser getMolefPersonalization4Characteristic_5025Parser() {
		if (molefPersonalization4Characteristic_5025Parser == null) {
			EAttribute[] features = new EAttribute[] {
					LciatPackage.eINSTANCE.getMolefPersonalization4_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefPersonalization4Characteristic_5025Parser = parser;
		}
		return molefPersonalization4Characteristic_5025Parser;
	}

	/**
	* @generated
	*/
	private IParser molefPersonalization5Characteristic_5026Parser;

	/**
	* @generated
	*/
	private IParser getMolefPersonalization5Characteristic_5026Parser() {
		if (molefPersonalization5Characteristic_5026Parser == null) {
			EAttribute[] features = new EAttribute[] {
					LciatPackage.eINSTANCE.getMolefPersonalization5_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefPersonalization5Characteristic_5026Parser = parser;
		}
		return molefPersonalization5Characteristic_5026Parser;
	}

	/**
	* @generated
	*/
	private IParser individualTaskName_5046Parser;

	/**
	* @generated
	*/
	private IParser getIndividualTaskName_5046Parser() {
		if (individualTaskName_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getLearningActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			individualTaskName_5046Parser = parser;
		}
		return individualTaskName_5046Parser;
	}

	/**
	* @generated
	*/
	private IParser rolName_5027Parser;

	/**
	* @generated
	*/
	private IParser getRolName_5027Parser() {
		if (rolName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			rolName_5027Parser = parser;
		}
		return rolName_5027Parser;
	}

	/**
	* @generated
	*/
	private IParser groupName_5028Parser;

	/**
	* @generated
	*/
	private IParser getGroupName_5028Parser() {
		if (groupName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5028Parser = parser;
		}
		return groupName_5028Parser;
	}

	/**
	* @generated
	*/
	private IParser graphicalEditorName_5029Parser;

	/**
	* @generated
	*/
	private IParser getGraphicalEditorName_5029Parser() {
		if (graphicalEditorName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getGraphicalEditor_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			graphicalEditorName_5029Parser = parser;
		}
		return graphicalEditorName_5029Parser;
	}

	/**
	* @generated
	*/
	private IParser textEditorName_5030Parser;

	/**
	* @generated
	*/
	private IParser getTextEditorName_5030Parser() {
		if (textEditorName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getTextEditor_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			textEditorName_5030Parser = parser;
		}
		return textEditorName_5030Parser;
	}

	/**
	* @generated
	*/
	private IParser codeEditorName_5031Parser;

	/**
	* @generated
	*/
	private IParser getCodeEditorName_5031Parser() {
		if (codeEditorName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getCodeEditor_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			codeEditorName_5031Parser = parser;
		}
		return codeEditorName_5031Parser;
	}

	/**
	* @generated
	*/
	private IParser webViewerName_5032Parser;

	/**
	* @generated
	*/
	private IParser getWebViewerName_5032Parser() {
		if (webViewerName_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getWebViewer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			webViewerName_5032Parser = parser;
		}
		return webViewerName_5032Parser;
	}

	/**
	* @generated
	*/
	private IParser assimilativeName_5033Parser;

	/**
	* @generated
	*/
	private IParser getAssimilativeName_5033Parser() {
		if (assimilativeName_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getAssimilative_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			assimilativeName_5033Parser = parser;
		}
		return assimilativeName_5033Parser;
	}

	/**
	* @generated
	*/
	private IParser informationHandlingName_5034Parser;

	/**
	* @generated
	*/
	private IParser getInformationHandlingName_5034Parser() {
		if (informationHandlingName_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getInformationHandling_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			informationHandlingName_5034Parser = parser;
		}
		return informationHandlingName_5034Parser;
	}

	/**
	* @generated
	*/
	private IParser adaptiveName_5035Parser;

	/**
	* @generated
	*/
	private IParser getAdaptiveName_5035Parser() {
		if (adaptiveName_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getAdaptive_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adaptiveName_5035Parser = parser;
		}
		return adaptiveName_5035Parser;
	}

	/**
	* @generated
	*/
	private IParser communicativeName_5036Parser;

	/**
	* @generated
	*/
	private IParser getCommunicativeName_5036Parser() {
		if (communicativeName_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getCommunicative_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			communicativeName_5036Parser = parser;
		}
		return communicativeName_5036Parser;
	}

	/**
	* @generated
	*/
	private IParser productiveName_5037Parser;

	/**
	* @generated
	*/
	private IParser getProductiveName_5037Parser() {
		if (productiveName_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getProductive_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			productiveName_5037Parser = parser;
		}
		return productiveName_5037Parser;
	}

	/**
	* @generated
	*/
	private IParser experientialName_5038Parser;

	/**
	* @generated
	*/
	private IParser getExperientialName_5038Parser() {
		if (experientialName_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getExperiential_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			experientialName_5038Parser = parser;
		}
		return experientialName_5038Parser;
	}

	/**
	* @generated
	*/
	private IParser evaluativeName_5039Parser;

	/**
	* @generated
	*/
	private IParser getEvaluativeName_5039Parser() {
		if (evaluativeName_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getEvaluative_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			evaluativeName_5039Parser = parser;
		}
		return evaluativeName_5039Parser;
	}

	/**
	* @generated
	*/
	private IParser supportName_5040Parser;

	/**
	* @generated
	*/
	private IParser getSupportName_5040Parser() {
		if (supportName_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getSupport_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			supportName_5040Parser = parser;
		}
		return supportName_5040Parser;
	}

	/**
	* @generated
	*/
	private IParser faceToFaceName_5041Parser;

	/**
	* @generated
	*/
	private IParser getFaceToFaceName_5041Parser() {
		if (faceToFaceName_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getModality_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			faceToFaceName_5041Parser = parser;
		}
		return faceToFaceName_5041Parser;
	}

	/**
	* @generated
	*/
	private IParser computerSupportedName_5042Parser;

	/**
	* @generated
	*/
	private IParser getComputerSupportedName_5042Parser() {
		if (computerSupportedName_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getModality_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			computerSupportedName_5042Parser = parser;
		}
		return computerSupportedName_5042Parser;
	}

	/**
	* @generated
	*/
	private IParser onlineName_5043Parser;

	/**
	* @generated
	*/
	private IParser getOnlineName_5043Parser() {
		if (onlineName_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getModality_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			onlineName_5043Parser = parser;
		}
		return onlineName_5043Parser;
	}

	/**
	* @generated
	*/
	private IParser toolKind_5044Parser;

	/**
	* @generated
	*/
	private IParser getToolKind_5044Parser() {
		if (toolKind_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getTool_Kind() };
			MessageFormatParser parser = new MessageFormatParser(features);
			toolKind_5044Parser = parser;
		}
		return toolKind_5044Parser;
	}

	/**
	* @generated
	*/
	private IParser objectName_5045Parser;

	/**
	* @generated
	*/
	private IParser getObjectName_5045Parser() {
		if (objectName_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			objectName_5045Parser = parser;
		}
		return objectName_5045Parser;
	}

	/**
	* @generated
	*/
	private IParser groupTaskName_5061Parser;

	/**
	* @generated
	*/
	private IParser getGroupTaskName_5061Parser() {
		if (groupTaskName_5061Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getLearningActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupTaskName_5061Parser = parser;
		}
		return groupTaskName_5061Parser;
	}

	/**
	* @generated
	*/
	private IParser rolName_5047Parser;

	/**
	* @generated
	*/
	private IParser getRolName_5047Parser() {
		if (rolName_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			rolName_5047Parser = parser;
		}
		return rolName_5047Parser;
	}

	/**
	* @generated
	*/
	private IParser groupName_5048Parser;

	/**
	* @generated
	*/
	private IParser getGroupName_5048Parser() {
		if (groupName_5048Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5048Parser = parser;
		}
		return groupName_5048Parser;
	}

	/**
	* @generated
	*/
	private IParser assimilativeName_5049Parser;

	/**
	* @generated
	*/
	private IParser getAssimilativeName_5049Parser() {
		if (assimilativeName_5049Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getAssimilative_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			assimilativeName_5049Parser = parser;
		}
		return assimilativeName_5049Parser;
	}

	/**
	* @generated
	*/
	private IParser informationHandlingName_5050Parser;

	/**
	* @generated
	*/
	private IParser getInformationHandlingName_5050Parser() {
		if (informationHandlingName_5050Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getInformationHandling_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			informationHandlingName_5050Parser = parser;
		}
		return informationHandlingName_5050Parser;
	}

	/**
	* @generated
	*/
	private IParser adaptiveName_5051Parser;

	/**
	* @generated
	*/
	private IParser getAdaptiveName_5051Parser() {
		if (adaptiveName_5051Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getAdaptive_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adaptiveName_5051Parser = parser;
		}
		return adaptiveName_5051Parser;
	}

	/**
	* @generated
	*/
	private IParser communicativeName_5052Parser;

	/**
	* @generated
	*/
	private IParser getCommunicativeName_5052Parser() {
		if (communicativeName_5052Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getCommunicative_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			communicativeName_5052Parser = parser;
		}
		return communicativeName_5052Parser;
	}

	/**
	* @generated
	*/
	private IParser productiveName_5053Parser;

	/**
	* @generated
	*/
	private IParser getProductiveName_5053Parser() {
		if (productiveName_5053Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getProductive_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			productiveName_5053Parser = parser;
		}
		return productiveName_5053Parser;
	}

	/**
	* @generated
	*/
	private IParser experientialName_5054Parser;

	/**
	* @generated
	*/
	private IParser getExperientialName_5054Parser() {
		if (experientialName_5054Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getExperiential_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			experientialName_5054Parser = parser;
		}
		return experientialName_5054Parser;
	}

	/**
	* @generated
	*/
	private IParser evaluativeName_5055Parser;

	/**
	* @generated
	*/
	private IParser getEvaluativeName_5055Parser() {
		if (evaluativeName_5055Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getEvaluative_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			evaluativeName_5055Parser = parser;
		}
		return evaluativeName_5055Parser;
	}

	/**
	* @generated
	*/
	private IParser supportName_5056Parser;

	/**
	* @generated
	*/
	private IParser getSupportName_5056Parser() {
		if (supportName_5056Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getSupport_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			supportName_5056Parser = parser;
		}
		return supportName_5056Parser;
	}

	/**
	* @generated
	*/
	private IParser faceToFaceName_5057Parser;

	/**
	* @generated
	*/
	private IParser getFaceToFaceName_5057Parser() {
		if (faceToFaceName_5057Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getModality_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			faceToFaceName_5057Parser = parser;
		}
		return faceToFaceName_5057Parser;
	}

	/**
	* @generated
	*/
	private IParser computerSupportedName_5058Parser;

	/**
	* @generated
	*/
	private IParser getComputerSupportedName_5058Parser() {
		if (computerSupportedName_5058Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getModality_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			computerSupportedName_5058Parser = parser;
		}
		return computerSupportedName_5058Parser;
	}

	/**
	* @generated
	*/
	private IParser onlineName_5059Parser;

	/**
	* @generated
	*/
	private IParser getOnlineName_5059Parser() {
		if (onlineName_5059Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getModality_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			onlineName_5059Parser = parser;
		}
		return onlineName_5059Parser;
	}

	/**
	* @generated
	*/
	private IParser objectName_5060Parser;

	/**
	* @generated
	*/
	private IParser getObjectName_5060Parser() {
		if (objectName_5060Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			objectName_5060Parser = parser;
		}
		return objectName_5060Parser;
	}

	/**
	* @generated
	*/
	private IParser abstractTaskName_5076Parser;

	/**
	* @generated
	*/
	private IParser getAbstractTaskName_5076Parser() {
		if (abstractTaskName_5076Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getLearningActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			abstractTaskName_5076Parser = parser;
		}
		return abstractTaskName_5076Parser;
	}

	/**
	* @generated
	*/
	private IParser rolName_5062Parser;

	/**
	* @generated
	*/
	private IParser getRolName_5062Parser() {
		if (rolName_5062Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			rolName_5062Parser = parser;
		}
		return rolName_5062Parser;
	}

	/**
	* @generated
	*/
	private IParser groupName_5063Parser;

	/**
	* @generated
	*/
	private IParser getGroupName_5063Parser() {
		if (groupName_5063Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getSociogramNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5063Parser = parser;
		}
		return groupName_5063Parser;
	}

	/**
	* @generated
	*/
	private IParser assimilativeName_5064Parser;

	/**
	* @generated
	*/
	private IParser getAssimilativeName_5064Parser() {
		if (assimilativeName_5064Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getAssimilative_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			assimilativeName_5064Parser = parser;
		}
		return assimilativeName_5064Parser;
	}

	/**
	* @generated
	*/
	private IParser informationHandlingName_5065Parser;

	/**
	* @generated
	*/
	private IParser getInformationHandlingName_5065Parser() {
		if (informationHandlingName_5065Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getInformationHandling_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			informationHandlingName_5065Parser = parser;
		}
		return informationHandlingName_5065Parser;
	}

	/**
	* @generated
	*/
	private IParser adaptiveName_5066Parser;

	/**
	* @generated
	*/
	private IParser getAdaptiveName_5066Parser() {
		if (adaptiveName_5066Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getAdaptive_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			adaptiveName_5066Parser = parser;
		}
		return adaptiveName_5066Parser;
	}

	/**
	* @generated
	*/
	private IParser communicativeName_5067Parser;

	/**
	* @generated
	*/
	private IParser getCommunicativeName_5067Parser() {
		if (communicativeName_5067Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getCommunicative_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			communicativeName_5067Parser = parser;
		}
		return communicativeName_5067Parser;
	}

	/**
	* @generated
	*/
	private IParser productiveName_5068Parser;

	/**
	* @generated
	*/
	private IParser getProductiveName_5068Parser() {
		if (productiveName_5068Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getProductive_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			productiveName_5068Parser = parser;
		}
		return productiveName_5068Parser;
	}

	/**
	* @generated
	*/
	private IParser experientialName_5069Parser;

	/**
	* @generated
	*/
	private IParser getExperientialName_5069Parser() {
		if (experientialName_5069Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getExperiential_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			experientialName_5069Parser = parser;
		}
		return experientialName_5069Parser;
	}

	/**
	* @generated
	*/
	private IParser evaluativeName_5070Parser;

	/**
	* @generated
	*/
	private IParser getEvaluativeName_5070Parser() {
		if (evaluativeName_5070Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getEvaluative_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			evaluativeName_5070Parser = parser;
		}
		return evaluativeName_5070Parser;
	}

	/**
	* @generated
	*/
	private IParser supportName_5071Parser;

	/**
	* @generated
	*/
	private IParser getSupportName_5071Parser() {
		if (supportName_5071Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getSupport_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			supportName_5071Parser = parser;
		}
		return supportName_5071Parser;
	}

	/**
	* @generated
	*/
	private IParser faceToFaceName_5072Parser;

	/**
	* @generated
	*/
	private IParser getFaceToFaceName_5072Parser() {
		if (faceToFaceName_5072Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getModality_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			faceToFaceName_5072Parser = parser;
		}
		return faceToFaceName_5072Parser;
	}

	/**
	* @generated
	*/
	private IParser computerSupportedName_5073Parser;

	/**
	* @generated
	*/
	private IParser getComputerSupportedName_5073Parser() {
		if (computerSupportedName_5073Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getModality_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			computerSupportedName_5073Parser = parser;
		}
		return computerSupportedName_5073Parser;
	}

	/**
	* @generated
	*/
	private IParser onlineName_5074Parser;

	/**
	* @generated
	*/
	private IParser getOnlineName_5074Parser() {
		if (onlineName_5074Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getModality_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			onlineName_5074Parser = parser;
		}
		return onlineName_5074Parser;
	}

	/**
	* @generated
	*/
	private IParser objectName_5075Parser;

	/**
	* @generated
	*/
	private IParser getObjectName_5075Parser() {
		if (objectName_5075Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			objectName_5075Parser = parser;
		}
		return objectName_5075Parser;
	}

	/**
	* @generated
	*/
	private IParser detailedAbstractTaskName_5094Parser;

	/**
	* @generated
	*/
	private IParser getDetailedAbstractTaskName_5094Parser() {
		if (detailedAbstractTaskName_5094Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getLearningActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			detailedAbstractTaskName_5094Parser = parser;
		}
		return detailedAbstractTaskName_5094Parser;
	}

	/**
	* @generated
	*/
	private IParser individualTaskName_5077Parser;

	/**
	* @generated
	*/
	private IParser getIndividualTaskName_5077Parser() {
		if (individualTaskName_5077Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getLearningActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			individualTaskName_5077Parser = parser;
		}
		return individualTaskName_5077Parser;
	}

	/**
	* @generated
	*/
	private IParser groupTaskName_5078Parser;

	/**
	* @generated
	*/
	private IParser getGroupTaskName_5078Parser() {
		if (groupTaskName_5078Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getLearningActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupTaskName_5078Parser = parser;
		}
		return groupTaskName_5078Parser;
	}

	/**
	* @generated
	*/
	private IParser abstractTaskName_5079Parser;

	/**
	* @generated
	*/
	private IParser getAbstractTaskName_5079Parser() {
		if (abstractTaskName_5079Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getLearningActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			abstractTaskName_5079Parser = parser;
		}
		return abstractTaskName_5079Parser;
	}

	/**
	* @generated
	*/
	private IParser detailedAbstractTaskName_5093Parser;

	/**
	* @generated
	*/
	private IParser getDetailedAbstractTaskName_5093Parser() {
		if (detailedAbstractTaskName_5093Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getLearningActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			detailedAbstractTaskName_5093Parser = parser;
		}
		return detailedAbstractTaskName_5093Parser;
	}

	/**
	* @generated
	*/
	private IParser sessionPanelName_5080Parser;

	/**
	* @generated
	*/
	private IParser getSessionPanelName_5080Parser() {
		if (sessionPanelName_5080Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getSessionPanel_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sessionPanelName_5080Parser = parser;
		}
		return sessionPanelName_5080Parser;
	}

	/**
	* @generated
	*/
	private IParser chatName_5081Parser;

	/**
	* @generated
	*/
	private IParser getChatName_5081Parser() {
		if (chatName_5081Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getChat_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			chatName_5081Parser = parser;
		}
		return chatName_5081Parser;
	}

	/**
	* @generated
	*/
	private IParser turnTakingToolName_5082Parser;

	/**
	* @generated
	*/
	private IParser getTurnTakingToolName_5082Parser() {
		if (turnTakingToolName_5082Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getTurnTakingTool_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			turnTakingToolName_5082Parser = parser;
		}
		return turnTakingToolName_5082Parser;
	}

	/**
	* @generated
	*/
	private IParser telepointerName_5083Parser;

	/**
	* @generated
	*/
	private IParser getTelepointerName_5083Parser() {
		if (telepointerName_5083Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getTelepointer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			telepointerName_5083Parser = parser;
		}
		return telepointerName_5083Parser;
	}

	/**
	* @generated
	*/
	private IParser radarViewName_5084Parser;

	/**
	* @generated
	*/
	private IParser getRadarViewName_5084Parser() {
		if (radarViewName_5084Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getRadarView_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			radarViewName_5084Parser = parser;
		}
		return radarViewName_5084Parser;
	}

	/**
	* @generated
	*/
	private IParser propertiesName_5085Parser;

	/**
	* @generated
	*/
	private IParser getPropertiesName_5085Parser() {
		if (propertiesName_5085Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getProperties_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			propertiesName_5085Parser = parser;
		}
		return propertiesName_5085Parser;
	}

	/**
	* @generated
	*/
	private IParser consoleName_5086Parser;

	/**
	* @generated
	*/
	private IParser getConsoleName_5086Parser() {
		if (consoleName_5086Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getConsole_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			consoleName_5086Parser = parser;
		}
		return consoleName_5086Parser;
	}

	/**
	* @generated
	*/
	private IParser problemsName_5087Parser;

	/**
	* @generated
	*/
	private IParser getProblemsName_5087Parser() {
		if (problemsName_5087Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getProblems_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			problemsName_5087Parser = parser;
		}
		return problemsName_5087Parser;
	}

	/**
	* @generated
	*/
	private IParser initName_5088Parser;

	/**
	* @generated
	*/
	private IParser getInitName_5088Parser() {
		if (initName_5088Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getInit_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			initName_5088Parser = parser;
		}
		return initName_5088Parser;
	}

	/**
	* @generated
	*/
	private IParser endName_5089Parser;

	/**
	* @generated
	*/
	private IParser getEndName_5089Parser() {
		if (endName_5089Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getEnd_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			endName_5089Parser = parser;
		}
		return endName_5089Parser;
	}

	/**
	* @generated
	*/
	private IParser temporalConditionName_5090Parser;

	/**
	* @generated
	*/
	private IParser getTemporalConditionName_5090Parser() {
		if (temporalConditionName_5090Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getTemporalCondition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			temporalConditionName_5090Parser = parser;
		}
		return temporalConditionName_5090Parser;
	}

	/**
	* @generated
	*/
	private IParser notificationName_5091Parser;

	/**
	* @generated
	*/
	private IParser getNotificationName_5091Parser() {
		if (notificationName_5091Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getNotification_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			notificationName_5091Parser = parser;
		}
		return notificationName_5091Parser;
	}

	/**
	* @generated
	*/
	private IParser conditionName_5092Parser;

	/**
	* @generated
	*/
	private IParser getConditionName_5092Parser() {
		if (conditionName_5092Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getCondition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			conditionName_5092Parser = parser;
		}
		return conditionName_5092Parser;
	}

	/**
	* @generated
	*/
	private IParser sessionPanelName_5095Parser;

	/**
	* @generated
	*/
	private IParser getSessionPanelName_5095Parser() {
		if (sessionPanelName_5095Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getSessionPanel_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sessionPanelName_5095Parser = parser;
		}
		return sessionPanelName_5095Parser;
	}

	/**
	* @generated
	*/
	private IParser chatName_5096Parser;

	/**
	* @generated
	*/
	private IParser getChatName_5096Parser() {
		if (chatName_5096Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getChat_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			chatName_5096Parser = parser;
		}
		return chatName_5096Parser;
	}

	/**
	* @generated
	*/
	private IParser turnTakingToolName_5097Parser;

	/**
	* @generated
	*/
	private IParser getTurnTakingToolName_5097Parser() {
		if (turnTakingToolName_5097Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getTurnTakingTool_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			turnTakingToolName_5097Parser = parser;
		}
		return turnTakingToolName_5097Parser;
	}

	/**
	* @generated
	*/
	private IParser telepointerName_5098Parser;

	/**
	* @generated
	*/
	private IParser getTelepointerName_5098Parser() {
		if (telepointerName_5098Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getTelepointer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			telepointerName_5098Parser = parser;
		}
		return telepointerName_5098Parser;
	}

	/**
	* @generated
	*/
	private IParser radarViewName_5099Parser;

	/**
	* @generated
	*/
	private IParser getRadarViewName_5099Parser() {
		if (radarViewName_5099Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getRadarView_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			radarViewName_5099Parser = parser;
		}
		return radarViewName_5099Parser;
	}

	/**
	* @generated
	*/
	private IParser propertiesName_5100Parser;

	/**
	* @generated
	*/
	private IParser getPropertiesName_5100Parser() {
		if (propertiesName_5100Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getProperties_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			propertiesName_5100Parser = parser;
		}
		return propertiesName_5100Parser;
	}

	/**
	* @generated
	*/
	private IParser consoleName_5101Parser;

	/**
	* @generated
	*/
	private IParser getConsoleName_5101Parser() {
		if (consoleName_5101Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getConsole_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			consoleName_5101Parser = parser;
		}
		return consoleName_5101Parser;
	}

	/**
	* @generated
	*/
	private IParser problemsName_5102Parser;

	/**
	* @generated
	*/
	private IParser getProblemsName_5102Parser() {
		if (problemsName_5102Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getProblems_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			problemsName_5102Parser = parser;
		}
		return problemsName_5102Parser;
	}

	/**
	* @generated
	*/
	private IParser initName_5103Parser;

	/**
	* @generated
	*/
	private IParser getInitName_5103Parser() {
		if (initName_5103Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getInit_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			initName_5103Parser = parser;
		}
		return initName_5103Parser;
	}

	/**
	* @generated
	*/
	private IParser endName_5104Parser;

	/**
	* @generated
	*/
	private IParser getEndName_5104Parser() {
		if (endName_5104Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getEnd_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			endName_5104Parser = parser;
		}
		return endName_5104Parser;
	}

	/**
	* @generated
	*/
	private IParser temporalConditionName_5105Parser;

	/**
	* @generated
	*/
	private IParser getTemporalConditionName_5105Parser() {
		if (temporalConditionName_5105Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getTemporalCondition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			temporalConditionName_5105Parser = parser;
		}
		return temporalConditionName_5105Parser;
	}

	/**
	* @generated
	*/
	private IParser notificationName_5106Parser;

	/**
	* @generated
	*/
	private IParser getNotificationName_5106Parser() {
		if (notificationName_5106Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getNotification_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			notificationName_5106Parser = parser;
		}
		return notificationName_5106Parser;
	}

	/**
	* @generated
	*/
	private IParser conditionName_5107Parser;

	/**
	* @generated
	*/
	private IParser getConditionName_5107Parser() {
		if (conditionName_5107Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getCondition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			conditionName_5107Parser = parser;
		}
		return conditionName_5107Parser;
	}

	/**
	* @generated
	*/
	private IParser molefMultimedia1Characteristic_5109Parser;

	/**
	* @generated
	*/
	private IParser getMolefMultimedia1Characteristic_5109Parser() {
		if (molefMultimedia1Characteristic_5109Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getMolefMultimedia1_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefMultimedia1Characteristic_5109Parser = parser;
		}
		return molefMultimedia1Characteristic_5109Parser;
	}

	/**
	* @generated
	*/
	private IParser molefMultimedia2Characteristic_5110Parser;

	/**
	* @generated
	*/
	private IParser getMolefMultimedia2Characteristic_5110Parser() {
		if (molefMultimedia2Characteristic_5110Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getMolefMultimedia2_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefMultimedia2Characteristic_5110Parser = parser;
		}
		return molefMultimedia2Characteristic_5110Parser;
	}

	/**
	* @generated
	*/
	private IParser molefMultimedia3Characteristic_5111Parser;

	/**
	* @generated
	*/
	private IParser getMolefMultimedia3Characteristic_5111Parser() {
		if (molefMultimedia3Characteristic_5111Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getMolefMultimedia3_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefMultimedia3Characteristic_5111Parser = parser;
		}
		return molefMultimedia3Characteristic_5111Parser;
	}

	/**
	* @generated
	*/
	private IParser molefMultimedia4Characteristic_5112Parser;

	/**
	* @generated
	*/
	private IParser getMolefMultimedia4Characteristic_5112Parser() {
		if (molefMultimedia4Characteristic_5112Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getMolefMultimedia4_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefMultimedia4Characteristic_5112Parser = parser;
		}
		return molefMultimedia4Characteristic_5112Parser;
	}

	/**
	* @generated
	*/
	private IParser molefMultimedia5Characteristic_5113Parser;

	/**
	* @generated
	*/
	private IParser getMolefMultimedia5Characteristic_5113Parser() {
		if (molefMultimedia5Characteristic_5113Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getMolefMultimedia5_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefMultimedia5Characteristic_5113Parser = parser;
		}
		return molefMultimedia5Characteristic_5113Parser;
	}

	/**
	* @generated
	*/
	private IParser molefMultimedia6Characteristic_5114Parser;

	/**
	* @generated
	*/
	private IParser getMolefMultimedia6Characteristic_5114Parser() {
		if (molefMultimedia6Characteristic_5114Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getMolefMultimedia6_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefMultimedia6Characteristic_5114Parser = parser;
		}
		return molefMultimedia6Characteristic_5114Parser;
	}

	/**
	* @generated
	*/
	private IParser molefMultimedia7Characteristic_5115Parser;

	/**
	* @generated
	*/
	private IParser getMolefMultimedia7Characteristic_5115Parser() {
		if (molefMultimedia7Characteristic_5115Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getMolefMultimedia7_Characteristic() };
			MessageFormatParser parser = new MessageFormatParser(features);
			molefMultimedia7Characteristic_5115Parser = parser;
		}
		return molefMultimedia7Characteristic_5115Parser;
	}

	/**
	* @generated
	*/
	private IParser exclusiveEditionName_5116Parser;

	/**
	* @generated
	*/
	private IParser getExclusiveEditionName_5116Parser() {
		if (exclusiveEditionName_5116Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getCTTTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exclusiveEditionName_5116Parser = parser;
		}
		return exclusiveEditionName_5116Parser;
	}

	/**
	* @generated
	*/
	private IParser collaborativeVisualizationName_5117Parser;

	/**
	* @generated
	*/
	private IParser getCollaborativeVisualizationName_5117Parser() {
		if (collaborativeVisualizationName_5117Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getCTTTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			collaborativeVisualizationName_5117Parser = parser;
		}
		return collaborativeVisualizationName_5117Parser;
	}

	/**
	* @generated
	*/
	private IParser individualVisualizationName_5118Parser;

	/**
	* @generated
	*/
	private IParser getIndividualVisualizationName_5118Parser() {
		if (individualVisualizationName_5118Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getCTTTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			individualVisualizationName_5118Parser = parser;
		}
		return individualVisualizationName_5118Parser;
	}

	/**
	* @generated
	*/
	private IParser userTaskName_5119Parser;

	/**
	* @generated
	*/
	private IParser getUserTaskName_5119Parser() {
		if (userTaskName_5119Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getCTTTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			userTaskName_5119Parser = parser;
		}
		return userTaskName_5119Parser;
	}

	/**
	* @generated
	*/
	private IParser cTTAbstractTaskName_5120Parser;

	/**
	* @generated
	*/
	private IParser getCTTAbstractTaskName_5120Parser() {
		if (cTTAbstractTaskName_5120Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getCTTTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cTTAbstractTaskName_5120Parser = parser;
		}
		return cTTAbstractTaskName_5120Parser;
	}

	/**
	* @generated
	*/
	private IParser interactiveTaskName_5121Parser;

	/**
	* @generated
	*/
	private IParser getInteractiveTaskName_5121Parser() {
		if (interactiveTaskName_5121Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getCTTTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			interactiveTaskName_5121Parser = parser;
		}
		return interactiveTaskName_5121Parser;
	}

	/**
	* @generated
	*/
	private IParser cTTCollaborativeTaskName_5122Parser;

	/**
	* @generated
	*/
	private IParser getCTTCollaborativeTaskName_5122Parser() {
		if (cTTCollaborativeTaskName_5122Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getCTTTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cTTCollaborativeTaskName_5122Parser = parser;
		}
		return cTTCollaborativeTaskName_5122Parser;
	}

	/**
	* @generated
	*/
	private IParser applicationTaskName_5123Parser;

	/**
	* @generated
	*/
	private IParser getApplicationTaskName_5123Parser() {
		if (applicationTaskName_5123Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getCTTTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			applicationTaskName_5123Parser = parser;
		}
		return applicationTaskName_5123Parser;
	}

	/**
	* @generated
	*/
	private IParser inheritanceCondition_6001Parser;

	/**
	* @generated
	*/
	private IParser getInheritanceCondition_6001Parser() {
		if (inheritanceCondition_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getInheritance_Condition() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inheritanceCondition_6001Parser = parser;
		}
		return inheritanceCondition_6001Parser;
	}

	/**
	* @generated
	*/
	private IParser actingName_6002Parser;

	/**
	* @generated
	*/
	private IParser getActingName_6002Parser() {
		if (actingName_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getActing_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			actingName_6002Parser = parser;
		}
		return actingName_6002Parser;
	}

	/**
	* @generated
	*/
	private IParser associationName_6003Parser;

	/**
	* @generated
	*/
	private IParser getAssociationName_6003Parser() {
		if (associationName_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getAssociation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationName_6003Parser = parser;
		}
		return associationName_6003Parser;
	}

	/**
	* @generated
	*/
	private IParser enablingWOInformationELabel_6004Parser;

	/**
	* @generated
	*/
	private IParser getEnablingWOInformationELabel_6004Parser() {
		if (enablingWOInformationELabel_6004Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getEnablingWOInformation_ELabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enablingWOInformationELabel_6004Parser = parser;
		}
		return enablingWOInformationELabel_6004Parser;
	}

	/**
	* @generated
	*/
	private IParser enablingWInformationEwLabel_6005Parser;

	/**
	* @generated
	*/
	private IParser getEnablingWInformationEwLabel_6005Parser() {
		if (enablingWInformationEwLabel_6005Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getEnablingWInformation_EwLabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enablingWInformationEwLabel_6005Parser = parser;
		}
		return enablingWInformationEwLabel_6005Parser;
	}

	/**
	* @generated
	*/
	private IParser choiceDtLabel_6006Parser;

	/**
	* @generated
	*/
	private IParser getChoiceDtLabel_6006Parser() {
		if (choiceDtLabel_6006Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getChoice_DtLabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			choiceDtLabel_6006Parser = parser;
		}
		return choiceDtLabel_6006Parser;
	}

	/**
	* @generated
	*/
	private IParser concurrencyIcLabel_6007Parser;

	/**
	* @generated
	*/
	private IParser getConcurrencyIcLabel_6007Parser() {
		if (concurrencyIcLabel_6007Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getConcurrency_IcLabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			concurrencyIcLabel_6007Parser = parser;
		}
		return concurrencyIcLabel_6007Parser;
	}

	/**
	* @generated
	*/
	private IParser enablingELabel_6008Parser;

	/**
	* @generated
	*/
	private IParser getEnablingELabel_6008Parser() {
		if (enablingELabel_6008Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getEnabling_ELabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enablingELabel_6008Parser = parser;
		}
		return enablingELabel_6008Parser;
	}

	/**
	* @generated
	*/
	private IParser disablingDLabel_6009Parser;

	/**
	* @generated
	*/
	private IParser getDisablingDLabel_6009Parser() {
		if (disablingDLabel_6009Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getDisabling_DLabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			disablingDLabel_6009Parser = parser;
		}
		return disablingDLabel_6009Parser;
	}

	/**
	* @generated
	*/
	private IParser enablingWithInformationPassingEwLabel_6010Parser;

	/**
	* @generated
	*/
	private IParser getEnablingWithInformationPassingEwLabel_6010Parser() {
		if (enablingWithInformationPassingEwLabel_6010Parser == null) {
			EAttribute[] features = new EAttribute[] {
					LciatPackage.eINSTANCE.getEnablingWithInformationPassing_EwLabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enablingWithInformationPassingEwLabel_6010Parser = parser;
		}
		return enablingWithInformationPassingEwLabel_6010Parser;
	}

	/**
	* @generated
	*/
	private IParser disablingWithInformationPassingDwLabel_6011Parser;

	/**
	* @generated
	*/
	private IParser getDisablingWithInformationPassingDwLabel_6011Parser() {
		if (disablingWithInformationPassingDwLabel_6011Parser == null) {
			EAttribute[] features = new EAttribute[] {
					LciatPackage.eINSTANCE.getDisablingWithInformationPassing_DwLabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			disablingWithInformationPassingDwLabel_6011Parser = parser;
		}
		return disablingWithInformationPassingDwLabel_6011Parser;
	}

	/**
	* @generated
	*/
	private IParser independentConcurrencyIcLabel_6012Parser;

	/**
	* @generated
	*/
	private IParser getIndependentConcurrencyIcLabel_6012Parser() {
		if (independentConcurrencyIcLabel_6012Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getIndependentConcurrency_IcLabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			independentConcurrencyIcLabel_6012Parser = parser;
		}
		return independentConcurrencyIcLabel_6012Parser;
	}

	/**
	* @generated
	*/
	private IParser orderIndependenceOiLabel_6013Parser;

	/**
	* @generated
	*/
	private IParser getOrderIndependenceOiLabel_6013Parser() {
		if (orderIndependenceOiLabel_6013Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getOrderIndependence_OiLabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			orderIndependenceOiLabel_6013Parser = parser;
		}
		return orderIndependenceOiLabel_6013Parser;
	}

	/**
	* @generated
	*/
	private IParser suspendResumeSrLabel_6014Parser;

	/**
	* @generated
	*/
	private IParser getSuspendResumeSrLabel_6014Parser() {
		if (suspendResumeSrLabel_6014Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getSuspendResume_SrLabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			suspendResumeSrLabel_6014Parser = parser;
		}
		return suspendResumeSrLabel_6014Parser;
	}

	/**
	* @generated
	*/
	private IParser concurrencyWithInformationPassingCLabel_6015Parser;

	/**
	* @generated
	*/
	private IParser getConcurrencyWithInformationPassingCLabel_6015Parser() {
		if (concurrencyWithInformationPassingCLabel_6015Parser == null) {
			EAttribute[] features = new EAttribute[] {
					LciatPackage.eINSTANCE.getConcurrencyWithInformationPassing_CLabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			concurrencyWithInformationPassingCLabel_6015Parser = parser;
		}
		return concurrencyWithInformationPassingCLabel_6015Parser;
	}

	/**
	* @generated
	*/
	private IParser deterministicChoiceDtLabel_6016Parser;

	/**
	* @generated
	*/
	private IParser getDeterministicChoiceDtLabel_6016Parser() {
		if (deterministicChoiceDtLabel_6016Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getDeterministicChoice_DtLabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deterministicChoiceDtLabel_6016Parser = parser;
		}
		return deterministicChoiceDtLabel_6016Parser;
	}

	/**
	* @generated
	*/
	private IParser undeterministicChoiceUcLabel_6017Parser;

	/**
	* @generated
	*/
	private IParser getUndeterministicChoiceUcLabel_6017Parser() {
		if (undeterministicChoiceUcLabel_6017Parser == null) {
			EAttribute[] features = new EAttribute[] { LciatPackage.eINSTANCE.getUndeterministicChoice_UcLabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			undeterministicChoiceUcLabel_6017Parser = parser;
		}
		return undeterministicChoiceUcLabel_6017Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SociogramNameEditPart.VISUAL_ID:
			return getSociogramName_5009Parser();
		case LearningDiagramNameEditPart.VISUAL_ID:
			return getLearningDiagramName_5108Parser();
		case CTTDiagramNameEditPart.VISUAL_ID:
			return getCTTDiagramName_5124Parser();
		case RolNameEditPart.VISUAL_ID:
			return getRolName_5001Parser();
		case GroupNameEditPart.VISUAL_ID:
			return getGroupName_5002Parser();
		case MolefContent1CharacteristicEditPart.VISUAL_ID:
			return getMolefContent1Characteristic_5003Parser();
		case MolefContent2CharacteristicEditPart.VISUAL_ID:
			return getMolefContent2Characteristic_5004Parser();
		case MolefContent3CharacteristicEditPart.VISUAL_ID:
			return getMolefContent3Characteristic_5005Parser();
		case MolefContent4CharacteristicEditPart.VISUAL_ID:
			return getMolefContent4Characteristic_5006Parser();
		case MolefContent5CharacteristicEditPart.VISUAL_ID:
			return getMolefContent5Characteristic_5007Parser();
		case MolefContent6CharacteristicEditPart.VISUAL_ID:
			return getMolefContent6Characteristic_5008Parser();
		case MolefTActivities1CharacteristicEditPart.VISUAL_ID:
			return getMolefTActivities1Characteristic_5010Parser();
		case MolefTActivities2CharacteristicEditPart.VISUAL_ID:
			return getMolefTActivities2Characteristic_5011Parser();
		case MolefTActivities3CharacteristicEditPart.VISUAL_ID:
			return getMolefTActivities3Characteristic_5012Parser();
		case MolefTActivities4CharacteristicEditPart.VISUAL_ID:
			return getMolefTActivities4Characteristic_5013Parser();
		case MolefTActivities5CharacteristicEditPart.VISUAL_ID:
			return getMolefTActivities5Characteristic_5014Parser();
		case MolefTActivities6CharacteristicEditPart.VISUAL_ID:
			return getMolefTActivities6Characteristic_5015Parser();
		case MolefTActivities7CharacteristicEditPart.VISUAL_ID:
			return getMolefTActivities7Characteristic_5016Parser();
		case MolefTActivities8CharacteristicEditPart.VISUAL_ID:
			return getMolefTActivities8Characteristic_5017Parser();
		case MolefSocial1CharacteristicEditPart.VISUAL_ID:
			return getMolefSocial1Characteristic_5018Parser();
		case MolefSocial2CharacteristicEditPart.VISUAL_ID:
			return getMolefSocial2Characteristic_5019Parser();
		case MolefSocial3CharacteristicEditPart.VISUAL_ID:
			return getMolefSocial3Characteristic_5020Parser();
		case MolefSocial4CharacteristicEditPart.VISUAL_ID:
			return getMolefSocial4Characteristic_5021Parser();
		case MolefPersonalization1CharacteristicEditPart.VISUAL_ID:
			return getMolefPersonalization1Characteristic_5022Parser();
		case MolefPersonalization2CharacteristicEditPart.VISUAL_ID:
			return getMolefPersonalization2Characteristic_5023Parser();
		case MolefPersonalization3CharacteristicEditPart.VISUAL_ID:
			return getMolefPersonalization3Characteristic_5024Parser();
		case MolefPersonalization4CharacteristicEditPart.VISUAL_ID:
			return getMolefPersonalization4Characteristic_5025Parser();
		case MolefPersonalization5CharacteristicEditPart.VISUAL_ID:
			return getMolefPersonalization5Characteristic_5026Parser();
		case IndividualTaskNameEditPart.VISUAL_ID:
			return getIndividualTaskName_5046Parser();
		case RolName2EditPart.VISUAL_ID:
			return getRolName_5027Parser();
		case GroupName2EditPart.VISUAL_ID:
			return getGroupName_5028Parser();
		case GraphicalEditorNameEditPart.VISUAL_ID:
			return getGraphicalEditorName_5029Parser();
		case TextEditorNameEditPart.VISUAL_ID:
			return getTextEditorName_5030Parser();
		case CodeEditorNameEditPart.VISUAL_ID:
			return getCodeEditorName_5031Parser();
		case WebViewerNameEditPart.VISUAL_ID:
			return getWebViewerName_5032Parser();
		case AssimilativeNameEditPart.VISUAL_ID:
			return getAssimilativeName_5033Parser();
		case InformationHandlingNameEditPart.VISUAL_ID:
			return getInformationHandlingName_5034Parser();
		case AdaptiveNameEditPart.VISUAL_ID:
			return getAdaptiveName_5035Parser();
		case CommunicativeNameEditPart.VISUAL_ID:
			return getCommunicativeName_5036Parser();
		case ProductiveNameEditPart.VISUAL_ID:
			return getProductiveName_5037Parser();
		case ExperientialNameEditPart.VISUAL_ID:
			return getExperientialName_5038Parser();
		case EvaluativeNameEditPart.VISUAL_ID:
			return getEvaluativeName_5039Parser();
		case SupportNameEditPart.VISUAL_ID:
			return getSupportName_5040Parser();
		case FaceToFaceNameEditPart.VISUAL_ID:
			return getFaceToFaceName_5041Parser();
		case ComputerSupportedNameEditPart.VISUAL_ID:
			return getComputerSupportedName_5042Parser();
		case OnlineNameEditPart.VISUAL_ID:
			return getOnlineName_5043Parser();
		case ToolKindEditPart.VISUAL_ID:
			return getToolKind_5044Parser();
		case ObjectNameEditPart.VISUAL_ID:
			return getObjectName_5045Parser();
		case GroupTaskNameEditPart.VISUAL_ID:
			return getGroupTaskName_5061Parser();
		case RolName3EditPart.VISUAL_ID:
			return getRolName_5047Parser();
		case GroupName3EditPart.VISUAL_ID:
			return getGroupName_5048Parser();
		case AssimilativeName2EditPart.VISUAL_ID:
			return getAssimilativeName_5049Parser();
		case InformationHandlingName2EditPart.VISUAL_ID:
			return getInformationHandlingName_5050Parser();
		case AdaptiveName2EditPart.VISUAL_ID:
			return getAdaptiveName_5051Parser();
		case CommunicativeName2EditPart.VISUAL_ID:
			return getCommunicativeName_5052Parser();
		case ProductiveName2EditPart.VISUAL_ID:
			return getProductiveName_5053Parser();
		case ExperientialName2EditPart.VISUAL_ID:
			return getExperientialName_5054Parser();
		case EvaluativeName2EditPart.VISUAL_ID:
			return getEvaluativeName_5055Parser();
		case SupportName2EditPart.VISUAL_ID:
			return getSupportName_5056Parser();
		case FaceToFaceName2EditPart.VISUAL_ID:
			return getFaceToFaceName_5057Parser();
		case ComputerSupportedName2EditPart.VISUAL_ID:
			return getComputerSupportedName_5058Parser();
		case OnlineName2EditPart.VISUAL_ID:
			return getOnlineName_5059Parser();
		case ObjectName2EditPart.VISUAL_ID:
			return getObjectName_5060Parser();
		case AbstractTaskNameEditPart.VISUAL_ID:
			return getAbstractTaskName_5076Parser();
		case RolName4EditPart.VISUAL_ID:
			return getRolName_5062Parser();
		case GroupName4EditPart.VISUAL_ID:
			return getGroupName_5063Parser();
		case AssimilativeName3EditPart.VISUAL_ID:
			return getAssimilativeName_5064Parser();
		case InformationHandlingName3EditPart.VISUAL_ID:
			return getInformationHandlingName_5065Parser();
		case AdaptiveName3EditPart.VISUAL_ID:
			return getAdaptiveName_5066Parser();
		case CommunicativeName3EditPart.VISUAL_ID:
			return getCommunicativeName_5067Parser();
		case ProductiveName3EditPart.VISUAL_ID:
			return getProductiveName_5068Parser();
		case ExperientialName3EditPart.VISUAL_ID:
			return getExperientialName_5069Parser();
		case EvaluativeName3EditPart.VISUAL_ID:
			return getEvaluativeName_5070Parser();
		case SupportName3EditPart.VISUAL_ID:
			return getSupportName_5071Parser();
		case FaceToFaceName3EditPart.VISUAL_ID:
			return getFaceToFaceName_5072Parser();
		case ComputerSupportedName3EditPart.VISUAL_ID:
			return getComputerSupportedName_5073Parser();
		case OnlineName3EditPart.VISUAL_ID:
			return getOnlineName_5074Parser();
		case ObjectName3EditPart.VISUAL_ID:
			return getObjectName_5075Parser();
		case DetailedAbstractTaskNameEditPart.VISUAL_ID:
			return getDetailedAbstractTaskName_5094Parser();
		case IndividualTaskName2EditPart.VISUAL_ID:
			return getIndividualTaskName_5077Parser();
		case GroupTaskName2EditPart.VISUAL_ID:
			return getGroupTaskName_5078Parser();
		case AbstractTaskName2EditPart.VISUAL_ID:
			return getAbstractTaskName_5079Parser();
		case DetailedAbstractTaskName2EditPart.VISUAL_ID:
			return getDetailedAbstractTaskName_5093Parser();
		case SessionPanelNameEditPart.VISUAL_ID:
			return getSessionPanelName_5080Parser();
		case ChatNameEditPart.VISUAL_ID:
			return getChatName_5081Parser();
		case TurnTakingToolNameEditPart.VISUAL_ID:
			return getTurnTakingToolName_5082Parser();
		case TelepointerNameEditPart.VISUAL_ID:
			return getTelepointerName_5083Parser();
		case RadarViewNameEditPart.VISUAL_ID:
			return getRadarViewName_5084Parser();
		case PropertiesNameEditPart.VISUAL_ID:
			return getPropertiesName_5085Parser();
		case ConsoleNameEditPart.VISUAL_ID:
			return getConsoleName_5086Parser();
		case ProblemsNameEditPart.VISUAL_ID:
			return getProblemsName_5087Parser();
		case InitNameEditPart.VISUAL_ID:
			return getInitName_5088Parser();
		case EndNameEditPart.VISUAL_ID:
			return getEndName_5089Parser();
		case TemporalConditionNameEditPart.VISUAL_ID:
			return getTemporalConditionName_5090Parser();
		case NotificationNameEditPart.VISUAL_ID:
			return getNotificationName_5091Parser();
		case ConditionNameEditPart.VISUAL_ID:
			return getConditionName_5092Parser();
		case SessionPanelName2EditPart.VISUAL_ID:
			return getSessionPanelName_5095Parser();
		case ChatName2EditPart.VISUAL_ID:
			return getChatName_5096Parser();
		case TurnTakingToolName2EditPart.VISUAL_ID:
			return getTurnTakingToolName_5097Parser();
		case TelepointerName2EditPart.VISUAL_ID:
			return getTelepointerName_5098Parser();
		case RadarViewName2EditPart.VISUAL_ID:
			return getRadarViewName_5099Parser();
		case PropertiesName2EditPart.VISUAL_ID:
			return getPropertiesName_5100Parser();
		case ConsoleName2EditPart.VISUAL_ID:
			return getConsoleName_5101Parser();
		case ProblemsName2EditPart.VISUAL_ID:
			return getProblemsName_5102Parser();
		case InitName2EditPart.VISUAL_ID:
			return getInitName_5103Parser();
		case EndName2EditPart.VISUAL_ID:
			return getEndName_5104Parser();
		case TemporalConditionName2EditPart.VISUAL_ID:
			return getTemporalConditionName_5105Parser();
		case NotificationName2EditPart.VISUAL_ID:
			return getNotificationName_5106Parser();
		case ConditionName2EditPart.VISUAL_ID:
			return getConditionName_5107Parser();
		case MolefMultimedia1CharacteristicEditPart.VISUAL_ID:
			return getMolefMultimedia1Characteristic_5109Parser();
		case MolefMultimedia2CharacteristicEditPart.VISUAL_ID:
			return getMolefMultimedia2Characteristic_5110Parser();
		case MolefMultimedia3CharacteristicEditPart.VISUAL_ID:
			return getMolefMultimedia3Characteristic_5111Parser();
		case MolefMultimedia4CharacteristicEditPart.VISUAL_ID:
			return getMolefMultimedia4Characteristic_5112Parser();
		case MolefMultimedia5CharacteristicEditPart.VISUAL_ID:
			return getMolefMultimedia5Characteristic_5113Parser();
		case MolefMultimedia6CharacteristicEditPart.VISUAL_ID:
			return getMolefMultimedia6Characteristic_5114Parser();
		case MolefMultimedia7CharacteristicEditPart.VISUAL_ID:
			return getMolefMultimedia7Characteristic_5115Parser();
		case ExclusiveEditionNameEditPart.VISUAL_ID:
			return getExclusiveEditionName_5116Parser();
		case CollaborativeVisualizationNameEditPart.VISUAL_ID:
			return getCollaborativeVisualizationName_5117Parser();
		case IndividualVisualizationNameEditPart.VISUAL_ID:
			return getIndividualVisualizationName_5118Parser();
		case UserTaskNameEditPart.VISUAL_ID:
			return getUserTaskName_5119Parser();
		case CTTAbstractTaskNameEditPart.VISUAL_ID:
			return getCTTAbstractTaskName_5120Parser();
		case InteractiveTaskNameEditPart.VISUAL_ID:
			return getInteractiveTaskName_5121Parser();
		case CTTCollaborativeTaskNameEditPart.VISUAL_ID:
			return getCTTCollaborativeTaskName_5122Parser();
		case ApplicationTaskNameEditPart.VISUAL_ID:
			return getApplicationTaskName_5123Parser();
		case InheritanceConditionEditPart.VISUAL_ID:
			return getInheritanceCondition_6001Parser();
		case ActingNameEditPart.VISUAL_ID:
			return getActingName_6002Parser();
		case AssociationNameEditPart.VISUAL_ID:
			return getAssociationName_6003Parser();
		case EnablingWOInformationELabelEditPart.VISUAL_ID:
			return getEnablingWOInformationELabel_6004Parser();
		case EnablingWInformationEwLabelEditPart.VISUAL_ID:
			return getEnablingWInformationEwLabel_6005Parser();
		case ChoiceDtLabelEditPart.VISUAL_ID:
			return getChoiceDtLabel_6006Parser();
		case ConcurrencyIcLabelEditPart.VISUAL_ID:
			return getConcurrencyIcLabel_6007Parser();
		case EnablingELabelEditPart.VISUAL_ID:
			return getEnablingELabel_6008Parser();
		case DisablingDLabelEditPart.VISUAL_ID:
			return getDisablingDLabel_6009Parser();
		case EnablingWithInformationPassingEwLabelEditPart.VISUAL_ID:
			return getEnablingWithInformationPassingEwLabel_6010Parser();
		case DisablingWithInformationPassingDwLabelEditPart.VISUAL_ID:
			return getDisablingWithInformationPassingDwLabel_6011Parser();
		case IndependentConcurrencyIcLabelEditPart.VISUAL_ID:
			return getIndependentConcurrencyIcLabel_6012Parser();
		case OrderIndependenceOiLabelEditPart.VISUAL_ID:
			return getOrderIndependenceOiLabel_6013Parser();
		case SuspendResumeSrLabelEditPart.VISUAL_ID:
			return getSuspendResumeSrLabel_6014Parser();
		case ConcurrencyWithInformationPassingCLabelEditPart.VISUAL_ID:
			return getConcurrencyWithInformationPassingCLabel_6015Parser();
		case DeterministicChoiceDtLabelEditPart.VISUAL_ID:
			return getDeterministicChoiceDtLabel_6016Parser();
		case UndeterministicChoiceUcLabelEditPart.VISUAL_ID:
			return getUndeterministicChoiceUcLabel_6017Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(LciatVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(LciatVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (LciatElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
