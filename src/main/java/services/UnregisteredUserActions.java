package services;

import model.ArticleData;

import java.util.List;

public interface UnregisteredUserActions {

    List<String> shortArticlesView();

    List<ArticleData> fullArticlesView(String title);
}
