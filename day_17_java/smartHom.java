package lambdaEx;
interface Light {
    void on();
}

public class smartHom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Light motion = () -> System.out.println("Light ON: Motion detected");
	        Light night = () -> System.out.println("Light ON: Night time");
	        Light voice = () -> System.out.println("Light ON: Voice command");

	        motion.on();
	        night.on();
	        voice.on();

	}

}
