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

WebUI.click(findTestObject('Akulaku/button Akulaku'))

WebUI.click(findTestObject('bank transfer/text Order summary'))

WebUI.delay(2)

WebUI.click(findTestObject('bank transfer/text Order summary'))

WebUI.click(findTestObject('bank transfer/text pay instruction'))

WebUI.click(findTestObject('KlikBCA/button pay now'))

WebUI.delay(5)

WebUI.switchToWindowIndex(0)

WebUI.setText(findTestObject('Akulaku/input phonenumber'), '08133333333')

WebUI.click(findTestObject('Akulaku/button next'))

WebUI.switchToWindowUrl('https://simulator.sandbox.midtrans.com/akulaku/ui/openPay')

WebUI.click(findTestObject('Akulaku/button pay'))

WebUI.switchToWindowUrl('https://simulator.sandbox.midtrans.com/akulaku/ui/payment')

WebUI.verifyElementText(findTestObject('Akulaku/text Transaction is Pending'), 'Transaction is Pending')

WebUI.click(findTestObject('Akulaku/Link This page'))

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Akulaku/button submit'))

WebUI.switchToWindowUrl('https://simulator.sandbox.midtrans.com/akulaku/ui/verify')

WebUI.verifyElementText(findTestObject('Akulaku/text Transaction is Successful'), 'Transaction is Successful')

WebUI.closeBrowser()

