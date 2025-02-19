package fruitManager;

import java.math.BigDecimal;
import java.util.Scanner;

public class View {//ˮ��������
	private static Scanner sc = new Scanner(System.in);
	@SuppressWarnings("resource")
	public static int MenuView() {
		System.out.println("!������������-��ӭ��������ˮ��������ϵͳ������������������");
		System.out.println("!������������������������� �� ʾ �� �� ������������������������!");
		 Scanner scanner = new Scanner(System.in);
		 int option = -1;
	        while (option < 0 || option > 4) {
	            System.out.println("!������������������������� �� ʾ �� �� ������������������������!");
	            System.out.println("!��������������������1������ӿ��ˮ����Ϣ��������������������!");
	            System.out.println("!��������������������2����ɾ�����ˮ����Ϣ��������������������!");
	    		System.out.println("!��������������������3�����޸Ŀ��ˮ����Ϣ ��������������������!");
	    		System.out.println("!��������������������4������ѯ���ˮ����Ϣ��������������������!");
	    		System.out.println("!��������������������0������                     ����������������������!");
	    		System.out.println("!��������������������������������������������������������������������!");
	            System.out.print("����������ѡ��0-4����");
	            String input = scanner.nextLine();
	            try {
	                option = Integer.parseInt(input);
	                if (option < 0 || option > 4) {
	                    System.out.println("��Ч��ѡ�������һ������ 0 �� 4 ֮������֡�");
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("������Ч��������һ�����֡�");
	            }
	        }
	        return option;
	}

	//���
	public static Fruit insertMenuView() {
		System.out.println("�������ʾ������");
		System.out.println("������Ҫ��ӵ�ˮ����ţ�");
		int id = sc.nextInt();
		 sc.nextLine(); // ���ĵ�nextInt()���µĻ��з�
		System.out.println("������Ҫ��ӵ�ˮ�����ƣ�");
		String name = sc.nextLine();
		System.out.println("������Ҫ��ӵ�ˮ�����ࣺ");
		String type = sc.nextLine();
		System.out.println("������Ҫ��ӵ�ˮ�����ۣ�");
		BigDecimal price = sc.nextBigDecimal();
		System.out.println("������Ҫ��ӵ�ˮ��������");
		int quantity = sc.nextInt();
		return new Fruit(id,name,type,price,quantity);
	}
	//1.ɾ��������ˮ����ţ�
	public static Fruit deleteMenuView() {
		System.out.println("�������ʾ������");
		System.out.println("������Ҫɾ����ˮ����ţ�");
		int deleteId = sc.nextInt();
		 sc.nextLine(); // ���ĵ�nextInt()���µĻ��з�
		return new Fruit(deleteId);
	}
	//2.�޸ģ�����ˮ������޸Ŀ�棩
	public static Fruit updateMenuView() {
		System.out.println("�������ʾ������");
		System.out.println("������Ҫ�޸ĵ�ˮ����ţ�");
		int updateId = sc.nextInt();
		 sc.nextLine(); // ���ĵ�nextInt()���µĻ��з�
		System.out.println("������ñ�ŵ�ˮ�����Ϊ��");
		int updateQuantity = sc.nextInt();
		 sc.nextLine(); // ���ĵ�nextInt()���µĻ��з�
		return new Fruit(updateId,updateQuantity);
	}
	//3.��ѯ������ˮ�����ƣ�
	public static String SelectMenuView() {
		System.out.println("�������ʾ������");
		System.out.println("������Ҫ��ѯ��ˮ������:");
		String name = sc.nextLine();
		return name;
	}
	//4.�����ѯ���
	public static void printFruit(Fruit fruit) {
		System.out.print("��ţ�"+fruit.getId()+"\t\t");
		System.out.print("���ƣ�"+fruit.getName()+"\t\t");
		System.out.print("���ࣺ"+fruit.getType()+"\t");
		System.out.print("���ۣ�"+fruit.getPrice()+"Ԫ/��\t\t");
		System.out.print("������"+fruit.getQuantity()+"��\n");
	}
}