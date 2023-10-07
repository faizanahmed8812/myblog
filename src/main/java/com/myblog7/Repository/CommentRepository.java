package com.myblog7.Repository;

import com.myblog7.Entity.Comment;
import com.myblog7.Payload.CommentDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {

    List <Comment> findByPostId(long postId);
}
