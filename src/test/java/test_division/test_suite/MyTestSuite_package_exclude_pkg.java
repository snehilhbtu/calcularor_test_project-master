package test_division.test_suite;


import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("org.calculator.demos")
@ExcludePackages("org.calculator.demos.division")
public class MyTestSuite_package_exclude_pkg
{
}