package Pom1;

import generic.Bae_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_methodes.SelectGM;

public class Search1 extends Bae_Page{
	@FindBy(xpath = "(//li[@class='trainsApp'])[2]")
	private WebElement ele;
	
	@FindBy(xpath = "//input[@id='from_station']")
	private WebElement ele1;
	
	@FindBy(xpath = "//input[@id='to_station']")                                     
	private WebElement ele2;
	
	@FindBy(xpath = "//select[@id='trainClass']")
	private WebElement ele3;
	
	@FindBy(xpath = "//input[@id='dpt_date']")
	private WebElement ele4;
	
	@FindBy(xpath = "(//a[.='12'])[1]")
	private WebElement ele5;
	
	@FindBy(xpath = "//select[@id='train_adults']")
	private WebElement ele6;
	
	@FindBy(xpath = "//select[@id='train_children']")
	private WebElement ele7;
    
	@FindBy(xpath = "//select[@id='train_male_seniors']")
	private WebElement ele8;

	@FindBy(xpath = "//select[@id='train_female_seniors']")
	private WebElement ele9;
	
	@FindBy(xpath = "//button[@id='trainFormButton']")
	private WebElement ele10;
	
    public Search1(WebDriver driver){
    	super(driver);
    }                                                                  
    public void ClickTrains(){                                         
    	ele.click();
    }
    public void enterFromAddress(String from){
    	ele1.sendKeys(from);
    }
    public void enterToAddress(String to){
    	ele2.sendKeys(to);
    }
    public void selectTrains(){
    	SelectGM s1 = new SelectGM();
    	s1.selectIndex(ele3,2);                              
    }
    public void clickOn_dptDate(){
         ele4.click();
    }
    public void select_dptDate(){
        ele5.click();
   }
    public void selectAdults(){
    	SelectGM s1 = new SelectGM();
    	s1.selectIndex(ele6,2);                              
    }
    public void selectChildern(){
    	SelectGM s1 = new SelectGM();
    	s1.selectIndex(ele7,5);                              
    }
    public void selectSeniorMen(){
    	SelectGM s1 = new SelectGM();
    	s1.selectIndex(ele8,5);                              
    }
    public void selectSeniorWomen(){
    	SelectGM s1 = new SelectGM();
    	s1.selectIndex(ele9,6);                              
    }
    public void ClickOnSearch(){
        ele10.click();
   }
}
