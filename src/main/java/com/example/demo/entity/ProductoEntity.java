package com.example.demo.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name= "tb_producto")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProductoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productoID;
	@Column(name= "Nombre Producto", nullable = false)
	private String Nombre;
	@Column(name= "Stock Producto", nullable = false)
	private Integer stock;
	@Column(name= "Precio Producto", nullable = false)
	private Double precio;
	
	private String urlimagen;

}