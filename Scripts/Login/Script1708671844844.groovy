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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.openBrowser('http://172.16.27.20/NewMysystemEfan/Login.aspx')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Login/Page_Login Mysystem/NRK'), '20421017')

WebUI.setText(findTestObject('Login/Page_Login Mysystem/Password'), 'password')

WebUI.delay(2)


WebUI.click(findTestObject('Login/Page_Login Mysystem/Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Page_Dashboard New Mysystem/select_- Select Module - Customer Service System'),
	'56', false)

WebUI.click(findTestObject('Page_Dashboard New Mysystem/a_Daftar Antrian'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Object Repository/Login/Page_Login Mysystem/upload'), 0)

WebUI.delay(5)

String userDir = RunConfiguration.getProjectDir()+ GlobalVariable.Hohendy

path = userDir.replace('/','\\');

WebUI.uploadFile(findTestObject('Object Repository/Login/Page_Login Mysystem/upload'), path)






