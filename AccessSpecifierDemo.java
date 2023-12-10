package org.example.java.lang.examples.accessspecifier;

public class AccessSpecifierDemo {

    public Integer assignMe;
    private String restrictMe;
    protected Double intermediate;
    Float nothingSpecified;

    public AccessSpecifierDemo(String restrictMe){
        this.restrictMe = restrictMe;
    }

    public void displayAll(){
        System.out.println("""
                assignMe: %d, restrictMe: %s, intermediate: %s, nothingSpecified: %f"""
                .formatted(assignMe, restrictMe, intermediate, nothingSpecified));
    }

    protected void displayFromProtected(){
        System.out.println("""
                This display also contains data from "%s" """.formatted(returnPrivate()));
    }

    private String returnPrivate(){return "Private";}

    String tryToInvoke(){
        return "from method with default accessspecifier.";
    }
}
