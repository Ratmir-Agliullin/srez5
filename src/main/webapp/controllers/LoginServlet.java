package main.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by admin on 15.05.2017.
 */
@Controller
public class LoginServlet {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView getLoginAndPass(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        return mav;
    }
    @RequestMapping(value = "/forAdmins",method = RequestMethod.GET)
    public ModelAndView Admins(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("forAdmins");
        return mav;
    }

    @RequestMapping(value = "/forUsers",method = RequestMethod.GET)
    public ModelAndView Users(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("forUsers");
        return mav;
    }

    @RequestMapping(value = "/error",method = RequestMethod.GET)
    public ModelAndView Error(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("error");
        return mav;
    }
}
