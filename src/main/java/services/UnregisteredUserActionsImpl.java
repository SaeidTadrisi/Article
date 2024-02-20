package services;

import infrastructure.ArticleRepository;
import model.ArticleData;

import java.util.List;
import java.util.stream.Stream;

public class UnregisteredUserActionsImpl implements UnregisteredUserActions{

    private final ArticleRepository articles;

    public UnregisteredUserActionsImpl(ArticleRepository articles) {
        this.articles = articles;
    }

    public List<String> shortArticlesView(){
        return articles.getAllArticles().stream()
                .flatMap(articleDAO -> Stream.of(articleDAO.article().articleData().title()
                        , articleDAO.article().articleData().brief()))
                .toList();
    }

    public List<ArticleData> fullArticlesView(String title){
        return articles.getAllArticles().stream()
                .flatMap(articleDAO -> Stream.of(articleDAO.article().articleData()))
                .filter(article -> article.title().equals(title))
                .toList();
    }
}
