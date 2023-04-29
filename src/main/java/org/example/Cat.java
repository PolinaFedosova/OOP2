package org.example;

public class Cat implements Entity{
    public String name;
    int maxLength=50;
    int maxHeight=16;

    public Cat(String name) {
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
