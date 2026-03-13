package com.kaelix.bookingapi.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class BookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String guestName;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    private Double price;

    private String status;

}