package com.company.myCls;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Probleme3 {

    public static void MyDate (String s){

//        String []p = s.split("-");
//
//        LocalDate localDate = LocalDate.of(Integer.parseInt(p[0]),Integer.parseInt(p[1]), Integer.parseInt(p[2]));
//
//        System.out.println(localDate.toString());

//        LocalDate localDate = LocalDate.parse(s);
//
//        System.out.println(localDate.toString());


//        LocalTime localTime = LocalTime.parse(s);
//
//        System.out.println(localTime.toString());


//        OffsetTime offsetTime = OffsetTime.parse(s);
//
//        System.out.println(offsetTime.toString());
//        System.out.println(offsetTime.toLocalTime().toString());
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(s);
//
//        LocalDate localDate = LocalDate.parse("01.16.2020",dateTimeFormatter);
//
//        System.out.println(localDate.toString());

    }

    public static void formatingDateTime(){


//         String myDateFormat =
//                 LocalDate.now().format(DateTimeFormatter.ofPattern("MMM~dd~yy"));

//        String myDateFormat = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

//        String myDateFormat = ZonedDateTime.now().
//                format(DateTimeFormatter.ofPattern("E MMM yyyy HH:mm:ss Z z"));


        String myDateFormat = OffsetDateTime.now().
                format(DateTimeFormatter.ofPattern("E MMM yyyy HH:mm:ss.SSSZ"));

        System.out.println(myDateFormat);
    }

    public static void localNow(){

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        String s1 = localDate.format(DateTimeFormatter.ofPattern("E MMM yyy"));
        System.out.println("Suntem in data de: " + s1);
        String s2 = localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("Ora este : " + s2);
    }

    public static void combineDateTime(){

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);

        String mystring = localDateTime.format(DateTimeFormatter.ofPattern("E yyyy MMM / HH:mm:ss"));

        System.out.println(mystring);

    }

    public static void timeViaInstant(){


      //  Instant instant = Instant.now();

      //  OffsetDateTime instant = OffsetDateTime.now();

//        Clock instant = Clock.systemUTC();
//
//        System.out.println(instant.instant());

        //convert string to instant -> string that follows the ISO-8601 standard

//        String s = "2021-10-17T13:57:13.969Z";
//
//        Instant i = Instant.parse(s);
//
//        System.out.println(i.toString());

        // adding, subtracting

//        Instant i = Instant.now().plus(5, ChronoUnit.DAYS);
//        System.out.println(i.toString());

//        Instant instant = Instant.now().minus(2,ChronoUnit.HOURS);
//        System.out.println(instant.toString());

        // comparing instant objects

//        Instant i1 = Instant.now();
//        Instant i2 = i1.plusSeconds(5);
//
//        System.out.println(i1.isAfter(i2));//expected result -> false
//
//        System.out.println(i1.isBefore(i2));//expected result -> true
//
//        long duration = i1.until(i2,ChronoUnit.SECONDS);
//
//        System.out.println(duration);
//
//        System.out.println();
//


    }

    public static void definePeriod(){

        //Period and duration APIs.

//        Period fromDays = Period.ofDays(100);
//
//        LocalDate localDate = LocalDate.now();
//
//        Period p2 = Period.of(localDate.getYear(),localDate.getMonthValue(),localDate.getDayOfMonth());
//
//        System.out.println(p2.toString());
//
//        Period p = Period.parse("P2021Y10M19D");
//
//        System.out.println(p.toString());

//        LocalDate start = LocalDate.of(2018,04,20);
//        LocalDate end = LocalDate.of(2020,05,20);
//
//        Period periodBetween = Period.between(start,end);

     //   System.out.println(periodBetween.toString());

//        StringBuilder sb = new StringBuilder();
//        sb.append(periodBetween.getYears())
//                .append("/").append(periodBetween.getMonths()).append("/")
//                .append(periodBetween.getDays());
//
//        System.out.println(sb.toString());

//        Duration d = Duration.of(3,ChronoUnit.DAYS);
//
//        System.out.println(d.toString());

//        LocalTime localTime = LocalTime.of(4,57);
//
//        Duration d2 = Duration.ofMinutes(localTime.getMinute());
//
//        System.out.println(d2);

        LocalTime l1 = LocalTime.of(4,14,20,670);
        LocalTime l2 = LocalTime.of(6,14,10,720);

        Duration d = Duration.between(l1,l2);

        System.out.println(d.toString());

    }

    public static void getTimeUnits(){

        LocalDateTime localDateTime = LocalDateTime.now();

        List<Integer>myList = new ArrayList<>(Arrays.asList(localDateTime.getYear(),
                localDateTime.getDayOfMonth(),localDateTime.getDayOfMonth(),
                localDateTime.getHour(),localDateTime.getMinute(),
                localDateTime.getSecond(),localDateTime.getNano()));

        for(int i=0; i<myList.size(); i++){

            System.out.println(myList.get(i));
        }



    }

    public static void addAndSubtract(){

       // LocalDate localDate = LocalDate.now().minusDays(3);

        //   LocalDate localDate = LocalDate.now().plusDays(5);

      //  LocalDateTime localDateTime = LocalDateTime.now().minusMinutes(38);

     //   System.out.println(localDateTime.toString());


    }

    public static void getAllTimeZones(){

//        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
//
//        for(int i=0; i< zoneIds.size(); i++){
//
//
//            System.out.println(zoneIds.toString());
//        }

        ZoneId zoneId = ZoneId.of("Europe/London");
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedDateTime = now.atZone(zoneId);



//        String utcOffset = zonedDateTime.getOffset().getId().replace("Z","+00:00");
//
//        System.out.println(utcOffset);


    }

    public static void getLocalDateTime(){

        DateTimeFormatter dateTimeFormatter =
                DateTimeFormatter.ofPattern("yyyy-MMM-E'T'HH:mm:ss Z");


        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(zonedDateTime.format(dateTimeFormatter).toString());


    }

    public static void flightDateTime(){

        LocalDateTime localDateTime =
                LocalDateTime.of(2021,10,26,19,29);

        ZonedDateTime zonedDateTimeDepart= localDateTime.atZone(ZoneId.of("Australia/Perth"));

        ZonedDateTime zonedDateTimeArrive = zonedDateTimeDepart.plusHours(15).plusMinutes(30);



    }

    public static void unix(){

//before jdk8
//        long unixTimeStamp = 1577769800;
//
//        Date date = new Date(unixTimeStamp * 1000);
//
//        Date date1 = new Date(TimeUnit.MILLISECONDS.convert(unixTimeStamp,TimeUnit.SECONDS));
//
//        System.out.println(date1.toString());

        long unixTimeStamp = 1577769800;

        Instant instant = Instant.ofEpochSecond(unixTimeStamp);

        LocalDateTime timePerth = LocalDateTime.ofInstant(instant,ZoneId.of("Australia/Perth"));
        LocalDateTime timeBucharest = LocalDateTime.ofInstant(instant,ZoneId.of("Europe/Bucharest"));
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant,ZoneId.of("Europe/Bucharest"));


        System.out.println(timePerth.toString());
        System.out.println(timeBucharest.toString());
        System.out.println(zonedDateTime.toString());
    }

    public static void firstLastDayofMonth(){

       LocalDate localDate = LocalDate.now();

       LocalDate first = localDate.with(TemporalAdjusters.firstDayOfMonth());
       LocalDate last = localDate.with(TemporalAdjusters.lastDayOfMonth());

       LocalDate firstDayYear = localDate.with(TemporalAdjusters.firstDayOfYear());

       DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MMM-E");


        System.out.println(dateTimeFormatter.format(first));
        System.out.println(last.toString());
        System.out.println(firstDayYear.toString());


    }

    public static void extractOffsets(){

//        OffsetDateTime odt = OffsetDateTime.now();
//
//        System.out.println(odt.toString().substring(odt.toString().length()-6));
        LocalDateTime ldt = LocalDateTime.now();

        ZoneId zoneId = ZoneId.of("Europe/Bucharest");
        ZoneOffset zoneOffset = zoneId.getRules().getOffset(ldt);

        System.out.println(zoneOffset.toString());

    }

    public static void dateInstant(){

        Instant instant = Instant.now();

        Date date = Date.from(instant);

        System.out.println(date.toString());

    }

    public static void dateIteration(){

        //LocalDate now = LocalDate.now();
        LocalDate afterThen = LocalDate.of(2021,11,10);

        for(LocalDate now = LocalDate.now(); now.isBefore(afterThen); now = now.plusDays(1)){


            System.out.println(now.toString());

        }




    }

    public static void ageDetermination(){

        LocalDate birthDate = LocalDate.of(1930,03,20);

        LocalDate ageDet = LocalDate.now();

        Period period = Period.between(birthDate,ageDet);

        System.out.println(period.toString());

    }


    public static void startEndDay(){

        LocalDate ld = LocalDate.now();

        LocalDateTime ldt1 = ld.atStartOfDay();

        LocalDateTime ldt2 = ld.atTime(LocalTime.MAX);

        System.out.println(ldt1.toString());
        System.out.println(ldt2.toString());

    }

    public static void differenceBetweenDates(){

        LocalDate ld1 = LocalDate.of(2020,7,11);
        LocalDate ld2 = LocalDate.of(2021,11,01);

//        Period period = Period.between(ld1,ld2);
//
//        System.out.println(period.toString());

        long days = Math.abs(ChronoUnit.DAYS.between(ld1,ld2));

        long months = Math.abs(ChronoUnit.MONTHS.between(ld1,ld2));

        long years = Math.abs(ChronoUnit.YEARS.between(ld1,ld2));

        System.out.println(days +"---" +months+ "---"+ years);



    }

    public static void implementChessClock(){

        Clock fixed = Clock.fixed(Instant.now(),ZoneOffset.UTC);

        System.out.println(fixed.toString());

        Clock tickClock = Clock.tickSeconds(ZoneId.of("Europe/Bucharest"));

        System.out.println(tickClock.instant());


    }

















}
