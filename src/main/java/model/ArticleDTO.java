package model;

import java.util.List;

public class ArticleDTO {

    private final String authorId;
    private final Article article;
    private final List<Tag> tagList;
    private final Category categoryName;

    public ArticleDTO (String authorId, Article article, List<Tag> tagList, Category categoryName) {
        this.authorId = authorId;
        this.article = article;
        this.tagList = tagList;
        this.categoryName = categoryName;
    }

    public String getAuthorId() {
        return authorId;
    }

    public Article getArticle() {
        return article;
    }

    public List<Tag> getTagList() {
        return tagList;
    }

    public Category getCategoryName() {
        return categoryName;
    }
}
