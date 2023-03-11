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

WebUI.callTestCase(findTestCase('2 Loginpage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/DataObj/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Seoul CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/DataObj/input_Apply for hospital readmission_hospit_63901f'))

WebUI.click(findTestObject('Object Repository/DataObj/label_Medicaid'))

WebUI.click(findTestObject('Object Repository/DataObj/div_Visit Date (Required)_input-group-addon'))

WebUI.click(findTestObject('Object Repository/DataObj/td_26'))

WebUI.setText(findTestObject('Object Repository/DataObj/textarea_Comment_comment'), 'Prueba Demo ')

WebUI.click(findTestObject('Object Repository/DataObj/button_Book Appointment'))

WebUI.verifyTextPresent('Prueba Demo ', true)

WebUI.callTestCase(findTestCase('closebrowser'), [:], FailureHandling.STOP_ON_FAILURE)

