package com.revature.dao;

import java.util.List;

import com.revature.repository.Activity;

public interface ActivityDao{

    public Activity findActivity(int id);
    public List<Activity> getAllActivities();
}