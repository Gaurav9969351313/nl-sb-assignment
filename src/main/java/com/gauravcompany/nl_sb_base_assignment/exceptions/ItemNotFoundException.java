package com.gauravcompany.nl_sb_base_assignment.exceptions;

public class ItemNotFoundException extends RuntimeException {

  public ItemNotFoundException(Long id) {
    super("Could not find item " + id);
  }
}
