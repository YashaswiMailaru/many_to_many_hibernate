package in.yashaswi.crud.crudHibernate.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.yashaswi.crud.crudHibernate.model.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {
  List<Tag> findTagsByTutorialsId(Long tutorialId);
}