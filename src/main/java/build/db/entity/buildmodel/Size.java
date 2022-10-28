package build.db.entity.buildmodel;

public enum Size {
    LENGTH ("Длина"),
    WIDTH ("Ширина"),
    HEIGHT ("Высота"),
    THICKNESS ("Толщина");

    private String name;
    Size(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
