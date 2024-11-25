package org.phoenix.apps.community.post.resources;

import org.phoenix.apps.community.post.model.Post;
import org.phoenix.apps.community.post.service.CommunityPostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/post")
public class CommunityPostResource {

    private final CommunityPostService communityPostService;

    public CommunityPostResource(CommunityPostService communityPostService) {
        this.communityPostService = communityPostService;
    }

    @GetMapping("/health")
    public ResponseEntity<String> healtcheck() {
        return ResponseEntity.ok("Post Service is healthy.");
    }

    @GetMapping("/community/{communityId}")
    public ResponseEntity<List<Post>> getCommunityPost(@PathVariable int communityId) {
        List<Post> posts = this.communityPostService.getAllPostsByCommunityId(communityId);
        return ResponseEntity.ok().body(posts);
    }

    @PostMapping
    public ResponseEntity<Post> addPost(@RequestBody Post request) {
        Post post = this.communityPostService.createNewPost(request);
        return ResponseEntity.ok().body(post);
    }
}
