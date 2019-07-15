package model.dao;

import java.util.List;

import model.entities.Department;


//Objeto de acessos à dados (DAO)
//É uma interface que serve para implementar os métodos de acesso à dados no BD
public interface DepartmentDao {
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
}
