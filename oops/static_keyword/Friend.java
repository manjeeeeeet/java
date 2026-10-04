package oops.static_keyword;

public class Friend {
    static int numOfFriend;
    String name;

    Friend(String name){
        this.name = name;
        numOfFriend++;
        
    }
}
