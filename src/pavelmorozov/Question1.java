package pavelmorozov;

public class Question1 {
	public static void rectangle(Point[] pointArray){
		Point bottomLeft = null;
		Point topRight = null;
		
		for (Point currentPoint:pointArray){
			//First point in array initiate rectangle
			if (bottomLeft == null) {
				bottomLeft = new Point(currentPoint.x, currentPoint.y);
				topRight = new Point(currentPoint.x, currentPoint.y);
				continue;
			}
			
			if (bottomLeft.x>currentPoint.x) bottomLeft.x=currentPoint.x;
			if (bottomLeft.y>currentPoint.y) bottomLeft.y=currentPoint.y;
			if (topRight.x<currentPoint.x) topRight.x=currentPoint.x;
			if (topRight.y<currentPoint.y) topRight.y=currentPoint.y;
		}
		
		System.out.println("Bottom-left: ("+ bottomLeft.x +","+ bottomLeft.y +")");
		System.out.println("Top-right:   ("+ topRight.x +","+ topRight.y +")");
	}
}
