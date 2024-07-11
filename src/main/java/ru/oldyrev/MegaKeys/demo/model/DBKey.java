package ru.oldyrev.MegaKeys.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class DBKey {

    private Long id;

    private String number;

    private String name;

    private int nok;
}
