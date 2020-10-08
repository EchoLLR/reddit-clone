package com.project.redditclone.repository;

import com.project.redditclone.model.Comment;
import com.project.redditclone.model.Post;
import com.project.redditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}