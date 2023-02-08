package struts.action;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import hib.struts.dto.User;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 
 * @author deshp
 */
public class CodeAction extends ActionSupport implements ModelDriven{
    
    User user = new User();
    public CodeAction(){}
    
    @Override
    public String execute()throws Exception{
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(user);
        tx.commit();
        session.close();
        return SUCCESS;
    }
    public String signIn(){
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Criteria crit = session.createCriteria(User.class);
        crit.add(Restrictions.and(Restrictions.eq("userID",user.getSerialNo()),Restrictions.eq("pass",user.getPass())));
        List<User> records = crit.list();
        if(records.isEmpty()){
            return ERROR;
        }else{
            return SUCCESS;
        }
    }
    public String updatePw(){
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Criteria crit = session.createCriteria(User.class);
        crit.add(Restrictions.and(Restrictions.eq("userID",user.getUserID()),Restrictions.eq("pass",user.getPass())));
        List<User> result = crit.list();
        if(result.isEmpty()){
            return ERROR;
        }else{
            user.setPass(user.getPass());
            return SUCCESS;
        }
        
        
    }
       
    @Override
    public User getModel()      //used to run the setters of java beans
    {
        return user;
    }
}
