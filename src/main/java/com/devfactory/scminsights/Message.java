package com.devfactory.scminsights;

public class Message {

  /**
   * Error Message Constants
   *
   */
  public interface ErrorMessage {
    String NAME_NOT_NULL = "Search name can't be empty..";

    String NO_CLASS_FOUND = "No Class found for the given name: %s";

    String NO_PROJECT_FOUND = "NO project found for provided id: %s";

    String NO_PACKAGE_FOUND = "NO package found for provided id: %s and name: %s";
    
    String TEST = "Search name can't be empty..";
  }  
}
