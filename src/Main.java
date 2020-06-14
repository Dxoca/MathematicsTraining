import java.util.*;

public class Main {

    static String title = "数学计算能力训练系统";
    static String classId = "Q987284242";
    static String name = "寒光";
    static String inputError = "输入错误！";
    static String select = "请输入训练的项目：";
    public static boolean flag = true;
    static ArrayList<String> list = new ArrayList();//做题记录 27 + 36 =  63 ✖ ；  38 - 39 =  -1 √
    static double accuracy = 0, isTrue = 0, isFalse = -1;//计算正确率 统计对的个数 错的个数 输入-1中断也包括在里面 所以必须-1

    public static void main(String[] ages) {
        int way;
        Model model = new Model();
        Scanner cin = new Scanner(System.in);
        model.menu(title, classId, name);//菜单输出

        /** 获取当前系统时间*/
        long startTime = System.currentTimeMillis();

        /** 程序运行 processRun();*/
        while (flag) {
            System.out.print(select + "\n");//训练项目 提示
            try {
                way = cin.nextInt();
                model.switchAlgorithm(way);//选择算法,中断判断 加减乘除
            } catch (Exception e) {
                e = new Exception(inputError);
//            throw new Error(e);//抛出异常
                System.out.println(e.getMessage());//输出异常
            }
        }
        /** 获取当前的系统时间，与初始时间相减就是程序运行的毫秒数，除以1000就是秒数*/
        long endTime = System.currentTimeMillis();
        long usedTime = (endTime - startTime) / 1000;
        System.out.println("\n训练结束！ 共计用时：" + usedTime + "秒！\n\n训练记录：\n");
        Iterator it1 = list.iterator();//迭代器
        while (it1.hasNext()) {//遍历ArrayList
            System.out.println(it1.next());
        }
        accuracy = isTrue / (isFalse + isTrue);//计算正确率
        System.out.println("\n" + name + ":正确率：" + accuracy * 100 + "%");
    }
}
