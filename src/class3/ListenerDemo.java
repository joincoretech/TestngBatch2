package class3;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo implements ITestListener {


    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("start a test with a name "+iTestResult.getName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("test case passed. we will take screen shot");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("test case skipped "+iTestResult.getName());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("test case failed we will report");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }
}
