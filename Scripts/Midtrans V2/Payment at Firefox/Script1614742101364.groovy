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

WebUI.callTestCase(findTestCase('Midtrans V2/TCMD02 Checkout Shopping Cart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Midtrans V2/TCMD03 Order Summary'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Midtrans_Select_Payment/btn_cc'))

WebUI.delay(3)

WebUI.click(findTestObject('Midtrans_CC_Payment/txt_cc_number'))

WebUI.setText(findTestObject('Midtrans_CC_Payment/txt_cc_number'), '4911111111111113')

WebUI.setText(findTestObject('Midtrans_CC_Payment/txt_cc_expiry_date'), '01/25')

WebUI.setText(findTestObject('Midtrans_CC_Payment/txt_cvv'), '123')

WebUI.click(findTestObject('Midtrans_CC_Payment/btn_pay_now'))

WebUI.switchToFrame(findTestObject('Object Repository/Midtrans_OTP_Page/frm_otp_firefox2'), 5)

//WebUI.verifyElementPresent(findTestObject('Midtrans_OTP_Page/ttl_issuing_bank'), 0)
WebUI.delay(2)

WebUI.click(findTestObject('Midtrans_OTP_Page/txt_otp_code'))

WebUI.setText(findTestObject('Midtrans_OTP_Page/txt_otp_code'), '112233')

WebUI.click(findTestObject('Midtrans_OTP_Page/btn_ok'))

WebUI.switchToFrame(findTestObject('Midtrans_Order_Summary/frm_order_summary'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Midtrans_Final_Page/ttl_failed'), 2)