/*
 * Name: Ken Ogihara
 * PID: A16969236
 */

import java.util.*;

/**
 * Tasks Implementation.
 *
 * @author Ken Ogihara
 * @since ${3/17/24}
 */

public class Tasks {

    /**
     * Method that checks for any duplicates in an array of integers.
     * @param entries an array of integers representing customer ID's.
     * @return whether or not there are duplicates.
     */
    public static boolean raffleChecker(int[] entries) {
        LinkedList<Integer> output = new LinkedList<>();
        for (int i = 0; i < entries.length; i++) {
            if (!output.contains(entries[i])) {
                (output).add(entries[i]);
            }
            else {
                return true;
            }
        }
        return false;
    }

    // List Node class provided for reference
    public static class Node {
        Node next;
        String name;
        public Node(String name) {
            this.name = name;
        }
    }

    /**
     * Method that finds the middle element of a Singly Linked List.
     * @param head node
     * @return string that represents the key of the middle node.
     */
    public static String middleNode(Node head) {
        if (head.next == null) {
            throw new NullPointerException("list is empty");
        }
        else {
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.name;
        }
    }

    /**
     * Method that checks if a new string can be printed with just the letters from an old string.
     *
     * @param newMessage a string.
     * @param oldMessage a string.
     * @return whether or not the new string can be constructed with just the letters of the old
     * string.
     */
    public static boolean canConstruct(String newMessage, String oldMessage) {

    }

    /** Method that returns a list of the most loyal customers given an integer k.
     * Question D
     * @param buyers an array of strings of people who bought tickets in the last month.
     * @param k an integer.
     * @return an array of strings that contains the most loyal customers.
     */
    public static String[] frequentCustomers(String[] buyers, int k) {

    }


}
