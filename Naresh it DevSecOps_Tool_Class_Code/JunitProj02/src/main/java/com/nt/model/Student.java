package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // gives   setters + getters + toString()+ hashCode()+ equals()  methods
@NoArgsConstructor  //gives Zero Param  constructor
@AllArgsConstructor // gives   All Arg constructor
public class Student {
  private Integer sno;
  private String sname;
  private  String sadd;
  private   Float  avg;
}
