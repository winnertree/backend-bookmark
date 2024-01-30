package omnivore.bookmark.repository;

import omnivore.bookmark.entity.Bookmark;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableScan
@Repository
public interface BookmarkRepository extends CrudRepository<Bookmark, String> {
    void deleteByUserIdAndRestaurantId(String userId, String restaurant);
    List<Bookmark> findAllByUserId(String userId);
}
