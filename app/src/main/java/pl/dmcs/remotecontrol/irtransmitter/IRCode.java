package pl.dmcs.remotecontrol.irtransmitter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by charky on 19.08.15.
 */

public class IRCode {

    private int frequency;
    private int[] codes;

    public IRCode() {

    }

    public IRCode(int frequency, int[] codes) {
        this.frequency = frequency;
        this.codes = codes;
    }

    public IRCode(String command) {
        setCode(command);
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int[] getCodes() {
        return codes;
    }

    public String getCodesAsString() {
        return Arrays.toString(codes).replace('[', '{').replace(']', '}');
    }

    public void setCode(String command) {
        List<String> list;
        int frequency;

        list = new ArrayList<String>(Arrays.asList(command.split(" ")));
        list.remove(0); // dummy
        frequency = Integer.parseInt(list.remove(0), 16); // frequency
        list.remove(0); // seq1
        list.remove(0); // seq2

        frequency = (int) (1000000.0f / (frequency * 0.241246));

        this.codes = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.codes[i] = Integer.parseInt(list.get(i), 16) * (1000000 / frequency);
        }

        this.frequency = frequency;
    }

}