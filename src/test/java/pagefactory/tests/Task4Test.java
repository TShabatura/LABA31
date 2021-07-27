package pagefactory.tests;

import model.InputData;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import util.XmlToObject;

public class Task4Test extends BaseTest {
    @Test
    public void task4Test(){
        InputData data = new XmlToObject().inputData();
        getHomePage().inputSearchData(data.getGroupOfThings());
        getNotebookPage().waitForPageLoadingComplete(60);
        getNotebookPage().searchByProducer(data.getProducer());
        getNotebookPage().waitForFiltering(60, By.xpath("//div[@data-filter-name='producer']//label"));
        getNotebookPage().filterByProducer();
        getNotebookPage().waitForPageLoadingComplete(60);
        getNotebookPage().clickAddToCartButton();
        getNotebookPage().clickCartButton();
        getNotebookPage().waitForVisibilityOfElement(60, getNotebookPage().getPopup());
        Assert.assertTrue(getCartPopup().getTotalAmountOfCart() < data.getTotalAmount());
    }
}
