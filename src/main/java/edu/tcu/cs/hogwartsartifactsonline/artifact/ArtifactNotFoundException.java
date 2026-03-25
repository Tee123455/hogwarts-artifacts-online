package edu.tcu.cs.hogwartsartifactsonline.artifact;

public class ArtifactNotFoundException extends RuntimeException{

    public ArtifactNotFoundException(String id){
        super("Cound not find artifact with Id" + id + " :(");
    }

}
