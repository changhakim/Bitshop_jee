package service;

import java.util.ArrayList;

import dao.ArticleDaoImpl;
import domain.ArticleBean;

public class ArticleServiceImpl implements ArticleService {
	private static ArticleServiceImpl instance = new ArticleServiceImpl();
	private ArticleServiceImpl() {
		dao = ArticleDaoImpl.getInstance();
	}
	public static ArticleServiceImpl getInstance() {return instance;}
	
	ArticleDaoImpl dao;
	
	


	@Override
	public void createArticle(ArticleBean article) {
		dao.insertArticle(article);
		
	}

	@Override
	public ArrayList<ArticleBean> retrieveAll() {
		ArrayList<ArticleBean> list = dao.selectAll();
		return list;
	}

	@Override
	public ArrayList<ArticleBean> retrieveByWriter(String Writer) {
		ArrayList<ArticleBean> list = dao.selectByWriter(Writer);
		return list;
	}

	@Override
	public ArticleBean retrieveBySeq(String seq) {
		ArticleBean article = dao.selectBySeq(seq); 
		
		return article;
	}

	@Override
	public String redDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countArticle() {
		int count = dao.countArticle();
		return count;
	}

	@Override
	public void modifyArticle(ArticleBean article) {
		dao.updateArticle(article);
		
	}

	@Override
	public void removeArticle(String seq) {
		dao.deleteArticle(seq);
		
	}
	 
}
