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

Mobile.startApplication('C:\\Users\\johan.neira\\OneDrive - SoftwareONE\\Documents\\Katalon\\Firefox Fast & Private Browser_111.0_Apkpure.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/ObjectMobile/android.widget.TextView - Buscar o ingresar direccin'), 0)

Mobile.setText(findTestObject('Object Repository/ObjectMobile/android.widget.EditText - Buscar o ingresar direccin'), 'Katalon', 
    0)

Mobile.tap(findTestObject('ObjectMobile/android.widget.TextView - Katalon'), 0)

Mobile.tap(findTestObject('Object Repository/ObjectMobile/android.view.View - IMGENES'), 0)

WebUI.delay(5)

Mobile.closeApplication()

