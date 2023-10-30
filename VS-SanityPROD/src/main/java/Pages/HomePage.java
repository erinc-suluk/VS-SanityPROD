package Pages;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.pwc.valuestore.Driver;
import com.pwc.valuestore.HelperFunctions;
import com.pwc.valuestore.ReadXLSdata;


public class HomePage extends HelperFunctions {
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
		}
	@FindBy(xpath="//coral-icon[@icon='properties']")
	private WebElement pageInfo;
	
	@FindBy(xpath="//button[@title='Open Properties']")
	private WebElement openPro;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='Publish Page']")
	private WebElement publishPage;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='View as Published']")
	private WebElement viewPublished;
	
	@FindBy(xpath="//a[@data-tag-id='Deals']")
	private WebElement dealsTag;
	
	@FindBy(xpath="//img[contains(@alt, 'logo')]")
	private WebElement logo;
	
	@FindBy(xpath="//figure[@class='vs-card__figure-wrapper']")
	private static List<WebElement> tagPills;
	
	@FindBy(xpath="//span[normalize-space()='Topic']")
	private WebElement selectTopic;
	
	@FindBy(xpath="//span[normalize-space()='Tema']")
	private WebElement selectTopicMX;
	
	@FindBy(xpath="(//label[@for='value-store:topic/deals'])[2]")
	private WebElement dealsCheckbox;
	
	@FindBy(xpath="(//a[contains(@class, 'content')])[1]")
	private WebElement automationContentPage;
	
	@FindBy(xpath="//li[@class='userprofile']")
	private WebElement userIcon;
	
	@FindBy(xpath="//div[@class='vs-filter__selected vs-filter__desktop-selected']//button[1]")
	private WebElement selectedFilter;
	
	@FindBy(xpath="//div[@class='vs-filter__selected vs-filter__desktop-selected']//button[@class='vs-filter__selected-pill vs-filter__selected-pill--transparent'][normalize-space()='Clear filters']")
	private WebElement clearFilter;
	
	@FindBy(xpath="//h2[@class='vs-filter__title']")
	private WebElement filterTitle;
	
	@FindBy(xpath="//span[@class='vs-header__logo-title']")
	private WebElement valueStore;
	
	@FindBy(xpath="//button[@class='vs-card__cta-load-more']")
	private WebElement loadMore;
	
	@FindBy(xpath="//div[@class='vs-card__favorite-pill-wrapper']")
	private static List<WebElement> assets;
	
	@FindBy(xpath="(//a[@class='vs-feature-card__figure-heading'])[1]")
	private WebElement firstAssetHomepage;
	
	@FindBy(xpath="(//div[@class='vs-card__favorite-pill-wrapper'])[1]")
	private WebElement firstAssetFilter;
	
	@FindBy(xpath="//link[@rel='shortcut icon']")
	private WebElement faviconLink;
	
	@FindBy(xpath="//a[@class='vs-card__figure-heading']")
	private static List<WebElement> articleTitles;
	
	@FindBy(xpath="(//a[@class='vs-card__figure-heading'])[1]")
	private WebElement firstArticleTitle;
	
	@FindBy(xpath="(//p[@class='vs-card__figure-description'])[1]//a")
	private WebElement firstArticleDescription;
	
	@FindBy(xpath="(//img[@class='vs-card__figure-img'])[1]")
	private WebElement firstArticleImg;
	
	@FindBy(xpath="//h3[@class='vs-topic__heading']")
	private WebElement moretoExplore;
	
	@FindBy(xpath="//span[@class='vs-topic__subheading']")
	private WebElement moretoExploreSub;
	
	@FindBy(xpath="//div[@class='vs-topic__more-explorer-item']//a")
	private static List<WebElement> exploreItemsLink;
	
	@FindBy(xpath="//div[@class='vs-topic__more-explorer-item']")
	private static List<WebElement> exploreItems;
	
	@FindBy(xpath="//span[@class='vs-header__search-btn']")
	private WebElement searchButton;
	
	@FindBy(xpath="//input[contains(@placeholder,'Search')]")
	private WebElement searchField;
	
	@FindBy(xpath="//input[contains(@placeholder,'Buscar')]")
	private WebElement searchField2;
	
	@FindBy(xpath="//span[@class='vs-search__result-not-found-heading']")
	private WebElement noSearchResult;
	
	@FindBy(xpath="//div[contains(@class, 'vs-content__you-might-also-like-wrapper')]//h2")
	private WebElement alsoLikeTitle;
	
	@FindBy(xpath="//div[@class='vs-card__box-heading_youmightalsolike']")
	private static List<WebElement> alsoLikeLabels;
	
	@FindBy(xpath="//div[@class='vs-card__youmightalsolike-box-content']")
	private static List<WebElement> alsoLikeTitles;
	
	@FindBy(xpath="//div[@class='vs-card__youmightalsolike-box-content']//a")
	private static List<WebElement> alsoLikeTitles2;
	
	@FindBy(xpath="//div[@class='vs-card__youmightalsolike-favorites']")
	private static List<WebElement> alsoLikeFavIcon;
	
	@FindBy(xpath="//div[@class='vs-card__youmightalsolike-highlight-item']")
	private WebElement alsoLikeImage;
	
	@FindBy(xpath="//a[@class='vs-header__quicklinks-img']//span")
	private WebElement quickLinksIcon;
	
	@FindBy(xpath="//div[@class='vs-header__td-menu-item-wrapper']")
	private static List<WebElement> tdMenuItems;
	
	@FindBy(xpath="//div[@class='vs-header__td-menu-item-wrapper']//a")
	private static List<WebElement> tdMenuItems2;
	
	@FindBy(xpath="//div[@class='vs-header__wt-menu-item-wrapper']")
	private static List<WebElement> wtMenuItems;
	
	@FindBy(xpath="//span[@class='vs-header__desktop-close-icon']")
	private WebElement closeQuickLinks;
	
	@FindBy(xpath="//li[@class='navigation vs-header__sub-menu']")
	private WebElement terriMenu;
	
	@FindBy(xpath="//li[@class='navigation vs-header__sub-menu']//a[@title='MX_Title']")
	private WebElement mexico;
	
	@FindBy(xpath="//li[@class='navigation vs-header__sub-menu']//a[@title='Global']")
	private WebElement global;
	
	@FindBy(xpath="//li[@class='navigation vs-header__sub-menu']//a[@title='US_Title']")
	private WebElement US;
	
	@FindBy(xpath="//li[@data-suggestedterm-keyword='Covid']")
	private WebElement suggestedKeyword;
	
	@FindBy(xpath="//li[@data-suggestedterm-keyword='ESG']")
	private WebElement suggestedKeyword2;
	
	@FindBy(xpath="(//div[@class='vs-search__items']//a)[1]")
	private WebElement searchItem;
	
	@FindBy(xpath="(//div[@class='vs-search__items'])[1]")
	private WebElement searchItem2;
	
	@FindBy(xpath="(//div[@class='vs-search__explorer-image-wrapper'])[1]")
	private WebElement searchItemIcon;
	
	@FindBy(xpath="//div[@class='trending-search']//span[@class='vs-header__search-analytics-heading']")
	private WebElement trendingSearch;
	
	@FindBy(xpath="//ul[@class='vs-header__search-key-suggestion']//li")
	private static List<WebElement> trendingSuggestions;
	
	@FindBy(xpath="//div[@class='vs-filter__selected vs-filter__desktop-selected']//button[normalize-space()='Deals']")
	private WebElement dealsSearch;
	
	@FindBy(xpath="//h2[@class='vs-title-area__card-box-content-heading page-title ']")
	private WebElement contentTitle;
	
	@FindBy(xpath="//ul[@class='vs-header__search-key-suggestion']")
	private WebElement keySuggestion;
	
	@FindBy(xpath="//span[@class='vs-header__favorites']")
	private WebElement favIcon;
	
	@FindBy(xpath="//span[@class='vs-header__favorites']//a")
	private WebElement favIconLink;
	
	@FindBy(xpath="//span[@class='vs-card__favorites-btn topten_favorites-btn']")
	private static List<WebElement> articleFavIcons;
	
	@FindBy(xpath="//span[@class='vs-feature-card__favorites-btn']")
	private static List<WebElement> articleFavIcons2;
	
	@FindBy(xpath="//div[@class='vs-favorites__header']")
	private WebElement favHeader;
	
	@FindBy(xpath="//div[@class='vs-favorites__no-result-heading']")
	private WebElement noResultHeading;
	
	@FindBy(xpath="//span[@class='vs-card__favorites-btn fill-heart']")
	private static List<WebElement> favIconsFav;
	
	@FindBy(xpath="//span[@class='vs-card__favorites-btn fill-heart']")
	private WebElement favIconFav;
	
	@FindBy(xpath="//img[@class='vs-card__figure-img']")
	private WebElement favImage;
	
	@FindBy(xpath="//a[@class='vs-card__figure-heading']")
	private WebElement favTitle;
	
	@FindBy(xpath="//p[@class='vs-card__figure-description']//a")
	private WebElement favDescription;
	
	@FindBy(xpath="//div[@class='vs-title-area__card-box-content']")
	private WebElement contentBox;
	
	@FindBy(xpath="//span[@role='combobox']")
	private WebElement favFilter;
	
	@FindBy(xpath="//li[normalize-space()='Oldest to Newest']")
	private WebElement oToN;
	
	@FindBy(xpath="//span[@class='vs-card__tag-pill']")
	private static List<WebElement> spanishTags;
	
	@FindBy(xpath="(//label[@for='value-store:topic/esg'])[2]")
	private WebElement mexicoCheckbox;
	
	@FindBy(xpath="//div[@id='trending']")
	private WebElement trendingSearch2;
	
	@FindBy(xpath="//span[@class='vs-header__favorites']")
	private static List<WebElement> favIcon2;
	
	@FindBy(xpath="//div[@class='vs-search__suggestion-text-wrapper']")
	private WebElement didYouMean;
	
	@FindBy(xpath="//span[@class='vs-search__suggestion-text']")
	private WebElement didYouMeanText;
	
	@FindBy(xpath="//div[@class='vs-search__showing-result']//p")
	private WebElement suggestedHeading;
	
	@FindBy(xpath="//span[@class='vs-search__showing-result-topic']")
	private WebElement suggestedText;
	
	@FindBy(xpath="(//span[contains(@class, 'external-icon')])[1]")
	private WebElement externalIcon;
	
	@FindBy(xpath="//input[@id='t_Mexico']")
	private WebElement mexicoCheckbox2;
	
	@FindBy(xpath="//input[@id='t_Global']")
	private WebElement globalCheckbox;
	
	@FindBy(xpath="//input[@id='t_Estados Unidos']")
	private WebElement usCheckbox;
	
	@FindBy(xpath="//input[@id='t_US']")
	private WebElement usGlobalCheckbox;
	
	@FindBy(xpath="//span[@class='vs-search__applied-territory']")
	private static List<WebElement> terriLabels;
	
	@FindBy(xpath="//span[@class='vs-search__selected-territory-count']")
	private WebElement countryCount;
	
	ReadXLSdata read1=new ReadXLSdata();
	
	public void setAccesingHomepage(ExtentTest test) throws Exception {
		/*read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(10);
	    
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(tagPills.get(0).isDisplayed());
	    test.info("Verified tag pill is displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(userIcon.isDisplayed());
	    HelperFunctions.staticWait(2);
	}
	
	public void setFilterContentpage(ExtentTest test) throws Exception {
		/*read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(10);
	   
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on select topic");
        selectTopic.click();
        //HelperFunctions.staticWait(2);
        test.info("Wait for deals checkbox visibility and clicked on it");
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(dealsCheckbox));
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", dealsCheckbox);
	   // dealsCheckbox.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on select topic");
	    selectTopic.click();
	    HelperFunctions.staticWait(2);
	    ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", automationContentPage);
	    test.info("Scroll to automation content page");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(automationContentPage.isDisplayed());
	    test.info("Verified automation content page is displayed");
	    HelperFunctions.staticWait(2);
	}
	public void setCheckboxColor(ExtentTest test) throws Exception {
		/*read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	    
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on select topic");
        selectTopic.click();
        //HelperFunctions.staticWait(2);
        test.info("Wait for deals checkbox visibility and move the cursor on it");
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(dealsCheckbox));
	   // String checkboxColor = dealsCheckbox.getCssValue("style");
	   // System.out.println(checkboxColor);
	    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
	    String backgroundColor = (String) executor.executeScript("return window.getComputedStyle(arguments[0], ':before').getPropertyValue('background-color');", dealsCheckbox);
	    System.out.println(backgroundColor);
	    Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(dealsCheckbox).perform();
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor executor2 = (JavascriptExecutor) Driver.getDriver();
	    String backgroundColor2 = (String) executor2.executeScript("return window.getComputedStyle(arguments[0], ':before').getPropertyValue('background-color');", dealsCheckbox);
	    System.out.println(backgroundColor2);
	    HelperFunctions.staticWait(2);
	    Assert.assertNotEquals(backgroundColor, backgroundColor2);
	    test.info("Verified the color of the checkbox has changed after moving the cursor on it");
	    HelperFunctions.staticWait(2);
	}
    
	public void setClearFilters(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	   
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on select topic");
        selectTopic.click();
        HelperFunctions.staticWait(2);
        test.info("Wait for deals checkbox visibility and clicked on it");
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(dealsCheckbox));
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", dealsCheckbox);
	   // dealsCheckbox.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on select topic");
	    selectTopic.click();
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(selectedFilter.isDisplayed());
	    test.info("Verified selected filter is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on clear filter");
        clearFilter.click();
        HelperFunctions.staticWait(5);
        Assert.assertTrue(filterTitle.isDisplayed());
        test.info("Verified the filter title is displayed");
        HelperFunctions.staticWait(3);
        
	}
	public void setVSHomepage(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on value store");
	    valueStore.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for filter title visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(filterTitle));
	    HelperFunctions.staticWait(2);
        Assert.assertTrue(filterTitle.isDisplayed());
        test.info("Verified the filter title is displayed");
        HelperFunctions.staticWait(3);
	}
	
	public void setLoadMoreButton(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	    
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on select topic");
        selectTopic.click();
        HelperFunctions.staticWait(2);
        test.info("Wait for deals checkbox visibility and clicked on it");
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(dealsCheckbox));
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", dealsCheckbox);
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on select topic");
	    selectTopic.click();
	    test.info("Getting the initial asset size");
	    int initialSize = assets.size();
	    HelperFunctions.staticWait(2);
	    test.info("Scroll to load more button");
	    HelperFunctions.scrollToElement(loadMore);
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on load more");
	    JavascriptExecutor js4 = (JavascriptExecutor) Driver.getDriver();
	    js4.executeScript("arguments[0].click();", loadMore);
	    //loadMore.click();
	    HelperFunctions.staticWait(2);
	    test.info("Getting the new asset size");
	    int newSize = assets.size();
	    if (newSize > initialSize) {
	    	Assert.assertTrue(true);
	        System.out.println("New assets were loaded successfully");
	    } else {
	    	Assert.assertTrue(false);
	        System.out.println("No new assets were loaded");
	    }
	    HelperFunctions.staticWait(3);
	    test.info("Verified new assets were loaded successfully");
	}
	
	public void setNoSubmitNeeded(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	  
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(firstAssetHomepage.isDisplayed());
	    test.info("Verified the first asset is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on select topic");
        selectTopic.click();
        HelperFunctions.staticWait(2);
        test.info("Wait for deals checkbox visibility and clicked on it");
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(dealsCheckbox));
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", dealsCheckbox);
	    HelperFunctions.staticWait(2);
	    test.info("Scroll to first asset");
	    ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", firstAssetFilter);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(firstAssetFilter.isDisplayed());
	    test.info("Verified the first asset after filtering is displayed");
	    HelperFunctions.staticWait(2);
	}
	
	public void setSharetheURL(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	   
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(firstAssetHomepage.isDisplayed());
	    test.info("Verified the first asset is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on it");
	    firstAssetHomepage.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Getting the current url and copy-paste it");
	    String url = Driver.getDriver().getCurrentUrl();
        StringSelection selection = new StringSelection(url);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, null);
        Driver.getDriver().findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
        Driver.getDriver().switchTo().defaultContent();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        HelperFunctions.staticWait(5);
        String newUrl = Driver.getDriver().getCurrentUrl();
        if (url.equals(newUrl)) {
        	Assert.assertTrue(true);
            System.out.println("Copy-paste successful!");
        } else {
        	Assert.assertTrue(false);
            System.out.println("Copy-paste failed!");
        }
        test.info("Verified Copy-paste action was successful");
        HelperFunctions.staticWait(3);
	}
	
	public void setFavicon(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	  
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(firstAssetHomepage.isDisplayed());
	    test.info("Verified the first asset is displayed on homapage");
	    test.info("Getting the favicon link");
	    String faviconUrl = faviconLink.getAttribute("href");
	 if (faviconUrl != null && faviconUrl.contains("favicon.ico")) {
		 Assert.assertTrue(true);
	     System.out.println("Favicon found!");	
	 } else {
		 Assert.assertTrue(false);
	     System.out.println("Favicon not found.");
	 }
	 test.info("Verified the favicon is displayed");
	}
	public void setTop10ArticleElementsClickable(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    test.info("Getting the current url");
	    String currentUrl=Driver.getDriver().getCurrentUrl();
	    test.info("Clicked on first article title");
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", firstArticleTitle);
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for logo visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(logo));
	    test.info("Getting the current url");
	    String currentUrl2=Driver.getDriver().getCurrentUrl();
	    Assert.assertNotEquals(currentUrl, currentUrl2);
	    test.info("Verified the url values are different");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on logo");
	    logo.click();
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for filter title visibility");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(filterTitle));
	    HelperFunctions.staticWait(3); 
	    test.info("Clicked on first article description");
	    JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
	    js3.executeScript("arguments[0].click();", firstArticleDescription);
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for logo visibility");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(logo));
	    String currentUrl3=Driver.getDriver().getCurrentUrl();
	    Assert.assertNotEquals(currentUrl, currentUrl3);
	    test.info("Verified the url values are different");
	    HelperFunctions.staticWait(3);
	}
	public void setMoretoExplore(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	  
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to more to explore");
	    HelperFunctions.scrollToElement(moretoExplore);
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(moretoExplore.isDisplayed());
	    test.info("Verified more to explore title is displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(moretoExploreSub.isDisplayed());
	    test.info("Verified more to explore subtitle is displayed");
	    HelperFunctions.staticWait(2);
	    for(WebElement each: exploreItems) {
	    	if(each.isDisplayed()) {
	    		Assert.assertTrue(true);
	    	}else {
	    		Assert.assertTrue(false);
	    	}
	    }
	    test.info("Verified more to explore items are displayed");
	    HelperFunctions.staticWait(2);
	    for (WebElement element : exploreItems) {
	        List<WebElement> imgs = element.findElements(By.tagName("img"));
	        if (!imgs.isEmpty()) {
	        	Assert.assertTrue(true);
	            System.out.println("Element contains img tag: " + element.getText());
	        }
	    }
	    test.info("Verified each more to explore items have an img tag");
	    HelperFunctions.staticWait(2);
	    
	}
	public void setMoretoExploreItemNavigation(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	  
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to more to explore");
	    HelperFunctions.scrollToElement(moretoExplore);
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(moretoExplore.isDisplayed());
	    test.info("Verified more to explore title is displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(moretoExploreSub.isDisplayed());
	    test.info("Verified more to explore subtitle is displayed");
	    HelperFunctions.staticWait(2);
	    String currentUrl=Driver.getDriver().getCurrentUrl();
	    for (WebElement element : exploreItems) {
	        List<WebElement> tags = element.findElements(By.tagName("a"));
	        if (!tags.isEmpty()) {
	        	Assert.assertTrue(true);
	            System.out.println("Element contains a tag: " + element.getText());
	        }
	    }
	    test.info("Verified each more to explore items have a tag");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on more to explore item");
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", exploreItems.get(0));
	   // exploreItems.get(0).click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    String currentUrl2=Driver.getDriver().getCurrentUrl();
	    HelperFunctions.staticWait(2);
	    Assert.assertNotEquals(currentUrl, currentUrl2);
	    test.info("Verified more to explore item tag is landing to another url");
	    HelperFunctions.staticWait(2);
	    
	    
	}
	public void setNoSearchResult(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	   
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on search button");
	    searchButton.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on search field and perform enter");
	    searchField.click();
	    HelperFunctions.staticWait(2);
	    Actions actions = new Actions(Driver.getDriver());
	    actions.sendKeys(Keys.ENTER).build().perform();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(trendingSearch2.isDisplayed());
	    test.info("Verified no search performing");
	    //HelperFunctions.staticWait(3);
	   /* test.info("Wait for no search result message is displayed");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(noSearchResult));
	    Assert.assertTrue(noSearchResult.isDisplayed());
	    test.info("Verified no search result message is displayed");*/
	    HelperFunctions.staticWait(3);
	    
	    
	}
	public void setMightAlsoLikeItems(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	    
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to also like title");
	    HelperFunctions.scrollToElement(alsoLikeTitle);
	    HelperFunctions.staticWait(5);
	    Assert.assertTrue(alsoLikeTitle.isDisplayed());
	    test.info("Verified also like title is displayed");
	    HelperFunctions.staticWait(2);
	    for(WebElement each: alsoLikeLabels) {
	    	if(each.isDisplayed()) {
	    		Assert.assertTrue(true);
	    	}else {
	    		Assert.assertTrue(false);
	    	}
	    }
	    test.info("Verified alsoLikeLabels are displayed");
	    HelperFunctions.staticWait(2);
	    for(WebElement each: alsoLikeTitles) {
	    	if(each.isDisplayed()) {
	    		Assert.assertTrue(true);
	    	}else {
	    		Assert.assertTrue(false);
	    	}
	    }
	    test.info("Verified alsoLikeTitles are displayed");
	    HelperFunctions.staticWait(3);
	    for(WebElement each: alsoLikeFavIcon) {
	    	if(each.isDisplayed()) {
	    		Assert.assertTrue(true);
	    	}else {
	    		Assert.assertTrue(false);
	    	}
	    }
	    test.info("Verified alsoLikeFavIcons are displayed");
	    HelperFunctions.staticWait(3);
	}
	public void setMightAlsoLikeItems2(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	    
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    
	    test.info("Verified logo is displayed");
	    HelperFunctions.staticWait(3);
	    test.info("Scroll down to also like title");
	    HelperFunctions.scrollToElement(alsoLikeTitle);
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(alsoLikeTitle.isDisplayed());
	    test.info("Verified also like title is displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(alsoLikeFavIcon.size()==3);
	    test.info("Verified also like fav icon size is 3");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(alsoLikeImage.isDisplayed());
	    WebElement img = alsoLikeImage.findElement(By.tagName("img"));
	    if (img != null) {
	    	Assert.assertTrue(true);
	        System.out.println("Element has img tag: " + alsoLikeImage.getText());
	    }else {
	    	Assert.assertTrue(false);
	    }
	    test.info("Verified also like image is displayed and has image tag");
	    test.info("Verified total element's size is 4");
	    HelperFunctions.staticWait(2);
	}
	
	public void setQuickLinksIconVisibility(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	    
	    test.info("Wait for quick links icon visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(quickLinksIcon));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(quickLinksIcon.isDisplayed());
	    test.info("Verified quick links icon is displayed");
	    HelperFunctions.staticWait(2);
	   
	}
	public void setQuickLinksIconOpensItems(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	 
	    test.info("Wait for quick links icon visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(quickLinksIcon));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(quickLinksIcon.isDisplayed());
	    test.info("Verified quick links icon is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on quick links icon");
	    quickLinksIcon.click();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(closeQuickLinks));
	    Assert.assertTrue(closeQuickLinks.isDisplayed());
	    test.info("Verified close button is displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(tdMenuItems.get(0).isDisplayed());
	    test.info("Verified tdMenuItem is displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(wtMenuItems.get(0).isDisplayed());
	    test.info("Verified wtMenuItem is displayed");
	    HelperFunctions.staticWait(2);
	}
	public void setQuickLinksIconCloseMegaMenu(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	  
	    test.info("Wait for quick links icon visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(quickLinksIcon));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(quickLinksIcon.isDisplayed());
	    test.info("Verified quick links icon is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on quick links icon");
	    quickLinksIcon.click();
	    test.info("Wait for close button");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(closeQuickLinks));
	    Assert.assertTrue(closeQuickLinks.isDisplayed());
	    test.info("Verified close button is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on quick links icon");
	    quickLinksIcon.click();
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(!closeQuickLinks.isDisplayed());
	    test.info("Verified close button is not displayed");
	    HelperFunctions.staticWait(2);
	}
	public void setSearchResultsBasedonKeyword(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	 /*   Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	 
	    test.info("Wait logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on search button");
	    searchButton.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on search field and send text");
	    searchField.click();
	    HelperFunctions.staticWait(2);
	    String mockContent="Covid";
	    searchField.sendKeys(mockContent);
	    HelperFunctions.staticWait(5);
	    test.info("Wait for suggested keyword visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(suggestedKeyword));
	    Assert.assertTrue(suggestedKeyword.isDisplayed());
	    test.info("Verified suggested keyword is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on enter");
	    Actions actions = new Actions(Driver.getDriver());
	    actions.sendKeys(Keys.ENTER).build().perform();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(10);
	    //HelperFunctions.staticWait(3);
	    test.info("Wait for search item visibility");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(searchItem));
	    Assert.assertTrue(searchItem.isDisplayed());
	    test.info("Verified search item is displayed");
	    HelperFunctions.staticWait(2);
	    
	    
	}
	public void setTrendingSearch(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	   
	    test.info("Wait logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on search button");
	    searchButton.click();
	    HelperFunctions.staticWait(2);
	    searchField.click();
	    HelperFunctions.staticWait(2);
	    test.info("Wait for trending search visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(trendingSearch));
	    Assert.assertTrue(trendingSearch.isDisplayed());
	    test.info("Verified trending search is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on first trending suggestion");
	    trendingSuggestions.get(0).click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for search item visibility");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(searchItem));
	    Assert.assertTrue(searchItem.isDisplayed());
	    test.info("Verified search item is displayed");
	    HelperFunctions.staticWait(2);
	    
	    
	}
	public void setSearchResultsTopicTitleIcon(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(10);
	   
	    test.info("Wait logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on search button");
	    searchButton.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on search field and send text");
	    searchField.click();
	    HelperFunctions.staticWait(2);
	    String mockContent="Covid";
	    searchField.sendKeys(mockContent);
	    HelperFunctions.staticWait(5);
	    test.info("Wait for suggested keyword's visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(suggestedKeyword));
	    Assert.assertTrue(suggestedKeyword.isDisplayed());
	    test.info("Verified suggested keyword is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on enter");
	    Actions actions = new Actions(Driver.getDriver());
	    actions.sendKeys(Keys.ENTER).build().perform();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(10);
	    //HelperFunctions.staticWait(3);
	    test.info("Wait search item's visibility");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(searchItem2));
	    Assert.assertTrue(searchItem2.isDisplayed());
	    test.info("Verified search item is displayed");
	    HelperFunctions.staticWait(2);
	    //Assert.assertTrue(searchItemIcon.isDisplayed());
	   // test.info("Verified search icon is displayed");
	   // HelperFunctions.staticWait(2);
	    test.info("Clicked on search item");
	    searchItem2.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(10);
	    HelperFunctions.staticWait(3);
	    Set<String> handles = Driver.getDriver().getWindowHandles();
	    if (handles.size() == 1) {
	    	Assert.assertTrue(true);
	     System.out.println("Element opened the same tab");
	 }else {
			Assert.assertTrue(false);
	 }
	    test.info("Verified element opened the same tab");
	    HelperFunctions.staticWait(3);
	    
	}
	public void setSharetheURLwithFilter(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	 /*   Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	    
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(firstAssetHomepage.isDisplayed());
	    test.info("Verified the first asset is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on it");
	    selectTopic.click();
        HelperFunctions.staticWait(2);
        test.info("Wait for deals checkbox visibility and clicked on it");
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(dealsCheckbox));
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", dealsCheckbox);
	   // dealsCheckbox.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on select topic");
	    selectTopic.click();
	    //firstAssetHomepage.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	    HelperFunctions.staticWait(3);
	    test.info("Getting the current url and copy-paste it");
	    String url = Driver.getDriver().getCurrentUrl();
        StringSelection selection = new StringSelection(url);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, null);
        Driver.getDriver().findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
        Driver.getDriver().switchTo().defaultContent();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        HelperFunctions.staticWait(5);
        String newUrl = Driver.getDriver().getCurrentUrl();
        if (url.equals(newUrl)) {
        	Assert.assertTrue(true);
            System.out.println("Copy-paste successful!");
        } else {
        	Assert.assertTrue(false);
            System.out.println("Copy-paste failed!");
        }
        test.info("Verified Copy-paste action was successful");
        HelperFunctions.staticWait(3);
        WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(dealsSearch));
        Assert.assertTrue(dealsSearch.isDisplayed());
	    HelperFunctions.staticWait(2);
	}
	public void setSelectTerritory(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(terriMenu.isDisplayed());
	    test.info("Verified territory menu is displayed");
	    HelperFunctions.staticWait(2);
	    terriMenu.click();
	    test.info("Clicked on territory menu");
	    //HelperFunctions.staticWait(3);
	    WebElement mexicoLink = Driver.getDriver().findElement(By.linkText("Mexico"));
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(mexicoLink));
	    mexicoLink.click();
	    test.info("Clicked on Mexico");
	    HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);
	    test.info("Wait for visibility of territory menu");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(terriMenu));
	    WebElement selectedCountry = Driver.getDriver().findElement(By.cssSelector(".selected-value"));
	    if (selectedCountry.getText().equals("Mexico")) {
	    	Assert.assertTrue(true);
	        System.out.println("Mexico is selected");
	    } else {
	        System.out.println("Mexico is not selected");
	    }
	    HelperFunctions.staticWait(2);
	    test.info("Verified Mexico is selected");
	   /* terriMenu.click();
	    test.info("Clicked on territory menu");
	    HelperFunctions.staticWait(3);
	    WebElement globalLink = Driver.getDriver().findElement(By.linkText("Global"));
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(globalLink));
	    globalLink.click();
	    test.info("Clicked on Global");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for visibility of territory menu");
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
	    wait6.until(ExpectedConditions.visibilityOf(terriMenu));
	    selectedCountry = Driver.getDriver().findElement(By.cssSelector(".selected-value"));
	    if (selectedCountry.getText().equals("Global")) {
	    	Assert.assertTrue(true);
	        System.out.println("Global is selected");
	    } else {
	        System.out.println("Global is not selected");
	    }
	    HelperFunctions.staticWait(2);
	    test.info("Verified Global is selected");
	    terriMenu.click();
	    test.info("Clicked on territory menu");
	    HelperFunctions.staticWait(3);
	    WebElement usLink = Driver.getDriver().findElement(By.linkText("United States"));
	    WebDriverWait wait7 = new WebDriverWait(Driver.getDriver(), 10);
	    wait7.until(ExpectedConditions.visibilityOf(usLink));
	    usLink.click();
	    test.info("Clicked on US");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for visibility of territory menu");
	    WebDriverWait wait8 = new WebDriverWait(Driver.getDriver(), 10);
	    wait8.until(ExpectedConditions.visibilityOf(terriMenu));
	    selectedCountry = Driver.getDriver().findElement(By.cssSelector(".selected-value"));
	    if (selectedCountry.getText().equals("United States")) {
	    	Assert.assertTrue(true);
	        System.out.println("United States is selected");
	    } else {
	        System.out.println("United States is not selected");
	    }
	    test.info("Verified United States is selected");
	    HelperFunctions.staticWait(3);*/
	}
	public void setTerritoryDropdown(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	 
	    test.info("Wait for page to load");
	   // HelperFunctions.waitForPageToLoad(15);
	   
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 20);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(terriMenu.isDisplayed());
	    test.info("Verified territory menu is displayed");
	    HelperFunctions.staticWait(2);
	    terriMenu.click();
	    test.info("Clicked on territory menu");
	    //HelperFunctions.staticWait(3);
	    WebElement mexicoLink = Driver.getDriver().findElement(By.linkText("Mexico"));
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(mexicoLink));
	    mexicoLink.click();
	    test.info("Clicked on Mexico");
	    HelperFunctions.waitForPageToLoad(30);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(terriMenu));
	    WebElement selectedCountry = Driver.getDriver().findElement(By.cssSelector(".selected-value"));
	    System.out.println(selectedCountry.getText());
	    if (selectedCountry.getText().equals("México")) {
	    	Assert.assertTrue(true);
	        System.out.println("Mexico is selected");
	    } else {
	        System.out.println("Mexico is not selected");
	    }
	    test.info("Verified Mexico is selected");
	   /* WebElement mexicoListItem = Driver.getDriver().findElement(By.cssSelector(".cmp-navigation__item--active"));
	    if (mexicoListItem.getAttribute("class").contains("cmp-navigation__item--active")
	            && !US.getAttribute("class").contains("cmp-navigation__item--active")
	            && !global.getAttribute("class").contains("cmp-navigation__item--active")) {
	    	Assert.assertTrue(true);
	          System.out.println("Mexico is selected and United States/Global are not selected");
	        } else {
	          System.out.println("Mexico is not selected or United States/Global are selected");
	        }
	    test.info("Verified Mexico is selected and United States/Global are not selected");*/
	    HelperFunctions.staticWait(2);
	    terriMenu.click();
	    test.info("Clicked on territory menu");
	    //HelperFunctions.staticWait(3);
	    WebElement usLink = Driver.getDriver().findElement(By.linkText("Estados Unidos"));
	    WebDriverWait wait7 = new WebDriverWait(Driver.getDriver(), 10);
	    wait7.until(ExpectedConditions.visibilityOf(usLink));
	    usLink.click();
	    test.info("Clicked on US");
	    HelperFunctions.waitForPageToLoad(30);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait8 = new WebDriverWait(Driver.getDriver(), 10);
	    wait8.until(ExpectedConditions.visibilityOf(terriMenu));
	    selectedCountry = Driver.getDriver().findElement(By.cssSelector(".selected-value"));
	    if (selectedCountry.getText().equals("United States")) {
	    	Assert.assertTrue(true);
	        System.out.println("United States is selected");
	    } else {
	        System.out.println("United States is not selected");
	    }
	    test.info("Verified United States is selected");
	    HelperFunctions.staticWait(3);
	}
	public void setMightAlsoLikeTitle(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	 /*   Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	    
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 20);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to also like title");
	    HelperFunctions.scrollToElement(alsoLikeTitle);
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(alsoLikeTitle.isDisplayed());
	    test.info("Verified also like title is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on also like title");
	    alsoLikeTitles2.get(0).click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	   
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(contentTitle));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(contentTitle.isDisplayed());
	    test.info("Verified content title is displayed");
	    HelperFunctions.staticWait(3);
	}
	public void setSuggestedTags(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	 
	    test.info("Wait logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 20);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on search button");
	    searchButton.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on search field and send text");
	    searchField.click();
	    HelperFunctions.staticWait(2);
	    String mockContent="audit";
	    searchField.sendKeys(mockContent);
	    //HelperFunctions.staticWait(5);
	    test.info("Wait for suggested keyword's visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 20);
	    wait3.until(ExpectedConditions.visibilityOf(keySuggestion));
	    Assert.assertTrue(keySuggestion.isDisplayed());
	    test.info("Verified suggested keyword is displayed");
	    HelperFunctions.staticWait(3);
	}
	public void setFavIconVisibility(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	    
	    test.info("Wait for fav icon's visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 20);
	    wait3.until(ExpectedConditions.visibilityOf(favIcon));
	    HelperFunctions.staticWait(3);  
	    Assert.assertTrue(favIcon.isDisplayed());
	    test.info("Verified fav icon is displayed");
	    HelperFunctions.staticWait(3);
	}
	public void setFavContents(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	  
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	
	    test.info("Wait for fav icon's visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(favIcon));
	    HelperFunctions.staticWait(3);  
	    Assert.assertTrue(favIcon.isDisplayed());
	    test.info("Verified fav icon is displayed");
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", articleFavIcons.get(0));
	    HelperFunctions.staticWait(5);
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", articleFavIcons2.get(0));
	    //articleFavIcons.get(0).click();
	    test.info("Added 2 elements to the favorites");
	    HelperFunctions.staticWait(5);
	    test.info("Clicked on fav icon link");
	    favIconLink.click();
	    test.info("Wait for fav header's visibility");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(favHeader));
	    Assert.assertTrue(favHeader.isDisplayed());
	    test.info("Verified fav header's visibility");
	    boolean allTextsFound = true;
	    for (WebElement firstElement : articleTitles) {
	        boolean foundText = false;
	        String firstText = firstElement.getText();
	        for (WebElement secondElement : articleTitles) {
	            String secondText = secondElement.getText();
	            if (secondText.contains(firstText)) {
	                foundText = true;
	                break;
	            }
	        }
	        if (!foundText) {
	            allTextsFound = false;
	            break;
	        }
	    }

	    if (allTextsFound) {
	    	Assert.assertTrue(true);
	        System.out.println("All text values found in second list.");
	    } else {
	        System.out.println("Not all text values found in second list.");
	    }
	    test.info("Verified All text values found in second list.");
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    for(WebElement each: favIconsFav) {
	    	wait5.until(ExpectedConditions.elementToBeClickable(each)).click();
	    }
	    //JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
	    //js3.executeScript("arguments[0].click();", favIconsFav.get(0));
	    HelperFunctions.staticWait(2);
	   // JavascriptExecutor js4 = (JavascriptExecutor) Driver.getDriver();
	   // js4.executeScript("arguments[0].click();", favIconFav);   
	    test.info("Removed all favs on favs page");
	    Assert.assertTrue(noResultHeading.isDisplayed());
	    test.info("Verified no result heading is displayed");
	    HelperFunctions.staticWait(3);
	}
	public void setFavPage(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	    
	    test.info("Wait for fav icon's visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 20);
	    wait3.until(ExpectedConditions.visibilityOf(favIcon));
	    HelperFunctions.staticWait(3); 
	    Assert.assertTrue(favIcon.isDisplayed());
	    test.info("Verified fav icon is displayed");
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", articleFavIcons.get(0));
	    HelperFunctions.staticWait(5);
	    test.info("Clicked on fav icon link");
	    favIconLink.click();
	    test.info("Wait for fav header's visibility");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 30);
	    wait4.until(ExpectedConditions.visibilityOf(favHeader));
	    favImage.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);  
	    test.info("Wait for content box's visibility");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(contentBox));
	    Assert.assertTrue(contentBox.isDisplayed());
	    Driver.getDriver().navigate().back();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3); 
	    test.info("Wait for fav header's visibility");
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
	    wait6.until(ExpectedConditions.visibilityOf(favHeader));
	    favTitle.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);  
	    test.info("Wait for content box's visibility");
	    WebDriverWait wait7 = new WebDriverWait(Driver.getDriver(), 10);
	    wait7.until(ExpectedConditions.visibilityOf(contentBox));
	    Assert.assertTrue(contentBox.isDisplayed());
	    Driver.getDriver().navigate().back();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3); 
	    test.info("Wait for fav header's visibility");
	    WebDriverWait wait8 = new WebDriverWait(Driver.getDriver(), 10);
	    wait8.until(ExpectedConditions.visibilityOf(favHeader));
	    //favDescription.click();
	    //test.info("Wait for page to load");
	   // HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);  
	    //test.info("Wait for content box's visibility");
	   // WebDriverWait wait9 = new WebDriverWait(Driver.getDriver(), 10);
	   // wait9.until(ExpectedConditions.visibilityOf(contentBox));
	   // Assert.assertTrue(contentBox.isDisplayed());
	   // Driver.getDriver().navigate().back();
	   // test.info("Wait for page to load");
	   // HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3); 
	    //test.info("Wait for fav header's visibility");
	   // WebDriverWait wait10 = new WebDriverWait(Driver.getDriver(), 10);
	   // wait10.until(ExpectedConditions.visibilityOf(favHeader));
	    WebDriverWait wait11 = new WebDriverWait(Driver.getDriver(), 10);
	    for(WebElement each: favIconsFav) {
	    	wait11.until(ExpectedConditions.elementToBeClickable(each)).click();
	    }
	    //JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    //js2.executeScript("arguments[0].click();", favIconFav);
	    HelperFunctions.staticWait(3); 
	}
	public void setFavFilter(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	 
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	   
	    test.info("Wait for fav icon's visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 20);
	    wait3.until(ExpectedConditions.visibilityOf(favIcon));
	    HelperFunctions.staticWait(3);  
	    Assert.assertTrue(favIcon.isDisplayed());
	    test.info("Verified fav icon is displayed");
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", articleFavIcons.get(0));
	    HelperFunctions.staticWait(5);
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", articleFavIcons2.get(0));
	    //articleFavIcons.get(0).click();
	    test.info("Added 2 elements to the favorites");
	    HelperFunctions.staticWait(5);
	    test.info("Clicked on fav icon link");
	    favIconLink.click();
	    test.info("Wait for fav header's visibility");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 20);
	    wait4.until(ExpectedConditions.visibilityOf(favHeader));
	    Assert.assertTrue(favHeader.isDisplayed());
	    test.info("Verified fav header's visibility");
	    List<String> originalOrder=new ArrayList<>();
	    for(WebElement element:articleTitles) {
	    	originalOrder.add(element.getText());
	    }
	    test.info("Stored original order");
	    HelperFunctions.staticWait(2);
	    favFilter.click();
	    test.info("Clicked on filter dropdown");
	    HelperFunctions.staticWait(2);
	    oToN.click();
	    test.info("Clicked on oldest to newest");
	    HelperFunctions.staticWait(3);
	    List<String> newOrder=new ArrayList<>();
	    for(WebElement element:articleTitles) {
	    	newOrder.add(element.getText());
	    }
	    test.info("Stored new order");
	    HelperFunctions.staticWait(2);
	    Assert.assertNotEquals(originalOrder, newOrder);
	    test.info("Verified order has changed");
	    HelperFunctions.staticWait(2);
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    for(WebElement each: favIconsFav) {
	    	wait5.until(ExpectedConditions.elementToBeClickable(each)).click();
	    }
	    //JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
	   // js3.executeScript("arguments[0].click();", favIconsFav.get(0));
	    HelperFunctions.staticWait(2);
	    //JavascriptExecutor js4 = (JavascriptExecutor) Driver.getDriver();
	   // js4.executeScript("arguments[0].click();", favIconFav);   
	    test.info("Removed all favs on favs page");
	    Assert.assertTrue(noResultHeading.isDisplayed());
	    test.info("Verified no result heading is displayed");
	    HelperFunctions.staticWait(3);
	}
	public void setSpanishTag(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	 
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	   
	    test.info("Wait for fav icon's visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 20);
	    wait3.until(ExpectedConditions.visibilityOf(favIcon));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(favIcon.isDisplayed());
	    test.info("Verified fav icon is displayed");
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on territory menu");
	    terriMenu.click();
	    wait3.until(ExpectedConditions.visibilityOf(mexico));
	    test.info("Clicked on mexico");
	    mexico.click();
	    HelperFunctions.waitForPageToLoad(30);
	    HelperFunctions.staticWait(3); 
	    for (WebElement element : spanishTags) {
	      String text = element.getText();
	      if (text.matches(".[áéíóúñÑ].")) {
	    	  Assert.assertTrue(true);
	            System.out.println("Found element with Spanish characters: " + text);
	     
	        }
	    }
	    HelperFunctions.staticWait(3);
	}
	public void setFavContentsMexico(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	  
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	    
	    test.info("Wait for fav icon's visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 20);
	    wait3.until(ExpectedConditions.visibilityOf(favIcon));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(favIcon.isDisplayed());
	    test.info("Verified fav icon is displayed");
	    test.info("Clicked on territory menu");
	    terriMenu.click();
	    wait3.until(ExpectedConditions.visibilityOf(mexico));
	    test.info("Clicked on mexico");
	    mexico.click();
	    HelperFunctions.waitForPageToLoad(30);
	    HelperFunctions.staticWait(3); 
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", articleFavIcons.get(0));
	    HelperFunctions.staticWait(5);
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", articleFavIcons2.get(0));
	    //articleFavIcons.get(0).click();
	    test.info("Added 2 elements to the favorites");
	    HelperFunctions.staticWait(5);
	    test.info("Clicked on fav icon link");
	    favIconLink.click();
	    test.info("Wait for fav header's visibility");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(favHeader));
	    Assert.assertTrue(favHeader.isDisplayed());
	    test.info("Verified fav header's visibility");
	    boolean allTextsFound = true;
	    for (WebElement firstElement : articleTitles) {
	        boolean foundText = false;
	        String firstText = firstElement.getText();
	        for (WebElement secondElement : articleTitles) {
	            String secondText = secondElement.getText();
	            if (secondText.contains(firstText)) {
	                foundText = true;
	                break;
	            }
	        }
	        if (!foundText) {
	            allTextsFound = false;
	            break;
	        }
	    }

	    if (allTextsFound) {
	    	Assert.assertTrue(true);
	        System.out.println("All text values found in second list.");
	    } else {
	        System.out.println("Not all text values found in second list.");
	    }
	    test.info("Verified All text values found in second list.");
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    for(WebElement each: favIconsFav) {
	    	wait5.until(ExpectedConditions.elementToBeClickable(each)).click();
	    }
	    //JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
	   // js3.executeScript("arguments[0].click();", favIconsFav.get(0));
	    HelperFunctions.staticWait(3);
	   // JavascriptExecutor js4 = (JavascriptExecutor) Driver.getDriver();
	   // js4.executeScript("arguments[0].click();", favIconFav);   
	    test.info("Removed all favs on favs page");
	    Assert.assertTrue(noResultHeading.isDisplayed());
	    test.info("Verified no result heading is displayed");
	}
	public void setFilterResultsMexico(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	   
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	 
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 20);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on territory menu");
	    terriMenu.click();
	    wait2.until(ExpectedConditions.visibilityOf(mexico));
	    test.info("Clicked on mexico");
	    mexico.click();
	    HelperFunctions.waitForPageToLoad(30);
	    HelperFunctions.staticWait(3); 
	    test.info("Clicked on select topic");
        selectTopicMX.click();
        //HelperFunctions.staticWait(2);
        test.info("Wait for esg checkbox visibility and clicked on it");
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(mexicoCheckbox));
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", mexicoCheckbox);
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on select topic");
	    selectTopicMX.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on article title");
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", articleTitles.get(0));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    test.info("Wait for content box's visibility");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(contentBox));
	    String currentUrl=Driver.getDriver().getCurrentUrl();
	    Assert.assertTrue(currentUrl.contains("mx/es"));
	    HelperFunctions.staticWait(3);
	}
	public void setQuickLinksIconOpensItems2(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(3);
	    //HelperFunctions.staticWait(3);
	    test.info("Wait for quick links icon visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(quickLinksIcon));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(quickLinksIcon.isDisplayed());
	    test.info("Verified quick links icon is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on quick links icon");
	    quickLinksIcon.click();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(closeQuickLinks));
	    Assert.assertTrue(closeQuickLinks.isDisplayed());
	    test.info("Verified close button is displayed");
	    HelperFunctions.staticWait(2);
	    for(WebElement element: tdMenuItems2) {
	    	if(element.getAttribute("href")!=null && !element.getAttribute("href").isEmpty()) {
	    		Assert.assertTrue(true);
	    	}else {
	    		Assert.assertTrue(false);
	    	}
	    }
	    HelperFunctions.staticWait(3);
	}
	public void setFiltersOnGlobal(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	    
	    test.info("Wait for terri menu's visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    wait2.until(ExpectedConditions.visibilityOf(terriMenu));
	    //HelperFunctions.staticWait(3);
	    //Assert.assertTrue(terriMenu.isDisplayed());
	    //test.info("Verified territory menu is displayed");
	    //HelperFunctions.staticWait(2);
	    terriMenu.click();
	    test.info("Clicked on territory menu");
	    HelperFunctions.staticWait(3);
	    WebElement globalLink = Driver.getDriver().findElement(By.linkText("Global"));
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(globalLink));
	    globalLink.click();
	    test.info("Clicked on Global");
	    HelperFunctions.waitForPageToLoad(30);
	    //HelperFunctions.staticWait(3);
	    test.info("Wait for visibility of territory menu");
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 20);
	    wait6.until(ExpectedConditions.visibilityOf(selectTopic));
	    selectTopic.click();
        //HelperFunctions.staticWait(2);
        test.info("Wait for deals checkbox visibility and clicked on it");
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 20);
	    wait3.until(ExpectedConditions.visibilityOf(dealsCheckbox));
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", dealsCheckbox);
	   // dealsCheckbox.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on select topic");
	    selectTopic.click();
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(selectedFilter.isDisplayed());
	    test.info("Verified selected filter is displayed");
	    HelperFunctions.staticWait(2);
	}
	public void setNoSearchResultGlobal(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    test.info("Wait for terri menu's visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    wait2.until(ExpectedConditions.visibilityOf(terriMenu));
	    //HelperFunctions.staticWait(3);
	    //Assert.assertTrue(terriMenu.isDisplayed());
	    //test.info("Verified territory menu is displayed");
	    //HelperFunctions.staticWait(2);
	    terriMenu.click();
	    test.info("Clicked on territory menu");
	    HelperFunctions.staticWait(3);
	    WebElement globalLink = Driver.getDriver().findElement(By.linkText("Global"));
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(globalLink));
	    globalLink.click();
	    test.info("Clicked on Global");
	    HelperFunctions.waitForPageToLoad(30);
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on search button");
	    searchButton.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on search field and perform enter");
	    searchField.click();
	    HelperFunctions.staticWait(2);
	    Actions actions = new Actions(Driver.getDriver());
	    actions.sendKeys(Keys.ENTER).build().perform();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(30);
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(trendingSearch2.isDisplayed());
	    test.info("Verified no content page is displayed");
	   /* test.info("Wait for no search result message is displayed");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(noSearchResult));
	    Assert.assertTrue(noSearchResult.isDisplayed());
	    test.info("Verified no search result message is displayed");*/
	    HelperFunctions.staticWait(2);
	    
	    
	}
	public void setNoFavGlobal(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    test.info("Wait for terri menu's visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    wait2.until(ExpectedConditions.visibilityOf(terriMenu));
	    //HelperFunctions.staticWait(3);
	    //Assert.assertTrue(terriMenu.isDisplayed());
	    //test.info("Verified territory menu is displayed");
	    //HelperFunctions.staticWait(2);
	    terriMenu.click();
	    test.info("Clicked on territory menu");
	    //HelperFunctions.staticWait(3);
	    WebElement globalLink = Driver.getDriver().findElement(By.linkText("Global"));
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 30);
	    wait5.until(ExpectedConditions.visibilityOf(globalLink));
	    globalLink.click();
	    test.info("Clicked on Global");
	    HelperFunctions.waitForPageToLoad(30);
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(favIcon2.size()==0);
	    test.info("Verified no fav icon is displayed");
	    HelperFunctions.staticWait(3);
	    
	}
	public void setDidYouMean(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.visibilityOf(terriMenu));
	    //HelperFunctions.staticWait(3);
	    //Assert.assertTrue(terriMenu.isDisplayed());
	    //test.info("Verified territory menu is displayed");
	    //HelperFunctions.staticWait(2);
	    terriMenu.click();
	    test.info("Clicked on territory menu");
	    //HelperFunctions.staticWait(3);
	    WebElement globalLink = Driver.getDriver().findElement(By.linkText("Global"));
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 30);
	    wait1.until(ExpectedConditions.visibilityOf(globalLink));
	    globalLink.click();
	    test.info("Clicked on Global");
	    HelperFunctions.waitForPageToLoad(30);
	    test.info("Wait searchButton's visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    wait2.until(ExpectedConditions.visibilityOf(searchButton));
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on search button");
	    searchButton.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on search field and send text");
	    searchField.click();
	    HelperFunctions.staticWait(2);
	    String mockContent="Tay";
	    searchField.sendKeys(mockContent);
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on enter");
	    Actions actions = new Actions(Driver.getDriver());
	    actions.sendKeys(Keys.ENTER).build().perform();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(30);
	    //HelperFunctions.staticWait(3);
	    test.info("Wait did you mean text's visibility");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 30);
	    wait4.until(ExpectedConditions.visibilityOf(didYouMean));
	    Assert.assertTrue(didYouMean.isDisplayed());
	    test.info("Verified didYouMean is displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(didYouMeanText.isDisplayed());
	    test.info("Verified didYouMeanText is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on didYouMeanText item");
	    didYouMeanText.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(30);
	    //HelperFunctions.staticWait(3);
	    test.info("Wait suggestedHeading's visibility");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 30);
	    wait5.until(ExpectedConditions.visibilityOf(suggestedHeading));
	    String message="results for";
	    Assert.assertTrue(suggestedHeading.getText().contains(message));
	    test.info("Verified suggestedHeading contains required message");
	    HelperFunctions.staticWait(2);
	    String message2="tax";
	    Assert.assertTrue(suggestedText.getText().contains(message2));
	    test.info("Verified suggestedText contains required keyword");
	    HelperFunctions.staticWait(3);
	    
	}
	public void setExternalPageNewTab(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    test.info("Wait for page to load");
	   
	    test.info("Wait search button's visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    wait2.until(ExpectedConditions.visibilityOf(searchButton));
	    test.info("Clicked on search button");
	    searchButton.click();
	    wait2.until(ExpectedConditions.visibilityOf(searchField));
	    test.info("Clicked on search field and send text");
	    searchField.click();
	    HelperFunctions.staticWait(2);
	    String mockContent="external";
	    searchField.sendKeys(mockContent);
	    HelperFunctions.staticWait(3);
	    test.info("Clicking on Enter");
	    Actions actions = new Actions(Driver.getDriver());
	    actions.sendKeys(Keys.ENTER).build().perform();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(60);
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", externalIcon);
	    test.info("Clicked on first external icon");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 30);
	    wait4.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles3 = Driver.getDriver().getWindowHandles();
	    Assert.assertEquals(windowHandles3.size(), 2, "Expected two windows to be open, but found " + windowHandles3.size());
	    test.info("Verified external icon opened in a new tab");
	    HelperFunctions.staticWait(3);
	    
	    
	}
	public void setSelectingTerritoriesSearchResult(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
		 test.info("Wait for page to load");
		   
		    test.info("Wait search button's visibility");
		    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
		    wait2.until(ExpectedConditions.visibilityOf(searchButton));
		    test.info("Clicked on search button");
		    searchButton.click();
		    wait2.until(ExpectedConditions.visibilityOf(searchField));
		    test.info("Clicked on search field and send text");
		    searchField.click();
		    HelperFunctions.staticWait(2);
		    String mockContent="esg";
		    searchField.sendKeys(mockContent);
		    HelperFunctions.staticWait(3);
		    test.info("Clicking on Enter");
		    Actions actions = new Actions(Driver.getDriver());
		    actions.sendKeys(Keys.ENTER).build().perform();
		    test.info("Wait for page to load");
		    HelperFunctions.waitForPageToLoad(60);
		    try {
		    	Thread.sleep(3000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
		    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
		    js.executeScript("arguments[0].click();", mexicoCheckbox);
		    test.info("Clicked on mexico checkbox");
		    try {
		    	Thread.sleep(5000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
		    Assert.assertTrue(countryCount.getText().contains("Mexico"));
		    /*HelperFunctions.staticWait(5);
		    boolean foundMexico=false;
		    for(WebElement label:terriLabels) {
		    	System.out.println(label.getText());
		    	String text=label.getText();
		    	if(text.contains("Mexico")) {
		    		foundMexico=true;
		    		break;
		    	}
		    }
		    if(foundMexico) {
		    	Assert.assertTrue(true);
		    }else {
		    	Assert.assertTrue(false);
		    }*/
		    try {
		    	Thread.sleep(5000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
		    js.executeScript("arguments[0].click();", mexicoCheckbox);
		    try {
		    	Thread.sleep(4000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
		    js.executeScript("arguments[0].click();", globalCheckbox);
		    try {
		    	Thread.sleep(5000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
		    Assert.assertTrue(countryCount.getText().contains("Global"));
		    /*HelperFunctions.staticWait(5);
		    boolean foundGlobal=false;
		    for(WebElement label2:terriLabels) {
		    	String text2=label2.getText();
		    	if(text2.contains("Global")) {
		    		foundGlobal=true;
		    		break;
		    	}
		    }
		    if(foundGlobal) {
		    	Assert.assertTrue(true);
		    }else {
		    	Assert.assertTrue(false);
		    }*/
		    HelperFunctions.staticWait(3);
		    test.info("Clicked on territory menu");
		    terriMenu.click();
		    wait2.until(ExpectedConditions.visibilityOf(mexico));
		    test.info("Clicked on mexico");
		    mexico.click();
		    HelperFunctions.waitForPageToLoad(60);
		    wait2.until(ExpectedConditions.visibilityOf(searchButton));
		    test.info("Clicked on search button");
		    searchButton.click();
		    wait2.until(ExpectedConditions.visibilityOf(searchField2));
		    test.info("Clicked on search field and send text");
		    searchField2.click();
		    HelperFunctions.staticWait(2);
		    searchField2.sendKeys(mockContent);
		    HelperFunctions.staticWait(3);
		    test.info("Clicking on Enter");
		    actions.sendKeys(Keys.ENTER).build().perform();
		    test.info("Wait for page to load");
		    HelperFunctions.waitForPageToLoad(60);
		    try {
		    	Thread.sleep(4000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
		    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
		    js2.executeScript("arguments[0].click();", usCheckbox);
		    test.info("Clicked on us checkbox");
		   /* HelperFunctions.staticWait(5);
		    boolean foundus=false;
		    for(WebElement label3:terriLabels) {
		    	System.out.println(label3.getText());
		    	String text3=label3.getText();
		    	if(text3.contains("US")) {
		    		foundus=true;
		    		break;
		    	}
		    }
		    if(foundus) {
		    	Assert.assertTrue(true);
		    }else {
		    	Assert.assertTrue(false);
		    }*/
		    try {
		    	Thread.sleep(5000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
		    Assert.assertTrue(countryCount.getText().contains("Estados"));
		    try {
		    	Thread.sleep(4000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
		    js2.executeScript("arguments[0].click();", usCheckbox);
		    try {
		    	Thread.sleep(4000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
		    js2.executeScript("arguments[0].click();", globalCheckbox);
		    /*HelperFunctions.staticWait(5);
		    boolean foundGlobal3=false;
		    for(WebElement label4:terriLabels) {
		    	String text4=label4.getText();
		    	if(text4.contains("Global")) {
		    		foundGlobal3=true;
		    		break;
		    	}
		    }
		    if(foundGlobal3) {
		    	Assert.assertTrue(true);
		    }else {
		    	Assert.assertTrue(false);
		    }*/
		    try {
		    	Thread.sleep(5000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
		    Assert.assertTrue(countryCount.getText().contains("Global"));
		    HelperFunctions.staticWait(3);
		    terriMenu.click();
		    test.info("Clicked on territory menu");
		    //HelperFunctions.staticWait(3);
		    WebElement globalLink = Driver.getDriver().findElement(By.linkText("Global"));
		    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 30);
		    wait5.until(ExpectedConditions.visibilityOf(globalLink));
		    globalLink.click();
		    test.info("Clicked on Global");
		    HelperFunctions.waitForPageToLoad(60);
		    wait2.until(ExpectedConditions.visibilityOf(searchButton));
		    test.info("Clicked on search button");
		    searchButton.click();
		    wait2.until(ExpectedConditions.visibilityOf(searchField));
		    test.info("Clicked on search field and send text");
		    searchField.click();
		    HelperFunctions.staticWait(2);
		    searchField.sendKeys(mockContent);
		    HelperFunctions.staticWait(3);
		    test.info("Clicking on Enter");
		    actions.sendKeys(Keys.ENTER).build().perform();
		    test.info("Wait for page to load");
		    HelperFunctions.waitForPageToLoad(60);
		    try {
		    	Thread.sleep(4000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
		    JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
		    js3.executeScript("arguments[0].click();", mexicoCheckbox2);
		    test.info("Clicked on mexico checkbox");
		    /*HelperFunctions.staticWait(5);
		    boolean foundMexico2=false;
		    for(WebElement label5:terriLabels) {
		    	System.out.println(label5.getText());
		    	String text5=label5.getText();
		    	if(text5.contains("Mexico")) {
		    		foundMexico2=true;
		    		break;
		    	}
		    }
		    if(foundMexico2) {
		    	Assert.assertTrue(true);
		    }else {
		    	Assert.assertTrue(false);
		    }*/
		    try {
		    	Thread.sleep(5000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
		    Assert.assertTrue(countryCount.getText().contains("Mexico"));
		    try {
		    	Thread.sleep(4000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
		    js2.executeScript("arguments[0].click();", mexicoCheckbox2);
		    try {
		    	Thread.sleep(4000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
		    js2.executeScript("arguments[0].click();", usGlobalCheckbox);
		    /*HelperFunctions.staticWait(5);
		    boolean foundus2=false;
		    for(WebElement label6:terriLabels) {
		    	String text6=label6.getText();
		    	if(text6.contains("US")) {
		    		foundus2=true;
		    		break;
		    	}
		    }
		    if(foundus2) {
		    	Assert.assertTrue(true);
		    }else {
		    	Assert.assertTrue(false);
		    }*/
		    try {
		    	Thread.sleep(5000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
		    Assert.assertTrue(countryCount.getText().contains("US"));
		    HelperFunctions.staticWait(3);
	}
}

