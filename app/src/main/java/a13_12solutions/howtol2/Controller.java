package a13_12solutions.howtol2;

import android.content.res.Resources;
import android.media.Image;

/**
 * Created by Patrik Lind on 2017-09-09.
 */

public class Controller {

    private HowToActivity ui;
    private Instruction[] instructions = new Instruction[3];
    private int[] images= new int[3];
    private int index = 0;

    public Controller(HowToActivity ui){
        this.ui=ui;
        initiateResources();
    }

    private void initiateResources() {
        Resources res = ui.getResources();
        String whatToDo = res.getString(R.string.what_to_do);
        String content = res.getString(R.string.content);
        instructions[0] = new Instruction(whatToDo, content);
        instructions[1] = new Instruction(res.getString(R.string.what_to_do2), res.getString(R.string.content2));
        instructions[2] = new Instruction(res.getString(R.string.what_to_do3), res.getString(R.string.content3));
        images[0]=R.drawable.confessionbear;
        images[1]=R.drawable.panda;
        images[2]=R.drawable.panda2;
    }

    public void previousClick(){
        index--;
        if(index<0){
            index = instructions.length-1;
        }
        ui.setWhatToDo(instructions[index].getWhatToDo());
        ui.setContent(instructions[index].getContent());
        ui.setImage(images[index]);
    }

    public void nextClick(){
        index++;
        if(index>=instructions.length){
            index = 0;
        }

        ui.setWhatToDo(instructions[index].getWhatToDo());
        ui.setContent(instructions[index].getContent());
        ui.setImage(images[index]);

    }
}
