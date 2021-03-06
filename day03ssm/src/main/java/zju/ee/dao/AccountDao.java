package zju.ee.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import zju.ee.domain.Account;

import java.util.List;

/**
 * 账户Dao接口
 */
@Repository
public interface AccountDao {
    /**
     * 查询所有
     * @return
     */
    @Select("select * from account")
    List<Account> findAll();

    /**
     * 保存账户
     * @param account
     */
    @Insert("insert into account(name,money) values(#{name},#{money})")
    void saveAccount(Account account);
}
