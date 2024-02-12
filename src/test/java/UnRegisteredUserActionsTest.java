import model.Article;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.UnregisteredUserActions;
import services.UnregisteredUserActionsImpl;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class UnRegisteredUserActionsTest {

    private UnregisteredUserActions unregisteredUserActions;

    @BeforeEach
    void setUp() {
        unregisteredUserActions = new UnregisteredUserActionsImpl(new FakeArticle());
    }

    @Test
    void should_can_view_all_articles_as_short() {
        List<String> stringList = unregisteredUserActions.shortArticlesView();

        assertThat(stringList)
                .isEqualTo(List.of("Java", "Learning Java Fast", "Spring",
                        "Learning Spring in 28 minutes", "MySQL", "Learning MySQL"));
    }

    @Test
    void should_can_view_article_as_full_with_article_title() {
        List<Article> articles = unregisteredUserActions.fullArticlesView("Java");
        List<Article> exceptedArticle = List.of(new Article("Java", "Learning Java Fast",
                "It's complete book for learning java.",
                LocalDate.of(2015, 5, 25),
                LocalDate.of(2020, 12, 20),
                LocalDate.of(2021, 2, 20)));

        assertThat(articles).isEqualTo(exceptedArticle);
    }
}
