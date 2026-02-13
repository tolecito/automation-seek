@registro
Feature: Registro en la web

  Background:
    Given que el usuario abre el sitio web en la pagina de registro

  @registroExitoso
  Scenario Outline: Registro de usuario exitoso
    When el usuario completa el formulario de registro con sus datos "<nombre>","<apellido>","<email>","<usuario>","<contrasena>","<nacimiento>","<sexo>"
    Then deberia ver el mensaje de registro "Your account has been registered! We have sent you an account activation email. If you didn't receive the email, please check your spam/junk folder."

    Examples:
      | nombre       | apellido   | email                   | usuario        | contrasena     |nacimiento | sexo   |
      | Ian          | Vargas     | ianvargas8@gmail.com    | ianvg8         | 147258         |05-04-2002 | Male   |

  @registroInfoIncompleta
  Scenario Outline: Registro de usuario fallido por información incompleta (ERROR)
    When el usuario completa el formulario de registro con sus datos "<nombre>","<apellido>","","<usuario>","<contrasena>","<nacimiento>","<sexo>"
    Then deberia ver el mensaje de registro "Some fields are incomplete. Please complete them to continue with the registration."

    Examples:
      | nombre       | apellido   |  usuario        | contrasena     |nacimiento | sexo   |
      | Ian          | Vargas     |  ianvg5         | 147258         |05-04-2002 | Male   |

  @registroCorreoRepetido
  Scenario Outline: Registro de usuario fallido por correo electronico ya usado
    When el usuario completa el formulario de registro con sus datos "<nombre>","<apellido>","<email>","<usuario>","<contrasena>","<nacimiento>","<sexo>"
    Then deberia ver el mensaje de error en registro "The email address you used already exists in our database. Please try another email address."

    Examples:
      | nombre       | apellido   | email                  | usuario        | contrasena     |nacimiento | sexo   |
      | Ian          | Vargas     | ianvarga8@gmail.com    | ianv11         | 147258         |05-04-2002 | Male   |

  @registroUsuarioRepetido
  Scenario Outline: Registro de usuario fallido por nombre de usuario ya usado
    When el usuario completa el formulario de registro con sus datos "<nombre>","<apellido>","<email>","<usuario>","<contrasena>","<nacimiento>","<sexo>"
    Then deberia ver el mensaje de error en registro "The following username is taken. Please select a different one."

    Examples:
      | nombre       | apellido   | email                   | usuario        | contrasena     |nacimiento | sexo   |
      | Ian          | Vargas     | ianvargas7@gmail.com    | ianvg6         | 147258         |05-04-2002 | Male   |