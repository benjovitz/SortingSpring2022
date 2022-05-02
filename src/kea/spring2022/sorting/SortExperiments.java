package kea.spring2022.sorting;

import java.util.Arrays;

public class SortExperiments {
    public static void main(String[] args) {
        SortExperiments app = new SortExperiments();
        //app.sort1();
        //app.sort2();
        //app.sortBalls1();
        //app.sort3();
        //app.sort4();
        //app.sortBalls2();
        //app.sortBalls3();

        //app.sortPersons1();
        //app.sortPersons2();

        app.sortBalls4();
    }

    public void sort1() {
        int [] tal = {2,5,7,1,3,7,93,1};
        System.out.println("før sortering: "+Arrays.toString(tal));
        Arrays.sort(tal);
        System.out.println("efter sortering: "+Arrays.toString(tal));
    }
    public void sort2() {
        String [] ord = {"bonde","gård","abe","hund","giraf","sten","århus"};
        System.out.println("før sortering: "+Arrays.toString(ord));
        Arrays.sort(ord);
        System.out.println("efter sortering: "+Arrays.toString(ord));
    }

    public void sortBalls1() {
        // Opret array af Ball objekter (med tilfældig brightness)
        Ball[] ballsarray = new Ball[8];
        for(int i=0; i < ballsarray.length; i++) {
            ballsarray[i] = new Ball();
        }
        System.out.println("før sortering: "+Arrays.toString(ballsarray));
        Arrays.sort(ballsarray);
        System.out.println("efter sortering: "+Arrays.toString(ballsarray));

    }

    public void sort3() {
        int[] tal = {1,5,1,2,6,8,6,3,4,8,97};
        QuickSort sorter =new QuickSort();
        sorter.sort(tal);
        System.out.println("efter sortering: "+Arrays.toString(tal));
    }

    public void sort4() {
        QuickSortStrings sorter = new QuickSortStrings();
        String [] ord = {"bonde","gård","abe","hund","giraf","sten","århus"};
        System.out.println("før sortering: "+Arrays.toString(ord));
        sorter.sort(ord);
        System.out.println("efter sortering: "+Arrays.toString(ord));
    }

    public void sortBalls2() {
        // Opret array af Ball objekter (med tilfældig brightness)
        Ball[] ballsarray = new Ball[8];
        for(int i=0; i < ballsarray.length; i++) {
            ballsarray[i] = new Ball();
        }

        QuickSortBalls sorter = new QuickSortBalls();
        System.out.println(Arrays.toString(ballsarray));
        sorter.sort(ballsarray);
        System.out.println(Arrays.toString(ballsarray));


    }

    public void sortBalls3() {
        // Opret array af Ball objekter (med tilfældig brightness)
        Ball[] ballsarray = new Ball[8];
        for(int i=0; i < ballsarray.length; i++) {
            ballsarray[i] = new Ball();
        }
        QuickSortSamlignbar sorter = new QuickSortSamlignbar();
        System.out.println(Arrays.toString(ballsarray));
        sorter.sort(ballsarray);
        System.out.println(Arrays.toString(ballsarray));

    }

    public void sortPersons1() {
        Person[] arr = new Person[3];
        arr[0] = new Person("Hermione", "Granger");
        arr[1] = new Person("Ron", "Weasley");
        arr[2] = new Person("Harry", "Potter");

        System.out.println("Før sortering: " + Arrays.toString(arr));
        QuickSortSamlignbar sorter = new QuickSortSamlignbar();
        sorter.sort(arr);
        System.out.println("Efter sortering: " + Arrays.toString(arr));

    }

    public void sortPersons2() {
        Person[] arr = new Person[3];
        arr[0] = new Person("Hermione", "Granger");
        arr[1] = new Person("Ron", "Weasley");
        arr[2] = new Person("Harry", "Potter");

        System.out.println("Før sortering: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Efter sortering: " + Arrays.toString(arr));

    }

    public void sortBalls4() {
        // Opret array af Ball objekter (med tilfældig brightness)
        Ball[] ballsarray = new Ball[8];
        for(int i=0; i < ballsarray.length; i++) {
            ballsarray[i] = new Ball();
        }

        System.out.println("Før sortering: " + Arrays.toString(ballsarray));
        // TODO: Sorter array af balls med Arrays.sort
        Arrays.sort(ballsarray);

        System.out.println("Efter sortering: " + Arrays.toString(ballsarray));

    }


}
