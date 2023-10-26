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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('object/Page_CURA Healthcare Service/btnMakeAppointment'))

WebUI.setText(findTestObject('object/Page_CURA Healthcare Service/txtUsername'), 'John Doe')

WebUI.setEncryptedText(findTestObject('object/Page_CURA Healthcare Service/txtPassword'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('object/Page_CURA Healthcare Service/btnLogin'))

for (def n : (0..2)) {
    WebUI.selectOptionByIndex(findTestObject('object/Page_CURA Healthcare Service/ddHealthcareCentre'), 1)

    WebUI.click(findTestObject('object/Page_CURA Healthcare Service/cbReadmission'))

    if (n == 0) {
        WebUI.click(findTestObject('object/Page_CURA Healthcare Service/cbMedicare'))
    }
	else if (n == 1) {
		WebUI.click(findTestObject('object/Page_CURA Healthcare Service/cbMedicaid'))
	}
	else {
		WebUI.click(findTestObject('object/Page_CURA Healthcare Service/cbNone'))
	}
    WebUI.setText(findTestObject('object/Page_CURA Healthcare Service/txtVisitDate'), '02/09/2022')

    WebUI.setText(findTestObject('object/Page_CURA Healthcare Service/textAreaComment'), 'I will type the comment here')

    WebUI.click(findTestObject('object/Page_CURA Healthcare Service/btnBookAppointment'))

    WebUI.verifyElementPresent(findTestObject('object/Page_CURA Healthcare Service/h2Appointment Confirmation'), 3)

    WebUI.click(findTestObject('object/Page_CURA Healthcare Service/btnGotoHomepage'))
}

WebUI.closeBrowser()

