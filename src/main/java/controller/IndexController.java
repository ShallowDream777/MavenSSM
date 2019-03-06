package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;

import javax.annotation.Resource;

/**
 * @Auther: ShallowDream7
 * @Date: 2019/3/6 21:10
 * @Description:
 */
@Controller
public class IndexController {

    @Resource
    UserService UserService;

    @RequestMapping("/user")
    public String index(Model Model){
       Model.addAttribute("User",UserService.selectByPrimaryKey(1));
        return "index";
    }
}
