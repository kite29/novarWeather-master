package com.novar.weather;



import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;

import javax.baja.log.Log;
import javax.baja.sys.Action;
import javax.baja.sys.BAbsTime;
import javax.baja.sys.BComponent;
import javax.baja.sys.BIcon;
import javax.baja.sys.BRelTime;
import javax.baja.sys.BValue;
import javax.baja.sys.Context;
import javax.baja.sys.Flags;
import javax.baja.sys.Property;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;
import javax.baja.timezone.BTimeZone;
import javax.baja.util.IFuture;
import javax.baja.util.Invocation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import java.util.List;



public class BWeather
  extends BComponent
{
  /*-
   class BWeather
   {
  properties
  {

   city : String
   flags {   summary }
   default {[ "����" ]} 
   statusOK:  boolean

   flags {   summary }
   default {[ true ]}
   APPCODE: String
   default {[ "" ]}
   lastFailCause : String
   default {[ "" ]}    
   fullInfo : String
   flags { readonly}
   default {[ "" ]}
   lastUpdateTime : BAbsTime
   default {[ BAbsTime.NULL ]}

    weatherData : String
   flags { readonly}  
   default {[ "" ]}
     fullInfo : String
   flags { readonly, hidden}     
      default {[ "" ]}
    worker: BDemoWorker
    flags { hidden}
    default {[ new BDemoWorker() ]}
    


  }
  
  actions
  {
   query()
   flags { async }
  }
}
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.novar.weather.BWeather(1384499926)1.0$ @*/
/* Generated Sun Aug 27 17:55:37 CST 2017 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "city"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>city</code> property.
   * @see com.novar.weather.BWeather#getCity
   * @see com.novar.weather.BWeather#setCity
   */
  public static final Property city = newProperty(Flags.SUMMARY, "\ufffd\ufffd\ufffd\ufffd",null);
  
  /**
   * Get the <code>city</code> property.
   * @see com.novar.weather.BWeather#city
   */
  public String getCity() { return getString(city); }
  
  /**
   * Set the <code>city</code> property.
   * @see com.novar.weather.BWeather#city
   */
  public void setCity(String v) { setString(city,v,null); }

////////////////////////////////////////////////////////////////
// Property "statusOK"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>statusOK</code> property.
   * @see com.novar.weather.BWeather#getStatusOK
   * @see com.novar.weather.BWeather#setStatusOK
   */
  public static final Property statusOK = newProperty(Flags.SUMMARY, true,null);
  
  /**
   * Get the <code>statusOK</code> property.
   * @see com.novar.weather.BWeather#statusOK
   */
  public boolean getStatusOK() { return getBoolean(statusOK); }
  
  /**
   * Set the <code>statusOK</code> property.
   * @see com.novar.weather.BWeather#statusOK
   */
  public void setStatusOK(boolean v) { setBoolean(statusOK,v,null); }

////////////////////////////////////////////////////////////////
// Property "APPCODE"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>APPCODE</code> property.
   * @see com.novar.weather.BWeather#getAPPCODE
   * @see com.novar.weather.BWeather#setAPPCODE
   */
  public static final Property APPCODE = newProperty(0, "",null);
  
  /**
   * Get the <code>APPCODE</code> property.
   * @see com.novar.weather.BWeather#APPCODE
   */
  public String getAPPCODE() { return getString(APPCODE); }
  
  /**
   * Set the <code>APPCODE</code> property.
   * @see com.novar.weather.BWeather#APPCODE
   */
  public void setAPPCODE(String v) { setString(APPCODE,v,null); }

////////////////////////////////////////////////////////////////
// Property "lastFailCause"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>lastFailCause</code> property.
   * @see com.novar.weather.BWeather#getLastFailCause
   * @see com.novar.weather.BWeather#setLastFailCause
   */
  public static final Property lastFailCause = newProperty(0, "",null);
  
  /**
   * Get the <code>lastFailCause</code> property.
   * @see com.novar.weather.BWeather#lastFailCause
   */
  public String getLastFailCause() { return getString(lastFailCause); }
  
  /**
   * Set the <code>lastFailCause</code> property.
   * @see com.novar.weather.BWeather#lastFailCause
   */
  public void setLastFailCause(String v) { setString(lastFailCause,v,null); }


////////////////////////////////////////////////////////////////
// Property "lastUpdateTime"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>lastUpdateTime</code> property.
   * @see com.novar.weather.BWeather#getLastUpdateTime
   * @see com.novar.weather.BWeather#setLastUpdateTime
   */
  public static final Property lastUpdateTime = newProperty(0, BAbsTime.NULL,null);
  
  /**
   * Get the <code>lastUpdateTime</code> property.
   * @see com.novar.weather.BWeather#lastUpdateTime
   */
  public BAbsTime getLastUpdateTime() { return (BAbsTime)get(lastUpdateTime); }
  
  /**
   * Set the <code>lastUpdateTime</code> property.
   * @see com.novar.weather.BWeather#lastUpdateTime
   */
  public void setLastUpdateTime(BAbsTime v) { set(lastUpdateTime,v,null); }

////////////////////////////////////////////////////////////////
// Property "weatherData"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>weatherData</code> property.
   * @see com.novar.weather.BWeather#getWeatherData
   * @see com.novar.weather.BWeather#setWeatherData
   */
  public static final Property weatherData = newProperty(Flags.READONLY, "",null);
  
  /**
   * Get the <code>weatherData</code> property.
   * @see com.novar.weather.BWeather#weatherData
   */
  public String getWeatherData() { return getString(weatherData); }
  
  /**
   * Set the <code>weatherData</code> property.
   * @see com.novar.weather.BWeather#weatherData
   */
  public void setWeatherData(String v) { setString(weatherData,v,null); }

////////////////////////////////////////////////////////////////
// Property "fullInfo"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>fullInfo</code> property.
   * @see com.novar.weather.BWeather#getFullInfo
   * @see com.novar.weather.BWeather#setFullInfo
   */
  public static final Property fullInfo = newProperty(Flags.READONLY|Flags.HIDDEN, "",null);
  
  /**
   * Get the <code>fullInfo</code> property.
   * @see com.novar.weather.BWeather#fullInfo
   */
  public String getFullInfo() { return getString(fullInfo); }
  
  /**
   * Set the <code>fullInfo</code> property.
   * @see com.novar.weather.BWeather#fullInfo
   */
  public void setFullInfo(String v) { setString(fullInfo,v,null); }

////////////////////////////////////////////////////////////////
// Property "worker"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>worker</code> property.
   * @see com.novar.weather.BWeather#getWorker
   * @see com.novar.weather.BWeather#setWorker
   */
  public static final Property worker = newProperty(Flags.HIDDEN, new BDemoWorker(),null);
  
  /**
   * Get the <code>worker</code> property.
   * @see com.novar.weather.BWeather#worker
   */
  public BDemoWorker getWorker() { return (BDemoWorker)get(worker); }
  
  /**
   * Set the <code>worker</code> property.
   * @see com.novar.weather.BWeather#worker
   */
  public void setWorker(BDemoWorker v) { set(worker,v,null); }

////////////////////////////////////////////////////////////////
// Action "query"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>query</code> action.
   * @see com.novar.weather.BWeather#query()
   */
  public static final Action query = newAction(Flags.ASYNC,null);
  
  /**
   * Invoke the <code>query</code> action.
   * @see com.novar.weather.BWeather#query
   */
  public void query() { invoke(query,null,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BWeather.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  
  
  public static final Log logger = Log.getLog("novarWeather");


  
  
  public void doQuery() throws IOException{
    // http://api.map.baidu.com/telematics/v3/weather?location=%E5%8C%97%E4%BA%AC&output=json&ak=DTHvg4xD3HGjwShqp9sWtR8zlDkrdUCw

    String add = "http://api.map.baidu.com/telematics/v3/weather?location="+getCity()+ "&output=json&ak="+getAPPCODE();
  URL url = null;
  //SimpleDateFormat formatter; 
  //formatter = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss"); 
  
  try
  {
    url = new URL(add);
  }
  catch (MalformedURLException e)
  {
    logger.trace(e.toString()+BAbsTime.now());
    setStatusOK(false);
    setLastFailCause(e.toString()) ;
  }
BufferedReader in = null;
try
{

  in = new BufferedReader(  new InputStreamReader(url.openStream()));
  logger.trace("url reading"+BAbsTime.now());
}
catch (IOException e)
{
  logger.trace(e.toString()+BAbsTime.now());
  setStatusOK(false);
  setLastFailCause(e.toString()) ;

}
   finally {  
    if (in != null)  
        {in.close();  }
}  

//jackson test begin
ObjectMapper mapper = new ObjectMapper(); // create once, reuse
String s;
String s2;
String weatherdata;
StringBuffer sb = new StringBuffer();

while((s = in.readLine())!= null)
{ sb.append(s);
sb.append("/n");
    }
s2= sb.toString();
JsonFactory factory = new JsonFactory();
logger.trace("jackson working"+BAbsTime.now());
mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
mapper.setVisibilityChecker(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
JsonParser  parser  = factory.createParser(s2);
//System.out.println(s2);

JsonRootBean JsonRootBean = mapper.readValue(parser, JsonRootBean.class);
logger.trace("json parsing"+BAbsTime.now());
List<Results> results = JsonRootBean.getResults();

System.out.println("Error:"+JsonRootBean.getError());
if(JsonRootBean.getStatus().toLowerCase().indexOf("success")<0)
{
  logger.trace("json reading fail"+BAbsTime.now());
  setStatusOK(false);
  setLastFailCause("json reading fail") ;
  
}
//System.out.println("Status:"+JsonRootBean.getStatus());
//String ctime = formatter.format(JsonRootBean.getDate());
//System.out.println("Time:"+ctime);

Results r=results.get(0);
//System.out.println(JsonRootBean);
//System.out.println("city:"+r.getCurrentcity());//??
//System.out.println("PM2.5:"+r.getPm25());
String Pm="PM2.5:"+r.getPm25()+";";
System.out.println("����tips");
//List<Index> Index= r.getIndex();
//for(int i=0;i<Index.size();i++)
//{
//  
//  System.out.println("\n���⣺"+Index.get(i).getTitle());
//  System.out.println("�Ƽ���"+Index.get(i).getZs());
//  System.out.println("ָ����"+Index.get(i).getTipt());
//  System.out.println("��ϸ��"+Index.get(i).getDes());
//
//}
//System.out.println("\n5��Ԥ��");

List<WeatherData> WeatherDatalist= r.getWeatherData();
//for(int i=0;i<WeatherDatalist.size();i++)
//{
//  
//  System.out.println("\n���ڣ�"+WeatherDatalist.get(i).getDate());
//  System.out.println("\n��ͼƬ��"+WeatherDatalist.get(i).getDaypictureurl());
//  System.out.println("\nҹͼƬ��"+WeatherDatalist.get(i).getNightpictureurl());
//  System.out.println("\n�¶ȣ�"+WeatherDatalist.get(i).getTemperature());
//  System.out.println("\n������"+WeatherDatalist.get(i).getWeather());
//  System.out.println("\n�磺"+WeatherDatalist.get(i).getWind());
//}
logger.trace("read weather data end"+BAbsTime.now());

String Temp="temp:"+WeatherDatalist.get(0).getTemperature()+";";
String weather="temp:"+WeatherDatalist.get(0).getWeather()+";";
String wind="wind:"+WeatherDatalist.get(0).getWind()+";";
setWeatherData(Pm+Temp+weather+wind);
setStatusOK(true);
setLastFailCause("") ;
setLastUpdateTime(BAbsTime.now());
try
{
  in.close();
}
catch (IOException e)
{
  logger.trace(e.toString()+BAbsTime.now());
  setStatusOK(false);
  setLastFailCause(e.toString()) ;
  
}
  
      
  }

  private BTimeZone timeZone = null;
  
private void setTimeZone(BTimeZone tz)
{
  this.timeZone = tz;
}
  
public IFuture post(Action action, BValue argument, Context cx)
{
  getWorker().postAsync(new Invocation(this, action, argument, cx));
  return null;
  }
BIcon addIcon = BIcon.std("cloud.png");
}
