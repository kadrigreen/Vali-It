package ee.bcs.valiit.codewars;

public class Employee { // andmetüüp töötaja, mis sisaldab endas nime ja aadressi infot, klass andmete hoidmiseks
    private String name ;
    private String address ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
