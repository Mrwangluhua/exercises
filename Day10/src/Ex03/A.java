package Ex03;
/*
* 需求：
定义一个接口A与其实现类B：
	接口A：
		抽象方法showA();
		私有方法show10(String str)，作用：循环打印10次str
		默认方法showB10()，showC10()，方法中分别调用show10方法打印10次BBBB和CCCC;
	实现类B：
		重写接口中的抽象方法showA()打印依次AAAA;
	测试类：
		main方法中创建B对象，依次调用showA方法，showB10方法，showC10方法
*/
public interface A {
    public abstract void showA();
    //private void show10(String str){

 //   }
}
