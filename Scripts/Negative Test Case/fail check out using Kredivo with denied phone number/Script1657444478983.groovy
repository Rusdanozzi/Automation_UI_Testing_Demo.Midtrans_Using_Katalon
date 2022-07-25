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

WebUI.navigateToUrl('https://demo.midtrans.com/')

WebUI.delay(3)

WebUI.click(findTestObject('button Buy Now'))

WebUI.click(findTestObject('button Checkout'))

WebUI.switchToFrame(findTestObject('Frame select method'), 3)

WebUI.click(findTestObject('Kredivo/button kredivo'))

WebUI.click(findTestObject('bank transfer/text Order summary'))

WebUI.delay(2)

WebUI.click(findTestObject('bank transfer/text Order summary'))

WebUI.click(findTestObject('bank transfer/text pay instruction'))

WebUI.click(findTestObject('KlikBCA/button pay now'))

WebUI.delay(5)

WebUI.switchToWindowIndex(0)

WebUI.setText(findTestObject('Kredivo/input phone number'), '081321321321')

WebUI.setText(findTestObject('Kredivo/input pin'), '123456')

WebUI.click(findTestObject('Kredivo/button next'))

WebUI.switchToWindowUrl('https://simulator.sandbox.midtrans.com/kredivo/ui/verify')

WebUI.setText(findTestObject('Kredivo/input OTP'), '1234')

WebUI.click(findTestObject('Kredivo/button next'))

WebUI.switchToWindowUrl('https://simulator.sandbox.midtrans.com/kredivo/ui/otpVerify')

WebUI.verifyElementText(findTestObject('Kredivo/text Transaction is Denied'), 'Transaction is Denied')

WebUI.closeBrowser()

