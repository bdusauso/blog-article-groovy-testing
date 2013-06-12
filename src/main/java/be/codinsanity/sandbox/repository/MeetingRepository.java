package be.codinsanity.sandbox.repository;

import be.codinsanity.sandbox.model.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * author : Bruno Dusausoy
 */
public interface MeetingRepository extends JpaRepository<Meeting, Long> {
}
