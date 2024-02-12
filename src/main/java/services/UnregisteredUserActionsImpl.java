package services;

import infrastructure.ArticleRepository;
import model.Article;

import java.util.List;
import java.util.stream.Stream;

public class UnregisteredUserActionsImpl implements UnregisteredUserActions{

    private final ArticleRepository articles;

    public UnregisteredUserActionsImpl(ArticleRepository articles) {
        this.articles = articles;
    }

    public List<String> shortArticlesView(){
        return articles.getAllArticles().stream()
                .flatMap(articleDTO -> Stream.of(articleDTO.getArticle().getTitle()
                        , articleDTO.getArticle().getBrief()))
                .toList();
    }

    public List<Article> fullArticlesView(String title){
        return articles.getAllArticles().stream()
                .flatMap(articleDTO -> Stream.of(articleDTO.getArticle()))
                .filter(article -> article.getTitle().equals(title))
                .toList();
    }
}
