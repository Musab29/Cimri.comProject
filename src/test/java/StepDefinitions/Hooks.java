package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void before()
    {
//        System.out.printf("Senaryo başladımı");
    }

    @After
    public void after()
    {
//        System.out.printf("Senaryo bitti ?");
        GWD.quitDriver();
    }
}
