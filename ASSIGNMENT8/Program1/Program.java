import java.util.Scanner;

class Employee {
	private final int id;
	private final String name;
	private final double salary;

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
	}
}

interface Stack {
	int STACK_SIZE = 5;

	void push(Employee employee);

	Employee pop();
}

class FixedStack implements Stack {
	private final Employee[] employees = new Employee[STACK_SIZE];
	private int top = -1;

	@Override
	public void push(Employee employee) {
		if (top == employees.length - 1) {
			System.out.println("Stack is full.");
			return;
		}
		employees[++top] = employee;
	}

	@Override
	public Employee pop() {
		if (top == -1) {
			return null;
		}
		Employee employee = employees[top];
		employees[top--] = null;
		return employee;
	}
}

class GrowableStack implements Stack {
	private Employee[] employees = new Employee[STACK_SIZE];
	private int top = -1;

	@Override
	public void push(Employee employee) {
		if (top == employees.length - 1) {
			Employee[] expanded = new Employee[employees.length * 2];
			System.arraycopy(employees, 0, expanded, 0, employees.length);
			employees = expanded;
		}
		employees[++top] = employee;
	}

	@Override
	public Employee pop() {
		if (top == -1) {
			return null;
		}
		Employee employee = employees[top];
		employees[top--] = null;
		return employee;
	}
}

class Tester {
	static void run() {
		Scanner scanner = new Scanner(System.in);
		Stack selectedStack = null;
		boolean running = true;

		while (running) {
			System.out.println("1 -- Choose Fixed Stack");
			System.out.println("2 -- Choose Growable Stack");
			System.out.println("3 -- Push data");
			System.out.println("4 -- Pop data");
			System.out.println("5 -- Exit");
			System.out.print("Enter choice: ");

			if (!scanner.hasNextInt()) {
				System.out.println("Please enter a number from 1 to 5.");
				scanner.nextLine();
				continue;
			}

			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
				case 1:
					if (selectedStack == null) {
						selectedStack = new FixedStack();
						System.out.println("Fixed stack selected.");
					} else {
						System.out.println("A stack has already been selected.");
					}
					break;
				case 2:
					if (selectedStack == null) {
						selectedStack = new GrowableStack();
						System.out.println("Growable stack selected.");
					} else {
						System.out.println("A stack has already been selected.");
					}
					break;
				case 3:
					if (selectedStack == null) {
						System.out.println("NO stack chosen !!!");
					} else {
						System.out.print("Enter employee id: ");
						int id = scanner.nextInt();
						scanner.nextLine();
						System.out.print("Enter employee name: ");
						String name = scanner.nextLine();
						System.out.print("Enter employee salary: ");
						double salary = scanner.nextDouble();
						scanner.nextLine();
						selectedStack.push(new Employee(id, name, salary));
					}
					break;
				case 4:
					if (selectedStack == null) {
						System.out.println("NO stack chosen !!!");
					} else {
						Employee employee = selectedStack.pop();
						System.out.println(employee == null ? "Stack is empty." : employee);
					}
					break;
				case 5:
					running = false;
					break;
				default:
					System.out.println("Invalid choice.");
			}
		}
		scanner.close();
	}
}

public class Program {
	public static void main(String[] args) {
		Tester.run();
	}
}
