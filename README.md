# automation-seek: Comandos de ejecución

Primer comando para limpiar la ejecución: gradlew clean

Comando para ejecutar todas las pruebas: gradlew test aggregate --info --continue

Comando para ejecutar pruebas de registro: gradlew clean test aggregate -Dcucumber.filter.tags="@login" --info --continue

Comando para ejecutar pruebas de login: gradlew clean test aggregate -Dcucumber.filter.tags="@registro" --info --continue