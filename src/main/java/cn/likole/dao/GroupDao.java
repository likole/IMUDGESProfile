package cn.likole.dao;

import cn.likole.entity.Groups;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by likole on 8/28/17.
 */
@Repository
public class GroupDao extends HibernateDaoSupport {

    @Autowired
    public GroupDao(SessionFactory sessionFactory) {
        setSessionFactory(sessionFactory);
    }

    public Groups getByGid(int gid) {
        List<Groups> groups = (List<Groups>) getHibernateTemplate().find("from Groups where gid=?", gid);
        if (groups.size() > 0) return groups.get(0);
        return null;
    }

    public List<Groups> getAll() {
        return (List<Groups>) getHibernateTemplate().find("from Groups");
    }
}
