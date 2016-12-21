package edu3;
//Enums restrict a variable to have one of only a few predefined values.
// The values in this enumerated list are called enums.
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