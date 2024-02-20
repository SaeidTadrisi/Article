package model;

public record ArticleDTO(String authorId, int articleId, Article article, boolean isPublished) {
}
