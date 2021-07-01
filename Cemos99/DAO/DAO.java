package DAO;

import entity.Banner;
import entity.Category;
import entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import context.DBcontext;

public class DAO {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	public List<Product> getAllProduct(){
		List<Product> list = new ArrayList<>();
		String query = "select * from product";
		try {
			con = new DBcontext().getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Product(rs.getInt(1),
						rs.getString(2),
						rs.getString(3), 
						rs.getString(4), 
						rs.getDouble(5)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public List<Category> getAllCategory(){
		List<Category> list = new ArrayList<>();
		String query = "select * from Category";
		try {
			con = new DBcontext().getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Category(rs.getInt(1),
						rs.getString(2)));
	
			}
		} catch (Exception e) {
		}
		return list;
	}
	public List<Banner> getAllBanner(){
		List<Banner> list = new ArrayList<>();
		String query = "select * from Banner";
		try {
			con = new DBcontext().getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Banner(rs.getInt(1),
						rs.getString(2)));
	
			}
		} catch (Exception e) {
		}
		return list;
	}
	public static void main(String[] args) {
		DAO dao = new DAO();
		List<Product> list = dao.getAllProduct();
		List<Category> listCategory = dao.getAllCategory();
		List<Banner> listBanner = dao.getAllBanner();
		for (Banner o: listBanner ) {
			System.out.println(o);
		}
	}
}
