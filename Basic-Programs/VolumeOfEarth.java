public class VolumeOfEarth{
    public static void main(String[] args){
    double radiuskilometer = 6378;
	double radiusMiles = radiuskilometer*0.621371;
	double VolumeKilometer = (4*3.14*radiuskilometer*radiuskilometer*radiuskilometer)/3;
	double VolumeMiles = (4*3.14*radiusMiles*radiusMiles*radiusMiles)/3;
	System.out.println("The volume of Earth in cubic kilometers is :"+VolumeKilometer+" and cubic miles is:"+VolumeMiles);
	}
	}
	