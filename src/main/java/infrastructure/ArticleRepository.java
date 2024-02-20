package infrastructure;

import model.Article;
import model.ArticleDTO;

import java.time.LocalDate;
import java.util.List;

public interface ArticleRepository {
    List<ArticleDTO> getAllArticles();
    List<ArticleDTO> findArticleByAuthorId(String userId);
    void saveArticle(String userId, Article article, LocalDate createDate, boolean isPublished);
    void editArticle(ArticleDTO editedArticle, LocalDate lastUpdateDate);
    void publishStatus(int articleId, boolean isPublished, LocalDate publishDate);
}
