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

WebUI.navigateToUrl('https://demoqa.com/text-box')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/span_Check Box'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/svg_Book Store API_rct-icon rct-icon-uncheck'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/span_Radio Button'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/label_Impressive'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_DEMOQA/span_Impressive'), 'Impressive')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/span_Web Tables'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Add'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_First Name_firstName'), 'Avnish kumar')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Last Name_lastName'), 'choudhary')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Email_userEmail'), 'name@example.com')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Age_age'), '22')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Salary_salary'), '50k')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Department_department'), 'QA')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Salary_salary'), '50000')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Submit'))

WebUI.closeBrowser()

