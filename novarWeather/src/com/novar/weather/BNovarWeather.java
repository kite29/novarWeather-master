package com.novar.weather;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.baja.log.Log;
import javax.baja.sys.Action;
import javax.baja.sys.BAbsTime;
import javax.baja.sys.BComponent;
import javax.baja.sys.BFacets;
import javax.baja.sys.BValue;
import javax.baja.sys.Context;
import javax.baja.sys.Flags;
import javax.baja.sys.Property;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;
import javax.baja.units.UnitDatabase;
import javax.baja.util.IFuture;
import javax.baja.util.Invocation;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import jdk.internal.org.xml.sax.SAXException;


public class BNovarWeather
    extends BComponent
{
  /*-
   class BWeather
   {
  properties
  {
  
   city : String
   flags {   summary }
   default {[ "北京" ]} 
   
   statusOK:  boolean
   flags {  readonly | summary }
   default {[ true ]}
   
   APPCODE: String
   default {[ "" ]}
   lastFailCause : String
   default {[ "" ]}    
  
   lastUpdateTime : BAbsTime
   flags { readonly}
   default {[ BAbsTime.NULL ]}
  
    todayWeather : String
   flags { readonly}  
   default {[ "" ]}
   
    todayTempHi : double
   flags { readonly}  
   default {[ 0.0 ]}
   slotfacets{[ BFacets.makeNumeric(BUnit.getUnit("celsius"),1,-40,40)]}
   
    todayTempLow : double
   flags { readonly}  
   default {[ 0.0 ]}
   slotfacets{[ BFacets.makeNumeric(BUnit.getUnit("celsius"),1,-40,40)]}
   
    todayWind : String
   flags { readonly}  
   default {[ "" ]}
   
    tomorrowWeather : String
   flags { readonly}  
   default {[ "" ]}
   
    tomorrowTempHi : double
   flags { readonly}  
   default {[ 0.0 ]}
   slotfacets{[ BFacets.makeNumeric(BUnit.getUnit("celsius"),1,-40,40)]}
   
    tomorrowTempLow : double
   flags { readonly}  
   default {[ 0.0 ]}
   slotfacets{[ BFacets.makeNumeric(BUnit.getUnit("celsius"),1,-40,40)]}
   
    tomorrowWind : String
   flags { readonly}  
   default {[ "" ]}
   
     fullInfo : String
   flags { readonly, hidden}     
      default {[ "" ]}
   
    worker: BDemoWorker
    flags { readonly, hidden}
    default {[ new BDemoWorker() ]}
    
    failCause : String
   flags { readonly, hidden}     
      default {[ "" ]}
    
  
  
  }
  
  actions
  {
   query()
   flags { async }
  }
  }
  -*/

  /* + ------------ BEGIN BAJA AUTO GENERATED CODE ------------ + */
  /* @ $com.novar.weather.BNovarWeather(213260752)1.0$ @ */
  /* Generated Mon Sep 25 15:29:40 CST 2017 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

  ////////////////////////////////////////////////////////////////
  // Property "city"
  ////////////////////////////////////////////////////////////////

  /**
   * Slot for the <code>city</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#getCity
   * @see com.novar.weather.BNovarWeather#setCity
   */
  public static final Property city = newProperty(Flags.SUMMARY, "\u5317\u4eac", null);

  /**
   * Get the <code>city</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#city
   */
  public String getCity()
  {
    return getString(city);
  }

  /**
   * Set the <code>city</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#city
   */
  public void setCity(String v)
  {
    setString(city, v, null);
  }

  ////////////////////////////////////////////////////////////////
  // Property "statusOK"
  ////////////////////////////////////////////////////////////////

  /**
   * Slot for the <code>statusOK</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#getStatusOK
   * @see com.novar.weather.BNovarWeather#setStatusOK
   */
  public static final Property statusOK = newProperty(Flags.SUMMARY | Flags.READONLY, true, null);

  /**
   * Get the <code>statusOK</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#statusOK
   */
  public boolean getStatusOK()
  {
    return getBoolean(statusOK);
  }

  /**
   * Set the <code>statusOK</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#statusOK
   */
  public void setStatusOK(boolean v)
  {
    setBoolean(statusOK, v, null);
  }

  ////////////////////////////////////////////////////////////////
  // Property "APPCODE"
  ////////////////////////////////////////////////////////////////

  /**
   * Slot for the <code>APPCODE</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#getAPPCODE
   */
  public static final Property APPCODE = newProperty(0, "", null);

  /**
   * Get the <code>APPCODE</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#APPCODE
   */
  public String getAPPCODE()
  {
    return getString(APPCODE);
  }

  /**
   * Set the <code>APPCODE</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#APPCODE
   */
  public void setAPPCODE(String v)
  {
    setString(APPCODE, v, null);
  }

  ////////////////////////////////////////////////////////////////
  // Property "lastFailCause"
  ////////////////////////////////////////////////////////////////

  /**
   * Slot for the <code>lastFailCause</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#getLastFailCause
   * @see com.novar.weather.BNovarWeather#setLastFailCause
   */
  public static final Property lastFailCause = newProperty(Flags.READONLY, "", null);

  /**
   * Get the <code>lastFailCause</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#lastFailCause
   */
  public String getLastFailCause()
  {
    return getString(lastFailCause);
  }

  /**
   * Set the <code>lastFailCause</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#lastFailCause
   */
  public void setLastFailCause(String v)
  {
    setString(lastFailCause, v, null);
  }

  ////////////////////////////////////////////////////////////////
  // Property "lastUpdateTime"
  ////////////////////////////////////////////////////////////////

  /**
   * Slot for the <code>lastUpdateTime</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#getLastUpdateTime
   * @see com.novar.weather.BNovarWeather#setLastUpdateTime
   */
  public static final Property lastUpdateTime = newProperty(Flags.READONLY, BAbsTime.NULL, null);

  /**
   * Get the <code>lastUpdateTime</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#lastUpdateTime
   */
  public BAbsTime getLastUpdateTime()
  {
    return (BAbsTime) get(lastUpdateTime);
  }

  /**
   * Set the <code>lastUpdateTime</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#lastUpdateTime
   */
  public void setLastUpdateTime(BAbsTime v)
  {
    set(lastUpdateTime, v, null);
  }

  ////////////////////////////////////////////////////////////////
  // Property "todayWeather"
  ////////////////////////////////////////////////////////////////

  /**
   * Slot for the <code>todayWeather</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#getTodayWeather
   * @see com.novar.weather.BNovarWeather#setTodayWeather
   */
  public static final Property todayWeather = newProperty(Flags.READONLY, "", null);

  /**
   * Get the <code>todayWeather</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#todayWeather
   */
  public String getTodayWeather()
  {
    return getString(todayWeather);
  }

  /**
   * Set the <code>todayWeather</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#todayWeather
   */
  public void setTodayWeather(String v)
  {
    setString(todayWeather, v, null);
  }

  ////////////////////////////////////////////////////////////////
  // Property "todayTempHi"
  ////////////////////////////////////////////////////////////////

  /**
   * Slot for the <code>todayTempHi</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#getTodayTempHi
   * @see com.novar.weather.BNovarWeather#setTodayTempHi
   */
  public static final Property todayTempHi =
      newProperty(Flags.READONLY, 0.0, BFacets.makeNumeric(UnitDatabase.getUnit("celsius"), 1));

  /**
   * Get the <code>todayTempHi</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#todayTempHi
   */
  public double getTodayTempHi()
  {
    return getDouble(todayTempHi);
  }

  /**
   * Set the <code>todayTempHi</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#todayTempHi
   */
  public void setTodayTempHi(double v)
  {
    setDouble(todayTempHi, v, null);
  }

  ////////////////////////////////////////////////////////////////
  // Property "todayTempLow"
  ////////////////////////////////////////////////////////////////

  /**
   * Slot for the <code>todayTempLow</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#getTodayTempLow
   * @see com.novar.weather.BNovarWeather#setTodayTempLow
   */
  public static final Property todayTempLow =
      newProperty(Flags.READONLY, 0.0, BFacets.makeNumeric(UnitDatabase.getUnit("celsius"), 1));

  /**
   * Get the <code>todayTempLow</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#todayTempLow
   */
  public double getTodayTempLow()
  {
    return getDouble(todayTempLow);
  }

  /**
   * Set the <code>todayTempLow</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#todayTempLow
   */
  public void setTodayTempLow(double v)
  {
    setDouble(todayTempLow, v, null);
  }

  ////////////////////////////////////////////////////////////////
  // Property "todayWind"
  ////////////////////////////////////////////////////////////////

  /**
   * Slot for the <code>todayWind</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#getTodayWind
   * @see com.novar.weather.BNovarWeather#setTodayWind
   */
  public static final Property todayWind = newProperty(Flags.READONLY, "", null);

  /**
   * Get the <code>todayWind</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#todayWind
   */
  public String getTodayWind()
  {
    return getString(todayWind);
  }

  /**
   * Set the <code>todayWind</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#todayWind
   */
  public void setTodayWind(String v)
  {
    setString(todayWind, v, null);
  }

  ////////////////////////////////////////////////////////////////
  // Property "tomorrowWeather"
  ////////////////////////////////////////////////////////////////

  /**
   * Slot for the <code>tomorrowWeather</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#getTomorrowWeather
   * @see com.novar.weather.BNovarWeather#setTomorrowWeather
   */
  public static final Property tomorrowWeather = newProperty(Flags.READONLY, "", null);

  /**
   * Get the <code>tomorrowWeather</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#tomorrowWeather
   */
  public String getTomorrowWeather()
  {
    return getString(tomorrowWeather);
  }

  /**
   * Set the <code>tomorrowWeather</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#tomorrowWeather
   */
  public void setTomorrowWeather(String v)
  {
    setString(tomorrowWeather, v, null);
  }

  ////////////////////////////////////////////////////////////////
  // Property "tomorrowTempHi"
  ////////////////////////////////////////////////////////////////

  /**
   * Slot for the <code>tomorrowTempHi</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#getTomorrowTempHi
   * @see com.novar.weather.BNovarWeather#setTomorrowTempHi
   */
  public static final Property tomorrowTempHi =
      newProperty(Flags.READONLY, 0.0, BFacets.makeNumeric(UnitDatabase.getUnit("celsius"), 1));

  /**
   * Get the <code>tomorrowTempHi</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#tomorrowTempHi
   */
  public double getTomorrowTempHi()
  {
    return getDouble(tomorrowTempHi);
  }

  /**
   * Set the <code>tomorrowTempHi</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#tomorrowTempHi
   */
  public void setTomorrowTempHi(double v)
  {
    setDouble(tomorrowTempHi, v, null);
  }

  ////////////////////////////////////////////////////////////////
  // Property "tomorrowTempLow"
  ////////////////////////////////////////////////////////////////

  /**
   * Slot for the <code>tomorrowTempLow</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#getTomorrowTempLow
   * @see com.novar.weather.BNovarWeather#setTomorrowTempLow
   */
  public static final Property tomorrowTempLow =
      newProperty(Flags.READONLY, 0.0, BFacets.makeNumeric(UnitDatabase.getUnit("celsius"), 1));

  /**
   * Get the <code>tomorrowTempLow</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#tomorrowTempLow
   */
  public double getTomorrowTempLow()
  {
    return getDouble(tomorrowTempLow);
  }

  /**
   * Set the <code>tomorrowTempLow</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#tomorrowTempLow
   */
  public void setTomorrowTempLow(double v)
  {
    setDouble(tomorrowTempLow, v, null);
  }

  ////////////////////////////////////////////////////////////////
  // Property "tomorrowWind"
  ////////////////////////////////////////////////////////////////

  /**
   * Slot for the <code>tomorrowWind</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#getTomorrowWind
   * @see com.novar.weather.BNovarWeather#setTomorrowWind
   */
  public static final Property tomorrowWind = newProperty(Flags.READONLY, "", null);

  /**
   * Get the <code>tomorrowWind</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#tomorrowWind
   */
  public String getTomorrowWind()
  {
    return getString(tomorrowWind);
  }

  /**
   * Set the <code>tomorrowWind</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#tomorrowWind
   */
  public void setTomorrowWind(String v)
  {
    setString(tomorrowWind, v, null);
  }

  ////////////////////////////////////////////////////////////////
  // Property "fullInfo"
  ////////////////////////////////////////////////////////////////

  /**
   * Slot for the <code>fullInfo</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#getFullInfo
   * @see com.novar.weather.BNovarWeather#setFullInfo
   */
  public static final Property fullInfo = newProperty(Flags.READONLY | Flags.HIDDEN, "", null);

  /**
   * Get the <code>fullInfo</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#fullInfo
   */
  public String getFullInfo()
  {
    return getString(fullInfo);
  }

  /**
   * Set the <code>fullInfo</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#fullInfo
   */
  public void setFullInfo(String v)
  {
    setString(fullInfo, v, null);
  }

  ////////////////////////////////////////////////////////////////
  // Property "worker"
  ////////////////////////////////////////////////////////////////

  /**
   * Slot for the <code>worker</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#getWorker
   * @see com.novar.weather.BNovarWeather#setWorker
   */
  public static final Property worker =
      newProperty(Flags.READONLY | Flags.HIDDEN, new BDemoWorker(), null);

  /**
   * Get the <code>worker</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#worker
   */
  public BDemoWorker getWorker()
  {
    return (BDemoWorker) get(worker);
  }

  /**
   * Set the <code>worker</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#worker
   */
  public void setWorker(BDemoWorker v)
  {
    set(worker, v, null);
  }

  ////////////////////////////////////////////////////////////////
  // Property "failCause"
  ////////////////////////////////////////////////////////////////

  /**
   * Slot for the <code>failCause</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#getFailCause
   * @see com.novar.weather.BNovarWeather#setFailCause
   */
  public static final Property failCause = newProperty(Flags.READONLY | Flags.HIDDEN, "", null);

  /**
   * Get the <code>failCause</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#failCause
   */
  public String getFailCause()
  {
    return getString(failCause);
  }

  /**
   * Set the <code>failCause</code> property.
   * 
   * @see com.novar.weather.BNovarWeather#failCause
   */
  public void setFailCause(String v)
  {
    setString(failCause, v, null);
  }

  ////////////////////////////////////////////////////////////////
  // Action "query"
  ////////////////////////////////////////////////////////////////

  /**
   * Slot for the <code>query</code> action.
   * 
   * @see com.novar.weather.BNovarWeather#query()
   */
  public static final Action query = newAction(Flags.ASYNC, null);

  /**
   * Invoke the <code>query</code> action.
   * 
   * @see com.novar.weather.BNovarWeather#query
   */
  public void query()
  {
    invoke(query, null, null);
  }

  ////////////////////////////////////////////////////////////////
  // Type
  ////////////////////////////////////////////////////////////////

  public Type getType()
  {
    return TYPE;
  }

  public static final Type TYPE = Sys.loadType(BNovarWeather.class);

  /* + ------------ END BAJA AUTO GENERATED CODE -------------- + */

  public static final Log logger = Log.getLog("novarWeather");

  public void doQuery() throws ParserConfigurationException, SAXException, DOMException,
                        ParseException, org.xml.sax.SAXException, IOException
  {
    // attributions
    URL url = null;
    // SimpleDateFormat format1 = new SimpleDateFormat ("yyyy-MM-dd");
    // SimpleDateFormat format2 = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");

    // Baidu weather API
    // http://api.map.baidu.com/telematics/v3/weather?location=%E5%8C%97%E4%BA%AC&output=json&ak=DTHvg4xD3HGjwShqp9sWtR8zlDkrdUCw
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

    // use Baidu APPCODE
    String add = "http://api.map.baidu.com/telematics/v3/weather?location=" + getCity() +
        "&output=xml&ak=" + getAPPCODE();
    InputStream in = null;
    try
    {
      url = new URL(add);



    // use online xml reading
    // BufferedReader in = null;
    // try
    // {
    //
    // in = new BufferedReader( new InputStreamReader(url.openStream()));
    // logger.trace("url reading"+BAbsTime.now());
    // }
    // catch (IOException e)
    // {
    // logger.trace(e.toString()+BAbsTime.now());
    // setStatusOK(false);
    // setLastFailCause(e.toString()) ;
    //
    // }
    // finally {
    // if (in != null)
    // {in.close(); }
    // }
    DocumentBuilder db = dbf.newDocumentBuilder();
    logger.trace("url reading" + BAbsTime.now());
    in=url.openStream();
    Document document = db.parse(in);

    // parser xml file
    // Document document = db.parse("src/com/novar/weather/weather.xml");

    NodeList errorlist = document.getElementsByTagName("error");

    NodeList statuslist = document.getElementsByTagName("status");
    // NodeList datelist=document.getElementsByTagName("date");
    // Date date= format1.parse(datelist.item(0).getTextContent());
    NodeList resultlist = document.getElementsByTagName("results").item(0).getChildNodes();
    NodeList weatherlist = resultlist.item(3).getChildNodes();
    // NodeList indexlist = resultlist.item(5).getChildNodes();

    // get error , normal=0
    // System.out.println("error:"+errorlist.item(0).getTextContent());
    // get status,normal=success
    // System.out.println("status:"+statuslist.item(0).getTextContent());
    if (errorlist.item(0).getTextContent().indexOf("0") < 0 ||
        statuslist.item(0).getTextContent().indexOf("success") < 0)
    {
      setStatusOK(false);
      setLastFailCause("get xml fail code" + errorlist.item(0).getTextContent());
    }

    // System.out.println("date:"+format1.format(date));

    // set weather data

    // get city
    // System.out.println("city:"+resultlist.item(1).getTextContent());

    List<String> weathers = new ArrayList<String>();
    weathers.add(weatherlist.item(7).getTextContent());
    weathers.add(weatherlist.item(19).getTextContent());
    weathers.add(weatherlist.item(31).getTextContent());
    weathers.add(weatherlist.item(43).getTextContent());
//    System.out.println(weathers.get(0));
//    System.out.println(weathers.get(1));
//    System.out.println(weathers.get(2));
//    System.out.println(weathers.get(3));
    List<String> temperatures = new ArrayList<String>();
    temperatures.add(weatherlist.item(11).getTextContent());
    temperatures.add(weatherlist.item(23).getTextContent());
    temperatures.add(weatherlist.item(35).getTextContent());
    temperatures.add(weatherlist.item(47).getTextContent());
//    System.out.println(temperatures.get(0));
//    System.out.println(temperatures.get(1));
//    System.out.println(temperatures.get(2));
//    System.out.println(temperatures.get(3));
    List<String> winds = new ArrayList<String>();
    winds.add(weatherlist.item(9).getTextContent());
    winds.add(weatherlist.item(21).getTextContent());
    winds.add(weatherlist.item(33).getTextContent());
    winds.add(weatherlist.item(45).getTextContent());
//    System.out.println(winds.get(0));
//    System.out.println(winds.get(1));
//    System.out.println(winds.get(2));
//    System.out.println(winds.get(3));
    String[] temp1 = temperatures.get(0).split("~");
    String[] temp2 = temperatures.get(1).split("~");
    // get date
    setLastUpdateTime(BAbsTime.now());
    setStatusOK(true);
    setLastFailCause("");
    setTodayWeather(weathers.get(0));
    setTodayTempHi(Double.parseDouble(temp1[0].trim()));
    setTodayTempLow(getNum(temp1[1]));
    setTodayWind(winds.get(0));
    setTomorrowWeather(weathers.get(1));
    setTomorrowTempHi(Double.parseDouble(temp2[0]));
    setTomorrowTempLow(getNum(temp2[1]));
    setTomorrowWind(winds.get(1));
    }
    catch (Exception e)
    {
      logger.trace(e.toString() + BAbsTime.now());
      setStatusOK(false);
      setLastFailCause(e.toString());
    }
    finally
    {
      if(in != null) in.close();
    }
    
  }

  public static double getNum(String args)
  {

    String str = args.trim();
    String str2 = "";
    if (str != null && !"".equals(str))
    {
      for (int i = 0; i < str.length(); i++)
      {
        if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
        {
          str2 += str.charAt(i);
        }
      }
    }
    return Double.parseDouble(str2);
  }

  // private BTimeZone timeZone = null;
  //
  // private void setTimeZone(BTimeZone tz)
  // {
  // this.timeZone = tz;
  // }

  public IFuture post(Action action, BValue argument, Context cx)
  {
    getWorker().postAsync(new Invocation(this, action, argument, cx));
    return null;
  }
  // BIcon addIcon = BIcon.std("cloud.png");
}