package test_division.test_suite;


import org.calculator.demos.multiplication.MultiplicationDemoTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.calculator.demos.division.DivisionDemoTest;


@Suite
@SelectClasses({DivisionDemoTest.class,
        MultiplicationDemoTest.class})
public class MyTestSuite_class
{
}