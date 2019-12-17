package one.to.one;

import org.hibernate.Session;

public class Test 
{
public static void main(String[] args)
{
	Session session=HibernateUtil.getsessionfactory().openSession();
	
		Account acc=new Account();
				acc.setAccno(101);
				acc.setName("XYZ");
		
		
		Accountplus accplus=new Accountplus();
					accplus.setAcpid(1);
					accplus.setAddr("karve");
		
					acc.setAcp(accplus);////ref of Account==acc
	
		session.save(acc);
		session.beginTransaction().commit();
		
		}
}
