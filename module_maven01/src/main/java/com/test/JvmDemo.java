package com.test;

import sun.misc.Launcher;

/**
 * @author: likai
 * Date: 2023/5/15 0:02
 * Description:
 */
public class JvmDemo {
    public static void main(String[] args) {
        ClassLoader appClassLoader = Launcher.getLauncher().getClassLoader();
        ClassLoader extClassLoader = appClassLoader.getParent();
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();

        System.out.println("bootstrapClassLoader = " + bootstrapClassLoader);
        System.out.println("extClassLoader = " + extClassLoader);
        System.out.println("appClassLoader = " + appClassLoader);
    }
}
