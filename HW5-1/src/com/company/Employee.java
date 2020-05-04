package com.company;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    Map map=new HashMap();
    private String Name;
    private String Famly;
    private String FatherName;
    private String Major;
    private String Diploma;
    private String Salary;
    String str1= new String();
    public String getName(){
        return Name;
    }
    public void setName(String name) throws EmployeeExeption{
    if (name.isEmpty()) {
        throw new EmployeeExeption("نام کارمند وارد نشده!!!");
    }
    else
        Name=name;
}
    public String getFamly(){
        return Famly;
    }
    public void setFamly(String famly) throws EmployeeExeption{
        if (famly.isEmpty())
            throw new EmployeeExeption("نام خانوادگی کارمند وارد نشده!!!");
        else
            Famly=famly;
    }
    public String getFatherName(){
        return FatherName;
    }
    public void setFatherName(String fatherName) throws EmployeeExeption{
        if (fatherName.isEmpty())
            throw new EmployeeExeption("نام پدر کارمند وارد نشده!!!");
        else
            FatherName=fatherName;
    }
    public String getMajor(){
        return Major;
    }
    public void setMajor(String major) throws EmployeeExeption{
        if (major.isEmpty())
            throw new EmployeeExeption("رشته تحصیلی کارمند وارد نشده!!!");
        else
            major=major;
    }
    public String getDiploma(){
        return Diploma;
    }
    public void setDiploma(String diploma) throws EmployeeExeption{
        if (diploma.isEmpty())
            throw new EmployeeExeption("مدرک کارمند وارد نشده!!!");
        else
            Diploma=diploma;
    }
    public String getSalary(){
        return Salary;
    }
    public void setSalary(String salary) throws EmployeeExeption{
        if (salary.isEmpty())
            throw new EmployeeExeption("حقوق پیشنهادی کارمند وارد نشده!!!");
        else
            Salary=salary;

    }
    public void Saveinformation(){
        map.put("name",Name);
        map.put("famoly",Famly);
        map.put("fathername",FatherName);
        map.put("major",Major);
        map.put("Diploma",Diploma);
        map.put("salary",Salary);
        System.out.println("<<<<با موفقیت استخدام شد>>>>");
    }

}
