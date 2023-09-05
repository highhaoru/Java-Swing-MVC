package ood;

// 封装、多态
// 这个Class代表了什么 -> 有什么属性 & 有什么行为
public class Person {

    // 属性
    private final String name;
    private int age;
    private boolean isMale;



    // 构造器
    public Person(String name, int age, boolean isMale) {

        this.name = name;
        this.age = age;
        this.isMale = isMale;

    }

//    public Person() {
//
//    }

    // 行为
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age <= 0) {
            throw new IllegalArgumentException("negative age detected");
        }
        if(age <= this.age) {
            throw new IllegalArgumentException("can't grow younger");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int grow() {
        return ++age;
    }

    public int grow(int age) {
        this.age = age;
        return this.age;
    }
}
