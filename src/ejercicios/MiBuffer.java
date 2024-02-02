package ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MiBuffer { //en este caso el BufferReader funciona exactamente igual a un escaner para este código, sin embargo en el codigo de pildoras (https://www.youtube.com/watch?v=YCCE4sbmWrw) funciona obteniendo informacion desde un archivo externo.


        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            List<List<Integer>> arr = new ArrayList<>();

            IntStream.range(0, 6).forEach(i -> {
                try {
                    arr.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                    .map(Integer::parseInt)
                                    .collect(toList())
                    );
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            bufferedReader.close();
        }

    }

