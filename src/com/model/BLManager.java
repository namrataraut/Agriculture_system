package com.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.pojo.Crop;
import com.pojo.Fertilizer;
import com.pojo.Fruits;
import com.pojo.Machine;
import com.pojo.Farmer;
import com.pojo.Supplier;
import com.pojo.Vegetables;

public class BLManager {
	 static SessionFactory sf = new Configuration().configure().buildSessionFactory();

	 public List<Farmer> getAllFarmer()
		{
			Session s=sf.openSession();
			Criteria cr=s.createCriteria(Farmer.class);
			List<Farmer> li=cr.list();
			return li;
		}
	 
		
		public void save(Crop c) {

			Session s = sf.openSession();
			Transaction t = s.beginTransaction();
			Criteria cr = s.createCriteria(Crop.class);
			s.save(c);
			t.commit();
			s.close();
		
	}

     public void saveMachine(Machine m) {
			// TODO Auto-generated method stub
			Session s = sf.openSession();
			Transaction t = s.beginTransaction();
			s.save(m);
			t.commit();
			s.close();
		
	
	}
     public List<Supplier> getAllSuppliers()
		{
			Session s=sf.openSession();
			Criteria cr=s.createCriteria(Supplier.class);
			List<Supplier> li=cr.list();
			return li;
		}
     public List<Machine> getAllMachines()
		{
			Session s=sf.openSession();
			Criteria cr=s.createCriteria(Machine.class);
			List<Machine> li=cr.list();
			return li;
		}

	public void saveFertilizer(Fertilizer fr) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(fr);
		t.commit();
		s.close();
	
		
	} 
	 public List<Fertilizer> getAllFertilizers()
		{
			Session s=sf.openSession();
			Criteria cr=s.createCriteria(Fertilizer.class);
			List<Fertilizer> li=cr.list();
			return li;
		}
	 public List<Crop> getAllCrops()
		{
			Session s=sf.openSession();
			Criteria cr=s.createCriteria(Crop.class);
			List<Crop> li=cr.list();
			return li;}

	public Crop CropSearchById(int id1) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Criteria cr=s.createCriteria(Crop.class);
		cr.add(Restrictions.eq("cid", id1));
		Crop c=(Crop)cr.uniqueResult();
		return c;
	}

	public void delete(Crop c) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.delete(c);
		t.commit();
		s.close();
		
	}

	public Farmer FarmerSearchById(int id1) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Criteria cr=s.createCriteria(Farmer.class);
		cr.add(Restrictions.eq("fid",id1));
		Farmer f=(Farmer)cr.uniqueResult();
		
		return f;
	}

	public void delete(Farmer f) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.delete(f);
		t.commit();
		s.close();
		
	}

	public void delete(Fertilizer fer) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.delete(fer);
		t.commit();
		s.close();
		
		
	}

	public Fertilizer FertilizerSearchById(int id1) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Criteria cr=s.createCriteria(Fertilizer.class);
		cr.add(Restrictions.eq("ferid",id1));
		Fertilizer fer=(Fertilizer)cr.uniqueResult();
		return fer;
	}

	public Machine MachineSearchById(int id1) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Criteria cr=s.createCriteria(Machine.class);
		cr.add(Restrictions.eq("mid",id1));
		Machine m=(Machine)cr.uniqueResult();
		return m;
	}

	public void delete(Machine m) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.delete(m);
		t.commit();
		s.close();
		
	}

	public Supplier SupplierSearchById(int id1) {
		// TODO Auto-generated method stub
		Session s1=sf.openSession();
		Criteria cr=s1.createCriteria(Supplier.class);
		cr.add(Restrictions.eq("sid",id1));
		Supplier s=(Supplier)cr.uniqueResult();
		return s;
	}

	public void delete(Supplier s) {
		// TODO Auto-generated method stub
		Session s1=sf.openSession();
		Transaction t=s1.beginTransaction();
		s1.delete(s);
		t.commit();
		s1.close();
		
	}


	public void SaveFarmer(Farmer f) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(f);
		t.commit();
		s.close();
		
	}


	public void saveSupplier(Supplier s) {
		// TODO Auto-generated method stub
		Session s1 = sf.openSession();
		Transaction t = s1.beginTransaction();
		s1.save(s);
		t.commit();
		s1.close();
		
		
	}


	public void update(Crop c) {
		// TODO Auto-generated method stub
		Session s1 = sf.openSession();
		Transaction t = s1.beginTransaction();
		s1.update(c);
		t.commit();
		s1.close();
	}


	public void update(Farmer f) {
		// TODO Auto-generated method stub
		Session s1 = sf.openSession();
		Transaction t = s1.beginTransaction();
		s1.update(f);
		t.commit();
		s1.close();
	}


	public void update(Fertilizer fer) {
		// TODO Auto-generated method stub
		Session s1 = sf.openSession();
		Transaction t = s1.beginTransaction();
		s1.update(fer);
		t.commit();
		s1.close();
		
	}


	public void update(Supplier s) {
		// TODO Auto-generated method stub
		Session s1 = sf.openSession();
		Transaction t = s1.beginTransaction();
		s1.update(s);
		t.commit();
		s1.close();
	}


	public void update(Machine m) {
		// TODO Auto-generated method stub
		Session s1 = sf.openSession();
		Transaction t = s1.beginTransaction();
		s1.update(m);
		t.commit();
		s1.close();
	}


	public void saveFruit(Fruits f) {
		// TODO Auto-generated method stub
		Session s1 = sf.openSession();
		Transaction t = s1.beginTransaction();
		s1.save(f);
		t.commit();
		s1.close();
	}


	public void saveVegetables(Vegetables v) {
		// TODO Auto-generated method stub
		Session s1 = sf.openSession();
		Transaction t = s1.beginTransaction();
		s1.save(v);
		t.commit();
		s1.close();
	}
		
	


		public void UpdateFarmer(Farmer f) {
			// TODO Auto-generated method stub
			Session s1 = sf.openSession();
			Transaction t = s1.beginTransaction();
			s1.update(f);
			t.commit();
			s1.close();
			
		}


		public Farmer serachbyemail(String email) {
			// TODO Auto-generated method stub
			Session s=sf.openSession();
			Criteria cr=s.createCriteria(Farmer.class);
			cr.add(Restrictions.eq("femail", email));
			Farmer f1=(Farmer)cr.uniqueResult();
			return f1;
		}


		public Farmer searchbyEmailPassowrd(String email, String password) {
			// TODO Auto-generated method stub
			Session s=sf.openSession();
			Criteria cr=s.createCriteria(Farmer.class);
			cr.add(Restrictions.eq("femail",email));
			cr.add(Restrictions.eq("fpasssword", password));
			Farmer f1=(Farmer)cr.uniqueResult();
			return f1;
		}


		public void UpdateSupplier(Supplier s) {
			// TODO Auto-generated method stub
			Session s1 = sf.openSession();
			Transaction t = s1.beginTransaction();
			s1.update(s);
			t.commit();
			s1.close();
			
		}
		public Supplier searchbyemail(String email) {
			// TODO Auto-generated method stub
			Session s=sf.openSession();
			Criteria cr=s.createCriteria(Supplier.class);
			cr.add(Restrictions.eq("semail", email));
			Supplier s1=(Supplier)cr.uniqueResult();
			return s1;
		}
		public Supplier searchbyEmailPassowrd1(String email, String password) {
			// TODO Auto-generated method stub
			Session s=sf.openSession();
			Criteria cr=s.createCriteria(Supplier.class);
			cr.add(Restrictions.eq("semail",email));
			cr.add(Restrictions.eq("spasssword", password));
			Supplier s1=(Supplier)cr.uniqueResult();
			return s1;

		}
		
		public Farmer getFarmer(int fid)
		{
			Session s=sf.openSession();
			String hql="From Farmer a where a.fid=?";
			Query q= s.createQuery(hql);
			q.setInteger(0, fid);
			Farmer f=(Farmer)q.uniqueResult();
			s.close();
			return f;
		}
}
