public interface Calculatable {
    default int sum(int a, int b){
        return sumALl(a,b);
    }
    default int sum(int a, int b,int c){
        return sumALl(a,b,c);
    }


    private int sumALl(int... values){
        int result = 0;
        for (int i : values){
            result += i;
        }
        return result;
    }
}
