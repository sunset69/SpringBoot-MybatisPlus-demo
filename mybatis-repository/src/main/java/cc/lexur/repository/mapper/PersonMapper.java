package cc.lexur.repository.mapper;

import cc.lexur.repository.entity.Person;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author lexur
 * @since 2022-09-10
 */
@Mapper
public interface PersonMapper extends BaseMapper<Person> {

}