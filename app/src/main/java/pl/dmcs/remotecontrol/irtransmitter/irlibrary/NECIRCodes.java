package pl.dmcs.remotecontrol.irtransmitter.irlibrary;


import pl.dmcs.remotecontrol.irtransmitter.GenericIRCodes;
import pl.dmcs.remotecontrol.irtransmitter.IRCommand;

public class NECIRCodes extends GenericIRCodes {

    public static final int frequency = 38381;

    public static final int[] BT_CHANNEL_DOWN_codes = new int[]{
            4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 46592
    };

    public IRCommand getIRC_CHANNEL_DOWN() {
        return IRCommand.createIRCommand(frequency, BT_CHANNEL_DOWN_codes);
    }

    public static final int[] BT_CHANNEL_UP_codes = new int[]{
            4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 46592
    };

    public IRCommand getIRC_CHANNEL_UP() {
        return IRCommand.createIRCommand(frequency, BT_CHANNEL_UP_codes);
    }

    public static final int[] BT_EXIT_codes = new int[]{
            4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 46592};

    public IRCommand getIRC_EXIT() {
        return IRCommand.createIRCommand(frequency, BT_EXIT_codes);
    }

    public static final int[] BT_MENU_codes = new int[]{
            4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 46592
    };

    public IRCommand getIRC_MENU() {
        return IRCommand.createIRCommand(frequency, BT_MENU_codes);
    }

    public static final int[] BT_MUTE_codes = new int[]{
            4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 46592
    };

    public IRCommand getIRC_MUTE() {
        return IRCommand.createIRCommand(frequency, BT_MUTE_codes);
    }

    public static final int[] BT_POWER_codes = new int[]{
            4512, 4512, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 1692, 564, 564, 564, 564, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 44268
    };

    public IRCommand getIRC_POWER() {
        return IRCommand.createIRCommand(frequency, BT_POWER_codes);
    }

    public static final int[] BT_PREV_CHANNEL_codes = new int[]{
            9024, 4512, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 38628
    };

    public IRCommand getIRC_PREV_CHANNEL() {
        return IRCommand.createIRCommand(frequency, BT_PREV_CHANNEL_codes);
    }

    public static final int[] BT_RETURN_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 1664, 572, 46592};

    public IRCommand getIRC_RETURN() {
        return IRCommand.createIRCommand(frequency, BT_RETURN_codes);
    }

    public static final int[] BT_SOURCE_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 46592};

    public IRCommand getIRC_SOURCE() {
        return IRCommand.createIRCommand(frequency, BT_SOURCE_codes);
    }

    public static final int[] BT_TOOLS_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 1664, 572, 46592};

    public IRCommand getIRC_TOOLS() {
        return IRCommand.createIRCommand(frequency, BT_TOOLS_codes);
    }

    public static final int[] BT_VOLUME_DOWN_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 46592};

    public IRCommand getIRC_VOLUME_DOWN() {
        return IRCommand.createIRCommand(frequency, BT_VOLUME_DOWN_codes);
    }

    public static final int[] BT_VOLUME_UP_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 46592};

    public IRCommand getIRC_VOLUME_UP() {
        return IRCommand.createIRCommand(frequency, BT_VOLUME_UP_codes);
    }


    public static final int[] BT_HDMI1_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 46592};

    public IRCommand getIRC_HDMI1() {
        return IRCommand.createIRCommand(frequency, BT_HDMI1_codes);
    }
}
