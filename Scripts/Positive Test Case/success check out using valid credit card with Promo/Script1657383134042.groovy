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

WebUI.click(findTestObject('Credit card/button Credit card'))

WebUI.setText(findTestObject('Credit card/Input Card number'), '4811111111111114')

WebUI.setText(findTestObject('Credit card/Input Expiration Date'), '0125')

WebUI.setText(findTestObject('Credit card/Input Card CVV'), '123')

WebUI.click(findTestObject('Credit card/button promo installment'))

WebUI.verifyElementText(findTestObject('Credit card/Text Promo installment'), 'Rp15.000')

WebUI.click(findTestObject('Credit card/button demo promo engine'))

WebUI.verifyElementText(findTestObject('Credit card/Text Promo installment'), 'Rp18.000')

WebUI.click(findTestObject('Credit card/button promo midtrans'))

WebUI.verifyElementText(findTestObject('Credit card/Text Promo installment'), 'Rp18.000')

WebUI.click(findTestObject('Credit card/button potongan 10 rupiah'))

WebUI.verifyElementText(findTestObject('Credit card/Text Promo installment'), 'Rp19.990')

WebUI.click(findTestObject('Credit card/Button Pay Now on CC'))

WebUI.switchToFrame(findTestObject('Credit card/Frame Issuing Bank'), 3)

WebUI.setText(findTestObject('Credit card/Input Password in Issuing Bank'), '112233')

WebUI.click(findTestObject('Credit card/button OK in Issuing Bank'))

WebUI.delay(5)

WebUI.switchToDefaultContent()

WebUI.verifyElementText(findTestObject('Credit card/Text Transaction Success'), 'Thank you for your purchase.')

WebUI.closeBrowser()

