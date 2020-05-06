package lib;
import java.util.Scanner;

public abstract class Converter {
	protected double ratio;
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString()+"�� "+getDestString()+"(��)�� �ٲߴϴ�.");
		System.out.print(getSrcString()+"��(��) �Է��ϼ���>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ���: "+res+getDestString()+"�Դϴ�");
		scanner.close();
	}
}
