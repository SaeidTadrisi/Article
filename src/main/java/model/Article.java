package model;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public record Article(ArticleData articleData, List<Tag> tagList, Category category) {
}
