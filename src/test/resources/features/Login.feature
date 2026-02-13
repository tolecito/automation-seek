@login
Feature: Inicio de sesion en la web

  Background:
    Given que el usuario abre el sitio web en la pagina de login

  @loginExitoso
  Scenario Outline: Inicio de sesion exitoso
    When el usuario inicia sesion con las credenciales "<usuario>" y "<contrasena>"
    Then deberia ver el mensaje "OPEN SOURCE SOCIAL NETWORK"

    Examples:
      | usuario          | contrasena     |
      | administrator     | administrator |

  @loginCredencialesIncorrectas
  Scenario Outline: Inicio de sesion fallido por credenciales incorrectas
    When el usuario inicia sesion con las credenciales "<usuario>" y "<contrasena>"
    Then deberia ver el mensaje de error de credenciales "We couldn't log you in. Please check your username or password and try again."

    Examples:
      | usuario          | contrasena     |
      | administrator     | 123456        |


  @loginCredencialesIncompletas
  Scenario Outline: Inicio de sesion fallido por credenciales incompletas (ERROR)
    When el usuario inicia sesion con las credenciales "<usuario>" y ""
    Then deberia ver el mensaje "Invalid username or password!"

    Examples:
      | usuario          |
      | administrator    |