import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('https://www.katalon.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.katalon.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://beta.meudica.com.br/login")
selenium.type("name=email", "marcos.silva@isgsa.com.br")
selenium.type("name=senha", "123456789")
selenium.click("class=btn btn-primary btn-lg btn-block")
selenium.click("link=Admin")
selenium.click("link=⟫ Secretarias")


selenium.click("link=Nova secretaria")
selenium.type("id=nome", "Secretaria de teste")
selenium.type("id=cep", "70000-000")
selenium.type("id=endereco", "SIG QD 04 Lote 625")
selenium.type("id=bairro", "Setor gráfico")
selenium.type("id=numero", "625")
selenium.type("id=bairro", "Setor Gráfico")

selenium.click("id=select2-cidade-container")

selenium.type("id=cnpj", "32.237.218/0001-50")
selenium.type("id=responsavel", "Marcos Paes") 
selenium.type("id=telefone1", "(61) 99999-9999")
selenium.type("id=email", "marcospaes35@gmail.com")


selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Cancelar'])[1]/following::button[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Ativo'])[1]/following::button[1]")
selenium.chooseOkOnNextConfirmation()
selenium.click("link=Excluir")


//assertTrue(selenium.getConfirmation().matches("^Você tem certeza[\\s\\S]$"));
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Marcos Paes'])[1]/preceding::li[1]")
