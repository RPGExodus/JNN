package pl.billog_studio.janigdynie_graimprezowa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Pytania_usage {

    String[] baza={"Ja nigdy nie byłem w sex-shopie",
            "Ja nigdy nie pływałem w morzu",
            "Ja nigdy nie byłem w klubie ze striptizem",
            "Ja nigdy nie piłem teqilli"};
    ArrayList<String> pytania=new ArrayList();

    public String WybierzLosowePytanie()
    {
        Random los = new Random();
        return pytania.remove(los.nextInt(pytania.size()));
    }
    public Pytania_usage()
    {
        pytania.addAll(Arrays.asList(baza));
    }
}

