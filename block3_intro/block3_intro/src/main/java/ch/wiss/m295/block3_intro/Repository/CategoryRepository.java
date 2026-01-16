package ch.wiss.m295.block3_intro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.wiss.m295.block3_intro.model.Student;

public interface CategoryRepository extends JpaRepository<Student, Long> {
/** that's it, for the moment 🙂 */
}