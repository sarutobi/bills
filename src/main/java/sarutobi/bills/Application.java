package sarutobi.bills;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import sarutobi.bills.ui.MainWindow;

import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;

/**
 * Project: bills
 * Created by sarutobi at 12.11.17.
 */
public final class Application {
    public static void main(String... args) {
        ApplicationConfiguration configuration = ApplicationConfiguration.getConfiguration("application.properties");
        ApplicationContext context = new ApplicationContext(myBatisInitialization(configuration));
        new Application(context);
    }

    private Application(ApplicationContext context) {
        SwingUtilities.invokeLater(() -> new MainWindow(context));
    }

    private static SqlSessionFactory myBatisInitialization(ApplicationConfiguration configuration) {
        try (InputStream is = Resources.getResourceAsStream("mybatis.xml")) {
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is, configuration);
            return factory;
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }
}
