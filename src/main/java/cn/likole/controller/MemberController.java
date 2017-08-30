package cn.likole.controller;

import cn.likole.entity.Info;
import cn.likole.entity.Member;
import cn.likole.service.MemberService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by likole on 8/29/17.
 */
@Controller
@Scope("prototype")
public class MemberController extends ActionSupport implements ModelDriven<Member> {

    public Member member;
    public String birthday;
    private Info info;
    private Member memberModel = new Member();
    private int message;//1修改成功 2修改失败
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

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public Member getModel() {
        return memberModel;
    }


    /**
     * 登陆
     *
     * @return
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    public String login() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        if (ActionContext.getContext().getSession().containsKey("sid")) return SUCCESS;
        if (memberService.login(memberModel.getSid(), memberModel.getPassword()) != 0) return INPUT;
        ActionContext.getContext().getSession().put("sid", memberModel.getSid());
        return SUCCESS;
    }


    /**
     * 个人信息
     *
     * @return
     */
    public String profile() {
        if (!ActionContext.getContext().getSession().containsKey("sid")) return INPUT;
        member = memberService.getMember((String) ActionContext.getContext().getSession().get("sid"));
        info = memberService.getInfo((String) ActionContext.getContext().getSession().get("sid"));
        birthday = info.getIdcard().substring(6, 14);
        return SUCCESS;
    }

    /**
     * 更改信息
     *
     * @return
     */
    public String changeInfo() {
        if (!ActionContext.getContext().getSession().containsKey("sid")) return INPUT;
        memberService.changeInfo((String) ActionContext.getContext().getSession().get("sid"), memberModel);
        setMessage(1);
        return SUCCESS;
    }


    /**
     * 更改密码
     *
     * @return
     */
    public String changePassword() {
        if (!ActionContext.getContext().getSession().containsKey("sid")) return INPUT;
        if (memberService.changePassword((String) ActionContext.getContext().getSession().get("sid"), memberModel.getToken(), memberModel.getPassword()) == 0) {
            setMessage(1);
            return SUCCESS;
        }
        setMessage(2);
        return ERROR;
    }


}
