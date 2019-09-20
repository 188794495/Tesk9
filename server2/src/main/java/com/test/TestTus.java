package com.test;
import org.apache.tuscany.sca.node.Node;
import org.apache.tuscany.sca.node.NodeFactory;
public class TestTus {
    public static void main(String[] args) {
        Node node = NodeFactory.newInstance().createNode("Calculator.composite");
        node.start();
        System.out.println("服务端启动");
    }
}
