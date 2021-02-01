package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DominosSenaryoStepDef extends BaseClass {

    BaseClass baseNesne = new BaseClass();


    @Given("Open dominos.com.tr")
    public void openLoginPage() throws Throwable{
       baseNesne.openLoginPage();
    }

    @And("Servis tipi seçimi")
    public void ServisSeçimi() throws Throwable {
        baseNesne.ServisSeçimi();
    }

    @And("Bölge Seçimi")
    public void BolgeSecimi() throws Throwable {
        baseNesne.BolgeSecimi();
    }

    @And("Anasayfa")
    public void Anasayfa() throws Throwable {
        baseNesne.Anasayfa();
    }

    @And("Tüm Kampanyalar")
    public void TumKampanyalar() throws Throwable {
        baseNesne.TumKampanyalar();
    }

    @And("Random Kampanya Seçimi")
    public void RandomKamp() throws Throwable {
        baseNesne.RandomKamp();
    }

    @And("Sepete Ekle")
    public void SepeteEkle() throws Throwable {
        baseNesne.SepeteEkle();
    }

    @And("Sepete Git")
    public void SepeteGit() throws Throwable {
        baseNesne.SepeteGit();
    }

    @And("Sepeti Onayla")
    public void SepetiOnayla() throws Throwable {
        baseNesne.SepetiOnayla();
    }

    @And("Adresi Tamamla")
    public void AdresTamamla() throws Throwable {
        baseNesne.AdresTamamla();
    }

    @And("Ödeme Tipi Seç ve Devam Et")
    public void OdemeTipiSec() throws Throwable {
        baseNesne.OdemeTipiSecDevamEt();
    }

    @Then("Testi Kontrol Et Bitir")
    public void checkTestClosed() {
        baseNesne.checkTestClosed();
    }

}
