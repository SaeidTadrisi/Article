package services;

import model.ArticleDTO;
import model.Article;
import model.Category;
import model.Tag;

import java.util.List;

public interface RegisteredUserActions {

    List<ArticleDTO> userArticleView();
    Article createArticle(Article article);
    Article editArticle(ArticleDTO articleDTO);
    void changePublishStatus(ArticleDTO articleDTO, boolean isPublished);
    Tag saveNewTag(Tag tag);
    Category saveNewCategory(Category category);
}
