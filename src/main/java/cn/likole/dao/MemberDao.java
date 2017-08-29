package cn.likole.dao;

import cn.likole.entity.Member;
import jdk.nashorn.internal.ir.ReturnNode;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.swing.plaf.TextUI;
import java.util.List;

/**
 * Created by likole on 8/28/17.
 */
@Repository
public class MemberDao extends HibernateDaoSupport {

    @Autowired
    public MemberDao(SessionFactory sessionFactory){
        setSessionFactory(sessionFactory);
    }

    public Member getByMid(int mid){
        return getHibernateTemplate().get(Member.class,mid);
    }

    public Member getBySid(String sid){
        List<Member> members= (List<Member>) getHibernateTemplate().find("from Member where sid=?",sid);
        if(members.size()>0) return members.get(0);
        return null;
    }

    public List<Member> getByGid(int gid){
        return (List<Member>) getHibernateTemplate().find("from Member where gid=?",gid);
    }

    public List<Member> getAll(){
        return getHibernateTemplate().loadAll(Member.class);
    }

    public void save(Member m){
        getHibernateTemplate().save(m);
    }
}
