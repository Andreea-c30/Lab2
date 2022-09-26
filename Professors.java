public class Professors{  
    //private data members  
    private String name, surname;  
    private int working_hours, p_h;
    private boolean permanent;  
    
    //getter method for name  
    public String getName(){  
      return name;  
    }  
    //setter method for name  
    public void setName(String name){  
      this.name=name ; 
    }  
    //getter method for surname  
     public String getSurname(){  
      return surname;  
    }  
    //setter method for surname  
    public void setSurname(String surname){  
      this.surname=surname ; 
    }  
     //getter method for permanent  
     public boolean getPermanent(){  
      return permanent;  
    }  
    //setter method for permanent  
    public void setPermanent(boolean permanent){  
      this.permanent=permanent ; 
    }  
    //getter method for working_hours  
    public int getWorking_hours(){  
      return working_hours;  
    }  
    //setter method for working_hours  
    public void setWorking_hours(int working_hours){  
      this.working_hours=working_hours ; 
    }  
    //getter method for price per hour  
    public int getP_h(){  
      return p_h;  
    }  
    //setter method for price per hour  
    public void setP_h(int p_h){  
      this.p_h=p_h ; 
    } 

}  