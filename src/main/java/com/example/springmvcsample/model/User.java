package com.example.springmvcsample.model;

// Lombok（ロンボック） ... 定形コードを削減するためのアノテーションライブラリ。setter, getter を書かなくて良くなります。
import lombok.Data;

// Getter, Setter の他に toString(), equals(), canEqueal(), hashCode() などが自動生成されます。
// @Getter, @Setter にすると toString() などは生成されなくなります。
@Data
public class User {
  public String name;
  public String email;
  public Integer age;
}
