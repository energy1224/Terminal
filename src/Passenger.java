import java.lang.constant.Constable;

public class Passenger {

   private String name;

  private String sex;

   private String ticket;

    public Passenger(String name, String sex, String ticket) {
        this.name = name;
        this.sex = sex;
        this.ticket = ticket;
    }


    @Override
    public String toString() {
        return "Пассажир{" +
                "Имя: "+ name  + " "+
                "Билет: " + ticket  +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String  sex) {
        this.sex = sex;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }







    }

