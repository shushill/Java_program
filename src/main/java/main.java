import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

void func2(int i){
    System.out.println(i);
}

public int func(){
    int x = 9;
    func2(x);
    return 5;
}

void main(){

    int x = func();
    System.out.println(x);
}