package org.phoenix.apps.community.post.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="postId")
    private int postId;
    private int userId;
    private int communityId;
    private int groupId;
    private String postMessage;
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name="postId", referencedColumnName = "postId")
//    private List<Comments> comments;
}
