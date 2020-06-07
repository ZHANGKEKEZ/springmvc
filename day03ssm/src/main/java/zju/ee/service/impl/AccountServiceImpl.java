package zju.ee.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zju.ee.dao.AccountDao;
import zju.ee.domain.Account;
import zju.ee.service.AccountService;

import java.util.List;


/**
 * 账户的业务层实现类
 *     <bean id="accountService" class="zju.ee.service.impl.AccountServiceImpl"></bean>
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户信息...");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户...");
        accountDao.saveAccount(account);

    }
}
