package com.kaelix.bookingapi.repository;

import com.kaelix.bookingapi.entity.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<BookingEntity, Long> {

}