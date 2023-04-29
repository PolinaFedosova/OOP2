package org.example;

public class Robot implements Entity{
    public String name;
    int maxLength=12000;
    int maxHeight=7;

    public Robot(String name) {
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
