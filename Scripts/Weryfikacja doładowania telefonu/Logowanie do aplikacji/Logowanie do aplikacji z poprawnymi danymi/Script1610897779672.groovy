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

WebUI.openBrowser(rawUrl = GlobalVariable.url) // uruchomienie przeglądarki z adresem aplikacji
WebUI.setText(findTestObject('Object Repository/PageLogin/inp_login_id'), GlobalVariable.username) // wprowadzenie nazwy użytkownika
WebUI.click(findTestObject('Object Repository/PageLogin/btn_next')) // wciśnięcie przycisku dalej
WebUI.setEncryptedText(findTestObject('Object Repository/PageLogin/input_haso_haslo'), GlobalVariable.password) // wprowadzenie hasła
WebUI.click(findTestObject('Object Repository/PageLogin/btn_next')) // wciśnięcie przycisku zaloguj się
username_elem = WebUI.getText(findTestObject('Object Repository/PageDesktop/str_username')) // pobranie nazwy użytkownika
assert username == username_elem // sprawdzenie poprawności nazwy użytkownika
WebUI.click(findTestObject('Object Repository/PageDesktop/a_logout')) // wylogowanie z aplikacji
WebUI.closeBrowser() // zamknięcie przeglądarki