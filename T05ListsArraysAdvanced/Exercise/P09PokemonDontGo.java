package T05ListsArraysAdvanced.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> pokemons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;

        while (pokemons.size() != 0) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index <= pokemons.size() - 1) {
                int catchedPokemon = pokemons.get(index);
                pokemons.remove(index);
                sum = sum + catchedPokemon;

                for (int i = 0; i < pokemons.size(); i++) {
                    int currentPokemon = pokemons.get(i);
                    if (currentPokemon <= catchedPokemon) {
                        int biggerPokemon = currentPokemon + catchedPokemon;
                        pokemons.set(i, biggerPokemon);

                    } else if (currentPokemon > catchedPokemon) {
                        int smallerPokemon = currentPokemon - catchedPokemon;
                        pokemons.set(i, smallerPokemon);
                    }
                }

            } else if (index < 0) {
                int firstPokemon = pokemons.get(0);
                pokemons.remove(0);
                int lastPokemon = pokemons.get(pokemons.size() - 1);
                pokemons.add(0, lastPokemon);

                for (int i = 0; i < pokemons.size(); i++) {
                    int currentPokemon = pokemons.get(i);
                    if (currentPokemon <= firstPokemon) {
                        int biggerPokemon = currentPokemon + firstPokemon;
                        pokemons.set(i, biggerPokemon);

                    } else if (currentPokemon > firstPokemon) {
                        int smallerPokemon = currentPokemon - firstPokemon;
                        pokemons.set(i, smallerPokemon);
                    }
                }
                sum = sum + firstPokemon;

            } else if (index > pokemons.size() - 1) {
                int lastPokemon = pokemons.get(pokemons.size() - 1);
                pokemons.remove(pokemons.size() - 1);
                int firstPokemon = pokemons.get(0);
                pokemons.add(pokemons.size(), firstPokemon);

                for (int i = 0; i < pokemons.size(); i++) {
                    int currentPokemon = pokemons.get(i);
                    if (currentPokemon <= lastPokemon) {
                        int biggerPokemon = currentPokemon + lastPokemon;
                        pokemons.set(i, biggerPokemon);

                    } else if (currentPokemon > lastPokemon) {
                        int smallerPokemon = currentPokemon - lastPokemon;
                        pokemons.set(i, smallerPokemon);
                    }
                }
                sum = sum + lastPokemon;
            }
        }
        System.out.println(sum);
    }
}
