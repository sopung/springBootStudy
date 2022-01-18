package co.mr.restApi02.mapper;

import co.mr.restApi02.model.Academy;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper // mapper 인식
public interface AcademyMapper {
    @Insert("insert into academy(academy_name, academy_loc) values(#{academy.name}, #{academy.loc}")
    int insert(@Param("academy") Academy academy);

}
