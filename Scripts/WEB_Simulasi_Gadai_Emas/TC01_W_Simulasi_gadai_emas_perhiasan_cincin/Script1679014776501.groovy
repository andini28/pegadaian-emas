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

WebUI.openBrowser('https://sahabat.pegadaian.co.id/')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('close image popup/div_X'))

WebUI.mouseOver(findTestObject('menu simulasi/a_Simulasi'))

WebUI.click(findTestObject('menu simulasi/a_Simulasi Gadai'))

WebUI.verifyTextPresent('Simulasi Gadai', true)

WebUI.click(findTestObject('menu simulasi/menu gadai emas/h5_Gadai Emas'))

WebUI.verifyTextPresent('Simulasi Gadai Emas', true)

WebUI.click(findTestObject('Page_Simulasi Gadai Emas - Sahabat Pegadaian  Solusi Gadai Terbaik - Tips Menabung Emas - Inspirasi Investasi Terbaik/btn_tambah jaminan'))

WebUI.waitForElementPresent(findTestObject('Page_Simulasi Gadai Emas - Sahabat Pegadaian  Solusi Gadai Terbaik - Tips Menabung Emas - Inspirasi Investasi Terbaik/label_Jenis Emas'), 
    0)

WebUI.click(findTestObject('tambah jaminan jenis perhiasan/Page_Simulasi Gadai Emas - Sahabat Pegadaian  Solusi Gadai Terbaik - Tips Menabung Emas - Inspirasi Investasi Terbaik/span_Pilih Jenis Emas'))

WebUI.click(findTestObject('btn tambah jamianan/Page_Simulasi Gadai Emas - Sahabat Pegadaian  Solusi Gadai Terbaik - Tips Menabung Emas - Inspirasi Investasi Terbaik/pilih perhiasan'))

WebUI.click(findTestObject('btn tambah jamianan/Page_Simulasi Gadai Emas - Sahabat Pegadaian  Solusi Gadai Terbaik - Tips Menabung Emas - Inspirasi Investasi Terbaik/span_Pilih Jenis Perhiasan'))

WebUI.click(findTestObject('btn tambah jamianan/Page_Simulasi Gadai Emas - Sahabat Pegadaian  Solusi Gadai Terbaik - Tips Menabung Emas - Inspirasi Investasi Terbaik/pilih cincin'))

WebUI.click(findTestObject('btn tambah jamianan/Page_Simulasi Gadai Emas - Sahabat Pegadaian  Solusi Gadai Terbaik - Tips Menabung Emas - Inspirasi Investasi Terbaik/span_Pilih Kadar'))

WebUI.click(findTestObject('btn tambah jamianan/Page_Simulasi Gadai Emas - Sahabat Pegadaian  Solusi Gadai Terbaik - Tips Menabung Emas - Inspirasi Investasi Terbaik/pilih 24 karat'))

WebUI.sendKeys(findTestObject('btn tambah jamianan/Page_Simulasi Gadai Emas - Sahabat Pegadaian  Solusi Gadai Terbaik - Tips Menabung Emas - Inspirasi Investasi Terbaik/input_Gram_berat_perhiasan'), 
    '1')

WebUI.click(findTestObject('btn tambah jamianan/Page_Simulasi Gadai Emas - Sahabat Pegadaian  Solusi Gadai Terbaik - Tips Menabung Emas - Inspirasi Investasi Terbaik/btn_simpan'))

WebUI.click(findTestObject('btn tambah jamianan/Page_Simulasi Gadai Emas - Sahabat Pegadaian  Solusi Gadai Terbaik - Tips Menabung Emas - Inspirasi Investasi Terbaik/li_Pilih Fitur Produk'))

WebUI.click(findTestObject('btn tambah jamianan/Page_Simulasi Gadai Emas - Sahabat Pegadaian  Solusi Gadai Terbaik - Tips Menabung Emas - Inspirasi Investasi Terbaik/Reguler'))

WebUI.click(findTestObject('btn tambah jamianan/Page_Simulasi Gadai Emas - Sahabat Pegadaian  Solusi Gadai Terbaik - Tips Menabung Emas - Inspirasi Investasi Terbaik/li_Pilih Jangka Waktu'))

WebUI.click(findTestObject('btn tambah jamianan/Page_Simulasi Gadai Emas - Sahabat Pegadaian  Solusi Gadai Terbaik - Tips Menabung Emas - Inspirasi Investasi Terbaik/120 Hari'))

WebUI.mouseOver(findTestObject('btn tambah jamianan/Page_Simulasi Gadai Emas - Sahabat Pegadaian  Solusi Gadai Terbaik - Tips Menabung Emas - Inspirasi Investasi Terbaik/label_Perkiraan Maksimal Uang Pinjaman'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('btn tambah jamianan/Page_Simulasi Gadai Emas - Sahabat Pegadaian  Solusi Gadai Terbaik - Tips Menabung Emas - Inspirasi Investasi Terbaik/p_Rp 810.000'), 
    2)

WebUI.click(findTestObject('btn tambah jamianan/Page_Simulasi Gadai Emas - Sahabat Pegadaian  Solusi Gadai Terbaik - Tips Menabung Emas - Inspirasi Investasi Terbaik/button_Rincian'))

WebUI.verifyElementPresent(findTestObject('btn tambah jamianan/Page_Simulasi Gadai Emas - Sahabat Pegadaian  Solusi Gadai Terbaik - Tips Menabung Emas - Inspirasi Investasi Terbaik/p_Rp 19.500  15 Hari'), 
    2)

WebUI.mouseOver(findTestObject('btn tambah jamianan/Page_Simulasi Gadai Emas - Sahabat Pegadaian  Solusi Gadai Terbaik - Tips Menabung Emas - Inspirasi Investasi Terbaik/btn_download_simulasi'))

WebUI.click(findTestObject('btn tambah jamianan/Page_Simulasi Gadai Emas - Sahabat Pegadaian  Solusi Gadai Terbaik - Tips Menabung Emas - Inspirasi Investasi Terbaik/btn_download_simulasi'))

WebUI.sendKeys(findTestObject('btn tambah jamianan/Page_Simulasi Gadai Emas - Sahabat Pegadaian  Solusi Gadai Terbaik - Tips Menabung Emas - Inspirasi Investasi Terbaik/input_Alamat Email_email2'), 
    'andini@mailnesia.com')

WebUI.click(findTestObject('btn tambah jamianan/Page_Simulasi Gadai Emas - Sahabat Pegadaian  Solusi Gadai Terbaik - Tips Menabung Emas - Inspirasi Investasi Terbaik/span_syarat dan ketentuan_checkmark'))

WebUI.click(findTestObject('btn tambah jamianan/Page_Simulasi Gadai Emas - Sahabat Pegadaian  Solusi Gadai Terbaik - Tips Menabung Emas - Inspirasi Investasi Terbaik/btn_download_simulasi_kirim email'))

WebUI.verifyElementPresent(findTestObject('btn tambah jamianan/Page_Simulasi Gadai Emas - Sahabat Pegadaian  Solusi Gadai Terbaik - Tips Menabung Emas - Inspirasi Investasi Terbaik/h4_Terima Kasih'), 
    0)

WebUI.click(findTestObject('btn tambah jamianan/Page_Simulasi Gadai Emas - Sahabat Pegadaian  Solusi Gadai Terbaik - Tips Menabung Emas - Inspirasi Investasi Terbaik/btn_selesai'))

