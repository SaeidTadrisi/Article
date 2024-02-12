package services;

import model.Article;
import model.ArticleDTO;
import model.Category;
import model.Tag;

import java.util.List;

public interface RegisteredUserActions {

    List<Article> userArticleView(String userId);
    void createNewArticle(ArticleDTO article);
    void userArticleEdit(ArticleDTO oldArticle, ArticleDTO newArticle);
    List<Category> categoriesView();
    List<Tag> tagsView();
    void createNewTag(Tag tag);
    void createNewCategory(Category category);
    void changeUserPassword(String password);

}
