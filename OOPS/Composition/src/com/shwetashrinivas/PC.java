package com.shwetashrinivas;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard mb;

    public PC(Case theCase, Monitor monitor, Motherboard mb) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.mb = mb;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200,50,"yellow");
    }

//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMb() {
//        return mb;
//    }
}
