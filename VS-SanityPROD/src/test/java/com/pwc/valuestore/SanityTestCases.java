package com.pwc.valuestore;



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.pwc.valuestore.ConfigurationsReader;
import com.pwc.valuestore.Driver;
import com.pwc.valuestore.HelperFunctions;
import com.pwc.valuestore.ReadXLSdata;
import com.pwc.valuestore.screenshotUtil;

import Pages.AuthoringPage;
import Pages.ContentPage;
import Pages.GhostedPage;
import Pages.HomePage;
import Pages.LoginPageObjects;
import Pages.TopicLandingPage;




public class SanityTestCases extends HelperFunctions {
	
	ExtentHtmlReporter htmlReporter;
	static ExtentReports extent;
	public static ConfigurationsReader read;
	String platform = null;
	LoginPageObjects lpo=new LoginPageObjects();
	HomePage hp=new HomePage();
	ContentPage cp=new ContentPage();
	GhostedPage gp=new GhostedPage();
	AuthoringPage ap=new AuthoringPage();
	TopicLandingPage tlp=new TopicLandingPage();
	screenshotUtil ssu=new screenshotUtil();
	private ExtentTest test;
	
	
	
	Logger logger=Logger.getLogger("SanityTestCases");
	
	ReadXLSdata read1=new ReadXLSdata();
	
	


	
	@BeforeSuite
	public void setUp() {
		PropertyConfigurator.configure(".\\log4j.properties");
	    read = new ConfigurationsReader();
	    platform = read.getPlatform();
	    read.platformName();
	    String reportFilePrefix = "Sanity Automation Report for Value Store";
	    String reportFileName = reportFilePrefix + ".html";
	    
	   
	    File existingReport = new File(reportFileName);
	    
	    if (existingReport.exists()) {
	       
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
	        String timestamp = dateFormat.format(new Date());
	        String newReportFileName = reportFilePrefix + "_" + timestamp + ".html";
	        
	        if (existingReport.renameTo(new File(newReportFileName))) {
	            System.out.println("Renamed existing report to: " + newReportFileName);
	        } else {
	            System.out.println("Failed to rename existing report.");
	        }
	    }

	
	    htmlReporter = new ExtentHtmlReporter(reportFileName);
	    extent = new ExtentReports();
	    extent.attachReporter(htmlReporter);
	    
	     
	}
		
	@BeforeMethod
	public void initTest() throws Exception {
	    Driver.getDriver();
	    read1.setExcelFile("./testdata.xlsx", "PRO");
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().deleteAllCookies();
		HelperFunctions.setWaitTime();
		
		
	}
	
	
	/*******************************************************Sanity Test Case********************************************************/
	
	
	
	@Test
	public void WEB_1() throws Exception{
		  String testName = "To verify that content area should contain an Interactive component which allows expansion and contraction of Heading Titles by clicking";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin3();
		        cp.setAccordion(test);
		        test.pass("Test passed");
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_2() throws Exception{
		  String testName = "To verify that user can see helpful assets like documents or sites that relate to the content he is viewing in this section.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        cp.setHelpfulAssets(test);
		        test.pass("Test passed");
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_3() throws Exception{
		  String testName = "To verify that user can see helpful assets like documents or sites that relate to the content he is viewing in this section."
				  +"To verify that this section is use to display useful stats and information.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        cp.setDidYouKnow(test);
		        test.pass("Test passed");
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_4() throws Exception{
		  String testName = "To verify that in enablers section for each group there is a group label, item label and item URL.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        cp.setEnablers(test);
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	
	
	@Test
	public void WEB_5() throws Exception{
		  String testName = "To verify that after clicking on external link share model appears .";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10)); 
		        lpo.setLogin4();
		        cp.setShareModal(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	
	
	@Test
	public void WEB_6() throws Exception{
		  String testName = "To verify that the Content tags are tag pills/bubbles that are present on the Homepage and Content page.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        cp.setTagPillsExist(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	
	@Test
	public void WEB_7() throws Exception{
		  String testName = "To verify that users is able to access published VS pages and see their profile icon.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setAccesingHomepage(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_8() throws Exception{
		  String testName = "To verify that user should see only published content  in filter/search result.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setFilterContentpage(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_9() throws Exception{
		  String testName = "To verify that when the mouse hovers on the filter option, the checkbox is filled with #DB536A.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setCheckboxColor(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_10() throws Exception{
		  String testName = "To verify that user can click on the share icon next to the shareable links.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        cp.setSharableLinks(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_11() throws Exception{
		  String testName = "To verify that user can click on 'Clear filters' to clear all filters.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setClearFilters(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_12() throws Exception{
		  String testName = "To verify that when user clicks on VS Home button, It should reload the homepage.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setVSHomepage(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}

	@Test
	public void WEB_13() throws Exception{
		  String testName = "To verify that hover effect on the 'Load more' button as per design.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setLoadMoreButton(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_14() throws Exception{
		  String testName = "To verify that once the filter is selected, the Top 10 section will be refreshed with the articles in real-time (no submit button required).";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setNoSubmitNeeded(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_15() throws Exception{
		  String testName = "To verify that user should be able to apply filters on the homepage Top 10, copy the page link and share it with another user.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setSharetheURL(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_16() throws Exception{
		  String testName = "To verify that the user can see a Value Store favicon in his browser.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setFavicon(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_17() throws Exception{
		  String testName = "To verify that the Top 10 article title & description are clickable to open the page.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setTop10ArticleElementsClickable(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_18() throws Exception{
		  String testName = "To verify that user can see the explore section on the homepage that navigates to the Topic landing page.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setMoretoExplore(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_19() throws Exception{
		  String testName = "To verify that clicking on the Topic title or topic icon to navigate to the landing page.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setMoretoExplore(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_20() throws Exception{
		  String testName = "Verify that, user cannot perform a search without any keywords";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setNoSearchResult(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_21() throws Exception{
		  String testName = "To verify that ( You might also like) article card display Topic label, article title and favorite icon on the card.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setMightAlsoLikeItems(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_22() throws Exception{
		  String testName = "To verify that Homepage \"You might also like\" section displays 4 elements.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setMightAlsoLikeItems2(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_23() throws Exception{
		  String testName = "To verify that quick links icon present at the global header.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setQuickLinksIconVisibility(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_24() throws Exception{
		  String testName = "To verify that user can click on the quick link title to open the item.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setQuickLinksIconOpensItems(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_25() throws Exception{
		  String testName = "To verify that the mega menu will close when the user clicks the quick links icon again.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setQuickLinksIconCloseMegaMenu(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_26() throws Exception{
		  String testName = "Verify that, system should look at the content title and the tags to find suggested terms that match against user’s keyword.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setSearchResultsBasedonKeyword(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_27() throws Exception{
		  String testName = "To verify that, Users can click on a trending term to trigger the search directly and will be presented with the search results page";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setTrendingSearch(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_28() throws Exception{
		  String testName = "Verify that, clicking the topic landing title or icon should open the page in the current window  ";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setSearchResultsTopicTitleIcon(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	
	@Test
	public void WEB_29() throws Exception{
		  String testName = "To verify that Key asset bar displays up to 4 assets that are pointing to the URLs.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 12));
		        lpo.setLogin4();
		        tlp.setKeyAssetBar4articles(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_30() throws Exception{
		  String testName = "To verify that the \"Back to topic page\" button should be presented on the content page if a user opened a page from a topic landing page.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 12));
		        lpo.setLogin4();
		        tlp.setBacktoTopicandTopicsSize(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_31() throws Exception{
		  String testName = "To verify that the user can click on the feed article title or description to open the article";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 12));
		        lpo.setLogin4();
		        tlp.setFeedTopics(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_32() throws Exception{
		  String testName = "To verify that the user who receives the link and opens the link should be brought to the homepage with the pre-filtered results.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setSharetheURLwithFilter(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_33() throws Exception{
		  String testName = "To verify that \"Hot topic\" article should open in the current tab if it's internal VS content.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 12));
		        lpo.setLogin4();
		        tlp.setHotTopicSameTab(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_34() throws Exception{
		  String testName = "To verify that feed component on the topic landing page is system populated based on the primary topic tag selected and brings published content that reflects the tag value.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 12));
		        lpo.setLogin4();
		        tlp.setFeedTopicsTagValue(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_35() throws Exception{
		  String testName = "To verify that territory selector allows user to toggle between territories.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setSelectTerritory(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_36() throws Exception{
		  String testName = "To verify that the territory dropdown shows the territory that is available.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setTerritoryDropdown(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	
	@Test
	public void WEB_37() throws Exception{
		  String testName = "To verify that the share modal opens with the options Copy link(existing), Email(existing) & Share via Dynamic Signal(New)."+
	"To verify that share icon should be available on the Helpful Asset component If it's configured on pages.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        cp.setShareModals(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_38() throws Exception{
		  String testName = "To verify that the \"What others are viewing\" component is presented on all content pages.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        cp.setWhatOthersViewing(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_39() throws Exception{
		  String testName = "To verify that ( What others are viewing) article card display Topic label, article title and favorite icon the card.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        cp.setWhatOthersViewingElements(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_40() throws Exception{
		  String testName = "To verify that click on the 'You might also like' article title to open the content page.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setMightAlsoLikeTitle(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_41() throws Exception{
		  String testName = "Verify that, system should look at the the tags to find suggested terms that match against user’s keyword.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setSuggestedTags(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_42() throws Exception{
		  String testName = "To verify that global header is configure in experiment fragment and it will persist across the pages."
				  +"To verify that footer is configure in experiment fragment and it will persist across the pages.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        cp.setHeaderFooter(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_43() throws Exception{
		  String testName = "To verify that favorite page icon is placed at the global header";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setFavIconVisibility(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_44() throws Exception{
		  String testName = "To verify that user can add and remove favorite content";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setFavContents(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_45() throws Exception{
		  String testName = "To verify click on the favorite title, image and description to open article page";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setFavPage(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_46() throws Exception{
		  String testName = "To verify that user will be able to sort the tiles by Newest to Oldest";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setFavFilter(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_47() throws Exception{
		  String testName = "To verify that the \"What others are viewing\" section is available on both US and Mexico sites, and system recommends content according to the locale.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 15));
		        lpo.setLogin4();
		        cp.setWhatOthersViewingOtherTerritorities(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_48() throws Exception{
		  String testName = "To verify that tags should be displayed in the Spanish on the Mexico sites";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setSpanishTag(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_49() throws Exception{
		  String testName = "To verify that user can add and remove favorites on the Mexico site";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setFavContentsMexico(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_50() throws Exception{
		  String testName = "To verify that system returns filter results with MX content only";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setFilterResultsMexico(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_51() throws Exception{
		  String testName = "To verify that user can see value store quick links so that he can navigate to those pages";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setQuickLinksIconOpensItems2(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_52() throws Exception{
		  String testName = "To verify that the homepage filters should work as expected and functionality is same as the US or MX but reflecting the GX content and tags";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setFiltersOnGlobal(test);
		        test.pass("WEB_70 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_53() throws Exception{
		  String testName = "Verify that, user cannot perform a search without any keywords(GX)";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setNoSearchResultGlobal(test);
		        test.pass("WEB_71 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_54() throws Exception{
		  String testName = "Verify that there will be no favorite option on the GX site header";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setNoFavGlobal(test);
		        test.pass("WEB_72 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_55() throws Exception{
		  String testName = "Verify that Did you mean feature should also be available on the GX site";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setDidYouMean(test);
		        test.pass("WEB_73 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_56() throws Exception{
		  String testName = "To verify that if cross territories are selected, the system will display country tags for ALL the territories including the viewing territory";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setSelectingTerritoriesSearchResult(test);
		        test.pass("WEB_69 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_57() throws Exception{
		  String testName = "To verify that clicking the external page title and the icon will open the link in a new tab on the search result page";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setExternalPageNewTab(test);
		        test.pass("WEB_69 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_58() throws Exception{
		  String testName = "To verify that User is able to sign out from the Value Store by using the 'Logout' option.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 11));
		        lpo.setLogin4();
		        hp.setLogoutOption(test);
		        test.pass("WEB_69 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	
	
	

	
	
	/******************************************************************************************************************************/
	
	public String takeScreenshot(String screenshotName) throws IOException {
	    WebDriver driver = Driver.getDriver();
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    String destination = "screenshots/" + screenshotName + ".png";
	    File target = new File(destination);
	    FileUtils.copyFile(source, target);
	    return destination;
	}
	public void captureScreenshotAndAddToReport(String testName) throws IOException {
		 String screenshotPath = takeScreenshot(testName);
		 ExtentTest test = extent.createTest(testName).pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
	}
	@AfterMethod
    public void closeTabs() {
        String currentWindow = Driver.getDriver().getWindowHandle();
        Set<String> allWindows = Driver.getDriver().getWindowHandles();
        for (String window : allWindows) {
            if (!window.equals(currentWindow)) {
            	Driver.getDriver().switchTo().window(window);
            	Driver.getDriver().close();
            }
        }
        Driver.getDriver().switchTo().window(currentWindow);
         }
	public void tearDown(ITestResult result) throws IOException {
	    if (result.getStatus() == ITestResult.FAILURE) {
	        // Take screenshot if test method fails
	        String screenshotPath = takeScreenshot(result.getName() + "_failed");
	        test.fail("Test Failed", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
	    } else if (result.getStatus() == ITestResult.SUCCESS) {
	        // Take screenshot if test method passes
	        String screenshotPath = takeScreenshot(result.getName() + "_passed");
	        test.pass("Test Passed", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
	    }
	    extent.flush();
	}
      @AfterSuite
	public void closingBrowser() {
		extent.flush();
		//Driver.closeDriver();
	}
	
	


	

}