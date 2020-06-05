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

WebUI.navigateToUrl('http://localhost:8065/admin_console')

WebUI.setText(findTestObject('1512194/25_CORS_Setting/Page_Mattermost/input_All team communication in one place s_703ef5'), 
    'hcmus-cdnc')

WebUI.setEncryptedText(findTestObject('1512194/25_CORS_Setting/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('1512194/25_CORS_Setting/Page_Mattermost/button_Sign in'))

WebUI.setText(findTestObject('1512194/25_CORS_Setting/Page_System Console - Mattermost/input_hcmus-cdnc_adminSidebarFilter'), 
    'cor')

WebUI.click(findTestObject('1512194/25_CORS_Setting/Page_System Console - Mattermost/a_CORS'))

String[] hosts = ["https://facebook.com ", "https://news.com ", "https://mastermost.com ", "http://localhost:3000"]
String tmp = ''
for(String host : hosts) {
	tmp += host
	WebUI.setText(findTestObject('1512194/25_CORS_Setting/Page_System Console - Mattermost/input_Enable cross-origin requests from_Ser_d74bcf'), 
			tmp)
}
WebUI.click(findTestObject('1512194/25_CORS_Setting/Page_System Console - Mattermost/button_Save'))


WebUI.closeBrowser()

