public class TodoMain {
    public static void main(String[] args) {

        TodoList myTodos = new TodoList();

        myTodos.add("dododo");
        myTodos.add("whatap");
        myTodos.add("Etesd meg a horcsogot te nyommer!");

        System.out.println(myTodos.toString());
        myTodos.setComplete(1);
        System.out.println(myTodos.toString());
        myTodos.updateDesc(1, "dododododo");
        System.out.println(myTodos.toString());

    }
}
