package tacos;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class Taco {

	private Long id;
	private Date createdAt;
	// end::allButValidation[]
	@NotNull
	@Size(min = 5, message = "Name must be at least 5 characters long")
	// tag::allButValidation[]
	private String name;

	@ManyToMany(targetEntity = Ingredient.class)
	@Size(min = 1, message = "You must choose at least 1 ingredient")
	private List<Ingredient> ingredients = new ArrayList<>();

}
