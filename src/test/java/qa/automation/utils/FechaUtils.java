package qa.automation.utils;

import java.util.Map;

public class FechaUtils {

    private static final Map<String, String> Meses = Map.ofEntries(
            Map.entry("1",  "Jan."),
            Map.entry("2",  "Feb."),
            Map.entry("3",  "Mar."),
            Map.entry("4",  "Apr."),
            Map.entry("5",  "May"),
            Map.entry("6",  "June"),
            Map.entry("7",  "July"),
            Map.entry("8",  "Aug."),
            Map.entry("9",  "Sep."),
            Map.entry("10", "Oct."),
            Map.entry("11", "Nov."),
            Map.entry("12", "Dec.")
    );

    public static String normalizarFecha(String fecha) {

        String fechaNormalizada = fecha.startsWith("0")
                ? fecha.substring(1)
                : fecha;

        return fechaNormalizada;
    }

    public static String[] separarFecha(String fecha) {

        if (fecha == null || !fecha.matches("\\d{2}-\\d{2}-\\d{4}")) {
            throw new IllegalArgumentException(
                    "Formato invalido. Use dd-mm-aaaa"
            );
        }

        return fecha.split("-");
    }

    public static String convertirMesANombre(String mesNumero) {

        String mes = Meses.get(normalizarFecha(mesNumero));

        if (mes == null) {
            throw new IllegalArgumentException("Mes inválido: " + mesNumero);
        }

        return mes;
    }
}