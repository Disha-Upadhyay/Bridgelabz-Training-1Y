package com.gla;

public class RouteLinkedList<T extends CheckPoint> {
    private Node<T> head;
    public void addCheckpoint(T checkpoint){
        Node<T> newNode = new Node<>(checkpoint);
        if(head == null){
            head = newNode;
        }else{
            Node<T> temp = head;
            while(temp.next != null){
                temp =temp.next;
                temp.next = newNode;
            }
        }
    }
    public boolean removeCheckpoint(String checkPointId) {
        if (head == null) {
            return false;
        }
        if (head.data.getCheckPointId().equals(checkPointId)) {
            head = head.next;
            return true;
        }
        Node<T> temp = head;
        while (temp.next != null) {
            if (temp.next.data.getCheckPointId().equals(checkPointId)) {
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public T findCheckpoint(String checkPointId) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.getCheckPointId().equals(checkPointId))
                return temp.data;
            temp = temp.next;
        }
        return null;
    }

    public double computeTotalDistance() {
        double total = 0;
        Node<T> temp = head;
        while (temp != null) {
            total += temp.data.getDistanceFromLast();
            temp = temp.next;
        }
        return total;
    }

    public double computeTotalPenalty() {
        double total = 0;
        Node<T> temp = head;
        while (temp != null) {
            total += temp.data.calculatePenalty();
            temp = temp.next;
        }
        return total;
    }

    public boolean checkCritical() {
        boolean hasDelivery = false;
        boolean hasFuel = false;

        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.getType().contains("Delivery"))
                hasDelivery = true;
            if (temp.data.getType().contains("Fuel"))
                hasFuel = true;
            temp = temp.next;
        }
        return hasDelivery && hasFuel;
    }

    public void printRoute() {
        Node<T> temp = head;
        int i = 1;
        while (temp != null) {
            System.out.println(i++ + ". " + temp.data);
            temp = temp.next;
        }
    }

}
