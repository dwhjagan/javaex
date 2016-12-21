package edu3;

/**
 * Created by janaidu on 21/12/2016.
 */


class enumerator {

    public enum Gender {
        MALE, FEMALE
    }

    public static void main(String[] args) {
        enumerator.Gender m = enumerator.Gender.MALE;
        enumerator.Gender f = enumerator.Gender.FEMALE;
        System.out.println(m);
        System.out.println(f);
    }
}