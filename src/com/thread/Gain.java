package com.thread;

public class Gain extends Thread {
    Loss a;
    public Gain(Loss l)
    {
        a = l;
    }

    public void run()
    {
        synchronized (a)
        {
            try{
                System.out.println(" Caluculating ...");
                a.wait();
            }catch (InterruptedException ix)
            {
            }
            System.out.println("Total is " + a.total);
        }
    }
    public static  void main(String args[])
    {
        Loss loss = new Loss();
        new Gain(loss).start();
        loss.start();
    }


}

class Loss extends Thread{
    int total;
    public void run(){
        synchronized (this)
        {
            for(int i = 0; i<100; i++)
            {
                total += i;

            }
            notifyAll();
        }

    }
}
