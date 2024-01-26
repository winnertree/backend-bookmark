package omnivore.bookmark.entity;

import org.springframework.data.annotation.Id;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Menu {
    @Id
    private ObjectId Id;

    private String name;

    private Integer price;

    private String description;

    private String photo;
}
