package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;

public class Hooks extends CommonMethods {
    @Before
    public void preCondition(){
        openBrowserAndLaunchingApplication();
        //openBrowserAndLaunchApplication();
    }

    //below will use special class called scenario class from cucumber
    //this class holds complete information of your execution
    @After
    public void postCondition(Scenario scenario){
        byte[] pic;
        if(scenario.isFailed()){
            //failed screenshot will be available inside failed folder
            pic =  takeScreenshot("failed/" + scenario.getName());
        }else {
            pic = takeScreenshot("passed/" + scenario.getName());
        }

        //to attach the screenshot in our report
        scenario.attach(pic, "image/png", scenario.getName());
        closeBrowser();
    }

}
