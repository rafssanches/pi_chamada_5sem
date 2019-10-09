package rafsanches.com.br.pi_chamada;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {
    private static SimpleDateFormat sdf =
            new SimpleDateFormat("dd/MM/yyyy HH:mm");

    private static SimpleDateFormat dma =
            new SimpleDateFormat("dd/MM/yyyy");



    public static String convert (Date date){
        return sdf.format(date);
    }
    public static String convertDma (Date date){
        return dma.format(date);
    }
}
