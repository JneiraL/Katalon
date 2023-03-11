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

WebUI.navigateToUrl('https://demoqa.com/alerts')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Click me'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Click me'))

WebUI.waitForAlert(2)

WebUI.delay(5)

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Click me_1'))

WebUI.waitForAlert(2)

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.verifyTextPresent('You selected Ok', true)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Click me_1_2'))

WebUI.setAlertText('Johan')

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.verifyTextPresent('You entered Johan', true)

not_run: WebUI.closeBrowser()

