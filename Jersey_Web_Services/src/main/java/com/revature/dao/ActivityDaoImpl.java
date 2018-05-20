package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import com.revature.repository.Activity;

public class ActivityDaoImpl implements ActivityDao {

    @Override
    public Activity findActivity(int id) {
        Activity swim = new Activity();
        swim.setActivityId(10);
        swim.setDuration("40");
        swim.setActivityName("Swimming");
        return swim;
    }

    @Override
    public List<Activity> getAllActivities() {
        Activity swim = new Activity();
        swim.setActivityId(10);
        swim.setDuration("40");
        swim.setActivityName("Swimming");
        Activity bike = new Activity();
        bike.setActivityId(11);
        bike.setDuration("41");
        bike.setActivityName("Biking");

        List<Activity> list = new ArrayList<>();
        list.add(swim);
        list.add(bike);
        return list;
    }

}