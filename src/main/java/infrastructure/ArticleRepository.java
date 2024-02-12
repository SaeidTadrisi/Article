package infrastructure;

import model.Article;
import model.ArticleDTO;

import java.util.List;

public interface ArticleRepository {
    List<ArticleDTO> getAllArticles();
    void saveArticle(ArticleDTO articleDTO);
    void editArticle(ArticleDTO oldArticle, ArticleDTO newArticle);
}
