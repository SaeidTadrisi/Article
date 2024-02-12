package services;

import infrastructure.ArticleRepository;
import infrastructure.CategoryRepository;
import infrastructure.TagRepository;
import infrastructure.UserRepository;
import model.Article;
import model.ArticleDTO;
import model.Category;
import model.Tag;

import java.util.List;
import java.util.stream.Stream;

public class RegisteredUserActionsImpl implements RegisteredUserActions{

    private final UserRepository users;
    private final ArticleRepository articles;
    private final CategoryRepository categories;
    private final TagRepository tags;

    public RegisteredUserActionsImpl(UserRepository users,
                                     ArticleRepository articles,
                                     CategoryRepository categories,
                                     TagRepository tags) {
        this.users = users;
        this.articles = articles;
        this.categories = categories;
        this.tags = tags;
    }

    public List<Article> userArticleView(String userId) {
        return articles.getAllArticles().stream()
                .filter(articleDTO -> articleDTO.getAuthorId().equals(userId))
                .flatMap(articleDTO -> Stream.of(articleDTO.getArticle()))
                .toList();
    }

    public void createNewArticle(ArticleDTO article){
        articles.saveArticle(article);
    }

    public void userArticleEdit(ArticleDTO oldArticle, ArticleDTO newArticle){
        articles.editArticle(oldArticle, newArticle);
    }

    public List<Category> categoriesView(){
        return categories.getAllCategories();
    }

    public List<Tag> tagsView(){
        return tags.getAllTags();
    }

    public void createNewTag(Tag tag){
        tags.saveNewTag(tag);
    }

    public void createNewCategory(Category category){
        categories.saveNewCategory(category);
    }

    public void changeUserPassword(String password){
        users.changePassword(password);
    }
}
