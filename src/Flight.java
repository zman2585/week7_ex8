/**
 * Created by John on 9/6/2017.
 */
public class Flight {
    private String planeID;
    private String departCode;
    private String destinCode;

    public Flight(String planeID, String departCode, String destinCode){
        this.planeID = planeID;
        this.departCode = departCode;
        this.destinCode = destinCode;

    }

    public String getPlaneID(){
        return this.planeID;
    }

    public String getDepartCode(){
        return this.departCode;
    }

    public String getDestinCode(){
        return this.destinCode;
    }

    @Override
    public String toString(){
        return " (" + departCode + "-" + destinCode + ")";
    }


}
