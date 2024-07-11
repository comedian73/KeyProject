package ru.oldyrev.MegaKeys.demo.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@ToString
@Table(name = "contractors", uniqueConstraints = {
        @UniqueConstraint(columnNames = "phone")
}
)

public class Contractor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @NotNull(message = "Не может быть пустым")
    @Size(min = 10, message = "Не менее 10-ти цифр")
    @Column(name = "phone")
    private String phone;

//    @ManyToMany(fetch = FetchType.EAGER)
//    private Set<Organization> organization;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Key> keys;
}
