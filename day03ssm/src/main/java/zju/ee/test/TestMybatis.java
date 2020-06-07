package zju.ee.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.apache.ibatis.io.Resources;
import zju.ee.dao.AccountDao;
import zju.ee.domain.Account;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class TestMybatis {
    @Test
    public void run1() throws IOException {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        //查询所有
        List<Account> accounts = dao.findAll();
        for(Account account:accounts){
            System.out.println(account);
        }
        //关闭资源
        session.close();
        in.close();

    }
    @Test
    public void run2() throws IOException {
        Account account=new Account();
        account.setName("ccc");
        account.setMoney(2000);
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        //保存用户
        dao.saveAccount(account);
        session.commit();
        //关闭资源
        session.close();
        in.close();

    }
}
