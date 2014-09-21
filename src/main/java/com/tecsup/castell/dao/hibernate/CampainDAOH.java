package com.tecsup.castell.dao.hibernate;
 
import com.tecsup.castell.dao.CampainDAO;
import com.tecsup.castell.model.Campania;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
 
@Repository
public class CampainDAOH extends BaseHibernateDAO implements CampainDAO {
 
    @Override
    public List<Campania> all() {
        Criteria criteria = this.getSession().createCriteria(Campania.class);
        return criteria.list();
    }
 
    @Override
    public Campania find(Long id) {
        Criteria criteria = this.getSession().createCriteria(Campania.class);
        criteria.add(Restrictions.eq("id", id));
        return (Campania) criteria.uniqueResult();
    }
 
    @Override
    public void save(Campania t) {
        this.getSession().save(t);
    }
 
    @Override
    public void update(Campania t) {
        this.getSession().merge(t);
    }
 
    @Override
    public void delete(Campania t) {
        this.getSession().delete(t);
    }
 
}