/**
  * Copyright 2017 aTool.org 
  */
package com.novar.weather ;
import java.util.Date;
import java.util.List;




/**
 * Auto-generated: 2017-07-15 21:32:43
 *
 * @author aTool.org (i@aTool.org)
 * @website http://www.atool.org/json2javabean.php
 */
public class JsonRootBean {

    private int error;
    private String status;
    private Date date;
    private List<Results> results;
    public void setError(int error) {
         this.error = error;
     }
     public int getError() {
         return error;
     }

    public void setStatus(String status) {
         this.status = status;
     }
     public String getStatus() {
         return status;
     }

    public void setDate(Date date) {
         this.date = date;
     }
     public Date getDate() {
         return date;
     }

    public void setResults(List<Results> results) {
         this.results = results;
     }
     public List<Results> getResults() {
         return results;
     }
     
     
     
     

}