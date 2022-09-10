package cc.lexur.repository.service.impl;

import cc.lexur.repository.entity.Person;
import cc.lexur.repository.mapper.PersonMapper;
import cc.lexur.repository.service.IPersonService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lexur
 * @since 2022-09-10
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {
	
}
