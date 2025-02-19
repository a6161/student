package fruitManager;

public class Text {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		FruitDao_imp fruit_imp = new FruitDao_imp();
		while (true) {
		    int item = View.MenuView(); // ���ò˵���ͼ
		    switch (item) {
		        case 0:
		            System.out.println("Exiting the application..."); // Debugging line
		            System.exit(0); // �˳�����
		        case 1:
		            Fruit fruit = View.insertMenuView();
		            boolean insert = fruit_imp.insert(fruit);
		            System.out.println(insert ? "��ӳɹ�\n" : "���ʧ��\n");
		            break; // ���� case 1 ��ִ�У�����ѭ����ʼ�����ٴ���ʾ�˵�
		        case 2:
		            Fruit deleteMenuView = View.deleteMenuView();
		            boolean delete = fruit_imp.delete(deleteMenuView);
		            System.out.println(delete ? "ɾ���ɹ�\n" : "ɾ��ʧ��\n");
		            break; // ���� case 2 ��ִ��
		        case 3:
		            Fruit updateMenuView = View.updateMenuView();
		            boolean update = fruit_imp.update(updateMenuView);
		            System.out.println(update ? "�޸ĳɹ�\n" : "�޸�ʧ��\n");
		            break; // ���� case 3 ��ִ��
		        case 4:
		            String selectMenuView = View.SelectMenuView();
		            Fruit select = fruit_imp.select(selectMenuView);
		            View.printFruit(select);
		            break; // ���� case 4 ��ִ��
		        default:
		            System.out.println("Invalid option. Please try again.");
		            break; // ���� default ��ִ��
		    }
		    // ע�⣺����û�д����ִ�У���Ϊ break ���ᵼ��ѭ�����¿�ʼ���ٴε��� View.MenuView()
		}

	}

}
