package pl.dmcs.remotecontrol.irtransmitter;

import android.app.Activity;
import android.content.Context;
import android.hardware.ConsumerIrManager;

public class IRTransmitter {

    private ConsumerIrManager mCIR;
    private GenericIRCodes genericIRCodes;

    public IRTransmitter(Activity activity, GenericIRCodes genericIRCodes) {
        // Get a reference to the ConsumerIrManager
        mCIR = (ConsumerIrManager) activity.getSystemService(Context.CONSUMER_IR_SERVICE);
        this.genericIRCodes = genericIRCodes;
    }

    public GenericIRCodes getGenericIRCodes() {
        return genericIRCodes;
    }

    public void setGenericIRCodes(GenericIRCodes genericIRCodes) {
        this.genericIRCodes = genericIRCodes;
    }

    public void sendIR(IRCommand irCommand) throws NoIREmitterException, IllegalArgumentException {
        if (!mCIR.hasIrEmitter()) {
            throw new NoIREmitterException("No IR Emitter found");
        }

        if (!irCommand.isFrequencyAndCodesSet()) {
            throw new IllegalArgumentException("Frequency and/or Codes are not set");
        }

        // transmit the pattern
        mCIR.transmit(irCommand.getFrequency(), irCommand.getCodes());
    }

    public class NoIREmitterException extends Exception {
        public NoIREmitterException(String message) {
            super(message);
        }
    }

}
