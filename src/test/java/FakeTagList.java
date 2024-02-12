import model.Tag;
import infrastructure.TagRepository;

import java.util.List;

public class FakeTagList implements TagRepository {

    @Override
    public List<Tag> getAllTags() {
        return List.of(
                new Tag("Technology"),
                new Tag("Programing"));
    }

    @Override
    public void saveNewTag(Tag tag) {

    }
}
