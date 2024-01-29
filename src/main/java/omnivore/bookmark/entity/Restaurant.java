package omnivore.bookmark.entity;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import omnivore.bookmark.dto.BookmarkInfo;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "restaurant")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Restaurant {
    @Id
    private ObjectId id;

    private String photo;

    private String name;

    private String category;

    private String coodinate;

    private List<String> operation = new ArrayList<>();

//    @Field(name = "user_id")
//    private String userId;

    private List<Menu> menus = new ArrayList<>();

    public BookmarkInfo toDto() {
        return BookmarkInfo.builder()
                .id(id.toHexString())
                .name(name)
                .photo(photo)
                .category(category)
                .operation(operation)
                .build();
    }
}
