package org.example;

public class Human implements Entity{
    public String name;
    int maxLength=800;
    int maxHeight=12;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String run(int length) {
        if(maxLength<length){
            return name+" не может пробежать такую дистанцию";
        }else{
            return name+" успешно пробежал";
        }

    }

    @Override
    public String jump(int height) {
        if(maxHeight<height){
            return name+" не может столько прыгнуть";
        }else{
            return name+" успешно прыгнул";
        }
    }
}
