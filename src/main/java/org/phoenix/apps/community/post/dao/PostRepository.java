package org.phoenix.apps.community.post.dao;

import org.phoenix.apps.community.post.model.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Integer> {

    List<Post> findAllPostByCommunityId(int communityId);
}
