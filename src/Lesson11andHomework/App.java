package Lesson11andHomework;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Когда в параметр метода подставляется референс тип данных,
 * в параметр на самом деле подставляют копию референс(копию ссылки на объект),
 * которая перестает существовать по окончании метода.
 */
public class App {

    App app = new App();
    ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("A", "B", "C", "A"));


    }

