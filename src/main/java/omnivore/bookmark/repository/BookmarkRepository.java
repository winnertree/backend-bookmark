package omnivore.bookmark.repository;

import omnivore.bookmark.entity.Bookmark;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookmarkRepository extends MongoRepository<Bookmark, ObjectId> {
    List<Bookmark> findAllByUserId(ObjectId userId);
    void deleteByUserIdAndRestaurantId(ObjectId userId, ObjectId restaurant);
}
