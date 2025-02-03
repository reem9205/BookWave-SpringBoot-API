package com.csis231.api.model;

import jakarta.persistence.*;
import javax.validation.constraints.NotEmpty;

/**
 * Entity representing a Genre in the database.
 */
@Entity
@Table(name = "genre")
public class Genre {

    /**
     * Unique identifier for the Genre.
     * This field is the primary key and is auto-generated by the database.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genre_id", nullable = false)
    private Long genre_id;  // Use Long instead of long to support null values.

    /**
     * Type or category of the Genre (e.g., "Fiction", "Non-Fiction").
     * This is a non-nullable field.
     */
    @NotEmpty(message = "Type is required.")
    @Column(name = "type", nullable = false)
    private String type;

    /**
     * Default constructor required by JPA.
     */
    public Genre() {
        this.type = ""; // Or consider null if the type is optional.
    }

    /**
     * Constructor to initialize a Genre with a specific type.
     *
     * @param type The type/category of the genre
     */
    public Genre(String type) {
        this.type = type;
    }

    // Getters and Setters

    /**
     * Gets the unique identifier for this genre.
     *
     * @return The genre ID.
     */
    public Long getGenreId() {
        return genre_id;
    }

    /**
     * Sets the unique identifier for this genre.
     *
     * @param genre_id The genre ID.
     */
    public void setGenreId(Long genre_id) {
        this.genre_id = genre_id;
    }

    /**
     * Gets the type of this genre (e.g., "Fiction", "Science Fiction").
     *
     * @return The genre type.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type/category of this genre.
     *
     * @param type The genre type.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Optional: Override the toString method for better object representation.
     *
     * @return A string representation of the Genre object.
     */
    @Override
    public String toString() {
        return "Genre{id=" + genre_id + ", type='" + type + "'}";
    }
}
