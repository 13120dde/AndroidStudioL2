package a13_12solutions.howtol2;

/**
 * Created by Patrik Lind on 2017-09-09.
 */

class Instruction {

    private String whatToDo;
    private String content;

    public Instruction(String whatToDo, String content) {
        this.whatToDo=whatToDo;
        this.content=content;
    }

    public String getWhatToDo() {
        return whatToDo;
    }

    public String getContent(){
        return content;
    }
}
