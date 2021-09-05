public class Dog extends Animal {
    public void update_dog_color(){
        color="Brown";
    }
    public void setColor(String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }
    @Override
    public void speak() {
        System.out.println("barking");
    }
}
