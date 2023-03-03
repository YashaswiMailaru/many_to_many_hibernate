package in.yashaswi.crud.crudHibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.yashaswi.crud.crudHibernate.model.Tutorial;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
  List<Tutorial> findTutorialsByTagsId(Long tagId);
  ArrayList<Tutorial> findByTitleContaining(String title);
  List<Tutorial> findByPublished(boolean b);
}