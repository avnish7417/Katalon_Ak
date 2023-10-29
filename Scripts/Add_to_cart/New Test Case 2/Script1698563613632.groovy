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

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Accepted usernames arestandard_userlock_0d4679'))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_user-name'), 'standard_user')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Password for all userssecret_sauce'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_login-button'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Swag Labs/div_29.99'), '$29.99')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Swag Labs/div_9.99'), '$9.99')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart_1'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/button_Checkout'), 0)

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_firstName'), 'a')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Cancel_continue'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Swag Labs/h3_Error Last Name is required'), 'Error: Last Name is required')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_firstName'), 'avnish')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_lastName'), 'kumar')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Cancel_continue'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Swag Labs/h3_Error Postal Code is required'), 'Error: Postal Code is required')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_postalCode'), '12345')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Cancel_continue'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Description'))

WebUI.rightClick(findTestObject('Object Repository/Page_Swag Labs/div_Description'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Swag Labs/button_Finish'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Swag Labs/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Finish'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Swag Labs/button_Back Home'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Swag Labs/h2_Thank you for your order'), 'Thank you for your order!')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Back Home'))

WebUI.closeBrowser()
