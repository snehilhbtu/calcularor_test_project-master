package test_division.test_suite;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("org.calculator.demos")
@ExcludeTags("Failed")
public class MyTestSuite_package_exclude_tags
{
}