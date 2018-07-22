package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ToKillaDragonPage extends BasePage {
	@FindBy(xpath="//*[@id=\"mw-content-text\"]/div/ul[1]/li[1]/a")
	private WebElement actorAleksandrAbdulov;

	@FindBy(xpath="//*[@id=\"mw-content-text\"]/div/ul[1]/li[2]/a")
	private WebElement actorOlegYankovsky;

	@FindBy(xpath="//*[@id=\"mw-content-text\"]/div/ul[1]/li[3]/a")
	private WebElement actorYevgenyLeonov;

	@FindBy(xpath="//*[@id=\"mw-content-text\"]/div/ul[1]/li[4]/a")
	private WebElement actorVyacheslavTikhonov;

	@FindBy(xpath="//*[@id=\"mw-content-text\"]/div/ul[1]/li[5]/a")
	private WebElement actorAleksandraZakharova;

	@FindBy(xpath="//*[@id=\"mw-content-text\"]/div/ul[1]/li[6]/a")
	private WebElement actorViktorRakov;

	public   void goToAleksandrAbdulovPage(){
	    actorAleksandrAbdulov.click();
    }

    public void goToOlegYankovskyPage(){
	    actorOlegYankovsky.click();
    }

    public void goToYevgenyLeonovPage(){
        actorYevgenyLeonov.click();
    }

    public void goToVyacheslavTikhonovPage(){
        actorVyacheslavTikhonov.click();
    }

    public void goToAleksandraZakharovaPage(){
        actorAleksandraZakharova.click();
    }

    public void goToViktorRakovPage(){
        actorViktorRakov.click();
    }






}
