package fruitManager;

import java.math.BigDecimal;
import java.util.Scanner;

public class View {//水果库存管理
	private static Scanner sc = new Scanner(System.in);
	@SuppressWarnings("resource")
	public static int MenuView() {
		System.out.println("!——————-欢迎进入鑫鑫水果库存管理系统————————！");
		System.out.println("!——————————请根据 提 示 进 行 操作——————————!");
		 Scanner scanner = new Scanner(System.in);
		 int option = -1;
	        while (option < 0 || option > 4) {
	            System.out.println("!——————————请根据 提 示 进 行 操作——————————!");
	            System.out.println("!——————————1——添加库存水果信息——————————!");
	            System.out.println("!——————————2——删除库存水果信息——————————!");
	    		System.out.println("!——————————3——修改库存水果信息 ——————————!");
	    		System.out.println("!——————————4——查询库存水果信息——————————!");
	    		System.out.println("!——————————0——退                     出——————————!");
	    		System.out.println("!——————————————————————————————————!");
	            System.out.print("请输入您的选择（0-4）：");
	            String input = scanner.nextLine();
	            try {
	                option = Integer.parseInt(input);
	                if (option < 0 || option > 4) {
	                    System.out.println("无效的选项，请输入一个介于 0 到 4 之间的数字。");
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("输入无效，请输入一个数字。");
	            }
	        }
	        return option;
	}

	//添加
	public static Fruit insertMenuView() {
		System.out.println("请根据提示操作：");
		System.out.println("请输入要添加的水果编号：");
		int id = sc.nextInt();
		 sc.nextLine(); // 消耗掉nextInt()留下的换行符
		System.out.println("请输入要添加的水果名称：");
		String name = sc.nextLine();
		System.out.println("请输入要添加的水果种类：");
		String type = sc.nextLine();
		System.out.println("请输入要添加的水果单价：");
		BigDecimal price = sc.nextBigDecimal();
		System.out.println("请输入要添加的水果数量：");
		int quantity = sc.nextInt();
		return new Fruit(id,name,type,price,quantity);
	}
	//1.删除（根据水果编号）
	public static Fruit deleteMenuView() {
		System.out.println("请根据提示操作：");
		System.out.println("请输入要删除的水果编号：");
		int deleteId = sc.nextInt();
		 sc.nextLine(); // 消耗掉nextInt()留下的换行符
		return new Fruit(deleteId);
	}
	//2.修改（根据水果编号修改库存）
	public static Fruit updateMenuView() {
		System.out.println("请根据提示操作：");
		System.out.println("请输入要修改的水果编号：");
		int updateId = sc.nextInt();
		 sc.nextLine(); // 消耗掉nextInt()留下的换行符
		System.out.println("请输入该编号的水果库存为：");
		int updateQuantity = sc.nextInt();
		 sc.nextLine(); // 消耗掉nextInt()留下的换行符
		return new Fruit(updateId,updateQuantity);
	}
	//3.查询（根据水果名称）
	public static String SelectMenuView() {
		System.out.println("请根据提示操作：");
		System.out.println("请输入要查询的水果名字:");
		String name = sc.nextLine();
		return name;
	}
	//4.输出查询结果
	public static void printFruit(Fruit fruit) {
		System.out.print("编号："+fruit.getId()+"\t\t");
		System.out.print("名称："+fruit.getName()+"\t\t");
		System.out.print("种类："+fruit.getType()+"\t");
		System.out.print("单价："+fruit.getPrice()+"元/斤\t\t");
		System.out.print("数量："+fruit.getQuantity()+"斤\n");
	}
}