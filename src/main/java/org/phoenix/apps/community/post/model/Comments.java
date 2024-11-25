package org.phoenix.apps.community.post.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comments {
    @Id
    private int commentId;
    //@ForeignKey("")
    private int postId;
    private String comment;
}
