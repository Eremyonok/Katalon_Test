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

WebUI.navigateToUrl('https://docs.google.com/forms/d/e/1FAIpQLSeq8naEPofrOrOA0nxdGj6L7jqddI8xHMFIyl9ailFnfl-uTQ/viewform')

WebUI.click(findTestObject('Object Repository/Page_test/div_Name'))

WebUI.setText(findTestObject('Object Repository/Page_test/input__whsOnd zHQkBf'), 'Elizaveta Eremenok')

WebUI.sendKeys(Keys.TAB, 'eremeonock.el@yandex.ru')

WebUI.click(findTestObject('Object Repository/Page_test/div_a new language'))

WebUI.sendKeys(Keys.TAB, 'https://github.com/Eremyonok/Katalon_Test')

WebUI.closeBrowser()

WebUI.closeBrowser()

