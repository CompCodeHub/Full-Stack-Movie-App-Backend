package dev.suyash.Movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// Review document
@Document(collection = "reviews")
@Data // Generates getters/setters
@AllArgsConstructor // Generates all args constructor
@NoArgsConstructor // Generates no args constructor
public class Review {

    @Id
    private ObjectId id;

    private String body;
}
