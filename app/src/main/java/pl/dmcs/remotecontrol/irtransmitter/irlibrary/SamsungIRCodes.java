package pl.dmcs.remotecontrol.irtransmitter.irlibrary;


import pl.dmcs.remotecontrol.irtransmitter.GenericIRCodes;
import pl.dmcs.remotecontrol.irtransmitter.IRCommand;

public class SamsungIRCodes extends GenericIRCodes {

    public static final int BT_ARROW_DOWN_frequency = 38380;
    public static final int[] BT_ARROW_DOWN_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 46592};

    public IRCommand getIRC_ARROW_DOWN() {
        return IRCommand.createIRCommand(BT_ARROW_DOWN_frequency, BT_ARROW_DOWN_codes);
    }

    public static final int BT_ARROW_LEFT_frequency = 38380;
    public static final int[] BT_ARROW_LEFT_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 46592};

    public IRCommand getIRC_ARROW_LEFT() {
        return IRCommand.createIRCommand(BT_ARROW_LEFT_frequency, BT_ARROW_LEFT_codes);
    }

    public static final int BT_ARROW_RIGHT_frequency = 38380;
    public static final int[] BT_ARROW_RIGHT_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 46592};

    public IRCommand getIRC_ARROW_RIGHT() {
        return IRCommand.createIRCommand(BT_ARROW_RIGHT_frequency, BT_ARROW_RIGHT_codes);
    }

    public static final int BT_ARROW_UP_frequency = 38380;
    public static final int[] BT_ARROW_UP_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 46592};

    public IRCommand getIRC_ARROW_UP() {
        return IRCommand.createIRCommand(BT_ARROW_UP_frequency, BT_ARROW_UP_codes);
    }

    public static final int BT_CHANNEL_DOWN_frequency = 38380;
    public static final int[] BT_CHANNEL_DOWN_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 46592};

    public IRCommand getIRC_CHANNEL_DOWN() {
        return IRCommand.createIRCommand(BT_CHANNEL_DOWN_frequency, BT_CHANNEL_DOWN_codes);
    }

    public static final int BT_CHANNEL_UP_frequency = 38380;
    public static final int[] BT_CHANNEL_UP_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 46592};

    public IRCommand getIRC_CHANNEL_UP() {
        return IRCommand.createIRCommand(BT_CHANNEL_UP_frequency, BT_CHANNEL_UP_codes);
    }

    public static final int BT_EXIT_frequency = 38380;
    public static final int[] BT_EXIT_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 46592};

    public IRCommand getIRC_EXIT() {
        return IRCommand.createIRCommand(BT_EXIT_frequency, BT_EXIT_codes);
    }

    public static final int BT_MENU_frequency = 38380;
    public static final int[] BT_MENU_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 46592};

    public IRCommand getIRC_MENU() {
        return IRCommand.createIRCommand(BT_MENU_frequency, BT_MENU_codes);
    }

    public static final int BT_MUTE_frequency = 38380;
    public static final int[] BT_MUTE_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 46592};

    public IRCommand getIRC_MUTE() {
        return IRCommand.createIRCommand(BT_MUTE_frequency, BT_MUTE_codes);
    }

    public static final int BT_POWER_frequency = 38380;
    public static final int[] BT_POWER_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 46592};

    public IRCommand getIRC_POWER() {
        return IRCommand.createIRCommand(BT_POWER_frequency, BT_POWER_codes);
    }

    public static final int BT_PREV_CHANNEL_frequency = 38380;
    public static final int[] BT_PREV_CHANNEL_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 46592};

    public IRCommand getIRC_PREV_CHANNEL() {
        return IRCommand.createIRCommand(BT_PREV_CHANNEL_frequency, BT_PREV_CHANNEL_codes);
    }

    public static final int BT_RETURN_frequency = 38380;
    public static final int[] BT_RETURN_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 1664, 572, 46592};

    public IRCommand getIRC_RETURN() {
        return IRCommand.createIRCommand(BT_RETURN_frequency, BT_RETURN_codes);
    }

    public static final int BT_SOURCE_frequency = 38380;
    public static final int[] BT_SOURCE_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 46592};

    public IRCommand getIRC_SOURCE() {
        return IRCommand.createIRCommand(BT_SOURCE_frequency, BT_SOURCE_codes);
    }


    public static final int BT_TOOLS_frequency = 38380;
    public static final int[] BT_TOOLS_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 1664, 572, 46592};

    public IRCommand getIRC_TOOLS() {
        return IRCommand.createIRCommand(BT_TOOLS_frequency, BT_TOOLS_codes);
    }

    public static final int BT_VOLUME_DOWN_frequency = 38380;
    public static final int[] BT_VOLUME_DOWN_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 46592};

    public IRCommand getIRC_VOLUME_DOWN() {
        return IRCommand.createIRCommand(BT_VOLUME_DOWN_frequency, BT_VOLUME_DOWN_codes);
    }

    public static final int BT_VOLUME_UP_frequency = 38380;
    public static final int[] BT_VOLUME_UP_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 46592};

    public IRCommand getIRC_VOLUME_UP() {
        return IRCommand.createIRCommand(BT_VOLUME_UP_frequency, BT_VOLUME_UP_codes);
    }

    public static final int BT_AV1_frequency = 38380;
    public static final int[] BT_AV1_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 46592};

    public IRCommand getIRC_AV1() {
        return IRCommand.createIRCommand(BT_AV1_frequency, BT_AV1_codes);
    }

    public static final int BT_COMPONENT1_frequency = 38380;
    public static final int[] BT_COMPONENT1_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 46592};

    public IRCommand getIRC_COMPONENT1() {
        return IRCommand.createIRCommand(BT_COMPONENT1_frequency, BT_COMPONENT1_codes);
    }

    public static final int BT_HDMI1_frequency = 38380;
    public static final int[] BT_HDMI1_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 46592};

    public IRCommand getIRC_HDMI1() {
        return IRCommand.createIRCommand(BT_HDMI1_frequency, BT_HDMI1_codes);
    }


    public static final int BT_POWER_OFF_frequency = 38380;
    public static final int[] BT_POWER_OFF_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 46592};

    public IRCommand getIRC_POWER_OFF() {
        return IRCommand.createIRCommand(BT_POWER_OFF_frequency, BT_POWER_OFF_codes);
    }

    public static final int BT_POWER_ON_frequency = 38380;
    public static final int[] BT_POWER_ON_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 46592};

    public IRCommand getIRC_POWER_ON() {
        return IRCommand.createIRCommand(BT_POWER_ON_frequency, BT_POWER_ON_codes);
    }

    public static final int BT_TOGGLE_ACTIVE_INPUT_frequency = 38380;
    public static final int[] BT_TOGGLE_ACTIVE_INPUT_codes = new int[]{4446, 4446, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 1664, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 572, 572, 1664, 572, 572, 572, 1664, 572, 1664, 572, 1664, 572, 572, 572, 46592};

    public IRCommand getIRC_TOGGLE_ACTIVE_INPUT() {
        return IRCommand.createIRCommand(BT_TOGGLE_ACTIVE_INPUT_frequency, BT_TOGGLE_ACTIVE_INPUT_codes);
    }

    public IRCommand getCustomCommand(String irCommandName) {
        switch (irCommandName) {

            case "BT_PREV_CHANNEL":
                return getIRC_PREV_CHANNEL();
            case "BT_NEXT_CHANNEL":
                return getIRC_PREV_CHANNEL();
            case "BT_RETURN":
                return getIRC_RETURN();
            case "BT_SOURCE":
                return getIRC_SOURCE();
            case "BT_TOOLS":
                return getIRC_TOOLS();
            case "BT_AV1":
                return getIRC_AV1();
            case "BT_COMPONENT1":
                return getIRC_COMPONENT1();
            case "BT_HDMI1":
                return getIRC_HDMI1();
            case "BT_POWER_OFF":
                return getIRC_POWER_OFF();
            case "BT_POWER_ON":
                return getIRC_POWER_ON();
            case "BT_TOGGLE_ACTIVE_INPUT":
                return getIRC_TOGGLE_ACTIVE_INPUT();
        }
        return null;
    }
}
