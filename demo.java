package lab5;

class User {
	int ID;
	String fName;
	String lName;
	date DOB;
	String email;
	int pNumber;
    String register;
    String hotelOrder;
    public User (int ID, String fName, String lName, date DOB, String email, int pNumber, String register, String hotelOrder){
       this.ID=ID;
       this.fName=fName;
       this.lName=lName;
       this.DOB=DOB;
       this.email=email;
       this.pNumber=pNumber;
       this.register=register;
       this.hotelOrder=hotelOrder;
   }
   public void verityLogin() {
   }
   public void setName(String fName, String lName) {
       this.fName=fName;
       this.lName=lName;
   }
   public void verityPassword() {
   }
}
class Hotel {
	int ID;
	String name;
	String address;
    int pNumber;
	String roomInfo;
    String order;
    public Hotel (int ID, String name, String address, int pNumber, String roomInfo, String order){
       this.ID=ID;
       this.name=name;
       this.address=address;
       this.pNumber=pNumber;
       this.roomInfo=roomInfo;
       this.order=order;
    }
    public void totalRent() (
    }
}
class Route {
	int ID;
	String name;
    public Route (int ID, String name){
       this.ID=ID;
       this.name=name;
    }
}
class Natural_beauty {
	int ID;
	String name;
	String info;
    public Natural_beauty (int ID, String name, String info){
       this.ID=ID;
       this.name=name;
        this.info=info
    }
}
public class Demo {
public static void main(String[] args) {
	User user = new User("101","Bayarmaa","Davaatseren","1999-06-01","bayarmaadavaatseren@gmail.com","88538422","KM99060108","1");
    Hotel hotel = new Hotel("1001","GoviSands","Dalanzadgad","70530024","tav tuhtai","1");
    Route route = new Route("01","Southgobi");
    Natural_beauty natural_beauty = new Natural_beauty("001","YoliinAm","aylal");
    Sytem.out.println("Baigaliin uzesgelent gazar:" + natural_beauty.name + "Ochih gazar:" + route.name + "Buudallah buudal:" + hotel.name + "Buudliin zahialga:" + user.hotelOrder);
	}

}





