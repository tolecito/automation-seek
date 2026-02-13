# automation-seek: Comandos de ejecución

Primer comando para limpiar la ejecución: gradlew clean

Comando para ejecutar todas las pruebas: gradlew test aggregate --info --continue 

Comando para ejecutar pruebas por etiquetas: gradlew test aggregate -Dcucumber.filter.tags="etiqueta" --info --continue