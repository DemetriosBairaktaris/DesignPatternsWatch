package group4.android.timerproject.model.state;

/**
 * Created by demetribairaktaris on 3/23/16.
 */
public class RunningState implements TimerState {

    private TimerSMStateView sm ;

    public RunningState(TimerSMStateView sm)
    {
        this.sm = sm ;
    }
    @Override
    public void updateView() {

    }

    @Override
    public void onButton() {

    }
}
