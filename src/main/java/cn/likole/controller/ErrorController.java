package cn.likole.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.net.httpserver.Authenticator;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created by likole on 8/28/17.
 */
@Controller
@Scope("prototype")
public class ErrorController extends ActionSupport{

    public String error500()
    {
        ServletActionContext.getResponse().setStatus(500);
        return NONE;
    }

    public String error404()
    {
        ServletActionContext.getResponse().setStatus(404);
        return NONE;
    }
}
