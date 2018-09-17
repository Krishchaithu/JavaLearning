package javaLearning;
import java.util.HashSet;

public class Tea {
public int hashCode(){
	return (int) Math.round(Math.random());
}

public static void main(String[] args) {
	HashSet set = new HashSet();
	for(int i=0; i<20; i++){
		set.add(new Tea());
	}
	System.out.println(set.size());
}
}
