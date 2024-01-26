package omnivore.bookmark.entity;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import omnivore.bookmark.dto.BookmarkInfo;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "restaurant")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Restaurant {
    @Id
    private ObjectId id;

    private String photo;

    private String name;

    private String category;

    private String operation;

    @Field(name = "user_id")
    private String userId;

    private List<Menu> menus;

    public BookmarkInfo toDto() {
        return BookmarkInfo.builder()
                .name(name)
                .photo(photo)
                .category(category)
                .operation(operation)
                .build();
    }
}
