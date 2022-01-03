package projectGameAssignment;

public class Player {

    private String name;
    private int points;


    public Player(String name){
        this.name = name;
        this.points = 0;
    }

    public String getName(){
        return this.name;
    }


    public int getPoints(){
        return this.points;
    }

    public void setPoints(int newPoints){
        int updatePoints = getPoints() + newPoints;
        this.points = updatePoints;
    }

    @Override
    public String toString(){
       return name + " : " + points;

    }



}
