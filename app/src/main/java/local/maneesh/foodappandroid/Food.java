package local.maneesh.foodappandroid;

public class Food {

    private String name;
    private String description;
    private int imageID;

    public static final Food[] foods = {
            new Food("Pizza", "Thin Crust Pizza with extra cheese.", R.drawable.pizza),
            new Food("Burger", "Thin Crust Pizza with extra cheese.", R.drawable.burger),
            new Food("Sandwich", "Thin Crust Pizza with extra cheese.", R.drawable.sandwich),
    };

    public Food(String name, String description, int imageID){
        this.name = name;
        this.description = description;
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageId(){
        return imageID;
    }

    @Override
//    public String toString() {
//        return "local.maneesh.foodappandroid.Food{" +
//                "name='" + name + '\'' +
//                ", description='" + description + '\'' +
//                '}';
//    }

    public String toString(){
        return this.name;
    }

}
