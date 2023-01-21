package by.instaclone.server.repository;

import by.instaclone.server.entity.ImageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImageRepository extends JpaRepository<ImageModel, Long> {
    Optional<ImageModel> findByUserId(Long userId);
    Optional<ImageModel> findByPostId(Long postId);

}
