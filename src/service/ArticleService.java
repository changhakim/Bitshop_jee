package service;

import java.util.ArrayList;

import domain.ArticleBean;

public interface ArticleService {

	//CREATE
		public void createArticle(ArticleBean article);
		//READ
		public ArrayList<ArticleBean> retrieveAll();
		public ArrayList<ArticleBean> retrieveByWriter(String Writer);
		public ArticleBean retrieveBySeq(String seq);
		public String redDate();
		public int countArticle();
		//UPDATE
		public void modifyArticle(ArticleBean article);
		//DELETE
		public void removeArticle(String seq);
}
