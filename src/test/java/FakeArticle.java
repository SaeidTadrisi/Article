import model.Article;
import model.ArticleDTO;
import model.Category;
import model.Tag;
import org.junit.jupiter.api.BeforeEach;
import infrastructure.ArticleRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FakeArticle implements ArticleRepository {
    List<ArticleDTO> articles;
    List<Tag> tags;
    List<Category> categories;

    @BeforeEach
    void setUp() {
        tags = new FakeTagList().getAllTags();
        categories = new FakeCategory().getAllCategories();
    }

    @Override
    public List<ArticleDTO> getAllArticles() {
        articles = new ArrayList<>();

        Article java = new Article("Java", "Learning Java Fast",
                "It's complete book for learning java.",
                LocalDate.of(2015, 5, 25),
                LocalDate.of(2020, 12, 20),
                LocalDate.of(2021, 2, 20));

        Article spring = new Article("Spring", "Learning Spring in 28 minutes",
                "It's excellent book for learning Spring and Spring Boot.",
                LocalDate.of(2018, 7, 21),
                LocalDate.of(2022, 8, 24),
                LocalDate.of(2023, 1, 12));

        Article mySQL = new Article("MySQL", "Learning MySQL",
                "It's short story about MySQL and how it works.",
                LocalDate.of(2018, 7, 21),
                LocalDate.of(2022, 8, 24),
                LocalDate.of(2023, 1, 12));

        Category technology = new Category("Technology", ".Everything about Technology");
        articles.add(new ArticleDTO("12541254", java, tags, technology));
        articles.add(new ArticleDTO("85214745", spring, tags, technology));
        articles.add(new ArticleDTO("15236954", mySQL, tags, technology));

        return articles;
    }

    @Override
    public void saveArticle(ArticleDTO articleDTO) {

    }

    @Override
    public void editArticle(ArticleDTO oldArticle, ArticleDTO newArticle) {

    }

}
