//package SeanQueue;

import org.junit.Test;

import java.lang.Integer;

import static org.junit.Assert.assertEquals;
public class TestQueue {
    @Test
    public void addItemToQueue() {
        SeanQueue<Integer> testQueue = new SeanQueue<Integer>();
        int toAdd = 1;
        testQueue.enqueue(toAdd);
    }

    @Test
    public void dequeueFollowsFifoPrinciples(){
        SeanQueue<String> testQueue = new SeanQueue<String>();
        String firstIn = "one";
        String secondIn = "two";
        String thirdIn = "three";

        testQueue.enqueue(firstIn);
        testQueue.enqueue(secondIn);
        testQueue.enqueue(thirdIn);

        Object firstOut = testQueue.dequeue();
        Object secondOut = testQueue.dequeue();
        Object thirdOut = testQueue.dequeue();

        assertEquals("First out should be same as first in", firstIn, firstOut);
        assertEquals("First out should be same as first in", secondIn, secondOut);
        assertEquals("First out should be same as first in", thirdIn, thirdOut);
    }

    @Test
    public void isEmptyShouldReturnTrueIfEmpty(){
        SeanQueue<String> testQueue = new SeanQueue<String>();

        String firstIn = "one";
        testQueue.enqueue(firstIn);

        assertEquals("isEmpty should return false when queue has element", false, testQueue.isEmpty());

        testQueue.dequeue();

        assertEquals("isEmpty should return true when queue is empty", true, testQueue.isEmpty());
    }

    @Test
    public void sizeShouldReturnNumberOfObjects(){
        SeanQueue<String> testQueue = new SeanQueue<String>();

        String firstIn = "one";
        String secondIn = "two";

        testQueue.enqueue(firstIn);

        assertEquals("size should return the appropriate number of items", testQueue.size(), 1);

        testQueue.enqueue(secondIn);

        assertEquals("size should return the appropriate number of items", testQueue.size(), 2);

        testQueue.dequeue();

        assertEquals("size should return the appropriate number of items", testQueue.size(), 1);
    }

}