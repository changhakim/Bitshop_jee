package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import domain.ArticleBean;

public class ArticleDaoImpl implements ArticleDao{
	private static ArticleDaoImpl instance = new ArticleDaoImpl();
	private ArticleDaoImpl() {}
	public static ArticleDaoImpl getInstance() {return instance;}

	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	



	@Override
	public void insertArticle(ArticleBean article) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			
			if(stmt.executeUpdate(sql)==1) {
			System.out.println("성공");	
			}else {
				System.out.println("실패");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<ArticleBean> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ArticleBean> selectByWriter(String Writer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArticleBean selectBySeq(String seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String redDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countArticle() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateArticle(ArticleBean article) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			
			if(stmt.executeUpdate(sql)==1) {
			System.out.println("성공");	
			}else {
				System.out.println("실패");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteArticle(String seq) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			
			if(stmt.executeUpdate(sql)==1) {
			System.out.println("성공");	
			}else {
				System.out.println("실패");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
