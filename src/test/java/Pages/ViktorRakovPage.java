package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViktorRakovPage extends BasePage {
	@FindBy(xpath="//*[@id=\"mw-content-text\"]/div/div[2]/ul/li[3]/a")
	private WebElement movieToKillaDragon;

	public String getMovieNameForViktorRakov(){
		logger.info(String.format("Name of movie -%s", movieToKillaDragon.getText()));
		return movieToKillaDragon.getText();
    }

}
