package cn.likole.service;

import cn.likole.dao.GroupDao;
import cn.likole.dao.MemberDao;
import cn.likole.entity.Groups;
import cn.likole.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by likole on 8/28/17.
 */
@Service
@Transactional
public class ProfileService {

    @Autowired
    GroupDao groupDao;
    @Autowired
    MemberDao memberDao;

    public List<Groups> getGroupList(){
        return groupDao.getAll();
    }

    public Groups getGroup(int gid){
        return groupDao.getByGid(gid);
    }

    public List<Member> getMemberList(int gid){
        return memberDao.getByGid(gid);
    }

    public Member getMember(int mid){return memberDao.getByMid(mid);}

}
