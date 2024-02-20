package services;

import model.ArticleDTO;
import infrastructure.ArticleRepository;
import infrastructure.CategoryRepository;
import infrastructure.TagRepository;
import model.Article;
import model.Category;
import model.Tag;

import java.time.LocalDate;
import java.util.List;

public class RegisteredUserActionsImpl implements RegisteredUserActions{

    private final String userId;
    private final ArticleRepository articles;
    private final CategoryRepository categories;
    private final TagRepository tags;

    public RegisteredUserActionsImpl(String userId,
                                     ArticleRepository articles,
                                     CategoryRepository categories,
                                     TagRepository tags) {
        this.userId = userId;
        this.articles = articles;
        this.categories = categories;
        this.tags = tags;
    }

    public List<ArticleDTO> userArticleView() {
        return articles.findArticleByAuthorId(userId);
    }

    public Article createArticle(Article article){
        articles.saveArticle(userId, article, LocalDate.now(), false);
        return article;
    }

    @Override
    public Article editArticle(ArticleDTO articleDTO) {
        articles.editArticle(articleDTO, LocalDate.now());
        return articleDTO.article();
    }

    @Override
    public void changePublishStatus(ArticleDTO articleDTO, boolean isPublished) {
        articles.publishStatus(articleDTO.articleId(), isPublished, LocalDate.now());
    }

    @Override
    public Tag saveNewTag(Tag tag) {
        tags.saveNewTag(tag);
        return tag;
    }

    @Override
    public Category saveNewCategory(Category category) {
        categories.saveNewCategory(category);
        return category;
    }
}
