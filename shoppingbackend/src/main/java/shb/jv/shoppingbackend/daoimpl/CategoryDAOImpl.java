package shb.jv.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import shb.jv.shoppingbackend.dao.CategoryDAO;
import shb.jv.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	
	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category=new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is description of television");
		category.setImageURL("CAT_1.png");
		categories.add(category);
		
		category=new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is description of Mobile");
		category.setImageURL("CAT_2.png");
		categories.add(category);
		
		category=new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is description of Laptop");
		category.setImageURL("CAT_3.png");
		categories.add(category);

		category=new Category();
		category.setId(4);
		category.setName("Printer");
		category.setDescription("This is description of Printer");
		category.setImageURL("CAT_4.png");
		categories.add(category);

	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		for (Category category : categories){
			if (category.getId()==id) return category;
		}
		return null;
	}
	
	@Override
	public Category SrchStr(int id) {
		for (Category category : categories){
			if (category.getId()==id) return category;
			}
		return null;
	}

	public Category Srch(String nme) {
		for (Category category : categories){
			String nmeComp=null;
			nmeComp=category.getName();
			String vCheck=null;
			vCheck=category.getName().getClass().getName();
			if (category.getName().equals(nme)) return category;
			}
		return null;
	}

}
