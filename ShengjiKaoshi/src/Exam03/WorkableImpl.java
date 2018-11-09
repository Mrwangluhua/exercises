package Exam03;
/*
* 所以需要定义一个Workable接口的实现类WorkableImpl,
            需要实现void workContent(Content content)抽象方法，*/
public  class WorkableImpl implements Workable{
    public void workContent(Content content) {
        content.printContent();
    }
}
