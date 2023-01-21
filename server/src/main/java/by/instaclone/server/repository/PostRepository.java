package by.instaclone.server.repository;

import by.instaclone.server.entity.Post;
import by.instaclone.server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByUserOrderByCreatedDataDesc(User user);
    List<Post> findAllByOrderByCreatedDataDesc();
    Optional<Post> findPostByIdAndUser(Long id, User user);

}
