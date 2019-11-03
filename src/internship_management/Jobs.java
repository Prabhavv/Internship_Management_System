/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internship_management;

/**
 *
 * @author MAHE
 */
class Jobs {
    private int id;
    private String Name;
    private String Company;
    private String Info;
    private String Date;
    
    public Jobs(int id,String Name, String Company,String Info,String Date){
        this.id =id;
        this.Name=Name;
        this.Company=Company;
        this.Info=Info;
    }
    public int getid(){
        return id;
    }
    public String getName(){
        return Name;
    }
    public String getCompany(){
        return Company;
    }
    public String getInfo(){
        return Info;
    }
    public String getDate(){
        return Date;
    }
}
