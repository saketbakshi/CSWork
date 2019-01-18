public class CBT109Driver
{
	public static void main(String[] args) {
		CBT109BakshiSaket tester = new CBT109BakshiSaket(3);

		System.out.println("Volume: " + tester.getVolume());
		System.out.println("SA: " + tester.getSurfaceArea());
		System.out.println("Radius: " + tester.getRadius());

		tester.setRadius(Math.PI);
		System.out.println("Volume: " + tester.getVolume());
		System.out.println("SA: " + tester.getSurfaceArea());
		System.out.println("Radius: " + tester.getRadius());		
	}
}