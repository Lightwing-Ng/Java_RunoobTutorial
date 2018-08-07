package com.lightwing.ch05_Modifier;

/**
 * @ClassName InstanceCounter
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/7, 14:29
 * @Version 1.0
 **/
public class InstanceCounter {
    private static int numInstances = 0;

    private static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    private InstanceCounter() {
        InstanceCounter.addInstance();
    }

    public static void main(String[] arguments) {
        System.out.println("Starting with " +
                InstanceCounter.getCount() + " instances");
        for (int i = 0; i < 500; ++i)
            new InstanceCounter();

        System.out.println("Created " +
                InstanceCounter.getCount() + " instances");
    }
}
