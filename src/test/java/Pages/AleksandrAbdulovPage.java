package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AleksandrAbdulovPage extends BasePage {
	@FindBy(xpath="//*[@id=\"mw-content-text\"]/div/ul[2]/li[18]/i[1]/a")
	private WebElement movieToKillaDragon;

	public String getMovieNameForAleksandrAbdulov(){
		logger.info(String.format("Name of movie -%s", movieToKillaDragon.getText()));
	    return movieToKillaDragon.getText();
    }

}
