package omnivore.bookmark.dto;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;

import java.util.List;

@Builder
@Data
public class BookmarkInfo {
    private String id;
    private String name;
    private String category;
    private List<String> operation;
    private String photo;
}
