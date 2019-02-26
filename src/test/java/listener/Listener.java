package listener;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.BaseTest;

public class Listener extends BaseTest implements ITestListener {


    @Override
    public void onTestStart(ITestResult ıTestResult) {
       driver.get(baseURL);
      System.out.println("sayfa acılıyor");

    }

    @Override
    public void onTestSuccess(ITestResult ıTestResult) {
        System.out.println("Test Basarılı");

    }

    @Override
    public void onTestFailure(ITestResult ıTestResult) {
        System.out.println("Test Fail");

    }

    @Override
    public void onTestSkipped(ITestResult ıTestResult) {
        System.out.println("Test Skipped");

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult ıTestResult) {

    }

    @Override
    public void onStart(ITestContext ıTestContext) {
        driver= new ChromeDriver();

    }

    @Override
    public void onFinish(ITestContext ıTestContext) {
        //driver.quit();

    }
}
