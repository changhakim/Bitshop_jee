package dao;

import java.util.ArrayList;

import domain.ArticleBean;

public interface ArticleDao {
	//CREATE
			public void insertArticle(ArticleBean article);
			//READ
			public ArrayList<ArticleBean> selectAll();
			public ArrayList<ArticleBean> selectByWriter(String Writer);
			public ArticleBean selectBySeq(String seq);
			public String redDate();
			public int countArticle();
			//UPDATE
			public void updateArticle(ArticleBean article);
			//DELETE
			public void deleteArticle(String seq);
}
