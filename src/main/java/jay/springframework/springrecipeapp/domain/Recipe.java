package jay.springframework.springrecipeapp.domain;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Recipe {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)//asks the framework to generate an ID for us.
  private Long id;

  private String description;
  private Integer prepTime;
  private Integer cookTime;
  private Integer servings;
  private String source;
  private String url;
  private String directions;
  //todo add
  //private Difficulty difficulty;
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")//this recipe class will get stored in the chile(set of ingredients)
  private Set<Ingredient> ingredients;

  @Lob//create a binary large object filed inside the database
  private Byte[] image;

  @OneToOne(cascade = CascadeType.ALL) //1.one to one mapping with notes. 2.set up recipe is the owner of the cascade relationship.(also need to set up @Entity on the Recipe class)
  private Notes notes;//if we delete the recipe object, we want the cascade also delete the note object

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getPrepTime() {
    return prepTime;
  }

  public void setPrepTime(Integer prepTime) {
    this.prepTime = prepTime;
  }

  public Integer getCookTime() {
    return cookTime;
  }

  public void setCookTime(Integer cookTime) {
    this.cookTime = cookTime;
  }

  public Integer getServings() {
    return servings;
  }

  public void setServings(Integer servings) {
    this.servings = servings;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getDirections() {
    return directions;
  }

  public void setDirections(String directions) {
    this.directions = directions;
  }

  public Set<Ingredient> getIngredients() {
    return ingredients;
  }

  public void setIngredients(
      Set<Ingredient> ingredients) {
    this.ingredients = ingredients;
  }

  public Byte[] getImage() {
    return image;
  }

  public void setImage(Byte[] image) {
    this.image = image;
  }

  public Notes getNotes() {
    return notes;
  }

  public void setNotes(Notes notes) {
    this.notes = notes;
  }
}
