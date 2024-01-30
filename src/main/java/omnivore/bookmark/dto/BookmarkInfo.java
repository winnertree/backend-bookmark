package omnivore.bookmark.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Builder
@Data
public class BookmarkInfo {
    private String id;
    private String name;
    private String category;
    private List<Map<String, String>> operation;
    private String photo;
}
