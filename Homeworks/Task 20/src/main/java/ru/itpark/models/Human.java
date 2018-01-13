package ru.itpark.models;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(exclude = "cars")
@Builder
public class Human {
  private int id;
  private int age;
  private int height;
  private String name;
  private List<Car> cars;
}
