package sample.controller;

import sample.view.SampleFrame;

public class SampleAppController {
    private SampleFrame appFrame;

    public void start() {
        appFrame = new SampleFrame(this);
    }
}
