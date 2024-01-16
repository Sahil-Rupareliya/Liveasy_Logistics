package com.LiveasyLogistics.Assignment;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "shipment")
public class load {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String loadingPoint;
    private String unLoadingPoint;
    private String productType;
    private String truckType;
    private int noOfTrucks;
    private double weight;
    private String comment;
    private  Long shipperId;
    private String date;
}

