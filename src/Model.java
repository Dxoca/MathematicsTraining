import java.util.ArrayList;
import java.util.Scanner;

/**
 * 各种小的常用模块
 */
public class Model {
    /**
     * 默认构造函数
     */
    Model() {

    }

    /**
     * 个人信息及菜单输出:
     * <p>
     * 数学计算能力训练系统
     * <p>
     * 学号：XXXX		姓名：XXX
     * <p>
     * 1--加法	2--减法	3--除法	4--乘法	 0--退出
     * <p>
     * 请输入训练的项目：
     *
     * @param title   项目标题
     * @param classID 学号
     * @param name    姓名
     */
    public void menu(String title, String classID, String name) {
        String head = title + "\n\n学号：" + classID + "\t\t姓名：" + name;
        String algorithm = "1--加法\t2--减法\t3--乘法\t4--除法\t 0--退出";
        System.out.print(head + "\n\n" + algorithm + "\n\n");
    }

    /**
     * 选择训练的项目
     * 1：加法 2:减法 3：乘法 4：除法 0：退出
     *
     * @param way
     */
    public void switchAlgorithm(int way) {
        Scanner cin = new Scanner(System.in);
        double ans;
        switch (way) {
            //exit
            case 0:
                System.out.println("谢谢使用！");
                System.exit(0);//正常退出
                break;
            //sum
            case 1:
                Algorithm sum = new Sum();//多态
                sum.CreateProblems();//输出题目
                //输入答案规范
                try {
                    ans = cin.nextInt();//输入答案
                    boolean isAns = sum.checkAns(ans);//检测
                    if (isAns) {
                        sum.getProblemsAndAns();//输出题目及答案
                        System.out.println(" √");
                        Main.list.add(sum.toString() + (int) sum.getAns() + " √");//记录做题数据
                        Main.isTrue++;
                    } else {//包括-1 这样是因为 有可能-1也是结果
                        if (ans == -1) {
                            Main.flag = false;//结束外部循环
                            return;
                        }
                        System.out.println("错 正确答案:" + sum.getAns());
                        Main.list.add(sum.toString() + ans + " X" + "  正确答案："+(int) sum.getAns());//记录做题数据
                    }
                } catch (Exception e) {
                    e = new Exception("答案格式输入错误");
                    System.out.println(e.getMessage());
                }
                break;
            //sub
            case 2:
                Algorithm sub = new Sub();//多态
                sub.CreateProblems();//输出题目
                //输入答案规范
                try {
                    ans = cin.nextInt();//输入答案
                    boolean isAns = sub.checkAns(ans);//检测
                    if (isAns) {//先判断答案是否合格
                        sub.getProblemsAndAns();//输出题目及答案
                        System.out.println(" √");
                        Main.list.add(sub.toString() + (int) sub.getAns() + " √");//记录做题数据
                    } else {//包括-1 这样是因为 有可能-1也是结果
                        if (ans == -1) {
                            Main.flag = false;//结束外部循环
                            return;
                        }
                        System.out.println("错 正确答案:" + sub.getAns());
                        Main.list.add(sub.toString() + ans + " X" + "  正确答案："+(int) sub.getAns());//记录做题数据
                    }
                } catch (Exception e) {
                    e = new Exception("答案格式输入错误");
                    System.out.println(e.getMessage());
                }
                break;
            //mul
            case 3:
                Algorithm mul = new Mul();//多态
                mul.CreateProblems();//输出题目
                //输入答案规范
                try {
                    ans = cin.nextInt();//输入答案
                    boolean isAns = mul.checkAns(ans);//检测
                    if (isAns) {
                        mul.getProblemsAndAns();//输出题目及答案
                        System.out.println(" √");
                        Main.list.add(mul.toString() + (int) mul.getAns() + " √");//记录做题数据
                    } else {//包括-1 这样是因为 有可能-1也是结果
                        if (ans == -1) {
                            Main.flag = false;//结束外部循环
                            return;
                        }
                        System.out.println("错 正确答案:" + mul.getAns());
                        Main.list.add(mul.toString() + ans + " X" + "  正确答案："+(int) mul.getAns());//记录做题数据
                    }
                } catch (Exception e) {
                    e = new Exception("答案格式输入错误");
                    System.out.println(e.getMessage());
                }
                break;
            case 4://div
                Algorithm div = new Div();//多态
                div.CreateProblems();//输出题目
                //输入答案规范
                try {
                    ans = cin.nextDouble();//输入答案
                    boolean isAns = div.checkAns(ans);//检测
                    if (isAns) {
                        div.getProblemsAndAns();//输出题目及答案
                        System.out.println(" √");
                        Main.list.add(div.toString() + div.getAns() + " √");//记录做题数据 除法不需要转为int
                    } else {//包括-1 这样是因为 有可能-1也是结果
                        if (ans == -1) {
                            Main.flag = false;//结束外部循环
                            return;
                        }
                        System.out.println("错 正确答案:" + div.getAns());
                        Main.list.add(div.toString() + ans + " X" + "  正确答案："+ div.getAns());//记录做题数据
                    }
                } catch (Exception e) {
                    e = new Exception("答案格式输入错误");
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("格式输入错误！");
        }
    }
    /**
     * 生成两个随机数
     *
     * @return [0, 50]的数字
     */

    public int[] randomNumber() {
        int[] nums = new int[2];
        nums[0] = (int) (Math.random() * (51 - 0) + 0);
        nums[1] = (int) (Math.random() * (51 - 0) + 0);
//        System.out.println(Arrays.toString(nums)); 调试
        return nums;
    }

}
