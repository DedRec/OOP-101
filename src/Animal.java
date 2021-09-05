public abstract class Animal {
    protected String color;
    public void setColor(String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }
    public void dispaly_color(){
        System.out.println(color);
    }
    public abstract void speak();
}
