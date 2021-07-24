package Creater.ProtoType;

/**
 * 原子模式
 */
public class ProtoTypeDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("lxm");
        person.setAge(18);
        Hobby hobby = new Hobby();
        person.setHobby(hobby);

        Person person1 = person.clone();
        person1.setHobby(hobby);

        System.out.println(person == person1);//false  clone出来一个不同的实例
        System.out.println(person.getHobby() == person1.getHobby());
        //true  clone出来的不同实例中 包含的引用类型对象是相同的 比如person和person1两个不同对象的hobby是同一个实例 ，浅拷贝

    }

}
