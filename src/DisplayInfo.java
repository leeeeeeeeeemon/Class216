public interface DisplayInfo {
    void displayInfo();

    default void print(){
        System.out.println("что-то");
    }

    int OPEN = 1;
    int CLOSE = 0;


    int critChance = 13;
}
