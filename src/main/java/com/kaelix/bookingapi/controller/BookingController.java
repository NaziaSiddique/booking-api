package com.kaelix.bookingapi.controller;

import com.kaelix.bookingapi.dto.BookingResponseDTO;
import com.kaelix.bookingapi.dto.CreateBookingRequestDTO;
import com.kaelix.bookingapi.service.BookingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public BookingResponseDTO createBooking(@RequestBody CreateBookingRequestDTO request) {
        return bookingService.createBooking(request);
    }
}