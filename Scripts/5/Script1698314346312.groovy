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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.lambdatest.com/selenium-playground/')

WebUI.click(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/a_Auto Healing'))

WebUI.setText(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_Username_name'), 
    'Avnish')

WebUI.waitForElementVisible(findTestObject('Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_Username_name'), 2)

WebUI.setEncryptedText(findTestObject('object/Page_Selenium Grid Online  Run Selenium Test On Cloud/input_Password_password'), 
    'YH95lU/pKaZr7Xkw3eKSdA==')

WebUI.click(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/p_Login Successful'), 
    'Login Successful')

WebUI.closeBrowser()

