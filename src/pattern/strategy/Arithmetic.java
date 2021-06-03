package pattern.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Arithmetic {

    private static Map<String, BasicArithmetic> map = new HashMap<>();

    static {
        map.put("+", new Adder());
        map.put("-",new Substractor());
        map.put("*", new Multiplier());
        map.put("/", new Divider());
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String exp = reader.readLine();

        String[] arr = exp.split("");
        int left = Integer.valueOf(arr[0]);
        String symbol = arr[1];
        int right = Integer.valueOf(arr[2]);

        System.out.println(left + symbol + right);

        if(!map.containsKey(symbol)){ throw new IllegalArgumentException(String.format("%s is not supported.", symbol));}

        BasicArithmetic arithmetic = map.get(symbol);
        float result = arithmetic.calculate(left,right);
        System.out.println(result);


    }
}
