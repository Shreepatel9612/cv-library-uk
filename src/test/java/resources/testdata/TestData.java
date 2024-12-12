package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "jobSearchData")
    public Object[][] jobSearchData() {
        return new Object[][] {
                {"Tester", "Harrow", "up to 5 miles", "30000", "500000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow on the Hill"},
                {"Developer", "London", "up to 10 miles", "40000", "80000", "Per annum", "Contract", "Contract Developer jobs in London"},
                {"Designer", "Manchester", "up to 15 miles", "25000", "45000", "Per annum", "Part-time", "Part-time Designer jobs in Manchester"},
                {"Engineer", "Bristol", "up to 20 miles", "30000", "60000", "Per annum", "Permanent", "Permanent Engineer jobs in Bristol"},
                {"Manager", "Leeds", "up to 25 miles", "50000", "100000", "Per annum", "Full-time", "Full-time Manager jobs in Leeds"},
                {"Analyst", "Birmingham", "up to 30 miles", "20000", "40000", "Per annum", "Internship", "Internship Analyst jobs in Birmingham"},
                {"Consultant", "Glasgow", "up to 50 miles", "35000", "70000", "Per annum", "Permanent", "Permanent Consultant jobs in Glasgow"}
        };
    }
}
