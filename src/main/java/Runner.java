public class Runner {
    public static void main(String args[]){
        Planet planet = new Planet("Mercury", 789.2);
        String description1 = String.format("%s is %f", planet.getName(), planet.getSize());
        System.out.println(description1);
        planet.explode();

    }
}
