package cn.likole.controller;

import cn.likole.entity.Info;
import cn.likole.entity.Member;
import cn.likole.service.MemberService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import org.hibernate.tool.schema.Action;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by likole on 8/29/17.
 */
@Controller
@Scope("prototype")
public class MemberController extends ActionSupport implements ModelDriven<Member>{

    public Member member;
    public String birthday;
    private Info info;
    private Member memberModel=new Member();
    @Autowired
    MemberService memberService;

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Member getModel() {
        return memberModel;
    }

    /**
     * 登陆
     * @return
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    public String login() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        if(ActionContext.getContext().getSession().containsKey("sid")) return SUCCESS;
        System.out.println();
        if(memberService.login(memberModel.getSid(),memberModel.getPassword())!=0) return INPUT;
        ActionContext.getContext().getSession().put("sid",memberModel.getSid());
        return SUCCESS;
    }


    /**
     * 个人信息
     * @return
     */
    public String profile(){
        if(!ActionContext.getContext().getSession().containsKey("sid")) return INPUT;
        member=memberService.getMember((String) ActionContext.getContext().getSession().get("sid"));
        info=memberService.getInfo((String) ActionContext.getContext().getSession().get("sid"));
        birthday=info.getIdcard().substring(6,14);
        return SUCCESS;
    }

    public String changeInfo()
    {
        if(!ActionContext.getContext().getSession().containsKey("sid")) return INPUT;
        memberService.changeInfo((String) ActionContext.getContext().getSession().get("sid"),memberModel);
        return SUCCESS;
    }


}
