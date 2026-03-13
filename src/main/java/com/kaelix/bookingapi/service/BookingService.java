package com.kaelix.bookingapi.service;

import com.kaelix.bookingapi.dto.BookingResponseDTO;
import com.kaelix.bookingapi.dto.CreateBookingRequestDTO;
import com.kaelix.bookingapi.entity.BookingEntity;
import com.kaelix.bookingapi.mapper.BookingMapper;
import com.kaelix.bookingapi.repository.BookingRepository;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public BookingResponseDTO createBooking(CreateBookingRequestDTO request) {

        BookingEntity entity = BookingMapper.toEntity(request);

        entity.setPrice(250.0);
        entity.setStatus("CONFIRMED");

        bookingRepository.save(entity);

        return BookingMapper.toResponseDTO(entity);
    }
}