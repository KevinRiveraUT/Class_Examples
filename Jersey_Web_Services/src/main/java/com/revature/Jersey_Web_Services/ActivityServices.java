package com.revature.Jersey_Web_Services;

import javax.ws.rs.Path;

import com.revature.dao.ActivityDaoImpl;;

@Path("activities")
public class ActivityServices {

    private ActivityDaoImpl ai = new ActivityDaoImpl();
    
    @Path("{activityId}")
    public void getActivity(int activityId){
        ai.findActivity(activityId);
    }
}