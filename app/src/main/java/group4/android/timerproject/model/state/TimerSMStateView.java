package group4.android.timerproject.model.state;

/**
 * Created by demetribairaktaris on 3/23/16.
 */
public interface TimerSMStateView {
    // transitions
    void toRunningState();  //4 states
    void toStoppedState();
    void toIncrementState();
    void toAlarmState();

    // actions
    void actionInit();
    void actionReset();
    void actionStart();
    void actionStop();
    void actionInc();
    void actionDec();
    void actionUpdateView();

    // state-dependent UI updates
    void updateUIRuntime();

}
