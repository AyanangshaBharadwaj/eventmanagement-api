package com.ayan.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ayan.eventmanagement.entities.Participant;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {

}
