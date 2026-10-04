package oops.composition;

public class Engine {
    String type;

    Engine(String type){
        this.type = type;
    }

    void start(){
        System.out.printf("The %s engine is start\n",type);
    }
}
