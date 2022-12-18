package org.orangehrm.ui.listener;

import org.orangehrm.ui.enums.loggers.LogType;
import org.orangehrm.ui.logger.LogManager;
import org.orangehrm.ui.logger.OrangeHRMDemoLogger;
import org.testng.*;

public class Listener implements ITestListener, ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
        ISuiteListener.super.onStart(suite);
        LogManager.propertyConfigurator();
    }

    @Override
    public void onFinish(ISuite suite) {
        ISuiteListener.super.onFinish(suite);
    }

    @Override
    public void onTestStart(ITestResult result) {
        OrangeHRMDemoLogger.log(LogType.PASS,result.getMethod().getConstructorOrMethod().getMethod().getName() +" Started...");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        OrangeHRMDemoLogger.log(LogType.PASS,result.getMethod().getConstructorOrMethod().getMethod().getName() +" PASSED...");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        OrangeHRMDemoLogger.log(LogType.FAIL,result.getMethod().getConstructorOrMethod().getMethod().getName() +" FAILED...");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        OrangeHRMDemoLogger.log(LogType.SKIP,result.getMethod().getConstructorOrMethod().getMethod().getName() +" SKIPPED...");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        OrangeHRMDemoLogger.log(LogType.INFO,"======================== Start :-" +context.getName() +"========================");
    }

    @Override
    public void onFinish(ITestContext context) {
        OrangeHRMDemoLogger.log(LogType.INFO,"======================== Finish :- " + context.getName() + "========================");
    }
}
