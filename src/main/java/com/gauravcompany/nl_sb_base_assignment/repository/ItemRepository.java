package com.gauravcompany.nl_sb_base_assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gauravcompany.nl_sb_base_assignment.models.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
