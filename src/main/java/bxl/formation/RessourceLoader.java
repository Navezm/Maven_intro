package bxl.formation;

public class RessourceLoader {
    String getRessourceFile(String ressource){
        return getClass().getClassLoader().getResource(ressource).getFile();
    }
}
