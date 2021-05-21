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

WebUI.callTestCase(findTestCase('Midtrans V2/TCMD01 Open Midtrans Website'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Midtrans_Front_Page/btn_buy_now'))

WebUI.click(findTestObject('Midtrans_Shopping_Cart/txt_name'))

WebUI.clearText(findTestObject('Midtrans_Shopping_Cart/txt_name'))

WebUI.click(findTestObject('Midtrans_Shopping_Cart/txt_email'))

WebUI.clearText(findTestObject('Midtrans_Shopping_Cart/txt_email'))

WebUI.click(findTestObject('Midtrans_Shopping_Cart/txt_phone_number'))

WebUI.clearText(findTestObject('Midtrans_Shopping_Cart/txt_phone_number'))

WebUI.click(findTestObject('Midtrans_Shopping_Cart/txt_city'))

WebUI.clearText(findTestObject('Midtrans_Shopping_Cart/txt_city'))

WebUI.click(findTestObject('Midtrans_Shopping_Cart/txt_address'))

WebUI.clearText(findTestObject('Midtrans_Shopping_Cart/txt_address'))

WebUI.click(findTestObject('Midtrans_Shopping_Cart/txt_postal_code'))

WebUI.clearText(findTestObject('Midtrans_Shopping_Cart/txt_postal_code'))

WebUI.click(findTestObject('Midtrans_Shopping_Cart/btn_checkout'))

WebUI.verifyElementText(findTestObject('Midtrans_Front_Page/ttl_error_message_field_required'), 'Something went wrong')

