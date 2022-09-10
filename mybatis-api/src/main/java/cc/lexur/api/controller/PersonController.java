package cc.lexur.api.controller;


import cc.lexur.repository.entity.Person;
import cc.lexur.service.extService.PersonExtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author SamGroves
 * @since 2017-09-22
 */
@Controller
@RequestMapping("/api")
public class PersonController {

    @Autowired
    PersonExtService personExtService;

    /**
     * 查
     */
    @RequestMapping(value = "/test")
    @ResponseBody
    public Person test() {
        return personExtService.findPersonById(1);
    }

    ///**
    // * 删
    // */
    //@RequestMapping(value = "/test4")
    //@ResponseBody
    //public void test4() {
    //    personExtService.delectPersonById(2);
    //}
}
