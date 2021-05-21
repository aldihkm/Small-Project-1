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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('Midtrans_Front_Page/btn_buy_now'))

WebUI.click(findTestObject('Object Repository/Midtrans_Shopping_Cart/txt_name'))

WebUI.clearText(findTestObject('Object Repository/Midtrans_Shopping_Cart/txt_name'))
//WebUI.sendKeys(findTestObject('Midtrans_Shopping_Cart/txt_email'), Keys.chord(Keys.CONTROL, ‘a’))
//WebUI.sendKeys(findTestObject('Midtrans_Shopping_Cart/txt_email'), Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('Midtrans_Shopping_Cart/btn_checkout'))

WebUI.getText(findTestObject('Object Repository/Midtrans_Front_Page/ttl_error_message_field_required'))

WebUI.verifyElementText(findTestObject('Object Repository/Midtrans_Front_Page/ttl_error_message'), 'Sorry, something went wrong.')