package com.project.redditclone.repository;

import com.project.redditclone.model.Post;
import com.project.redditclone.model.User;
import com.project.redditclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}