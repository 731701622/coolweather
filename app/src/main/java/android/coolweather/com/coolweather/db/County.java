package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lenovo on 2018/12/14.
 */

public class County extends DataSupport
{
    private int id;

    private String countyName;

    private String weatherId;

    private int cityId;

    public int GetId()
    {
        return id;
    }

    public void SetId(int id)
    {
        this.id = id;
    }

    public String GetCountyName()
    {
        return countyName;
    }

    public void SetCountyName(String countyName)
    {
        this.countyName = countyName;
    }

    public String GetWeatherId()
    {
        return weatherId;
    }

    public void SetWeatherId(String weatherId)
    {
        this.weatherId = weatherId;
    }

    public int GetCityId()
    {
        return cityId;
    }

    public void SetCityId(int cityId)
    {
        this.cityId = cityId;
    }
}
