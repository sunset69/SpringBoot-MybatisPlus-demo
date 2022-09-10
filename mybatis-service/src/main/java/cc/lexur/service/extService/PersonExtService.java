package cc.lexur.service.extService;


import cc.lexur.repository.entity.Person;
import cc.lexur.repository.mapper.PersonMapper;
import cc.lexur.repository.service.IPersonService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: SamGroves
 * <p>
 * Description: 要继承于ServiceImpl<EntityMapper, Entity>
 * 在类上要添加注解 @Service
 * <p>
 * Date: 2017/9/22
 */
@Service
public class PersonExtService extends ServiceImpl<PersonMapper, Person> {

    @Autowired
    private IPersonService personService;

    /**
     * 通过ID查找
     */
    public Person findPersonById(Integer id) {
        return personService.selectById(id);
    }

    /**
     * 新增信息
     */
    public void addPerson(String name, boolean sex, String code, Integer age) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setSex(sex ? 1 : 0);
        person.insert();
    }
}