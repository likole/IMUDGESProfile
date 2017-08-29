package cn.likole.dao;

import cn.likole.entity.Info;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by likole on 8/29/17.
 */
@Repository
public class InfoDao extends HibernateDaoSupport {

    @Autowired
    InfoDao(SessionFactory sessionFactory){
        setSessionFactory(sessionFactory);
    }

    public Info getById(String id) {
         List<Info> infos= (List<Info>) getHibernateTemplate().find("from Info where id=?",id);
         if(infos.size()>0) return infos.get(0);
         return null;
    }
}
