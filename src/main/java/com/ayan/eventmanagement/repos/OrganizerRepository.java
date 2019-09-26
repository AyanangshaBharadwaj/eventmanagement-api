package com.ayan.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ayan.eventmanagement.entities.Organizer;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {

}
