package shb.jv.shoppingbackend.dao;

import java.util.List;

import shb.jv.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);

	Category Srch(String nme);

	Category SrchStr(int id);
}
