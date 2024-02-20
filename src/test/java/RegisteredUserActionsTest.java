import infrastructure.ArticleRepository;
import infrastructure.CategoryRepository;
import infrastructure.TagRepository;
import model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.RegisteredUserActions;
import services.RegisteredUserActionsImpl;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RegisteredUserActionsTest {
    private RegisteredUserActions registeredUserActions;

    @BeforeEach
    void setUp() {

        registeredUserActions = new RegisteredUserActionsImpl("10987345",
                new FakeArticle(),
                new FakeCategory(),
                new FakeTagList());
    }

    @Test
    void should_find_user_articles() {
        List<ArticleDTO> articleDTO = List.of(
                new ArticleDTO("10987345", 1, new Article(new ArticleData("Java", "Learning Java Fast",
                "It's complete book for learning java."),
                List.of(new Tag("Technology"), new Tag("Programing")),
                        new Category("Programing", "Books for all programing languages")),
                        false));

        assertThat(registeredUserActions.userArticleView()).isEqualTo(articleDTO);

    }


}
