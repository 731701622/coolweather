package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lenovo on 2018/12/14.
 */

public class Province extends DataSupport
{
    private int id;

    private String provinceName;

    private int provinceCode;

    public int GetId()
    {
        return id;
    }

    public void SetId(int id)
    {
        this.id = id;
    }

    public String GetProvinceName()
    {
        return provinceName;
    }

    public void SetProvinceName(String provinceName)
    {
        this.provinceName = provinceName;
    }

    public int GetProvinceCode()
    {
        return provinceCode;
    }

    public void SetProvinceCode(int provinceCode)
    {
        this.provinceCode = provinceCode;
    }
}
