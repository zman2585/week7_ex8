/**
 * Created by John on 9/6/2017.
 */
public class Airplane {
    private String planeID;
    private int planeCap;

    public Airplane(String planeID, int planeCap){
        this.planeID = planeID;
        this.planeCap = planeCap;
    }

    public String getPlaneID(){
        return planeID;
    }

    public int getPlaneCap(){
        return planeCap;
    }

    @Override
    public String toString(){
        return planeID + " (" + planeCap + " ppl)";
    }




}
