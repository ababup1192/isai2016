/* DataStructure */
public class DataStructure{
}

/* Container */
public abstract class Container
extends DataStructure{
  public Data data;
}

/* Data */
public class Data{
  public int[] buffer;

  public Data(int size){}
  }
}
/* List */
public interface List{
  void push(int x);
  int pop();
}

/* Stack */
public class Stack extends
Container implements List{
  public int top;

  public Stack(){}

  public void push(int x){}

  public int pop(){
      return 0;
  }
}

/* Queue */
public class Queue
    extends Container implements List{
      public int head;
      public int tail;

      public Queue(){}

      public void push(int x){}

      public int pop(){
        return 0;
      }
}
