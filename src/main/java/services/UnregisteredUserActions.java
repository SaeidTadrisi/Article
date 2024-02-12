package services;

import model.Article;

import java.util.List;

public interface UnregisteredUserActions {

    List<String> shortArticlesView();

    List<Article> fullArticlesView(String title);
}
