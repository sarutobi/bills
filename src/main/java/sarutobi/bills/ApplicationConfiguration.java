package sarutobi.bills;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Project: Bills
 * Created by sarutobi at 12.11.17.
 */
public class ApplicationConfiguration extends Properties {

    private ApplicationConfiguration() {
        super();
    }

    public String getUrl() {
        return getProperty("db.url");
    }

    public String getUser() {
        return getProperty("db.user", "");
    }

    public String getPassword() {
        return getProperty("db.password", "");
    }

    public String getDriver() {
        return getProperty("db.driver");
    }

    public static ApplicationConfiguration getConfiguration(String ctxName) {
        ApplicationConfiguration context = new ApplicationConfiguration();
        try(InputStream is = ApplicationConfiguration.class.getClassLoader().getResourceAsStream(ctxName)) {
            context.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return context;
    }
}
