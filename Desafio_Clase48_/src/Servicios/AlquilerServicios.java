package Servicios;

import Entidades.Alquiler;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class AlquilerServicios {
    //List<Alquiler> lstAlq=new ArrayList<Alquiler>();

    public AlquilerServicios()  {

        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        Date date=new Date();
        Date date2=new Date();
        try {
             date = format.parse("2023/06/30");
             date2 = format.parse("2023/06/30");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Alquiler[] origen = {
            new Alquiler(date, date2, null, 122),
            new Alquiler(date, date2, null, 500)
        };

        Alquiler[] result = Arrays.stream(origen).filter(x -> x.getPrecio() == 500).toArray(Alquiler[]::new);

        if (result.length > 0) {

        }
    }

}
