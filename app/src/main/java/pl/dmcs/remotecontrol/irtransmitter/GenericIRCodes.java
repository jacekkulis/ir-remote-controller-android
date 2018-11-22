package pl.dmcs.remotecontrol.irtransmitter;

/**
 * Created by charky on 27.09.15.
 */
public abstract class GenericIRCodes {

    // Vital Buttons
    public static final int IRC_POWER = 100;

    public abstract IRCommand getIRC_POWER();

    // Number Buttons
    public static final int IRC_0 = 110;

    public abstract IRCommand getIRC_0();

    public static final int IRC_1 = 111;

    public abstract IRCommand getIRC_1();

    public static final int IRC_2 = 112;

    public abstract IRCommand getIRC_2();

    public static final int IRC_3 = 113;

    public abstract IRCommand getIRC_3();

    public static final int IRC_4 = 114;

    public abstract IRCommand getIRC_4();

    public static final int IRC_5 = 115;

    public abstract IRCommand getIRC_5();

    public static final int IRC_6 = 116;

    public abstract IRCommand getIRC_6();

    public static final int IRC_7 = 117;

    public abstract IRCommand getIRC_7();

    public static final int IRC_8 = 118;

    public abstract IRCommand getIRC_8();

    public static final int IRC_9 = 119;

    public abstract IRCommand getIRC_9();

    // Plus, Minus, Mute Buttons
    public static final int IRC_CHANNEL_UP = 211;

    public abstract IRCommand getIRC_CHANNEL_UP();

    public static final int IRC_CHANNEL_DOWN = 212;

    public abstract IRCommand getIRC_CHANNEL_DOWN();

    public static final int IRC_VOLUME_UP = 221;

    public abstract IRCommand getIRC_VOLUME_UP();

    public static final int IRC_VOLUME_DOWN = 222;

    public abstract IRCommand getIRC_VOLUME_DOWN();

    public static final int IRC_MUTE = 223;

    public abstract IRCommand getIRC_MUTE();

    //Menu Navigation Buttons
    public static final int IRC_ENTER = 311;

    public abstract IRCommand getIRC_ENTER();

    public static final int IRC_MENU = 312;

    public abstract IRCommand getIRC_MENU();

    public static final int IRC_EXIT = 313;

    public abstract IRCommand getIRC_EXIT();

    public static final int IRC_ARROW_UP = 321;

    public abstract IRCommand getIRC_ARROW_UP();

    public static final int IRC_ARROW_DOWN = 322;

    public abstract IRCommand getIRC_ARROW_DOWN();

    public static final int IRC_ARROW_LEFT = 323;

    public abstract IRCommand getIRC_ARROW_LEFT();

    public static final int IRC_ARROW_RIGHT = 324;

    public abstract IRCommand getIRC_ARROW_RIGHT();

    //Extra Buttons
    public static final int IRC_GUIDE = 411;

    public abstract IRCommand getIRC_GUIDE();

    public static final int IRC_INFORMATION = 412;

    public abstract IRCommand getIRC_INFORMATION();

    //Non Basic IRCodes
    public abstract IRCommand getCustomCommand(String irCommandName);

    public abstract String[] getCustomCommandNames();

    /**
     * This is a generic Function to get the IRCommand by ID
     *
     * @param ircIDNumber The IRC-ID, a static final int of the class GenericIRCodes
     * @return IRCommand Object containing the Codes and Frequency
     */
    public IRCommand getIRC(int ircIDNumber) {
        switch (ircIDNumber) {
            case IRC_POWER:
                return getIRC_POWER();
            case IRC_0:
                return getIRC_0();
            case IRC_1:
                return getIRC_1();
            case IRC_2:
                return getIRC_2();
            case IRC_3:
                return getIRC_3();
            case IRC_4:
                return getIRC_4();
            case IRC_5:
                return getIRC_5();
            case IRC_6:
                return getIRC_6();
            case IRC_7:
                return getIRC_7();
            case IRC_8:
                return getIRC_8();
            case IRC_9:
                return getIRC_9();
            case IRC_CHANNEL_UP:
                return getIRC_CHANNEL_UP();
            case IRC_CHANNEL_DOWN:
                return getIRC_CHANNEL_DOWN();
            case IRC_VOLUME_UP:
                return getIRC_VOLUME_UP();
            case IRC_VOLUME_DOWN:
                return getIRC_VOLUME_DOWN();
            case IRC_MUTE:
                return getIRC_MUTE();
            case IRC_ENTER:
                return getIRC_ENTER();
            case IRC_MENU:
                return getIRC_MENU();
            case IRC_EXIT:
                return getIRC_EXIT();
            case IRC_ARROW_UP:
                return getIRC_ARROW_UP();
            case IRC_ARROW_DOWN:
                return getIRC_ARROW_DOWN();
            case IRC_ARROW_LEFT:
                return getIRC_ARROW_LEFT();
            case IRC_ARROW_RIGHT:
                return getIRC_ARROW_RIGHT();
            case IRC_GUIDE:
                return getIRC_GUIDE();
            case IRC_INFORMATION:
                return getIRC_INFORMATION();
        }
        return null;
    }

}
