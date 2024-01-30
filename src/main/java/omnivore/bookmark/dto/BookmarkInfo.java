package omnivore.bookmark.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BookmarkInfo {
    private String id;
    private String name;
    private String category;
    private String photo;
}
