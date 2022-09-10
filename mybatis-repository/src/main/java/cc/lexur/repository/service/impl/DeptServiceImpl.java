package cc.lexur.repository.service.impl;

import cc.lexur.repository.entity.Dept;
import cc.lexur.repository.mapper.DeptMapper;
import cc.lexur.repository.service.IDeptService;
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
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {
	
}
