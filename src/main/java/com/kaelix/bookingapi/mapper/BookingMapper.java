package com.kaelix.bookingapi.mapper;

import com.kaelix.bookingapi.dto.BookingResponseDTO;
import com.kaelix.bookingapi.dto.CreateBookingRequestDTO;
import com.kaelix.bookingapi.entity.BookingEntity;

public class BookingMapper {

    public static BookingEntity toEntity(CreateBookingRequestDTO request) {

        BookingEntity entity = new BookingEntity();

        entity.setGuestName(request.getGuestName());
        entity.setCheckInDate(request.getCheckInDate());
        entity.setCheckOutDate(request.getCheckOutDate());

        return entity;
    }

    public static BookingResponseDTO toResponseDTO(BookingEntity entity) {

        BookingResponseDTO dto = new BookingResponseDTO();

        dto.setId(entity.getId());
        dto.setGuestName(entity.getGuestName());
        dto.setCheckInDate(entity.getCheckInDate());
        dto.setCheckOutDate(entity.getCheckOutDate());
        dto.setPrice(entity.getPrice());
        dto.setStatus(entity.getStatus());

        return dto;
    }
}