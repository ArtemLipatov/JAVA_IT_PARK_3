package com.company.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "question")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private LocalDateTime questionDateTime;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id")
    private User usersId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_name")
    private User userName;
}
