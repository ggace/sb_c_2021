package com.min.exam.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.min.exam.demo.vo.Article;

@Controller
public class ArticleHomeController {
	private List<Article> articles;
	public ArticleHomeController() {
		articles = new ArrayList<>();
	}
	@RequestMapping("usr/article/addArticle")
	@ResponseBody
	public Article addArticle(String title, String body) {
		int id = articles.size() + 1; 
		Article article = new Article(id, title, body);
		
		articles.add(article);
		
		return article;
	}
	
	@RequestMapping("usr/article/getArticles")
	@ResponseBody
	public List<Article> getArticles() {
		return articles;
	}
	
	@RequestMapping("usr/article/resetArticles")
	@ResponseBody
	public List<Article> resetArticles(){
		articles = new ArrayList<Article>();
		return articles;
	}
}
