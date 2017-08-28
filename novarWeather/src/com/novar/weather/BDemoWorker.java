package com.novar.weather;

import javax.baja.sys.*;
import javax.baja.util.*;

public class BDemoWorker
    extends BWorker
{
  /*-
   class BDemoWorker
   {
     properties
     {
     }
     actions
     {
     }
     topics
     {
     }
   }
   -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.certification.trafficLights.worker.BDemoWorker(1992583770)1.0$ @*/
/* Generated Mon Jul 01 08:46:54 EDT 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BDemoWorker.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/


  public Worker getWorker()
  {
    if (worker == null)
    {
      queue = new CoalesceQueue(1000);
      worker = new Worker(queue);
    }
    return worker;
  }
  
  /**
  * Post an action to be run asynchronously.
  */
  public void postAsync(Runnable r)
  {
    if (!isRunning() || queue == null)
      throw new NotRunningException();
    queue.enqueue(r);
  }

//////////////////////////////////////////////////////////
//Attributes
//////////////////////////////////////////////////////////
  private CoalesceQueue queue;
  private Worker worker;
}
