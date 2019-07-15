package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;
//Classe que instância o DAO
public class DaoFactory {
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
