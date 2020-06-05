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

WebUI.setText(findTestObject('1612585/06_ChangeEmail/Page_Mattermost/input_All team communication in one place s_703ef5'), 
    'hcmus-cdnc')

WebUI.click(findTestObject('1612585/06_ChangeEmail/Page_Mattermost/input_All team communication in one place s_703ef5'))

WebUI.setText(findTestObject('1612585/06_ChangeEmail/Page_Mattermost/input_All team communication in one place s_703ef5'), 
    'hcmus-cdnc')

WebUI.setEncryptedText(findTestObject('1612585/06_ChangeEmail/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('1612585/06_ChangeEmail/Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('1612585/06_ChangeEmail/Page_Town Square - minus Mattermost/svg'))

WebUI.click(findTestObject('1612585/06_ChangeEmail/Page_Town Square - minus Mattermost/span_Account Settings'))

WebUI.click(findTestObject('1612585/06_ChangeEmail/Page_Town Square - minus Mattermost/span_Edit'))

WebUI.setText(findTestObject('1612585/06_ChangeEmail/Page_Town Square - minus Mattermost/input_New Email_primaryEmail'), 
    email)

WebUI.setText(findTestObject('1612585/06_ChangeEmail/Page_Town Square - minus Mattermost/input_Confirm Email_confirmEmail'), 
    confirm_email)

WebUI.setEncryptedText(findTestObject('1612585/06_ChangeEmail/Page_Town Square - minus Mattermost/input_Current Password_currentPassword'), 
    password)

WebUI.click(findTestObject('1612585/06_ChangeEmail/Page_Town Square - minus Mattermost/span_Save'))

WebUI.closeBrowser()

