package cn.likole.controller;

import cn.likole.service.ProfileService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by likole on 8/28/17.
 */
@Controller
@Scope("prototype")
public class ProfileController extends ActionSupport {

    int gid;
    int mid;

    Map<String, Object> map = new HashMap<String, Object>();

    @Autowired
    ProfileService profileService;

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    /**
     * 获取组列表
     *
     * @return
     */
    public String getGroupList() {
        map.put("groups", profileService.getGroupList());
        return SUCCESS;
    }

    /**
     * 获取成员列表
     *
     * @return
     */
    public String getMemberList() {
        map.put("group", profileService.getGroup(gid));
        map.put("members", profileService.getMemberList(gid));
        return SUCCESS;
    }

    /**
     * 获取成员
     *
     * @return
     */
    public String getMember() {
        map.put("member", profileService.getMember(mid));
        return SUCCESS;
    }
}
