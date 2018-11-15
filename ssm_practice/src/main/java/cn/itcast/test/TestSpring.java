package cn.itcast.test;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {

    @Test
    public void run1(){
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");


//        AccountDao accountDao = ac.getBean(AccountDao.class);
//        List<Account> accounts = accountDao.findAll();
//        for (Account account : accounts) {
//            System.out.println(account);
//        }

//        // 获取对象
        AccountService as = (AccountService) ac.getBean("accountService");
        // 调用方法
        List<Account> accounts = as.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

}
