package uk.co.library.testbase.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.library.Pages.HomePage;
import uk.co.library.Pages.ResultPage;
import uk.co.library.testbase.testbase.BaseTest;

public class JobSearchTest extends BaseTest {

    @Test(dataProvider = "jobSearchData")
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType, String result) {
        HomePage homePage = new HomePage(driver);
        ResultPage resultPage = new ResultPage(driver);

        homePage.enterJobTitle(jobTitle);
        homePage.enterLocation(location);
        homePage.selectDistance(distance);
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary(salaryMin);
        homePage.enterMaxSalary(salaryMax);
        homePage.selectSalaryType(salaryType);
        homePage.selectJobType(jobType);
        homePage.clickOnFindJobsButton();

        Assert.assertTrue(resultPage.verifyTheResults(result), "Result mismatch for: " + jobTitle);
    }
}

