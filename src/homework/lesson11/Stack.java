package homework.lesson11;

public class Stack {
    private int stck[] = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }
    void push(int item) {
        if (tos == 9) {
            System.out.println("Ստեքը լցվաժ է։");

        } else {
            stck[++tos] = item;

        }

        {


            if (tos < 0) {
                System.out.println("Ստեքը լցվաժ չէ։");
                return;


            } else {

            }
        }


        class TestStack {
            public static void main(String[] args) {
                Stack mystack = new Stack();
                Stack mystack2 = new Stack();
                for (int i = 0; i <10 ; i++) mystack.push(i);
                for (int i = 0; i <20 ; i++) mystack2.push(i);
                System.out.println("Ստեքը mystack2-ում է");
                for (int i = 0; i <10 ; i++)
                    System.out.println(mystack2);
            }
            }
        }
    }


