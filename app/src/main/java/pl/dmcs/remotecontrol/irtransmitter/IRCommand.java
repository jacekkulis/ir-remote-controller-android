package pl.dmcs.remotecontrol.irtransmitter;

public class IRCommand {

    private int frequency = 0;
    private int[] codes;

    public IRCommand() {

    }

    public IRCommand(int frequency, int[] codes) {
        this.frequency = frequency;
        this.codes = codes;
    }

    public int getFrequency() {
        return frequency;
    }

    public int[] getCodes() {
        return codes;
    }

    public boolean isFrequencyAndCodesSet() {
        if (frequency <= 0) {
            return false;
        }
        if (codes == null || codes.length == 0) {
            return false;
        }
        return true;
    }

    public static IRCommand createIRCommand(int frequency, int[] codes) {
        return new IRCommand(frequency, codes);
    }

}
