package omnivore.bookmark.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import omnivore.bookmark.service.BookmarkService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/bookmarks")
public class BookmarkController {
    private final BookmarkService bookmarkService;

    @PostMapping
    public ResponseEntity<?> register (@RequestParam String restaurantId,
                                       @RequestHeader(HttpHeaders.AUTHORIZATION) String jwt) {
        bookmarkService.register(jwt, restaurantId);
        return ResponseEntity.ok("등록이 완료되었습니다.");
    }
}
