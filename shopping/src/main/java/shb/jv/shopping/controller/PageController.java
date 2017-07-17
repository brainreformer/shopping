package shb.jv.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import shb.jv.shoppingbackend.dao.CategoryDAO;
import shb.jv.shoppingbackend.dto.Category;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value={"/","/home","/index","/shabab"})
	public ModelAndView index(){
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClickHome", true);
//		mv.addObject("greeting", "Welcome to Spring Web MVC by Shabab Akbar");
		return mv;
	}

	@RequestMapping(value="/about")
	public ModelAndView about(){
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
//		mv.addObject("greeting", "Welcome to Spring Web MVC by Shabab Akbar");
		return mv;
	}

	@RequestMapping(value="/contact")
	public ModelAndView contact(){
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
//		mv.addObject("greeting", "Welcome to Spring Web MVC by Shabab Akbar");
		return mv;
	}
	
	
	@RequestMapping(value="/show/all/products")
	public ModelAndView showAllProducts(){
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title", "All Products");
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClickAllProducts", true);
		return mv;
	}

	@RequestMapping(value="/show/category/{id}/products")
	public ModelAndView showCatetoryProducts(@PathVariable("id") int id){
		ModelAndView mv=new ModelAndView("page");
		Category category=null;
		category = categoryDAO.get(id);

		mv.addObject("title", category.getName());
		
		mv.addObject("categories", categoryDAO.list());
		
		mv.addObject("category", category);
		
		mv.addObject("userClickCategoryProducts", true);
		return mv;
	}

	@RequestMapping(value="/Search/{nme}")
	public ModelAndView SrchID(@PathVariable("nme") int nme){
		ModelAndView mv=new ModelAndView("page");
		Category category=null;
		category = categoryDAO.SrchStr(nme);

		mv.addObject("title", category.getName());
		
		mv.addObject("categories", categoryDAO.list());
		
		mv.addObject("category", category);
		
		mv.addObject("userClickCategoryProducts", true);
		return mv;
	}

	@RequestMapping(value="/SearchStr/{nme}")
	public ModelAndView SrchStr(@PathVariable("nme") String nme){
		ModelAndView mv=new ModelAndView("page");
		Category category=null;
		category = categoryDAO.Srch(nme);

		mv.addObject("title", category.getName());
		
		mv.addObject("categories", categoryDAO.list());
		
		mv.addObject("category", category);
		
		mv.addObject("userClickCategoryProducts", true);
		return mv;
	}

}
