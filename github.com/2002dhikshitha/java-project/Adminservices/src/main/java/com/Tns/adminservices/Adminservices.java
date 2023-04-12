package com.Tns.adminservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import javax.transaction.Transactional;
@Service
@Transactional

public class Adminservices {


		@Autowired
		private AdminservicesRepository repo;
		public List <Admin> listAll()
		{
			return repo.findAll();
		}
		public Admin get(Integer ad_id)
		{
			return repo.findById(ad_id).get();
		}
		public void delete(Integer ad_id)
		{
			repo.deleteById(ad_id);
		}
		public void save (Admin adm)
		{
			repo.save(adm);
		}
}
