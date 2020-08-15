package life.modawen.community.controller;

import life.modawen.community.dto.QuestionDTO;
import life.modawen.community.mapper.QuestionMapper;
import life.modawen.community.mapper.UserMapper;
import life.modawen.community.model.Question;
import life.modawen.community.model.User;
import life.modawen.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class IndexController {
    //注入之前写的usermapper
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private QuestionService questionService;

    //访问首页
    @GetMapping("/")
    public String index(HttpServletRequest request,
                        Model model) {
        //循环所有的cookie
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length !=0) {
            for (Cookie cookie : cookies) {
                //找到cookie=token的cookie
                if (cookie.getName().equals("token")) {
                    String token = cookie.getValue();
                    //数据库里查是不是有这条cookie记录
                    User user = userMapper.findByToken(token);
                    //验证前端的情况
                    if (user != null) {
                        //如果有，cookie放到session里面
                        request.getSession().setAttribute("user", user);
                    }
                    break;
                }
            }
        }

        List<QuestionDTO> questionList = questionService.list();
        model.addAttribute("questions",questionList);
        return "index";
    }
}
