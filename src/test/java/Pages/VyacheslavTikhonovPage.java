package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VyacheslavTikhonovPage extends BasePage {
	@FindBy(xpath="//*[@id=\"mw-content-text\"]/div/table[2]/tbody/tr[38]/td[2]/i/a")
	private WebElement movieToKillaDragon;

	public String getMovieNameForVyacheslavTikhonov(){
		logger.info(String.format("Name of movie -%s", movieToKillaDragon.getText()));
		return movieToKillaDragon.getText();
    }

}
