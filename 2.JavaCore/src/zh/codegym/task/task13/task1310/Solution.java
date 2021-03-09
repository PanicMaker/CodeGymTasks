package zh.codegym.task.task13.task1310;

/* 
未来的经理
*/

public class Solution {
    public static void main(String[] args) {
    }

    interface Person {
        void use(Person person);

        void startToWork();
    }

    interface HasManagementPotential extends Person{
        boolean inspiresOthersToWork();
    }

    interface Secretary extends Person{
    }

    interface Boss extends Person, HasManagementPotential {
    }

    class Manager implements Boss{
        public void use(Person person) {
            person.startToWork();
        }

        public void startToWork() {
        }

        public boolean inspiresOthersToWork() {
            return true;
        }
    }

    class Subordinate implements Secretary{
        public void use(Person person) {
        }

        public void startToWork() {
        }
    }
}
