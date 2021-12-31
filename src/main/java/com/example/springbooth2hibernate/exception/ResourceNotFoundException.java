package com.example.springbooth2hibernate.exception;

import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus
public class ResourceNotFoundException extends RuntimeException  {

  private static final long serialVersionUID = 3534596499606414727L;

  public ResourceNotFoundException(String message) {
    super(message);
  }

  public ResourceNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }
}
