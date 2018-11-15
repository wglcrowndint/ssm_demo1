package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 帐户web
 */

@Controller
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("findById")
    public Account findById(int id){

        System.out.println("表现层：查询所有账户...");

        System.out.println("表现层：查询所有账户...");

        return null;
    }

    @RequestMapping("findAll")
    public String findAll(Model model){

        System.out.println("表现层：查询所有账户...");
        // 调用service的方法
        List<Account> accountList = accountService.findAll();
        //存放到request域
        model.addAttribute("list", accountList);
        return "list";
    }

    /**
     * 保存
     * @return
     */
    @RequestMapping("save")
    public String save(Account account) throws IOException {

        System.out.println("表现层：保存账户...");
        accountService.saveAccount(account);
        return "redirect:findAll";
    }



}
