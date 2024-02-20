import model.ArticleDTO;
import model.*;
import infrastructure.ArticleRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FakeArticle implements ArticleRepository {
    List<ArticleDTO> articles;
    List<Category> categories = new FakeCategory().getAllCategories();
    List<Tag> tags = new FakeTagList().getAllTags();

    @Override
    public List<ArticleDTO> getAllArticles() {

        articles = new ArrayList<>();

        ArticleData java = new ArticleData("Java", "Learning Java Fast",
                "It's complete book for learning java.");


        ArticleData spring = new ArticleData("Spring", "Learning Spring in 28 minutes",
                "It's excellent book for learning Spring and Spring Boot.");


        ArticleData mySQL = new ArticleData("MySQL", "Learning MySQL",
                "It's short story about MySQL and how it works.");

        articles.add(new ArticleDTO("10987345", 1, new Article(java, tags, categories.get(1)),false));
        articles.add(new ArticleDTO("67487673",2, new Article(spring, tags, categories.get(0)),false));
        articles.add(new ArticleDTO("76447986",3, new Article(mySQL, tags, categories.get(1)),false));

        return articles;
    }

    @Override
    public List<ArticleDTO> findArticleByAuthorId(String userId) {
        return getAllArticles().stream().filter((articleDTO -> articleDTO.authorId().equals(userId))).toList();
    }

    @Override
    public void saveArticle(String userId, Article article, LocalDate createDate, boolean isPublished) {
    }

    @Override
    public void editArticle(ArticleDTO editedArticle, LocalDate lastUpdateDate) {

    }

    @Override
    public void publishStatus(int articleId, boolean isPublished, LocalDate publishDate) {

    }
}
