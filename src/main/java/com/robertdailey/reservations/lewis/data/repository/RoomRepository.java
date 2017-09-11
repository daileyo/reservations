package com.robertdailey.reservations.lewis.data.repository;

import com.robertdailey.reservations.lewis.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long>{
    Room findByNumber(String number);
}


