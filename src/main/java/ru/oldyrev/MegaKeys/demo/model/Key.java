package ru.oldyrev.MegaKeys.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "keys", uniqueConstraints = {
        @UniqueConstraint(columnNames = "name"),
        @UniqueConstraint(columnNames = "number")
}
)
public class Key {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Не может быть пустым")
    @Column(name = "name")
    private String name;

    @NotNull(message = "Не может быть пустым")
    @Size(min = 10, message = "Не менее 10-ти цифр")
    @Column(name = "number")
    private String number;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Contractor> contractor;
}
