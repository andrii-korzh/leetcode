class Foo {

  volatile int step = 0;
  public Foo() {

  }

  public void first(Runnable printFirst) throws InterruptedException {
    printFirst.run();
    step = 1;
  }

  public void second(Runnable printSecond) throws InterruptedException {
    while(step != 1);
    printSecond.run();
    step = 2;
  }

  public void third(Runnable printThird) throws InterruptedException {
    while(step != 2);
    printThird.run();
  }
}
