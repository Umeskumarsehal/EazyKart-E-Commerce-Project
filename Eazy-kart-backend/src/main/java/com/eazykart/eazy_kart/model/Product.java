package com.eazykart.eazy_kart.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
    private String brand;
    private double price;
    private String category;
    private Date releaseDate;
    private boolean productAvailable;
    private int stockQuantity;

    private String imageName;
    private String imageType;

    @Lob
    @Column(name = "imageData", columnDefinition = "LONGBLOB", length = 104857699)
    private byte[] imageData;

}
