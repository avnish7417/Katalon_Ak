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

WebUI.click(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/a_Simple Form Demo'))

WebUI.setText(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_Single Input Field_user-message'), 
    'Avnish')

WebUI.click(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/button_Get Checked Value'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/p_Avnish'), 
    'Avnish')

WebUI.setText(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_Two Input Fields_sum1'), 
    'Avnish')

WebUI.setText(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_Two Input Fields_sum2'), 
    'Kumar')

WebUI.click(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/button_Get Sum'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/p_Entered value is not a number'), 
    'Entered value is not a number')

WebUI.closeBrowser()

