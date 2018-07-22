package Tests;


import org.testng.Assert;

import org.testng.annotations.Test;

public class ActorFromToKillaDragonTest extends BaseTest {

    @Test (priority = 1)
    public void toKillDragonIsDisplayedOnAbdulovPage() throws Exception {
        app.toKillaDragonPage.goToAleksandrAbdulovPage();
        Assert.assertEquals(app.aleksandrAbdulovPage.getMovieNameForAleksandrAbdulov(), "To Kill a Dragon");
    }

    @Test (priority = 2)
    public void toKillDragonIsDisplayedOnYankovskyPage() throws Exception {
        app.toKillaDragonPage.goToOlegYankovskyPage();
        Assert.assertEquals(app.olegYankovskyPage.getMovieNameForOlegYankovsky(),"To Kill a Dragon");
    }

    @Test (priority = 3)
    public void toKillDragonIsDisplayedOnLeonovPage() throws Exception {
        app.toKillaDragonPage.goToYevgenyLeonovPage();
        Assert.assertEquals(app.yevgenyLeonovPage.getMovieNameForYevgenyLeonov(),"To Kill a Dragon");
    }

    @Test (priority = 4)
    public void toKillDragonIsDisplayedOnTikhonovPage() throws Exception {
        app.toKillaDragonPage.goToVyacheslavTikhonovPage();
        Assert.assertEquals(app.vyacheslavTikhonovPage.getMovieNameForVyacheslavTikhonov(), "To Kill a Dragon");
    }

    @Test (priority = 5)
    public void toKillDragonIsDisplayedOnZakharovaPage() throws Exception {
        app.toKillaDragonPage.goToAleksandraZakharovaPage();
        Assert.assertEquals(app.aleksandraZakharovaPage.getMovieNameForAleksandraZakharova(), "To Kill a Dragon");
    }

    @Test (priority = 6)
    public void toKillDragonIsDisplayedOnRakovPage() throws Exception {
        app.toKillaDragonPage.goToViktorRakovPage();
        Assert.assertEquals(app.viktorRakovPage.getMovieNameForViktorRakov(),"To Kill a Dragon");
    }
}
