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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(rawUrl = GlobalVariable.url) // uruchomienie przeglądarki z adresem aplikacji
WebUI.maximizeWindow() // zmiana wielkości okna
WebUI.setText(findTestObject('Object Repository/PageLogin/inp_login_id'), GlobalVariable.username) // wprowadzenie nazwy użytkownika
WebUI.click(findTestObject('Object Repository/PageLogin/btn_next')) // wciśnięcie przycisku dalej
WebUI.setEncryptedText(findTestObject('Object Repository/PageLogin/input_haso_haslo'), GlobalVariable.password) // wprowadzenie hasła
WebUI.click(findTestObject('Object Repository/PageLogin/btn_next')) // wciśnięcie przycisku zaloguj się
WebUI.selectOptionByIndex(findTestObject('Object Repository/PageDesktop/sel_tel_receiver'), 1) //wybranie odbiorcy doladowania
WebUI.setText(findTestObject('Object Repository/PageDesktop/inp_tel_amount'), tel_amount) // wartosc doladowania
WebUI.click(findTestObject('Object Repository/PageDesktop/inp_tel_agreement')) // akceptacja regulaminu
WebUI.click(findTestObject('Object Repository/PageDesktop/btn_tel_execute')) // wciśnięcie przycisku doladuj
WebUI.click(findTestObject('Object Repository/PageDesktop/a_logout')) // wciśnięcie przycisku wyloguj
WebUI.closeBrowser()