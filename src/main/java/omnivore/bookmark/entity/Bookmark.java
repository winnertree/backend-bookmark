package omnivore.bookmark.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Document(collection = "bookmark")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Bookmark {
    @Id
    private ObjectId Id;

    private ObjectId userId;

    private ObjectId restaurantId;

    @Builder
    public Bookmark(ObjectId userId, ObjectId restaurantId) {
        this.userId = userId;
        this.restaurantId = restaurantId;
    }
}
