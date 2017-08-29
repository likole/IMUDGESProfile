package cn.likole.controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import cn.likole.service.ProfileService;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by likole on 8/28/17.
 */
@Controller
@Scope("prototype")
public class ProfileController extends ActionSupport {

    int gid;

    Map<String,Object> map=new HashMap<String, Object>();

    @Autowired
    ProfileService profileService;

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    /**
     * 获取组列表
     * @return
     */
    public String getGroupList(){
        map.put("groups",profileService.getGroupList());
        return SUCCESS;
    }

    public String getMemberList()
    {
        map.put("group",profileService.getGroup(gid));
        map.put("members",profileService.getMemberList(gid));
        return SUCCESS;
    }
}
