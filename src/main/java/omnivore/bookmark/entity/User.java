package omnivore.bookmark.entity;

import org.springframework.data.annotation.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Getter
@Document(collection = "user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @Id
    private ObjectId id;

    private String name;

    private String email;

    private String password;

    private Integer gender;

    private String nation;

    private LocalDate birthdate;
}
