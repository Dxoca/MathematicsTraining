import java.math.BigDecimal;

/**
 * 加法
 */
class Sum extends Algorithm {

    @Override
    public void CreateProblems() {
        int[] nums = new Model().randomNumber();//获取随机数
        setOperator('+');
        setA(nums[0]);//输入 a
        setB(nums[1]);//输入b
        getProblems();//输出问题
//        System.out.print(getA() + " " +
//                getOperator() + " " + getB() + " =  ");
    }

    @Override
    public double getAns() {
        return getA() + getB();
    }
}

/**
 * 减法
 */
class Sub extends Algorithm {
    @Override
    public void CreateProblems() {
        int[] nums = new Model().randomNumber();//获取随机数
        setOperator('-');
        setA(nums[0]);//输入 a
        setB(nums[1]);//输入b
        getProblems();//输出问题
    }

    @Override
    public double getAns() {
        return getA() - getB();
    }
}

/**
 * 乘法
 */
class Mul extends Algorithm {

    @Override
    public void CreateProblems() {
        int[] nums = new Model().randomNumber();//获取随机数
        setOperator('*');
        setA(nums[0]);//输入 a
        setB(nums[1]);//输入b
        getProblems();//输出问题
    }

    @Override
    public double getAns() {
        return getA() * getB();
    }
}

/**
 * 除法
 */
class Div extends Algorithm {

    @Override
    public void CreateProblems() {
        int[] nums = new Model().randomNumber();//获取随机数
        setOperator('/');
        setA(nums[0]);//输入 a
        setB(nums[1]);//输入b
        getProblems();//输出问题
    }

    @Override
    /**
     * 要转型为double
     * 计算f2 保留两位小数
     */
    public double getAns() {
        double f = (double)getA() / getB();
        BigDecimal f1 = new BigDecimal(f);
        double f2 = f1.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return f2;
    }

    @Override
    /**
     * 重写抽象类方法
     * 获得double值
     */
    public void getProblemsAndAns() {
        System.out.print(getA() + " " +
                getOperator() + " " + getB() + " =  " + getAns());
    }
}

