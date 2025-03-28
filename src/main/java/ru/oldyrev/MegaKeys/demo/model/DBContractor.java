package ru.oldyrev.MegaKeys.demo.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DBContractor {

    private Long id;

    private String firstName;

    private String lastName;

    private String phone;
}
