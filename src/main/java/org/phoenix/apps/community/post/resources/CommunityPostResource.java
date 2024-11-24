package org.phoenix.apps.community.post.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/post")
public class CommunityPostResource {

    @GetMapping("/health")
    public ResponseEntity<String> healtcheck() {
        return ResponseEntity.ok("Post Service is healthy.");
    }
}
