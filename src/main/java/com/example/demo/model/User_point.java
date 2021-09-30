package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
//@Table(name = "userdata")
public class User_point
{
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;

	 @Column
	 @NotBlank
	  private String point;

	 @Column
	 @NotBlank
	  private String win;

	 @Column
	 @NotBlank
	  private String grade;

	  @Column
	  @NotBlank
	  private String lose;

}
