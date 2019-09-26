package com.ayan.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ayan.eventmanagement.entities.Event;

public interface EventRepository extends PagingAndSortingRepository<Event, Long> {

}
