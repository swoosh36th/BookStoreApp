package driver;

import io.github.bonigarcia.wdm.config.DriverManagerType;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverManagerType driverManagerType) {
        DriverManager driverManager = null;
        switch (driverManagerType) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case EDGE:
                driverManager = new EdgeDriverManager();
                break;
        }
        return driverManager;
    }
}
