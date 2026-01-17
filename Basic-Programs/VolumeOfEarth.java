public class VolumeOfEarth{
public static void main(String[] args){
double radiuskilometer = 6378;
double radiusMiles= radiuskilometer*0.21371;
double volumekilometer =(4*3.14*radiuskilometer*radiuskilometer)/3;
double volumeMiles=(4*3.14*radiusMiles*radiusMiles)/3;
System.out.println("The volume of Earth in cubic kilometers is: "+volumekilometer+" and cubic miles is:"+volumeMiles);
}
}
