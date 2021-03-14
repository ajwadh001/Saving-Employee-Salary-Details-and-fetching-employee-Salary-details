package com.example.demo.empcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.emp.Emp;
import com.example.demo.emprepo.Emprepo;

@Controller
public class EmpControl {

	@Autowired
	Emprepo repo;

	@RequestMapping("home")
	public String home() {

		return "home";
	}

	@RequestMapping("addEmp")
	public String addEmp(Emp emp) {
		repo.save(emp);
		return "home";
	}
	
	@RequestMapping(path="employee", 
			produces = {"application/json"})
	@ResponseBody
	public List<Emp> allEmp(Emp emp) {
		return (List<Emp>) repo.findAll();
		 	}



	@RequestMapping("details/{cid}")
	public ModelAndView findEmp(@PathVariable int cid) {
		ModelAndView mv = new ModelAndView("fetch");
		Emp emp = repo.findById(cid).orElse(null);
		mv.addObject(emp);
		return mv;
	}
}
