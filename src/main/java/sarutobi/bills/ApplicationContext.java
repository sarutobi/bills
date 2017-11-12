package sarutobi.bills;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * Project: Bills
 * Created by sarutobi at 12.11.17.
 */
public class ApplicationContext {

    private final SqlSessionFactory sessionFactory;

    ApplicationContext(SqlSessionFactory sqlSessionFactory) {
        this.sessionFactory = sqlSessionFactory;
    }

    public SqlSession getSqlSession() {
        return sessionFactory.openSession();
    }
}
