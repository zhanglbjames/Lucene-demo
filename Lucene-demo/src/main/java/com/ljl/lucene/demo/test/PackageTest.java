package com.ljl.lucene.demo.test;

import org.apache.lucene.LucenePackage;

/**
 * @author zhangshuaishuai@corp.netease.com
 * @date Created on 2020/7/7.
 */
public class PackageTest {

    public static void main(String[] args) {
        Package aPackage = LucenePackage.get();
        System.out.println(aPackage);
    }
}
