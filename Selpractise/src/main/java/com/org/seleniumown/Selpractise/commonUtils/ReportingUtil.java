package com.org.seleniumown.Selpractise.commonUtils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportingUtil {
	static ExtentReports report;
	
	public static ExtentReports generateReports() {
		
		String Path=System.getProperty("user.dir")+"/reports/index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(Path);
		reporter.config().setDocumentTitle("My Project");
		reporter.config().setReportName("Selenium Mini");
		report=new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Team", "QA Team");
		return report;
	}
	

}
