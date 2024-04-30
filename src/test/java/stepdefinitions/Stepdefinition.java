package stepdefinitions;

import Page.QueryCardPage;
import io.cucumber.java.en.Given;
import utilities.ReusableMethods;

import static utilities.Driver.getAppiumDriver;

public class Stepdefinition {
    QueryCardPage card=new QueryCardPage();

    @Given("Kullanici driver ayarlamalari yapar")
    public void kullanici_driver_ayarlamalari_yapar() {
        getAppiumDriver();

    }
    @Given("Kullanici anasayfada oldugunu dogrular")
    public void kullanici_anasayfada_oldugunu_dogrular() throws InterruptedException {
        card.LogoGorunurTest();
      //  ReusableMethods.koordinatTiklamaMethodu(300,500);
      //  ReusableMethods.ekranKaydirmaMethodu(300,160,300,500,300);
    }

    @Given("Profile ikonuna tıklar")
    public void profile_ikonuna_tıklar() throws InterruptedException {
        Thread.sleep(4000);
       card.profileImageViewClickTest();
    }
    @Given("Uyeligini acamak icin sıgn In butonuna tıklar.")
    public void uyeligini_acamak_icin_sign_in_butonuna_tıklar() throws InterruptedException {
        Thread.sleep(3000);
        card.signInClick();
    }

}
