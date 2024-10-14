package edu.uga.devdogs;

import com.google.gson.annotations.SerializedName;

import java.time.LocalTime;

public record Course(String courseCode, Section[] sections) {

    public record Section(
            int crn,
            @SerializedName("professor_name") Professor professor,
            Class[] classes) {

        public record Class(String[] days, LocalTime startTime, LocalTime endTime, String buildingName) { }

    }

}
