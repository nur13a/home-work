package com.company;

import java.sql.Timestamp;

public class UserLog {
    private User user_id;
    private Timestamp time_of_enter;
    private Successfulness successfulness;

    public UserLog(User user_id, Timestamp time_of_enter, Successfulness successfulness) {
        this.user_id = user_id;
        this.time_of_enter = time_of_enter;
        this.successfulness = successfulness;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public Timestamp getTime_of_enter() {
        return time_of_enter;
    }

    public void setTime_of_enter(Timestamp time_of_enter) {
        this.time_of_enter = time_of_enter;
    }

    public Successfulness getSuccessfulness() {
        return successfulness;
    }

    public void setSuccessfulness(Successfulness successfulness) {
        this.successfulness = successfulness;
    }
}
