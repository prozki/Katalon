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
WebUI.setText(findTestObject('Object Repository/PageLogin/inp_login_id'), GlobalVariable.username) // wprowadzenie nazwy użytkownika
WebUI.click(findTestObject('Object Repository/PageLogin/btn_next')) // wciśnięcie przycisku dalej
WebUI.setEncryptedText(findTestObject('Object Repository/PageLogin/input_haso_haslo'), GlobalVariable.password) // wprowadzenie hasła
WebUI.click(findTestObject('Object Repository/PageLogin/btn_next')) // wciśnięcie przycisku zaloguj się

WebUI.click(findTestObject('Object Repository/PageDesktop/a_payment')) // przejście do modułu płatności
WebUI.setText(findTestObject('Object Repository/PagePayment/inp_receiver'), receiver_name) // wprowadzenie nazwy odbiorcy
WebUI.setText(findTestObject('Object Repository/PagePayment/inp_acc_number'), receiver_acc_number) // wprowadzenie nr konta odbiorcy
WebUI.setText(findTestObject('Object Repository/PagePayment/inp_amount'), amount_money) // wprowadzenie kwoty przelewu
WebUI.click(findTestObject('Object Repository/PagePayment/btn_next')) // uruchomienie przycisku dalej


WebUI.click(findTestObject('Object Repository/PageDesktop/a_logout')) // wylogowanie z aplikacji
WebUI.closeBrowser() // zamknięcie przeglądarki