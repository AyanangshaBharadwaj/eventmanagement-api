package com.ayan.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ayan.eventmanagement.entities.Venue;

public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {

}
