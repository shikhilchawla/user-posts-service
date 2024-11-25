package org.phoenix.apps.community.post.service.impl;

import org.phoenix.apps.community.post.dao.PostRepository;
import org.phoenix.apps.community.post.model.Post;
import org.phoenix.apps.community.post.service.CommunityPostService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommunityPostServiceImpl implements CommunityPostService {

    private final PostRepository postRepository;

    public CommunityPostServiceImpl (PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> getAllPostsByCommunityId(int communityId) {
//        List<Comments> comments = List.of(Comments.builder().commentId(5001).comment("my first comment").postId(1001).build());
//        return List.of(Post.builder().postId(1001).postMessage("My first Post").communityId(1).userId(101).comments(comments).build());
        return this.postRepository.findAllPostByCommunityId(communityId);
    }

    @Override
    public Post createNewPost(Post post) {
        return this.postRepository.save(post);
    }
}
