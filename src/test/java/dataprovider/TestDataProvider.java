package dataprovider;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class TestDataProvider {

    @DataProvider
    public static Object[][] testDataProviderSuiteA(Method method) {
        System.out.println("Test Method::"+method.getName());
        Object[][] data = null;
        if (method.getName().toUpperCase().equals("TESTA")) {
            data = new Object[2][2];
            data[0][0] = "Username 1";
            data[0][1] = "Password 1";
            data[1][0] = "Username 2";
            data[1][1] = "Password 2";
        } else if (method.getName().toUpperCase().equals("TESTAA")) {
            data = new Object[2][2];
            data[0][0] = "Username 11";
            data[0][1] = "Password 11";
            data[1][0] = "Username 22";
            data[1][1] = "Password 22";
        }
        return data;
    }

    @DataProvider
    public static Object[][] testDataProviderSuiteB(Method method) {
        System.out.println("Test Method::"+method.getName());
        Object[][] data = null;
        if (method.getName().toUpperCase().equals("TESTB")) {
            data = new Object[2][2];
            data[0][0] = "Username 100";
            data[0][1] = "Password 100";
            data[1][0] = "Username 200";
            data[1][1] = "Password 200";
        } else if (method.getName().toUpperCase().equals("TESTBB")) {
            data = new Object[2][2];
            data[0][0] = "Username 111";
            data[0][1] = "Password 111";
            data[1][0] = "Username 222";
            data[1][1] = "Password 222";
        }
        return data;
    }
}
