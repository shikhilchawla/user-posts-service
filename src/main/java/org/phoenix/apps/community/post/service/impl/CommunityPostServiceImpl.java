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
        return this.postRepository.findAllPostByCommunityId(communityId);
    }

    @Override
    public List<Post> getAllPostsByGroupId(int groupId) {
        return this.postRepository.findAllPostByGroupId(groupId);
    }

    @Override
    public Post createNewPost(Post post) {
        return this.postRepository.save(post);
    }

    @Override
    public Post updatePost(Post post) {
        return this.postRepository.save(post);
    }
}
