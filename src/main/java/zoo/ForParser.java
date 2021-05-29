package zoo;

public class ForParser {
    private  String path;
    private  String typeFile;


    public ForParser(String[] argv) {
        String animals = argv[0];
        String[] str;
        str = animals.split("-configfile=");
        str = str[1].split("-configtype=");
        path=str[0];
        typeFile=str[1];
    }
    public String getPath(){
        return path;
    }

    public String getTypeFile(){
        return typeFile;
    }
}
