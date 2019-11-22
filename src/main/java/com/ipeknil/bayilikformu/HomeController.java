package com.ipeknil.bayilikformu;



import java.beans.PropertyVetoException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.HibernateException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.ipeknil.service.formservice;
import com.ipeknil.entity.Form;


@Controller
public class HomeController {
	
	@Autowired
	private formservice formService;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home( Model model, HttpServletRequest req) {
		
		System.out.println(req.getRemoteAddr());
		
		
		model.addAttribute("sayi",1);
		
		
		model.addAttribute("serverTime", "/" );
		
		return "index";
		
	}
		
		@RequestMapping(value = "/ipeknil", method = RequestMethod.GET)
		public String home(Model model) throws HibernateException, PropertyVetoException, SQLException {
			
		    model.addAttribute("serverTime", "ipeknil" );
		    
		    
		    
			
			return "index";
	}
	
		
		
		
		
		@RequestMapping(value = "/addForm", method = RequestMethod.POST)
		public ResponseEntity<String> addForm(@RequestBody Form form, HttpServletRequest request){
			
			formService.createform(form);
			
			
		
		    
		    
		    
			
			return new ResponseEntity<>("OK",HttpStatus.CREATED);
	}
}
