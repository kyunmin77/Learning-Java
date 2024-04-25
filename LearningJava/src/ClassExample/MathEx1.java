package ClassExample;

import static java.lang.Math.*;
import static java.lang.System.*;

public class MathEx1 {

	public static void main(String[] args) {
		double val = 90.7552;
		out.println("round(" + val + ")=" + round(val)); // round 반올림

		val *= 100;

		out.println("round(" + val + ") = " + round(val)); // round 반올림

		out.println("round(" + val + ")/100 = " + round(val) / 100);
		out.println("round(" + val + ")/100.0 = " + round(val) / 100.0);
		out.println();
		out.println("ceil(" + 1.1 + ") = " + ceil(1.1)); // ceil 올림
		out.println("floor(" + 1.5 + ") = " + floor(1.5)); // floor버림
		out.println("round(" + 1.1 + ") = " + round(1.1)); 
		out.println("round(" + 1.5 + ") = " + round(1.5)); // round 반환값이 int
		out.println("rint(" + 1.5 + ") = " + rint(1.5)); 	//rint 반환값이 double
		out.println("round(" + -1.5 + ") = " + round(-1.5));
		out.println("rint(" + -1.5 + ") = " + rint(-1.5));
		out.println("ceil(" + -1.5 + ") = " + ceil(-1.5));
		out.println("floor(" + -1.5 + ") = " + floor(-1.5));
	}

}
