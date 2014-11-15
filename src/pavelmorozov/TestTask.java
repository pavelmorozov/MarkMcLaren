package pavelmorozov;

public class TestTask {
	public static void main(String[] args) {
		Point[] pointArray={
				new Point(-1,0),
				new Point(2,2),
				new Point(1,3),
		};
		
		System.out.println("Question 1:");
		Question1.rectangle(pointArray);
		System.out.println("Question 2: "+Question2.convert(68, 58, 197));
		int [] sourceArray =
			{8, 6, 6, 20, 9, 1, 12, 16, 3, 16, 22, 2};
		System.out.println("Question 3:");
		Question3.percentile(sourceArray);
	}
}
