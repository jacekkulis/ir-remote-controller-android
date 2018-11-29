package pl.dmcs.remotecontrol.irtransmitter;

public abstract class GenericIRCodes {

    // Vital Buttons
    public static final int IRC_POWER = 100;

    public abstract IRCommand getIRC_POWER();

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

    public static final int IRC_MENU = 312;

    public abstract IRCommand getIRC_MENU();

    public static final int IRC_EXIT = 313;

    public abstract IRCommand getIRC_EXIT();

    public static final int IRC_RETURN = 314;

    public abstract IRCommand getIRC_RETURN();

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
            case IRC_MENU:
                return getIRC_MENU();
            case IRC_EXIT:
                return getIRC_EXIT();
            case IRC_RETURN:
                return getIRC_RETURN();
        }
        return null;
    }

}
