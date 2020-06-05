import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8065/login')

WebUI.setText(findTestObject('1512194/22_DirectMessage/Page_Mattermost/input_All team communication in one place s_703ef5'), 
    'hcmus-cdnc')

WebUI.setEncryptedText(findTestObject('1512194/22_DirectMessage/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    'aeHFOx8jV/A=')

WebUI.sendKeys(findTestObject('1512194/22_DirectMessage/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('1512194/22_DirectMessage/Page_Town Square - eligendi Mattermost/span_'))
String[] keys = ["me", "s"]
for(String key : keys) {
	
	WebUI.setText(findTestObject('1512194/22_DirectMessage/Page_Town Square - eligendi Mattermost/input_Search and add members_react-select-2-input'), 
			key)
	if(key == "me"){
		WebUI.click(findTestObject('1512194/22_DirectMessage/Page_Town Square - eligendi Mattermost/span_aaronmedina - Aaron Medina (Centidel)'))
	}
}

WebUI.click(findTestObject('1512194/22_DirectMessage/Page_Town Square - eligendi Mattermost/div_aaronpeterson - Aaron Petersonuser-7sam_dd566b'))

WebUI.click(findTestObject('1512194/22_DirectMessage/Page_Town Square - eligendi Mattermost/div_user-36samplemattermostcom_more-modal___2272d4'))

WebUI.click(findTestObject('1512194/22_DirectMessage/Page_Town Square - eligendi Mattermost/button_Go'))

WebUI.closeBrowser()

