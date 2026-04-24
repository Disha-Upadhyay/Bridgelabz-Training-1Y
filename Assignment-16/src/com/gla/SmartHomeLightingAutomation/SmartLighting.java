package com.gla.SmartHomeLightingAutomation;

public class SmartLighting {
    public static void main(String[] args) {


        LightAction motionTrigger = () -> {
            System.out.println("Motion detected:Lights ON");
        };

        LightAction voiceTrigger=()->{
            System.out.println("Voice detected:Party lights activated");
        };

        LightAction nightTrigger= () -> {
            System.out.println("Night mode:Lights dimmed");
        };

        activateLight(motionTrigger);
        activateLight(voiceTrigger);
        activateLight(nightTrigger);

    }
    static void activateLight(LightAction action){
        action.execute();
    }
}
