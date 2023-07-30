/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class SmartHomeSystemController {
   SmartHomeSystemObserver [] observers;
   
   public SmartHomeSystemController(){
      observers = new SmartHomeSystemObserver[]{new SpeakerSystem(),new WindowSystem(),new TvSystem()};
   }
   public void setSmartHome(){
       for (SmartHomeSystemObserver observer : observers) {
           observer.update();
       }
   }
}
