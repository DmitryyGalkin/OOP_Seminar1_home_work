
public class GameMain {

    public static void main(String[] args) {
        // Карта с роботами.
        // Карта имеет nxm, где n и m - положительные целые числа.
        // Должна быть возможность создания робота на какой-то точке на карте.
        // Точка на карте описывается двумя целочисленными координатами.
        // Роботы могут перемещаться по карте вперед.
        // В одной точке не может находиться несколько роботов.

        // HOMEWORK
        // 0. Разобраться с проектом. Подготовить вопросы к следующему семинару, если возникнут.
        // 1. Добавить валидацию параметров при создании карты
        // 2. Реализовать возможность задать ограничение по количеству создаваемых
        // на карте роботов (в конструкторе карты)
        // При этом если параметр не указан, то используем значение по-умолчанию: 5
        // 3*. Реализовать возможность вызова метода move с параметром - количество шагов вперед
        // Подсказка: можно несколько раз вызвать метод #move

        /*
          * * * * *
          * * * * *
          * * * * *
          * * * * *
          * * * * *
        */

        RobotMap map = new RobotMap(10, 10, 3);
        System.out.println();
        RobotMap.Robot robot = map.createRobot(new Point(2, 3));
        System.out.println(robot); // [2, 3], [TOP]
        robot.move();
        robot.move(); 
        RobotMap.Robot robot_2 = map.createRobot(new Point(5, 4));
       // [1, 3], [TOP]
        System.out.println(robot_2);
        RobotMap.Robot robot_3 = map.createRobot(new Point(1, 2));
        System.out.println(robot_3);

        RobotMap.Robot robot_4 = map.createRobot(new Point(5, 5));
        System.out.println(robot_4);

        RobotMap.Robot robot_5= map.createRobot(new Point(6, 6));
        System.out.println(robot_5);
        RobotMap.Robot robot_6= map.createRobot(new Point(7, 7));
        System.out.println(robot_6);
        robot.changeDirection(Direction.BOTTOM);
        robot.move();
 
//      robot.move(5);
        robot.move(); // [3, 3], [BOTTOM]
        robot.changeDirection(Direction.LEFT);
        robot.move();
        System.out.println(robot); // [3, 2], [LEFT] 


    }

}