public class Cat extends Animal {
    public void update_cat_color(){
        color="White";
    }
    public void setColor(String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }
    public void speak(){
        System.out.println("meowing");
    }
}
