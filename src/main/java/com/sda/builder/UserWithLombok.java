package com.sda.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserWithLombok {
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String phoneNumber;
    private String whatever;
    private List<String> names;
}
