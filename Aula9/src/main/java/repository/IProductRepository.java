package repository;

import java.util.List;

public interface IProductRepository {
	
	public Integer insert(String name, Double price);
	
	public Integer update(Integer id, String name, Double price);
	
	public Integer deleteById(Integer id);
	
	public List<String> findAll();
	
	public String findById(Integer id);
	
	public String findByName(String name);

}
