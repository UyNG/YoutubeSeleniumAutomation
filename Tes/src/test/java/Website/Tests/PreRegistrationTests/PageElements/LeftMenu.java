package Website.Tests.PreRegistrationTests.PageElements;

import Global.Helpers.WebDriverNavigation;
import Website.WebsiteCore;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeftMenu extends WebsiteCore{
    // Unfortunately, by the way youtube is set up, we can only use xPath instead of css selectors for this menu
    public enum LeftMenuButton {HOME, TRENDING, HISTORY, MUSIC, SPORTS, GAMING, FILMS, NEWS, LIVE, VIDEOS}

    @Override
    public void basicWebclientSetup() {
    }

    public static boolean navigate (LeftMenuButton leftMenuButton) {

        String buttonCSS = null;

        switch (leftMenuButton) {
            case HOME:
                buttonCSS = LeftMenuCSS.HOME;
                break;
            case TRENDING:
                buttonCSS = LeftMenuCSS.TRENDING;
                break;
            case HISTORY:
                buttonCSS = LeftMenuCSS.HISTORY;
                break;
            case MUSIC:
                buttonCSS = LeftMenuCSS.MUSIC;
                break;
            case SPORTS:
                buttonCSS = LeftMenuCSS.SPORTS;
                break;
            case GAMING:
                buttonCSS = LeftMenuCSS.GAMING;
                break;
            case FILMS:
                buttonCSS = LeftMenuCSS.FILMS;
                break;
            case NEWS:
                buttonCSS = LeftMenuCSS.NEWS;
                break;
            case LIVE:
                buttonCSS = LeftMenuCSS.LIVE;
                break;
            case VIDEOS:
                buttonCSS = LeftMenuCSS.VIDEOS;
                break;
        }

        try {
            WebDriverNavigation.clickWithXpath(buttonCSS);
            WebDriverNavigation.sleep(2000);
            return true;

        }
        catch (TimeoutException ex){
            return false;

        }
    }

}
