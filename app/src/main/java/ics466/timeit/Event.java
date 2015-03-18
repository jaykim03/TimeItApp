package ics466.timeit;

import com.alamkanak.weekview.WeekViewEvent;

import java.util.Calendar;


public class Event {

    private int id;
    private String eventName;
    private int eventColor;

    private WeekViewEvent wEvent;

    private int startYear;
    private int startMonth;
    private int startDay;
    private int startHour;
    private int startMin;

    private int endYear;
    private int endMonth;
    private int endDay;
    private int endHour;
    private int endMin;


    public Event(){
        id = -1;
        eventName = "";
        eventColor = 0;

        startYear= 0;
        startMonth = 0;
        startDay = 0;
        startHour = 0;
        startMin = 0;

        endYear= 0;
        endMonth = 0;
        endDay = 0;
        endHour = 0;
        endMin = 0;
    }

    public Event(int num, String name, int color,
                 int sYear, int sMonth, int sDay, int sHour, int sMin,
                 int eYear, int eMonth, int eDay, int eHour, int eMin){
        id = num;
        eventName = name;
        eventColor = color;

        startYear= sYear;
        startMonth = sMonth;
        startDay = sDay;
        startHour = sHour;
        startMin = sMin;

        endYear= eYear;
        endMonth = eMonth;
        endDay = eDay;
        endHour = eHour;
        endMin = eMin;

        createwEvent();
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getEventColor() {
        return eventColor;
    }

    public void setEventColor(int eventColor) {
        this.eventColor = eventColor;
    }

    public int getStartMonth() {
        return startMonth;
    }

    public void setStartMonth(int startMonth) {
        this.startMonth = startMonth;
    }

    public int getStartDay() {
        return startDay;
    }

    public void setStartDay(int startDay) {
        this.startDay = startDay;
    }

    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    public int getStartMin() {
        return startMin;
    }

    public void setStartMin(int startMin) {
        this.startMin = startMin;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public int getEndMonth() {
        return endMonth;
    }

    public void setEndMonth(int endMonth) {
        this.endMonth = endMonth;
    }

    public int getEndDay() {
        return endDay;
    }

    public void setEndDay(int endDay) {
        this.endDay = endDay;
    }

    public int getEndHour() {
        return endHour;
    }

    public void setEndHour(int endHour) {
        this.endHour = endHour;
    }

    public int getEndMin() {
        return endMin;
    }

    public void setEndMin(int endMin) {
        this.endMin = endMin;
    }


    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public WeekViewEvent getwEvent() {
        return wEvent;
    }

    public void createwEvent() {
        Calendar startTime = Calendar.getInstance();
        //startTime.clear();
        startTime.set(Calendar.YEAR, startYear);
        startTime.set(Calendar.MONTH, startMonth-1);
        startTime.set(Calendar.DAY_OF_MONTH, startDay);
        startTime.set(Calendar.HOUR_OF_DAY, startHour);
        startTime.set(Calendar.MINUTE, startMin);

        Calendar endTime = (Calendar) startTime.clone();
        endTime.set(Calendar.YEAR, endYear);
        endTime.set(Calendar.MONTH, endMonth-1);
        endTime.set(Calendar.DAY_OF_MONTH, endDay);
        endTime.set(Calendar.HOUR_OF_DAY, endHour);
        endTime.set(Calendar.MINUTE, endMin);

        WeekViewEvent event = new WeekViewEvent(id, eventName, startTime, endTime);

        this.wEvent = event;
    }

}