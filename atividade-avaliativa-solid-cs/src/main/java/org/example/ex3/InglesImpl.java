package org.example.ex3;

import java.util.HashMap;
import java.util.Map;

public class InglesImpl implements Ingles{

    private Map<Integer, String> daysOfTheWeek = new HashMap<>(){{
        put(1, "Sunday");
        put(2, "Monday");
        put(3, "Tuesday");
        put(4, "Wednesday");
        put(5, "Thursday");
        put(6, "Friday");
        put(7, "Saturday");
    }};

    @Override
    public String getDiaDaSemana(Integer dia) {
        return daysOfTheWeek.get(dia);
    }
}
