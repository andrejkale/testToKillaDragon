package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OlegYankovskyPage extends BasePage {
	@FindBy(xpath="//*[@id=\"mw-content-text\"]/div/ul[2]/li[45]/i[1]/a")
	private WebElement movieToKillaDragon;

    public String getMovieNameForOlegYankovsky(){
        logger.info(String.format("Name of movie -%s", movieToKillaDragon.getText()));
        return movieToKillaDragon.getText();
    }

}
