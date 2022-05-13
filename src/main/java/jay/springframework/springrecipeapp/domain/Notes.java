package jay.springframework.springrecipeapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class Notes {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToOne()//no need to specify cascade in here cuz we want the recipe to own the notes(if we delete the note object, we don't want the cascade delete the recipe object)
  private Recipe recipe;
  @Lob //large object, allows user to put more than the limitation in hibernate and JPA
  private String recipeNotes;
}
