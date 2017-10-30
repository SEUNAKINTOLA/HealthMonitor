package com.example.akintolaoluwaseun.healthmonitor;

import org.json.JSONObject;

/**
 * Created by seun on 27/01/2017.
 */
interface AsyncResult
{
    void onResult(JSONObject object);
}