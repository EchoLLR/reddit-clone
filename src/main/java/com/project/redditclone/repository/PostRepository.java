package com.project.redditclone.repository;

import com.project.redditclone.model.Post;
import com.project.redditclone.model.Subreddit;
import com.project.redditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}