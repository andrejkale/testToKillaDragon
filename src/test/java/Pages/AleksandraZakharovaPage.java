package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AleksandraZakharovaPage extends BasePage {
	@FindBy(xpath="//*[@id=\"mw-content-text\"]/div/ul[1]/li[3]/i[1]/a")
	private WebElement movieToKillaDragon;

	public String getMovieNameForAleksandraZakharova(){
		logger.info(String.format("Name of movie -%s", movieToKillaDragon.getText()));
		return 	movieToKillaDragon.getText();
	}

}
