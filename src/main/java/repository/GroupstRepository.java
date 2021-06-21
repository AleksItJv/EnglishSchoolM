package repository;

import connection.HibernateUtil;
import entity.Groupst;
import org.hibernate.Session;
import service.GroupstService;

import java.util.List;

public class GroupstRepository implements GroupstService {

    @Override
    public void addGroupst(Groupst groupst) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        session.save(groupst);

        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Groupst> allGroups() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        List<Groupst> groupstList = session.createQuery("from Groupst").list();

        session.getTransaction().commit();
        session.close();

        return groupstList;
    }

    @Override
    public void deleteGroupst(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Groupst groupst;
        if ((groupst = session.get(Groupst.class, id)) != null) {
            session.delete(groupst);
        }

        session.getTransaction().commit();
        session.close();

    }
}
