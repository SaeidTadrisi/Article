package model;

import java.time.LocalDate;
import java.util.Objects;

public class Article {

    private final String title;
    private final String brief;
    private final String content;
    private final LocalDate createDate;
    private final LocalDate lastUpdateDate;
    private final LocalDate publishDate;
    private Boolean isPublished;

    public Article(String title, String brief, String content, LocalDate createDate, LocalDate lastUpdateDate, LocalDate publishDate) {
        this.title = title;
        this.brief = brief;
        this.content = content;
        this.createDate = createDate;
        this.lastUpdateDate = lastUpdateDate;
        this.publishDate = publishDate;
        this.isPublished = false;
    }

    public String getTitle() {
        return title;
    }

    public String getBrief() {
        return brief;
    }

    public String getContent() {
        return content;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public LocalDate getLastUpdateDate() {
        return lastUpdateDate;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public Boolean getPublished() {
        return isPublished;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", brief='" + brief + '\'' +
                ", content='" + content + '\'' +
                ", createDate=" + createDate +
                ", lastUpdateDate=" + lastUpdateDate +
                ", publishDate=" + publishDate +
                ", isPublished=" + isPublished +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(title, article.title) && Objects.equals(brief, article.brief) && Objects.equals(content, article.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, brief, content);
    }
}
