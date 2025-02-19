package fruitManager;

public class Text {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		FruitDao_imp fruit_imp = new FruitDao_imp();
		while (true) {
		    int item = View.MenuView(); // 调用菜单视图
		    switch (item) {
		        case 0:
		            System.out.println("Exiting the application..."); // Debugging line
		            System.exit(0); // 退出程序
		        case 1:
		            Fruit fruit = View.insertMenuView();
		            boolean insert = fruit_imp.insert(fruit);
		            System.out.println(insert ? "添加成功\n" : "添加失败\n");
		            break; // 结束 case 1 的执行，返回循环开始，将再次显示菜单
		        case 2:
		            Fruit deleteMenuView = View.deleteMenuView();
		            boolean delete = fruit_imp.delete(deleteMenuView);
		            System.out.println(delete ? "删除成功\n" : "删除失败\n");
		            break; // 结束 case 2 的执行
		        case 3:
		            Fruit updateMenuView = View.updateMenuView();
		            boolean update = fruit_imp.update(updateMenuView);
		            System.out.println(update ? "修改成功\n" : "修改失败\n");
		            break; // 结束 case 3 的执行
		        case 4:
		            String selectMenuView = View.SelectMenuView();
		            Fruit select = fruit_imp.select(selectMenuView);
		            View.printFruit(select);
		            break; // 结束 case 4 的执行
		        default:
		            System.out.println("Invalid option. Please try again.");
		            break; // 结束 default 的执行
		    }
		    // 注意：这里没有代码会执行，因为 break 语句会导致循环重新开始，再次调用 View.MenuView()
		}

	}

}
