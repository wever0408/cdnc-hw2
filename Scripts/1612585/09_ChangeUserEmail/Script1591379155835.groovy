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

WebUI.setViewPortSize(1600, 1500)

WebUI.navigateToUrl('http://localhost:8065/admin_console')

WebUI.setText(findTestObject('1612585/09_ChangeUserEmail/Page_Mattermost/input_All team communication in one place s_703ef5'), 
    'hcmus-cdnc')

WebUI.setEncryptedText(findTestObject('1612585/09_ChangeUserEmail/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('1612585/09_ChangeUserEmail/Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('1612585/09_ChangeUserEmail/Page_System Console - Mattermost/a_Users'))

WebUI.setText(findTestObject('1612585/09_ChangeUserEmail/Page_System Console - Mattermost/input_Mattermost Users_searchUsers'), 
    'ar')

WebUI.click(findTestObject('1612585/09_ChangeUserEmail/Page_System Console - Mattermost/span_janicearmstrong - Janice Armstrong'))

WebUI.click(findTestObject('1612585/09_ChangeUserEmail/Page_System Console - Mattermost/input_Email_SystemUserDetail__input form-control'))

WebUI.setText(findTestObject('1612585/09_ChangeUserEmail/Page_System Console - Mattermost/input_Email_SystemUserDetail__input form-control'), 
    email)

WebUI.click(findTestObject('1612585/09_ChangeUserEmail/Page_System Console - Mattermost/button_Save'))

WebUI.closeBrowser()

