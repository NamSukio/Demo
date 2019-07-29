import java.util.Scanner;

class nam{
	public static void main(String[] args){
		int n;
		// Nh?p n t? d?i dòng l?nh
		if(args.length != 1){
			System.out.println("java Score <so hoc sinh>");
			return;
		}
		n = Integer.parseInt(args[0]);
		// Nh?p n ph?n t? c?a m?ng
		String[] names = new String[n];
		double[] scores = new double[n];
		System.out.println("Nhap thong tin ten va diem thi cua " + n + " sinh vien:");
		inputScores(names, scores);
		
		// In n ph?n t? c?a m?ng
		System.out.println("Danh sach diem thi:");
		printScores(names, scores);
		
	}
	
	public static void printScores(String[] names, double[] scores){
		for(int i = 0; i < scores.length; i++){
			System.out.printf("%-20s%8.1f\n", names[i], scores[i]);
		}
	}
	
	public static void inputScores(String[] names, double scores[]){
		Scanner scan1 = new Scanner(System.in), scan2 = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++){
			do{
				System.out.println("Ten sinh vien thu " + (i+1) +":");
				names[i] = scan1.nextLine();
			}while(names[i].compareTo("")==0);

			do{
				System.out.println("Diem thi: ");
				scores[i] = scan2.nextDouble();
				if(scores[i]<0 || scores[i]>10){
					System.out.println("Gia tri khong hop le. Nhap lai:");
				}
				else
					break;
			} while(true);
		}	
	}

}

//Voi cac nut tinh toan
			if(e.getActionCommand() == "+") {
				a = Double.parseDouble(view.getTextArea().getText());
				caseListener = 1;
				view.getTextArea().setText("");
			}
			if(e.getActionCommand() == "-") {
				a = Double.parseDouble(view.getTextArea().getText());
				caseListener = 2;
				view.getTextArea().setText("");
			}
			if(e.getActionCommand() == "*") {
				a = Double.parseDouble(view.getTextArea().getText());
				caseListener = 3;
				view.getTextArea().setText("");
			}
			if(e.getActionCommand() == "/") {
				a = Double.parseDouble(view.getTextArea().getText());
				caseListener = 4;
				view.getTextArea().setText("");
			}
			if(e.getActionCommand() == "=") {
				b = Double.parseDouble(view.getTextArea().getText());
				switch (caseListener) {
				case 1:
					model.addNumber(a, b);
					c = model.getValue();
					break;
				case 2:
					model.subNumber(a, b);
					c = model.getValue();
					break;
				case 3:
					model.multiplyNumber(a, b);
					c = model.getValue();
					break;
				case 4:
					model.divideNumber(a, b);
					c = model.getValue();
					break;
				default: c = 0;
				}
				view.getTextArea().setText(new Double(c).toString());
			}


lblmain = new JLabel("lblmain");
		BufferedImage image = ImageIO.read(new File("D:\\LTHDT\\Ð? tài cu?i kì\\mainframe.png"));
		lblmain.setIcon(new ImageIcon(image.getScaledInstance(798, 415, image.SCALE_SMOOTH)));
		lblmain.setBounds(0, 24, 798, 415);
		contentPane.add(lblmain);