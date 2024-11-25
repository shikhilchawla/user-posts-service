package org.phoenix.apps.community.post.service;

import org.phoenix.apps.community.post.model.Post;

import java.util.List;

public interface CommunityPostService {

    List<Post> getAllPostsByCommunityId (int communityId);

    Post createNewPost(Post post);

    Post updatePost(Post post);
}
