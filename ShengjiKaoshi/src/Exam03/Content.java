package Exam03;
/*
* ②	定义类Content ，包含空参、满参构造和以下成员变量
            调试bug 		bugContent（String 型）
                开发模块 	moduleContent（String 型）
                生成所有成员变量set/get方法
定义成员方法：void printContent(),要求：输出"工作路线，调试bug：xxx，开发模块：yyy",
PS： xxx为变量bugContent值，yyy为变量moduleContent值*/
public class Content {
    private String bugContent;
    private String moduleContent;

    public void printContent(){
        System.out.println("工作路线，调试bug:"+getBugContent()+"开发模块："+getModuleContent());
    }

    public String getBugContent() {
        return bugContent;
    }

    public void setBugContent(String bugContent) {
        this.bugContent = bugContent;
    }

    public String getModuleContent() {
        return moduleContent;
    }

    public void setModuleContent(String moduleContent) {
        this.moduleContent = moduleContent;
    }

    public Content() {

    }

    public Content(String bugContent, String moduleContent) {

        this.bugContent = bugContent;
        this.moduleContent = moduleContent;
    }
}
