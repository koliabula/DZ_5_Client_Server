package org.example;

/**
 * {
 *   "type": "login",
 *   "login": "nagibator"
 * }
 */
public class LoginRequest {

  private String login;

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }
}
