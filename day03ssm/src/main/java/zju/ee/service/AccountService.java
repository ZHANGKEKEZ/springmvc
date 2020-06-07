package zju.ee.service;

import zju.ee.domain.Account;

import java.util.List;

public interface AccountService {
    /**
     * 查询所有
     * @return
     */
    List<Account> findAll();

    /**
     * 保存账户
     * @param account
     */
    void saveAccount(Account account);
}
