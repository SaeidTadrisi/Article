package infrastructure;

import model.Tag;

import java.util.List;

public interface TagRepository {
    List<Tag> getAllTags();

    void saveNewTag(Tag tag);
}
