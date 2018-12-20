package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lenovo on 2018/12/14.
 */

public class City extends DataSupport
{
    private int id;

    private String cityName;

    private int cityCode;

    private int provinceId;

    public int GetId()
    {
        return id;
    }

    public void SetId(int id)
    {
        this.id = id;
    }

    public String GetCityName()
    {
        return cityName;
    }

    public void SetCityName(String cityName)
    {
        this.cityName = cityName;
    }

    public int GetCityCode()
    {
        return cityCode;
    }

    public void SetCityCode(int cityCode)
    {
        this.cityCode = cityCode;
    }

    public int GetProvinceId()
    {
        return provinceId;
    }

    public void SetProvinceId(int provinceId)
    {
        this.provinceId = provinceId;
    }
}
