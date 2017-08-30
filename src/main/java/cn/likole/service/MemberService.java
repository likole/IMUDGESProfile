package cn.likole.service;

import cn.likole.dao.InfoDao;
import cn.likole.dao.MemberDao;
import cn.likole.entity.Info;
import cn.likole.entity.Member;
import cn.likole.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/**
 * Created by likole on 8/29/17.
 */
@Service
@Transactional
public class MemberService {

    @Autowired
    MemberDao memberDao;
    @Autowired
    InfoDao infoDao;


    public int login(String sid, String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        Member member = memberDao.getBySid(sid);
        if (member == null) {
            Info info = infoDao.getById(sid);
            if (info == null) return -1;
            if (!password.equals(MD5Util.encode(info.getIdcard().substring(12)))) return -1;
            member = new Member();
            member.setSid(sid);
            member.setAvatar("default.jpg");
            member.setPassword(password);
            member.setToken(MD5Util.encode(UUID.randomUUID().toString()));
            memberDao.save(member);
        } else {
            if (!password.equals(member.getPassword())) return -1;
        }
        return 0;
    }

    public Member getMember(String sid) {
        return memberDao.getBySid(sid);
    }

    public Info getInfo(String sid) {
        return infoDao.getById(sid);
    }

    public void changeInfo(String sid, Member m) {
        Member member = memberDao.getBySid(sid);
        member.setDescription(m.getDescription());
        member.setGid(m.getGid());
        member.setHomepage(m.getHomepage());
        member.setGithub(m.getGithub());
        member.setQq(m.getQq());
        member.setEmail(m.getEmail());
    }

    public int changePassword(String sid, String old, String newPassword) {
        Member member = memberDao.getBySid(sid);
        if (!member.getPassword().equals(old)) return -1;
        member.setPassword(newPassword);
        return 0;
    }

    public void changeAvatar(String sid,String path){
        Member member = memberDao.getBySid(sid);
        member.setAvatar(path);
    }

}
