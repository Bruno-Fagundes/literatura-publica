package org.literatura.publica.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "books")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;

    @Column(nullable = false)
    private String title;

    private int publicationYear;
    private String genre;
    private String subgenre;

    @Column(columnDefinition = "TEXT")
    private String synopsis;

    private String coverUrl;
    private String language;

    private Boolean liked = false;
    private Double rated = 0.0;

    private String createdAt;
    private String updatedAt;
}
