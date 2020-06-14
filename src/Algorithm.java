/**
 * 四种算法的抽象类 抽出像的部分
 * <p>
 * 公共部分
 * 出题 答案计算 获取题目 获取题目及答案 检查答案
 * 变量 ab 和计算符号
 */
abstract class Algorithm {
    //接口内部封装私有的变量
    private int a, b;//计算数
    private char operator;//运算符
    //需要继承实现

    /**
     * 产生题目
     */
    public abstract void CreateProblems();

    /**
     * 计算两个数的答案
     *
     * @return 运算后的结果
     */
    public abstract double getAns();

    //可以直接调用
    //赋值
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    /**
     * 获取运算符
     *
     * @return
     */
    public char getOperator() {
        return operator;
    }

    /**
     * 设置运算符
     *
     * @param operator
     */
    public void setOperator(char operator) {
        this.operator = operator;
    }

    /**
     * 获取题目及答案
     * 除了除法 都是整数
     * 除法重写
     */
    public void getProblemsAndAns() {
        System.out.print(getA() + " " +
                getOperator() + " " + getB() + " =  " + (int) getAns());
    }

    /**
     * 便于记录做题数据 答案后续自己写入
     *
     * @return
     */
    @Override
    public String toString() {
        return getA() + " " + getOperator() + " " + getB() + " =  ";
    }

    /**
     * 获取题目
     */
    public void getProblems() {
        System.out.print(getA() + " " +
                getOperator() + " " + getB() + " =  ");
    }

    /**
     * 检查答案
     *
     * @param ans
     * @return
     */
    public boolean checkAns(double ans) {
        boolean flag = ans == getAns();
        if (flag) Main.isTrue++;//计算正确率
        else Main.isFalse++;
        return flag;
    }
}
