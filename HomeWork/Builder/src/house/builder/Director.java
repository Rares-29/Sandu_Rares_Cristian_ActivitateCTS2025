package house.builder;

import anunt.AnuntBuilder;

public class Director {

    // The director in the builder design pattern is relevant in GOF version
    // because we can combine a set of steps together and in which order do we want
    // And we abtract more the process of construction, because client code calls only the method create from here
    // Is useful when we have an input(RTF) that needs to be converted in multiple steps into a format, we need
    // to call only the convert methods, with only one param and needs to result a converted format
    // But in case of a builder step by step of a normal case, not necessarily util
    public void createHouse(HouseBuilder anuntBuilder) {

    };
}
