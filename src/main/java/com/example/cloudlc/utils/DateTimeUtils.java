package com.example.cloudlc.utils;

import com.google.common.base.Preconditions;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class DateTimeUtils {
    public  LocalDateTime dateToLocalDateTime(Date date) {
        Instant instant = date.toInstant();
        return LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
    }

    public LocalDate dateToLocalDate(Date date) {
        Instant instant = date.toInstant();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        return localDateTime.toLocalDate();
    }

    public Date localDateTimeToUDate(LocalDateTime localDateTime) {
        Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
        return Date.from(instant);
    }

    public Date localDateToUDate(LocalDate localDate) {
        Instant instant = localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
        return Date.from(instant);
    }

    public Date minusMonths(int num) {
        LocalDate localDate =  LocalDate.now().minusMonths(num);
        return localDateToUDate(localDate);
    }

    public Date plusMonths(int num) {
        LocalDate localDate =  LocalDate.now().plusMonths(num);
        return localDateToUDate(localDate);
    }

    public Date getFirstDayOfMonth(LocalDate start){
        LocalDate firstday = start.with(TemporalAdjusters.firstDayOfMonth());
        Date date = localDateToUDate(firstday);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY,0);
        cal.set(Calendar.MINUTE,0);
        cal.set(Calendar.SECOND,0);
        return cal.getTime();
    }

    public Date getLastDayOfMonth(LocalDate localDate){
        LocalDate lastTheMonthDay = localDate.with(TemporalAdjusters.lastDayOfMonth());
        Date date = localDateToUDate(lastTheMonthDay);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY,23);
        cal.set(Calendar.MINUTE,59);
        cal.set(Calendar.SECOND,59);
        return cal.getTime();
    }

    public Date getTodayStart(LocalDate localDate){
        LocalDateTime todayStart = LocalDateTime.of(localDate, LocalTime.MIN);
        return localDateTimeToUDate(todayStart);
    }

    public Date getTodayEnd(LocalDate localDate){
        LocalDateTime todayEnd = LocalDateTime.of(localDate, LocalTime.MAX);
        return localDateTimeToUDate(todayEnd);
    }

    public Date getTodayStart(){
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY,0);
        cal.set(Calendar.MINUTE,0);
        cal.set(Calendar.SECOND,0);
        return cal.getTime();
    }

    public Date getTodayEnd(){
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY,23);
        cal.set(Calendar.MINUTE,59);
        cal.set(Calendar.SECOND,59);
        return cal.getTime();
    }

    public Date getBeforeDayStart(Date date){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_MONTH, -1);
        cal.set(Calendar.HOUR_OF_DAY,0);
        cal.set(Calendar.MINUTE,0);
        cal.set(Calendar.SECOND,0);
        return cal.getTime();
    }

    public Date getAfterDayEnd(Date date){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_MONTH, +1);
        cal.set(Calendar.HOUR_OF_DAY,23);
        cal.set(Calendar.MINUTE,59);
        cal.set(Calendar.SECOND,59);
        return cal.getTime();
    }

    //???????????????????????????
    public Date getBeginDayOfWeek() {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        if (dayOfWeek == 1) {
            dayOfWeek += 7;
        }
        cal.add(Calendar.DATE, 2 - dayOfWeek);
        cal.set(Calendar.HOUR_OF_DAY,0);
        cal.set(Calendar.MINUTE,0);
        cal.set(Calendar.SECOND,0);
        return cal.getTime();
    }

    //???????????????????????????
    public Date getEndDayOfWeek(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(getBeginDayOfWeek());
        cal.add(Calendar.DAY_OF_WEEK, 6);
        cal.set(Calendar.HOUR_OF_DAY,23);
        cal.set(Calendar.MINUTE,59);
        cal.set(Calendar.SECOND,59);
        return cal.getTime();

    }


    // ?????????????????????????????????
    public List<Date> findDatesBegin(Date start, Date end) {
        List<Date> dateList = new ArrayList<>();
        dateList.add(start);
        Calendar calBegin = Calendar.getInstance();
        // ??????????????? Date ????????? Calendar ?????????
        calBegin.setTime(start);
        Calendar calEnd = Calendar.getInstance();
        // ??????????????? Date ????????? Calendar ?????????
        calEnd.setTime(start);
        // ??????????????????????????????????????????
        while (end.after(calBegin.getTime()))  {
            // ?????????????????????????????????????????????????????????????????????????????????
            calBegin.add(Calendar.DAY_OF_MONTH, 1);
            dateList.add(calBegin.getTime());
        }
        return dateList;
    }


    public Date getStartOrEndDayOfQuarter(LocalDate today, Boolean isFirst){
        LocalDate resDate = LocalDate.now();
        if (today == null) {
            today = resDate;
        }
        Month month = today.getMonth();
        Month firstMonthOfQuarter = month.firstMonthOfQuarter();
        Month endMonthOfQuarter = Month.of(firstMonthOfQuarter.getValue() + 2);
        if (isFirst) {
            resDate = LocalDate.of(today.getYear(), firstMonthOfQuarter, 1);
        } else {
            resDate = LocalDate.of(today.getYear(), endMonthOfQuarter, endMonthOfQuarter.length(today.isLeapYear()));
        }
        Instant instant = resDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
        return Date.from(instant);
    }

    public Date getStartOrEndDayOfYear(LocalDate today, Boolean isFirst){
        LocalDate resDate = LocalDate.now();
        if (today == null) {
            today = resDate;
        }
        if (isFirst) {
            resDate = LocalDate.of(today.getYear(), Month.JANUARY, 1);
        } else {
            resDate = LocalDate.of(today.getYear(), Month.DECEMBER, Month.DECEMBER.length(today.isLeapYear()));
        }
        Instant instant = resDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
        return Date.from(instant);
    }

    /**?????????????????????????????????????????????**/
    public List<String> getMonthBetween(Date start, Date endTime){
        ArrayList<String> result = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        String lastMonth = sdf.format(endTime);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(start);
        while (calendar.getTime().before(endTime)) {
            result.add(sdf.format(calendar.getTime()));
            calendar.add(Calendar.MONTH, 1);
        }
        if (result.contains(lastMonth)){
            return result;
        }
        result.add(lastMonth);
        return result;
    }

    /**
     * ???????????????????????????????????????
     * @param start ????????????
     * @param end ????????????
     * @return ????????????
     */
    public int getTheNumberOfDaysBetweenTwoDates(Date start, Date end) {
        Preconditions.checkArgument(start != null && end != null, "start and end is not null");
        LocalDate startDate = dateToLocalDate(start);
        LocalDate endDate = dateToLocalDate(end);
        return (int) (endDate.toEpochDay() - startDate.toEpochDay());
    }

    /**
     * ????????????????????????????????????[??????]?????????
     */
    public List<Date> getDayListBetweenTwoDates(Date start,Date end,int cycle) {
        List<Date> dateList = new ArrayList<>();
        Date date = start;
        while (date.before(end) || date.equals(end)) {
            // ???????????????????????????
            if (!date.equals(start)) {
                dateList.add(date);
            }
            date = new Date(date.getTime() + 1000 * 60 * cycle);
        }
        return dateList;
    }
}
