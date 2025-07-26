import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toList;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;


    class Result {

        /*
         * Complete the 'priceCheck' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. STRING_ARRAY products
         *  2. FLOAT_ARRAY productPrices
         *  3. STRING_ARRAY productSold
         *  4. FLOAT_ARRAY soldPrice
         */

        public static int priceCheck(List<String> products, List<Float> productPrices,
                                     List<String> productSold, List<Float> soldPrice) {
            // Write your code here

            HashMap<String, ArrayList<Float>> map = new
                    HashMap<String, ArrayList<Float>>();

            for (int i = 0; i < productSold.size(); i++) {
                String pSold = productSold.get(i);
                if (map.containsKey(pSold)) {
                    ArrayList<Float> list = map.get(pSold);
                    list.add(soldPrice.get(i));
                    map.put(pSold, list);
                } else {
                    ArrayList<Float> list = new ArrayList<Float>();
                    list.add(soldPrice.get(i));
                    map.put(pSold, list);
                }
            }
            HashMap<String, Float> map2 = new HashMap<String, Float>();
            for (int i = 0; i < products.size(); i++) {
                map2.put(products.get(i), productPrices.get(i));
            }

            int error = 0;
            for (Map.Entry<String, Float> map3 : map2.entrySet()) {
                String pName = map3.getKey();
                Float pCost = map3.getValue();
                if (map.containsKey(pName)) {
                    ArrayList<Float> price = map.get(pName);
                    for (int i = 0; i < price.size(); i++) {
                        Float sCost = price.get(i);
                        if (pCost - sCost != 0.0)
                            error++;
                    }
                }
            }
            return error;

        }

    }

    public class Solution {

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int productsCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<String> products = IntStream.range(0, productsCount).mapToObj(i -> {
                        try {
                            return bufferedReader.readLine();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    })
                    .collect(toList());

            int productPricesCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<Float> productPrices = IntStream.range(0, productPricesCount).mapToObj(i -> {
                        try {
                            return bufferedReader.readLine().replaceAll("\\s+$", "");
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    })
                    .map(String::trim)
                    .map(Float::parseFloat)
                    .collect(toList());

            int productSoldCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<String> productSold = IntStream.range(0, productSoldCount).mapToObj(i -> {
                        try {
                            return bufferedReader.readLine();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    })
                    .collect(toList());

            int soldPriceCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<Float> soldPrice = IntStream.range(0, soldPriceCount).mapToObj(i -> {
                        try {
                            return bufferedReader.readLine().replaceAll("\\s+$", "");
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    })
                    .map(String::trim)
                    .map(Float::parseFloat)
                    .collect(toList());

            int result = Result.priceCheck(products, productPrices, productSold, soldPrice);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }


